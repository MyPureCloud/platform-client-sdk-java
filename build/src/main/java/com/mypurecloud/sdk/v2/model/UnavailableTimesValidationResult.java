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
import com.mypurecloud.sdk.v2.ApiClient;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.mypurecloud.sdk.v2.model.WorkPlanConstraintsViolationMessage;
import com.mypurecloud.sdk.v2.model.WorkPlanReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * UnavailableTimesValidationResult
 */

public class UnavailableTimesValidationResult  implements Serializable {
  
  private Boolean valid = null;
  private List<WorkPlanReference> invalidWorkPlans = null;
  private WorkPlanConstraintsViolationMessage workPlanConstraintsViolationMessage = null;

  public UnavailableTimesValidationResult() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      invalidWorkPlans = new ArrayList<WorkPlanReference>();
    }
  }

  
  /**
   * Indicates whether there are no violations in the given unavailable times
   **/
  public UnavailableTimesValidationResult valid(Boolean valid) {
    this.valid = valid;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Indicates whether there are no violations in the given unavailable times")
  @JsonProperty("valid")
  public Boolean getValid() {
    return valid;
  }
  public void setValid(Boolean valid) {
    this.valid = valid;
  }


  /**
   * Invalid work plans that were used when validating the agents unavailable times
   **/
  public UnavailableTimesValidationResult invalidWorkPlans(List<WorkPlanReference> invalidWorkPlans) {
    this.invalidWorkPlans = invalidWorkPlans;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Invalid work plans that were used when validating the agents unavailable times")
  @JsonProperty("invalidWorkPlans")
  public List<WorkPlanReference> getInvalidWorkPlans() {
    return invalidWorkPlans;
  }
  public void setInvalidWorkPlans(List<WorkPlanReference> invalidWorkPlans) {
    this.invalidWorkPlans = invalidWorkPlans;
  }


  /**
   * Message for set of agent unavailable times violating work plan constraints
   **/
  public UnavailableTimesValidationResult workPlanConstraintsViolationMessage(WorkPlanConstraintsViolationMessage workPlanConstraintsViolationMessage) {
    this.workPlanConstraintsViolationMessage = workPlanConstraintsViolationMessage;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Message for set of agent unavailable times violating work plan constraints")
  @JsonProperty("workPlanConstraintsViolationMessage")
  public WorkPlanConstraintsViolationMessage getWorkPlanConstraintsViolationMessage() {
    return workPlanConstraintsViolationMessage;
  }
  public void setWorkPlanConstraintsViolationMessage(WorkPlanConstraintsViolationMessage workPlanConstraintsViolationMessage) {
    this.workPlanConstraintsViolationMessage = workPlanConstraintsViolationMessage;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UnavailableTimesValidationResult unavailableTimesValidationResult = (UnavailableTimesValidationResult) o;

    return Objects.equals(this.valid, unavailableTimesValidationResult.valid) &&
            Objects.equals(this.invalidWorkPlans, unavailableTimesValidationResult.invalidWorkPlans) &&
            Objects.equals(this.workPlanConstraintsViolationMessage, unavailableTimesValidationResult.workPlanConstraintsViolationMessage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(valid, invalidWorkPlans, workPlanConstraintsViolationMessage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UnavailableTimesValidationResult {\n");
    
    sb.append("    valid: ").append(toIndentedString(valid)).append("\n");
    sb.append("    invalidWorkPlans: ").append(toIndentedString(invalidWorkPlans)).append("\n");
    sb.append("    workPlanConstraintsViolationMessage: ").append(toIndentedString(workPlanConstraintsViolationMessage)).append("\n");
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

