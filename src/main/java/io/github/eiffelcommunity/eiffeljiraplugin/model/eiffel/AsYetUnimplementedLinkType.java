package io.github.eiffelcommunity.eiffeljiraplugin.model.eiffel;

import com.google.common.collect.ImmutableSet;

public enum AsYetUnimplementedLinkType implements LinkType {
    ISSUE("ISSUE", )

    private final boolean multipleAllowed;
    private final ImmutableSet<EventType> legalTargets;

    AsYetUnimplementedLinkType(boolean multipleAllowed, ImmutableSet<EventType> legalTargets) {
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
