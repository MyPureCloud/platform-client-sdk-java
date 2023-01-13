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
 * WebDeploymentsRefreshJWTRequest
 */

public class WebDeploymentsRefreshJWTRequest  implements Serializable {
  
  private String refreshToken = null;
  private String deploymentId = null;

  
  /**
   * Refresh token used to issue a new JWT.
   **/
  public WebDeploymentsRefreshJWTRequest refreshToken(String refreshToken) {
    this.refreshToken = refreshToken;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Refresh token used to issue a new JWT.")
  @JsonProperty("refreshToken")
  public String getRefreshToken() {
    return refreshToken;
  }
  public void setRefreshToken(String refreshToken) {
    this.refreshToken = refreshToken;
  }


  /**
   * The WebDeployment ID
   **/
  public WebDeploymentsRefreshJWTRequest deploymentId(String deploymentId) {
    this.deploymentId = deploymentId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The WebDeployment ID")
  @JsonProperty("deploymentId")
  public String getDeploymentId() {
    return deploymentId;
  }
  public void setDeploymentId(String deploymentId) {
    this.deploymentId = deploymentId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WebDeploymentsRefreshJWTRequest webDeploymentsRefreshJWTRequest = (WebDeploymentsRefreshJWTRequest) o;

    return Objects.equals(this.refreshToken, webDeploymentsRefreshJWTRequest.refreshToken) &&
            Objects.equals(this.deploymentId, webDeploymentsRefreshJWTRequest.deploymentId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(refreshToken, deploymentId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebDeploymentsRefreshJWTRequest {\n");
    
    sb.append("    refreshToken: ").append(toIndentedString(refreshToken)).append("\n");
    sb.append("    deploymentId: ").append(toIndentedString(deploymentId)).append("\n");
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

