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
 * ExternalContactsUnresolvedContactChangedTopicTwitterId
 */

public class ExternalContactsUnresolvedContactChangedTopicTwitterId  implements Serializable {
  
  private String id = null;
  private String name = null;
  private String screenName = null;
  private Boolean verified = null;
  private String profileUrl = null;

  public ExternalContactsUnresolvedContactChangedTopicTwitterId() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   **/
  public ExternalContactsUnresolvedContactChangedTopicTwitterId id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }


  /**
   **/
  public ExternalContactsUnresolvedContactChangedTopicTwitterId name(String name) {
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
  public ExternalContactsUnresolvedContactChangedTopicTwitterId screenName(String screenName) {
    this.screenName = screenName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("screenName")
  public String getScreenName() {
    return screenName;
  }
  public void setScreenName(String screenName) {
    this.screenName = screenName;
  }


  /**
   **/
  public ExternalContactsUnresolvedContactChangedTopicTwitterId verified(Boolean verified) {
    this.verified = verified;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("verified")
  public Boolean getVerified() {
    return verified;
  }
  public void setVerified(Boolean verified) {
    this.verified = verified;
  }


  /**
   **/
  public ExternalContactsUnresolvedContactChangedTopicTwitterId profileUrl(String profileUrl) {
    this.profileUrl = profileUrl;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("profileUrl")
  public String getProfileUrl() {
    return profileUrl;
  }
  public void setProfileUrl(String profileUrl) {
    this.profileUrl = profileUrl;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExternalContactsUnresolvedContactChangedTopicTwitterId externalContactsUnresolvedContactChangedTopicTwitterId = (ExternalContactsUnresolvedContactChangedTopicTwitterId) o;

    return Objects.equals(this.id, externalContactsUnresolvedContactChangedTopicTwitterId.id) &&
            Objects.equals(this.name, externalContactsUnresolvedContactChangedTopicTwitterId.name) &&
            Objects.equals(this.screenName, externalContactsUnresolvedContactChangedTopicTwitterId.screenName) &&
            Objects.equals(this.verified, externalContactsUnresolvedContactChangedTopicTwitterId.verified) &&
            Objects.equals(this.profileUrl, externalContactsUnresolvedContactChangedTopicTwitterId.profileUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, screenName, verified, profileUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExternalContactsUnresolvedContactChangedTopicTwitterId {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    screenName: ").append(toIndentedString(screenName)).append("\n");
    sb.append("    verified: ").append(toIndentedString(verified)).append("\n");
    sb.append("    profileUrl: ").append(toIndentedString(profileUrl)).append("\n");
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

