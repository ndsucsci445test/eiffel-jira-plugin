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
 * Immutable implementation of {@link JiraIssueFields}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code new JiraIssueFields.Builder()}.
 */
@SuppressWarnings({"all"})
@ParametersAreNonnullByDefault
@Generated({"Immutables.generator", "JiraIssueFields"})
@Immutable
@CheckReturnValue
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableJiraIssueFields
    extends JiraIssueFields {
  private final JiraFieldsIssueType fieldsIssueType;

  private ImmutableJiraIssueFields(ImmutableJiraIssueFields.Builder builder) {
    this.fieldsIssueType = builder.fieldsIssueType;
  }

  /**
   * @return The value of the {@code fieldsIssueType} attribute
   */
  @JsonProperty("issuetype")
  @Override
  public JiraFieldsIssueType getFieldsIssueType() {
    return fieldsIssueType;
  }

  /**
   * This instance is equal to all instances of {@code ImmutableJiraIssueFields} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableJiraIssueFields
        && equalTo((ImmutableJiraIssueFields) another);
  }

  private boolean equalTo(ImmutableJiraIssueFields another) {
    return fieldsIssueType.equals(another.fieldsIssueType);
  }

  /**
   * Computes a hash code from attributes: {@code fieldsIssueType}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + fieldsIssueType.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code JiraIssueFields} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("JiraIssueFields")
        .omitNullValues()
        .add("fieldsIssueType", fieldsIssueType)
        .toString();
  }

  /**
   * Builds instances of type {@link JiraIssueFields JiraIssueFields}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @NotThreadSafe
  @EiffelStyleImmutable
  @JsonIgnoreProperties(ignoreUnknown = true)
  public static class Builder {
    private static final long INIT_BIT_FIELDS_ISSUE_TYPE = 0x1L;
    private long initBits = 0x1L;

    private @Nullable JiraFieldsIssueType fieldsIssueType;

    /**
     * Creates a builder for {@link JiraIssueFields JiraIssueFields} instances.
     */
    public Builder() {
      if (!(this instanceof JiraIssueFields.Builder)) {
        throw new UnsupportedOperationException("Use: new JiraIssueFields.Builder()");
      }
    }

    /**
     * Fill a builder with attribute values from the provided {@code JiraIssueFields} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final JiraIssueFields.Builder from(JiraIssueFields instance) {
      Objects.requireNonNull(instance, "instance");
      setFieldsIssueType(instance.getFieldsIssueType());
      return (JiraIssueFields.Builder) this;
    }

    /**
     * Initializes the value for the {@link JiraIssueFields#getFieldsIssueType() fieldsIssueType} attribute.
     * @param fieldsIssueType The value for fieldsIssueType 
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    @JsonProperty("issuetype")
    public final JiraIssueFields.Builder setFieldsIssueType(JiraFieldsIssueType fieldsIssueType) {
      this.fieldsIssueType = Objects.requireNonNull(fieldsIssueType, "fieldsIssueType");
      initBits &= ~INIT_BIT_FIELDS_ISSUE_TYPE;
      return (JiraIssueFields.Builder) this;
    }

    /**
     * Builds a new {@link JiraIssueFields JiraIssueFields}.
     * @return An immutable instance of JiraIssueFields
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public JiraIssueFields build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableJiraIssueFields(this);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = Lists.newArrayList();
      if ((initBits & INIT_BIT_FIELDS_ISSUE_TYPE) != 0) attributes.add("fieldsIssueType");
      return "Cannot build JiraIssueFields, some of required attributes are not set " + attributes;
    }
  }
}
