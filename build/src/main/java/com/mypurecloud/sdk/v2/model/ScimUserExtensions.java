package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.mypurecloud.sdk.v2.model.ScimUserRoutingLanguage;
import com.mypurecloud.sdk.v2.model.ScimUserRoutingSkill;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * SCIM PureCloud extensions of user.
 */
@ApiModel(description = "SCIM PureCloud extensions of user.")

public class ScimUserExtensions  implements Serializable {
  
  private List<ScimUserRoutingSkill> routingSkills = new ArrayList<ScimUserRoutingSkill>();
  private List<ScimUserRoutingLanguage> routingLanguages = new ArrayList<ScimUserRoutingLanguage>();

  
  /**
   * Routing Skills assigned to user. No more than 50 skills may be assigned to a user.
   **/
  public ScimUserExtensions routingSkills(List<ScimUserRoutingSkill> routingSkills) {
    this.routingSkills = routingSkills;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Routing Skills assigned to user. No more than 50 skills may be assigned to a user.")
  @JsonProperty("routingSkills")
  public List<ScimUserRoutingSkill> getRoutingSkills() {
    return routingSkills;
  }
  public void setRoutingSkills(List<ScimUserRoutingSkill> routingSkills) {
    this.routingSkills = routingSkills;
  }

  
  /**
   * Routing Languages assigned to user. No more than 50 languages may be assigned to a user.
   **/
  public ScimUserExtensions routingLanguages(List<ScimUserRoutingLanguage> routingLanguages) {
    this.routingLanguages = routingLanguages;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Routing Languages assigned to user. No more than 50 languages may be assigned to a user.")
  @JsonProperty("routingLanguages")
  public List<ScimUserRoutingLanguage> getRoutingLanguages() {
    return routingLanguages;
  }
  public void setRoutingLanguages(List<ScimUserRoutingLanguage> routingLanguages) {
    this.routingLanguages = routingLanguages;
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
        Objects.equals(this.routingLanguages, scimUserExtensions.routingLanguages);
  }

  @Override
  public int hashCode() {
    return Objects.hash(routingSkills, routingLanguages);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScimUserExtensions {\n");
    
    sb.append("    routingSkills: ").append(toIndentedString(routingSkills)).append("\n");
    sb.append("    routingLanguages: ").append(toIndentedString(routingLanguages)).append("\n");
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

