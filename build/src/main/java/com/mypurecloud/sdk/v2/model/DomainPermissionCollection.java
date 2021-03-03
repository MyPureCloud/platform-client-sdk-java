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
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import java.io.Serializable;
/**
 * DomainPermissionCollection
 */

public class DomainPermissionCollection  implements Serializable {
  
  private String id = null;
  private String name = null;
  private String domain = null;
  private Map<String, List<DomainPermission>> permissionMap = null;
  private String selfUri = null;

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  
  /**
   **/
  public DomainPermissionCollection name(String name) {
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
  public DomainPermissionCollection domain(String domain) {
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
  public DomainPermissionCollection permissionMap(Map<String, List<DomainPermission>> permissionMap) {
    this.permissionMap = permissionMap;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("permissionMap")
  public Map<String, List<DomainPermission>> getPermissionMap() {
    return permissionMap;
  }
  public void setPermissionMap(Map<String, List<DomainPermission>> permissionMap) {
    this.permissionMap = permissionMap;
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
    DomainPermissionCollection domainPermissionCollection = (DomainPermissionCollection) o;
    return Objects.equals(this.id, domainPermissionCollection.id) &&
        Objects.equals(this.name, domainPermissionCollection.name) &&
        Objects.equals(this.domain, domainPermissionCollection.domain) &&
        Objects.equals(this.permissionMap, domainPermissionCollection.permissionMap) &&
        Objects.equals(this.selfUri, domainPermissionCollection.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, domain, permissionMap, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DomainPermissionCollection {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
    sb.append("    permissionMap: ").append(toIndentedString(permissionMap)).append("\n");
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

