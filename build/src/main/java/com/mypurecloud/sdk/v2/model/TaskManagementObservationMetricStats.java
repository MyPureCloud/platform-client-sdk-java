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

import java.io.Serializable;
/**
 * TaskManagementObservationMetricStats
 */

public class TaskManagementObservationMetricStats  implements Serializable {
  
  private Integer count = null;
  private Long max = null;

  public TaskManagementObservationMetricStats() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  public TaskManagementObservationMetricStats(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
    }
  }

  
  /**
   * The observed value for this metric
   **/
  public TaskManagementObservationMetricStats count(Integer count) {
    this.count = count;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The observed value for this metric")
  @JsonProperty("count")
  public Integer getCount() {
    return count;
  }
  public void setCount(Integer count) {
    this.count = count;
  }


  /**
   * The maximum observed value for this metric. Used for `oWorkitemOldestUnassigned` and  `oWorkitemOldestAssigned`
   **/
  public TaskManagementObservationMetricStats max(Long max) {
    this.max = max;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The maximum observed value for this metric. Used for `oWorkitemOldestUnassigned` and  `oWorkitemOldestAssigned`")
  @JsonProperty("max")
  public Long getMax() {
    return max;
  }
  public void setMax(Long max) {
    this.max = max;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TaskManagementObservationMetricStats taskManagementObservationMetricStats = (TaskManagementObservationMetricStats) o;

    return Objects.equals(this.count, taskManagementObservationMetricStats.count) &&
            Objects.equals(this.max, taskManagementObservationMetricStats.max);
  }

  @Override
  public int hashCode() {
    return Objects.hash(count, max);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaskManagementObservationMetricStats {\n");
    
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    max: ").append(toIndentedString(max)).append("\n");
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

