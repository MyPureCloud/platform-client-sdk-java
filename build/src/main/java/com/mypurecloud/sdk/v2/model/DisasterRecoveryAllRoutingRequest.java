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
 * Disaster Recovery all numbers routing request body
 */
@ApiModel(description = "Disaster Recovery all numbers routing request body")

public class DisasterRecoveryAllRoutingRequest  implements Serializable {
  
  private String sourceOrganizationId = null;
  private String switchOrganizationId = null;
  private String targetRegion = null;

  public DisasterRecoveryAllRoutingRequest() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  public DisasterRecoveryAllRoutingRequest(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
    }
  }

  
  /**
   * Value for login Organization Id
   **/
  public DisasterRecoveryAllRoutingRequest sourceOrganizationId(String sourceOrganizationId) {
    this.sourceOrganizationId = sourceOrganizationId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Value for login Organization Id")
  @JsonProperty("sourceOrganizationId")
  public String getSourceOrganizationId() {
    return sourceOrganizationId;
  }
  public void setSourceOrganizationId(String sourceOrganizationId) {
    this.sourceOrganizationId = sourceOrganizationId;
  }


  /**
   * Organization Id that will receive the routing
   **/
  public DisasterRecoveryAllRoutingRequest switchOrganizationId(String switchOrganizationId) {
    this.switchOrganizationId = switchOrganizationId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Organization Id that will receive the routing")
  @JsonProperty("switchOrganizationId")
  public String getSwitchOrganizationId() {
    return switchOrganizationId;
  }
  public void setSwitchOrganizationId(String switchOrganizationId) {
    this.switchOrganizationId = switchOrganizationId;
  }


  /**
   * Region for rerouting
   **/
  public DisasterRecoveryAllRoutingRequest targetRegion(String targetRegion) {
    this.targetRegion = targetRegion;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Region for rerouting")
  @JsonProperty("targetRegion")
  public String getTargetRegion() {
    return targetRegion;
  }
  public void setTargetRegion(String targetRegion) {
    this.targetRegion = targetRegion;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DisasterRecoveryAllRoutingRequest disasterRecoveryAllRoutingRequest = (DisasterRecoveryAllRoutingRequest) o;

    return Objects.equals(this.sourceOrganizationId, disasterRecoveryAllRoutingRequest.sourceOrganizationId) &&
            Objects.equals(this.switchOrganizationId, disasterRecoveryAllRoutingRequest.switchOrganizationId) &&
            Objects.equals(this.targetRegion, disasterRecoveryAllRoutingRequest.targetRegion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sourceOrganizationId, switchOrganizationId, targetRegion);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DisasterRecoveryAllRoutingRequest {\n");
    
    sb.append("    sourceOrganizationId: ").append(toIndentedString(sourceOrganizationId)).append("\n");
    sb.append("    switchOrganizationId: ").append(toIndentedString(switchOrganizationId)).append("\n");
    sb.append("    targetRegion: ").append(toIndentedString(targetRegion)).append("\n");
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

