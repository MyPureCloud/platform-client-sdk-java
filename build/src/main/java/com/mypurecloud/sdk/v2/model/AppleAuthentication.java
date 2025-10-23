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
 * AppleAuthentication
 */

public class AppleAuthentication  implements Serializable {
  
  private String oauthClientId = null;
  private String oauthClientSecret = null;
  private String oauthTokenUrl = null;
  private String oauthScope = null;

  public AppleAuthentication() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * The Apple Messages for Business OAuth client id.
   **/
  public AppleAuthentication oauthClientId(String oauthClientId) {
    this.oauthClientId = oauthClientId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The Apple Messages for Business OAuth client id.")
  @JsonProperty("oauthClientId")
  public String getOauthClientId() {
    return oauthClientId;
  }
  public void setOauthClientId(String oauthClientId) {
    this.oauthClientId = oauthClientId;
  }


  /**
   * The Apple Messages for Business OAuth client secret.
   **/
  public AppleAuthentication oauthClientSecret(String oauthClientSecret) {
    this.oauthClientSecret = oauthClientSecret;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The Apple Messages for Business OAuth client secret.")
  @JsonProperty("oauthClientSecret")
  public String getOauthClientSecret() {
    return oauthClientSecret;
  }
  public void setOauthClientSecret(String oauthClientSecret) {
    this.oauthClientSecret = oauthClientSecret;
  }


  /**
   * The Apple Messages for Business token URL.
   **/
  public AppleAuthentication oauthTokenUrl(String oauthTokenUrl) {
    this.oauthTokenUrl = oauthTokenUrl;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The Apple Messages for Business token URL.")
  @JsonProperty("oauthTokenUrl")
  public String getOauthTokenUrl() {
    return oauthTokenUrl;
  }
  public void setOauthTokenUrl(String oauthTokenUrl) {
    this.oauthTokenUrl = oauthTokenUrl;
  }


  /**
   * The Apple Messages for Business OAuth scope.
   **/
  public AppleAuthentication oauthScope(String oauthScope) {
    this.oauthScope = oauthScope;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The Apple Messages for Business OAuth scope.")
  @JsonProperty("oauthScope")
  public String getOauthScope() {
    return oauthScope;
  }
  public void setOauthScope(String oauthScope) {
    this.oauthScope = oauthScope;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AppleAuthentication appleAuthentication = (AppleAuthentication) o;

    return Objects.equals(this.oauthClientId, appleAuthentication.oauthClientId) &&
            Objects.equals(this.oauthClientSecret, appleAuthentication.oauthClientSecret) &&
            Objects.equals(this.oauthTokenUrl, appleAuthentication.oauthTokenUrl) &&
            Objects.equals(this.oauthScope, appleAuthentication.oauthScope);
  }

  @Override
  public int hashCode() {
    return Objects.hash(oauthClientId, oauthClientSecret, oauthTokenUrl, oauthScope);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AppleAuthentication {\n");
    
    sb.append("    oauthClientId: ").append(toIndentedString(oauthClientId)).append("\n");
    sb.append("    oauthClientSecret: ").append(toIndentedString(oauthClientSecret)).append("\n");
    sb.append("    oauthTokenUrl: ").append(toIndentedString(oauthTokenUrl)).append("\n");
    sb.append("    oauthScope: ").append(toIndentedString(oauthScope)).append("\n");
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

