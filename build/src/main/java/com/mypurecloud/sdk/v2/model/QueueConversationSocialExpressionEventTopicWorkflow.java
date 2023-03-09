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

import java.io.Serializable;
/**
 * Information about the workflow.
 */
@ApiModel(description = "Information about the workflow.")

public class QueueConversationSocialExpressionEventTopicWorkflow  implements Serializable {
  
  private String workflowId = null;

  
  /**
   * The id of the workflow
   **/
  public QueueConversationSocialExpressionEventTopicWorkflow workflowId(String workflowId) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QueueConversationSocialExpressionEventTopicWorkflow queueConversationSocialExpressionEventTopicWorkflow = (QueueConversationSocialExpressionEventTopicWorkflow) o;

    return Objects.equals(this.workflowId, queueConversationSocialExpressionEventTopicWorkflow.workflowId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(workflowId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueueConversationSocialExpressionEventTopicWorkflow {\n");
    
    sb.append("    workflowId: ").append(toIndentedString(workflowId)).append("\n");
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

