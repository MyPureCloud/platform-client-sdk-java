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
import java.util.Date;

import java.io.Serializable;
/**
 * TrunkInstanceTopicTrunkConnectedStatus
 */

public class TrunkInstanceTopicTrunkConnectedStatus  implements Serializable {
  
  private Boolean connected = null;
  private Date connectedStateTime = null;

  
  /**
   **/
  public TrunkInstanceTopicTrunkConnectedStatus connected(Boolean connected) {
    this.connected = connected;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("connected")
  public Boolean getConnected() {
    return connected;
  }
  public void setConnected(Boolean connected) {
    this.connected = connected;
  }

  
  /**
   **/
  public TrunkInstanceTopicTrunkConnectedStatus connectedStateTime(Date connectedStateTime) {
    this.connectedStateTime = connectedStateTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("connectedStateTime")
  public Date getConnectedStateTime() {
    return connectedStateTime;
  }
  public void setConnectedStateTime(Date connectedStateTime) {
    this.connectedStateTime = connectedStateTime;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TrunkInstanceTopicTrunkConnectedStatus trunkInstanceTopicTrunkConnectedStatus = (TrunkInstanceTopicTrunkConnectedStatus) o;
    return Objects.equals(this.connected, trunkInstanceTopicTrunkConnectedStatus.connected) &&
        Objects.equals(this.connectedStateTime, trunkInstanceTopicTrunkConnectedStatus.connectedStateTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(connected, connectedStateTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TrunkInstanceTopicTrunkConnectedStatus {\n");
    
    sb.append("    connected: ").append(toIndentedString(connected)).append("\n");
    sb.append("    connectedStateTime: ").append(toIndentedString(connectedStateTime)).append("\n");
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

