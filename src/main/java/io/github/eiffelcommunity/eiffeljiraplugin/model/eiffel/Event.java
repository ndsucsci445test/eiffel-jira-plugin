package io.github.eiffelcommunity.eiffeljiraplugin.model.eiffel;

import com.google.common.collect.ImmutableSet;

public interface Event {

    Meta getMeta();

    ImmutableSet<Link> getLinks();
}
