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
 * WfmIntradayDataUpdateTopicIntradayScheduleData
 */

public class WfmIntradayDataUpdateTopicIntradayScheduleData  implements Serializable {
  
  private Long onQueueTimeSeconds = null;
  private Long scheduledTimeSeconds = null;

  public WfmIntradayDataUpdateTopicIntradayScheduleData() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   **/
  public WfmIntradayDataUpdateTopicIntradayScheduleData onQueueTimeSeconds(Long onQueueTimeSeconds) {
    this.onQueueTimeSeconds = onQueueTimeSeconds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("onQueueTimeSeconds")
  public Long getOnQueueTimeSeconds() {
    return onQueueTimeSeconds;
  }
  public void setOnQueueTimeSeconds(Long onQueueTimeSeconds) {
    this.onQueueTimeSeconds = onQueueTimeSeconds;
  }


  /**
   **/
  public WfmIntradayDataUpdateTopicIntradayScheduleData scheduledTimeSeconds(Long scheduledTimeSeconds) {
    this.scheduledTimeSeconds = scheduledTimeSeconds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("scheduledTimeSeconds")
  public Long getScheduledTimeSeconds() {
    return scheduledTimeSeconds;
  }
  public void setScheduledTimeSeconds(Long scheduledTimeSeconds) {
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
    WfmIntradayDataUpdateTopicIntradayScheduleData wfmIntradayDataUpdateTopicIntradayScheduleData = (WfmIntradayDataUpdateTopicIntradayScheduleData) o;

    return Objects.equals(this.onQueueTimeSeconds, wfmIntradayDataUpdateTopicIntradayScheduleData.onQueueTimeSeconds) &&
            Objects.equals(this.scheduledTimeSeconds, wfmIntradayDataUpdateTopicIntradayScheduleData.scheduledTimeSeconds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(onQueueTimeSeconds, scheduledTimeSeconds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WfmIntradayDataUpdateTopicIntradayScheduleData {\n");
    
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

