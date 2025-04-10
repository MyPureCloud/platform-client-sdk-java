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
 * TwitterIntegrationRequest
 */

public class TwitterIntegrationRequest  implements Serializable {
  
  private String id = null;
  private String name = null;
  private SupportedContentReference supportedContent = null;
  private MessagingSettingRequestReference messagingSetting = null;
  private String signupCode = null;
  private String appId = null;
  private String codeChallenge = null;
  private String redirectUri = null;
  private String selfUri = null;

  public TwitterIntegrationRequest() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }


  /**
   * The name of the Twitter Integration
   **/
  public TwitterIntegrationRequest name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The name of the Twitter Integration")
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
  public TwitterIntegrationRequest supportedContent(SupportedContentReference supportedContent) {
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
  public TwitterIntegrationRequest messagingSetting(MessagingSettingRequestReference messagingSetting) {
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
   * The authorization code returned from the signup flow to request access tokens later on
   **/
  public TwitterIntegrationRequest signupCode(String signupCode) {
    this.signupCode = signupCode;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The authorization code returned from the signup flow to request access tokens later on")
  @JsonProperty("signupCode")
  public String getSignupCode() {
    return signupCode;
  }
  public void setSignupCode(String signupCode) {
    this.signupCode = signupCode;
  }


  /**
   * The appId of the Twitter app to register the integration on
   **/
  public TwitterIntegrationRequest appId(String appId) {
    this.appId = appId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The appId of the Twitter app to register the integration on")
  @JsonProperty("appId")
  public String getAppId() {
    return appId;
  }
  public void setAppId(String appId) {
    this.appId = appId;
  }


  /**
   * The codeChallenge used during the signup flow
   **/
  public TwitterIntegrationRequest codeChallenge(String codeChallenge) {
    this.codeChallenge = codeChallenge;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The codeChallenge used during the signup flow")
  @JsonProperty("codeChallenge")
  public String getCodeChallenge() {
    return codeChallenge;
  }
  public void setCodeChallenge(String codeChallenge) {
    this.codeChallenge = codeChallenge;
  }


  /**
   * The redirectUri used during the signup flow
   **/
  public TwitterIntegrationRequest redirectUri(String redirectUri) {
    this.redirectUri = redirectUri;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The redirectUri used during the signup flow")
  @JsonProperty("redirectUri")
  public String getRedirectUri() {
    return redirectUri;
  }
  public void setRedirectUri(String redirectUri) {
    this.redirectUri = redirectUri;
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
    TwitterIntegrationRequest twitterIntegrationRequest = (TwitterIntegrationRequest) o;

    return Objects.equals(this.id, twitterIntegrationRequest.id) &&
            Objects.equals(this.name, twitterIntegrationRequest.name) &&
            Objects.equals(this.supportedContent, twitterIntegrationRequest.supportedContent) &&
            Objects.equals(this.messagingSetting, twitterIntegrationRequest.messagingSetting) &&
            Objects.equals(this.signupCode, twitterIntegrationRequest.signupCode) &&
            Objects.equals(this.appId, twitterIntegrationRequest.appId) &&
            Objects.equals(this.codeChallenge, twitterIntegrationRequest.codeChallenge) &&
            Objects.equals(this.redirectUri, twitterIntegrationRequest.redirectUri) &&
            Objects.equals(this.selfUri, twitterIntegrationRequest.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, supportedContent, messagingSetting, signupCode, appId, codeChallenge, redirectUri, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TwitterIntegrationRequest {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    supportedContent: ").append(toIndentedString(supportedContent)).append("\n");
    sb.append("    messagingSetting: ").append(toIndentedString(messagingSetting)).append("\n");
    sb.append("    signupCode: ").append(toIndentedString(signupCode)).append("\n");
    sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
    sb.append("    codeChallenge: ").append(toIndentedString(codeChallenge)).append("\n");
    sb.append("    redirectUri: ").append(toIndentedString(redirectUri)).append("\n");
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

