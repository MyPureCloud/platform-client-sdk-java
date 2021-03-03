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
import com.mypurecloud.sdk.v2.model.DomainEntityRef;
import com.mypurecloud.sdk.v2.model.WebChatConfig;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * WebChatDeployment
 */

public class WebChatDeployment  implements Serializable {
  
  private String id = null;
  private String name = null;
  private String description = null;
  private Boolean authenticationRequired = null;
  private String authenticationUrl = null;
  private Boolean disabled = null;
  private WebChatConfig webChatConfig = null;
  private List<String> allowedDomains = new ArrayList<String>();
  private DomainEntityRef flow = null;
  private String selfUri = null;

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  
  /**
   **/
  public WebChatDeployment name(String name) {
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
   **/
  public WebChatDeployment description(String description) {
    this.description = description;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  
  /**
   **/
  public WebChatDeployment authenticationRequired(Boolean authenticationRequired) {
    this.authenticationRequired = authenticationRequired;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("authenticationRequired")
  public Boolean getAuthenticationRequired() {
    return authenticationRequired;
  }
  public void setAuthenticationRequired(Boolean authenticationRequired) {
    this.authenticationRequired = authenticationRequired;
  }

  
  /**
   * URL for third party service authenticating web chat clients. See https://github.com/MyPureCloud/authenticated-web-chat-server-examples
   **/
  public WebChatDeployment authenticationUrl(String authenticationUrl) {
    this.authenticationUrl = authenticationUrl;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "URL for third party service authenticating web chat clients. See https://github.com/MyPureCloud/authenticated-web-chat-server-examples")
  @JsonProperty("authenticationUrl")
  public String getAuthenticationUrl() {
    return authenticationUrl;
  }
  public void setAuthenticationUrl(String authenticationUrl) {
    this.authenticationUrl = authenticationUrl;
  }

  
  /**
   **/
  public WebChatDeployment disabled(Boolean disabled) {
    this.disabled = disabled;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("disabled")
  public Boolean getDisabled() {
    return disabled;
  }
  public void setDisabled(Boolean disabled) {
    this.disabled = disabled;
  }

  
  /**
   **/
  public WebChatDeployment webChatConfig(WebChatConfig webChatConfig) {
    this.webChatConfig = webChatConfig;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("webChatConfig")
  public WebChatConfig getWebChatConfig() {
    return webChatConfig;
  }
  public void setWebChatConfig(WebChatConfig webChatConfig) {
    this.webChatConfig = webChatConfig;
  }

  
  /**
   **/
  public WebChatDeployment allowedDomains(List<String> allowedDomains) {
    this.allowedDomains = allowedDomains;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("allowedDomains")
  public List<String> getAllowedDomains() {
    return allowedDomains;
  }
  public void setAllowedDomains(List<String> allowedDomains) {
    this.allowedDomains = allowedDomains;
  }

  
  /**
   * The URI of the Inbound Chat Flow to run when new chats are initiated under this Deployment.
   **/
  public WebChatDeployment flow(DomainEntityRef flow) {
    this.flow = flow;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The URI of the Inbound Chat Flow to run when new chats are initiated under this Deployment.")
  @JsonProperty("flow")
  public DomainEntityRef getFlow() {
    return flow;
  }
  public void setFlow(DomainEntityRef flow) {
    this.flow = flow;
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
    WebChatDeployment webChatDeployment = (WebChatDeployment) o;
    return Objects.equals(this.id, webChatDeployment.id) &&
        Objects.equals(this.name, webChatDeployment.name) &&
        Objects.equals(this.description, webChatDeployment.description) &&
        Objects.equals(this.authenticationRequired, webChatDeployment.authenticationRequired) &&
        Objects.equals(this.authenticationUrl, webChatDeployment.authenticationUrl) &&
        Objects.equals(this.disabled, webChatDeployment.disabled) &&
        Objects.equals(this.webChatConfig, webChatDeployment.webChatConfig) &&
        Objects.equals(this.allowedDomains, webChatDeployment.allowedDomains) &&
        Objects.equals(this.flow, webChatDeployment.flow) &&
        Objects.equals(this.selfUri, webChatDeployment.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, description, authenticationRequired, authenticationUrl, disabled, webChatConfig, allowedDomains, flow, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebChatDeployment {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    authenticationRequired: ").append(toIndentedString(authenticationRequired)).append("\n");
    sb.append("    authenticationUrl: ").append(toIndentedString(authenticationUrl)).append("\n");
    sb.append("    disabled: ").append(toIndentedString(disabled)).append("\n");
    sb.append("    webChatConfig: ").append(toIndentedString(webChatConfig)).append("\n");
    sb.append("    allowedDomains: ").append(toIndentedString(allowedDomains)).append("\n");
    sb.append("    flow: ").append(toIndentedString(flow)).append("\n");
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

