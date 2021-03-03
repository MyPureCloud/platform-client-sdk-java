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

import java.io.Serializable;
/**
 * BuIntradayScheduleData
 */

public class BuIntradayScheduleData  implements Serializable {
  
  private Long onQueueTimeSeconds = null;

  
  /**
   * The total on-queue time in seconds for all agents in this group
   **/
  public BuIntradayScheduleData onQueueTimeSeconds(Long onQueueTimeSeconds) {
    this.onQueueTimeSeconds = onQueueTimeSeconds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The total on-queue time in seconds for all agents in this group")
  @JsonProperty("onQueueTimeSeconds")
  public Long getOnQueueTimeSeconds() {
    return onQueueTimeSeconds;
  }
  public void setOnQueueTimeSeconds(Long onQueueTimeSeconds) {
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
    BuIntradayScheduleData buIntradayScheduleData = (BuIntradayScheduleData) o;
    return Objects.equals(this.onQueueTimeSeconds, buIntradayScheduleData.onQueueTimeSeconds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(onQueueTimeSeconds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BuIntradayScheduleData {\n");
    
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

