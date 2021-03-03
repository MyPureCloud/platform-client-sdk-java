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
 * EdgeServiceStateRequest
 */

public class EdgeServiceStateRequest  implements Serializable {
  
  private Boolean inService = null;
  private Integer callDrainingWaitTimeSeconds = null;

  
  /**
   * A boolean that sets the Edge in-service or out-of-service.
   **/
  public EdgeServiceStateRequest inService(Boolean inService) {
    this.inService = inService;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "A boolean that sets the Edge in-service or out-of-service.")
  @JsonProperty("inService")
  public Boolean getInService() {
    return inService;
  }
  public void setInService(Boolean inService) {
    this.inService = inService;
  }

  
  /**
   * The number of seconds to wait for call draining to complete before initiating the reboot. A value of 0 will prevent call draining and all calls will disconnect immediately.
   **/
  public EdgeServiceStateRequest callDrainingWaitTimeSeconds(Integer callDrainingWaitTimeSeconds) {
    this.callDrainingWaitTimeSeconds = callDrainingWaitTimeSeconds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The number of seconds to wait for call draining to complete before initiating the reboot. A value of 0 will prevent call draining and all calls will disconnect immediately.")
  @JsonProperty("callDrainingWaitTimeSeconds")
  public Integer getCallDrainingWaitTimeSeconds() {
    return callDrainingWaitTimeSeconds;
  }
  public void setCallDrainingWaitTimeSeconds(Integer callDrainingWaitTimeSeconds) {
    this.callDrainingWaitTimeSeconds = callDrainingWaitTimeSeconds;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EdgeServiceStateRequest edgeServiceStateRequest = (EdgeServiceStateRequest) o;
    return Objects.equals(this.inService, edgeServiceStateRequest.inService) &&
        Objects.equals(this.callDrainingWaitTimeSeconds, edgeServiceStateRequest.callDrainingWaitTimeSeconds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(inService, callDrainingWaitTimeSeconds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EdgeServiceStateRequest {\n");
    
    sb.append("    inService: ").append(toIndentedString(inService)).append("\n");
    sb.append("    callDrainingWaitTimeSeconds: ").append(toIndentedString(callDrainingWaitTimeSeconds)).append("\n");
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

