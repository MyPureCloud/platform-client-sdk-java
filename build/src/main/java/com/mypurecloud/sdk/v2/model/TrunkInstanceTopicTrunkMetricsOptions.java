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
 * TrunkInstanceTopicTrunkMetricsOptions
 */

public class TrunkInstanceTopicTrunkMetricsOptions  implements Serializable {
  
  private String proxyAddress = null;
  private Boolean optionState = null;
  private Date optionStateTime = null;
  private TrunkInstanceTopicTrunkErrorInfo errorInfo = null;

  
  /**
   **/
  public TrunkInstanceTopicTrunkMetricsOptions proxyAddress(String proxyAddress) {
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
  public TrunkInstanceTopicTrunkMetricsOptions optionState(Boolean optionState) {
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
   **/
  public TrunkInstanceTopicTrunkMetricsOptions optionStateTime(Date optionStateTime) {
    this.optionStateTime = optionStateTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("optionStateTime")
  public Date getOptionStateTime() {
    return optionStateTime;
  }
  public void setOptionStateTime(Date optionStateTime) {
    this.optionStateTime = optionStateTime;
  }

  
  /**
   **/
  public TrunkInstanceTopicTrunkMetricsOptions errorInfo(TrunkInstanceTopicTrunkErrorInfo errorInfo) {
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
    TrunkInstanceTopicTrunkMetricsOptions trunkInstanceTopicTrunkMetricsOptions = (TrunkInstanceTopicTrunkMetricsOptions) o;
    return Objects.equals(this.proxyAddress, trunkInstanceTopicTrunkMetricsOptions.proxyAddress) &&
        Objects.equals(this.optionState, trunkInstanceTopicTrunkMetricsOptions.optionState) &&
        Objects.equals(this.optionStateTime, trunkInstanceTopicTrunkMetricsOptions.optionStateTime) &&
        Objects.equals(this.errorInfo, trunkInstanceTopicTrunkMetricsOptions.errorInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(proxyAddress, optionState, optionStateTime, errorInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TrunkInstanceTopicTrunkMetricsOptions {\n");
    
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

