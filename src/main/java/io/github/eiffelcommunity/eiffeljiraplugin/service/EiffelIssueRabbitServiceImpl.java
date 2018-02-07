package io.github.eiffelcommunity.eiffeljiraplugin.service;

import io.github.eiffelcommunity.eiffeljiraplugin.model.eiffel.ImmutableEiffelIssueDefinedEvent;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Service;

@Service
public class EiffelIssueRabbitServiceImpl implements EiffelIssueRabbitService {
    private final RabbitTemplate rabbitTemplate;

    public EiffelIssueRabbitServiceImpl(RabbitTemplate rabbitTemplate) {
        this.rabbitTemplate = rabbitTemplate;
    }

    @Override
    public void sendEiffelIssueDefinedEvent(ImmutableEiffelIssueDefinedEvent event) {
        rabbitTemplate.convertAndSend("eiffeltest", "eiffel.issue.created.notag.eiffeltestdomain", event);
    }
}
