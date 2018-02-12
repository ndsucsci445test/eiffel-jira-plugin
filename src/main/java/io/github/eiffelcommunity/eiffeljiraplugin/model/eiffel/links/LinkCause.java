package io.github.eiffelcommunity.eiffeljiraplugin.model.eiffel.links;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.google.common.base.Preconditions;
import io.github.eiffelcommunity.eiffeljiraplugin.model.EiffelStyleTuple;
import io.github.eiffelcommunity.eiffeljiraplugin.model.eiffel.EiffelEventType;
import io.github.eiffelcommunity.eiffeljiraplugin.model.eiffel.Event;
import org.immutables.value.Value;

import java.util.EnumSet;
import java.util.UUID;

@Value.Immutable
@EiffelStyleTuple
@JsonSerialize(as = ImmutableLinkCause.class)
@JsonDeserialize(as = ImmutableLinkCause.class)
public abstract class LinkCause implements Link {
    private static final EnumSet legalTargets = EnumSet.allOf(EiffelEventType.class);
    private static final LinkType type = LinkType.CAUSE;
    private static final boolean isMultipleAllowed = true;

    public static LinkCause toTarget(Event event) {
        if (legalTargets.contains(event.getMeta().getType())) {
            return ImmutableLinkCause.of(type, event.getMeta().getId());
        }
        throw new IllegalArgumentException(event.getMeta().getType() + " is not a legal link target for " + type);
    }

    @Override
    @Value.Derived
    public boolean isMultipleAllowed() {
        return isMultipleAllowed;
    }

    @Override
    @Value.Derived
    public EnumSet<EiffelEventType> getLegalTargets() {
        return legalTargets;
    }

    @Override
    @Value.Default
    public LinkType getType() {
        return LinkType.CAUSE;
    }

    @Override
    public abstract UUID getTarget();

    @Value.Check
    protected void check() {
        Preconditions.checkState(type.equals(getType()));
    }
}
