package io.github.eiffelcommunity.eiffeljiraplugin.model.eiffel;

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
 * Immutable implementation of {@link Serializer}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code new Serializer.Builder()}.
 */
@SuppressWarnings({"all"})
@ParametersAreNonnullByDefault
@Generated({"Immutables.generator", "Serializer"})
@Immutable
@CheckReturnValue
final class ImmutableSerializer
    extends Serializer {
  private final String groupId;
  private final String artifactId;
  private final String version;

  private ImmutableSerializer(ImmutableSerializer.Builder builder) {
    this.groupId = builder.groupId;
    this.artifactId = builder.artifactId;
    this.version = builder.version;
  }

  /**
   * @return The value of the {@code groupId} attribute
   */
  @JsonProperty
  @Override
  public String getGroupId() {
    return groupId;
  }

  /**
   * @return The value of the {@code artifactId} attribute
   */
  @JsonProperty
  @Override
  public String getArtifactId() {
    return artifactId;
  }

  /**
   * @return The value of the {@code version} attribute
   */
  @JsonProperty
  @Override
  public String getVersion() {
    return version;
  }

  /**
   * This instance is equal to all instances of {@code ImmutableSerializer} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableSerializer
        && equalTo((ImmutableSerializer) another);
  }

  private boolean equalTo(ImmutableSerializer another) {
    return groupId.equals(another.groupId)
        && artifactId.equals(another.artifactId)
        && version.equals(another.version);
  }

  /**
   * Computes a hash code from attributes: {@code groupId}, {@code artifactId}, {@code version}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + groupId.hashCode();
    h += (h << 5) + artifactId.hashCode();
    h += (h << 5) + version.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code Serializer} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("Serializer")
        .omitNullValues()
        .add("groupId", groupId)
        .add("artifactId", artifactId)
        .add("version", version)
        .toString();
  }

  /**
   * Builds instances of type {@link Serializer Serializer}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @NotThreadSafe
  @EiffelStyleImmutable
  public static class Builder {
    private static final long INIT_BIT_GROUP_ID = 0x1L;
    private static final long INIT_BIT_ARTIFACT_ID = 0x2L;
    private static final long INIT_BIT_VERSION = 0x4L;
    private long initBits = 0x7L;

    private @Nullable String groupId;
    private @Nullable String artifactId;
    private @Nullable String version;

    /**
     * Creates a builder for {@link Serializer Serializer} instances.
     */
    public Builder() {
      if (!(this instanceof Serializer.Builder)) {
        throw new UnsupportedOperationException("Use: new Serializer.Builder()");
      }
    }

    /**
     * Fill a builder with attribute values from the provided {@code Serializer} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Serializer.Builder from(Serializer instance) {
      Objects.requireNonNull(instance, "instance");
      setGroupId(instance.getGroupId());
      setArtifactId(instance.getArtifactId());
      setVersion(instance.getVersion());
      return (Serializer.Builder) this;
    }

    /**
     * Initializes the value for the {@link Serializer#getGroupId() groupId} attribute.
     * @param groupId The value for groupId 
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    @JsonProperty
    public final Serializer.Builder setGroupId(String groupId) {
      this.groupId = Objects.requireNonNull(groupId, "groupId");
      initBits &= ~INIT_BIT_GROUP_ID;
      return (Serializer.Builder) this;
    }

    /**
     * Initializes the value for the {@link Serializer#getArtifactId() artifactId} attribute.
     * @param artifactId The value for artifactId 
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    @JsonProperty
    public final Serializer.Builder setArtifactId(String artifactId) {
      this.artifactId = Objects.requireNonNull(artifactId, "artifactId");
      initBits &= ~INIT_BIT_ARTIFACT_ID;
      return (Serializer.Builder) this;
    }

    /**
     * Initializes the value for the {@link Serializer#getVersion() version} attribute.
     * @param version The value for version 
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    @JsonProperty
    public final Serializer.Builder setVersion(String version) {
      this.version = Objects.requireNonNull(version, "version");
      initBits &= ~INIT_BIT_VERSION;
      return (Serializer.Builder) this;
    }

    /**
     * Builds a new {@link Serializer Serializer}.
     * @return An immutable instance of Serializer
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public Serializer build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableSerializer(this);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = Lists.newArrayList();
      if ((initBits & INIT_BIT_GROUP_ID) != 0) attributes.add("groupId");
      if ((initBits & INIT_BIT_ARTIFACT_ID) != 0) attributes.add("artifactId");
      if ((initBits & INIT_BIT_VERSION) != 0) attributes.add("version");
      return "Cannot build Serializer, some of required attributes are not set " + attributes;
    }
  }
}
