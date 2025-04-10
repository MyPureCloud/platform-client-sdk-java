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
 * WebDeploymentsOAuthRequestParameters
 */

public class WebDeploymentsOAuthRequestParameters  implements Serializable {
  
  private String code = null;
  private String redirectUri = null;
  private String nonce = null;
  private Integer maxAge = null;
  private String codeVerifier = null;
  private String iss = null;

  public WebDeploymentsOAuthRequestParameters() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * The authorization code to be sent to the authentication server during the token request.  Refer to https://openid.net/specs/openid-connect-core-1_0.html#AuthRequest
   **/
  public WebDeploymentsOAuthRequestParameters code(String code) {
    this.code = code;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The authorization code to be sent to the authentication server during the token request.  Refer to https://openid.net/specs/openid-connect-core-1_0.html#AuthRequest")
  @JsonProperty("code")
  public String getCode() {
    return code;
  }
  public void setCode(String code) {
    this.code = code;
  }


  /**
   * Redirect URI sent in the \"Authentication Request\"Refer to https://openid.net/specs/openid-connect-core-1_0.html#AuthRequest
   **/
  public WebDeploymentsOAuthRequestParameters redirectUri(String redirectUri) {
    this.redirectUri = redirectUri;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Redirect URI sent in the \"Authentication Request\"Refer to https://openid.net/specs/openid-connect-core-1_0.html#AuthRequest")
  @JsonProperty("redirectUri")
  public String getRedirectUri() {
    return redirectUri;
  }
  public void setRedirectUri(String redirectUri) {
    this.redirectUri = redirectUri;
  }


  /**
   * Required if provided in the \"Authentication Request\". Otherwise should be empty.String value used to associate a Client session with an ID Token, and to mitigate replay attacks. The value is passed through unmodified from the Authentication Request to the ID Token. Refer to https://openid.net/specs/openid-connect-core-1_0.html#AuthRequest
   **/
  public WebDeploymentsOAuthRequestParameters nonce(String nonce) {
    this.nonce = nonce;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Required if provided in the \"Authentication Request\". Otherwise should be empty.String value used to associate a Client session with an ID Token, and to mitigate replay attacks. The value is passed through unmodified from the Authentication Request to the ID Token. Refer to https://openid.net/specs/openid-connect-core-1_0.html#AuthRequest")
  @JsonProperty("nonce")
  public String getNonce() {
    return nonce;
  }
  public void setNonce(String nonce) {
    this.nonce = nonce;
  }


  /**
   * Required if provided in the  \"Authentication Request\". Otherwise should be empty.Specifies the allowable elapsed time in seconds since the last time the End-User was actively authenticated.Refer to https://openid.net/specs/openid-connect-core-1_0.html#AuthRequest
   **/
  public WebDeploymentsOAuthRequestParameters maxAge(Integer maxAge) {
    this.maxAge = maxAge;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Required if provided in the  \"Authentication Request\". Otherwise should be empty.Specifies the allowable elapsed time in seconds since the last time the End-User was actively authenticated.Refer to https://openid.net/specs/openid-connect-core-1_0.html#AuthRequest")
  @JsonProperty("maxAge")
  public Integer getMaxAge() {
    return maxAge;
  }
  public void setMaxAge(Integer maxAge) {
    this.maxAge = maxAge;
  }


  /**
   * Required if authorizing using Proof Key for Code Exchange (PKCE). Otherwise should be empty.Random URL-safe string with a minimum length of 43 characters generated at start of authorization flow to mitigate the threat of having the authorization code intercepted. Refer to https://datatracker.ietf.org/doc/html/rfc7636
   **/
  public WebDeploymentsOAuthRequestParameters codeVerifier(String codeVerifier) {
    this.codeVerifier = codeVerifier;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Required if authorizing using Proof Key for Code Exchange (PKCE). Otherwise should be empty.Random URL-safe string with a minimum length of 43 characters generated at start of authorization flow to mitigate the threat of having the authorization code intercepted. Refer to https://datatracker.ietf.org/doc/html/rfc7636")
  @JsonProperty("codeVerifier")
  public String getCodeVerifier() {
    return codeVerifier;
  }
  public void setCodeVerifier(String codeVerifier) {
    this.codeVerifier = codeVerifier;
  }


  /**
   * Optional parameter. Set it if authorization server discovery metadata authorization_response_iss_parameter_supported is enabled. Refer to https://datatracker.ietf.org/doc/html/rfc9207
   **/
  public WebDeploymentsOAuthRequestParameters iss(String iss) {
    this.iss = iss;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Optional parameter. Set it if authorization server discovery metadata authorization_response_iss_parameter_supported is enabled. Refer to https://datatracker.ietf.org/doc/html/rfc9207")
  @JsonProperty("iss")
  public String getIss() {
    return iss;
  }
  public void setIss(String iss) {
    this.iss = iss;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WebDeploymentsOAuthRequestParameters webDeploymentsOAuthRequestParameters = (WebDeploymentsOAuthRequestParameters) o;

    return Objects.equals(this.code, webDeploymentsOAuthRequestParameters.code) &&
            Objects.equals(this.redirectUri, webDeploymentsOAuthRequestParameters.redirectUri) &&
            Objects.equals(this.nonce, webDeploymentsOAuthRequestParameters.nonce) &&
            Objects.equals(this.maxAge, webDeploymentsOAuthRequestParameters.maxAge) &&
            Objects.equals(this.codeVerifier, webDeploymentsOAuthRequestParameters.codeVerifier) &&
            Objects.equals(this.iss, webDeploymentsOAuthRequestParameters.iss);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, redirectUri, nonce, maxAge, codeVerifier, iss);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebDeploymentsOAuthRequestParameters {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    redirectUri: ").append(toIndentedString(redirectUri)).append("\n");
    sb.append("    nonce: ").append(toIndentedString(nonce)).append("\n");
    sb.append("    maxAge: ").append(toIndentedString(maxAge)).append("\n");
    sb.append("    codeVerifier: ").append(toIndentedString(codeVerifier)).append("\n");
    sb.append("    iss: ").append(toIndentedString(iss)).append("\n");
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

