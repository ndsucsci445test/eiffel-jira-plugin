package io.github.eiffelcommunity.eiffeljiraplugin.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import org.immutables.value.Value;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Style for using GitHub Immutables in this project.
 *
 * @see <a href="http://immutables.github.io/immutable.html">Immutable user guide
 */
@Value.Style(
        visibility = Value.Style.ImplementationVisibility.PACKAGE,
        get = {"get*", "is*"},
        init = "set*",
        overshadowImplementation = true,
        deepImmutablesDetection = true,
        depluralize = true,
        defaults = @Value.Immutable(copy = false),
        forceJacksonPropertyNames = false
)
@Target({ElementType.TYPE, ElementType.PACKAGE, ElementType.ANNOTATION_TYPE})
@Retention(RetentionPolicy.RUNTIME)
@JsonInclude(JsonInclude.Include.NON_ABSENT)
public @interface EiffelStyleImmutable {
}
