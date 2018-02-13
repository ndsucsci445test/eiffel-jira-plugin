package io.github.eiffelcommunity.eiffeljiraplugin.model.eiffel;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.eiffelcommunity.eiffeljiraplugin.model.eiffel.links.LinkType;
import io.github.eiffelcommunity.eiffeljiraplugin.model.eiffel.links.LinkType.*;

import java.util.EnumSet;
import java.util.Optional;

import static io.github.eiffelcommunity.eiffeljiraplugin.model.eiffel.links.LinkType.CAUSE;
import static io.github.eiffelcommunity.eiffeljiraplugin.model.eiffel.links.LinkType.CONTEXT;
import static io.github.eiffelcommunity.eiffeljiraplugin.model.eiffel.links.LinkType.FLOW_CONTEXT;

public enum EiffelEventType {
    @JsonProperty("EiffelIssueDefinedEvent")
    EIFFEL_ISSUE_DEFINED_EVENT("EiffelIssueDefinedEvent", EnumSet.noneOf(LinkType.class), EnumSet.noneOf(LinkType.class)),
    @JsonProperty("EiffelIssueStatusUpdatedEvent")
    EIFFEL_ISSUE_STATUS_UPDATED_EVENT("EiffelIssueStatusUpdatedEvent", EnumSet.of(LinkType.ISSUE), EnumSet.noneOf(LinkType.class));

    private final String name;
    private final EnumSet<LinkType> requiredLinkTypes;
    private final EnumSet<LinkType> optionalLinkTypes;


    EiffelEventType(String name, EnumSet<LinkType> requiredLinkTypes, EnumSet<LinkType> optionalLinkTypes) {
        this.name = name;
        this.requiredLinkTypes = requiredLinkTypes;
        EnumSet<LinkType> optionalInAny = EnumSet.of(CAUSE, CONTEXT, FLOW_CONTEXT);
        this.optionalLinkTypes = EnumSet.copyOf(optionalInAny);
        this.optionalLinkTypes.addAll(optionalLinkTypes);
    }
}
