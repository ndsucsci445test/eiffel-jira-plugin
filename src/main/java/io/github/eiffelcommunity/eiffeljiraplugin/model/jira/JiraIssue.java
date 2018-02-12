package io.github.eiffelcommunity.eiffeljiraplugin.model.jira;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import io.github.eiffelcommunity.eiffeljiraplugin.model.EiffelStyleImmutable;
import org.immutables.value.Value;

import java.net.URI;

@Value.Immutable
@EiffelStyleImmutable
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonDeserialize(builder = JiraIssue.Builder.class)
public abstract class JiraIssue {
    public abstract String getId();

    public abstract URI getSelf();

    public abstract JiraIssueFields getFields();

    public static class Builder extends ImmutableJiraIssue.Builder {
    }
}
