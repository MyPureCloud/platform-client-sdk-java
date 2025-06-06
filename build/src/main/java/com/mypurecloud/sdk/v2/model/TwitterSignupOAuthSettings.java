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
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * TwitterSignupOAuthSettings
 */

public class TwitterSignupOAuthSettings  implements Serializable {
  
  private String clientId = null;
  private List<String> scopes = null;
  private String appId = null;

  public TwitterSignupOAuthSettings() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      scopes = new ArrayList<String>();
    }
  }

  
  /**
   * The client id of the twitter app the requesting org will use to signup
   **/
  public TwitterSignupOAuthSettings clientId(String clientId) {
    this.clientId = clientId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The client id of the twitter app the requesting org will use to signup")
  @JsonProperty("clientId")
  public String getClientId() {
    return clientId;
  }
  public void setClientId(String clientId) {
    this.clientId = clientId;
  }


  /**
   * The scopes/permissions requested during the signup process during the signup process to allow their future integrations to direct message
   **/
  public TwitterSignupOAuthSettings scopes(List<String> scopes) {
    this.scopes = scopes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The scopes/permissions requested during the signup process during the signup process to allow their future integrations to direct message")
  @JsonProperty("scopes")
  public List<String> getScopes() {
    return scopes;
  }
  public void setScopes(List<String> scopes) {
    this.scopes = scopes;
  }


  /**
   * The app id of the twitter app the requesting org will use to signup
   **/
  public TwitterSignupOAuthSettings appId(String appId) {
    this.appId = appId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The app id of the twitter app the requesting org will use to signup")
  @JsonProperty("appId")
  public String getAppId() {
    return appId;
  }
  public void setAppId(String appId) {
    this.appId = appId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TwitterSignupOAuthSettings twitterSignupOAuthSettings = (TwitterSignupOAuthSettings) o;

    return Objects.equals(this.clientId, twitterSignupOAuthSettings.clientId) &&
            Objects.equals(this.scopes, twitterSignupOAuthSettings.scopes) &&
            Objects.equals(this.appId, twitterSignupOAuthSettings.appId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientId, scopes, appId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TwitterSignupOAuthSettings {\n");
    
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    scopes: ").append(toIndentedString(scopes)).append("\n");
    sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
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

