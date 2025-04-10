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
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import java.io.Serializable;
/**
 * MessagingInitialConfiguration
 */

public class MessagingInitialConfiguration  implements Serializable {
  
  private String toAddress = null;
  private String fromAddress = null;

  private static class MessageTypeEnumDeserializer extends StdDeserializer<MessageTypeEnum> {
    public MessageTypeEnumDeserializer() {
      super(MessageTypeEnumDeserializer.class);
    }

    @Override
    public MessageTypeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return MessageTypeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The type of message platform from which the message originated.
   */
 @JsonDeserialize(using = MessageTypeEnumDeserializer.class)
  public enum MessageTypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    SMS("Sms"),
    TWITTER("Twitter"),
    FACEBOOK("Facebook"),
    LINE("Line"),
    WHATSAPP("WhatsApp"),
    WEBMESSAGE("WebMessage"),
    OPEN("Open"),
    INSTAGRAM("Instagram"),
    UNKNOWN("Unknown");

    private String value;

    MessageTypeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static MessageTypeEnum fromString(String key) {
      if (key == null) return null;

      for (MessageTypeEnum value : MessageTypeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return MessageTypeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private MessageTypeEnum messageType = null;
  private Boolean held = null;
  private Boolean alerting = null;
  private Boolean inbound = null;
  private String invitedBy = null;
  private Map<String, String> additionalInfo = null;

  public MessagingInitialConfiguration() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * Address for the participant on receiving side of the message conversation. If the address is a phone number, E.164 format is recommended.
   **/
  public MessagingInitialConfiguration toAddress(String toAddress) {
    this.toAddress = toAddress;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Address for the participant on receiving side of the message conversation. If the address is a phone number, E.164 format is recommended.")
  @JsonProperty("toAddress")
  public String getToAddress() {
    return toAddress;
  }
  public void setToAddress(String toAddress) {
    this.toAddress = toAddress;
  }


  /**
   * Address for the participant on the sending side of the message conversation. If the address is a phone number, E.164 format is recommended.
   **/
  public MessagingInitialConfiguration fromAddress(String fromAddress) {
    this.fromAddress = fromAddress;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Address for the participant on the sending side of the message conversation. If the address is a phone number, E.164 format is recommended.")
  @JsonProperty("fromAddress")
  public String getFromAddress() {
    return fromAddress;
  }
  public void setFromAddress(String fromAddress) {
    this.fromAddress = fromAddress;
  }


  /**
   * The type of message platform from which the message originated.
   **/
  public MessagingInitialConfiguration messageType(MessageTypeEnum messageType) {
    this.messageType = messageType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The type of message platform from which the message originated.")
  @JsonProperty("messageType")
  public MessageTypeEnum getMessageType() {
    return messageType;
  }
  public void setMessageType(MessageTypeEnum messageType) {
    this.messageType = messageType;
  }


  /**
   * Indicates that this communication's initial state is held.
   **/
  public MessagingInitialConfiguration held(Boolean held) {
    this.held = held;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Indicates that this communication's initial state is held.")
  @JsonProperty("held")
  public Boolean getHeld() {
    return held;
  }
  public void setHeld(Boolean held) {
    this.held = held;
  }


  /**
   * Indicates that this communication's initial state is alerting. If false, the communication started in a connected state.
   **/
  public MessagingInitialConfiguration alerting(Boolean alerting) {
    this.alerting = alerting;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Indicates that this communication's initial state is alerting. If false, the communication started in a connected state.")
  @JsonProperty("alerting")
  public Boolean getAlerting() {
    return alerting;
  }
  public void setAlerting(Boolean alerting) {
    this.alerting = alerting;
  }


  /**
   * Indicates the direction of this communication with respect to the contact center. `true` means the communication is INBOUND. `false` means the communication is OUTBOUND.
   **/
  public MessagingInitialConfiguration inbound(Boolean inbound) {
    this.inbound = inbound;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Indicates the direction of this communication with respect to the contact center. `true` means the communication is INBOUND. `false` means the communication is OUTBOUND.")
  @JsonProperty("inbound")
  public Boolean getInbound() {
    return inbound;
  }
  public void setInbound(Boolean inbound) {
    this.inbound = inbound;
  }


  /**
   * The id of the communication (the \"peer\") that \"invited\" this communication, if this occurred.
   **/
  public MessagingInitialConfiguration invitedBy(String invitedBy) {
    this.invitedBy = invitedBy;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The id of the communication (the \"peer\") that \"invited\" this communication, if this occurred.")
  @JsonProperty("invitedBy")
  public String getInvitedBy() {
    return invitedBy;
  }
  public void setInvitedBy(String invitedBy) {
    this.invitedBy = invitedBy;
  }


  /**
   * Additional metadata about this session which should be recorded by the platform but which will not be indexed or searchable. Primarily for diagnostic value. Any information that needs to be accessible through other components like Analytics should be moved to dedicated fields.
   **/
  public MessagingInitialConfiguration additionalInfo(Map<String, String> additionalInfo) {
    this.additionalInfo = additionalInfo;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Additional metadata about this session which should be recorded by the platform but which will not be indexed or searchable. Primarily for diagnostic value. Any information that needs to be accessible through other components like Analytics should be moved to dedicated fields.")
  @JsonProperty("additionalInfo")
  public Map<String, String> getAdditionalInfo() {
    return additionalInfo;
  }
  public void setAdditionalInfo(Map<String, String> additionalInfo) {
    this.additionalInfo = additionalInfo;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MessagingInitialConfiguration messagingInitialConfiguration = (MessagingInitialConfiguration) o;

    return Objects.equals(this.toAddress, messagingInitialConfiguration.toAddress) &&
            Objects.equals(this.fromAddress, messagingInitialConfiguration.fromAddress) &&
            Objects.equals(this.messageType, messagingInitialConfiguration.messageType) &&
            Objects.equals(this.held, messagingInitialConfiguration.held) &&
            Objects.equals(this.alerting, messagingInitialConfiguration.alerting) &&
            Objects.equals(this.inbound, messagingInitialConfiguration.inbound) &&
            Objects.equals(this.invitedBy, messagingInitialConfiguration.invitedBy) &&
            Objects.equals(this.additionalInfo, messagingInitialConfiguration.additionalInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(toAddress, fromAddress, messageType, held, alerting, inbound, invitedBy, additionalInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MessagingInitialConfiguration {\n");
    
    sb.append("    toAddress: ").append(toIndentedString(toAddress)).append("\n");
    sb.append("    fromAddress: ").append(toIndentedString(fromAddress)).append("\n");
    sb.append("    messageType: ").append(toIndentedString(messageType)).append("\n");
    sb.append("    held: ").append(toIndentedString(held)).append("\n");
    sb.append("    alerting: ").append(toIndentedString(alerting)).append("\n");
    sb.append("    inbound: ").append(toIndentedString(inbound)).append("\n");
    sb.append("    invitedBy: ").append(toIndentedString(invitedBy)).append("\n");
    sb.append("    additionalInfo: ").append(toIndentedString(additionalInfo)).append("\n");
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

