package io.github.eiffelcommunity.eiffeljiraplugin.model.eiffel.links;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.google.common.base.Preconditions;
import io.github.eiffelcommunity.eiffeljiraplugin.model.eiffel.EiffelEventType;
import io.github.eiffelcommunity.eiffeljiraplugin.model.eiffel.Event;
import org.immutables.value.Value;

import java.util.EnumMap;
import java.util.EnumSet;
import java.util.Set;
import java.util.UUID;

public abstract class Link {

    public static Link create(LinkType type, Event target) {
        if (getLegalTargets().contains(event.getMeta().getType())) {
            return ImmutableLinkContext.of(type, event.getMeta().getId());
        }
        throw new IllegalArgumentException(event.getMeta().getType() + " is not a valid target for " + type);
    }

    @JsonIgnore
    @Value.Lazy
    public abstract boolean isMultipleAllowed();

    @JsonIgnore
    @Value.Lazy
    public abstract EnumSet<EiffelEventType> getLegalTargets();

    @Value.Default
    public abstract LinkType getType();

    @JsonIgnore
    protected abstract LinkType getDesiredType();

    public abstract UUID getTarget();

    @Value.Check
    protected void check() {
        Preconditions.checkState(getDesiredType().equals(getType()));
    }
}
