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
 * Immutable implementation of {@link JiraFieldsIssueType}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code new JiraFieldsIssueType.Builder()}.
 */
@SuppressWarnings({"all"})
@ParametersAreNonnullByDefault
@Generated({"Immutables.generator", "JiraFieldsIssueType"})
@Immutable
@CheckReturnValue
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableJiraFieldsIssueType
    extends JiraFieldsIssueType {
  private final JiraIssueType issueType;

  private ImmutableJiraFieldsIssueType(ImmutableJiraFieldsIssueType.Builder builder) {
    this.issueType = builder.issueType;
  }

  /**
   * @return The value of the {@code issueType} attribute
   */
  @JsonProperty("name")
  @Override
  public JiraIssueType getIssueType() {
    return issueType;
  }

  /**
   * This instance is equal to all instances of {@code ImmutableJiraFieldsIssueType} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableJiraFieldsIssueType
        && equalTo((ImmutableJiraFieldsIssueType) another);
  }

  private boolean equalTo(ImmutableJiraFieldsIssueType another) {
    return issueType.equals(another.issueType);
  }

  /**
   * Computes a hash code from attributes: {@code issueType}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + issueType.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code JiraFieldsIssueType} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("JiraFieldsIssueType")
        .omitNullValues()
        .add("issueType", issueType)
        .toString();
  }

  /**
   * Builds instances of type {@link JiraFieldsIssueType JiraFieldsIssueType}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @NotThreadSafe
  @EiffelStyleImmutable
  @JsonIgnoreProperties(ignoreUnknown = true)
  public static class Builder {
    private static final long INIT_BIT_ISSUE_TYPE = 0x1L;
    private long initBits = 0x1L;

    private @Nullable JiraIssueType issueType;

    /**
     * Creates a builder for {@link JiraFieldsIssueType JiraFieldsIssueType} instances.
     */
    public Builder() {
      if (!(this instanceof JiraFieldsIssueType.Builder)) {
        throw new UnsupportedOperationException("Use: new JiraFieldsIssueType.Builder()");
      }
    }

    /**
     * Fill a builder with attribute values from the provided {@code JiraFieldsIssueType} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final JiraFieldsIssueType.Builder from(JiraFieldsIssueType instance) {
      Objects.requireNonNull(instance, "instance");
      setIssueType(instance.getIssueType());
      return (JiraFieldsIssueType.Builder) this;
    }

    /**
     * Initializes the value for the {@link JiraFieldsIssueType#getIssueType() issueType} attribute.
     * @param issueType The value for issueType 
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    @JsonProperty("name")
    public final JiraFieldsIssueType.Builder setIssueType(JiraIssueType issueType) {
      this.issueType = Objects.requireNonNull(issueType, "issueType");
      initBits &= ~INIT_BIT_ISSUE_TYPE;
      return (JiraFieldsIssueType.Builder) this;
    }

    /**
     * Builds a new {@link JiraFieldsIssueType JiraFieldsIssueType}.
     * @return An immutable instance of JiraFieldsIssueType
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public JiraFieldsIssueType build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableJiraFieldsIssueType(this);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = Lists.newArrayList();
      if ((initBits & INIT_BIT_ISSUE_TYPE) != 0) attributes.add("issueType");
      return "Cannot build JiraFieldsIssueType, some of required attributes are not set " + attributes;
    }
  }
}
