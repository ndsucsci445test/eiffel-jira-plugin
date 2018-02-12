package io.github.eiffelcommunity.eiffeljiraplugin.model.eiffel;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.google.common.base.MoreObjects;
import java.util.Objects;
import javax.annotation.CheckReturnValue;
import javax.annotation.Generated;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.Immutable;

/**
 * Immutable implementation of {@link Sdm}.
 * <p>
 * Use the static factory method to create immutable instances:
 * {@code ImmutableSdm.of()}.
 */
@SuppressWarnings({"all"})
@ParametersAreNonnullByDefault
@Generated({"Immutables.generator", "Sdm"})
@Immutable
@CheckReturnValue
final class ImmutableSdm extends Sdm {
  private final String authorIdentity;
  private final String encryptedDigest;

  private ImmutableSdm(String authorIdentity, String encryptedDigest) {
    this.authorIdentity = Objects.requireNonNull(authorIdentity, "authorIdentity");
    this.encryptedDigest = Objects.requireNonNull(encryptedDigest, "encryptedDigest");
  }

  /**
   * @return The value of the {@code authorIdentity} attribute
   */
  @JsonProperty
  @Override
  public String getAuthorIdentity() {
    return authorIdentity;
  }

  /**
   * @return The value of the {@code encryptedDigest} attribute
   */
  @JsonProperty
  @Override
  public String getEncryptedDigest() {
    return encryptedDigest;
  }

  /**
   * This instance is equal to all instances of {@code ImmutableSdm} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableSdm
        && equalTo((ImmutableSdm) another);
  }

  private boolean equalTo(ImmutableSdm another) {
    return authorIdentity.equals(another.authorIdentity)
        && encryptedDigest.equals(another.encryptedDigest);
  }

  /**
   * Computes a hash code from attributes: {@code authorIdentity}, {@code encryptedDigest}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + authorIdentity.hashCode();
    h += (h << 5) + encryptedDigest.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code Sdm} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("Sdm")
        .omitNullValues()
        .add("authorIdentity", authorIdentity)
        .add("encryptedDigest", encryptedDigest)
        .toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json extends Sdm {
    @Nullable String authorIdentity;
    @Nullable String encryptedDigest;
    @JsonProperty
    public void setAuthorIdentity(String authorIdentity) {
      this.authorIdentity = authorIdentity;
    }
    @JsonProperty
    public void setEncryptedDigest(String encryptedDigest) {
      this.encryptedDigest = encryptedDigest;
    }
    @Override
    public String getAuthorIdentity() { throw new UnsupportedOperationException(); }
    @Override
    public String getEncryptedDigest() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableSdm fromJson(Json json) {
    ImmutableSdm instance = (ImmutableSdm) ImmutableSdm.of(json.authorIdentity, json.encryptedDigest);
    return instance;
  }

  /**
   * Construct a new immutable {@code Sdm} instance.
   * @param authorIdentity The value for the {@code authorIdentity} attribute
   * @param encryptedDigest The value for the {@code encryptedDigest} attribute
   * @return An immutable Sdm instance
   */
  public static Sdm of(String authorIdentity, String encryptedDigest) {
    return new ImmutableSdm(authorIdentity, encryptedDigest);
  }
}
