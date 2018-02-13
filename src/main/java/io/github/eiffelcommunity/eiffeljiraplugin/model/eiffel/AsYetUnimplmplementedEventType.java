package io.github.eiffelcommunity.eiffeljiraplugin.model.eiffel;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.collect.ImmutableSet;

import java.util.EnumSet;
import java.util.Set;

public enum AsYetUnimplmplementedEventType implements EventType{
    @JsonProperty("EiffelIssueDefinedEvent")
    EIFFEL_ISSUE_DEFINED_EVENT("EiffelIssueDefinedEvent", ImmutableSet.of(), ImmutableSet.of()),
    @JsonProperty("EiffelIssueStatusUpdatedEvent")
    EIFFEL_ISSUE_STATUS_UPDATED_EVENT("EiffelIssueStatusUpdatedEvent", EnumSet.of(ISSUE), EnumSet.noneOf(EditionBourdeauxLinkType.class));

    private final String name;
    private final ImmutableSet requiredLinkTypes;
    private final ImmutableSet optionalLinkTypes;


    AsYetUnimplmplementedEventType(String name, Set<LinkType> requiredLinkTypes, Set<LinkType> optionalLinkTypes) {
        this.name = name;
        this.requiredLinkTypes = ImmutableSet.copyOf(requiredLinkTypes);
        this.optionalLinkTypes = ImmutableSet.copyOf(optionalLinkTypes);
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public ImmutableSet<LinkType> getRequiredLinkTypes() {
        return null;
    }

    @Override
    public ImmutableSet<LinkType> getOptionalLinkTypes() {
        return null;
    }
}
