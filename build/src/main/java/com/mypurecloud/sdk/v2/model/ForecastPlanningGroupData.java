package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * ForecastPlanningGroupData
 */

public class ForecastPlanningGroupData  implements Serializable {
  
  private String planningGroupId = null;
  private List<Double> offeredPerInterval = new ArrayList<Double>();
  private List<Double> averageHandleTimeSecondsPerInterval = new ArrayList<Double>();

  
  /**
   * The id of the planning group to which this data applies
   **/
  public ForecastPlanningGroupData planningGroupId(String planningGroupId) {
    this.planningGroupId = planningGroupId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The id of the planning group to which this data applies")
  @JsonProperty("planningGroupId")
  public String getPlanningGroupId() {
    return planningGroupId;
  }
  public void setPlanningGroupId(String planningGroupId) {
    this.planningGroupId = planningGroupId;
  }

  
  /**
   * Forecast offered counts per interval for this week of the forecast
   **/
  public ForecastPlanningGroupData offeredPerInterval(List<Double> offeredPerInterval) {
    this.offeredPerInterval = offeredPerInterval;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Forecast offered counts per interval for this week of the forecast")
  @JsonProperty("offeredPerInterval")
  public List<Double> getOfferedPerInterval() {
    return offeredPerInterval;
  }
  public void setOfferedPerInterval(List<Double> offeredPerInterval) {
    this.offeredPerInterval = offeredPerInterval;
  }

  
  /**
   * Forecast average handle time per interval in seconds
   **/
  public ForecastPlanningGroupData averageHandleTimeSecondsPerInterval(List<Double> averageHandleTimeSecondsPerInterval) {
    this.averageHandleTimeSecondsPerInterval = averageHandleTimeSecondsPerInterval;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Forecast average handle time per interval in seconds")
  @JsonProperty("averageHandleTimeSecondsPerInterval")
  public List<Double> getAverageHandleTimeSecondsPerInterval() {
    return averageHandleTimeSecondsPerInterval;
  }
  public void setAverageHandleTimeSecondsPerInterval(List<Double> averageHandleTimeSecondsPerInterval) {
    this.averageHandleTimeSecondsPerInterval = averageHandleTimeSecondsPerInterval;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ForecastPlanningGroupData forecastPlanningGroupData = (ForecastPlanningGroupData) o;
    return Objects.equals(this.planningGroupId, forecastPlanningGroupData.planningGroupId) &&
        Objects.equals(this.offeredPerInterval, forecastPlanningGroupData.offeredPerInterval) &&
        Objects.equals(this.averageHandleTimeSecondsPerInterval, forecastPlanningGroupData.averageHandleTimeSecondsPerInterval);
  }

  @Override
  public int hashCode() {
    return Objects.hash(planningGroupId, offeredPerInterval, averageHandleTimeSecondsPerInterval);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ForecastPlanningGroupData {\n");
    
    sb.append("    planningGroupId: ").append(toIndentedString(planningGroupId)).append("\n");
    sb.append("    offeredPerInterval: ").append(toIndentedString(offeredPerInterval)).append("\n");
    sb.append("    averageHandleTimeSecondsPerInterval: ").append(toIndentedString(averageHandleTimeSecondsPerInterval)).append("\n");
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

