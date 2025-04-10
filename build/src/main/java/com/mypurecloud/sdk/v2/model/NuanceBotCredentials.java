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
 * Model for a Nuance bot credentials
 */
@ApiModel(description = "Model for a Nuance bot credentials")

public class NuanceBotCredentials  implements Serializable {
  
  private String appId = null;
  private String clientId = null;
  private String clientSecret = null;
  private Boolean clientSecretProvided = null;

  public NuanceBotCredentials() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * The application ID
   **/
  public NuanceBotCredentials appId(String appId) {
    this.appId = appId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The application ID")
  @JsonProperty("appId")
  public String getAppId() {
    return appId;
  }
  public void setAppId(String appId) {
    this.appId = appId;
  }


  /**
   * The credentials client ID
   **/
  public NuanceBotCredentials clientId(String clientId) {
    this.clientId = clientId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The credentials client ID")
  @JsonProperty("clientId")
  public String getClientId() {
    return clientId;
  }
  public void setClientId(String clientId) {
    this.clientId = clientId;
  }


  /**
   * The credentials client secret
   **/
  public NuanceBotCredentials clientSecret(String clientSecret) {
    this.clientSecret = clientSecret;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The credentials client secret")
  @JsonProperty("clientSecret")
  public String getClientSecret() {
    return clientSecret;
  }
  public void setClientSecret(String clientSecret) {
    this.clientSecret = clientSecret;
  }


  /**
   * True if the credentials secret is set (but not returned due to security reasons)
   **/
  public NuanceBotCredentials clientSecretProvided(Boolean clientSecretProvided) {
    this.clientSecretProvided = clientSecretProvided;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "True if the credentials secret is set (but not returned due to security reasons)")
  @JsonProperty("clientSecretProvided")
  public Boolean getClientSecretProvided() {
    return clientSecretProvided;
  }
  public void setClientSecretProvided(Boolean clientSecretProvided) {
    this.clientSecretProvided = clientSecretProvided;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NuanceBotCredentials nuanceBotCredentials = (NuanceBotCredentials) o;

    return Objects.equals(this.appId, nuanceBotCredentials.appId) &&
            Objects.equals(this.clientId, nuanceBotCredentials.clientId) &&
            Objects.equals(this.clientSecret, nuanceBotCredentials.clientSecret) &&
            Objects.equals(this.clientSecretProvided, nuanceBotCredentials.clientSecretProvided);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appId, clientId, clientSecret, clientSecretProvided);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NuanceBotCredentials {\n");
    
    sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    clientSecret: ").append(toIndentedString(clientSecret)).append("\n");
    sb.append("    clientSecretProvided: ").append(toIndentedString(clientSecretProvided)).append("\n");
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

