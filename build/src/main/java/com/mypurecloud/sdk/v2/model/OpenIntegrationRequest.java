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
import com.mypurecloud.sdk.v2.model.MessagingSettingRequestReference;
import com.mypurecloud.sdk.v2.model.SupportedContentReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import java.io.Serializable;
/**
 * OpenIntegrationRequest
 */

public class OpenIntegrationRequest  implements Serializable {
  
  private String id = null;
  private String name = null;
  private SupportedContentReference supportedContent = null;
  private MessagingSettingRequestReference messagingSetting = null;
  private String outboundNotificationWebhookUrl = null;
  private String outboundNotificationWebhookSignatureSecretToken = null;
  private Map<String, String> webhookHeaders = null;
  private String selfUri = null;

  public OpenIntegrationRequest() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }


  /**
   * The name of the Open messaging integration.
   **/
  public OpenIntegrationRequest name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The name of the Open messaging integration.")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }


  /**
   * Defines the SupportedContent profile configured for an integration
   **/
  public OpenIntegrationRequest supportedContent(SupportedContentReference supportedContent) {
    this.supportedContent = supportedContent;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Defines the SupportedContent profile configured for an integration")
  @JsonProperty("supportedContent")
  public SupportedContentReference getSupportedContent() {
    return supportedContent;
  }
  public void setSupportedContent(SupportedContentReference supportedContent) {
    this.supportedContent = supportedContent;
  }


  /**
   * Defines the message settings to be applied for this integration
   **/
  public OpenIntegrationRequest messagingSetting(MessagingSettingRequestReference messagingSetting) {
    this.messagingSetting = messagingSetting;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Defines the message settings to be applied for this integration")
  @JsonProperty("messagingSetting")
  public MessagingSettingRequestReference getMessagingSetting() {
    return messagingSetting;
  }
  public void setMessagingSetting(MessagingSettingRequestReference messagingSetting) {
    this.messagingSetting = messagingSetting;
  }


  /**
   * The outbound notification webhook URL for the Open messaging integration.
   **/
  public OpenIntegrationRequest outboundNotificationWebhookUrl(String outboundNotificationWebhookUrl) {
    this.outboundNotificationWebhookUrl = outboundNotificationWebhookUrl;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The outbound notification webhook URL for the Open messaging integration.")
  @JsonProperty("outboundNotificationWebhookUrl")
  public String getOutboundNotificationWebhookUrl() {
    return outboundNotificationWebhookUrl;
  }
  public void setOutboundNotificationWebhookUrl(String outboundNotificationWebhookUrl) {
    this.outboundNotificationWebhookUrl = outboundNotificationWebhookUrl;
  }


  /**
   * The outbound notification webhook signature secret token. This token must be longer than 15 characters.
   **/
  public OpenIntegrationRequest outboundNotificationWebhookSignatureSecretToken(String outboundNotificationWebhookSignatureSecretToken) {
    this.outboundNotificationWebhookSignatureSecretToken = outboundNotificationWebhookSignatureSecretToken;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The outbound notification webhook signature secret token. This token must be longer than 15 characters.")
  @JsonProperty("outboundNotificationWebhookSignatureSecretToken")
  public String getOutboundNotificationWebhookSignatureSecretToken() {
    return outboundNotificationWebhookSignatureSecretToken;
  }
  public void setOutboundNotificationWebhookSignatureSecretToken(String outboundNotificationWebhookSignatureSecretToken) {
    this.outboundNotificationWebhookSignatureSecretToken = outboundNotificationWebhookSignatureSecretToken;
  }


  /**
   * The user specified headers for the Open messaging integration.
   **/
  public OpenIntegrationRequest webhookHeaders(Map<String, String> webhookHeaders) {
    this.webhookHeaders = webhookHeaders;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The user specified headers for the Open messaging integration.")
  @JsonProperty("webhookHeaders")
  public Map<String, String> getWebhookHeaders() {
    return webhookHeaders;
  }
  public void setWebhookHeaders(Map<String, String> webhookHeaders) {
    this.webhookHeaders = webhookHeaders;
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
    OpenIntegrationRequest openIntegrationRequest = (OpenIntegrationRequest) o;

    return Objects.equals(this.id, openIntegrationRequest.id) &&
            Objects.equals(this.name, openIntegrationRequest.name) &&
            Objects.equals(this.supportedContent, openIntegrationRequest.supportedContent) &&
            Objects.equals(this.messagingSetting, openIntegrationRequest.messagingSetting) &&
            Objects.equals(this.outboundNotificationWebhookUrl, openIntegrationRequest.outboundNotificationWebhookUrl) &&
            Objects.equals(this.outboundNotificationWebhookSignatureSecretToken, openIntegrationRequest.outboundNotificationWebhookSignatureSecretToken) &&
            Objects.equals(this.webhookHeaders, openIntegrationRequest.webhookHeaders) &&
            Objects.equals(this.selfUri, openIntegrationRequest.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, supportedContent, messagingSetting, outboundNotificationWebhookUrl, outboundNotificationWebhookSignatureSecretToken, webhookHeaders, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpenIntegrationRequest {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    supportedContent: ").append(toIndentedString(supportedContent)).append("\n");
    sb.append("    messagingSetting: ").append(toIndentedString(messagingSetting)).append("\n");
    sb.append("    outboundNotificationWebhookUrl: ").append(toIndentedString(outboundNotificationWebhookUrl)).append("\n");
    sb.append("    outboundNotificationWebhookSignatureSecretToken: ").append(toIndentedString(outboundNotificationWebhookSignatureSecretToken)).append("\n");
    sb.append("    webhookHeaders: ").append(toIndentedString(webhookHeaders)).append("\n");
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

