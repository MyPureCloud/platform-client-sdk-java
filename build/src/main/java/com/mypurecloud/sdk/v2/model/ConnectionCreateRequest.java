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
 * ConnectionCreateRequest
 */

public class ConnectionCreateRequest  implements Serializable {
  
  private String name = null;
  private String integrationId = null;
  private String redirectUrl = null;

  public ConnectionCreateRequest() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * The name of the Connection
   **/
  public ConnectionCreateRequest name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The name of the Connection")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }


  /**
   * Integration ID of the Connection
   **/
  public ConnectionCreateRequest integrationId(String integrationId) {
    this.integrationId = integrationId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Integration ID of the Connection")
  @JsonProperty("integrationId")
  public String getIntegrationId() {
    return integrationId;
  }
  public void setIntegrationId(String integrationId) {
    this.integrationId = integrationId;
  }


  /**
   * Redirect Url for the Oauth flow
   **/
  public ConnectionCreateRequest redirectUrl(String redirectUrl) {
    this.redirectUrl = redirectUrl;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Redirect Url for the Oauth flow")
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
    ConnectionCreateRequest connectionCreateRequest = (ConnectionCreateRequest) o;

    return Objects.equals(this.name, connectionCreateRequest.name) &&
            Objects.equals(this.integrationId, connectionCreateRequest.integrationId) &&
            Objects.equals(this.redirectUrl, connectionCreateRequest.redirectUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, integrationId, redirectUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConnectionCreateRequest {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    integrationId: ").append(toIndentedString(integrationId)).append("\n");
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

