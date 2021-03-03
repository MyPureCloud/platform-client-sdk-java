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
import com.mypurecloud.sdk.v2.model.AuthzGrantPolicy;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * AuthzGrantRole
 */

public class AuthzGrantRole  implements Serializable {
  
  private String id = null;
  private String name = null;
  private String description = null;
  private List<AuthzGrantPolicy> policies = new ArrayList<AuthzGrantPolicy>();
  private Boolean _default = null;
  private String selfUri = null;

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  
  /**
   **/
  public AuthzGrantRole name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   **/
  public AuthzGrantRole description(String description) {
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
  public AuthzGrantRole policies(List<AuthzGrantPolicy> policies) {
    this.policies = policies;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("policies")
  public List<AuthzGrantPolicy> getPolicies() {
    return policies;
  }
  public void setPolicies(List<AuthzGrantPolicy> policies) {
    this.policies = policies;
  }

  
  /**
   **/
  public AuthzGrantRole _default(Boolean _default) {
    this._default = _default;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("default")
  public Boolean getDefault() {
    return _default;
  }
  public void setDefault(Boolean _default) {
    this._default = _default;
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
    AuthzGrantRole authzGrantRole = (AuthzGrantRole) o;
    return Objects.equals(this.id, authzGrantRole.id) &&
        Objects.equals(this.name, authzGrantRole.name) &&
        Objects.equals(this.description, authzGrantRole.description) &&
        Objects.equals(this.policies, authzGrantRole.policies) &&
        Objects.equals(this._default, authzGrantRole._default) &&
        Objects.equals(this.selfUri, authzGrantRole.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, description, policies, _default, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthzGrantRole {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    policies: ").append(toIndentedString(policies)).append("\n");
    sb.append("    _default: ").append(toIndentedString(_default)).append("\n");
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

