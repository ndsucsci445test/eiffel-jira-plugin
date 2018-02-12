package io.github.eiffelcommunity.eiffeljiraplugin.model.eiffel;

public enum EiffelEventType {
    EIFFEL_ISSUE_DEFINED_EVENT("EiffelIssueDefinedEvent"),
    EIFFEL_ISSUE_STATUS_UPDATED_EVENT("EiffelIssueStatusUpdatedEvent");

    private final String value;

    EiffelEventType(final String value) {
        this.value = value;
    }
}
