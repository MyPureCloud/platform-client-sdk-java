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
import java.util.Date;

import java.io.Serializable;
/**
 * TrunkInstanceTopicTrunkMetricsRegisters
 */

public class TrunkInstanceTopicTrunkMetricsRegisters  implements Serializable {
  
  private String proxyAddress = null;
  private Boolean registerState = null;
  private Date registerStateTime = null;
  private TrunkInstanceTopicTrunkErrorInfo errorInfo = null;

  
  /**
   **/
  public TrunkInstanceTopicTrunkMetricsRegisters proxyAddress(String proxyAddress) {
    this.proxyAddress = proxyAddress;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("proxyAddress")
  public String getProxyAddress() {
    return proxyAddress;
  }
  public void setProxyAddress(String proxyAddress) {
    this.proxyAddress = proxyAddress;
  }

  
  /**
   **/
  public TrunkInstanceTopicTrunkMetricsRegisters registerState(Boolean registerState) {
    this.registerState = registerState;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("registerState")
  public Boolean getRegisterState() {
    return registerState;
  }
  public void setRegisterState(Boolean registerState) {
    this.registerState = registerState;
  }

  
  /**
   **/
  public TrunkInstanceTopicTrunkMetricsRegisters registerStateTime(Date registerStateTime) {
    this.registerStateTime = registerStateTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("registerStateTime")
  public Date getRegisterStateTime() {
    return registerStateTime;
  }
  public void setRegisterStateTime(Date registerStateTime) {
    this.registerStateTime = registerStateTime;
  }

  
  /**
   **/
  public TrunkInstanceTopicTrunkMetricsRegisters errorInfo(TrunkInstanceTopicTrunkErrorInfo errorInfo) {
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
    TrunkInstanceTopicTrunkMetricsRegisters trunkInstanceTopicTrunkMetricsRegisters = (TrunkInstanceTopicTrunkMetricsRegisters) o;
    return Objects.equals(this.proxyAddress, trunkInstanceTopicTrunkMetricsRegisters.proxyAddress) &&
        Objects.equals(this.registerState, trunkInstanceTopicTrunkMetricsRegisters.registerState) &&
        Objects.equals(this.registerStateTime, trunkInstanceTopicTrunkMetricsRegisters.registerStateTime) &&
        Objects.equals(this.errorInfo, trunkInstanceTopicTrunkMetricsRegisters.errorInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(proxyAddress, registerState, registerStateTime, errorInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TrunkInstanceTopicTrunkMetricsRegisters {\n");
    
    sb.append("    proxyAddress: ").append(toIndentedString(proxyAddress)).append("\n");
    sb.append("    registerState: ").append(toIndentedString(registerState)).append("\n");
    sb.append("    registerStateTime: ").append(toIndentedString(registerStateTime)).append("\n");
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

