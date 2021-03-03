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
import com.mypurecloud.sdk.v2.model.ValidateWorkPlanMessages;
import com.mypurecloud.sdk.v2.model.WorkPlanReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * ValidateWorkPlanResponse
 */

public class ValidateWorkPlanResponse  implements Serializable {
  
  private WorkPlanReference workPlan = null;
  private Boolean valid = null;
  private ValidateWorkPlanMessages messages = null;

  
  /**
   * The work plan reference associated with this response
   **/
  public ValidateWorkPlanResponse workPlan(WorkPlanReference workPlan) {
    this.workPlan = workPlan;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The work plan reference associated with this response")
  @JsonProperty("workPlan")
  public WorkPlanReference getWorkPlan() {
    return workPlan;
  }
  public void setWorkPlan(WorkPlanReference workPlan) {
    this.workPlan = workPlan;
  }

  
  /**
   * Whether the work plan is valid or not
   **/
  public ValidateWorkPlanResponse valid(Boolean valid) {
    this.valid = valid;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Whether the work plan is valid or not")
  @JsonProperty("valid")
  public Boolean getValid() {
    return valid;
  }
  public void setValid(Boolean valid) {
    this.valid = valid;
  }

  
  /**
   * Validation messages for this work plan
   **/
  public ValidateWorkPlanResponse messages(ValidateWorkPlanMessages messages) {
    this.messages = messages;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Validation messages for this work plan")
  @JsonProperty("messages")
  public ValidateWorkPlanMessages getMessages() {
    return messages;
  }
  public void setMessages(ValidateWorkPlanMessages messages) {
    this.messages = messages;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ValidateWorkPlanResponse validateWorkPlanResponse = (ValidateWorkPlanResponse) o;
    return Objects.equals(this.workPlan, validateWorkPlanResponse.workPlan) &&
        Objects.equals(this.valid, validateWorkPlanResponse.valid) &&
        Objects.equals(this.messages, validateWorkPlanResponse.messages);
  }

  @Override
  public int hashCode() {
    return Objects.hash(workPlan, valid, messages);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ValidateWorkPlanResponse {\n");
    
    sb.append("    workPlan: ").append(toIndentedString(workPlan)).append("\n");
    sb.append("    valid: ").append(toIndentedString(valid)).append("\n");
    sb.append("    messages: ").append(toIndentedString(messages)).append("\n");
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

