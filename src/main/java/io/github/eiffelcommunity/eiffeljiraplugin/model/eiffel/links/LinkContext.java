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
@JsonSerialize(as = ImmutableLinkContext.class)
@JsonDeserialize(as = ImmutableLinkContext.class)
public abstract class LinkContext implements Link {
    private static final EnumSet<EiffelEventType> legalTargets = EnumSet.allOf(EiffelEventType.class);
    private static final boolean isMultipleAllowed = false;
    private static final LinkType type = LinkType.CONTEXT;

    public static LinkContext toTarget(Event event) {
        if (legalTargets.contains(event.getMeta().getType())) {
            return ImmutableLinkContext.of(type, event.getMeta().getId());
        }
        throw new IllegalArgumentException(event.getMeta().getType() + " is not a valid target for " + type);
    }

    @Override
    @Value.Derived
    public boolean isMultipleAllowed() {
        return isMultipleAllowed;
    }

    @Override
    @Value.Lazy
    public EnumSet<EiffelEventType> getLegalTargets() {
        return legalTargets;
    }

    @Override
    @Value.Default
    public LinkType getType() {
        return LinkType.CONTEXT;
    }

    @Override
    public abstract UUID getTarget();

    @Value.Check
    protected void check() {
        Preconditions.checkState(type.equals(getType()));
    }
}
