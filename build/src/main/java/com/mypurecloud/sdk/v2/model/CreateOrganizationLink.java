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
 * CreateOrganizationLink
 */

public class CreateOrganizationLink  implements Serializable {
  
  private String targetOrganizationId = null;
  private String targetRegion = null;

  public CreateOrganizationLink() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  public CreateOrganizationLink(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
    }
  }

  
  /**
   * Id for the linking organization.
   **/
  public CreateOrganizationLink targetOrganizationId(String targetOrganizationId) {
    this.targetOrganizationId = targetOrganizationId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Id for the linking organization.")
  @JsonProperty("targetOrganizationId")
  public String getTargetOrganizationId() {
    return targetOrganizationId;
  }
  public void setTargetOrganizationId(String targetOrganizationId) {
    this.targetOrganizationId = targetOrganizationId;
  }


  /**
   * Region where target organization is hosted.
   **/
  public CreateOrganizationLink targetRegion(String targetRegion) {
    this.targetRegion = targetRegion;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Region where target organization is hosted.")
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
    CreateOrganizationLink createOrganizationLink = (CreateOrganizationLink) o;

    return Objects.equals(this.targetOrganizationId, createOrganizationLink.targetOrganizationId) &&
            Objects.equals(this.targetRegion, createOrganizationLink.targetRegion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(targetOrganizationId, targetRegion);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateOrganizationLink {\n");
    
    sb.append("    targetOrganizationId: ").append(toIndentedString(targetOrganizationId)).append("\n");
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

