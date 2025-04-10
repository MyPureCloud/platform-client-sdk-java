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
 * TrunkMetricsTopicTrunkMetricsQoS
 */

public class TrunkMetricsTopicTrunkMetricsQoS  implements Serializable {
  
  private Long mismatchCount = null;

  public TrunkMetricsTopicTrunkMetricsQoS() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   **/
  public TrunkMetricsTopicTrunkMetricsQoS mismatchCount(Long mismatchCount) {
    this.mismatchCount = mismatchCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("mismatchCount")
  public Long getMismatchCount() {
    return mismatchCount;
  }
  public void setMismatchCount(Long mismatchCount) {
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
    TrunkMetricsTopicTrunkMetricsQoS trunkMetricsTopicTrunkMetricsQoS = (TrunkMetricsTopicTrunkMetricsQoS) o;

    return Objects.equals(this.mismatchCount, trunkMetricsTopicTrunkMetricsQoS.mismatchCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mismatchCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TrunkMetricsTopicTrunkMetricsQoS {\n");
    
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

