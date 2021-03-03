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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * AuthzGrantPolicy
 */

public class AuthzGrantPolicy  implements Serializable {
  
  private List<String> actions = new ArrayList<String>();
  private String condition = null;
  private String domain = null;
  private String entityName = null;

  
  /**
   **/
  public AuthzGrantPolicy actions(List<String> actions) {
    this.actions = actions;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("actions")
  public List<String> getActions() {
    return actions;
  }
  public void setActions(List<String> actions) {
    this.actions = actions;
  }

  
  /**
   **/
  public AuthzGrantPolicy condition(String condition) {
    this.condition = condition;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("condition")
  public String getCondition() {
    return condition;
  }
  public void setCondition(String condition) {
    this.condition = condition;
  }

  
  /**
   **/
  public AuthzGrantPolicy domain(String domain) {
    this.domain = domain;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("domain")
  public String getDomain() {
    return domain;
  }
  public void setDomain(String domain) {
    this.domain = domain;
  }

  
  /**
   **/
  public AuthzGrantPolicy entityName(String entityName) {
    this.entityName = entityName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("entityName")
  public String getEntityName() {
    return entityName;
  }
  public void setEntityName(String entityName) {
    this.entityName = entityName;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuthzGrantPolicy authzGrantPolicy = (AuthzGrantPolicy) o;
    return Objects.equals(this.actions, authzGrantPolicy.actions) &&
        Objects.equals(this.condition, authzGrantPolicy.condition) &&
        Objects.equals(this.domain, authzGrantPolicy.domain) &&
        Objects.equals(this.entityName, authzGrantPolicy.entityName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actions, condition, domain, entityName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthzGrantPolicy {\n");
    
    sb.append("    actions: ").append(toIndentedString(actions)).append("\n");
    sb.append("    condition: ").append(toIndentedString(condition)).append("\n");
    sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
    sb.append("    entityName: ").append(toIndentedString(entityName)).append("\n");
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

