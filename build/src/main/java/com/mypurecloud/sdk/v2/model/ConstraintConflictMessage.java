package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import java.util.Objects;
import java.io.IOException;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.mypurecloud.sdk.v2.model.WorkPlanConstraintConflictMessage;
import com.mypurecloud.sdk.v2.model.WorkPlanConstraintMessage;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * ConstraintConflictMessage
 */

public class ConstraintConflictMessage  implements Serializable {
  
  private WorkPlanConstraintConflictMessage message = null;
  private List<WorkPlanConstraintMessage> conflictedConstraintMessages = new ArrayList<WorkPlanConstraintMessage>();

  
  /**
   * Message for how to resolve a set of conflicted work plan constraints
   **/
  public ConstraintConflictMessage message(WorkPlanConstraintConflictMessage message) {
    this.message = message;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Message for how to resolve a set of conflicted work plan constraints")
  @JsonProperty("message")
  public WorkPlanConstraintConflictMessage getMessage() {
    return message;
  }
  public void setMessage(WorkPlanConstraintConflictMessage message) {
    this.message = message;
  }

  
  /**
   * Messages for the set of conflicted work plan constraints. Each element indicates the message of a work plan constraint that is conflicted in the set
   **/
  public ConstraintConflictMessage conflictedConstraintMessages(List<WorkPlanConstraintMessage> conflictedConstraintMessages) {
    this.conflictedConstraintMessages = conflictedConstraintMessages;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Messages for the set of conflicted work plan constraints. Each element indicates the message of a work plan constraint that is conflicted in the set")
  @JsonProperty("conflictedConstraintMessages")
  public List<WorkPlanConstraintMessage> getConflictedConstraintMessages() {
    return conflictedConstraintMessages;
  }
  public void setConflictedConstraintMessages(List<WorkPlanConstraintMessage> conflictedConstraintMessages) {
    this.conflictedConstraintMessages = conflictedConstraintMessages;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConstraintConflictMessage constraintConflictMessage = (ConstraintConflictMessage) o;
    return Objects.equals(this.message, constraintConflictMessage.message) &&
        Objects.equals(this.conflictedConstraintMessages, constraintConflictMessage.conflictedConstraintMessages);
  }

  @Override
  public int hashCode() {
    return Objects.hash(message, conflictedConstraintMessages);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConstraintConflictMessage {\n");
    
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    conflictedConstraintMessages: ").append(toIndentedString(conflictedConstraintMessages)).append("\n");
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

