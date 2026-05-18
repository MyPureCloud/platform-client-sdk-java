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
import com.mypurecloud.sdk.v2.model.SharepointAuthenticationProperties;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * AuthenticationProperties
 */

public class AuthenticationProperties  implements Serializable {
  
  private SharepointAuthenticationProperties sharepoint = null;

  public AuthenticationProperties() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  public AuthenticationProperties(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
    }
  }

  
  /**
   **/
  public AuthenticationProperties sharepoint(SharepointAuthenticationProperties sharepoint) {
    this.sharepoint = sharepoint;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("sharepoint")
  public SharepointAuthenticationProperties getSharepoint() {
    return sharepoint;
  }
  public void setSharepoint(SharepointAuthenticationProperties sharepoint) {
    this.sharepoint = sharepoint;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuthenticationProperties authenticationProperties = (AuthenticationProperties) o;

    return Objects.equals(this.sharepoint, authenticationProperties.sharepoint);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sharepoint);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthenticationProperties {\n");
    
    sb.append("    sharepoint: ").append(toIndentedString(sharepoint)).append("\n");
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

