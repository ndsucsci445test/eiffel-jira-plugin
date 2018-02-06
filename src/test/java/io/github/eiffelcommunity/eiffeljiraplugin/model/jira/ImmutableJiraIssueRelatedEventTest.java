package io.github.eiffelcommunity.eiffeljiraplugin.model.jira;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.*;

import java.net.URI;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ImmutableJiraIssueRelatedEventTest {
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
    public void jsonParsingContainsOnlyDesiredFields() throws Exception {
        ImmutableJiraIssueRelatedEvent expected = ImmutableJiraIssueRelatedEvent.builder()
                .eventType("issue_created")
                .issue(ImmutableJiraIssue.builder()
                        .id("10032")
                        .self(URI.create("https://eiffelplugin.atlassian.net/rest/api/2/issue/10032"))
                        .fields(ImmutableJiraIssueFields.builder()
                                .issueType(ImmutableJiraFieldsIssueType.builder()
                                        .issueType(JiraIssueType.EPIC)
                                        .build())
                                .build())
                        .build())
                .build();

        ImmutableJiraIssueRelatedEvent actual = mapper.readValue(jiraIssueCreatedEventString, ImmutableJiraIssueRelatedEvent.class);

        Assert.assertEquals(expected, actual);
    }
}
