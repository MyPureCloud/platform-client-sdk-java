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
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * CreateOutboundMessagingConversationRequest
 */

public class CreateOutboundMessagingConversationRequest  implements Serializable {
  
  private String queueId = null;
  private String toAddress = null;

  private static class ToAddressMessengerTypeEnumDeserializer extends StdDeserializer<ToAddressMessengerTypeEnum> {
    public ToAddressMessengerTypeEnumDeserializer() {
      super(ToAddressMessengerTypeEnumDeserializer.class);
    }

    @Override
    public ToAddressMessengerTypeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return ToAddressMessengerTypeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The messaging address messenger type.
   */
 @JsonDeserialize(using = ToAddressMessengerTypeEnumDeserializer.class)
  public enum ToAddressMessengerTypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    SMS("sms"),
    OPEN("open"),
    WHATSAPP("whatsapp");

    private String value;

    ToAddressMessengerTypeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static ToAddressMessengerTypeEnum fromString(String key) {
      if (key == null) return null;

      for (ToAddressMessengerTypeEnum value : ToAddressMessengerTypeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return ToAddressMessengerTypeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private ToAddressMessengerTypeEnum toAddressMessengerType = null;
  private Boolean useExistingConversation = null;
  private String externalContactId = null;
  private Boolean useUserFromAddress = null;

  
  /**
   * The ID of the queue to be associated with the message. This will determine the fromAddress of the message, unless useUserFromAddress is true and the queue is configured to use the agent's Direct Routing address as the fromAddress.
   **/
  public CreateOutboundMessagingConversationRequest queueId(String queueId) {
    this.queueId = queueId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The ID of the queue to be associated with the message. This will determine the fromAddress of the message, unless useUserFromAddress is true and the queue is configured to use the agent's Direct Routing address as the fromAddress.")
  @JsonProperty("queueId")
  public String getQueueId() {
    return queueId;
  }
  public void setQueueId(String queueId) {
    this.queueId = queueId;
  }


  /**
   * The messaging address of the recipient of the message. For an SMS messenger type, the phone number address must be in E.164 format. E.g. +13175555555 or +34234234234.  For open messenger type, any string within the outbound.open.messaging.to.address.characters.max limit can be used. For whatsapp messenger type, use a Whatsapp ID of a phone number. E.g for a E.164 formatted phone number `+13175555555`, a Whatsapp ID would be 13175555555
   **/
  public CreateOutboundMessagingConversationRequest toAddress(String toAddress) {
    this.toAddress = toAddress;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The messaging address of the recipient of the message. For an SMS messenger type, the phone number address must be in E.164 format. E.g. +13175555555 or +34234234234.  For open messenger type, any string within the outbound.open.messaging.to.address.characters.max limit can be used. For whatsapp messenger type, use a Whatsapp ID of a phone number. E.g for a E.164 formatted phone number `+13175555555`, a Whatsapp ID would be 13175555555")
  @JsonProperty("toAddress")
  public String getToAddress() {
    return toAddress;
  }
  public void setToAddress(String toAddress) {
    this.toAddress = toAddress;
  }


  /**
   * The messaging address messenger type.
   **/
  public CreateOutboundMessagingConversationRequest toAddressMessengerType(ToAddressMessengerTypeEnum toAddressMessengerType) {
    this.toAddressMessengerType = toAddressMessengerType;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The messaging address messenger type.")
  @JsonProperty("toAddressMessengerType")
  public ToAddressMessengerTypeEnum getToAddressMessengerType() {
    return toAddressMessengerType;
  }
  public void setToAddressMessengerType(ToAddressMessengerTypeEnum toAddressMessengerType) {
    this.toAddressMessengerType = toAddressMessengerType;
  }


  /**
   * An override to use an existing conversation.  If set to true, an existing conversation will be used if there is one within the conversation window.  If set to false, create request fails if there is a conversation within the conversation window.
   **/
  public CreateOutboundMessagingConversationRequest useExistingConversation(Boolean useExistingConversation) {
    this.useExistingConversation = useExistingConversation;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "An override to use an existing conversation.  If set to true, an existing conversation will be used if there is one within the conversation window.  If set to false, create request fails if there is a conversation within the conversation window.")
  @JsonProperty("useExistingConversation")
  public Boolean getUseExistingConversation() {
    return useExistingConversation;
  }
  public void setUseExistingConversation(Boolean useExistingConversation) {
    this.useExistingConversation = useExistingConversation;
  }


  /**
   * The external contact with which the message will be associated.
   **/
  public CreateOutboundMessagingConversationRequest externalContactId(String externalContactId) {
    this.externalContactId = externalContactId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The external contact with which the message will be associated.")
  @JsonProperty("externalContactId")
  public String getExternalContactId() {
    return externalContactId;
  }
  public void setExternalContactId(String externalContactId) {
    this.externalContactId = externalContactId;
  }


  /**
   * An override to attempt to use the user's configured direct routing address as the fromAddress.  If set to true, users configured address with 'directrouting' integration will be used as fromAddress.  If set to false or not set, the queueId will be used for determining fromAddress.
   **/
  public CreateOutboundMessagingConversationRequest useUserFromAddress(Boolean useUserFromAddress) {
    this.useUserFromAddress = useUserFromAddress;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "An override to attempt to use the user's configured direct routing address as the fromAddress.  If set to true, users configured address with 'directrouting' integration will be used as fromAddress.  If set to false or not set, the queueId will be used for determining fromAddress.")
  @JsonProperty("useUserFromAddress")
  public Boolean getUseUserFromAddress() {
    return useUserFromAddress;
  }
  public void setUseUserFromAddress(Boolean useUserFromAddress) {
    this.useUserFromAddress = useUserFromAddress;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateOutboundMessagingConversationRequest createOutboundMessagingConversationRequest = (CreateOutboundMessagingConversationRequest) o;

    return Objects.equals(this.queueId, createOutboundMessagingConversationRequest.queueId) &&
            Objects.equals(this.toAddress, createOutboundMessagingConversationRequest.toAddress) &&
            Objects.equals(this.toAddressMessengerType, createOutboundMessagingConversationRequest.toAddressMessengerType) &&
            Objects.equals(this.useExistingConversation, createOutboundMessagingConversationRequest.useExistingConversation) &&
            Objects.equals(this.externalContactId, createOutboundMessagingConversationRequest.externalContactId) &&
            Objects.equals(this.useUserFromAddress, createOutboundMessagingConversationRequest.useUserFromAddress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(queueId, toAddress, toAddressMessengerType, useExistingConversation, externalContactId, useUserFromAddress);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateOutboundMessagingConversationRequest {\n");
    
    sb.append("    queueId: ").append(toIndentedString(queueId)).append("\n");
    sb.append("    toAddress: ").append(toIndentedString(toAddress)).append("\n");
    sb.append("    toAddressMessengerType: ").append(toIndentedString(toAddressMessengerType)).append("\n");
    sb.append("    useExistingConversation: ").append(toIndentedString(useExistingConversation)).append("\n");
    sb.append("    externalContactId: ").append(toIndentedString(externalContactId)).append("\n");
    sb.append("    useUserFromAddress: ").append(toIndentedString(useUserFromAddress)).append("\n");
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

