package io.github.eiffelcommunity.eiffeljiraplugin.model.eiffel;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import io.github.eiffelcommunity.eiffeljiraplugin.model.EiffelStyleImmutable;
import org.immutables.value.Value;

import java.net.URI;
import java.util.Optional;

@Value.Immutable
@EiffelStyleImmutable
@JsonSerialize
@JsonDeserialize(builder = Source.Builder.class)
public abstract class Source {
    public abstract Optional<String> getDomainId();

    public abstract Optional<String> getHost();

    public abstract Optional<String> getName();

    public abstract Optional<Serializer> getSerializer();

    public abstract Optional<URI> getUri();

    public static class Builder extends ImmutableSource.Builder {
    }
}
