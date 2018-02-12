package io.github.eiffelcommunity.eiffeljiraplugin.model.jira;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import io.github.eiffelcommunity.eiffeljiraplugin.model.EiffelStyleImmutable;
import org.immutables.value.Value;

@Value.Immutable
@EiffelStyleImmutable
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonDeserialize(builder = JiraFieldsIssueType.Builder.class)
public abstract class JiraFieldsIssueType {
    @JsonProperty("name")
    public abstract JiraIssueType getIssueType();

    public static class Builder extends ImmutableJiraFieldsIssueType.Builder {
    }
}
