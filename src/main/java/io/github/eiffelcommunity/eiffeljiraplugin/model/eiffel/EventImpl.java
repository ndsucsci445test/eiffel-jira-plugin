package io.github.eiffelcommunity.eiffeljiraplugin.model.eiffel;

import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableSet;

import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public abstract class EventImpl implements Event {

    public abstract Meta getMeta();

    public abstract ImmutableSet<Link> getLinks();

    /**
     * Ensures that all of this event's required links are present, and that
     * all present links are either optional or required for this event. If
     * the event links are not valid in any way, an IllegalStateException is thrown.
     */
    protected void checkLinks() {
        Map<LinkType, Integer> illegalMultiples = getIllegalMultiples(getLinks());
        Preconditions.checkState(illegalMultiples.isEmpty(),
                "Some links that should only occur once occurred multiple times: %s",
                illegalMultiples.toString());

        Set<LinkType> missingRequiredLinkTypes = getMissingRequiredLinkTypes(getLinks(), getMeta().getType().getRequiredLinkTypes());
        Preconditions.checkState(missingRequiredLinkTypes.isEmpty(),
                "%s is missing required links of type: %s",
                getClass().getSimpleName(), missingRequiredLinkTypes.toString());

        Set<LinkType> illegalLinkTypes = getLinks().stream()
                .map(Link::getType)
                .filter(type -> !getMeta().getType().getOptionalLinkTypes().contains(type) ||
                        !getMeta().getType().getRequiredLinkTypes().contains(type))
                .collect(Collectors.toSet());
        Preconditions.checkState(illegalLinkTypes.isEmpty(),
                "%s is not allowed to have links of type: ",
                getClass().getSimpleName(), illegalLinkTypes.toString());
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
                        .anyMatch(link -> !link.getType().isMultipleAllowed()))
                .collect(Collectors.toMap(Map.Entry::getKey, entry -> entry.getValue().size()));
    }

    protected static Set<LinkType> getMissingRequiredLinkTypes(Set<Link> existing, Set<LinkType> required) {
        Set<LinkType> existingTypes = existing.stream().map(Link::getType).collect(Collectors.toSet());
        return required.stream()
                .filter(linkType -> !existingTypes.contains(linkType))
                .collect(Collectors.toSet());
    }
}
