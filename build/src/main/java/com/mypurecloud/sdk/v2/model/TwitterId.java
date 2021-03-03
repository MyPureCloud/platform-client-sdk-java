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

import java.io.Serializable;
/**
 * User information for a twitter account
 */
@ApiModel(description = "User information for a twitter account")

public class TwitterId  implements Serializable {
  
  private String id = null;
  private String name = null;
  private String screenName = null;
  private Boolean verified = null;
  private String profileUrl = null;

  
  /**
   * twitter user.id_str
   **/
  public TwitterId id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "twitter user.id_str")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  
  /**
   * twitter user.name
   **/
  public TwitterId name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "twitter user.name")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   * twitter user.screen_name
   **/
  public TwitterId screenName(String screenName) {
    this.screenName = screenName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "twitter user.screen_name")
  @JsonProperty("screenName")
  public String getScreenName() {
    return screenName;
  }
  public void setScreenName(String screenName) {
    this.screenName = screenName;
  }

  
  @ApiModelProperty(example = "null", value = "whether this data has been verified using the twitter API")
  @JsonProperty("verified")
  public Boolean getVerified() {
    return verified;
  }

  
  @ApiModelProperty(example = "null", value = "url of user's twitter profile")
  @JsonProperty("profileUrl")
  public String getProfileUrl() {
    return profileUrl;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TwitterId twitterId = (TwitterId) o;
    return Objects.equals(this.id, twitterId.id) &&
        Objects.equals(this.name, twitterId.name) &&
        Objects.equals(this.screenName, twitterId.screenName) &&
        Objects.equals(this.verified, twitterId.verified) &&
        Objects.equals(this.profileUrl, twitterId.profileUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, screenName, verified, profileUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TwitterId {\n");
    
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

