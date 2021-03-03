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
import java.util.Date;

import java.io.Serializable;
/**
 * TrunkMetricsRegisters
 */

public class TrunkMetricsRegisters  implements Serializable {
  
  private String proxyAddress = null;
  private Boolean registerState = null;
  private Date registerStateTime = null;
  private TrunkErrorInfo errorInfo = null;

  
  /**
   * Server proxy address that this registers array element represents.
   **/
  public TrunkMetricsRegisters proxyAddress(String proxyAddress) {
    this.proxyAddress = proxyAddress;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Server proxy address that this registers array element represents.")
  @JsonProperty("proxyAddress")
  public String getProxyAddress() {
    return proxyAddress;
  }
  public void setProxyAddress(String proxyAddress) {
    this.proxyAddress = proxyAddress;
  }

  
  /**
   * True if last REGISTER message had positive response; false if error response or no response.
   **/
  public TrunkMetricsRegisters registerState(Boolean registerState) {
    this.registerState = registerState;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "True if last REGISTER message had positive response; false if error response or no response.")
  @JsonProperty("registerState")
  public Boolean getRegisterState() {
    return registerState;
  }
  public void setRegisterState(Boolean registerState) {
    this.registerState = registerState;
  }

  
  /**
   * ISO 8601 format UTC absolute date & time of the last change of the register state.
   **/
  public TrunkMetricsRegisters registerStateTime(Date registerStateTime) {
    this.registerStateTime = registerStateTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "ISO 8601 format UTC absolute date & time of the last change of the register state.")
  @JsonProperty("registerStateTime")
  public Date getRegisterStateTime() {
    return registerStateTime;
  }
  public void setRegisterStateTime(Date registerStateTime) {
    this.registerStateTime = registerStateTime;
  }

  
  /**
   **/
  public TrunkMetricsRegisters errorInfo(TrunkErrorInfo errorInfo) {
    this.errorInfo = errorInfo;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
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
    TrunkMetricsRegisters trunkMetricsRegisters = (TrunkMetricsRegisters) o;
    return Objects.equals(this.proxyAddress, trunkMetricsRegisters.proxyAddress) &&
        Objects.equals(this.registerState, trunkMetricsRegisters.registerState) &&
        Objects.equals(this.registerStateTime, trunkMetricsRegisters.registerStateTime) &&
        Objects.equals(this.errorInfo, trunkMetricsRegisters.errorInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(proxyAddress, registerState, registerStateTime, errorInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TrunkMetricsRegisters {\n");
    
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

