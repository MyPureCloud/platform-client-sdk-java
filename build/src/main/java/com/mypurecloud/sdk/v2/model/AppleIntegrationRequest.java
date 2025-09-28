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
 * AppleIntegrationRequest
 */

public class AppleIntegrationRequest  implements Serializable {
  
  private String id = null;
  private String name = null;
  private SupportedContentReference supportedContent = null;
  private MessagingSettingRequestReference messagingSetting = null;
  private String messagesForBusinessId = null;
  private String businessName = null;
  private String logoUrl = null;
  private String selfUri = null;

  public AppleIntegrationRequest() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }


  /**
   * The name of the Apple messaging integration.
   **/
  public AppleIntegrationRequest name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The name of the Apple messaging integration.")
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
  public AppleIntegrationRequest supportedContent(SupportedContentReference supportedContent) {
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
  public AppleIntegrationRequest messagingSetting(MessagingSettingRequestReference messagingSetting) {
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
   * The Apple Messages for Business Id for the Apple messaging integration.
   **/
  public AppleIntegrationRequest messagesForBusinessId(String messagesForBusinessId) {
    this.messagesForBusinessId = messagesForBusinessId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The Apple Messages for Business Id for the Apple messaging integration.")
  @JsonProperty("messagesForBusinessId")
  public String getMessagesForBusinessId() {
    return messagesForBusinessId;
  }
  public void setMessagesForBusinessId(String messagesForBusinessId) {
    this.messagesForBusinessId = messagesForBusinessId;
  }


  /**
   * The name of the business.
   **/
  public AppleIntegrationRequest businessName(String businessName) {
    this.businessName = businessName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The name of the business.")
  @JsonProperty("businessName")
  public String getBusinessName() {
    return businessName;
  }
  public void setBusinessName(String businessName) {
    this.businessName = businessName;
  }


  /**
   * The url of the businesses logo.
   **/
  public AppleIntegrationRequest logoUrl(String logoUrl) {
    this.logoUrl = logoUrl;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The url of the businesses logo.")
  @JsonProperty("logoUrl")
  public String getLogoUrl() {
    return logoUrl;
  }
  public void setLogoUrl(String logoUrl) {
    this.logoUrl = logoUrl;
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
    AppleIntegrationRequest appleIntegrationRequest = (AppleIntegrationRequest) o;

    return Objects.equals(this.id, appleIntegrationRequest.id) &&
            Objects.equals(this.name, appleIntegrationRequest.name) &&
            Objects.equals(this.supportedContent, appleIntegrationRequest.supportedContent) &&
            Objects.equals(this.messagingSetting, appleIntegrationRequest.messagingSetting) &&
            Objects.equals(this.messagesForBusinessId, appleIntegrationRequest.messagesForBusinessId) &&
            Objects.equals(this.businessName, appleIntegrationRequest.businessName) &&
            Objects.equals(this.logoUrl, appleIntegrationRequest.logoUrl) &&
            Objects.equals(this.selfUri, appleIntegrationRequest.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, supportedContent, messagingSetting, messagesForBusinessId, businessName, logoUrl, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AppleIntegrationRequest {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    supportedContent: ").append(toIndentedString(supportedContent)).append("\n");
    sb.append("    messagingSetting: ").append(toIndentedString(messagingSetting)).append("\n");
    sb.append("    messagesForBusinessId: ").append(toIndentedString(messagesForBusinessId)).append("\n");
    sb.append("    businessName: ").append(toIndentedString(businessName)).append("\n");
    sb.append("    logoUrl: ").append(toIndentedString(logoUrl)).append("\n");
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

