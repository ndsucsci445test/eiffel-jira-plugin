package io.github.eiffelcommunity.eiffeljiraplugin.model.eiffel;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.immutables.value.Value;

@Value.Immutable
@JsonSerialize(as = ImmutableSdm.class)
@JsonDeserialize(as = ImmutableSdm.class)
public interface Sdm {
    String authorIdentity();

    String encryptedDigest();
}
