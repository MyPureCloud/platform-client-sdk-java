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
import com.mypurecloud.sdk.v2.model.TrunkInstanceTopicTrunkErrorInfo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * TrunkInstanceTopicTrunkMetricsNetworkTypeIp
 */

public class TrunkInstanceTopicTrunkMetricsNetworkTypeIp  implements Serializable {
  
  private String address = null;
  private TrunkInstanceTopicTrunkErrorInfo errorInfo = null;

  
  /**
   **/
  public TrunkInstanceTopicTrunkMetricsNetworkTypeIp address(String address) {
    this.address = address;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("address")
  public String getAddress() {
    return address;
  }
  public void setAddress(String address) {
    this.address = address;
  }

  
  /**
   **/
  public TrunkInstanceTopicTrunkMetricsNetworkTypeIp errorInfo(TrunkInstanceTopicTrunkErrorInfo errorInfo) {
    this.errorInfo = errorInfo;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("errorInfo")
  public TrunkInstanceTopicTrunkErrorInfo getErrorInfo() {
    return errorInfo;
  }
  public void setErrorInfo(TrunkInstanceTopicTrunkErrorInfo errorInfo) {
    this.errorInfo = errorInfo;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TrunkInstanceTopicTrunkMetricsNetworkTypeIp trunkInstanceTopicTrunkMetricsNetworkTypeIp = (TrunkInstanceTopicTrunkMetricsNetworkTypeIp) o;
    return Objects.equals(this.address, trunkInstanceTopicTrunkMetricsNetworkTypeIp.address) &&
        Objects.equals(this.errorInfo, trunkInstanceTopicTrunkMetricsNetworkTypeIp.errorInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(address, errorInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TrunkInstanceTopicTrunkMetricsNetworkTypeIp {\n");
    
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    errorInfo: ").append(toIndentedString(errorInfo)).append("\n");
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

