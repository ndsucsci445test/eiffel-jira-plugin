/*
 * Copyright 2018 Jaden Young
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.github.eiffelcommunity.eiffeljiraplugin.model.eiffel;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import io.github.eiffelcommunity.eiffeljiraplugin.model.EiffelStyleImmutable;
import org.immutables.value.Value;

import java.net.URI;
import java.util.Optional;

@Value.Immutable
@EiffelStyleImmutable
@JsonSerialize(as = ImmutableSource.class)
@JsonDeserialize(builder = Source.Builder.class)
public abstract class Source {
    public abstract Optional<String> getDomainId();

    public abstract Optional<String> getHost();

    public abstract Optional<String> getName();

    public abstract Optional<Serializer> getSerializer();

    public abstract Optional<URI> getUri();

    public static class Builder extends ImmutableSource.Builder {
    }
}
