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
import com.mypurecloud.sdk.v2.model.AuthzGrant;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * AuthzSubject
 */

public class AuthzSubject  implements Serializable {
  
  private String id = null;
  private String name = null;
  private List<AuthzGrant> grants = new ArrayList<AuthzGrant>();
  private Integer version = null;
  private String selfUri = null;

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  
  /**
   **/
  public AuthzSubject name(String name) {
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
  public AuthzSubject grants(List<AuthzGrant> grants) {
    this.grants = grants;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("grants")
  public List<AuthzGrant> getGrants() {
    return grants;
  }
  public void setGrants(List<AuthzGrant> grants) {
    this.grants = grants;
  }

  
  /**
   **/
  public AuthzSubject version(Integer version) {
    this.version = version;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("version")
  public Integer getVersion() {
    return version;
  }
  public void setVersion(Integer version) {
    this.version = version;
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
    AuthzSubject authzSubject = (AuthzSubject) o;
    return Objects.equals(this.id, authzSubject.id) &&
        Objects.equals(this.name, authzSubject.name) &&
        Objects.equals(this.grants, authzSubject.grants) &&
        Objects.equals(this.version, authzSubject.version) &&
        Objects.equals(this.selfUri, authzSubject.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, grants, version, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthzSubject {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    grants: ").append(toIndentedString(grants)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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

