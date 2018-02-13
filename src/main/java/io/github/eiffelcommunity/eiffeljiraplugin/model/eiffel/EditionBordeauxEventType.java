package io.github.eiffelcommunity.eiffeljiraplugin.model.eiffel;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.collect.ImmutableSet;

import java.util.EnumSet;
import java.util.Set;

import static io.github.eiffelcommunity.eiffeljiraplugin.model.eiffel.EditionBourdeauxLinkType.*;

//TODO: Data entry. Add in other existing Eiffel events.
public enum EditionBordeauxEventType implements EventType {
    @JsonProperty("EiffelIssueDefinedEvent")
    EIFFEL_ISSUE_DEFINED_EVENT("EiffelIssueDefinedEvent", EnumSet.noneOf(EditionBourdeauxLinkType.class), EnumSet.noneOf(EditionBourdeauxLinkType.class)),
    @JsonProperty("EiffelIssueStatusUpdatedEvent")
    EIFFEL_ISSUE_STATUS_UPDATED_EVENT("EiffelIssueStatusUpdatedEvent", EnumSet.of(ISSUE), EnumSet.noneOf(EditionBourdeauxLinkType.class));

    private final String name;
    private final ImmutableSet<LinkType> requiredLinkTypes;
    private final ImmutableSet<LinkType> optionalLinkTypes;


    EditionBordeauxEventType(String name, Set<EditionBourdeauxLinkType> requiredLinkTypes, Set<EditionBourdeauxLinkType> optionalLinkTypes) {
        this.name = name;
        EnumSet<EditionBourdeauxLinkType> optionalInAny = EnumSet.of(CAUSE, CONTEXT, FLOW_CONTEXT);
        optionalInAny.addAll(optionalLinkTypes);
        this.optionalLinkTypes = ImmutableSet.copyOf(optionalInAny);
        this.requiredLinkTypes = ImmutableSet.copyOf(requiredLinkTypes);
    }

    public String getName() {
        return name;
    }

    @Override
    public ImmutableSet<LinkType> getRequiredLinkTypes() {
        return requiredLinkTypes;
    }

    @Override
    public ImmutableSet<LinkType> getOptionalLinkTypes() {
        return optionalLinkTypes;
    }


}
