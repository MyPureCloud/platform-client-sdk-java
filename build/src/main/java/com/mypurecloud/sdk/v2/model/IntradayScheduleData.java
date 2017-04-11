package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * IntradayScheduleData
 */

public class IntradayScheduleData  implements Serializable {
  
  private Integer onQueueTimeSeconds = null;
  private Integer scheduledTimeSeconds = null;

  
  /**
   * The total scheduled on-queue time in seconds for all agents in this group
   **/
  public IntradayScheduleData onQueueTimeSeconds(Integer onQueueTimeSeconds) {
    this.onQueueTimeSeconds = onQueueTimeSeconds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The total scheduled on-queue time in seconds for all agents in this group")
  @JsonProperty("onQueueTimeSeconds")
  public Integer getOnQueueTimeSeconds() {
    return onQueueTimeSeconds;
  }
  public void setOnQueueTimeSeconds(Integer onQueueTimeSeconds) {
    this.onQueueTimeSeconds = onQueueTimeSeconds;
  }


  /**
   * The total scheduled time in seconds for all agents in this group
   **/
  public IntradayScheduleData scheduledTimeSeconds(Integer scheduledTimeSeconds) {
    this.scheduledTimeSeconds = scheduledTimeSeconds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The total scheduled time in seconds for all agents in this group")
  @JsonProperty("scheduledTimeSeconds")
  public Integer getScheduledTimeSeconds() {
    return scheduledTimeSeconds;
  }
  public void setScheduledTimeSeconds(Integer scheduledTimeSeconds) {
    this.scheduledTimeSeconds = scheduledTimeSeconds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IntradayScheduleData intradayScheduleData = (IntradayScheduleData) o;
    return Objects.equals(this.onQueueTimeSeconds, intradayScheduleData.onQueueTimeSeconds) &&
        Objects.equals(this.scheduledTimeSeconds, intradayScheduleData.scheduledTimeSeconds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(onQueueTimeSeconds, scheduledTimeSeconds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IntradayScheduleData {\n");
    
    sb.append("    onQueueTimeSeconds: ").append(toIndentedString(onQueueTimeSeconds)).append("\n");
    sb.append("    scheduledTimeSeconds: ").append(toIndentedString(scheduledTimeSeconds)).append("\n");
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

