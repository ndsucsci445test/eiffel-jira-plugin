package io.github.eiffelcommunity.eiffeljiraplugin.model.eiffel;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.annotation.Generated;
import jdk.nashorn.internal.runtime.options.Option;

/**
 * Immutable implementation of {@link Security}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableSecurity.builder()}.
 */
@SuppressWarnings({"all"})
@Generated({"Immutables.generator", "Security"})
public final class ImmutableSecurity
    implements Security {
  private final Option<Sdm> sdm;

  private ImmutableSecurity(
      Option<Sdm> sdm) {
    this.sdm = sdm;
  }

  /**
   * @return The value of the {@code sdm} attribute
   */
  @JsonProperty("sdm")
  @Override
  public Option<Sdm> sdm() {
    return sdm;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Security#sdm() sdm} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for sdm
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableSecurity withSdm(Option<Sdm> value) {
    if (this.sdm == value) return this;
    Option<Sdm> newValue = Objects.requireNonNull(value, "sdm");
    return new ImmutableSecurity(newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableSecurity} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(Object another) {
    if (this == another) return true;
    return another instanceof ImmutableSecurity
        && equalTo((ImmutableSecurity) another);
  }

  private boolean equalTo(ImmutableSecurity another) {
    return sdm.equals(another.sdm);
  }

  /**
   * Computes a hash code from attributes: {@code sdm}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + sdm.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code Security} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return "Security{"
        + "sdm=" + sdm
        + "}";
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements Security {
    Option<Sdm> sdm;
    @JsonProperty("sdm")
    public void setSdm(Option<Sdm> sdm) {
      this.sdm = sdm;
    }
    @Override
    public Option<Sdm> sdm() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableSecurity fromJson(Json json) {
    ImmutableSecurity.Builder builder = ImmutableSecurity.builder();
    if (json.sdm != null) {
      builder.sdm(json.sdm);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link Security} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable Security instance
   */
  public static ImmutableSecurity copyOf(Security instance) {
    if (instance instanceof ImmutableSecurity) {
      return (ImmutableSecurity) instance;
    }
    return ImmutableSecurity.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableSecurity ImmutableSecurity}.
   * @return A new ImmutableSecurity builder
   */
  public static ImmutableSecurity.Builder builder() {
    return new ImmutableSecurity.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableSecurity ImmutableSecurity}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  public static final class Builder {
    private static final long INIT_BIT_SDM = 0x1L;
    private long initBits = 0x1L;

    private Option<Sdm> sdm;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code Security} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(Security instance) {
      Objects.requireNonNull(instance, "instance");
      sdm(instance.sdm());
      return this;
    }

    /**
     * Initializes the value for the {@link Security#sdm() sdm} attribute.
     * @param sdm The value for sdm 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("sdm")
    public final Builder sdm(Option<Sdm> sdm) {
      this.sdm = Objects.requireNonNull(sdm, "sdm");
      initBits &= ~INIT_BIT_SDM;
      return this;
    }

    /**
     * Builds a new {@link ImmutableSecurity ImmutableSecurity}.
     * @return An immutable instance of Security
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableSecurity build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableSecurity(sdm);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<String>();
      if ((initBits & INIT_BIT_SDM) != 0) attributes.add("sdm");
      return "Cannot build Security, some of required attributes are not set " + attributes;
    }
  }
}
