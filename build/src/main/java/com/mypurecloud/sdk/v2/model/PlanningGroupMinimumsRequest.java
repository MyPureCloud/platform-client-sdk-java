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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * PlanningGroupMinimumsRequest
 */

public class PlanningGroupMinimumsRequest  implements Serializable {
  
  private String planningGroupId = null;
  private List<DayOfWeekMinimums> dayOfWeekMinimums = null;

  public PlanningGroupMinimumsRequest() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      dayOfWeekMinimums = new ArrayList<DayOfWeekMinimums>();
    }
  }

  
  /**
   * The ID of the planning group to which the day of week minimum staff values apply
   **/
  public PlanningGroupMinimumsRequest planningGroupId(String planningGroupId) {
    this.planningGroupId = planningGroupId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The ID of the planning group to which the day of week minimum staff values apply")
  @JsonProperty("planningGroupId")
  public String getPlanningGroupId() {
    return planningGroupId;
  }
  public void setPlanningGroupId(String planningGroupId) {
    this.planningGroupId = planningGroupId;
  }


  /**
   * The list of day of week minimum staff values for this planning group
   **/
  public PlanningGroupMinimumsRequest dayOfWeekMinimums(List<DayOfWeekMinimums> dayOfWeekMinimums) {
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
    PlanningGroupMinimumsRequest planningGroupMinimumsRequest = (PlanningGroupMinimumsRequest) o;

    return Objects.equals(this.planningGroupId, planningGroupMinimumsRequest.planningGroupId) &&
            Objects.equals(this.dayOfWeekMinimums, planningGroupMinimumsRequest.dayOfWeekMinimums);
  }

  @Override
  public int hashCode() {
    return Objects.hash(planningGroupId, dayOfWeekMinimums);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PlanningGroupMinimumsRequest {\n");
    
    sb.append("    planningGroupId: ").append(toIndentedString(planningGroupId)).append("\n");
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

