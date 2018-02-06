package io.github.eiffelcommunity.eiffeljiraplugin.model.eiffel;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.immutables.value.Value;

import java.net.URI;

@Value.Immutable
@JsonSerialize
@JsonDeserialize
public interface EiffelIssueDefinedEventData {
    EiffelIssueType type();

    String tracker();

    URI uri();

    String id();
}
