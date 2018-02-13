package io.github.eiffelcommunity.eiffeljiraplugin.model.eiffel.links;

import io.github.eiffelcommunity.eiffeljiraplugin.model.eiffel.EiffelEventType;


import java.util.EnumSet;

import static io.github.eiffelcommunity.eiffeljiraplugin.model.eiffel.EiffelEventType.EIFFEL_ISSUE_DEFINED_EVENT;

public enum LinkType {
    CAUSE(true, EnumSet.allOf(EiffelEventType.class)),
    CONTEXT(false, EnumSet.noneOf(EiffelEventType.class)),
    FLOW_CONTEXT(false, EnumSet.noneOf(EiffelEventType.class)),
    ACTIVITY_EXECUTION(false, EnumSet.noneOf(EiffelEventType.class)),
    PREVIOUS_ACTIVITY_EXECUTION(false, EnumSet.noneOf(EiffelEventType.class)),
    PREVIOUS_VERSION(true, EnumSet.noneOf(EiffelEventType.class)),
    COMPOSITION(false, EnumSet.noneOf(EiffelEventType.class)),
    ENVIRONMENT(false, EnumSet.noneOf(EiffelEventType.class)),
    ARTIFACT(false, EnumSet.noneOf(EiffelEventType.class)),
    SUBJECT(true, EnumSet.noneOf(EiffelEventType.class)),
    ELEMENT(true, EnumSet.noneOf(EiffelEventType.class)),
    BASE(false, EnumSet.noneOf(EiffelEventType.class)),
    CHANGE(false, EnumSet.noneOf(EiffelEventType.class)),
    TEST_SUITE_EXECUTION(false, EnumSet.noneOf(EiffelEventType.class)),
    TEST_CASE_EXECUTION(false, EnumSet.noneOf(EiffelEventType.class)),
    IUT(false, EnumSet.noneOf(EiffelEventType.class)),
    TERC(false, EnumSet.noneOf(EiffelEventType.class)),
    MODIFIED_ANNOUNCEMENT(false, EnumSet.noneOf(EiffelEventType.class)),
    SUB_CONFIDENCE_LEVEL(true, EnumSet.noneOf(EiffelEventType.class)),
    REUSED_ARTIFACT(false, EnumSet.noneOf(EiffelEventType.class)),
    VERIFICATION_BASIS(true, EnumSet.noneOf(EiffelEventType.class)),
    ISSUE(true, EnumSet.of(EIFFEL_ISSUE_DEFINED_EVENT));


    private final boolean multipleAllowed;
    private final EnumSet<EiffelEventType> legalTargets;

    LinkType(boolean multipleAllowed, EnumSet<EiffelEventType> legalTargets) {
        this.multipleAllowed = multipleAllowed;
        this.legalTargets = legalTargets;
    }

    public boolean isMultipleAllowed() {
        return multipleAllowed;
    }

    public EnumSet<EiffelEventType> getLegalTargets() {
        return legalTargets;
    }
}
