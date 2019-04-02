package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * UpdateAgentRequest
 */

public class UpdateAgentRequest  implements Serializable {
  
  private Boolean acceptDirectShiftTrades = null;

  
  /**
   * Whether the agent accepts direct shift trades
   **/
  public UpdateAgentRequest acceptDirectShiftTrades(Boolean acceptDirectShiftTrades) {
    this.acceptDirectShiftTrades = acceptDirectShiftTrades;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Whether the agent accepts direct shift trades")
  @JsonProperty("acceptDirectShiftTrades")
  public Boolean getAcceptDirectShiftTrades() {
    return acceptDirectShiftTrades;
  }
  public void setAcceptDirectShiftTrades(Boolean acceptDirectShiftTrades) {
    this.acceptDirectShiftTrades = acceptDirectShiftTrades;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateAgentRequest updateAgentRequest = (UpdateAgentRequest) o;
    return Objects.equals(this.acceptDirectShiftTrades, updateAgentRequest.acceptDirectShiftTrades);
  }

  @Override
  public int hashCode() {
    return Objects.hash(acceptDirectShiftTrades);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateAgentRequest {\n");
    
    sb.append("    acceptDirectShiftTrades: ").append(toIndentedString(acceptDirectShiftTrades)).append("\n");
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

