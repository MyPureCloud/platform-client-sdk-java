package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * Scheduling Settings
 */
@ApiModel(description = "Scheduling Settings")

public class SchedulingSettings  implements Serializable {
  
  private Integer maxOccupancyPercentForDeferredWork = null;
  private Double defaultShrinkagePercent = null;

  
  /**
   * Max occupancy percent for deferred work
   **/
  public SchedulingSettings maxOccupancyPercentForDeferredWork(Integer maxOccupancyPercentForDeferredWork) {
    this.maxOccupancyPercentForDeferredWork = maxOccupancyPercentForDeferredWork;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Max occupancy percent for deferred work")
  @JsonProperty("maxOccupancyPercentForDeferredWork")
  public Integer getMaxOccupancyPercentForDeferredWork() {
    return maxOccupancyPercentForDeferredWork;
  }
  public void setMaxOccupancyPercentForDeferredWork(Integer maxOccupancyPercentForDeferredWork) {
    this.maxOccupancyPercentForDeferredWork = maxOccupancyPercentForDeferredWork;
  }

  
  /**
   * Default shrinkage percent for scheduling
   **/
  public SchedulingSettings defaultShrinkagePercent(Double defaultShrinkagePercent) {
    this.defaultShrinkagePercent = defaultShrinkagePercent;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Default shrinkage percent for scheduling")
  @JsonProperty("defaultShrinkagePercent")
  public Double getDefaultShrinkagePercent() {
    return defaultShrinkagePercent;
  }
  public void setDefaultShrinkagePercent(Double defaultShrinkagePercent) {
    this.defaultShrinkagePercent = defaultShrinkagePercent;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SchedulingSettings schedulingSettings = (SchedulingSettings) o;
    return Objects.equals(this.maxOccupancyPercentForDeferredWork, schedulingSettings.maxOccupancyPercentForDeferredWork) &&
        Objects.equals(this.defaultShrinkagePercent, schedulingSettings.defaultShrinkagePercent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maxOccupancyPercentForDeferredWork, defaultShrinkagePercent);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SchedulingSettings {\n");
    
    sb.append("    maxOccupancyPercentForDeferredWork: ").append(toIndentedString(maxOccupancyPercentForDeferredWork)).append("\n");
    sb.append("    defaultShrinkagePercent: ").append(toIndentedString(defaultShrinkagePercent)).append("\n");
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

