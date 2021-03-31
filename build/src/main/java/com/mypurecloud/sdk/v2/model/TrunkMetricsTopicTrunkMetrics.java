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
import com.mypurecloud.sdk.v2.model.TrunkMetricsTopicTrunkMetricsCalls;
import com.mypurecloud.sdk.v2.model.TrunkMetricsTopicTrunkMetricsQoS;
import com.mypurecloud.sdk.v2.model.TrunkMetricsTopicUriReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * TrunkMetricsTopicTrunkMetrics
 */

public class TrunkMetricsTopicTrunkMetrics  implements Serializable {
  
  private TrunkMetricsTopicTrunkMetricsCalls calls = null;
  private TrunkMetricsTopicTrunkMetricsQoS qos = null;
  private TrunkMetricsTopicUriReference trunk = null;

  
  /**
   **/
  public TrunkMetricsTopicTrunkMetrics calls(TrunkMetricsTopicTrunkMetricsCalls calls) {
    this.calls = calls;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("calls")
  public TrunkMetricsTopicTrunkMetricsCalls getCalls() {
    return calls;
  }
  public void setCalls(TrunkMetricsTopicTrunkMetricsCalls calls) {
    this.calls = calls;
  }

  
  /**
   **/
  public TrunkMetricsTopicTrunkMetrics qos(TrunkMetricsTopicTrunkMetricsQoS qos) {
    this.qos = qos;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("qos")
  public TrunkMetricsTopicTrunkMetricsQoS getQos() {
    return qos;
  }
  public void setQos(TrunkMetricsTopicTrunkMetricsQoS qos) {
    this.qos = qos;
  }

  
  /**
   **/
  public TrunkMetricsTopicTrunkMetrics trunk(TrunkMetricsTopicUriReference trunk) {
    this.trunk = trunk;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("trunk")
  public TrunkMetricsTopicUriReference getTrunk() {
    return trunk;
  }
  public void setTrunk(TrunkMetricsTopicUriReference trunk) {
    this.trunk = trunk;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TrunkMetricsTopicTrunkMetrics trunkMetricsTopicTrunkMetrics = (TrunkMetricsTopicTrunkMetrics) o;
    return Objects.equals(this.calls, trunkMetricsTopicTrunkMetrics.calls) &&
        Objects.equals(this.qos, trunkMetricsTopicTrunkMetrics.qos) &&
        Objects.equals(this.trunk, trunkMetricsTopicTrunkMetrics.trunk);
  }

  @Override
  public int hashCode() {
    return Objects.hash(calls, qos, trunk);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TrunkMetricsTopicTrunkMetrics {\n");
    
    sb.append("    calls: ").append(toIndentedString(calls)).append("\n");
    sb.append("    qos: ").append(toIndentedString(qos)).append("\n");
    sb.append("    trunk: ").append(toIndentedString(trunk)).append("\n");
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

