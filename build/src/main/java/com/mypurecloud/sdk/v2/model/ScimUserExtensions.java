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
import com.mypurecloud.sdk.v2.model.ScimGenesysUserExternalId;
import com.mypurecloud.sdk.v2.model.ScimUserRoutingLanguage;
import com.mypurecloud.sdk.v2.model.ScimUserRoutingSkill;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * Genesys Cloud user extensions to SCIM RFC.
 */
@ApiModel(description = "Genesys Cloud user extensions to SCIM RFC.")

public class ScimUserExtensions  implements Serializable {
  
  private List<ScimUserRoutingSkill> routingSkills = new ArrayList<ScimUserRoutingSkill>();
  private List<ScimUserRoutingLanguage> routingLanguages = new ArrayList<ScimUserRoutingLanguage>();
  private List<ScimGenesysUserExternalId> externalIds = new ArrayList<ScimGenesysUserExternalId>();

  
  /**
   * The list of routing skills assigned to a user. Maximum 50 skills.
   **/
  public ScimUserExtensions routingSkills(List<ScimUserRoutingSkill> routingSkills) {
    this.routingSkills = routingSkills;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The list of routing skills assigned to a user. Maximum 50 skills.")
  @JsonProperty("routingSkills")
  public List<ScimUserRoutingSkill> getRoutingSkills() {
    return routingSkills;
  }
  public void setRoutingSkills(List<ScimUserRoutingSkill> routingSkills) {
    this.routingSkills = routingSkills;
  }

  
  /**
   * The list of routing languages assigned to a user. Maximum 50 languages.
   **/
  public ScimUserExtensions routingLanguages(List<ScimUserRoutingLanguage> routingLanguages) {
    this.routingLanguages = routingLanguages;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The list of routing languages assigned to a user. Maximum 50 languages.")
  @JsonProperty("routingLanguages")
  public List<ScimUserRoutingLanguage> getRoutingLanguages() {
    return routingLanguages;
  }
  public void setRoutingLanguages(List<ScimUserRoutingLanguage> routingLanguages) {
    this.routingLanguages = routingLanguages;
  }

  
  /**
   * The list of external identifiers assigned to user. Always includes an immutable SCIM authority prefixed with \"x-pc:scimv2:v1\". ExternalIds are searchable with complex filter query parameter using 'authority' and 'value', e.g., filter=urn:ietf:params:scim:schemas:extension:genesys:purecloud:2.0:User:externalIds[authority eq \"matchAuthName\" and value eq \"matchingExternalKeyValue\"].
   **/
  public ScimUserExtensions externalIds(List<ScimGenesysUserExternalId> externalIds) {
    this.externalIds = externalIds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The list of external identifiers assigned to user. Always includes an immutable SCIM authority prefixed with \"x-pc:scimv2:v1\". ExternalIds are searchable with complex filter query parameter using 'authority' and 'value', e.g., filter=urn:ietf:params:scim:schemas:extension:genesys:purecloud:2.0:User:externalIds[authority eq \"matchAuthName\" and value eq \"matchingExternalKeyValue\"].")
  @JsonProperty("externalIds")
  public List<ScimGenesysUserExternalId> getExternalIds() {
    return externalIds;
  }
  public void setExternalIds(List<ScimGenesysUserExternalId> externalIds) {
    this.externalIds = externalIds;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ScimUserExtensions scimUserExtensions = (ScimUserExtensions) o;
    return Objects.equals(this.routingSkills, scimUserExtensions.routingSkills) &&
        Objects.equals(this.routingLanguages, scimUserExtensions.routingLanguages) &&
        Objects.equals(this.externalIds, scimUserExtensions.externalIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(routingSkills, routingLanguages, externalIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScimUserExtensions {\n");
    
    sb.append("    routingSkills: ").append(toIndentedString(routingSkills)).append("\n");
    sb.append("    routingLanguages: ").append(toIndentedString(routingLanguages)).append("\n");
    sb.append("    externalIds: ").append(toIndentedString(externalIds)).append("\n");
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

