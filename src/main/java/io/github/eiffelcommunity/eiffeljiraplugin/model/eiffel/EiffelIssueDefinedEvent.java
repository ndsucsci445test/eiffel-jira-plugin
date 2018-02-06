package io.github.eiffelcommunity.eiffeljiraplugin.model.eiffel;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.immutables.value.Value;

import java.util.List;

@Value.Immutable
@JsonSerialize
@JsonDeserialize
public interface EiffelIssueDefinedEvent {
    @JsonInclude(content = JsonInclude.Include.NON_ABSENT)
    ImmutableEiffelIssueDefinedEventMeta meta();

    ImmutableEiffelIssueDefinedEventData data();

    // TODO: We should only allow link types valid for this event, once we decide what those are.
    List<Link> links();
}
