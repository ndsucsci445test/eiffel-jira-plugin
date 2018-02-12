package io.github.eiffelcommunity.eiffeljiraplugin.model.eiffel;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import io.github.eiffelcommunity.eiffeljiraplugin.model.EiffelStyleTuple;
import org.immutables.value.Value;

@Value.Immutable
@EiffelStyleTuple
@JsonSerialize(as = ImmutableCustomDataEntry.class)
@JsonDeserialize(as = ImmutableCustomDataEntry.class)
public abstract class CustomDataEntry {
    public static CustomDataEntry of(String key, Object value) {
        return ImmutableCustomDataEntry.of(key, value);
    }

    public abstract String getKey();

    public abstract Object getValue();
}
