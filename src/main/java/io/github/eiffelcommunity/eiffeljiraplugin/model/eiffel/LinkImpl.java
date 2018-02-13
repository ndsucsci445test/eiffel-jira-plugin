package io.github.eiffelcommunity.eiffeljiraplugin.model.eiffel;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import io.github.eiffelcommunity.eiffeljiraplugin.model.EiffelStyleTuple;
import org.immutables.value.Value;

import java.util.UUID;

@Value.Immutable
@EiffelStyleTuple
@JsonSerialize(as = ImmutableLinkImpl.class)
@JsonDeserialize(as = ImmutableLinkImpl.class)
public abstract class LinkImpl implements Link {

    /**
     * Factory method to create a LinkImpl, checking that the target event is a valid target
     * for the link type.
     * @param type Type of the link
     * @param target Any Eiffel event
     * @return A LinkImpl if the target is valid
     * @throws IllegalArgumentException if the target is not valid for the link type
     */
    public static LinkImpl toEvent(LinkType type, Event target) {
        if (type.getLegalTargets().contains(target.getMeta().getType())) {
            return ImmutableLink.of(type, target.getMeta().getId());
        }
        throw new IllegalArgumentException(target.getMeta().getType() + " is not a valid target for " + type);
    }

    /**
     * Create a raw link of any type to an id. Necessary when deserialization, as the type of
     * the event pointed to by the id isn't necessarily known.
     * @param type Type of link to create
     * @param target Target UUID
     * @return A Link from 'type' to 'target'
     */
    public static LinkImpl toId(LinkType type, UUID target) {
        return ImmutableLink.of(type, target);
    }

    public abstract LinkType getType();

    public abstract UUID getTarget();
}
