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
 * NumberRoutingRequest
 */

public class NumberRoutingRequest  implements Serializable {
  
  private String organizationId = null;
  private String numberId = null;
  private String targetRegion = null;

  public NumberRoutingRequest() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  public NumberRoutingRequest(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
    }
  }

  
  /**
   * Target organization Id where number will be routed to
   **/
  public NumberRoutingRequest organizationId(String organizationId) {
    this.organizationId = organizationId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Target organization Id where number will be routed to")
  @JsonProperty("organizationId")
  public String getOrganizationId() {
    return organizationId;
  }
  public void setOrganizationId(String organizationId) {
    this.organizationId = organizationId;
  }


  /**
   * Number Id to be routed.
   **/
  public NumberRoutingRequest numberId(String numberId) {
    this.numberId = numberId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Number Id to be routed.")
  @JsonProperty("numberId")
  public String getNumberId() {
    return numberId;
  }
  public void setNumberId(String numberId) {
    this.numberId = numberId;
  }


  /**
   * Region where target organization is hosted.
   **/
  public NumberRoutingRequest targetRegion(String targetRegion) {
    this.targetRegion = targetRegion;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Region where target organization is hosted.")
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
    NumberRoutingRequest numberRoutingRequest = (NumberRoutingRequest) o;

    return Objects.equals(this.organizationId, numberRoutingRequest.organizationId) &&
            Objects.equals(this.numberId, numberRoutingRequest.numberId) &&
            Objects.equals(this.targetRegion, numberRoutingRequest.targetRegion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(organizationId, numberId, targetRegion);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NumberRoutingRequest {\n");
    
    sb.append("    organizationId: ").append(toIndentedString(organizationId)).append("\n");
    sb.append("    numberId: ").append(toIndentedString(numberId)).append("\n");
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

