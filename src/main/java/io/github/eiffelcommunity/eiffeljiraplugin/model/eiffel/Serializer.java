package io.github.eiffelcommunity.eiffeljiraplugin.model.eiffel;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import io.github.eiffelcommunity.eiffeljiraplugin.model.EiffelStyleImmutable;
import org.immutables.value.Value;

@Value.Immutable
@EiffelStyleImmutable
@JsonSerialize(as = ImmutableSerializer.class)
@JsonDeserialize(builder = Serializer.Builder.class)
public abstract class Serializer {
    public abstract String getGroupId();

    public abstract String getArtifactId();

    public abstract String getVersion();

    public static class Builder extends ImmutableSerializer.Builder {
    }
}
