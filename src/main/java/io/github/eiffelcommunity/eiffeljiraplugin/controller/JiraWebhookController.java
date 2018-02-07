package io.github.eiffelcommunity.eiffeljiraplugin.controller;

import io.github.eiffelcommunity.eiffeljiraplugin.model.eiffel.ImmutableEiffelIssueDefinedEvent;
import io.github.eiffelcommunity.eiffeljiraplugin.model.jira.ImmutableJiraIssueRelatedEvent;
import io.github.eiffelcommunity.eiffeljiraplugin.service.EiffelIssueRabbitService;
import io.github.eiffelcommunity.eiffeljiraplugin.service.JiraEiffelMappingService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JiraWebhookController {
    private static final String JIRA_WEBHOOK_EVENT_TYPE_ISSUE_CREATED = "issue_created";
    private final Logger LOG = LoggerFactory.getLogger(getClass().getSimpleName()); // not used yet


    private final JiraEiffelMappingService jiraMappingService;
    private final EiffelIssueRabbitService rabbitService;

    public JiraWebhookController(JiraEiffelMappingService mappingService, EiffelIssueRabbitService rabbitService) {
        this.jiraMappingService = mappingService;
        this.rabbitService = rabbitService;
    }

    @RequestMapping(value = "/webhooks/jira", method = {RequestMethod.POST})
    public ResponseEntity<?> jiraWebhookEvent(@RequestBody ImmutableJiraIssueRelatedEvent jiraEvent) {
        switch (jiraEvent.eventType()) {
            // Right now we're only interested in issue_created events, as we're only
            // defining EiffelIssueDefinedEvent.
            case JIRA_WEBHOOK_EVENT_TYPE_ISSUE_CREATED:
                ImmutableEiffelIssueDefinedEvent eiffelEvent = jiraMappingService.toEiffelIssueDefinedEvent(jiraEvent.issue());
                rabbitService.sendEiffelIssueDefinedEvent(eiffelEvent);
                return ResponseEntity.ok().build();
            default:
                // Jira sent us a perfectly valid issue representation, but it was for
                // and issue being updated/deleted, and we aren't handling that right now.
                // Tell JIRA we caught the event so it doesn't retry sending it.
                return ResponseEntity.ok().build();
            // 404's/500's/ etc are handled by spring boot.
        }
    }
}
