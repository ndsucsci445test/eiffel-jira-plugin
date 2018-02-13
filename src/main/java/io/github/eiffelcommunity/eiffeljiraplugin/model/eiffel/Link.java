package io.github.eiffelcommunity.eiffeljiraplugin.model.eiffel;

import java.util.UUID;

public interface Link {

    LinkType getType();

    UUID getTarget();
}
