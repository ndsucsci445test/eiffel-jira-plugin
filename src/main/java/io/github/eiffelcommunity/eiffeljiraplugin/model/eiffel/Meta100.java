package io.github.eiffelcommunity.eiffeljiraplugin.model.eiffel;

import java.util.List;
import java.util.Optional;

public interface Meta100 extends Meta {

    default long getTime() {
        return System.currentTimeMillis();
    }

    Optional<List<String>> getTags();

    Optional<Source> getSource();
}
