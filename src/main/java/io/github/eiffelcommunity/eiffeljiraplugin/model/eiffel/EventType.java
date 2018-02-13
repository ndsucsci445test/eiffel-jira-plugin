package io.github.eiffelcommunity.eiffeljiraplugin.model.eiffel;

import com.google.common.collect.ImmutableSet;

public interface EventType {

    String getName();

    ImmutableSet<LinkType> getRequiredLinkTypes();

    ImmutableSet<LinkType> getOptionalLinkTypes();
}
