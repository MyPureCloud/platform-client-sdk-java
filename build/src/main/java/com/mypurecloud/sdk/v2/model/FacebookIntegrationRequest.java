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
import com.mypurecloud.sdk.v2.model.MessagingSettingRequestReference;
import com.mypurecloud.sdk.v2.model.SupportedContentReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * FacebookIntegrationRequest
 */

public class FacebookIntegrationRequest  implements Serializable {
  
  private String id = null;
  private String name = null;
  private SupportedContentReference supportedContent = null;
  private MessagingSettingRequestReference messagingSetting = null;
  private String pageAccessToken = null;
  private String userAccessToken = null;
  private String pageId = null;
  private String appId = null;
  private String appSecret = null;
  private String selfUri = null;

  public FacebookIntegrationRequest() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
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
   * Defines the SupportedContent profile configured for an integration
   **/
  public FacebookIntegrationRequest supportedContent(SupportedContentReference supportedContent) {
    this.supportedContent = supportedContent;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Defines the SupportedContent profile configured for an integration")
  @JsonProperty("supportedContent")
  public SupportedContentReference getSupportedContent() {
    return supportedContent;
  }
  public void setSupportedContent(SupportedContentReference supportedContent) {
    this.supportedContent = supportedContent;
  }


  /**
   * Defines the message settings to be applied for this integration
   **/
  public FacebookIntegrationRequest messagingSetting(MessagingSettingRequestReference messagingSetting) {
    this.messagingSetting = messagingSetting;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Defines the message settings to be applied for this integration")
  @JsonProperty("messagingSetting")
  public MessagingSettingRequestReference getMessagingSetting() {
    return messagingSetting;
  }
  public void setMessagingSetting(MessagingSettingRequestReference messagingSetting) {
    this.messagingSetting = messagingSetting;
  }


  /**
   * The long-lived Page Access Token of Facebook page.  See https://developers.facebook.com/docs/facebook-login/access-tokens.  When a pageAccessToken is provided, pageId and userAccessToken are not required.
   **/
  public FacebookIntegrationRequest pageAccessToken(String pageAccessToken) {
    this.pageAccessToken = pageAccessToken;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The long-lived Page Access Token of Facebook page.  See https://developers.facebook.com/docs/facebook-login/access-tokens.  When a pageAccessToken is provided, pageId and userAccessToken are not required.")
  @JsonProperty("pageAccessToken")
  public String getPageAccessToken() {
    return pageAccessToken;
  }
  public void setPageAccessToken(String pageAccessToken) {
    this.pageAccessToken = pageAccessToken;
  }


  /**
   * The short-lived User Access Token of the Facebook user logged into the Facebook app.  See https://developers.facebook.com/docs/facebook-login/access-tokens.  When userAccessToken is provided, pageId is mandatory.  When userAccessToken/pageId combination is provided, pageAccessToken is not required.
   **/
  public FacebookIntegrationRequest userAccessToken(String userAccessToken) {
    this.userAccessToken = userAccessToken;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The short-lived User Access Token of the Facebook user logged into the Facebook app.  See https://developers.facebook.com/docs/facebook-login/access-tokens.  When userAccessToken is provided, pageId is mandatory.  When userAccessToken/pageId combination is provided, pageAccessToken is not required.")
  @JsonProperty("userAccessToken")
  public String getUserAccessToken() {
    return userAccessToken;
  }
  public void setUserAccessToken(String userAccessToken) {
    this.userAccessToken = userAccessToken;
  }


  /**
   * The page Id of Facebook page. The pageId is required when userAccessToken is provided.
   **/
  public FacebookIntegrationRequest pageId(String pageId) {
    this.pageId = pageId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The page Id of Facebook page. The pageId is required when userAccessToken is provided.")
  @JsonProperty("pageId")
  public String getPageId() {
    return pageId;
  }
  public void setPageId(String pageId) {
    this.pageId = pageId;
  }


  /**
   * The app Id of Facebook app. The appId is required when a customer wants to use their own approved Facebook app.
   **/
  public FacebookIntegrationRequest appId(String appId) {
    this.appId = appId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The app Id of Facebook app. The appId is required when a customer wants to use their own approved Facebook app.")
  @JsonProperty("appId")
  public String getAppId() {
    return appId;
  }
  public void setAppId(String appId) {
    this.appId = appId;
  }


  /**
   * The app Secret of Facebook app. The appSecret is required when appId is provided.
   **/
  public FacebookIntegrationRequest appSecret(String appSecret) {
    this.appSecret = appSecret;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The app Secret of Facebook app. The appSecret is required when appId is provided.")
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
            Objects.equals(this.supportedContent, facebookIntegrationRequest.supportedContent) &&
            Objects.equals(this.messagingSetting, facebookIntegrationRequest.messagingSetting) &&
            Objects.equals(this.pageAccessToken, facebookIntegrationRequest.pageAccessToken) &&
            Objects.equals(this.userAccessToken, facebookIntegrationRequest.userAccessToken) &&
            Objects.equals(this.pageId, facebookIntegrationRequest.pageId) &&
            Objects.equals(this.appId, facebookIntegrationRequest.appId) &&
            Objects.equals(this.appSecret, facebookIntegrationRequest.appSecret) &&
            Objects.equals(this.selfUri, facebookIntegrationRequest.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, supportedContent, messagingSetting, pageAccessToken, userAccessToken, pageId, appId, appSecret, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FacebookIntegrationRequest {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    supportedContent: ").append(toIndentedString(supportedContent)).append("\n");
    sb.append("    messagingSetting: ").append(toIndentedString(messagingSetting)).append("\n");
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

