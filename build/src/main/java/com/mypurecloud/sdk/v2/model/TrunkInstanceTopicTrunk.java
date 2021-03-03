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
import com.mypurecloud.sdk.v2.model.TrunkInstanceTopicTrunkConnectedStatus;
import com.mypurecloud.sdk.v2.model.TrunkInstanceTopicTrunkMetricsNetworkTypeIp;
import com.mypurecloud.sdk.v2.model.TrunkInstanceTopicTrunkMetricsOptions;
import com.mypurecloud.sdk.v2.model.TrunkInstanceTopicTrunkMetricsRegisters;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * TrunkInstanceTopicTrunk
 */

public class TrunkInstanceTopicTrunk  implements Serializable {
  
  private String id = null;
  private TrunkInstanceTopicTrunkConnectedStatus connectedStatus = null;
  private List<TrunkInstanceTopicTrunkMetricsOptions> optionsStatus = new ArrayList<TrunkInstanceTopicTrunkMetricsOptions>();
  private List<TrunkInstanceTopicTrunkMetricsRegisters> registersStatus = new ArrayList<TrunkInstanceTopicTrunkMetricsRegisters>();
  private TrunkInstanceTopicTrunkMetricsNetworkTypeIp ipStatus = null;

  
  /**
   **/
  public TrunkInstanceTopicTrunk id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  
  /**
   **/
  public TrunkInstanceTopicTrunk connectedStatus(TrunkInstanceTopicTrunkConnectedStatus connectedStatus) {
    this.connectedStatus = connectedStatus;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("connectedStatus")
  public TrunkInstanceTopicTrunkConnectedStatus getConnectedStatus() {
    return connectedStatus;
  }
  public void setConnectedStatus(TrunkInstanceTopicTrunkConnectedStatus connectedStatus) {
    this.connectedStatus = connectedStatus;
  }

  
  /**
   **/
  public TrunkInstanceTopicTrunk optionsStatus(List<TrunkInstanceTopicTrunkMetricsOptions> optionsStatus) {
    this.optionsStatus = optionsStatus;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("optionsStatus")
  public List<TrunkInstanceTopicTrunkMetricsOptions> getOptionsStatus() {
    return optionsStatus;
  }
  public void setOptionsStatus(List<TrunkInstanceTopicTrunkMetricsOptions> optionsStatus) {
    this.optionsStatus = optionsStatus;
  }

  
  /**
   **/
  public TrunkInstanceTopicTrunk registersStatus(List<TrunkInstanceTopicTrunkMetricsRegisters> registersStatus) {
    this.registersStatus = registersStatus;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("registersStatus")
  public List<TrunkInstanceTopicTrunkMetricsRegisters> getRegistersStatus() {
    return registersStatus;
  }
  public void setRegistersStatus(List<TrunkInstanceTopicTrunkMetricsRegisters> registersStatus) {
    this.registersStatus = registersStatus;
  }

  
  /**
   **/
  public TrunkInstanceTopicTrunk ipStatus(TrunkInstanceTopicTrunkMetricsNetworkTypeIp ipStatus) {
    this.ipStatus = ipStatus;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("ipStatus")
  public TrunkInstanceTopicTrunkMetricsNetworkTypeIp getIpStatus() {
    return ipStatus;
  }
  public void setIpStatus(TrunkInstanceTopicTrunkMetricsNetworkTypeIp ipStatus) {
    this.ipStatus = ipStatus;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TrunkInstanceTopicTrunk trunkInstanceTopicTrunk = (TrunkInstanceTopicTrunk) o;
    return Objects.equals(this.id, trunkInstanceTopicTrunk.id) &&
        Objects.equals(this.connectedStatus, trunkInstanceTopicTrunk.connectedStatus) &&
        Objects.equals(this.optionsStatus, trunkInstanceTopicTrunk.optionsStatus) &&
        Objects.equals(this.registersStatus, trunkInstanceTopicTrunk.registersStatus) &&
        Objects.equals(this.ipStatus, trunkInstanceTopicTrunk.ipStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, connectedStatus, optionsStatus, registersStatus, ipStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TrunkInstanceTopicTrunk {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    connectedStatus: ").append(toIndentedString(connectedStatus)).append("\n");
    sb.append("    optionsStatus: ").append(toIndentedString(optionsStatus)).append("\n");
    sb.append("    registersStatus: ").append(toIndentedString(registersStatus)).append("\n");
    sb.append("    ipStatus: ").append(toIndentedString(ipStatus)).append("\n");
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

