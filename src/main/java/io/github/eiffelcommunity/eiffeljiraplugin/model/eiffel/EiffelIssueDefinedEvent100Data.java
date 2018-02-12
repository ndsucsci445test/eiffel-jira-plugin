package io.github.eiffelcommunity.eiffeljiraplugin.model.eiffel;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import io.github.eiffelcommunity.eiffeljiraplugin.model.EiffelStyleImmutable;
import org.immutables.value.Value;

import java.net.URI;

@Value.Immutable
@EiffelStyleImmutable
@JsonSerialize(as = EiffelIssueDefinedEvent100.class)
@JsonDeserialize(builder = EiffelIssueDefinedEvent100.Builder.class)
public abstract class EiffelIssueDefinedEvent100Data {
    public abstract EiffelIssueType getType();

    public abstract String getTracker();

    public abstract URI getUri();

    public abstract String getId();

    public static class Builder extends ImmutableEiffelIssueDefinedEvent100Data.Builder {
    }
}
