package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * FacebookIntegrationRequest
 */

public class FacebookIntegrationRequest  implements Serializable {
  
  private String id = null;
  private String name = null;
  private String pageAccessToken = null;
  private String userAccessToken = null;
  private String pageId = null;
  private String appId = null;
  private String appSecret = null;
  private String selfUri = null;

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  
  /**
   * The name of the Facebook Integration
   **/
  public FacebookIntegrationRequest name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The name of the Facebook Integration")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   * The Page Access Token of a facebook page
   **/
  public FacebookIntegrationRequest pageAccessToken(String pageAccessToken) {
    this.pageAccessToken = pageAccessToken;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The Page Access Token of a facebook page")
  @JsonProperty("pageAccessToken")
  public String getPageAccessToken() {
    return pageAccessToken;
  }
  public void setPageAccessToken(String pageAccessToken) {
    this.pageAccessToken = pageAccessToken;
  }

  
  /**
   * The User Access Token of the facebook user logged into the facebook app
   **/
  public FacebookIntegrationRequest userAccessToken(String userAccessToken) {
    this.userAccessToken = userAccessToken;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The User Access Token of the facebook user logged into the facebook app")
  @JsonProperty("userAccessToken")
  public String getUserAccessToken() {
    return userAccessToken;
  }
  public void setUserAccessToken(String userAccessToken) {
    this.userAccessToken = userAccessToken;
  }

  
  /**
   * The page Id of a facebook page
   **/
  public FacebookIntegrationRequest pageId(String pageId) {
    this.pageId = pageId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The page Id of a facebook page")
  @JsonProperty("pageId")
  public String getPageId() {
    return pageId;
  }
  public void setPageId(String pageId) {
    this.pageId = pageId;
  }

  
  /**
   * The app Id of a facebook app
   **/
  public FacebookIntegrationRequest appId(String appId) {
    this.appId = appId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The app Id of a facebook app")
  @JsonProperty("appId")
  public String getAppId() {
    return appId;
  }
  public void setAppId(String appId) {
    this.appId = appId;
  }

  
  /**
   * The app Secret of a facebook app
   **/
  public FacebookIntegrationRequest appSecret(String appSecret) {
    this.appSecret = appSecret;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The app Secret of a facebook app")
  @JsonProperty("appSecret")
  public String getAppSecret() {
    return appSecret;
  }
  public void setAppSecret(String appSecret) {
    this.appSecret = appSecret;
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
    FacebookIntegrationRequest facebookIntegrationRequest = (FacebookIntegrationRequest) o;
    return Objects.equals(this.id, facebookIntegrationRequest.id) &&
        Objects.equals(this.name, facebookIntegrationRequest.name) &&
        Objects.equals(this.pageAccessToken, facebookIntegrationRequest.pageAccessToken) &&
        Objects.equals(this.userAccessToken, facebookIntegrationRequest.userAccessToken) &&
        Objects.equals(this.pageId, facebookIntegrationRequest.pageId) &&
        Objects.equals(this.appId, facebookIntegrationRequest.appId) &&
        Objects.equals(this.appSecret, facebookIntegrationRequest.appSecret) &&
        Objects.equals(this.selfUri, facebookIntegrationRequest.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, pageAccessToken, userAccessToken, pageId, appId, appSecret, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FacebookIntegrationRequest {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    pageAccessToken: ").append(toIndentedString(pageAccessToken)).append("\n");
    sb.append("    userAccessToken: ").append(toIndentedString(userAccessToken)).append("\n");
    sb.append("    pageId: ").append(toIndentedString(pageId)).append("\n");
    sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
    sb.append("    appSecret: ").append(toIndentedString(appSecret)).append("\n");
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

