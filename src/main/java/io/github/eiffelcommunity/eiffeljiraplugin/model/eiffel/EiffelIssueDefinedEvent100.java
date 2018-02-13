package io.github.eiffelcommunity.eiffeljiraplugin.model.eiffel;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.google.common.collect.ImmutableSet;
import io.github.eiffelcommunity.eiffeljiraplugin.model.EiffelStyleImmutable;
import org.immutables.value.Value;

import java.util.Set;

@Value.Immutable
@EiffelStyleImmutable
@JsonSerialize(as = EiffelIssueDefinedEvent100.class)
@JsonDeserialize(builder = EiffelIssueDefinedEvent100.Builder.class)
public abstract class EiffelIssueDefinedEvent100 extends EventImpl implements Event {

    @Override
    public abstract EiffelIssueDefinedEvent100Meta getMeta();

    public abstract EiffelIssueDefinedEvent100Data getData();

    @Override
    public abstract ImmutableSet<Link> getLinks();


    @Value.Check
    protected void check() {
        checkLinks();
    }

    public static class Builder extends ImmutableEiffelIssueDefinedEvent100.Builder {
    }
}
