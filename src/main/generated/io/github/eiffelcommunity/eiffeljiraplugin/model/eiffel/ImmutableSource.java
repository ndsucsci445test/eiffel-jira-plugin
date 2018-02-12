package io.github.eiffelcommunity.eiffeljiraplugin.model.eiffel;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.base.MoreObjects;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import io.github.eiffelcommunity.eiffeljiraplugin.model.EiffelStyleImmutable;
import java.net.URI;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.CheckReturnValue;
import javax.annotation.Generated;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.Immutable;
import javax.annotation.concurrent.NotThreadSafe;

/**
 * Immutable implementation of {@link Source}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code new Source.Builder()}.
 */
@SuppressWarnings({"all"})
@ParametersAreNonnullByDefault
@Generated({"Immutables.generator", "Source"})
@Immutable
@CheckReturnValue
final class ImmutableSource extends Source {
  private final @Nullable String domainId;
  private final @Nullable String host;
  private final @Nullable String name;
  private final @Nullable Serializer serializer;
  private final @Nullable URI uri;

  private ImmutableSource(ImmutableSource.Builder builder) {
    this.domainId = builder.domainId;
    this.host = builder.host;
    this.name = builder.name;
    this.serializer = builder.serializer;
    this.uri = builder.uri;
  }

  /**
   * @return The value of the {@code domainId} attribute
   */
  @JsonProperty
  @Override
  public Optional<String> getDomainId() {
    return Optional.ofNullable(domainId);
  }

  /**
   * @return The value of the {@code host} attribute
   */
  @JsonProperty
  @Override
  public Optional<String> getHost() {
    return Optional.ofNullable(host);
  }

  /**
   * @return The value of the {@code name} attribute
   */
  @JsonProperty
  @Override
  public Optional<String> getName() {
    return Optional.ofNullable(name);
  }

  /**
   * @return The value of the {@code serializer} attribute
   */
  @JsonProperty
  @Override
  public Optional<Serializer> getSerializer() {
    return Optional.ofNullable(serializer);
  }

