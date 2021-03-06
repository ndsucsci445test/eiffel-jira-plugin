package io.github.eiffelcommunity.eiffeljiraplugin.model.eiffel;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.UUID;
import javax.annotation.Generated;

/**
 * Immutable implementation of {@link EiffelIssueDefinedEventMeta}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableEiffelIssueDefinedEventMeta.builder()}.
 */
@SuppressWarnings({"all"})
@Generated({"Immutables.generator", "EiffelIssueDefinedEventMeta"})
public final class ImmutableEiffelIssueDefinedEventMeta
    implements EiffelIssueDefinedEventMeta {
  private final UUID id;
  private final long time;
  private final String type;
  private final String version;
  private final List<String> tags;
  private final Source source;

  private ImmutableEiffelIssueDefinedEventMeta(ImmutableEiffelIssueDefinedEventMeta.Builder builder) {
    this.tags = builder.tags;
    this.source = builder.source;
    if (builder.id != null) {
      initShim.id(builder.id);
    }
    if (builder.timeIsSet()) {
      initShim.time(builder.time);
    }
    this.id = initShim.id();
    this.time = initShim.time();
    this.type = initShim.type();
    this.version = initShim.version();
    this.initShim = null;
  }

  private ImmutableEiffelIssueDefinedEventMeta(
      UUID id,
      long time,
      List<String> tags,
      Source source) {
    this.id = id;
    this.time = time;
    this.tags = tags;
    this.source = source;
    initShim.id(this.id);
    initShim.time(this.time);
    this.type = initShim.type();
    this.version = initShim.version();
    this.initShim = null;
  }

  private static final int STAGE_INITIALIZING = -1;
  private static final int STAGE_UNINITIALIZED = 0;
  private static final int STAGE_INITIALIZED = 1;
  private transient volatile InitShim initShim = new InitShim();

  private final class InitShim {
    private UUID id;
    private int idBuildStage;

    UUID id() {
      if (idBuildStage == STAGE_INITIALIZING) throw new IllegalStateException(formatInitCycleMessage());
      if (idBuildStage == STAGE_UNINITIALIZED) {
        idBuildStage = STAGE_INITIALIZING;
        this.id = Objects.requireNonNull(idInitialize(), "id");
        idBuildStage = STAGE_INITIALIZED;
      }
      return this.id;
    }

    void id(UUID id) {
      this.id = id;
      idBuildStage = STAGE_INITIALIZED;
    }
    private long time;
    private int timeBuildStage;

    long time() {
      if (timeBuildStage == STAGE_INITIALIZING) throw new IllegalStateException(formatInitCycleMessage());
      if (timeBuildStage == STAGE_UNINITIALIZED) {
        timeBuildStage = STAGE_INITIALIZING;
        this.time = timeInitialize();
        timeBuildStage = STAGE_INITIALIZED;
      }
      return this.time;
    }

    void time(long time) {
      this.time = time;
      timeBuildStage = STAGE_INITIALIZED;
    }
    private String type;
    private int typeBuildStage;

    String type() {
      if (typeBuildStage == STAGE_INITIALIZING) throw new IllegalStateException(formatInitCycleMessage());
      if (typeBuildStage == STAGE_UNINITIALIZED) {
        typeBuildStage = STAGE_INITIALIZING;
        this.type = Objects.requireNonNull(typeInitialize(), "type");
        typeBuildStage = STAGE_INITIALIZED;
      }
      return this.type;
    }
    private String version;
    private int versionBuildStage;

    String version() {
      if (versionBuildStage == STAGE_INITIALIZING) throw new IllegalStateException(formatInitCycleMessage());
      if (versionBuildStage == STAGE_UNINITIALIZED) {
        versionBuildStage = STAGE_INITIALIZING;
        this.version = Objects.requireNonNull(versionInitialize(), "version");
        versionBuildStage = STAGE_INITIALIZED;
      }
      return this.version;
    }

    private String formatInitCycleMessage() {
      ArrayList<String> attributes = new ArrayList<String>();
      if (idBuildStage == STAGE_INITIALIZING) attributes.add("id");
      if (timeBuildStage == STAGE_INITIALIZING) attributes.add("time");
      if (typeBuildStage == STAGE_INITIALIZING) attributes.add("type");
      if (versionBuildStage == STAGE_INITIALIZING) attributes.add("version");
      return "Cannot build EiffelIssueDefinedEventMeta, attribute initializers form cycle" + attributes;
    }
  }

  private UUID idInitialize() {
    return EiffelIssueDefinedEventMeta.super.id();
  }

  private long timeInitialize() {
    return EiffelIssueDefinedEventMeta.super.time();
  }

  private String typeInitialize() {
    return EiffelIssueDefinedEventMeta.super.type();
  }

  private String versionInitialize() {
    return EiffelIssueDefinedEventMeta.super.version();
  }

  /**
   * @return The value of the {@code id} attribute
   */
  @JsonProperty("id")
  @Override
  public UUID id() {
    InitShim shim = this.initShim;
    return shim != null
        ? shim.id()
        : this.id;
  }

  /**
   * @return The value of the {@code time} attribute
   */
  @JsonProperty("time")
  @Override
  public long time() {
    InitShim shim = this.initShim;
    return shim != null
        ? shim.time()
        : this.time;
  }

  /**
   * @return The computed-at-construction value of the {@code type} attribute
   */
  @JsonProperty("type")
  @Override
  public String type() {
    InitShim shim = this.initShim;
    return shim != null
        ? shim.type()
        : this.type;
  }

  /**
   * @return The computed-at-construction value of the {@code version} attribute
   */
  @JsonProperty("version")
  @Override
  public String version() {
    InitShim shim = this.initShim;
    return shim != null
        ? shim.version()
        : this.version;
  }

  /**
   * @return The value of the {@code tags} attribute
   */
  @JsonProperty("tags")
  @Override
  public Optional<List<String>> tags() {
    return Optional.ofNullable(tags);
  }

  /**
   * @return The value of the {@code source} attribute
   */
  @JsonProperty("source")
  @Override
  public Optional<Source> source() {
    return Optional.ofNullable(source);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link EiffelIssueDefinedEventMeta#id() id} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for id
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableEiffelIssueDefinedEventMeta withId(UUID value) {
    if (this.id == value) return this;
    UUID newValue = Objects.requireNonNull(value, "id");
    return new ImmutableEiffelIssueDefinedEventMeta(newValue, this.time, this.tags, this.source);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link EiffelIssueDefinedEventMeta#time() time} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for time
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableEiffelIssueDefinedEventMeta withTime(long value) {
    if (this.time == value) return this;
    return new ImmutableEiffelIssueDefinedEventMeta(this.id, value, this.tags, this.source);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link EiffelIssueDefinedEventMeta#tags() tags} attribute.
   * @param value The value for tags
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEiffelIssueDefinedEventMeta withTags(List<String> value) {
    List<String> newValue = Objects.requireNonNull(value, "tags");
    if (this.tags == newValue) return this;
    return new ImmutableEiffelIssueDefinedEventMeta(this.id, this.time, newValue, this.source);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link EiffelIssueDefinedEventMeta#tags() tags} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for tags
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEiffelIssueDefinedEventMeta withTags(Optional<? extends List<String>> optional) {
    List<String> value = optional.orElse(null);
    if (this.tags == value) return this;
    return new ImmutableEiffelIssueDefinedEventMeta(this.id, this.time, value, this.source);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link EiffelIssueDefinedEventMeta#source() source} attribute.
   * @param value The value for source
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEiffelIssueDefinedEventMeta withSource(Source value) {
    Source newValue = Objects.requireNonNull(value, "source");
    if (this.source == newValue) return this;
    return new ImmutableEiffelIssueDefinedEventMeta(this.id, this.time, this.tags, newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link EiffelIssueDefinedEventMeta#source() source} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for source
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEiffelIssueDefinedEventMeta withSource(Optional<? extends Source> optional) {
    Source value = optional.orElse(null);
    if (this.source == value) return this;
    return new ImmutableEiffelIssueDefinedEventMeta(this.id, this.time, this.tags, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableEiffelIssueDefinedEventMeta} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(Object another) {
    if (this == another) return true;
    return another instanceof ImmutableEiffelIssueDefinedEventMeta
        && equalTo((ImmutableEiffelIssueDefinedEventMeta) another);
  }

  private boolean equalTo(ImmutableEiffelIssueDefinedEventMeta another) {
    return id.equals(another.id)
        && time == another.time
        && type.equals(another.type)
        && version.equals(another.version)
        && Objects.equals(tags, another.tags)
        && Objects.equals(source, another.source);
  }

  /**
   * Computes a hash code from attributes: {@code id}, {@code time}, {@code type}, {@code version}, {@code tags}, {@code source}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + id.hashCode();
    h += (h << 5) + Long.hashCode(time);
    h += (h << 5) + type.hashCode();
    h += (h << 5) + version.hashCode();
    h += (h << 5) + Objects.hashCode(tags);
    h += (h << 5) + Objects.hashCode(source);
    return h;
  }

  /**
   * Prints the immutable value {@code EiffelIssueDefinedEventMeta} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("EiffelIssueDefinedEventMeta{");
    builder.append("id=").append(id);
    builder.append(", ");
    builder.append("time=").append(time);
    builder.append(", ");
    builder.append("type=").append(type);
    builder.append(", ");
    builder.append("version=").append(version);
    if (tags != null) {
      builder.append(", ");
      builder.append("tags=").append(tags);
    }
    if (source != null) {
      builder.append(", ");
      builder.append("source=").append(source);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json
      implements EiffelIssueDefinedEventMeta {
    UUID id;
    long time;
    boolean timeIsSet;
    Optional<List<String>> tags = Optional.empty();
    Optional<Source> source = Optional.empty();
    @JsonProperty("id")
    public void setId(UUID id) {
      this.id = id;
    }
    @JsonProperty("time")
    public void setTime(long time) {
      this.time = time;
      this.timeIsSet = true;
    }
    @JsonProperty("tags")
    public void setTags(Optional<List<String>> tags) {
      this.tags = tags;
    }
    @JsonProperty("source")
    public void setSource(Optional<Source> source) {
      this.source = source;
    }
    @Override
    public UUID id() { throw new UnsupportedOperationException(); }
    @Override
    public long time() { throw new UnsupportedOperationException(); }
    @Override
    public String type() { throw new UnsupportedOperationException(); }
    @Override
    public String version() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<String>> tags() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Source> source() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableEiffelIssueDefinedEventMeta fromJson(Json json) {
    ImmutableEiffelIssueDefinedEventMeta.Builder builder = ImmutableEiffelIssueDefinedEventMeta.builder();
    if (json.id != null) {
      builder.id(json.id);
    }
    if (json.timeIsSet) {
      builder.time(json.time);
    }
    if (json.tags != null) {
      builder.tags(json.tags);
    }
    if (json.source != null) {
      builder.source(json.source);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link EiffelIssueDefinedEventMeta} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable EiffelIssueDefinedEventMeta instance
   */
  public static ImmutableEiffelIssueDefinedEventMeta copyOf(EiffelIssueDefinedEventMeta instance) {
    if (instance instanceof ImmutableEiffelIssueDefinedEventMeta) {
      return (ImmutableEiffelIssueDefinedEventMeta) instance;
    }
    return ImmutableEiffelIssueDefinedEventMeta.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableEiffelIssueDefinedEventMeta ImmutableEiffelIssueDefinedEventMeta}.
   * @return A new ImmutableEiffelIssueDefinedEventMeta builder
   */
  public static ImmutableEiffelIssueDefinedEventMeta.Builder builder() {
    return new ImmutableEiffelIssueDefinedEventMeta.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableEiffelIssueDefinedEventMeta ImmutableEiffelIssueDefinedEventMeta}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  public static final class Builder {
    private static final long OPT_BIT_TIME = 0x1L;
    private long optBits;

    private UUID id;
    private long time;
    private List<String> tags;
    private Source source;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code EiffelIssueDefinedEventMeta} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(EiffelIssueDefinedEventMeta instance) {
      Objects.requireNonNull(instance, "instance");
      id(instance.id());
      time(instance.time());
      Optional<List<String>> tagsOptional = instance.tags();
      if (tagsOptional.isPresent()) {
        tags(tagsOptional);
      }
      Optional<Source> sourceOptional = instance.source();
      if (sourceOptional.isPresent()) {
        source(sourceOptional);
      }
      return this;
    }

    /**
     * Initializes the value for the {@link EiffelIssueDefinedEventMeta#id() id} attribute.
     * <p><em>If not set, this attribute will have a default value as returned by the initializer of {@link EiffelIssueDefinedEventMeta#id() id}.</em>
     * @param id The value for id 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("id")
    public final Builder id(UUID id) {
      this.id = Objects.requireNonNull(id, "id");
      return this;
    }

    /**
     * Initializes the value for the {@link EiffelIssueDefinedEventMeta#time() time} attribute.
     * <p><em>If not set, this attribute will have a default value as returned by the initializer of {@link EiffelIssueDefinedEventMeta#time() time}.</em>
     * @param time The value for time 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("time")
    public final Builder time(long time) {
      this.time = time;
      optBits |= OPT_BIT_TIME;
      return this;
    }

    /**
     * Initializes the optional value {@link EiffelIssueDefinedEventMeta#tags() tags} to tags.
     * @param tags The value for tags
     * @return {@code this} builder for chained invocation
     */
    public final Builder tags(List<String> tags) {
      this.tags = Objects.requireNonNull(tags, "tags");
      return this;
    }

    /**
     * Initializes the optional value {@link EiffelIssueDefinedEventMeta#tags() tags} to tags.
     * @param tags The value for tags
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("tags")
    public final Builder tags(Optional<? extends List<String>> tags) {
      this.tags = tags.orElse(null);
      return this;
    }

    /**
     * Initializes the optional value {@link EiffelIssueDefinedEventMeta#source() source} to source.
     * @param source The value for source
     * @return {@code this} builder for chained invocation
     */
    public final Builder source(Source source) {
      this.source = Objects.requireNonNull(source, "source");
      return this;
    }

    /**
     * Initializes the optional value {@link EiffelIssueDefinedEventMeta#source() source} to source.
     * @param source The value for source
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("source")
    public final Builder source(Optional<? extends Source> source) {
      this.source = source.orElse(null);
      return this;
    }

    /**
     * Builds a new {@link ImmutableEiffelIssueDefinedEventMeta ImmutableEiffelIssueDefinedEventMeta}.
     * @return An immutable instance of EiffelIssueDefinedEventMeta
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableEiffelIssueDefinedEventMeta build() {
      return new ImmutableEiffelIssueDefinedEventMeta(this);
    }

    private boolean timeIsSet() {
      return (optBits & OPT_BIT_TIME) != 0;
    }
  }
}
