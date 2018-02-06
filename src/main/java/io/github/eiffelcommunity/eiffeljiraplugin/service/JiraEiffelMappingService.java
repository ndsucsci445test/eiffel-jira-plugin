package io.github.eiffelcommunity.eiffeljiraplugin.service;

import io.github.eiffelcommunity.eiffeljiraplugin.model.eiffel.EiffelIssueType;
import io.github.eiffelcommunity.eiffeljiraplugin.model.eiffel.ImmutableEiffelIssueDefinedEvent;
import io.github.eiffelcommunity.eiffeljiraplugin.model.jira.ImmutableJiraIssue;
import io.github.eiffelcommunity.eiffeljiraplugin.model.jira.JiraIssueType;

public interface JiraEiffelMappingService {
    ImmutableEiffelIssueDefinedEvent toEiffelIssueDefinedEvent(ImmutableJiraIssue jiraIssue);

    EiffelIssueType toEiffelIssueType(JiraIssueType jiraType);
}
