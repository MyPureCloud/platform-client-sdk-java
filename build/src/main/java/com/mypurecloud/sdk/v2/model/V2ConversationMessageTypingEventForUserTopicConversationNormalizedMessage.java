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
import com.mypurecloud.sdk.v2.model.V2ConversationMessageTypingEventForUserTopicConversationMessageContent;
import com.mypurecloud.sdk.v2.model.V2ConversationMessageTypingEventForUserTopicConversationMessageEvent;
import com.mypurecloud.sdk.v2.model.V2ConversationMessageTypingEventForUserTopicConversationMessagingChannel;
import com.mypurecloud.sdk.v2.model.V2ConversationMessageTypingEventForUserTopicConversationReason;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import java.io.Serializable;
/**
 * V2ConversationMessageTypingEventForUserTopicConversationNormalizedMessage
 */

public class V2ConversationMessageTypingEventForUserTopicConversationNormalizedMessage  implements Serializable {
  
  private String id = null;
  private V2ConversationMessageTypingEventForUserTopicConversationMessagingChannel channel = null;

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
   * Gets or Sets type
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
  private List<V2ConversationMessageTypingEventForUserTopicConversationMessageContent> content = new ArrayList<V2ConversationMessageTypingEventForUserTopicConversationMessageContent>();
  private List<V2ConversationMessageTypingEventForUserTopicConversationMessageEvent> events = new ArrayList<V2ConversationMessageTypingEventForUserTopicConversationMessageEvent>();

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
   * Gets or Sets status
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
  private List<V2ConversationMessageTypingEventForUserTopicConversationReason> reasons = new ArrayList<V2ConversationMessageTypingEventForUserTopicConversationReason>();

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
   * Gets or Sets originatingEntity
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
   * Gets or Sets direction
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

  
  /**
   **/
  public V2ConversationMessageTypingEventForUserTopicConversationNormalizedMessage id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  
  /**
   **/
  public V2ConversationMessageTypingEventForUserTopicConversationNormalizedMessage channel(V2ConversationMessageTypingEventForUserTopicConversationMessagingChannel channel) {
    this.channel = channel;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("channel")
  public V2ConversationMessageTypingEventForUserTopicConversationMessagingChannel getChannel() {
    return channel;
  }
  public void setChannel(V2ConversationMessageTypingEventForUserTopicConversationMessagingChannel channel) {
    this.channel = channel;
  }

  
  /**
   **/
  public V2ConversationMessageTypingEventForUserTopicConversationNormalizedMessage type(TypeEnum type) {
    this.type = type;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
    this.type = type;
  }

  
  /**
   **/
  public V2ConversationMessageTypingEventForUserTopicConversationNormalizedMessage text(String text) {
    this.text = text;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("text")
  public String getText() {
    return text;
  }
  public void setText(String text) {
    this.text = text;
  }

  
  /**
   **/
  public V2ConversationMessageTypingEventForUserTopicConversationNormalizedMessage content(List<V2ConversationMessageTypingEventForUserTopicConversationMessageContent> content) {
    this.content = content;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("content")
  public List<V2ConversationMessageTypingEventForUserTopicConversationMessageContent> getContent() {
    return content;
  }
  public void setContent(List<V2ConversationMessageTypingEventForUserTopicConversationMessageContent> content) {
    this.content = content;
  }

  
  /**
   **/
  public V2ConversationMessageTypingEventForUserTopicConversationNormalizedMessage events(List<V2ConversationMessageTypingEventForUserTopicConversationMessageEvent> events) {
    this.events = events;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("events")
  public List<V2ConversationMessageTypingEventForUserTopicConversationMessageEvent> getEvents() {
    return events;
  }
  public void setEvents(List<V2ConversationMessageTypingEventForUserTopicConversationMessageEvent> events) {
    this.events = events;
  }

  
  /**
   **/
  public V2ConversationMessageTypingEventForUserTopicConversationNormalizedMessage status(StatusEnum status) {
    this.status = status;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("status")
  public StatusEnum getStatus() {
    return status;
  }
  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  
  /**
   **/
  public V2ConversationMessageTypingEventForUserTopicConversationNormalizedMessage reasons(List<V2ConversationMessageTypingEventForUserTopicConversationReason> reasons) {
    this.reasons = reasons;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("reasons")
  public List<V2ConversationMessageTypingEventForUserTopicConversationReason> getReasons() {
    return reasons;
  }
  public void setReasons(List<V2ConversationMessageTypingEventForUserTopicConversationReason> reasons) {
    this.reasons = reasons;
  }

  
  /**
   **/
  public V2ConversationMessageTypingEventForUserTopicConversationNormalizedMessage originatingEntity(OriginatingEntityEnum originatingEntity) {
    this.originatingEntity = originatingEntity;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("originatingEntity")
  public OriginatingEntityEnum getOriginatingEntity() {
    return originatingEntity;
  }
  public void setOriginatingEntity(OriginatingEntityEnum originatingEntity) {
    this.originatingEntity = originatingEntity;
  }

  
  /**
   **/
  public V2ConversationMessageTypingEventForUserTopicConversationNormalizedMessage isFinalReceipt(Boolean isFinalReceipt) {
    this.isFinalReceipt = isFinalReceipt;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("isFinalReceipt")
  public Boolean getIsFinalReceipt() {
    return isFinalReceipt;
  }
  public void setIsFinalReceipt(Boolean isFinalReceipt) {
    this.isFinalReceipt = isFinalReceipt;
  }

  
  /**
   **/
  public V2ConversationMessageTypingEventForUserTopicConversationNormalizedMessage direction(DirectionEnum direction) {
    this.direction = direction;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("direction")
  public DirectionEnum getDirection() {
    return direction;
  }
  public void setDirection(DirectionEnum direction) {
    this.direction = direction;
  }

  
  /**
   **/
  public V2ConversationMessageTypingEventForUserTopicConversationNormalizedMessage metadata(Map<String, String> metadata) {
    this.metadata = metadata;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
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
    V2ConversationMessageTypingEventForUserTopicConversationNormalizedMessage v2ConversationMessageTypingEventForUserTopicConversationNormalizedMessage = (V2ConversationMessageTypingEventForUserTopicConversationNormalizedMessage) o;
    return Objects.equals(this.id, v2ConversationMessageTypingEventForUserTopicConversationNormalizedMessage.id) &&
        Objects.equals(this.channel, v2ConversationMessageTypingEventForUserTopicConversationNormalizedMessage.channel) &&
        Objects.equals(this.type, v2ConversationMessageTypingEventForUserTopicConversationNormalizedMessage.type) &&
        Objects.equals(this.text, v2ConversationMessageTypingEventForUserTopicConversationNormalizedMessage.text) &&
        Objects.equals(this.content, v2ConversationMessageTypingEventForUserTopicConversationNormalizedMessage.content) &&
        Objects.equals(this.events, v2ConversationMessageTypingEventForUserTopicConversationNormalizedMessage.events) &&
        Objects.equals(this.status, v2ConversationMessageTypingEventForUserTopicConversationNormalizedMessage.status) &&
        Objects.equals(this.reasons, v2ConversationMessageTypingEventForUserTopicConversationNormalizedMessage.reasons) &&
        Objects.equals(this.originatingEntity, v2ConversationMessageTypingEventForUserTopicConversationNormalizedMessage.originatingEntity) &&
        Objects.equals(this.isFinalReceipt, v2ConversationMessageTypingEventForUserTopicConversationNormalizedMessage.isFinalReceipt) &&
        Objects.equals(this.direction, v2ConversationMessageTypingEventForUserTopicConversationNormalizedMessage.direction) &&
        Objects.equals(this.metadata, v2ConversationMessageTypingEventForUserTopicConversationNormalizedMessage.metadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, channel, type, text, content, events, status, reasons, originatingEntity, isFinalReceipt, direction, metadata);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V2ConversationMessageTypingEventForUserTopicConversationNormalizedMessage {\n");
    
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

