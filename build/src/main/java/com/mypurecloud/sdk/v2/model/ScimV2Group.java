package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.mypurecloud.sdk.v2.model.ScimV2MemberReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * Defines a SCIM group.
 */
@ApiModel(description = "Defines a SCIM group.")

public class ScimV2Group  implements Serializable {
  
  private String id = null;
  private List<String> schemas = new ArrayList<String>();
  private String displayName = null;
  private String externalId = null;
  private List<ScimV2MemberReference> members = new ArrayList<ScimV2MemberReference>();

  
  @ApiModelProperty(example = "null", value = "The ID of the SCIM resource. Set by the service provider. \"caseExact\" is set to \"true\". \"mutability\" is set to \"readOnly\". \"returned\" is set to \"always\".")
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  
  /**
   * The list of supported schemas.
   **/
  public ScimV2Group schemas(List<String> schemas) {
    this.schemas = schemas;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The list of supported schemas.")
  @JsonProperty("schemas")
  public List<String> getSchemas() {
    return schemas;
  }
  public void setSchemas(List<String> schemas) {
    this.schemas = schemas;
  }

  
  @ApiModelProperty(example = "null", required = true, value = "The display name of the group.")
  @JsonProperty("displayName")
  public String getDisplayName() {
    return displayName;
  }

  
  /**
   * The external ID of the group. Set by the provisioning client. \"caseExact\" is set to \"true\". \"mutability\" is set to \"readWrite\".
   **/
  public ScimV2Group externalId(String externalId) {
    this.externalId = externalId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The external ID of the group. Set by the provisioning client. \"caseExact\" is set to \"true\". \"mutability\" is set to \"readWrite\".")
  @JsonProperty("externalId")
  public String getExternalId() {
    return externalId;
  }
  public void setExternalId(String externalId) {
    this.externalId = externalId;
  }

  
  /**
   * The list of members in the group.
   **/
  public ScimV2Group members(List<ScimV2MemberReference> members) {
    this.members = members;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The list of members in the group.")
  @JsonProperty("members")
  public List<ScimV2MemberReference> getMembers() {
    return members;
  }
  public void setMembers(List<ScimV2MemberReference> members) {
    this.members = members;
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
        Objects.equals(this.externalId, scimV2Group.externalId) &&
        Objects.equals(this.members, scimV2Group.members);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, schemas, displayName, externalId, members);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScimV2Group {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    schemas: ").append(toIndentedString(schemas)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
    sb.append("    members: ").append(toIndentedString(members)).append("\n");
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

