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
 * The meta object of the SCIM V2 implementation.
 */
@ApiModel(description = "The meta object of the SCIM V2 implementation.")

public class ScimMetadata  implements Serializable {
  

  /**
   * The type of the resource.
   */
  public enum ResourceTypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    USER("User"),
    GROUP("Group"),
    SERVICEPROVIDERCONFIG("ServiceProviderConfig"),
    RESOURCETYPE("ResourceType");

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

  
  @ApiModelProperty(example = "null", value = "The type of the resource.")
  @JsonProperty("resourceType")
  public ResourceTypeEnum getResourceType() {
    return resourceType;
  }

  
  @ApiModelProperty(example = "null", value = "The last time that the resource was modified. Time in ISO 6501 (UTC) format. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ")
  @JsonProperty("lastModified")
  public Date getLastModified() {
    return lastModified;
  }

  
  @ApiModelProperty(example = "null", value = "The URI of the resource.")
  @JsonProperty("location")
  public String getLocation() {
    return location;
  }

  
  @ApiModelProperty(example = "null", value = "The version of the resource. Matches the ETag HTTP response header.")
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

