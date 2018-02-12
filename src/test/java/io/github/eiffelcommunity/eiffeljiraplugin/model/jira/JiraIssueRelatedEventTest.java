package io.github.eiffelcommunity.eiffeljiraplugin.model.jira;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.*;

import java.net.URI;
import java.nio.file.Files;
import java.nio.file.Paths;

public class JiraIssueRelatedEventTest {
    private static String jiraIssueCreatedEventString;
    private static String jiraissueCreatedeventFilePath = "src/test/resources/input/jira-issue-created.json";

    private ObjectMapper mapper;

    @BeforeClass
    public static void initCache() throws Exception {
        jiraIssueCreatedEventString = new String(Files.readAllBytes(Paths.get(jiraissueCreatedeventFilePath)));
    }

    @Before
    public void setUp() {
        mapper = new ObjectMapper();
    }

    @After
    public void tearDown() {
    }

    @Test
    public void jiraJsonParsingIgnoresUnknownFields() throws Exception {
        JiraIssueRelatedEvent expected = new JiraIssueRelatedEvent.Builder()
                .setEventType("issue_created")
                .setIssue(new JiraIssue.Builder()
                        .setId("10032")
                        .setSelf(URI.create("https://eiffelplugin.atlassian.net/rest/api/2/issue/10032"))
                        .setFields(new JiraIssueFields.Builder()
                                .setFieldsIssueType(new JiraFieldsIssueType.Builder()
                                        .setIssueType(JiraIssueType.EPIC)
                                        .build())
                                .build())
                        .build())
                .build();

        JiraIssueRelatedEvent actual = mapper.readValue(jiraIssueCreatedEventString, JiraIssueRelatedEvent.class);

        Assert.assertEquals(expected, actual);
    }
}
