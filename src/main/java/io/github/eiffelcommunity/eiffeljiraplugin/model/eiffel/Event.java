package io.github.eiffelcommunity.eiffeljiraplugin.model.eiffel;

import io.github.eiffelcommunity.eiffeljiraplugin.model.eiffel.links.Link;
import io.github.eiffelcommunity.eiffeljiraplugin.model.eiffel.links.LinkType;

import java.util.EnumSet;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public abstract class Event {

    public abstract Meta getMeta();

    public abstract EnumSet<LinkType> getRequiredLinkTypes();

    public abstract EnumSet<LinkType> getOptionalLinkTypes();

    public abstract Set<Link> getLinks();

    /**
     * Ensures that all of this event's required links are present, and that
     * all present links are either optional or required for this event. If
     * the event links are not valid in any way, an IllegalStateException is thrown.
     */
    protected void checkLinks() {
        Map<LinkType, Integer> illegalMultiples = getIllegalMultiples(getLinks());
        if (!illegalMultiples.isEmpty()) {
            throw new IllegalStateException("Some links should only occur once, but occurred multiple times: "
                    + illegalMultiples.toString());
        }

        Set<LinkType> missingRequiredLinkTypes = getMissingRequiredLinkTypes(getLinks(), getRequiredLinkTypes());
        if (!missingRequiredLinkTypes.isEmpty()) {
            throw new IllegalStateException(getClass().getSimpleName() + " is missing required links of type: " +
                    missingRequiredLinkTypes.toString());
        }

        Set<LinkType> illegalLinkTypes = getLinks().stream()
                .map(Link::getType)
                .filter(type -> !getOptionalLinkTypes().contains(type) ||
                        !getRequiredLinkTypes().contains(type))
                .collect(Collectors.toSet());
        if (!illegalLinkTypes.isEmpty()) {
            throw new IllegalStateException(getClass().getSimpleName() + " is not allowed to have links of type: "
                    + illegalLinkTypes.toString());
        }
    }

    /**
     * Checks the list of {@link Link}s for links that should only be allowed to occur
     * once in each event, but of which we have found multiple in this list.
     *
     * @param links All of the links for a single {@link Event}.
     * @return A map of each link type that illegally occurred multiple times to the number of times it occurred.
     */
    protected static Map<LinkType, Integer> getIllegalMultiples(Set<Link> links) {
        return links
                .stream()
                .collect(Collectors.groupingBy(Link::getType))
                .entrySet().stream()
                .filter(entry -> entry.getValue().size() > 1
                        && entry.getValue().stream()
                        .anyMatch(link -> !link.isMultipleAllowed()))
                .collect(Collectors.toMap(Map.Entry::getKey, entry -> entry.getValue().size()));
    }

    protected static Set<LinkType> getMissingRequiredLinkTypes(Set<Link> existing, Set<LinkType> required) {
        Set<LinkType> existingTypes = existing.stream().map(Link::getType).collect(Collectors.toSet());
        return required.stream()
                .filter(linkType -> !existingTypes.contains(linkType))
                .collect(Collectors.toSet());
    }
}
