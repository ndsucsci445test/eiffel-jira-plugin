package io.github.eiffelcommunity.eiffeljiraplugin.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.github.eiffelcommunity.eiffeljiraplugin.model.eiffel.EiffelIssueType;
import io.github.eiffelcommunity.eiffeljiraplugin.model.eiffel.ImmutableEiffelIssueDefinedEvent;
import io.github.eiffelcommunity.eiffeljiraplugin.model.eiffel.ImmutableEiffelIssueDefinedEventData;
import io.github.eiffelcommunity.eiffeljiraplugin.model.jira.ImmutableJiraIssue;
import io.github.eiffelcommunity.eiffeljiraplugin.model.jira.ImmutableJiraIssueRelatedEvent;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.File;
import java.net.URI;

public class JiraEiffelMappingServiceImplTest {
    private static ImmutableJiraIssue jiraIssue;
    private static String jiraIssueCreatedEventFilePath = "src/test/resources/input/jira-issue-created.json";
    private JiraEiffelMappingService mappingService;

    @BeforeClass
    public static void initCache() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        File file = new File(jiraIssueCreatedEventFilePath);
        ImmutableJiraIssueRelatedEvent event = mapper.readValue(file, ImmutableJiraIssueRelatedEvent.class);
        jiraIssue = event.issue();
    }

    @Before
    public void setUp() {
        mappingService = new JiraEiffelMappingServiceImpl();
    }

    @Test
    public void toEiffelIssueDefinedEventParsesCorrecetData() {
        ImmutableEiffelIssueDefinedEventData expectedData = ImmutableEiffelIssueDefinedEventData.builder()
                .id("10032")
                .tracker("JIRA")
                .type(EiffelIssueType.OTHER)
                .uri(URI.create("https://eiffelplugin.atlassian.net/rest/api/2/issue/10032"))
                .build();
        ImmutableEiffelIssueDefinedEvent event = mappingService.toEiffelIssueDefinedEvent(jiraIssue);
        ImmutableEiffelIssueDefinedEventData actualData = event.data();
        Assert.assertEquals(expectedData, actualData);
    }
}
