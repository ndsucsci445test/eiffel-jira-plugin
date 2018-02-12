package io.github.eiffelcommunity.eiffeljiraplugin.model.jira;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import io.github.eiffelcommunity.eiffeljiraplugin.model.EiffelStyleImmutable;
import org.immutables.value.Value;

@Value.Immutable
@EiffelStyleImmutable
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonDeserialize(builder = JiraIssueRelatedEvent.Builder.class)
public abstract class JiraIssueRelatedEvent {
    @JsonProperty("issue_event_type_name")
    public abstract String getEventType();

    public abstract JiraIssue getIssue();

    public static class Builder extends ImmutableJiraIssueRelatedEvent.Builder {
    }
}
