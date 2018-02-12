package io.github.eiffelcommunity.eiffeljiraplugin.model.jira;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import io.github.eiffelcommunity.eiffeljiraplugin.model.EiffelStyleImmutable;
import org.immutables.value.Value;

@Value.Immutable
@EiffelStyleImmutable
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonDeserialize(builder = JiraIssueFields.Builder.class)
public abstract class JiraIssueFields {
    @JsonProperty("issuetype")
    public abstract JiraFieldsIssueType getFieldsIssueType();

    public static class Builder extends ImmutableJiraIssueFields.Builder {
    }
}
