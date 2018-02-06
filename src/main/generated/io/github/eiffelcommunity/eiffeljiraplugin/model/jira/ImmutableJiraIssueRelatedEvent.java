package io.github.eiffelcommunity.eiffeljiraplugin.model.jira;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.annotation.Generated;

/**
 * Immutable implementation of {@link JiraIssueRelatedEvent}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableJiraIssueRelatedEvent.builder()}.
 */
@SuppressWarnings({"all"})
@Generated({"Immutables.generator", "JiraIssueRelatedEvent"})
@JsonIgnoreProperties(ignoreUnknown = true)
public final class ImmutableJiraIssueRelatedEvent
    implements JiraIssueRelatedEvent {
  private final String eventType;
  private final ImmutableJiraIssue issue;

  private ImmutableJiraIssueRelatedEvent(
      String eventType,
      ImmutableJiraIssue issue) {
    this.eventType = eventType;
    this.issue = issue;
  }

  /**
   * @return The value of the {@code eventType} attribute
   */
  @JsonProperty("issue_event_type_name")
  @Override
  public String eventType() {
    return eventType;
  }

  /**
   * @return The value of the {@code issue} attribute
   */
  @JsonProperty("issue")
  @Override
  public ImmutableJiraIssue issue() {
    return issue;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link JiraIssueRelatedEvent#eventType() eventType} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for eventType
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableJiraIssueRelatedEvent withEventType(String value) {
    if (this.eventType.equals(value)) return this;
    String newValue = Objects.requireNonNull(value, "eventType");
    return new ImmutableJiraIssueRelatedEvent(newValue, this.issue);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link JiraIssueRelatedEvent#issue() issue} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for issue
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableJiraIssueRelatedEvent withIssue(ImmutableJiraIssue value) {
    if (this.issue == value) return this;
    ImmutableJiraIssue newValue = Objects.requireNonNull(value, "issue");
    return new ImmutableJiraIssueRelatedEvent(this.eventType, newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableJiraIssueRelatedEvent} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(Object another) {
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
    return "JiraIssueRelatedEvent{"
        + "eventType=" + eventType
        + ", issue=" + issue
        + "}";
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json
      implements JiraIssueRelatedEvent {
    String eventType;
    ImmutableJiraIssue issue;
    @JsonProperty("issue_event_type_name")
    public void setEventType(String eventType) {
      this.eventType = eventType;
    }
    @JsonProperty("issue")
    public void setIssue(ImmutableJiraIssue issue) {
      this.issue = issue;
    }
    @Override
    public String eventType() { throw new UnsupportedOperationException(); }
    @Override
    public ImmutableJiraIssue issue() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableJiraIssueRelatedEvent fromJson(Json json) {
    ImmutableJiraIssueRelatedEvent.Builder builder = ImmutableJiraIssueRelatedEvent.builder();
    if (json.eventType != null) {
      builder.eventType(json.eventType);
    }
    if (json.issue != null) {
      builder.issue(json.issue);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link JiraIssueRelatedEvent} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable JiraIssueRelatedEvent instance
   */
  public static ImmutableJiraIssueRelatedEvent copyOf(JiraIssueRelatedEvent instance) {
    if (instance instanceof ImmutableJiraIssueRelatedEvent) {
      return (ImmutableJiraIssueRelatedEvent) instance;
    }
    return ImmutableJiraIssueRelatedEvent.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableJiraIssueRelatedEvent ImmutableJiraIssueRelatedEvent}.
   * @return A new ImmutableJiraIssueRelatedEvent builder
   */
  public static ImmutableJiraIssueRelatedEvent.Builder builder() {
    return new ImmutableJiraIssueRelatedEvent.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableJiraIssueRelatedEvent ImmutableJiraIssueRelatedEvent}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  public static final class Builder {
    private static final long INIT_BIT_EVENT_TYPE = 0x1L;
    private static final long INIT_BIT_ISSUE = 0x2L;
    private long initBits = 0x3L;

    private String eventType;
    private ImmutableJiraIssue issue;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code JiraIssueRelatedEvent} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(JiraIssueRelatedEvent instance) {
      Objects.requireNonNull(instance, "instance");
      eventType(instance.eventType());
      issue(instance.issue());
      return this;
    }

    /**
     * Initializes the value for the {@link JiraIssueRelatedEvent#eventType() eventType} attribute.
     * @param eventType The value for eventType 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("issue_event_type_name")
    public final Builder eventType(String eventType) {
      this.eventType = Objects.requireNonNull(eventType, "eventType");
      initBits &= ~INIT_BIT_EVENT_TYPE;
      return this;
    }

    /**
     * Initializes the value for the {@link JiraIssueRelatedEvent#issue() issue} attribute.
     * @param issue The value for issue 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("issue")
    public final Builder issue(ImmutableJiraIssue issue) {
      this.issue = Objects.requireNonNull(issue, "issue");
      initBits &= ~INIT_BIT_ISSUE;
      return this;
    }

    /**
     * Builds a new {@link ImmutableJiraIssueRelatedEvent ImmutableJiraIssueRelatedEvent}.
     * @return An immutable instance of JiraIssueRelatedEvent
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableJiraIssueRelatedEvent build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableJiraIssueRelatedEvent(eventType, issue);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<String>();
      if ((initBits & INIT_BIT_EVENT_TYPE) != 0) attributes.add("eventType");
      if ((initBits & INIT_BIT_ISSUE) != 0) attributes.add("issue");
      return "Cannot build JiraIssueRelatedEvent, some of required attributes are not set " + attributes;
    }
  }
}
