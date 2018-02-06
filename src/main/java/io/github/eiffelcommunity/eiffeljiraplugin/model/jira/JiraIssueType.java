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
