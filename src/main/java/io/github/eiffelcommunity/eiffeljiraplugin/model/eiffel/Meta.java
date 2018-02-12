package io.github.eiffelcommunity.eiffeljiraplugin.model.eiffel;

import com.vdurmont.semver4j.Semver;

import java.util.UUID;

public interface Meta {
    default UUID getId() {
        return UUID.randomUUID();
    }

    EiffelEventType getType();

    Semver getVersion();
}
