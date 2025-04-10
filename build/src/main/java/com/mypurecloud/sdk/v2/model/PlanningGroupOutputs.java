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
 * PlanningGroupOutputs
 */

public class PlanningGroupOutputs  implements Serializable {
  
  private String planningGroupId = null;
  private List<Double> serviceLevelPerInterval = null;
  private List<Double> occupancyPerInterval = null;
  private List<Double> averageSpeedOfAnswerSecondsPerInterval = null;
  private List<Double> abandonRatePerInterval = null;

  public PlanningGroupOutputs() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      serviceLevelPerInterval = new ArrayList<Double>();
      occupancyPerInterval = new ArrayList<Double>();
      averageSpeedOfAnswerSecondsPerInterval = new ArrayList<Double>();
      abandonRatePerInterval = new ArrayList<Double>();
    }
  }

  
  /**
   * The ID for for the associated planning group result
   **/
  public PlanningGroupOutputs planningGroupId(String planningGroupId) {
    this.planningGroupId = planningGroupId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The ID for for the associated planning group result")
  @JsonProperty("planningGroupId")
  public String getPlanningGroupId() {
    return planningGroupId;
  }
  public void setPlanningGroupId(String planningGroupId) {
    this.planningGroupId = planningGroupId;
  }


  /**
   * List of Service Level percentage (0.0-100.0) results per interval
   **/
  public PlanningGroupOutputs serviceLevelPerInterval(List<Double> serviceLevelPerInterval) {
    this.serviceLevelPerInterval = serviceLevelPerInterval;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "List of Service Level percentage (0.0-100.0) results per interval")
  @JsonProperty("serviceLevelPerInterval")
  public List<Double> getServiceLevelPerInterval() {
    return serviceLevelPerInterval;
  }
  public void setServiceLevelPerInterval(List<Double> serviceLevelPerInterval) {
    this.serviceLevelPerInterval = serviceLevelPerInterval;
  }


  /**
   * List of Occupancy percentage (0.0-100.0) results per interval
   **/
  public PlanningGroupOutputs occupancyPerInterval(List<Double> occupancyPerInterval) {
    this.occupancyPerInterval = occupancyPerInterval;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "List of Occupancy percentage (0.0-100.0) results per interval")
  @JsonProperty("occupancyPerInterval")
  public List<Double> getOccupancyPerInterval() {
    return occupancyPerInterval;
  }
  public void setOccupancyPerInterval(List<Double> occupancyPerInterval) {
    this.occupancyPerInterval = occupancyPerInterval;
  }


  /**
   * List of Average Speed of Answer (in seconds) results per interval
   **/
  public PlanningGroupOutputs averageSpeedOfAnswerSecondsPerInterval(List<Double> averageSpeedOfAnswerSecondsPerInterval) {
    this.averageSpeedOfAnswerSecondsPerInterval = averageSpeedOfAnswerSecondsPerInterval;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "List of Average Speed of Answer (in seconds) results per interval")
  @JsonProperty("averageSpeedOfAnswerSecondsPerInterval")
  public List<Double> getAverageSpeedOfAnswerSecondsPerInterval() {
    return averageSpeedOfAnswerSecondsPerInterval;
  }
  public void setAverageSpeedOfAnswerSecondsPerInterval(List<Double> averageSpeedOfAnswerSecondsPerInterval) {
    this.averageSpeedOfAnswerSecondsPerInterval = averageSpeedOfAnswerSecondsPerInterval;
  }


  /**
   * List of Abandon rate percentage (0.0-100.0) results per interval
   **/
  public PlanningGroupOutputs abandonRatePerInterval(List<Double> abandonRatePerInterval) {
    this.abandonRatePerInterval = abandonRatePerInterval;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "List of Abandon rate percentage (0.0-100.0) results per interval")
  @JsonProperty("abandonRatePerInterval")
  public List<Double> getAbandonRatePerInterval() {
    return abandonRatePerInterval;
  }
  public void setAbandonRatePerInterval(List<Double> abandonRatePerInterval) {
    this.abandonRatePerInterval = abandonRatePerInterval;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PlanningGroupOutputs planningGroupOutputs = (PlanningGroupOutputs) o;

    return Objects.equals(this.planningGroupId, planningGroupOutputs.planningGroupId) &&
            Objects.equals(this.serviceLevelPerInterval, planningGroupOutputs.serviceLevelPerInterval) &&
            Objects.equals(this.occupancyPerInterval, planningGroupOutputs.occupancyPerInterval) &&
            Objects.equals(this.averageSpeedOfAnswerSecondsPerInterval, planningGroupOutputs.averageSpeedOfAnswerSecondsPerInterval) &&
            Objects.equals(this.abandonRatePerInterval, planningGroupOutputs.abandonRatePerInterval);
  }

  @Override
  public int hashCode() {
    return Objects.hash(planningGroupId, serviceLevelPerInterval, occupancyPerInterval, averageSpeedOfAnswerSecondsPerInterval, abandonRatePerInterval);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PlanningGroupOutputs {\n");
    
    sb.append("    planningGroupId: ").append(toIndentedString(planningGroupId)).append("\n");
    sb.append("    serviceLevelPerInterval: ").append(toIndentedString(serviceLevelPerInterval)).append("\n");
    sb.append("    occupancyPerInterval: ").append(toIndentedString(occupancyPerInterval)).append("\n");
    sb.append("    averageSpeedOfAnswerSecondsPerInterval: ").append(toIndentedString(averageSpeedOfAnswerSecondsPerInterval)).append("\n");
    sb.append("    abandonRatePerInterval: ").append(toIndentedString(abandonRatePerInterval)).append("\n");
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