  /**
   * @return The value of the {@code uri} attribute
   */
  @JsonProperty
  @Override
  public Optional<URI> getUri() {
    return Optional.ofNullable(uri);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableSource} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableSource
        && equalTo((ImmutableSource) another);
  }

  private boolean equalTo(ImmutableSource another) {
    return Objects.equals(domainId, another.domainId)
        && Objects.equals(host, another.host)
        && Objects.equals(name, another.name)
        && Objects.equals(serializer, another.serializer)
        && Objects.equals(uri, another.uri);
  }

  /**
   * Computes a hash code from attributes: {@code domainId}, {@code host}, {@code name}, {@code serializer}, {@code uri}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(domainId);
    h += (h << 5) + Objects.hashCode(host);
    h += (h << 5) + Objects.hashCode(name);
    h += (h << 5) + Objects.hashCode(serializer);
    h += (h << 5) + Objects.hashCode(uri);
    return h;
  }

  /**
   * Prints the immutable value {@code Source} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("Source")
        .omitNullValues()
        .add("domainId", domainId)
        .add("host", host)
        .add("name", name)
        .add("serializer", serializer)
        .add("uri", uri)
        .toString();
  }

  /**
   * Builds instances of type {@link Source Source}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @NotThreadSafe
  @EiffelStyleImmutable
  public static class Builder {
    private @Nullable String domainId;
    private @Nullable String host;
    private @Nullable String name;
    private @Nullable Serializer serializer;
    private @Nullable URI uri;

    /**
     * Creates a builder for {@link Source Source} instances.
     */
    public Builder() {
      if (!(this instanceof Source.Builder)) {
        throw new UnsupportedOperationException("Use: new Source.Builder()");
      }
    }

    /**
     * Fill a builder with attribute values from the provided {@code Source} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Source.Builder from(Source instance) {
      Objects.requireNonNull(instance, "instance");
      Optional<String> domainIdOptional = instance.getDomainId();
      if (domainIdOptional.isPresent()) {
        setDomainId(domainIdOptional);
      }
      Optional<String> hostOptional = instance.getHost();
      if (hostOptional.isPresent()) {
        setHost(hostOptional);
      }
      Optional<String> nameOptional = instance.getName();
      if (nameOptional.isPresent()) {
        setName(nameOptional);
      }
      Optional<Serializer> serializerOptional = instance.getSerializer();
      if (serializerOptional.isPresent()) {
        setSerializer(serializerOptional);
      }
      Optional<URI> uriOptional = instance.getUri();
      if (uriOptional.isPresent()) {
        setUri(uriOptional);
      }
      return (Source.Builder) this;
    }

    /**
     * Initializes the optional value {@link Source#getDomainId() domainId} to domainId.
     * @param domainId The value for domainId
     * @return {@code this} builder for chained invocation
     */
    @CanIgnoreReturnValue 
    public final Source.Builder setDomainId(String domainId) {
      this.domainId = Objects.requireNonNull(domainId, "domainId");
      return (Source.Builder) this;
    }

    /**
     * Initializes the optional value {@link Source#getDomainId() domainId} to domainId.
     * @param domainId The value for domainId
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    @JsonProperty
    public final Source.Builder setDomainId(Optional<String> domainId) {
      this.domainId = domainId.orElse(null);
      return (Source.Builder) this;
    }

    /**
     * Initializes the optional value {@link Source#getHost() host} to host.
     * @param host The value for host
     * @return {@code this} builder for chained invocation
     */
    @CanIgnoreReturnValue 
    public final Source.Builder setHost(String host) {
      this.host = Objects.requireNonNull(host, "host");
      return (Source.Builder) this;
    }

    /**
     * Initializes the optional value {@link Source#getHost() host} to host.
     * @param host The value for host
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    @JsonProperty
    public final Source.Builder setHost(Optional<String> host) {
      this.host = host.orElse(null);
      return (Source.Builder) this;
    }

    /**
     * Initializes the optional value {@link Source#getName() name} to name.
     * @param name The value for name
     * @return {@code this} builder for chained invocation
     */
    @CanIgnoreReturnValue 
    public final Source.Builder setName(String name) {
      this.name = Objects.requireNonNull(name, "name");
      return (Source.Builder) this;
    }

    /**
     * Initializes the optional value {@link Source#getName() name} to name.
     * @param name The value for name
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    @JsonProperty
    public final Source.Builder setName(Optional<String> name) {
      this.name = name.orElse(null);
      return (Source.Builder) this;
    }

    /**
     * Initializes the optional value {@link Source#getSerializer() serializer} to serializer.
     * @param serializer The value for serializer
     * @return {@code this} builder for chained invocation
     */
    @CanIgnoreReturnValue 
    public final Source.Builder setSerializer(Serializer serializer) {
      this.serializer = Objects.requireNonNull(serializer, "serializer");
      return (Source.Builder) this;
    }

    /**
     * Initializes the optional value {@link Source#getSerializer() serializer} to serializer.
     * @param serializer The value for serializer
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    @JsonProperty
    public final Source.Builder setSerializer(Optional<? extends Serializer> serializer) {
      this.serializer = serializer.orElse(null);
      return (Source.Builder) this;
    }

    /**
     * Initializes the optional value {@link Source#getUri() uri} to uri.
     * @param uri The value for uri
     * @return {@code this} builder for chained invocation
     */
    @CanIgnoreReturnValue 
    public final Source.Builder setUri(URI uri) {
      this.uri = Objects.requireNonNull(uri, "uri");
      return (Source.Builder) this;
    }

    /**
     * Initializes the optional value {@link Source#getUri() uri} to uri.
     * @param uri The value for uri
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    @JsonProperty
    public final Source.Builder setUri(Optional<? extends URI> uri) {
      this.uri = uri.orElse(null);
      return (Source.Builder) this;
    }

    /**
     * Builds a new {@link Source Source}.
     * @return An immutable instance of Source
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public Source build() {
      return new ImmutableSource(this);
    }
  }
}
