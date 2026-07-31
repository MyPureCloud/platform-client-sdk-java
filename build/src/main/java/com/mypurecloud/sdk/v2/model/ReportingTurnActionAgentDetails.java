package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import java.util.Objects;
import java.util.ArrayList;
import java.io.IOException;
import com.mypurecloud.sdk.v2.ApiClient;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * ReportingTurnActionAgentDetails
 */

public class ReportingTurnActionAgentDetails  implements Serializable {
  
  private String agentId = null;
  private String agentName = null;
  private String agentVersion = null;

  public ReportingTurnActionAgentDetails() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  public ReportingTurnActionAgentDetails(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
    }
  }

  
  /**
   * The agent ID used in an action.
   **/
  public ReportingTurnActionAgentDetails agentId(String agentId) {
    this.agentId = agentId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The agent ID used in an action.")
  @JsonProperty("agentId")
  public String getAgentId() {
    return agentId;
  }
  public void setAgentId(String agentId) {
    this.agentId = agentId;
  }


  /**
   * The agent name used in an action.
   **/
  public ReportingTurnActionAgentDetails agentName(String agentName) {
    this.agentName = agentName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The agent name used in an action.")
  @JsonProperty("agentName")
  public String getAgentName() {
    return agentName;
  }
  public void setAgentName(String agentName) {
    this.agentName = agentName;
  }


  /**
   * The agent version used in an action.
   **/
  public ReportingTurnActionAgentDetails agentVersion(String agentVersion) {
    this.agentVersion = agentVersion;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The agent version used in an action.")
  @JsonProperty("agentVersion")
  public String getAgentVersion() {
    return agentVersion;
  }
  public void setAgentVersion(String agentVersion) {
    this.agentVersion = agentVersion;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReportingTurnActionAgentDetails reportingTurnActionAgentDetails = (ReportingTurnActionAgentDetails) o;

    return Objects.equals(this.agentId, reportingTurnActionAgentDetails.agentId) &&
            Objects.equals(this.agentName, reportingTurnActionAgentDetails.agentName) &&
            Objects.equals(this.agentVersion, reportingTurnActionAgentDetails.agentVersion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(agentId, agentName, agentVersion);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportingTurnActionAgentDetails {\n");
    
    sb.append("    agentId: ").append(toIndentedString(agentId)).append("\n");
    sb.append("    agentName: ").append(toIndentedString(agentName)).append("\n");
    sb.append("    agentVersion: ").append(toIndentedString(agentVersion)).append("\n");
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

