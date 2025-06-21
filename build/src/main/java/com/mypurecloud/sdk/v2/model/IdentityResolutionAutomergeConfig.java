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
 * IdentityResolutionAutomergeConfig
 */

public class IdentityResolutionAutomergeConfig  implements Serializable {
  
  private Boolean authenticatedWebMessaging = null;

  public IdentityResolutionAutomergeConfig() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * Whether automerging is enabled for Authenticated Webmessaging conversations in this channel.
   **/
  public IdentityResolutionAutomergeConfig authenticatedWebMessaging(Boolean authenticatedWebMessaging) {
    this.authenticatedWebMessaging = authenticatedWebMessaging;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Whether automerging is enabled for Authenticated Webmessaging conversations in this channel.")
  @JsonProperty("authenticatedWebMessaging")
  public Boolean getAuthenticatedWebMessaging() {
    return authenticatedWebMessaging;
  }
  public void setAuthenticatedWebMessaging(Boolean authenticatedWebMessaging) {
    this.authenticatedWebMessaging = authenticatedWebMessaging;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IdentityResolutionAutomergeConfig identityResolutionAutomergeConfig = (IdentityResolutionAutomergeConfig) o;

    return Objects.equals(this.authenticatedWebMessaging, identityResolutionAutomergeConfig.authenticatedWebMessaging);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authenticatedWebMessaging);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IdentityResolutionAutomergeConfig {\n");
    
    sb.append("    authenticatedWebMessaging: ").append(toIndentedString(authenticatedWebMessaging)).append("\n");
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

