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
import java.math.BigDecimal;

import java.io.Serializable;
/**
 * WfmIntradayDataUpdateTopicIntradayHistoricalAgentData
 */

public class WfmIntradayDataUpdateTopicIntradayHistoricalAgentData  implements Serializable {
  
  private BigDecimal onQueueTimeSeconds = null;
  private BigDecimal interactingTimeSeconds = null;

  
  /**
   **/
  public WfmIntradayDataUpdateTopicIntradayHistoricalAgentData onQueueTimeSeconds(BigDecimal onQueueTimeSeconds) {
    this.onQueueTimeSeconds = onQueueTimeSeconds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("onQueueTimeSeconds")
  public BigDecimal getOnQueueTimeSeconds() {
    return onQueueTimeSeconds;
  }
  public void setOnQueueTimeSeconds(BigDecimal onQueueTimeSeconds) {
    this.onQueueTimeSeconds = onQueueTimeSeconds;
  }

  
  /**
   **/
  public WfmIntradayDataUpdateTopicIntradayHistoricalAgentData interactingTimeSeconds(BigDecimal interactingTimeSeconds) {
    this.interactingTimeSeconds = interactingTimeSeconds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("interactingTimeSeconds")
  public BigDecimal getInteractingTimeSeconds() {
    return interactingTimeSeconds;
  }
  public void setInteractingTimeSeconds(BigDecimal interactingTimeSeconds) {
    this.interactingTimeSeconds = interactingTimeSeconds;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WfmIntradayDataUpdateTopicIntradayHistoricalAgentData wfmIntradayDataUpdateTopicIntradayHistoricalAgentData = (WfmIntradayDataUpdateTopicIntradayHistoricalAgentData) o;
    return Objects.equals(this.onQueueTimeSeconds, wfmIntradayDataUpdateTopicIntradayHistoricalAgentData.onQueueTimeSeconds) &&
        Objects.equals(this.interactingTimeSeconds, wfmIntradayDataUpdateTopicIntradayHistoricalAgentData.interactingTimeSeconds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(onQueueTimeSeconds, interactingTimeSeconds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WfmIntradayDataUpdateTopicIntradayHistoricalAgentData {\n");
    
    sb.append("    onQueueTimeSeconds: ").append(toIndentedString(onQueueTimeSeconds)).append("\n");
    sb.append("    interactingTimeSeconds: ").append(toIndentedString(interactingTimeSeconds)).append("\n");
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

