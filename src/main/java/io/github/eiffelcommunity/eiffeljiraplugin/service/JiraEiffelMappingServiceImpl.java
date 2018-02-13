package io.github.eiffelcommunity.eiffeljiraplugin.service;

import io.github.eiffelcommunity.eiffeljiraplugin.model.eiffel.EiffelIssueDefinedEvent100;
import io.github.eiffelcommunity.eiffeljiraplugin.model.eiffel.EiffelIssueDefinedEvent100Data;
import io.github.eiffelcommunity.eiffeljiraplugin.model.eiffel.EiffelIssueDefinedEvent100Meta;
import io.github.eiffelcommunity.eiffeljiraplugin.model.eiffel.EiffelIssueType;
import io.github.eiffelcommunity.eiffeljiraplugin.model.eiffel.LinkImpl;
import io.github.eiffelcommunity.eiffeljiraplugin.model.jira.JiraIssue;
import io.github.eiffelcommunity.eiffeljiraplugin.model.jira.JiraIssueType;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class JiraEiffelMappingServiceImpl implements JiraEiffelMappingService {
    private static final String JIRA_TRACKER = "JIRA";

    @Override
    public EiffelIssueDefinedEvent100 toEiffelIssueDefinedEvent100(JiraIssue jiraIssue) {
        EiffelIssueDefinedEvent100Meta meta = new EiffelIssueDefinedEvent100Meta.Builder().build();

        EiffelIssueDefinedEvent100Data data = new EiffelIssueDefinedEvent100Data.Builder()
                .setId(jiraIssue.getId())
                .setUri(jiraIssue.getSelf())
                .setTracker(JIRA_TRACKER)
                .setType(toEiffelIssueType(jiraIssue.getFields().getFieldsIssueType().getIssueType()))
                .build();

        Set<LinkImpl> links = new HashSet<>();

        return new EiffelIssueDefinedEvent100.Builder()
                .setMeta(meta)
                .setData(data)
                .setLinks(links)
                .build();
    }

    @Override
    public EiffelIssueType toEiffelIssueType(JiraIssueType jiraType) {
        switch (jiraType) {
            case TASK:
            case SUB_TASK: // fall through
                return EiffelIssueType.WORK_ITEM;
            case STORY:
                return EiffelIssueType.REQUIREMENT;
            case BUG:
                return EiffelIssueType.BUG;
            case FEATURE:
                return EiffelIssueType.FEATURE;
            case IMPROVEMENT:
                return EiffelIssueType.IMPROVEMENT;
            case EPIC:
                return EiffelIssueType.OTHER;
            default:
                return EiffelIssueType.OTHER;
        }
    }
}
