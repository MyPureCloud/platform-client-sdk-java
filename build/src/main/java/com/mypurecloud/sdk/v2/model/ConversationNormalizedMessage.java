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
import com.mypurecloud.sdk.v2.model.ConversationMessageContent;
import com.mypurecloud.sdk.v2.model.ConversationMessageEvent;
import com.mypurecloud.sdk.v2.model.ConversationMessagingChannel;
import com.mypurecloud.sdk.v2.model.ConversationReason;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import java.io.Serializable;
/**
 * General rich media message structure with normalized feature support across many messaging channels.
 */
@ApiModel(description = "General rich media message structure with normalized feature support across many messaging channels.")

public class ConversationNormalizedMessage  implements Serializable {
  
  private String id = null;
  private ConversationMessagingChannel channel = null;

  private static class TypeEnumDeserializer extends StdDeserializer<TypeEnum> {
    public TypeEnumDeserializer() {
      super(TypeEnumDeserializer.class);
    }

    @Override
    public TypeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return TypeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Message type.
   */
 @JsonDeserialize(using = TypeEnumDeserializer.class)
  public enum TypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    TEXT("Text"),
    STRUCTURED("Structured"),
    RECEIPT("Receipt"),
    EVENT("Event");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static TypeEnum fromString(String key) {
      if (key == null) return null;

      for (TypeEnum value : TypeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return TypeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private TypeEnum type = null;
  private String text = null;
  private List<ConversationMessageContent> content = new ArrayList<ConversationMessageContent>();
  private List<ConversationMessageEvent> events = new ArrayList<ConversationMessageEvent>();

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
   * Message receipt status, only used with type Receipt.
   */
 @JsonDeserialize(using = StatusEnumDeserializer.class)
  public enum StatusEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    SENT("Sent"),
    DELIVERED("Delivered"),
    READ("Read"),
    FAILED("Failed"),
    PUBLISHED("Published"),
    REMOVED("Removed");

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
  private List<ConversationReason> reasons = new ArrayList<ConversationReason>();

  private static class OriginatingEntityEnumDeserializer extends StdDeserializer<OriginatingEntityEnum> {
    public OriginatingEntityEnumDeserializer() {
      super(OriginatingEntityEnumDeserializer.class);
    }

    @Override
    public OriginatingEntityEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return OriginatingEntityEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Specifies if this message was sent by a human agent or bot. The platform may use this to apply appropriate provider policies.
   */
 @JsonDeserialize(using = OriginatingEntityEnumDeserializer.class)
  public enum OriginatingEntityEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    HUMAN("Human"),
    BOT("Bot");

    private String value;

    OriginatingEntityEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static OriginatingEntityEnum fromString(String key) {
      if (key == null) return null;

      for (OriginatingEntityEnum value : OriginatingEntityEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return OriginatingEntityEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private OriginatingEntityEnum originatingEntity = null;
  private Boolean isFinalReceipt = null;

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
    INBOUND("Inbound"),
    OUTBOUND("Outbound");

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
  private Map<String, String> metadata = null;

  
  @ApiModelProperty(example = "null", value = "Unique ID of the message. Message receipts will have the same ID as the message they reference.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  
  @ApiModelProperty(example = "null", value = "Channel-specific information that describes the message and the message channel/provider.")
  @JsonProperty("channel")
  public ConversationMessagingChannel getChannel() {
    return channel;
  }

  
  /**
   * Message type.
   **/
  public ConversationNormalizedMessage type(TypeEnum type) {
    this.type = type;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Message type.")
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
    this.type = type;
  }

  
  /**
   * Message text.
   **/
  public ConversationNormalizedMessage text(String text) {
    this.text = text;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Message text.")
  @JsonProperty("text")
  public String getText() {
    return text;
  }
  public void setText(String text) {
    this.text = text;
  }

  
  /**
   * List of content elements
   **/
  public ConversationNormalizedMessage content(List<ConversationMessageContent> content) {
    this.content = content;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "List of content elements")
  @JsonProperty("content")
  public List<ConversationMessageContent> getContent() {
    return content;
  }
  public void setContent(List<ConversationMessageContent> content) {
    this.content = content;
  }

  
  /**
   * List of event elements.
   **/
  public ConversationNormalizedMessage events(List<ConversationMessageEvent> events) {
    this.events = events;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "List of event elements.")
  @JsonProperty("events")
  public List<ConversationMessageEvent> getEvents() {
    return events;
  }
  public void setEvents(List<ConversationMessageEvent> events) {
    this.events = events;
  }

  
  @ApiModelProperty(example = "null", value = "Message receipt status, only used with type Receipt.")
  @JsonProperty("status")
  public StatusEnum getStatus() {
    return status;
  }

  
  @ApiModelProperty(example = "null", value = "List of reasons for a message receipt that indicates the message has failed. Only used with Failed status.")
  @JsonProperty("reasons")
  public List<ConversationReason> getReasons() {
    return reasons;
  }

  
  /**
   * Specifies if this message was sent by a human agent or bot. The platform may use this to apply appropriate provider policies.
   **/
  public ConversationNormalizedMessage originatingEntity(OriginatingEntityEnum originatingEntity) {
    this.originatingEntity = originatingEntity;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Specifies if this message was sent by a human agent or bot. The platform may use this to apply appropriate provider policies.")
  @JsonProperty("originatingEntity")
  public OriginatingEntityEnum getOriginatingEntity() {
    return originatingEntity;
  }
  public void setOriginatingEntity(OriginatingEntityEnum originatingEntity) {
    this.originatingEntity = originatingEntity;
  }

  
  @ApiModelProperty(example = "null", value = "Indicates if this is the last message receipt for this message, or if another message receipt can be expected.")
  @JsonProperty("isFinalReceipt")
  public Boolean getIsFinalReceipt() {
    return isFinalReceipt;
  }

  
  @ApiModelProperty(example = "null", value = "The direction of the message.")
  @JsonProperty("direction")
  public DirectionEnum getDirection() {
    return direction;
  }

  
  /**
   * Additional metadata about this message.
   **/
  public ConversationNormalizedMessage metadata(Map<String, String> metadata) {
    this.metadata = metadata;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Additional metadata about this message.")
  @JsonProperty("metadata")
  public Map<String, String> getMetadata() {
    return metadata;
  }
  public void setMetadata(Map<String, String> metadata) {
    this.metadata = metadata;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConversationNormalizedMessage conversationNormalizedMessage = (ConversationNormalizedMessage) o;
    return Objects.equals(this.id, conversationNormalizedMessage.id) &&
        Objects.equals(this.channel, conversationNormalizedMessage.channel) &&
        Objects.equals(this.type, conversationNormalizedMessage.type) &&
        Objects.equals(this.text, conversationNormalizedMessage.text) &&
        Objects.equals(this.content, conversationNormalizedMessage.content) &&
        Objects.equals(this.events, conversationNormalizedMessage.events) &&
        Objects.equals(this.status, conversationNormalizedMessage.status) &&
        Objects.equals(this.reasons, conversationNormalizedMessage.reasons) &&
        Objects.equals(this.originatingEntity, conversationNormalizedMessage.originatingEntity) &&
        Objects.equals(this.isFinalReceipt, conversationNormalizedMessage.isFinalReceipt) &&
        Objects.equals(this.direction, conversationNormalizedMessage.direction) &&
        Objects.equals(this.metadata, conversationNormalizedMessage.metadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, channel, type, text, content, events, status, reasons, originatingEntity, isFinalReceipt, direction, metadata);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConversationNormalizedMessage {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    channel: ").append(toIndentedString(channel)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    events: ").append(toIndentedString(events)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    reasons: ").append(toIndentedString(reasons)).append("\n");
    sb.append("    originatingEntity: ").append(toIndentedString(originatingEntity)).append("\n");
    sb.append("    isFinalReceipt: ").append(toIndentedString(isFinalReceipt)).append("\n");
    sb.append("    direction: ").append(toIndentedString(direction)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
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

