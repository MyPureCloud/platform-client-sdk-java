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
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * OrganizationLinkResponse
 */

public class OrganizationLinkResponse  implements Serializable {
  
  private String sourceOrganizationId = null;
  private String targetOrganizationId = null;
  private String sourceRegion = null;
  private String targetRegion = null;
  private String targetName = null;

  private static class StatusEnumDeserializer extends StdDeserializer<StatusEnum> {
    public StatusEnumDeserializer() {
      super(StatusEnumDeserializer.class);
    }

    @Override
    public StatusEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return StatusEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Status of the linking.
   */
 @JsonDeserialize(using = StatusEnumDeserializer.class)
  public enum StatusEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    APPROVED("Approved"),
    PENDING("Pending"),
    APPROVALPENDING("ApprovalPending"),
    REJECTED("Rejected");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static StatusEnum fromString(String key) {
      if (key == null) return null;

      for (StatusEnum value : StatusEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return StatusEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private StatusEnum status = null;

  public OrganizationLinkResponse() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  public OrganizationLinkResponse(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
    }
  }

  
  /**
   * Organization Id for the login organization.
   **/
  public OrganizationLinkResponse sourceOrganizationId(String sourceOrganizationId) {
    this.sourceOrganizationId = sourceOrganizationId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Organization Id for the login organization.")
  @JsonProperty("sourceOrganizationId")
  public String getSourceOrganizationId() {
    return sourceOrganizationId;
  }
  public void setSourceOrganizationId(String sourceOrganizationId) {
    this.sourceOrganizationId = sourceOrganizationId;
  }


  /**
   * Organization Id for the linking organization.
   **/
  public OrganizationLinkResponse targetOrganizationId(String targetOrganizationId) {
    this.targetOrganizationId = targetOrganizationId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Organization Id for the linking organization.")
  @JsonProperty("targetOrganizationId")
  public String getTargetOrganizationId() {
    return targetOrganizationId;
  }
  public void setTargetOrganizationId(String targetOrganizationId) {
    this.targetOrganizationId = targetOrganizationId;
  }


  /**
   * Region where context organization is hosted, ie. us-east-1
   **/
  public OrganizationLinkResponse sourceRegion(String sourceRegion) {
    this.sourceRegion = sourceRegion;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Region where context organization is hosted, ie. us-east-1")
  @JsonProperty("sourceRegion")
  public String getSourceRegion() {
    return sourceRegion;
  }
  public void setSourceRegion(String sourceRegion) {
    this.sourceRegion = sourceRegion;
  }


  /**
   * Region where linking organization is hosted, ie. us-east-2
   **/
  public OrganizationLinkResponse targetRegion(String targetRegion) {
    this.targetRegion = targetRegion;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Region where linking organization is hosted, ie. us-east-2")
  @JsonProperty("targetRegion")
  public String getTargetRegion() {
    return targetRegion;
  }
  public void setTargetRegion(String targetRegion) {
    this.targetRegion = targetRegion;
  }


  /**
   * Name for the linking organization.
   **/
  public OrganizationLinkResponse targetName(String targetName) {
    this.targetName = targetName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Name for the linking organization.")
  @JsonProperty("targetName")
  public String getTargetName() {
    return targetName;
  }
  public void setTargetName(String targetName) {
    this.targetName = targetName;
  }


  /**
   * Status of the linking.
   **/
  public OrganizationLinkResponse status(StatusEnum status) {
    this.status = status;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Status of the linking.")
  @JsonProperty("status")
  public StatusEnum getStatus() {
    return status;
  }
  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrganizationLinkResponse organizationLinkResponse = (OrganizationLinkResponse) o;

    return Objects.equals(this.sourceOrganizationId, organizationLinkResponse.sourceOrganizationId) &&
            Objects.equals(this.targetOrganizationId, organizationLinkResponse.targetOrganizationId) &&
            Objects.equals(this.sourceRegion, organizationLinkResponse.sourceRegion) &&
            Objects.equals(this.targetRegion, organizationLinkResponse.targetRegion) &&
            Objects.equals(this.targetName, organizationLinkResponse.targetName) &&
            Objects.equals(this.status, organizationLinkResponse.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sourceOrganizationId, targetOrganizationId, sourceRegion, targetRegion, targetName, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrganizationLinkResponse {\n");
    
    sb.append("    sourceOrganizationId: ").append(toIndentedString(sourceOrganizationId)).append("\n");
    sb.append("    targetOrganizationId: ").append(toIndentedString(targetOrganizationId)).append("\n");
    sb.append("    sourceRegion: ").append(toIndentedString(sourceRegion)).append("\n");
    sb.append("    targetRegion: ").append(toIndentedString(targetRegion)).append("\n");
    sb.append("    targetName: ").append(toIndentedString(targetName)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

