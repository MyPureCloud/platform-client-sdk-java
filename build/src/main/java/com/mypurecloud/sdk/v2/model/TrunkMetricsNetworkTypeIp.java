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
import com.mypurecloud.sdk.v2.model.TrunkErrorInfo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * TrunkMetricsNetworkTypeIp
 */

public class TrunkMetricsNetworkTypeIp  implements Serializable {
  
  private String address = null;
  private TrunkErrorInfo errorInfo = null;

  
  /**
   * Assigned IP Address for the interface
   **/
  public TrunkMetricsNetworkTypeIp address(String address) {
    this.address = address;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Assigned IP Address for the interface")
  @JsonProperty("address")
  public String getAddress() {
    return address;
  }
  public void setAddress(String address) {
    this.address = address;
  }

  
  /**
   * Information about the error.
   **/
  public TrunkMetricsNetworkTypeIp errorInfo(TrunkErrorInfo errorInfo) {
    this.errorInfo = errorInfo;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Information about the error.")
  @JsonProperty("errorInfo")
  public TrunkErrorInfo getErrorInfo() {
    return errorInfo;
  }
  public void setErrorInfo(TrunkErrorInfo errorInfo) {
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
    TrunkMetricsNetworkTypeIp trunkMetricsNetworkTypeIp = (TrunkMetricsNetworkTypeIp) o;
    return Objects.equals(this.address, trunkMetricsNetworkTypeIp.address) &&
        Objects.equals(this.errorInfo, trunkMetricsNetworkTypeIp.errorInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(address, errorInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TrunkMetricsNetworkTypeIp {\n");
    
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

