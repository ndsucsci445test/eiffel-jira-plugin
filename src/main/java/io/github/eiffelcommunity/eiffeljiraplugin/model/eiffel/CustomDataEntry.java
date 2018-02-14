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
import io.github.eiffelcommunity.eiffeljiraplugin.model.EiffelStyleTuple;
import org.immutables.value.Value;

@Value.Immutable
@EiffelStyleTuple
@JsonSerialize(as = ImmutableCustomDataEntry.class)
@JsonDeserialize(as = ImmutableCustomDataEntry.class)
public abstract class CustomDataEntry {
    public static CustomDataEntry of(String key, Object value) {
        return ImmutableCustomDataEntry.of(key, value);
    }

    public abstract String getKey();

    public abstract Object getValue();
}
