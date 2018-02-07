package io.github.eiffelcommunity.eiffeljiraplugin.service;

import io.github.eiffelcommunity.eiffeljiraplugin.model.eiffel.ImmutableEiffelIssueDefinedEvent;

public interface EiffelIssueRabbitService {
    void sendEiffelIssueDefinedEvent(ImmutableEiffelIssueDefinedEvent event);
}
