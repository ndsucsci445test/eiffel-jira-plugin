package io.github.eiffelcommunity.eiffeljiraplugin.model.eiffel;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import io.github.eiffelcommunity.eiffeljiraplugin.model.EiffelStyleImmutable;
import org.immutables.value.Value;

import java.util.Optional;


@Value.Immutable
@EiffelStyleImmutable
@JsonSerialize(as = ImmutableSecurity.class)
@JsonDeserialize(builder = Security.Builder.class)
public abstract class Security {
    public abstract Optional<Sdm> getSdm();

    public static class Builder extends ImmutableSecurity.Builder {
    }
}
