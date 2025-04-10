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
import com.mypurecloud.sdk.v2.model.OutboundMessagingEmailCampaignConfigChangeResponseRef;
import com.mypurecloud.sdk.v2.model.OutboundMessagingEmailCampaignConfigChangeSmsPhoneNumberRef;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * An outbound-messaging messaging campaign SMS Config
 */
@ApiModel(description = "An outbound-messaging messaging campaign SMS Config")

public class OutboundMessagingEmailCampaignConfigChangeSmsConfig  implements Serializable {
  
  private String messageColumn = null;
  private String phoneColumn = null;
  private OutboundMessagingEmailCampaignConfigChangeSmsPhoneNumberRef senderSmsPhoneNumber = null;
  private OutboundMessagingEmailCampaignConfigChangeResponseRef contentTemplate = null;

  public OutboundMessagingEmailCampaignConfigChangeSmsConfig() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * The Contact List column specifying the message to send to the contact.
   **/
  public OutboundMessagingEmailCampaignConfigChangeSmsConfig messageColumn(String messageColumn) {
    this.messageColumn = messageColumn;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The Contact List column specifying the message to send to the contact.")
  @JsonProperty("messageColumn")
  public String getMessageColumn() {
    return messageColumn;
  }
  public void setMessageColumn(String messageColumn) {
    this.messageColumn = messageColumn;
  }


  /**
   * The Contact List column specifying the phone number to send a message to.
   **/
  public OutboundMessagingEmailCampaignConfigChangeSmsConfig phoneColumn(String phoneColumn) {
    this.phoneColumn = phoneColumn;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The Contact List column specifying the phone number to send a message to.")
  @JsonProperty("phoneColumn")
  public String getPhoneColumn() {
    return phoneColumn;
  }
  public void setPhoneColumn(String phoneColumn) {
    this.phoneColumn = phoneColumn;
  }


  /**
   **/
  public OutboundMessagingEmailCampaignConfigChangeSmsConfig senderSmsPhoneNumber(OutboundMessagingEmailCampaignConfigChangeSmsPhoneNumberRef senderSmsPhoneNumber) {
    this.senderSmsPhoneNumber = senderSmsPhoneNumber;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("senderSmsPhoneNumber")
  public OutboundMessagingEmailCampaignConfigChangeSmsPhoneNumberRef getSenderSmsPhoneNumber() {
    return senderSmsPhoneNumber;
  }
  public void setSenderSmsPhoneNumber(OutboundMessagingEmailCampaignConfigChangeSmsPhoneNumberRef senderSmsPhoneNumber) {
    this.senderSmsPhoneNumber = senderSmsPhoneNumber;
  }


  /**
   **/
  public OutboundMessagingEmailCampaignConfigChangeSmsConfig contentTemplate(OutboundMessagingEmailCampaignConfigChangeResponseRef contentTemplate) {
    this.contentTemplate = contentTemplate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("contentTemplate")
  public OutboundMessagingEmailCampaignConfigChangeResponseRef getContentTemplate() {
    return contentTemplate;
  }
  public void setContentTemplate(OutboundMessagingEmailCampaignConfigChangeResponseRef contentTemplate) {
    this.contentTemplate = contentTemplate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OutboundMessagingEmailCampaignConfigChangeSmsConfig outboundMessagingEmailCampaignConfigChangeSmsConfig = (OutboundMessagingEmailCampaignConfigChangeSmsConfig) o;

    return Objects.equals(this.messageColumn, outboundMessagingEmailCampaignConfigChangeSmsConfig.messageColumn) &&
            Objects.equals(this.phoneColumn, outboundMessagingEmailCampaignConfigChangeSmsConfig.phoneColumn) &&
            Objects.equals(this.senderSmsPhoneNumber, outboundMessagingEmailCampaignConfigChangeSmsConfig.senderSmsPhoneNumber) &&
            Objects.equals(this.contentTemplate, outboundMessagingEmailCampaignConfigChangeSmsConfig.contentTemplate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(messageColumn, phoneColumn, senderSmsPhoneNumber, contentTemplate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OutboundMessagingEmailCampaignConfigChangeSmsConfig {\n");
    
    sb.append("    messageColumn: ").append(toIndentedString(messageColumn)).append("\n");
    sb.append("    phoneColumn: ").append(toIndentedString(phoneColumn)).append("\n");
    sb.append("    senderSmsPhoneNumber: ").append(toIndentedString(senderSmsPhoneNumber)).append("\n");
    sb.append("    contentTemplate: ").append(toIndentedString(contentTemplate)).append("\n");
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

