package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.mypurecloud.sdk.v2.model.ScimMetadata;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * Common attributes to all SCIM resources
 */
@ApiModel(description = "Common attributes to all SCIM resources")

public class ScimResource  implements Serializable {
  
  private String id = null;
  private String displayName = null;
  private ScimMetadata meta = null;

  
  @ApiModelProperty(example = "null", value = "SCIM Resource identifier")
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  
  /**
   * Display Name
   **/
  public ScimResource displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Display Name")
  @JsonProperty("displayName")
  public String getDisplayName() {
    return displayName;
  }
  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  
  /**
   **/
  public ScimResource meta(ScimMetadata meta) {
    this.meta = meta;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("meta")
  public ScimMetadata getMeta() {
    return meta;
  }
  public void setMeta(ScimMetadata meta) {
    this.meta = meta;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ScimResource scimResource = (ScimResource) o;
    return Objects.equals(this.id, scimResource.id) &&
        Objects.equals(this.displayName, scimResource.displayName) &&
        Objects.equals(this.meta, scimResource.meta);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, displayName, meta);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScimResource {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
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

