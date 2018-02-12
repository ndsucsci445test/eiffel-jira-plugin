package io.github.eiffelcommunity.eiffeljiraplugin.model.jira;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.base.MoreObjects;
import com.google.common.collect.Lists;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import io.github.eiffelcommunity.eiffeljiraplugin.model.EiffelStyleImmutable;
import java.net.URI;
import java.util.List;
import java.util.Objects;
import javax.annotation.CheckReturnValue;
import javax.annotation.Generated;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.Immutable;
import javax.annotation.concurrent.NotThreadSafe;

/**
 * Immutable implementation of {@link JiraIssue}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code new JiraIssue.Builder()}.
 */
@SuppressWarnings({"all"})
@ParametersAreNonnullByDefault
@Generated({"Immutables.generator", "JiraIssue"})
@Immutable
@CheckReturnValue
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableJiraIssue extends JiraIssue {
  private final String id;
  private final URI self;
  private final JiraIssueFields fields;

  private ImmutableJiraIssue(ImmutableJiraIssue.Builder builder) {
    this.id = builder.id;
    this.self = builder.self;
    this.fields = builder.fields;
  }

  /**
   * @return The value of the {@code id} attribute
   */
  @JsonProperty
  @Override
  public String getId() {
    return id;
  }

  /**
   * @return The value of the {@code self} attribute
   */
  @JsonProperty
  @Override
  public URI getSelf() {
    return self;
  }

  /**
   * @return The value of the {@code fields} attribute
   */
  @JsonProperty
  @Override
  public JiraIssueFields getFields() {
    return fields;
  }

  /**
   * This instance is equal to all instances of {@code ImmutableJiraIssue} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableJiraIssue
        && equalTo((ImmutableJiraIssue) another);
  }

  private boolean equalTo(ImmutableJiraIssue another) {
    return id.equals(another.id)
        && self.equals(another.self)
        && fields.equals(another.fields);
  }

  /**
   * Computes a hash code from attributes: {@code id}, {@code self}, {@code fields}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + id.hashCode();
    h += (h << 5) + self.hashCode();
    h += (h << 5) + fields.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code JiraIssue} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("JiraIssue")
        .omitNullValues()
        .add("id", id)
        .add("self", self)
        .add("fields", fields)
        .toString();
  }

  /**
   * Builds instances of type {@link JiraIssue JiraIssue}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @NotThreadSafe
  @EiffelStyleImmutable
  @JsonIgnoreProperties(ignoreUnknown = true)
  public static class Builder {
    private static final long INIT_BIT_ID = 0x1L;
    private static final long INIT_BIT_SELF = 0x2L;
    private static final long INIT_BIT_FIELDS = 0x4L;
    private long initBits = 0x7L;

    private @Nullable String id;
    private @Nullable URI self;
    private @Nullable JiraIssueFields fields;

    /**
     * Creates a builder for {@link JiraIssue JiraIssue} instances.
     */
    public Builder() {
      if (!(this instanceof JiraIssue.Builder)) {
        throw new UnsupportedOperationException("Use: new JiraIssue.Builder()");
      }
    }

    /**
     * Fill a builder with attribute values from the provided {@code JiraIssue} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final JiraIssue.Builder from(JiraIssue instance) {
      Objects.requireNonNull(instance, "instance");
      setId(instance.getId());
      setSelf(instance.getSelf());
      setFields(instance.getFields());
      return (JiraIssue.Builder) this;
    }

    /**
     * Initializes the value for the {@link JiraIssue#getId() id} attribute.
     * @param id The value for id 
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    @JsonProperty
    public final JiraIssue.Builder setId(String id) {
      this.id = Objects.requireNonNull(id, "id");
      initBits &= ~INIT_BIT_ID;
      return (JiraIssue.Builder) this;
    }

    /**
     * Initializes the value for the {@link JiraIssue#getSelf() self} attribute.
     * @param self The value for self 
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    @JsonProperty
    public final JiraIssue.Builder setSelf(URI self) {
      this.self = Objects.requireNonNull(self, "self");
      initBits &= ~INIT_BIT_SELF;
      return (JiraIssue.Builder) this;
    }

    /**
     * Initializes the value for the {@link JiraIssue#getFields() fields} attribute.
     * @param fields The value for fields 
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    @JsonProperty
    public final JiraIssue.Builder setFields(JiraIssueFields fields) {
      this.fields = Objects.requireNonNull(fields, "fields");
      initBits &= ~INIT_BIT_FIELDS;
      return (JiraIssue.Builder) this;
    }

    /**
     * Builds a new {@link JiraIssue JiraIssue}.
     * @return An immutable instance of JiraIssue
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public JiraIssue build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableJiraIssue(this);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = Lists.newArrayList();
      if ((initBits & INIT_BIT_ID) != 0) attributes.add("id");
      if ((initBits & INIT_BIT_SELF) != 0) attributes.add("self");
      if ((initBits & INIT_BIT_FIELDS) != 0) attributes.add("fields");
      return "Cannot build JiraIssue, some of required attributes are not set " + attributes;
    }
  }
}
