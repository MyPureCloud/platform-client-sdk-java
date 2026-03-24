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
import com.mypurecloud.sdk.v2.model.DayOfWeekMinimums;
import com.mypurecloud.sdk.v2.model.PlanningGroupReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * PlanningGroupMinimumsResponse
 */

public class PlanningGroupMinimumsResponse  implements Serializable {
  
  private PlanningGroupReference planningGroup = null;
  private List<DayOfWeekMinimums> dayOfWeekMinimums = null;

  public PlanningGroupMinimumsResponse() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      dayOfWeekMinimums = new ArrayList<DayOfWeekMinimums>();
    }
  }

  
  /**
   * The planning group to which the day of week minimum staff values apply
   **/
  public PlanningGroupMinimumsResponse planningGroup(PlanningGroupReference planningGroup) {
    this.planningGroup = planningGroup;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The planning group to which the day of week minimum staff values apply")
  @JsonProperty("planningGroup")
  public PlanningGroupReference getPlanningGroup() {
    return planningGroup;
  }
  public void setPlanningGroup(PlanningGroupReference planningGroup) {
    this.planningGroup = planningGroup;
  }


  /**
   * The list of day of week minimum staff values for this planning group
   **/
  public PlanningGroupMinimumsResponse dayOfWeekMinimums(List<DayOfWeekMinimums> dayOfWeekMinimums) {
    this.dayOfWeekMinimums = dayOfWeekMinimums;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The list of day of week minimum staff values for this planning group")
  @JsonProperty("dayOfWeekMinimums")
  public List<DayOfWeekMinimums> getDayOfWeekMinimums() {
    return dayOfWeekMinimums;
  }
  public void setDayOfWeekMinimums(List<DayOfWeekMinimums> dayOfWeekMinimums) {
    this.dayOfWeekMinimums = dayOfWeekMinimums;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PlanningGroupMinimumsResponse planningGroupMinimumsResponse = (PlanningGroupMinimumsResponse) o;

    return Objects.equals(this.planningGroup, planningGroupMinimumsResponse.planningGroup) &&
            Objects.equals(this.dayOfWeekMinimums, planningGroupMinimumsResponse.dayOfWeekMinimums);
  }

  @Override
  public int hashCode() {
    return Objects.hash(planningGroup, dayOfWeekMinimums);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PlanningGroupMinimumsResponse {\n");
    
    sb.append("    planningGroup: ").append(toIndentedString(planningGroup)).append("\n");
    sb.append("    dayOfWeekMinimums: ").append(toIndentedString(dayOfWeekMinimums)).append("\n");
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

