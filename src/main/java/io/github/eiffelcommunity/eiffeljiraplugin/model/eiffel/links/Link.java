package io.github.eiffelcommunity.eiffeljiraplugin.model.eiffel.links;

import com.fasterxml.jackson.annotation.JsonIgnore;
import io.github.eiffelcommunity.eiffeljiraplugin.model.eiffel.EiffelEventType;

import java.util.EnumSet;
import java.util.UUID;

public interface Link {
    @JsonIgnore
    boolean isMultipleAllowed();

    @JsonIgnore
    EnumSet<EiffelEventType> getLegalTargets();

    LinkType getType();

    UUID getTarget();

}
