package io.github.eiffelcommunity.eiffeljiraplugin.model.eiffel;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import io.github.eiffelcommunity.eiffeljiraplugin.model.EiffelStyleTuple;
import org.immutables.value.Value;

@Value.Immutable
@EiffelStyleTuple
@JsonSerialize(as = ImmutableSdm.class)
@JsonDeserialize(as = ImmutableSdm.class)
public abstract class Sdm {
    public static Sdm of(String authorIdentity, String encryptedDigest) {
        return ImmutableSdm.of(authorIdentity, encryptedDigest);
    }

    public abstract String getAuthorIdentity();

    public abstract String getEncryptedDigest();

}
