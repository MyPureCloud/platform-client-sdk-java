package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.mypurecloud.sdk.v2.model.OAuthAuthorization;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * OAuthAuthorizationListing
 */

public class OAuthAuthorizationListing  implements Serializable {
  
  private List<OAuthAuthorization> entities = new ArrayList<OAuthAuthorization>();
  private String selfUri = null;

  
  /**
   **/
  public OAuthAuthorizationListing entities(List<OAuthAuthorization> entities) {
    this.entities = entities;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("entities")
  public List<OAuthAuthorization> getEntities() {
    return entities;
  }
  public void setEntities(List<OAuthAuthorization> entities) {
    this.entities = entities;
  }

  
  /**
   **/
  public OAuthAuthorizationListing selfUri(String selfUri) {
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
    OAuthAuthorizationListing oAuthAuthorizationListing = (OAuthAuthorizationListing) o;
    return Objects.equals(this.entities, oAuthAuthorizationListing.entities) &&
        Objects.equals(this.selfUri, oAuthAuthorizationListing.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entities, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OAuthAuthorizationListing {\n");
    
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

