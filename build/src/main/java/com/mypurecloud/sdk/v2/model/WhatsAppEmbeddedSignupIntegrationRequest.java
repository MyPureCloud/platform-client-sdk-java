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

import java.io.Serializable;
/**
 * WhatsAppEmbeddedSignupIntegrationRequest
 */

public class WhatsAppEmbeddedSignupIntegrationRequest  implements Serializable {
  
  private String id = null;
  private String name = null;
  private SupportedContentReference supportedContent = null;
  private MessagingSettingRequestReference messagingSetting = null;
  private String embeddedSignupAccessToken = null;
  private String selfUri = null;

  public WhatsAppEmbeddedSignupIntegrationRequest() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }


  /**
   * The name of the WhatsApp Integration
   **/
  public WhatsAppEmbeddedSignupIntegrationRequest name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The name of the WhatsApp Integration")
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
  public WhatsAppEmbeddedSignupIntegrationRequest supportedContent(SupportedContentReference supportedContent) {
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
  public WhatsAppEmbeddedSignupIntegrationRequest messagingSetting(MessagingSettingRequestReference messagingSetting) {
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
   * The access token returned from the embedded signup flow
   **/
  public WhatsAppEmbeddedSignupIntegrationRequest embeddedSignupAccessToken(String embeddedSignupAccessToken) {
    this.embeddedSignupAccessToken = embeddedSignupAccessToken;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The access token returned from the embedded signup flow")
  @JsonProperty("embeddedSignupAccessToken")
  public String getEmbeddedSignupAccessToken() {
    return embeddedSignupAccessToken;
  }
  public void setEmbeddedSignupAccessToken(String embeddedSignupAccessToken) {
    this.embeddedSignupAccessToken = embeddedSignupAccessToken;
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
    WhatsAppEmbeddedSignupIntegrationRequest whatsAppEmbeddedSignupIntegrationRequest = (WhatsAppEmbeddedSignupIntegrationRequest) o;

    return Objects.equals(this.id, whatsAppEmbeddedSignupIntegrationRequest.id) &&
            Objects.equals(this.name, whatsAppEmbeddedSignupIntegrationRequest.name) &&
            Objects.equals(this.supportedContent, whatsAppEmbeddedSignupIntegrationRequest.supportedContent) &&
            Objects.equals(this.messagingSetting, whatsAppEmbeddedSignupIntegrationRequest.messagingSetting) &&
            Objects.equals(this.embeddedSignupAccessToken, whatsAppEmbeddedSignupIntegrationRequest.embeddedSignupAccessToken) &&
            Objects.equals(this.selfUri, whatsAppEmbeddedSignupIntegrationRequest.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, supportedContent, messagingSetting, embeddedSignupAccessToken, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WhatsAppEmbeddedSignupIntegrationRequest {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    supportedContent: ").append(toIndentedString(supportedContent)).append("\n");
    sb.append("    messagingSetting: ").append(toIndentedString(messagingSetting)).append("\n");
    sb.append("    embeddedSignupAccessToken: ").append(toIndentedString(embeddedSignupAccessToken)).append("\n");
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

