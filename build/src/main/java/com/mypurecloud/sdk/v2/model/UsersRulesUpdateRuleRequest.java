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
import com.mypurecloud.sdk.v2.model.UsersRulesCriteria;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * Update users rule request
 */
@ApiModel(description = "Update users rule request")

public class UsersRulesUpdateRuleRequest  implements Serializable {
  
  private String name = null;
  private String description = null;
  private List<UsersRulesCriteria> criteria = null;

  public UsersRulesUpdateRuleRequest() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      criteria = new ArrayList<UsersRulesCriteria>();
    }
  }

  
  /**
   * The name of the rule
   **/
  public UsersRulesUpdateRuleRequest name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The name of the rule")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }


  /**
   * The description of the rule
   **/
  public UsersRulesUpdateRuleRequest description(String description) {
    this.description = description;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The description of the rule")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }


  /**
   * The criteria of the rule
   **/
  public UsersRulesUpdateRuleRequest criteria(List<UsersRulesCriteria> criteria) {
    this.criteria = criteria;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The criteria of the rule")
  @JsonProperty("criteria")
  public List<UsersRulesCriteria> getCriteria() {
    return criteria;
  }
  public void setCriteria(List<UsersRulesCriteria> criteria) {
    this.criteria = criteria;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UsersRulesUpdateRuleRequest usersRulesUpdateRuleRequest = (UsersRulesUpdateRuleRequest) o;

    return Objects.equals(this.name, usersRulesUpdateRuleRequest.name) &&
            Objects.equals(this.description, usersRulesUpdateRuleRequest.description) &&
            Objects.equals(this.criteria, usersRulesUpdateRuleRequest.criteria);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, description, criteria);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UsersRulesUpdateRuleRequest {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    criteria: ").append(toIndentedString(criteria)).append("\n");
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

