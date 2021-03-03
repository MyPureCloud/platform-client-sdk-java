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
 * TrunkMetricsQoS
 */

public class TrunkMetricsQoS  implements Serializable {
  
  private Integer mismatchCount = null;

  
  /**
   * Total number of QoS mismatches over the course of the last 24-hour period (sliding window).
   **/
  public TrunkMetricsQoS mismatchCount(Integer mismatchCount) {
    this.mismatchCount = mismatchCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Total number of QoS mismatches over the course of the last 24-hour period (sliding window).")
  @JsonProperty("mismatchCount")
  public Integer getMismatchCount() {
    return mismatchCount;
  }
  public void setMismatchCount(Integer mismatchCount) {
    this.mismatchCount = mismatchCount;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TrunkMetricsQoS trunkMetricsQoS = (TrunkMetricsQoS) o;
    return Objects.equals(this.mismatchCount, trunkMetricsQoS.mismatchCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mismatchCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TrunkMetricsQoS {\n");
    
    sb.append("    mismatchCount: ").append(toIndentedString(mismatchCount)).append("\n");
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

