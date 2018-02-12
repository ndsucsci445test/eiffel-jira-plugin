package io.github.eiffelcommunity.eiffeljiraplugin.model.eiffel;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import io.github.eiffelcommunity.eiffeljiraplugin.model.EiffelStyleImmutable;
import io.github.eiffelcommunity.eiffeljiraplugin.model.eiffel.links.Link;
import io.github.eiffelcommunity.eiffeljiraplugin.model.eiffel.links.LinkType;
import org.immutables.value.Value;

import java.util.EnumSet;
import java.util.Set;

@Value.Immutable
@EiffelStyleImmutable
@JsonSerialize(as = EiffelIssueDefinedEvent100.class)
@JsonDeserialize(builder = EiffelIssueDefinedEvent100.Builder.class)
public abstract class EiffelIssueDefinedEvent100 extends Event {

    @Override
    public abstract EiffelIssueDefinedEvent100Meta getMeta();

    public abstract EiffelIssueDefinedEvent100Data getData();

    @Override
    public abstract Set<Link> getLinks();

    @Override
    @JsonIgnore
    public EnumSet<LinkType> getRequiredLinkTypes() {
        return EnumSet.noneOf(LinkType.class);
    }

    @Override
    @JsonIgnore
    public EnumSet<LinkType> getOptionalLinkTypes() {
        return EnumSet.of(LinkType.CAUSE, LinkType.CONTEXT);
    }

    @Value.Check
    protected void check() {
        checkLinks();
    }

    public static class Builder extends ImmutableEiffelIssueDefinedEvent100.Builder {
    }
}
