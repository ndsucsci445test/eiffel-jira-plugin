package io.github.eiffelcommunity.eiffeljiraplugin.model.eiffel;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.immutables.value.Value;

import java.net.URI;
import java.util.Optional;

@Value.Immutable
@JsonSerialize
@JsonDeserialize
@JsonInclude(JsonInclude.Include.NON_ABSENT)
public interface Source {
    Optional<String> domainId();

    Optional<String> host();

    Optional<String> name();

    Optional<Serializer> serializer();

    Optional<URI> uri();
}
