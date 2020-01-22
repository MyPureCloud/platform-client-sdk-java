package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * WfmBuIntradayDataUpdateTopicBuIntradayScheduleData
 */

public class WfmBuIntradayDataUpdateTopicBuIntradayScheduleData  implements Serializable {
  
  private Integer onQueueTimeSeconds = null;

  
  /**
   **/
  public WfmBuIntradayDataUpdateTopicBuIntradayScheduleData onQueueTimeSeconds(Integer onQueueTimeSeconds) {
    this.onQueueTimeSeconds = onQueueTimeSeconds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("onQueueTimeSeconds")
  public Integer getOnQueueTimeSeconds() {
    return onQueueTimeSeconds;
  }
  public void setOnQueueTimeSeconds(Integer onQueueTimeSeconds) {
    this.onQueueTimeSeconds = onQueueTimeSeconds;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WfmBuIntradayDataUpdateTopicBuIntradayScheduleData wfmBuIntradayDataUpdateTopicBuIntradayScheduleData = (WfmBuIntradayDataUpdateTopicBuIntradayScheduleData) o;
    return Objects.equals(this.onQueueTimeSeconds, wfmBuIntradayDataUpdateTopicBuIntradayScheduleData.onQueueTimeSeconds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(onQueueTimeSeconds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WfmBuIntradayDataUpdateTopicBuIntradayScheduleData {\n");
    
    sb.append("    onQueueTimeSeconds: ").append(toIndentedString(onQueueTimeSeconds)).append("\n");
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

