package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.mypurecloud.sdk.v2.model.ScimMetadata;
import com.mypurecloud.sdk.v2.model.ScimV2MemberReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * SCIM version 2 Group
 */
@ApiModel(description = "SCIM version 2 Group")

public class ScimV2Group  implements Serializable {
  
  private String id = null;
  private List<String> schemas = new ArrayList<String>();
  private String displayName = null;
  private List<ScimV2MemberReference> members = new ArrayList<ScimV2MemberReference>();
  private ScimMetadata meta = null;

  
  @ApiModelProperty(example = "null", value = "SCIM Resource identifier")
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  
  /**
   * schemas supported
   **/
  public ScimV2Group schemas(List<String> schemas) {
    this.schemas = schemas;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "schemas supported")
  @JsonProperty("schemas")
  public List<String> getSchemas() {
    return schemas;
  }
  public void setSchemas(List<String> schemas) {
    this.schemas = schemas;
  }

  
  @ApiModelProperty(example = "null", value = "Display Name")
  @JsonProperty("displayName")
  public String getDisplayName() {
    return displayName;
  }

  
  /**
   * Scim Group Members
   **/
  public ScimV2Group members(List<ScimV2MemberReference> members) {
    this.members = members;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Scim Group Members")
  @JsonProperty("members")
  public List<ScimV2MemberReference> getMembers() {
    return members;
  }
  public void setMembers(List<ScimV2MemberReference> members) {
    this.members = members;
  }

  
  /**
   * Resource SCIM meta
   **/
  public ScimV2Group meta(ScimMetadata meta) {
    this.meta = meta;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Resource SCIM meta")
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
    ScimV2Group scimV2Group = (ScimV2Group) o;
    return Objects.equals(this.id, scimV2Group.id) &&
        Objects.equals(this.schemas, scimV2Group.schemas) &&
        Objects.equals(this.displayName, scimV2Group.displayName) &&
        Objects.equals(this.members, scimV2Group.members) &&
        Objects.equals(this.meta, scimV2Group.meta);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, schemas, displayName, members, meta);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScimV2Group {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    schemas: ").append(toIndentedString(schemas)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    members: ").append(toIndentedString(members)).append("\n");
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

