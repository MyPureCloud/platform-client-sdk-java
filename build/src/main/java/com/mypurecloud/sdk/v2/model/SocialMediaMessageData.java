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
import com.mypurecloud.sdk.v2.model.ConversationNormalizedMessage;
import com.mypurecloud.sdk.v2.model.User;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import java.io.Serializable;
/**
 * SocialMediaMessageData
 */

public class SocialMediaMessageData  implements Serializable {
  
  private String id = null;
  private String name = null;
  private String providerMessageId = null;
  private Date timestamp = null;
  private String fromAddress = null;
  private String toAddress = null;

  private static class DirectionEnumDeserializer extends StdDeserializer<DirectionEnum> {
    public DirectionEnumDeserializer() {
      super(DirectionEnumDeserializer.class);
    }

    @Override
    public DirectionEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return DirectionEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The direction of the message.
   */
 @JsonDeserialize(using = DirectionEnumDeserializer.class)
  public enum DirectionEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    INBOUND("inbound"),
    OUTBOUND("outbound");

    private String value;

    DirectionEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static DirectionEnum fromString(String key) {
      if (key == null) return null;

      for (DirectionEnum value : DirectionEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return DirectionEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private DirectionEnum direction = null;

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
   * Type of text messenger.
   */
 @JsonDeserialize(using = MessengerTypeEnumDeserializer.class)
  public enum MessengerTypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    SMS("sms"),
    FACEBOOK("facebook"),
    TWITTER("twitter"),
    WHATSAPP("whatsapp"),
    WEBMESSAGING("webmessaging"),
    INSTAGRAM("instagram"),
    OPEN("open"),
    APPLE("apple");

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

  private static class StatusEnumDeserializer extends StdDeserializer<StatusEnum> {
    public StatusEnumDeserializer() {
      super(StatusEnumDeserializer.class);
    }

    @Override
    public StatusEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return StatusEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The status of the message.
   */
 @JsonDeserialize(using = StatusEnumDeserializer.class)
  public enum StatusEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    QUEUED("queued"),
    SENT("sent"),
    FAILED("failed"),
    RECEIVED("received"),
    DELIVERY_SUCCESS("delivery-success"),
    DELIVERY_FAILED("delivery-failed"),
    READ("read"),
    REMOVED("removed"),
    PUBLISHED("published");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static StatusEnum fromString(String key) {
      if (key == null) return null;

      for (StatusEnum value : StatusEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return StatusEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private StatusEnum status = null;
  private ConversationNormalizedMessage normalizedMessage = null;
  private List<ConversationNormalizedMessage> normalizedReceipts = null;
  private User createdBy = null;
  private String conversationId = null;
  private String selfUri = null;

  public SocialMediaMessageData() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      normalizedReceipts = new ArrayList<ConversationNormalizedMessage>();
    }
  }

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }


  /**
   **/
  public SocialMediaMessageData name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }


  /**
   * The unique identifier of the message from provider
   **/
  public SocialMediaMessageData providerMessageId(String providerMessageId) {
    this.providerMessageId = providerMessageId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The unique identifier of the message from provider")
  @JsonProperty("providerMessageId")
  public String getProviderMessageId() {
    return providerMessageId;
  }
  public void setProviderMessageId(String providerMessageId) {
    this.providerMessageId = providerMessageId;
  }


  /**
   * The time when the message was received or sent. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public SocialMediaMessageData timestamp(Date timestamp) {
    this.timestamp = timestamp;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The time when the message was received or sent. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("timestamp")
  public Date getTimestamp() {
    return timestamp;
  }
  public void setTimestamp(Date timestamp) {
    this.timestamp = timestamp;
  }


  /**
   * The sender of the text message.
   **/
  public SocialMediaMessageData fromAddress(String fromAddress) {
    this.fromAddress = fromAddress;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The sender of the text message.")
  @JsonProperty("fromAddress")
  public String getFromAddress() {
    return fromAddress;
  }
  public void setFromAddress(String fromAddress) {
    this.fromAddress = fromAddress;
  }


  /**
   * The recipient of the text message.
   **/
  public SocialMediaMessageData toAddress(String toAddress) {
    this.toAddress = toAddress;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The recipient of the text message.")
  @JsonProperty("toAddress")
  public String getToAddress() {
    return toAddress;
  }
  public void setToAddress(String toAddress) {
    this.toAddress = toAddress;
  }


  /**
   * The direction of the message.
   **/
  public SocialMediaMessageData direction(DirectionEnum direction) {
    this.direction = direction;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The direction of the message.")
  @JsonProperty("direction")
  public DirectionEnum getDirection() {
    return direction;
  }
  public void setDirection(DirectionEnum direction) {
    this.direction = direction;
  }


  /**
   * Type of text messenger.
   **/
  public SocialMediaMessageData messengerType(MessengerTypeEnum messengerType) {
    this.messengerType = messengerType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Type of text messenger.")
  @JsonProperty("messengerType")
  public MessengerTypeEnum getMessengerType() {
    return messengerType;
  }
  public void setMessengerType(MessengerTypeEnum messengerType) {
    this.messengerType = messengerType;
  }


  /**
   * The status of the message.
   **/
  public SocialMediaMessageData status(StatusEnum status) {
    this.status = status;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The status of the message.")
  @JsonProperty("status")
  public StatusEnum getStatus() {
    return status;
  }
  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  @ApiModelProperty(example = "null", value = "The message into normalized format")
  @JsonProperty("normalizedMessage")
  public ConversationNormalizedMessage getNormalizedMessage() {
    return normalizedMessage;
  }


  @ApiModelProperty(example = "null", value = "The delivery event associated with this message in normalized format, if the message direction was outbound")
  @JsonProperty("normalizedReceipts")
  public List<ConversationNormalizedMessage> getNormalizedReceipts() {
    return normalizedReceipts;
  }


  /**
   * User who sent this message.
   **/
  public SocialMediaMessageData createdBy(User createdBy) {
    this.createdBy = createdBy;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "User who sent this message.")
  @JsonProperty("createdBy")
  public User getCreatedBy() {
    return createdBy;
  }
  public void setCreatedBy(User createdBy) {
    this.createdBy = createdBy;
  }


  /**
   * The id of the conversation of this message.
   **/
  public SocialMediaMessageData conversationId(String conversationId) {
    this.conversationId = conversationId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The id of the conversation of this message.")
  @JsonProperty("conversationId")
  public String getConversationId() {
    return conversationId;
  }
  public void setConversationId(String conversationId) {
    this.conversationId = conversationId;
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
    SocialMediaMessageData socialMediaMessageData = (SocialMediaMessageData) o;

    return Objects.equals(this.id, socialMediaMessageData.id) &&
            Objects.equals(this.name, socialMediaMessageData.name) &&
            Objects.equals(this.providerMessageId, socialMediaMessageData.providerMessageId) &&
            Objects.equals(this.timestamp, socialMediaMessageData.timestamp) &&
            Objects.equals(this.fromAddress, socialMediaMessageData.fromAddress) &&
            Objects.equals(this.toAddress, socialMediaMessageData.toAddress) &&
            Objects.equals(this.direction, socialMediaMessageData.direction) &&
            Objects.equals(this.messengerType, socialMediaMessageData.messengerType) &&
            Objects.equals(this.status, socialMediaMessageData.status) &&
            Objects.equals(this.normalizedMessage, socialMediaMessageData.normalizedMessage) &&
            Objects.equals(this.normalizedReceipts, socialMediaMessageData.normalizedReceipts) &&
            Objects.equals(this.createdBy, socialMediaMessageData.createdBy) &&
            Objects.equals(this.conversationId, socialMediaMessageData.conversationId) &&
            Objects.equals(this.selfUri, socialMediaMessageData.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, providerMessageId, timestamp, fromAddress, toAddress, direction, messengerType, status, normalizedMessage, normalizedReceipts, createdBy, conversationId, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SocialMediaMessageData {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    providerMessageId: ").append(toIndentedString(providerMessageId)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    fromAddress: ").append(toIndentedString(fromAddress)).append("\n");
    sb.append("    toAddress: ").append(toIndentedString(toAddress)).append("\n");
    sb.append("    direction: ").append(toIndentedString(direction)).append("\n");
    sb.append("    messengerType: ").append(toIndentedString(messengerType)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    normalizedMessage: ").append(toIndentedString(normalizedMessage)).append("\n");
    sb.append("    normalizedReceipts: ").append(toIndentedString(normalizedReceipts)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    conversationId: ").append(toIndentedString(conversationId)).append("\n");
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

