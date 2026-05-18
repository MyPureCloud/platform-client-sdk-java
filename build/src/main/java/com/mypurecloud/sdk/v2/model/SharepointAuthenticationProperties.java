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
 * SharepointAuthenticationProperties
 */

public class SharepointAuthenticationProperties  implements Serializable {
  
  private String authenticationUrl = null;
  private String tenantId = null;
  private String clientId = null;
  private String redirectUrl = null;

  public SharepointAuthenticationProperties() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  public SharepointAuthenticationProperties(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
    }
  }

  
  /**
   * The authentication URL for the connection.
   **/
  public SharepointAuthenticationProperties authenticationUrl(String authenticationUrl) {
    this.authenticationUrl = authenticationUrl;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The authentication URL for the connection.")
  @JsonProperty("authenticationUrl")
  public String getAuthenticationUrl() {
    return authenticationUrl;
  }
  public void setAuthenticationUrl(String authenticationUrl) {
    this.authenticationUrl = authenticationUrl;
  }


  /**
   * The tenant ID for the connection.
   **/
  public SharepointAuthenticationProperties tenantId(String tenantId) {
    this.tenantId = tenantId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The tenant ID for the connection.")
  @JsonProperty("tenantId")
  public String getTenantId() {
    return tenantId;
  }
  public void setTenantId(String tenantId) {
    this.tenantId = tenantId;
  }


  /**
   * The client ID for the connection.
   **/
  public SharepointAuthenticationProperties clientId(String clientId) {
    this.clientId = clientId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The client ID for the connection.")
  @JsonProperty("clientId")
  public String getClientId() {
    return clientId;
  }
  public void setClientId(String clientId) {
    this.clientId = clientId;
  }


  /**
   * The redirect URL for the connection.
   **/
  public SharepointAuthenticationProperties redirectUrl(String redirectUrl) {
    this.redirectUrl = redirectUrl;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The redirect URL for the connection.")
  @JsonProperty("redirectUrl")
  public String getRedirectUrl() {
    return redirectUrl;
  }
  public void setRedirectUrl(String redirectUrl) {
    this.redirectUrl = redirectUrl;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SharepointAuthenticationProperties sharepointAuthenticationProperties = (SharepointAuthenticationProperties) o;

    return Objects.equals(this.authenticationUrl, sharepointAuthenticationProperties.authenticationUrl) &&
            Objects.equals(this.tenantId, sharepointAuthenticationProperties.tenantId) &&
            Objects.equals(this.clientId, sharepointAuthenticationProperties.clientId) &&
            Objects.equals(this.redirectUrl, sharepointAuthenticationProperties.redirectUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authenticationUrl, tenantId, clientId, redirectUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SharepointAuthenticationProperties {\n");
    
    sb.append("    authenticationUrl: ").append(toIndentedString(authenticationUrl)).append("\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    redirectUrl: ").append(toIndentedString(redirectUrl)).append("\n");
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

