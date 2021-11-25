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
import com.fasterxml.jackson.annotation.JsonValue;
import com.mypurecloud.sdk.v2.model.AddressableEntityRef;
import com.mypurecloud.sdk.v2.model.MessagingTemplateRequest;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

import java.io.Serializable;
/**
 * SendAgentlessOutboundMessageResponse
 */

public class SendAgentlessOutboundMessageResponse  implements Serializable {
  
  private String id = null;
  private String conversationId = null;
  private String fromAddress = null;
  private String toAddress = null;

  private static class MessengerTypeEnumDeserializer extends StdDeserializer<MessengerTypeEnum> {
    public MessengerTypeEnumDeserializer() {
      super(MessengerTypeEnumDeserializer.class);
    }

    @Override
    public MessengerTypeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return MessengerTypeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Type of messenger.
   */
 @JsonDeserialize(using = MessengerTypeEnumDeserializer.class)
  public enum MessengerTypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    SMS("sms"),
    FACEBOOK("facebook"),
    TWITTER("twitter"),
    LINE("line"),
    WHATSAPP("whatsapp"),
    WEBMESSAGING("webmessaging"),
    INSTAGRAM("instagram"),
    OPEN("open");

    private String value;

    MessengerTypeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static MessengerTypeEnum fromString(String key) {
      if (key == null) return null;

      for (MessengerTypeEnum value : MessengerTypeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return MessengerTypeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private MessengerTypeEnum messengerType = null;
  private String textBody = null;
  private MessagingTemplateRequest messagingTemplate = null;
  private Boolean useExistingActiveConversation = null;
  private Date timestamp = null;
  private String selfUri = null;
  private AddressableEntityRef user = null;

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  
  /**
   * The identifier of the conversation.
   **/
  public SendAgentlessOutboundMessageResponse conversationId(String conversationId) {
    this.conversationId = conversationId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The identifier of the conversation.")
  @JsonProperty("conversationId")
  public String getConversationId() {
    return conversationId;
  }
  public void setConversationId(String conversationId) {
    this.conversationId = conversationId;
  }

  
  /**
   * The sender of the message.
   **/
  public SendAgentlessOutboundMessageResponse fromAddress(String fromAddress) {
    this.fromAddress = fromAddress;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The sender of the message.")
  @JsonProperty("fromAddress")
  public String getFromAddress() {
    return fromAddress;
  }
  public void setFromAddress(String fromAddress) {
    this.fromAddress = fromAddress;
  }

  
  /**
   * The recipient of the message.
   **/
  public SendAgentlessOutboundMessageResponse toAddress(String toAddress) {
    this.toAddress = toAddress;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The recipient of the message.")
  @JsonProperty("toAddress")
  public String getToAddress() {
    return toAddress;
  }
  public void setToAddress(String toAddress) {
    this.toAddress = toAddress;
  }

  
  /**
   * Type of messenger.
   **/
  public SendAgentlessOutboundMessageResponse messengerType(MessengerTypeEnum messengerType) {
    this.messengerType = messengerType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Type of messenger.")
  @JsonProperty("messengerType")
  public MessengerTypeEnum getMessengerType() {
    return messengerType;
  }
  public void setMessengerType(MessengerTypeEnum messengerType) {
    this.messengerType = messengerType;
  }

  
  /**
   * The body of the text message.
   **/
  public SendAgentlessOutboundMessageResponse textBody(String textBody) {
    this.textBody = textBody;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The body of the text message.")
  @JsonProperty("textBody")
  public String getTextBody() {
    return textBody;
  }
  public void setTextBody(String textBody) {
    this.textBody = textBody;
  }

  
  /**
   * The messaging template sent
   **/
  public SendAgentlessOutboundMessageResponse messagingTemplate(MessagingTemplateRequest messagingTemplate) {
    this.messagingTemplate = messagingTemplate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The messaging template sent")
  @JsonProperty("messagingTemplate")
  public MessagingTemplateRequest getMessagingTemplate() {
    return messagingTemplate;
  }
  public void setMessagingTemplate(MessagingTemplateRequest messagingTemplate) {
    this.messagingTemplate = messagingTemplate;
  }

  
  /**
   * Use an existing active conversation to send the agentless outbound message. Set this parameter to 'true' to use active conversation. Default value: false
   **/
  public SendAgentlessOutboundMessageResponse useExistingActiveConversation(Boolean useExistingActiveConversation) {
    this.useExistingActiveConversation = useExistingActiveConversation;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Use an existing active conversation to send the agentless outbound message. Set this parameter to 'true' to use active conversation. Default value: false")
  @JsonProperty("useExistingActiveConversation")
  public Boolean getUseExistingActiveConversation() {
    return useExistingActiveConversation;
  }
  public void setUseExistingActiveConversation(Boolean useExistingActiveConversation) {
    this.useExistingActiveConversation = useExistingActiveConversation;
  }

  
  /**
   * The time when the message was sent. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public SendAgentlessOutboundMessageResponse timestamp(Date timestamp) {
    this.timestamp = timestamp;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The time when the message was sent. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("timestamp")
  public Date getTimestamp() {
    return timestamp;
  }
  public void setTimestamp(Date timestamp) {
    this.timestamp = timestamp;
  }

  
  @ApiModelProperty(example = "null", value = "The URI for this object")
  @JsonProperty("selfUri")
  public String getSelfUri() {
    return selfUri;
  }

  
  @ApiModelProperty(example = "null", value = "Details of the user created the job")
  @JsonProperty("user")
  public AddressableEntityRef getUser() {
    return user;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SendAgentlessOutboundMessageResponse sendAgentlessOutboundMessageResponse = (SendAgentlessOutboundMessageResponse) o;
    return Objects.equals(this.id, sendAgentlessOutboundMessageResponse.id) &&
        Objects.equals(this.conversationId, sendAgentlessOutboundMessageResponse.conversationId) &&
        Objects.equals(this.fromAddress, sendAgentlessOutboundMessageResponse.fromAddress) &&
        Objects.equals(this.toAddress, sendAgentlessOutboundMessageResponse.toAddress) &&
        Objects.equals(this.messengerType, sendAgentlessOutboundMessageResponse.messengerType) &&
        Objects.equals(this.textBody, sendAgentlessOutboundMessageResponse.textBody) &&
        Objects.equals(this.messagingTemplate, sendAgentlessOutboundMessageResponse.messagingTemplate) &&
        Objects.equals(this.useExistingActiveConversation, sendAgentlessOutboundMessageResponse.useExistingActiveConversation) &&
        Objects.equals(this.timestamp, sendAgentlessOutboundMessageResponse.timestamp) &&
        Objects.equals(this.selfUri, sendAgentlessOutboundMessageResponse.selfUri) &&
        Objects.equals(this.user, sendAgentlessOutboundMessageResponse.user);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, conversationId, fromAddress, toAddress, messengerType, textBody, messagingTemplate, useExistingActiveConversation, timestamp, selfUri, user);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SendAgentlessOutboundMessageResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    conversationId: ").append(toIndentedString(conversationId)).append("\n");
    sb.append("    fromAddress: ").append(toIndentedString(fromAddress)).append("\n");
    sb.append("    toAddress: ").append(toIndentedString(toAddress)).append("\n");
    sb.append("    messengerType: ").append(toIndentedString(messengerType)).append("\n");
    sb.append("    textBody: ").append(toIndentedString(textBody)).append("\n");
    sb.append("    messagingTemplate: ").append(toIndentedString(messagingTemplate)).append("\n");
    sb.append("    useExistingActiveConversation: ").append(toIndentedString(useExistingActiveConversation)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    selfUri: ").append(toIndentedString(selfUri)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
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

