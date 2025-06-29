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
import com.mypurecloud.sdk.v2.model.ConversationContentLocation;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * RoadsideAssistance content object.
 */
@ApiModel(description = "RoadsideAssistance content object.")

public class ConversationContentRoadsideAssistance  implements Serializable {
  
  private String text = null;
  private String phoneNumber = null;
  private Boolean isDevicePhoneNumber = null;
  private ConversationContentLocation location = null;
  private Long messageNumber = null;

  public ConversationContentRoadsideAssistance() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * The Roadside Assistance message text
   **/
  public ConversationContentRoadsideAssistance text(String text) {
    this.text = text;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The Roadside Assistance message text")
  @JsonProperty("text")
  public String getText() {
    return text;
  }
  public void setText(String text) {
    this.text = text;
  }


  /**
   * Phone number the user provided
   **/
  public ConversationContentRoadsideAssistance phoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Phone number the user provided")
  @JsonProperty("phoneNumber")
  public String getPhoneNumber() {
    return phoneNumber;
  }
  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }


  /**
   * If the user provided their own phone number
   **/
  public ConversationContentRoadsideAssistance isDevicePhoneNumber(Boolean isDevicePhoneNumber) {
    this.isDevicePhoneNumber = isDevicePhoneNumber;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "If the user provided their own phone number")
  @JsonProperty("isDevicePhoneNumber")
  public Boolean getIsDevicePhoneNumber() {
    return isDevicePhoneNumber;
  }
  public void setIsDevicePhoneNumber(Boolean isDevicePhoneNumber) {
    this.isDevicePhoneNumber = isDevicePhoneNumber;
  }


  /**
   * User Location object
   **/
  public ConversationContentRoadsideAssistance location(ConversationContentLocation location) {
    this.location = location;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "User Location object")
  @JsonProperty("location")
  public ConversationContentLocation getLocation() {
    return location;
  }
  public void setLocation(ConversationContentLocation location) {
    this.location = location;
  }


  /**
   * The counter of the message
   **/
  public ConversationContentRoadsideAssistance messageNumber(Long messageNumber) {
    this.messageNumber = messageNumber;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The counter of the message")
  @JsonProperty("messageNumber")
  public Long getMessageNumber() {
    return messageNumber;
  }
  public void setMessageNumber(Long messageNumber) {
    this.messageNumber = messageNumber;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConversationContentRoadsideAssistance conversationContentRoadsideAssistance = (ConversationContentRoadsideAssistance) o;

    return Objects.equals(this.text, conversationContentRoadsideAssistance.text) &&
            Objects.equals(this.phoneNumber, conversationContentRoadsideAssistance.phoneNumber) &&
            Objects.equals(this.isDevicePhoneNumber, conversationContentRoadsideAssistance.isDevicePhoneNumber) &&
            Objects.equals(this.location, conversationContentRoadsideAssistance.location) &&
            Objects.equals(this.messageNumber, conversationContentRoadsideAssistance.messageNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(text, phoneNumber, isDevicePhoneNumber, location, messageNumber);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConversationContentRoadsideAssistance {\n");
    
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("    isDevicePhoneNumber: ").append(toIndentedString(isDevicePhoneNumber)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    messageNumber: ").append(toIndentedString(messageNumber)).append("\n");
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

