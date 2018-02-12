package io.github.eiffelcommunity.eiffeljiraplugin.model.eiffel;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.base.MoreObjects;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import io.github.eiffelcommunity.eiffeljiraplugin.model.EiffelStyleImmutable;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.CheckReturnValue;
import javax.annotation.Generated;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.Immutable;
import javax.annotation.concurrent.NotThreadSafe;

/**
 * Immutable implementation of {@link Security}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code new Security.Builder()}.
 */
@SuppressWarnings({"all"})
@ParametersAreNonnullByDefault
@Generated({"Immutables.generator", "Security"})
@Immutable
@CheckReturnValue
final class ImmutableSecurity extends Security {
  private final @Nullable Sdm sdm;

  private ImmutableSecurity(ImmutableSecurity.Builder builder) {
    this.sdm = builder.sdm;
  }

  /**
   * @return The value of the {@code sdm} attribute
   */
  @JsonProperty
  @Override
  public Optional<Sdm> getSdm() {
    return Optional.ofNullable(sdm);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableSecurity} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableSecurity
        && equalTo((ImmutableSecurity) another);
  }

  private boolean equalTo(ImmutableSecurity another) {
    return Objects.equals(sdm, another.sdm);
  }

  /**
   * Computes a hash code from attributes: {@code sdm}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(sdm);
    return h;
  }

  /**
   * Prints the immutable value {@code Security} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("Security")
        .omitNullValues()
        .add("sdm", sdm)
        .toString();
  }

  /**
   * Builds instances of type {@link Security Security}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @NotThreadSafe
  @EiffelStyleImmutable
  public static class Builder {
    private @Nullable Sdm sdm;

    /**
     * Creates a builder for {@link Security Security} instances.
     */
    public Builder() {
      if (!(this instanceof Security.Builder)) {
        throw new UnsupportedOperationException("Use: new Security.Builder()");
      }
    }

    /**
     * Fill a builder with attribute values from the provided {@code Security} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Security.Builder from(Security instance) {
      Objects.requireNonNull(instance, "instance");
      Optional<Sdm> sdmOptional = instance.getSdm();
      if (sdmOptional.isPresent()) {
        setSdm(sdmOptional);
      }
      return (Security.Builder) this;
    }

    /**
     * Initializes the optional value {@link Security#getSdm() sdm} to sdm.
     * @param sdm The value for sdm
     * @return {@code this} builder for chained invocation
     */
    @CanIgnoreReturnValue 
    public final Security.Builder setSdm(Sdm sdm) {
      this.sdm = Objects.requireNonNull(sdm, "sdm");
      return (Security.Builder) this;
    }

    /**
     * Constructs and initializes the optional value for the {@link Security#getSdm() sdm} attribute.
     * @param authorIdentity The value for {@code sdm.authorIdentity} 
     * @param encryptedDigest The value for {@code sdm.encryptedDigest} 
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Security.Builder setSdm(String authorIdentity, String encryptedDigest) {
      return setSdm(ImmutableSdm.of(authorIdentity, encryptedDigest));
    }

    /**
     * Initializes the optional value {@link Security#getSdm() sdm} to sdm.
     * @param sdm The value for sdm
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    @JsonProperty
    public final Security.Builder setSdm(Optional<? extends Sdm> sdm) {
      this.sdm = sdm.orElse(null);
      return (Security.Builder) this;
    }

    /**
     * Builds a new {@link Security Security}.
     * @return An immutable instance of Security
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public Security build() {
      return new ImmutableSecurity(this);
    }
  }
}
