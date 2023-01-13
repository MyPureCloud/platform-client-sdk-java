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
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * WebDeploymentsAuthorizationResponse
 */

public class WebDeploymentsAuthorizationResponse  implements Serializable {
  
  private String refreshToken = null;
  private String jwt = null;

  
  /**
   * Refresh token used to issue a new JWT.
   **/
  public WebDeploymentsAuthorizationResponse refreshToken(String refreshToken) {
    this.refreshToken = refreshToken;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Refresh token used to issue a new JWT.")
  @JsonProperty("refreshToken")
  public String getRefreshToken() {
    return refreshToken;
  }
  public void setRefreshToken(String refreshToken) {
    this.refreshToken = refreshToken;
  }


  /**
   **/
  public WebDeploymentsAuthorizationResponse jwt(String jwt) {
    this.jwt = jwt;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("jwt")
  public String getJwt() {
    return jwt;
  }
  public void setJwt(String jwt) {
    this.jwt = jwt;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WebDeploymentsAuthorizationResponse webDeploymentsAuthorizationResponse = (WebDeploymentsAuthorizationResponse) o;

    return Objects.equals(this.refreshToken, webDeploymentsAuthorizationResponse.refreshToken) &&
            Objects.equals(this.jwt, webDeploymentsAuthorizationResponse.jwt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(refreshToken, jwt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebDeploymentsAuthorizationResponse {\n");
    
    sb.append("    refreshToken: ").append(toIndentedString(refreshToken)).append("\n");
    sb.append("    jwt: ").append(toIndentedString(jwt)).append("\n");
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

