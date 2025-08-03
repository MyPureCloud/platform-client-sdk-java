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
import com.mypurecloud.sdk.v2.model.LongTermRequirementsErrorDetail;
import com.mypurecloud.sdk.v2.model.LongTermRequirementsServiceGoalDetail;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * PlanningGroupRequirementOutput
 */

public class PlanningGroupRequirementOutput  implements Serializable {
  
  private String id = null;
  private List<Integer> intervals = null;
  private List<LongTermRequirementsErrorDetail> errorDetails = null;
  private LongTermRequirementsServiceGoalDetail serviceGoalDetails = null;

  public PlanningGroupRequirementOutput() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      intervals = new ArrayList<Integer>();
      errorDetails = new ArrayList<LongTermRequirementsErrorDetail>();
    }
  }

  
  /**
   * The ID of the planning group to which this output applies
   **/
  public PlanningGroupRequirementOutput id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The ID of the planning group to which this output applies")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }


  /**
   * List of interval values that correspond with the requirements granularity that was requested
   **/
  public PlanningGroupRequirementOutput intervals(List<Integer> intervals) {
    this.intervals = intervals;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "List of interval values that correspond with the requirements granularity that was requested")
  @JsonProperty("intervals")
  public List<Integer> getIntervals() {
    return intervals;
  }
  public void setIntervals(List<Integer> intervals) {
    this.intervals = intervals;
  }


  /**
   * Error details if the intervals cannot be provided for this planning group because of missing data or internal error
   **/
  public PlanningGroupRequirementOutput errorDetails(List<LongTermRequirementsErrorDetail> errorDetails) {
    this.errorDetails = errorDetails;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Error details if the intervals cannot be provided for this planning group because of missing data or internal error")
  @JsonProperty("errorDetails")
  public List<LongTermRequirementsErrorDetail> getErrorDetails() {
    return errorDetails;
  }
  public void setErrorDetails(List<LongTermRequirementsErrorDetail> errorDetails) {
    this.errorDetails = errorDetails;
  }


  /**
   * The service goal details used to generate the requirements
   **/
  public PlanningGroupRequirementOutput serviceGoalDetails(LongTermRequirementsServiceGoalDetail serviceGoalDetails) {
    this.serviceGoalDetails = serviceGoalDetails;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The service goal details used to generate the requirements")
  @JsonProperty("serviceGoalDetails")
  public LongTermRequirementsServiceGoalDetail getServiceGoalDetails() {
    return serviceGoalDetails;
  }
  public void setServiceGoalDetails(LongTermRequirementsServiceGoalDetail serviceGoalDetails) {
    this.serviceGoalDetails = serviceGoalDetails;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PlanningGroupRequirementOutput planningGroupRequirementOutput = (PlanningGroupRequirementOutput) o;

    return Objects.equals(this.id, planningGroupRequirementOutput.id) &&
            Objects.equals(this.intervals, planningGroupRequirementOutput.intervals) &&
            Objects.equals(this.errorDetails, planningGroupRequirementOutput.errorDetails) &&
            Objects.equals(this.serviceGoalDetails, planningGroupRequirementOutput.serviceGoalDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, intervals, errorDetails, serviceGoalDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PlanningGroupRequirementOutput {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    intervals: ").append(toIndentedString(intervals)).append("\n");
    sb.append("    errorDetails: ").append(toIndentedString(errorDetails)).append("\n");
    sb.append("    serviceGoalDetails: ").append(toIndentedString(serviceGoalDetails)).append("\n");
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

