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
import com.mypurecloud.sdk.v2.model.AddressableLicenseDefinition;
import com.mypurecloud.sdk.v2.model.LicenseDefinition;
import com.mypurecloud.sdk.v2.model.Permissions;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * LicenseDefinition
 */

public class LicenseDefinition  implements Serializable {
  
  private String id = null;
  private String description = null;
  private Permissions permissions = null;
  private List<AddressableLicenseDefinition> prerequisites = new ArrayList<AddressableLicenseDefinition>();
  private List<LicenseDefinition> comprises = new ArrayList<LicenseDefinition>();
  private String selfUri = null;

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  
  /**
   **/
  public LicenseDefinition description(String description) {
    this.description = description;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  
  /**
   **/
  public LicenseDefinition permissions(Permissions permissions) {
    this.permissions = permissions;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("permissions")
  public Permissions getPermissions() {
    return permissions;
  }
  public void setPermissions(Permissions permissions) {
    this.permissions = permissions;
  }

  
  /**
   **/
  public LicenseDefinition prerequisites(List<AddressableLicenseDefinition> prerequisites) {
    this.prerequisites = prerequisites;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("prerequisites")
  public List<AddressableLicenseDefinition> getPrerequisites() {
    return prerequisites;
  }
  public void setPrerequisites(List<AddressableLicenseDefinition> prerequisites) {
    this.prerequisites = prerequisites;
  }

  
  /**
   **/
  public LicenseDefinition comprises(List<LicenseDefinition> comprises) {
    this.comprises = comprises;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("comprises")
  public List<LicenseDefinition> getComprises() {
    return comprises;
  }
  public void setComprises(List<LicenseDefinition> comprises) {
    this.comprises = comprises;
  }

  
  @ApiModelProperty(example = "null", value = "The URI for this object")
  @JsonProperty("selfUri")
  public String getSelfUri() {
    return selfUri;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LicenseDefinition licenseDefinition = (LicenseDefinition) o;
    return Objects.equals(this.id, licenseDefinition.id) &&
        Objects.equals(this.description, licenseDefinition.description) &&
        Objects.equals(this.permissions, licenseDefinition.permissions) &&
        Objects.equals(this.prerequisites, licenseDefinition.prerequisites) &&
        Objects.equals(this.comprises, licenseDefinition.comprises) &&
        Objects.equals(this.selfUri, licenseDefinition.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, description, permissions, prerequisites, comprises, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LicenseDefinition {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    permissions: ").append(toIndentedString(permissions)).append("\n");
    sb.append("    prerequisites: ").append(toIndentedString(prerequisites)).append("\n");
    sb.append("    comprises: ").append(toIndentedString(comprises)).append("\n");
    sb.append("    selfUri: ").append(toIndentedString(selfUri)).append("\n");
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

