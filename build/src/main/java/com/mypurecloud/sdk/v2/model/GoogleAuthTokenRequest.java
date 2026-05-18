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
 * GoogleAuthTokenRequest
 */

public class GoogleAuthTokenRequest  implements Serializable {
  
  private String code = null;
  private String redirectUri = null;

  public GoogleAuthTokenRequest() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  public GoogleAuthTokenRequest(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
    }
  }

  
  /**
   * One-time authorization code from Google. See docs: https://developers.google.com/identity/protocols/oauth2
   **/
  public GoogleAuthTokenRequest code(String code) {
    this.code = code;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "One-time authorization code from Google. See docs: https://developers.google.com/identity/protocols/oauth2")
  @JsonProperty("code")
  public String getCode() {
    return code;
  }
  public void setCode(String code) {
    this.code = code;
  }


  /**
   * The origin of the page from which the auth flow was called. Used as redirectUri when exchanging the one-time code for auth token
   **/
  public GoogleAuthTokenRequest redirectUri(String redirectUri) {
    this.redirectUri = redirectUri;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The origin of the page from which the auth flow was called. Used as redirectUri when exchanging the one-time code for auth token")
  @JsonProperty("redirectUri")
  public String getRedirectUri() {
    return redirectUri;
  }
  public void setRedirectUri(String redirectUri) {
    this.redirectUri = redirectUri;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GoogleAuthTokenRequest googleAuthTokenRequest = (GoogleAuthTokenRequest) o;

    return Objects.equals(this.code, googleAuthTokenRequest.code) &&
            Objects.equals(this.redirectUri, googleAuthTokenRequest.redirectUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, redirectUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GoogleAuthTokenRequest {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    redirectUri: ").append(toIndentedString(redirectUri)).append("\n");
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

