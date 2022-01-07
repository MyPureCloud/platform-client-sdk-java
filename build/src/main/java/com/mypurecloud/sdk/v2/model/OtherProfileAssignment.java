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
import com.mypurecloud.sdk.v2.model.DomainEntityRef;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * OtherProfileAssignment
 */

public class OtherProfileAssignment  implements Serializable {
  
  private String id = null;
  private DomainEntityRef currentProfile = null;
  private String selfUri = null;

  
  /**
   * The globally unique identifier for the object.
   **/
  public OtherProfileAssignment id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  
  /**
   * The current performance profile that this user belongs to
   **/
  public OtherProfileAssignment currentProfile(DomainEntityRef currentProfile) {
    this.currentProfile = currentProfile;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The current performance profile that this user belongs to")
  @JsonProperty("currentProfile")
  public DomainEntityRef getCurrentProfile() {
    return currentProfile;
  }
  public void setCurrentProfile(DomainEntityRef currentProfile) {
    this.currentProfile = currentProfile;
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
    OtherProfileAssignment otherProfileAssignment = (OtherProfileAssignment) o;
    return Objects.equals(this.id, otherProfileAssignment.id) &&
        Objects.equals(this.currentProfile, otherProfileAssignment.currentProfile) &&
        Objects.equals(this.selfUri, otherProfileAssignment.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, currentProfile, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OtherProfileAssignment {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    currentProfile: ").append(toIndentedString(currentProfile)).append("\n");
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

