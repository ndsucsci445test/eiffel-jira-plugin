package io.github.eiffelcommunity.eiffeljiraplugin.model.jira;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.base.MoreObjects;
import com.google.common.collect.Lists;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import io.github.eiffelcommunity.eiffeljiraplugin.model.EiffelStyleImmutable;
import java.util.List;
import java.util.Objects;
import javax.annotation.CheckReturnValue;
import javax.annotation.Generated;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.Immutable;
import javax.annotation.concurrent.NotThreadSafe;

/**
 * Immutable implementation of {@link JiraIssueRelatedEvent}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code new JiraIssueRelatedEvent.Builder()}.
 */
@SuppressWarnings({"all"})
@ParametersAreNonnullByDefault
@Generated({"Immutables.generator", "JiraIssueRelatedEvent"})
@Immutable
@CheckReturnValue
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableJiraIssueRelatedEvent
    extends JiraIssueRelatedEvent {
  private final String eventType;
  private final JiraIssue issue;

  private ImmutableJiraIssueRelatedEvent(ImmutableJiraIssueRelatedEvent.Builder builder) {
    this.eventType = builder.eventType;
    this.issue = builder.issue;
  }

  /**
   * @return The value of the {@code eventType} attribute
   */
  @JsonProperty("issue_event_type_name")
  @Override
  public String getEventType() {
    return eventType;
  }

  /**
   * @return The value of the {@code issue} attribute
   */
  @JsonProperty
  @Override
  public JiraIssue getIssue() {
    return issue;
  }

  /**
   * This instance is equal to all instances of {@code ImmutableJiraIssueRelatedEvent} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableJiraIssueRelatedEvent
        && equalTo((ImmutableJiraIssueRelatedEvent) another);
  }

  private boolean equalTo(ImmutableJiraIssueRelatedEvent another) {
    return eventType.equals(another.eventType)
        && issue.equals(another.issue);
  }

  /**
   * Computes a hash code from attributes: {@code eventType}, {@code issue}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + eventType.hashCode();
    h += (h << 5) + issue.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code JiraIssueRelatedEvent} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("JiraIssueRelatedEvent")
        .omitNullValues()
        .add("eventType", eventType)
        .add("issue", issue)
        .toString();
  }

  /**
   * Builds instances of type {@link JiraIssueRelatedEvent JiraIssueRelatedEvent}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @NotThreadSafe
  @EiffelStyleImmutable
  @JsonIgnoreProperties(ignoreUnknown = true)
  public static class Builder {
    private static final long INIT_BIT_EVENT_TYPE = 0x1L;
    private static final long INIT_BIT_ISSUE = 0x2L;
    private long initBits = 0x3L;

    private @Nullable String eventType;
    private @Nullable JiraIssue issue;

    /**
     * Creates a builder for {@link JiraIssueRelatedEvent JiraIssueRelatedEvent} instances.
     */
    public Builder() {
      if (!(this instanceof JiraIssueRelatedEvent.Builder)) {
        throw new UnsupportedOperationException("Use: new JiraIssueRelatedEvent.Builder()");
      }
    }

    /**
     * Fill a builder with attribute values from the provided {@code JiraIssueRelatedEvent} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final JiraIssueRelatedEvent.Builder from(JiraIssueRelatedEvent instance) {
      Objects.requireNonNull(instance, "instance");
      setEventType(instance.getEventType());
      setIssue(instance.getIssue());
      return (JiraIssueRelatedEvent.Builder) this;
    }

    /**
     * Initializes the value for the {@link JiraIssueRelatedEvent#getEventType() eventType} attribute.
     * @param eventType The value for eventType 
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    @JsonProperty("issue_event_type_name")
    public final JiraIssueRelatedEvent.Builder setEventType(String eventType) {
      this.eventType = Objects.requireNonNull(eventType, "eventType");
      initBits &= ~INIT_BIT_EVENT_TYPE;
      return (JiraIssueRelatedEvent.Builder) this;
    }

    /**
     * Initializes the value for the {@link JiraIssueRelatedEvent#getIssue() issue} attribute.
     * @param issue The value for issue 
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    @JsonProperty
    public final JiraIssueRelatedEvent.Builder setIssue(JiraIssue issue) {
      this.issue = Objects.requireNonNull(issue, "issue");
      initBits &= ~INIT_BIT_ISSUE;
      return (JiraIssueRelatedEvent.Builder) this;
    }

    /**
     * Builds a new {@link JiraIssueRelatedEvent JiraIssueRelatedEvent}.
     * @return An immutable instance of JiraIssueRelatedEvent
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public JiraIssueRelatedEvent build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableJiraIssueRelatedEvent(this);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = Lists.newArrayList();
      if ((initBits & INIT_BIT_EVENT_TYPE) != 0) attributes.add("eventType");
      if ((initBits & INIT_BIT_ISSUE) != 0) attributes.add("issue");
      return "Cannot build JiraIssueRelatedEvent, some of required attributes are not set " + attributes;
    }
  }
}
