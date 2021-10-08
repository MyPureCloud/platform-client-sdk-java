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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * LongTermForecastPlanningGroupData
 */

public class LongTermForecastPlanningGroupData  implements Serializable {
  
  private String planningGroupId = null;
  private List<Double> offeredPerDay = new ArrayList<Double>();
  private List<Double> averageHandleTimeSecondsPerDay = new ArrayList<Double>();

  
  /**
   * The ID of the planning group to which this data applies. Note this is a snapshot of the planning group at the time of forecast creation and may not correspond to the current configuration
   **/
  public LongTermForecastPlanningGroupData planningGroupId(String planningGroupId) {
    this.planningGroupId = planningGroupId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The ID of the planning group to which this data applies. Note this is a snapshot of the planning group at the time of forecast creation and may not correspond to the current configuration")
  @JsonProperty("planningGroupId")
  public String getPlanningGroupId() {
    return planningGroupId;
  }
  public void setPlanningGroupId(String planningGroupId) {
    this.planningGroupId = planningGroupId;
  }

  
  /**
   * Forecast offered counts per day for this planning group
   **/
  public LongTermForecastPlanningGroupData offeredPerDay(List<Double> offeredPerDay) {
    this.offeredPerDay = offeredPerDay;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Forecast offered counts per day for this planning group")
  @JsonProperty("offeredPerDay")
  public List<Double> getOfferedPerDay() {
    return offeredPerDay;
  }
  public void setOfferedPerDay(List<Double> offeredPerDay) {
    this.offeredPerDay = offeredPerDay;
  }

  
  /**
   * Forecast average handle time per day in seconds
   **/
  public LongTermForecastPlanningGroupData averageHandleTimeSecondsPerDay(List<Double> averageHandleTimeSecondsPerDay) {
    this.averageHandleTimeSecondsPerDay = averageHandleTimeSecondsPerDay;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Forecast average handle time per day in seconds")
  @JsonProperty("averageHandleTimeSecondsPerDay")
  public List<Double> getAverageHandleTimeSecondsPerDay() {
    return averageHandleTimeSecondsPerDay;
  }
  public void setAverageHandleTimeSecondsPerDay(List<Double> averageHandleTimeSecondsPerDay) {
    this.averageHandleTimeSecondsPerDay = averageHandleTimeSecondsPerDay;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LongTermForecastPlanningGroupData longTermForecastPlanningGroupData = (LongTermForecastPlanningGroupData) o;
    return Objects.equals(this.planningGroupId, longTermForecastPlanningGroupData.planningGroupId) &&
        Objects.equals(this.offeredPerDay, longTermForecastPlanningGroupData.offeredPerDay) &&
        Objects.equals(this.averageHandleTimeSecondsPerDay, longTermForecastPlanningGroupData.averageHandleTimeSecondsPerDay);
  }

  @Override
  public int hashCode() {
    return Objects.hash(planningGroupId, offeredPerDay, averageHandleTimeSecondsPerDay);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LongTermForecastPlanningGroupData {\n");
    
    sb.append("    planningGroupId: ").append(toIndentedString(planningGroupId)).append("\n");
    sb.append("    offeredPerDay: ").append(toIndentedString(offeredPerDay)).append("\n");
    sb.append("    averageHandleTimeSecondsPerDay: ").append(toIndentedString(averageHandleTimeSecondsPerDay)).append("\n");
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

