package io.github.eiffelcommunity.eiffeljiraplugin.model.eiffel;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.immutables.value.Value;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Value.Immutable
@JsonSerialize
@JsonDeserialize
public interface EiffelIssueDefinedEventMeta {
    @Value.Default
    default UUID id() {
        return UUID.randomUUID();
    }

    @Value.Default
    default long time() {
        return System.currentTimeMillis();
    }

    @Value.Derived
    default String type() {
        return "EiffelIssueDefinedEvent";
    }

    // TODO: Consider possible solutions to versioning.
    @Value.Derived
    default String version() {
        return "1.0.0";
    }

    Optional<List<String>> tags();

    Optional<Source> source();
}
