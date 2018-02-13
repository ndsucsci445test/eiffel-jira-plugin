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
public abstract class LinkCause extends Link {
    legalTargets = EnumSet.allOf(EiffelEventType.class);
    LinkType type = LinkType.CAUSE;
    boolean isMultipleAllowed = true;
}
