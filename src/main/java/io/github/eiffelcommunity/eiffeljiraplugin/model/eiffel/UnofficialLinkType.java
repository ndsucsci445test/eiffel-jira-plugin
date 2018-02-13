package io.github.eiffelcommunity.eiffeljiraplugin.model.eiffel;

import com.google.common.collect.ImmutableSet;

public enum UnofficialLinkType implements LinkType {
    ISSUE("ISSUE", )

    private final boolean multipleAllowed;
    private final ImmutableSet<EventType> legalTargets;

    UnofficialLinkType(boolean multipleAllowed, ImmutableSet<EventType> legalTargets) {
        this.multipleAllowed = multipleAllowed;
        this.legalTargets = legalTargets;
    }

    public String getName() {
        return this.name();
    }

    public boolean isMultipleAllowed() {
        return multipleAllowed;
    }

    public ImmutableSet<EventType> getLegalTargets() {
        return legalTargets;
    }
}
