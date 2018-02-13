package io.github.eiffelcommunity.eiffeljiraplugin.model.eiffel;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.google.common.base.Preconditions;
import com.vdurmont.semver4j.Semver;
import io.github.eiffelcommunity.eiffeljiraplugin.model.EiffelStyleImmutable;
import org.immutables.value.Value;


@Value.Immutable
@EiffelStyleImmutable
@JsonSerialize(as = ImmutableEiffelIssueDefinedEvent100Meta.class)
@JsonDeserialize(builder = EiffelIssueDefinedEvent100Meta.Builder.class)
public abstract class EiffelIssueDefinedEvent100Meta implements Meta100 {
    private final static EventType type = UnofficialEventType.EIFFEL_ISSUE_DEFINED_EVENT;
    private final static Semver version = new Semver("1.0.0");

    @Override
    @Value.Default
    public EventType getType() {
        return type;
    }

    @Override
    @Value.Default
    public Semver getVersion() {
        return version;
    }

    @Value.Check
    protected void check() {
        Preconditions.checkState(type.equals(getType()));
        Preconditions.checkState(version.equals(getVersion()));
    }

    public static class Builder extends ImmutableEiffelIssueDefinedEvent100Meta.Builder {
    }
}
