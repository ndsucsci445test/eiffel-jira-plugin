package io.github.eiffelcommunity.eiffeljiraplugin.model.eiffel;

import com.google.common.collect.ImmutableSet;

public interface LinkType {

    String getName();

    boolean isMultipleAllowed();

    ImmutableSet<EventType> getLegalTargets();
}
