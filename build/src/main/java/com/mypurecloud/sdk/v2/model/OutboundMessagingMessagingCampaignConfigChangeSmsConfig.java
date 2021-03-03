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
import com.mypurecloud.sdk.v2.model.OutboundMessagingMessagingCampaignConfigChangeResponseRef;
import com.mypurecloud.sdk.v2.model.OutboundMessagingMessagingCampaignConfigChangeSmsPhoneNumberRef;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * OutboundMessagingMessagingCampaignConfigChangeSmsConfig
 */

public class OutboundMessagingMessagingCampaignConfigChangeSmsConfig  implements Serializable {
  
  private String messageColumn = null;
  private String phoneColumn = null;
  private OutboundMessagingMessagingCampaignConfigChangeSmsPhoneNumberRef senderSmsPhoneNumber = null;
  private OutboundMessagingMessagingCampaignConfigChangeResponseRef contentTemplate = null;

  
  /**
   **/
  public OutboundMessagingMessagingCampaignConfigChangeSmsConfig messageColumn(String messageColumn) {
    this.messageColumn = messageColumn;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("messageColumn")
  public String getMessageColumn() {
    return messageColumn;
  }
  public void setMessageColumn(String messageColumn) {
    this.messageColumn = messageColumn;
  }

  
  /**
   **/
  public OutboundMessagingMessagingCampaignConfigChangeSmsConfig phoneColumn(String phoneColumn) {
    this.phoneColumn = phoneColumn;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("phoneColumn")
  public String getPhoneColumn() {
    return phoneColumn;
  }
  public void setPhoneColumn(String phoneColumn) {
    this.phoneColumn = phoneColumn;
  }

  
  /**
   **/
  public OutboundMessagingMessagingCampaignConfigChangeSmsConfig senderSmsPhoneNumber(OutboundMessagingMessagingCampaignConfigChangeSmsPhoneNumberRef senderSmsPhoneNumber) {
    this.senderSmsPhoneNumber = senderSmsPhoneNumber;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("senderSmsPhoneNumber")
  public OutboundMessagingMessagingCampaignConfigChangeSmsPhoneNumberRef getSenderSmsPhoneNumber() {
    return senderSmsPhoneNumber;
  }
  public void setSenderSmsPhoneNumber(OutboundMessagingMessagingCampaignConfigChangeSmsPhoneNumberRef senderSmsPhoneNumber) {
    this.senderSmsPhoneNumber = senderSmsPhoneNumber;
  }

  
  /**
   **/
  public OutboundMessagingMessagingCampaignConfigChangeSmsConfig contentTemplate(OutboundMessagingMessagingCampaignConfigChangeResponseRef contentTemplate) {
    this.contentTemplate = contentTemplate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("contentTemplate")
  public OutboundMessagingMessagingCampaignConfigChangeResponseRef getContentTemplate() {
    return contentTemplate;
  }
  public void setContentTemplate(OutboundMessagingMessagingCampaignConfigChangeResponseRef contentTemplate) {
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
    OutboundMessagingMessagingCampaignConfigChangeSmsConfig outboundMessagingMessagingCampaignConfigChangeSmsConfig = (OutboundMessagingMessagingCampaignConfigChangeSmsConfig) o;
    return Objects.equals(this.messageColumn, outboundMessagingMessagingCampaignConfigChangeSmsConfig.messageColumn) &&
        Objects.equals(this.phoneColumn, outboundMessagingMessagingCampaignConfigChangeSmsConfig.phoneColumn) &&
        Objects.equals(this.senderSmsPhoneNumber, outboundMessagingMessagingCampaignConfigChangeSmsConfig.senderSmsPhoneNumber) &&
        Objects.equals(this.contentTemplate, outboundMessagingMessagingCampaignConfigChangeSmsConfig.contentTemplate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(messageColumn, phoneColumn, senderSmsPhoneNumber, contentTemplate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OutboundMessagingMessagingCampaignConfigChangeSmsConfig {\n");
    
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

