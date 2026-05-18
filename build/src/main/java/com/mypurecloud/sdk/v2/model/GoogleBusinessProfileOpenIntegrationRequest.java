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
import com.mypurecloud.sdk.v2.model.GoogleAuthTokenReference;
import com.mypurecloud.sdk.v2.model.GoogleBusinessProfileAccountReference;
import com.mypurecloud.sdk.v2.model.MessagingSettingRequestReference;
import com.mypurecloud.sdk.v2.model.SupportedContentReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * GoogleBusinessProfileOpenIntegrationRequest
 */

public class GoogleBusinessProfileOpenIntegrationRequest  implements Serializable {
  
  private String id = null;
  private String name = null;
  private SupportedContentReference supportedContent = null;
  private MessagingSettingRequestReference messagingSetting = null;
  private GoogleAuthTokenReference token = null;
  private GoogleBusinessProfileAccountReference account = null;
  private String selfUri = null;

  public GoogleBusinessProfileOpenIntegrationRequest() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  public GoogleBusinessProfileOpenIntegrationRequest(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
    }
  }

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }


  /**
   * The name of the Google Business Profile Open Integration.
   **/
  public GoogleBusinessProfileOpenIntegrationRequest name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The name of the Google Business Profile Open Integration.")
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
  public GoogleBusinessProfileOpenIntegrationRequest supportedContent(SupportedContentReference supportedContent) {
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
  public GoogleBusinessProfileOpenIntegrationRequest messagingSetting(MessagingSettingRequestReference messagingSetting) {
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
   * Google OAuth 2 access token reference. The actual token cannot be accessed via Genesys API, only referenced by this property by its ID. When the token is not referenced by any integration, it is deleted after 24 hours.
   **/
  public GoogleBusinessProfileOpenIntegrationRequest token(GoogleAuthTokenReference token) {
    this.token = token;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Google OAuth 2 access token reference. The actual token cannot be accessed via Genesys API, only referenced by this property by its ID. When the token is not referenced by any integration, it is deleted after 24 hours.")
  @JsonProperty("token")
  public GoogleAuthTokenReference getToken() {
    return token;
  }
  public void setToken(GoogleAuthTokenReference token) {
    this.token = token;
  }


  /**
   * Google Business Profile account accessible with the authorization token
   **/
  public GoogleBusinessProfileOpenIntegrationRequest account(GoogleBusinessProfileAccountReference account) {
    this.account = account;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Google Business Profile account accessible with the authorization token")
  @JsonProperty("account")
  public GoogleBusinessProfileAccountReference getAccount() {
    return account;
  }
  public void setAccount(GoogleBusinessProfileAccountReference account) {
    this.account = account;
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
    GoogleBusinessProfileOpenIntegrationRequest googleBusinessProfileOpenIntegrationRequest = (GoogleBusinessProfileOpenIntegrationRequest) o;

    return Objects.equals(this.id, googleBusinessProfileOpenIntegrationRequest.id) &&
            Objects.equals(this.name, googleBusinessProfileOpenIntegrationRequest.name) &&
            Objects.equals(this.supportedContent, googleBusinessProfileOpenIntegrationRequest.supportedContent) &&
            Objects.equals(this.messagingSetting, googleBusinessProfileOpenIntegrationRequest.messagingSetting) &&
            Objects.equals(this.token, googleBusinessProfileOpenIntegrationRequest.token) &&
            Objects.equals(this.account, googleBusinessProfileOpenIntegrationRequest.account) &&
            Objects.equals(this.selfUri, googleBusinessProfileOpenIntegrationRequest.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, supportedContent, messagingSetting, token, account, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GoogleBusinessProfileOpenIntegrationRequest {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    supportedContent: ").append(toIndentedString(supportedContent)).append("\n");
    sb.append("    messagingSetting: ").append(toIndentedString(messagingSetting)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    account: ").append(toIndentedString(account)).append("\n");
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

