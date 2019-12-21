package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.mypurecloud.sdk.v2.model.OAuthScope;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * OAuthScopeListing
 */

public class OAuthScopeListing  implements Serializable {
  
  private List<OAuthScope> entities = new ArrayList<OAuthScope>();
  private String selfUri = null;

  
  /**
   **/
  public OAuthScopeListing entities(List<OAuthScope> entities) {
    this.entities = entities;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("entities")
  public List<OAuthScope> getEntities() {
    return entities;
  }
  public void setEntities(List<OAuthScope> entities) {
    this.entities = entities;
  }

  
  /**
   **/
  public OAuthScopeListing selfUri(String selfUri) {
    this.selfUri = selfUri;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("selfUri")
  public String getSelfUri() {
    return selfUri;
  }
  public void setSelfUri(String selfUri) {
    this.selfUri = selfUri;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OAuthScopeListing oAuthScopeListing = (OAuthScopeListing) o;
    return Objects.equals(this.entities, oAuthScopeListing.entities) &&
        Objects.equals(this.selfUri, oAuthScopeListing.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entities, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OAuthScopeListing {\n");
    
    sb.append("    entities: ").append(toIndentedString(entities)).append("\n");
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

