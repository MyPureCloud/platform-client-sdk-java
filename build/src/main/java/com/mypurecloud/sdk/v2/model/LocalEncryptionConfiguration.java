package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import java.util.Objects;
import java.io.IOException;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * LocalEncryptionConfiguration
 */

public class LocalEncryptionConfiguration  implements Serializable {
  
  private String id = null;
  private String name = null;
  private String url = null;
  private String apiId = null;
  private String apiKey = null;
  private String selfUri = null;

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  
  /**
   **/
  public LocalEncryptionConfiguration name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   * The url for decryption. This must specify the path to where Purecloud can requests decryption
   **/
  public LocalEncryptionConfiguration url(String url) {
    this.url = url;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The url for decryption. This must specify the path to where Purecloud can requests decryption")
  @JsonProperty("url")
  public String getUrl() {
    return url;
  }
  public void setUrl(String url) {
    this.url = url;
  }

  
  /**
   * The api id for Hawk Authentication.
   **/
  public LocalEncryptionConfiguration apiId(String apiId) {
    this.apiId = apiId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The api id for Hawk Authentication.")
  @JsonProperty("apiId")
  public String getApiId() {
    return apiId;
  }
  public void setApiId(String apiId) {
    this.apiId = apiId;
  }

  
  /**
   * The api shared symmetric key used for hawk authentication
   **/
  public LocalEncryptionConfiguration apiKey(String apiKey) {
    this.apiKey = apiKey;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The api shared symmetric key used for hawk authentication")
  @JsonProperty("apiKey")
  public String getApiKey() {
    return apiKey;
  }
  public void setApiKey(String apiKey) {
    this.apiKey = apiKey;
  }

  
  @ApiModelProperty(example = "null", value = "The URI for this object")
  @JsonProperty("selfUri")
  public String getSelfUri() {
    return selfUri;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LocalEncryptionConfiguration localEncryptionConfiguration = (LocalEncryptionConfiguration) o;
    return Objects.equals(this.id, localEncryptionConfiguration.id) &&
        Objects.equals(this.name, localEncryptionConfiguration.name) &&
        Objects.equals(this.url, localEncryptionConfiguration.url) &&
        Objects.equals(this.apiId, localEncryptionConfiguration.apiId) &&
        Objects.equals(this.apiKey, localEncryptionConfiguration.apiKey) &&
        Objects.equals(this.selfUri, localEncryptionConfiguration.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, url, apiId, apiKey, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LocalEncryptionConfiguration {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    apiId: ").append(toIndentedString(apiId)).append("\n");
    sb.append("    apiKey: ").append(toIndentedString(apiKey)).append("\n");
    sb.append("    selfUri: ").append(toIndentedString(selfUri)).append("\n");
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

