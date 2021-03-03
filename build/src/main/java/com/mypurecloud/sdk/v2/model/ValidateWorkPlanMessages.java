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
import com.mypurecloud.sdk.v2.model.ConstraintConflictMessage;
import com.mypurecloud.sdk.v2.model.WorkPlanConfigurationViolationMessage;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * ValidateWorkPlanMessages
 */

public class ValidateWorkPlanMessages  implements Serializable {
  
  private List<WorkPlanConfigurationViolationMessage> violationMessages = new ArrayList<WorkPlanConfigurationViolationMessage>();
  private ConstraintConflictMessage constraintConflictMessage = null;

  
  /**
   * Messages for work plan violating some rules such as no shifts in a work plan
   **/
  public ValidateWorkPlanMessages violationMessages(List<WorkPlanConfigurationViolationMessage> violationMessages) {
    this.violationMessages = violationMessages;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Messages for work plan violating some rules such as no shifts in a work plan")
  @JsonProperty("violationMessages")
  public List<WorkPlanConfigurationViolationMessage> getViolationMessages() {
    return violationMessages;
  }
  public void setViolationMessages(List<WorkPlanConfigurationViolationMessage> violationMessages) {
    this.violationMessages = violationMessages;
  }

  
  /**
   * This field is not null when there is a set of work plan constraints that conflict thus agent schedules cannot be generated
   **/
  public ValidateWorkPlanMessages constraintConflictMessage(ConstraintConflictMessage constraintConflictMessage) {
    this.constraintConflictMessage = constraintConflictMessage;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This field is not null when there is a set of work plan constraints that conflict thus agent schedules cannot be generated")
  @JsonProperty("constraintConflictMessage")
  public ConstraintConflictMessage getConstraintConflictMessage() {
    return constraintConflictMessage;
  }
  public void setConstraintConflictMessage(ConstraintConflictMessage constraintConflictMessage) {
    this.constraintConflictMessage = constraintConflictMessage;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ValidateWorkPlanMessages validateWorkPlanMessages = (ValidateWorkPlanMessages) o;
    return Objects.equals(this.violationMessages, validateWorkPlanMessages.violationMessages) &&
        Objects.equals(this.constraintConflictMessage, validateWorkPlanMessages.constraintConflictMessage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(violationMessages, constraintConflictMessage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ValidateWorkPlanMessages {\n");
    
    sb.append("    violationMessages: ").append(toIndentedString(violationMessages)).append("\n");
    sb.append("    constraintConflictMessage: ").append(toIndentedString(constraintConflictMessage)).append("\n");
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

