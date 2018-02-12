package io.github.eiffelcommunity.eiffeljiraplugin.service;

import io.github.eiffelcommunity.eiffeljiraplugin.model.eiffel.EiffelIssueDefinedEvent100;
import io.github.eiffelcommunity.eiffeljiraplugin.model.eiffel.EiffelIssueType;
import io.github.eiffelcommunity.eiffeljiraplugin.model.jira.JiraIssue;
import io.github.eiffelcommunity.eiffeljiraplugin.model.jira.JiraIssueType;

public interface JiraEiffelMappingService {
    EiffelIssueDefinedEvent100 toEiffelIssueDefinedEvent100(JiraIssue jiraIssue);

    EiffelIssueType toEiffelIssueType(JiraIssueType jiraType);
}
