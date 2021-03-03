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
 * TrunkMetricsTopicTrunkMetricsCalls
 */

public class TrunkMetricsTopicTrunkMetricsCalls  implements Serializable {
  
  private Integer inboundCallCount = null;
  private Integer outboundCallCount = null;

  
  /**
   **/
  public TrunkMetricsTopicTrunkMetricsCalls inboundCallCount(Integer inboundCallCount) {
    this.inboundCallCount = inboundCallCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("inboundCallCount")
  public Integer getInboundCallCount() {
    return inboundCallCount;
  }
  public void setInboundCallCount(Integer inboundCallCount) {
    this.inboundCallCount = inboundCallCount;
  }

  
  /**
   **/
  public TrunkMetricsTopicTrunkMetricsCalls outboundCallCount(Integer outboundCallCount) {
    this.outboundCallCount = outboundCallCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("outboundCallCount")
  public Integer getOutboundCallCount() {
    return outboundCallCount;
  }
  public void setOutboundCallCount(Integer outboundCallCount) {
    this.outboundCallCount = outboundCallCount;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TrunkMetricsTopicTrunkMetricsCalls trunkMetricsTopicTrunkMetricsCalls = (TrunkMetricsTopicTrunkMetricsCalls) o;
    return Objects.equals(this.inboundCallCount, trunkMetricsTopicTrunkMetricsCalls.inboundCallCount) &&
        Objects.equals(this.outboundCallCount, trunkMetricsTopicTrunkMetricsCalls.outboundCallCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(inboundCallCount, outboundCallCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TrunkMetricsTopicTrunkMetricsCalls {\n");
    
    sb.append("    inboundCallCount: ").append(toIndentedString(inboundCallCount)).append("\n");
    sb.append("    outboundCallCount: ").append(toIndentedString(outboundCallCount)).append("\n");
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

