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
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

import java.io.Serializable;
/**
 * Defines the SCIM metadata.
 */
@ApiModel(description = "Defines the SCIM metadata.")

public class ScimMetadata  implements Serializable {
  

  private static class ResourceTypeEnumDeserializer extends StdDeserializer<ResourceTypeEnum> {
    public ResourceTypeEnumDeserializer() {
      super(ResourceTypeEnumDeserializer.class);
    }

    @Override
    public ResourceTypeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return ResourceTypeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The type of SCIM resource.
   */
 @JsonDeserialize(using = ResourceTypeEnumDeserializer.class)
  public enum ResourceTypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    USER("User"),
    GROUP("Group"),
    SERVICEPROVIDERCONFIG("ServiceProviderConfig"),
    RESOURCETYPE("ResourceType"),
    SCHEMA("Schema");

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

  
  @ApiModelProperty(example = "null", value = "The type of SCIM resource.")
  @JsonProperty("resourceType")
  public ResourceTypeEnum getResourceType() {
    return resourceType;
  }

  
  @ApiModelProperty(example = "null", value = "The last time that the resource was modified. Date time is represented as an \"ISO-8601 string\", for example, yyyy-MM-ddTHH:mm:ss.SSSZ. Not included with \"Schema\" and \"ResourceType\" resources.")
  @JsonProperty("lastModified")
  public Date getLastModified() {
    return lastModified;
  }

  
  @ApiModelProperty(example = "null", value = "The URI of the resource.")
  @JsonProperty("location")
  public String getLocation() {
    return location;
  }

  
  @ApiModelProperty(example = "null", value = "The version of the resource. Matches the ETag HTTP response header. Not included with \"Schema\" and \"ResourceType\" resources.")
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

