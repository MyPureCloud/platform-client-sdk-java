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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * AllocationResultsTemplate
 */

public class AllocationResultsTemplate  implements Serializable {
  
  private String planningGroupId = null;
  private List<Double> assignedAgentsPerInterval = null;
  private List<Double> headcountMultiplierPerInterval = null;

  public AllocationResultsTemplate() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      assignedAgentsPerInterval = new ArrayList<Double>();
      headcountMultiplierPerInterval = new ArrayList<Double>();
    }
  }

  public AllocationResultsTemplate(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
      assignedAgentsPerInterval = new ArrayList<Double>();
      headcountMultiplierPerInterval = new ArrayList<Double>();
    }
  }

  
  /**
   * The ID of the associated planning group
   **/
  public AllocationResultsTemplate planningGroupId(String planningGroupId) {
    this.planningGroupId = planningGroupId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The ID of the associated planning group")
  @JsonProperty("planningGroupId")
  public String getPlanningGroupId() {
    return planningGroupId;
  }
  public void setPlanningGroupId(String planningGroupId) {
    this.planningGroupId = planningGroupId;
  }


  /**
   * Assigned agent allocation per interval used to generate the performance prediction
   **/
  public AllocationResultsTemplate assignedAgentsPerInterval(List<Double> assignedAgentsPerInterval) {
    this.assignedAgentsPerInterval = assignedAgentsPerInterval;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Assigned agent allocation per interval used to generate the performance prediction")
  @JsonProperty("assignedAgentsPerInterval")
  public List<Double> getAssignedAgentsPerInterval() {
    return assignedAgentsPerInterval;
  }
  public void setAssignedAgentsPerInterval(List<Double> assignedAgentsPerInterval) {
    this.assignedAgentsPerInterval = assignedAgentsPerInterval;
  }


  /**
   * Headcount multiplier per interval used to generate the performance prediction
   **/
  public AllocationResultsTemplate headcountMultiplierPerInterval(List<Double> headcountMultiplierPerInterval) {
    this.headcountMultiplierPerInterval = headcountMultiplierPerInterval;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Headcount multiplier per interval used to generate the performance prediction")
  @JsonProperty("headcountMultiplierPerInterval")
  public List<Double> getHeadcountMultiplierPerInterval() {
    return headcountMultiplierPerInterval;
  }
  public void setHeadcountMultiplierPerInterval(List<Double> headcountMultiplierPerInterval) {
    this.headcountMultiplierPerInterval = headcountMultiplierPerInterval;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AllocationResultsTemplate allocationResultsTemplate = (AllocationResultsTemplate) o;

    return Objects.equals(this.planningGroupId, allocationResultsTemplate.planningGroupId) &&
            Objects.equals(this.assignedAgentsPerInterval, allocationResultsTemplate.assignedAgentsPerInterval) &&
            Objects.equals(this.headcountMultiplierPerInterval, allocationResultsTemplate.headcountMultiplierPerInterval);
  }

  @Override
  public int hashCode() {
    return Objects.hash(planningGroupId, assignedAgentsPerInterval, headcountMultiplierPerInterval);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AllocationResultsTemplate {\n");
    
    sb.append("    planningGroupId: ").append(toIndentedString(planningGroupId)).append("\n");
    sb.append("    assignedAgentsPerInterval: ").append(toIndentedString(assignedAgentsPerInterval)).append("\n");
    sb.append("    headcountMultiplierPerInterval: ").append(toIndentedString(headcountMultiplierPerInterval)).append("\n");
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

