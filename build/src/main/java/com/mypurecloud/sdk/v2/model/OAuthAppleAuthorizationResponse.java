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
import com.mypurecloud.sdk.v2.model.OAuthAppleAuthorizationResponseError;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * OAuthAppleAuthorizationResponse
 */

public class OAuthAppleAuthorizationResponse  implements Serializable {
  
  private String redirectUrl = null;
  private OAuthAppleAuthorizationResponseError error = null;

  public OAuthAppleAuthorizationResponse() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * The redirected url
   **/
  public OAuthAppleAuthorizationResponse redirectUrl(String redirectUrl) {
    this.redirectUrl = redirectUrl;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The redirected url")
  @JsonProperty("redirectUrl")
  public String getRedirectUrl() {
    return redirectUrl;
  }
  public void setRedirectUrl(String redirectUrl) {
    this.redirectUrl = redirectUrl;
  }


  /**
   * The error object
   **/
  public OAuthAppleAuthorizationResponse error(OAuthAppleAuthorizationResponseError error) {
    this.error = error;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The error object")
  @JsonProperty("error")
  public OAuthAppleAuthorizationResponseError getError() {
    return error;
  }
  public void setError(OAuthAppleAuthorizationResponseError error) {
    this.error = error;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OAuthAppleAuthorizationResponse oAuthAppleAuthorizationResponse = (OAuthAppleAuthorizationResponse) o;

    return Objects.equals(this.redirectUrl, oAuthAppleAuthorizationResponse.redirectUrl) &&
            Objects.equals(this.error, oAuthAppleAuthorizationResponse.error);
  }

  @Override
  public int hashCode() {
    return Objects.hash(redirectUrl, error);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OAuthAppleAuthorizationResponse {\n");
    
    sb.append("    redirectUrl: ").append(toIndentedString(redirectUrl)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
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

