package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import java.util.Objects;
import java.util.ArrayList;
import java.io.IOException;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import java.io.Serializable;
/**
 * Information about the workflow.
 */
@ApiModel(description = "Information about the workflow.")

public class QueueConversationVideoEventTopicWorkflow  implements Serializable {
  
  private String workflowId = null;
  private Map<String, Object> additionalProperties = null;

  
  /**
   * The id of the workflow
   **/
  public QueueConversationVideoEventTopicWorkflow workflowId(String workflowId) {
    this.workflowId = workflowId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The id of the workflow")
  @JsonProperty("workflowId")
  public String getWorkflowId() {
    return workflowId;
  }
  public void setWorkflowId(String workflowId) {
    this.workflowId = workflowId;
  }


  /**
   **/
  public QueueConversationVideoEventTopicWorkflow additionalProperties(Map<String, Object> additionalProperties) {
    this.additionalProperties = additionalProperties;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("additionalProperties")
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }
  public void setAdditionalProperties(Map<String, Object> additionalProperties) {
    this.additionalProperties = additionalProperties;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QueueConversationVideoEventTopicWorkflow queueConversationVideoEventTopicWorkflow = (QueueConversationVideoEventTopicWorkflow) o;

    return Objects.equals(this.workflowId, queueConversationVideoEventTopicWorkflow.workflowId) &&
            Objects.equals(this.additionalProperties, queueConversationVideoEventTopicWorkflow.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(workflowId, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueueConversationVideoEventTopicWorkflow {\n");
    
    sb.append("    workflowId: ").append(toIndentedString(workflowId)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

