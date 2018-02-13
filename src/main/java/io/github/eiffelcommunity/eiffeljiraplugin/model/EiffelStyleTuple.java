package io.github.eiffelcommunity.eiffeljiraplugin.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import org.immutables.value.Value;

/**
 * @see <a href="http://immutables.github.io/immutable.html#tuples">Immutable user guide</a>
 */
@Value.Style(
        visibility = Value.Style.ImplementationVisibility.PACKAGE,
        allParameters = true,
        get = {"get*", "is*"},
        init = "set*",
        overshadowImplementation = true,
        forceJacksonPropertyNames = false,
        defaults = @Value.Immutable(builder = false))
@JsonInclude(JsonInclude.Include.ALWAYS)
public @interface EiffelStyleTuple {
}
