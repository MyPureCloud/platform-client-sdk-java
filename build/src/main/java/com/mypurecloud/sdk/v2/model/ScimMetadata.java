package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

import java.io.Serializable;
/**
 * SCIM V2 Meta data
 */
@ApiModel(description = "SCIM V2 Meta data")

public class ScimMetadata  implements Serializable {
  

  /**
   * Resource type
   */
  public enum ResourceTypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    USER("User"),
    GROUP("Group"),
    SERVICEPROVIDERCONFIG("ServiceProviderConfig");

    private String value;

    ResourceTypeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static ResourceTypeEnum fromString(String key) {
      if (key == null) return null;

      for (ResourceTypeEnum value : ResourceTypeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return ResourceTypeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private ResourceTypeEnum resourceType = null;
  private Date lastModified = null;
  private String location = null;
  private String version = null;

  
  @ApiModelProperty(example = "null", value = "Resource type")
  @JsonProperty("resourceType")
  public ResourceTypeEnum getResourceType() {
    return resourceType;
  }

  
  @ApiModelProperty(example = "null", value = "Last Modified ISO6501 (UTC). Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ")
  @JsonProperty("lastModified")
  public Date getLastModified() {
    return lastModified;
  }

  
  @ApiModelProperty(example = "null", value = "URI location of resource")
  @JsonProperty("location")
  public String getLocation() {
    return location;
  }

  
  @ApiModelProperty(example = "null", value = "ETag version of resource [RFC7232]")
  @JsonProperty("version")
  public String getVersion() {
    return version;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ScimMetadata scimMetadata = (ScimMetadata) o;
    return Objects.equals(this.resourceType, scimMetadata.resourceType) &&
        Objects.equals(this.lastModified, scimMetadata.lastModified) &&
        Objects.equals(this.location, scimMetadata.location) &&
        Objects.equals(this.version, scimMetadata.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(resourceType, lastModified, location, version);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScimMetadata {\n");
    
    sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
    sb.append("    lastModified: ").append(toIndentedString(lastModified)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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

