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
 * TrunkMetricsOptions
 */

public class TrunkMetricsOptions  implements Serializable {
  
  private String proxyAddress = null;
  private Boolean optionState = null;
  private Date optionStateTime = null;
  private TrunkErrorInfo errorInfo = null;

  
  /**
   * Server proxy address that this options array element represents.
   **/
  public TrunkMetricsOptions proxyAddress(String proxyAddress) {
    this.proxyAddress = proxyAddress;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Server proxy address that this options array element represents.")
  @JsonProperty("proxyAddress")
  public String getProxyAddress() {
    return proxyAddress;
  }
  public void setProxyAddress(String proxyAddress) {
    this.proxyAddress = proxyAddress;
  }

  
  /**
   **/
  public TrunkMetricsOptions optionState(Boolean optionState) {
    this.optionState = optionState;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("optionState")
  public Boolean getOptionState() {
    return optionState;
  }
  public void setOptionState(Boolean optionState) {
    this.optionState = optionState;
  }

  
  /**
   * ISO 8601 format UTC absolute date & time of the last change of the option state.
   **/
  public TrunkMetricsOptions optionStateTime(Date optionStateTime) {
    this.optionStateTime = optionStateTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "ISO 8601 format UTC absolute date & time of the last change of the option state.")
  @JsonProperty("optionStateTime")
  public Date getOptionStateTime() {
    return optionStateTime;
  }
  public void setOptionStateTime(Date optionStateTime) {
    this.optionStateTime = optionStateTime;
  }

  
  /**
   **/
  public TrunkMetricsOptions errorInfo(TrunkErrorInfo errorInfo) {
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
    TrunkMetricsOptions trunkMetricsOptions = (TrunkMetricsOptions) o;
    return Objects.equals(this.proxyAddress, trunkMetricsOptions.proxyAddress) &&
        Objects.equals(this.optionState, trunkMetricsOptions.optionState) &&
        Objects.equals(this.optionStateTime, trunkMetricsOptions.optionStateTime) &&
        Objects.equals(this.errorInfo, trunkMetricsOptions.errorInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(proxyAddress, optionState, optionStateTime, errorInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TrunkMetricsOptions {\n");
    
    sb.append("    proxyAddress: ").append(toIndentedString(proxyAddress)).append("\n");
    sb.append("    optionState: ").append(toIndentedString(optionState)).append("\n");
    sb.append("    optionStateTime: ").append(toIndentedString(optionStateTime)).append("\n");
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

