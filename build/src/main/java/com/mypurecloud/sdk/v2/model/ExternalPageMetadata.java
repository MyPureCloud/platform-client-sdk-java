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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * ExternalPageMetadata
 */

public class ExternalPageMetadata  implements Serializable {
  
  private String name = null;
  private String profilePictureUrl = null;

  public ExternalPageMetadata() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * The name of the external page
   **/
  public ExternalPageMetadata name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The name of the external page")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }


  /**
   * The profile picture URL of the external page
   **/
  public ExternalPageMetadata profilePictureUrl(String profilePictureUrl) {
    this.profilePictureUrl = profilePictureUrl;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The profile picture URL of the external page")
  @JsonProperty("profilePictureUrl")
  public String getProfilePictureUrl() {
    return profilePictureUrl;
  }
  public void setProfilePictureUrl(String profilePictureUrl) {
    this.profilePictureUrl = profilePictureUrl;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExternalPageMetadata externalPageMetadata = (ExternalPageMetadata) o;

    return Objects.equals(this.name, externalPageMetadata.name) &&
            Objects.equals(this.profilePictureUrl, externalPageMetadata.profilePictureUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, profilePictureUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExternalPageMetadata {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    profilePictureUrl: ").append(toIndentedString(profilePictureUrl)).append("\n");
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

