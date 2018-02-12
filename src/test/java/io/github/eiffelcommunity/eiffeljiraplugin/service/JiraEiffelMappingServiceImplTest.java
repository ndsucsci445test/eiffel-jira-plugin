package io.github.eiffelcommunity.eiffeljiraplugin.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.github.eiffelcommunity.eiffeljiraplugin.model.eiffel.EiffelIssueDefinedEvent100;
import io.github.eiffelcommunity.eiffeljiraplugin.model.eiffel.EiffelIssueDefinedEvent100Data;
import io.github.eiffelcommunity.eiffeljiraplugin.model.eiffel.EiffelIssueType;
import io.github.eiffelcommunity.eiffeljiraplugin.model.jira.JiraIssue;
import io.github.eiffelcommunity.eiffeljiraplugin.model.jira.JiraIssueRelatedEvent;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.File;
import java.net.URI;

public class JiraEiffelMappingServiceImplTest {
    private static JiraIssue jiraIssue;
    private static String jiraIssueCreatedEventFilePath = "src/test/resources/input/jira-issue-created.json";
    private JiraEiffelMappingService mappingService;

    @BeforeClass
    public static void initCache() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        File file = new File(jiraIssueCreatedEventFilePath);
        JiraIssueRelatedEvent event = mapper.readValue(file, JiraIssueRelatedEvent.class);
        jiraIssue = event.getIssue();
    }

    @Before
    public void setUp() {
        mappingService = new JiraEiffelMappingServiceImpl();
    }

    @Test
    public void toEiffelIssueDefinedEvent100ParsesCorrecetData() {
        EiffelIssueDefinedEvent100Data expectedData = new EiffelIssueDefinedEvent100Data.Builder()
                .setId("10032")
                .setTracker("JIRA")
                .setType(EiffelIssueType.OTHER)
                .setUri(URI.create("https://eiffelplugin.atlassian.net/rest/api/2/issue/10032"))
                .build();
        EiffelIssueDefinedEvent100 event = mappingService.toEiffelIssueDefinedEvent100(jiraIssue);
        EiffelIssueDefinedEvent100Data actualData = event.getData();
        Assert.assertEquals(expectedData, actualData);
    }
}
