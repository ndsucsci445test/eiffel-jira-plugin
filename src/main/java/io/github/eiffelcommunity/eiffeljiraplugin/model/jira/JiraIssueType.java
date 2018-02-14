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

package io.github.eiffelcommunity.eiffeljiraplugin.model.jira;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum JiraIssueType {
    @JsonProperty("Task") TASK,
    @JsonProperty("Sub-task") SUB_TASK,
    @JsonProperty("Story") STORY,
    @JsonProperty("Bug") BUG,
    @JsonProperty("Epic") EPIC,
    @JsonProperty("Feature") FEATURE,
    @JsonProperty("Improvement") IMPROVEMENT
}
