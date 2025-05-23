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
import com.mypurecloud.sdk.v2.model.DomainEntityRef;
import com.mypurecloud.sdk.v2.model.SmsPhoneNumberRef;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * SmsConfig
 */

public class SmsConfig  implements Serializable {
  
  private String messageColumn = null;
  private String phoneColumn = null;
  private SmsPhoneNumberRef senderSmsPhoneNumber = null;
  private DomainEntityRef contentTemplate = null;

  public SmsConfig() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * The Contact List column specifying the message to send to the contact.
   **/
  public SmsConfig messageColumn(String messageColumn) {
    this.messageColumn = messageColumn;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The Contact List column specifying the message to send to the contact.")
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
  public SmsConfig phoneColumn(String phoneColumn) {
    this.phoneColumn = phoneColumn;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The Contact List column specifying the phone number to send a message to.")
  @JsonProperty("phoneColumn")
  public String getPhoneColumn() {
    return phoneColumn;
  }
  public void setPhoneColumn(String phoneColumn) {
    this.phoneColumn = phoneColumn;
  }


  /**
   * A reference to the SMS Phone Number that will be used as the sender of a message.
   **/
  public SmsConfig senderSmsPhoneNumber(SmsPhoneNumberRef senderSmsPhoneNumber) {
    this.senderSmsPhoneNumber = senderSmsPhoneNumber;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "A reference to the SMS Phone Number that will be used as the sender of a message.")
  @JsonProperty("senderSmsPhoneNumber")
  public SmsPhoneNumberRef getSenderSmsPhoneNumber() {
    return senderSmsPhoneNumber;
  }
  public void setSenderSmsPhoneNumber(SmsPhoneNumberRef senderSmsPhoneNumber) {
    this.senderSmsPhoneNumber = senderSmsPhoneNumber;
  }


  /**
   * The content template used to formulate the message to send to the contact.
   **/
  public SmsConfig contentTemplate(DomainEntityRef contentTemplate) {
    this.contentTemplate = contentTemplate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The content template used to formulate the message to send to the contact.")
  @JsonProperty("contentTemplate")
  public DomainEntityRef getContentTemplate() {
    return contentTemplate;
  }
  public void setContentTemplate(DomainEntityRef contentTemplate) {
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
    SmsConfig smsConfig = (SmsConfig) o;

    return Objects.equals(this.messageColumn, smsConfig.messageColumn) &&
            Objects.equals(this.phoneColumn, smsConfig.phoneColumn) &&
            Objects.equals(this.senderSmsPhoneNumber, smsConfig.senderSmsPhoneNumber) &&
            Objects.equals(this.contentTemplate, smsConfig.contentTemplate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(messageColumn, phoneColumn, senderSmsPhoneNumber, contentTemplate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SmsConfig {\n");
    
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

