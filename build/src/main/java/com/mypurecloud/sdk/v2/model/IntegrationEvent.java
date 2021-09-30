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
import com.mypurecloud.sdk.v2.model.EventEntity;
import com.mypurecloud.sdk.v2.model.MessageInfo;
import com.mypurecloud.sdk.v2.model.User;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import java.io.Serializable;
/**
 * Describes an event that has happened related to an integration
 */
@ApiModel(description = "Describes an event that has happened related to an integration")

public class IntegrationEvent  implements Serializable {
  
  private String id = null;
  private String selfUri = null;
  private String correlationId = null;
  private Date timestamp = null;

  private static class LevelEnumDeserializer extends StdDeserializer<LevelEnum> {
    public LevelEnumDeserializer() {
      super(LevelEnumDeserializer.class);
    }

    @Override
    public LevelEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return LevelEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Indicates the severity of the event.
   */
 @JsonDeserialize(using = LevelEnumDeserializer.class)
  public enum LevelEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    INFO("INFO"),
    WARN("WARN"),
    ERROR("ERROR"),
    CRITICAL("CRITICAL");

    private String value;

    LevelEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static LevelEnum fromString(String key) {
      if (key == null) return null;

      for (LevelEnum value : LevelEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return LevelEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private LevelEnum level = null;
  private String eventCode = null;
  private MessageInfo message = null;
  private List<EventEntity> entities = new ArrayList<EventEntity>();
  private Map<String, String> contextAttributes = null;
  private MessageInfo detailMessage = null;
  private User user = null;

  
  @ApiModelProperty(example = "null", value = "Unique ID for this event")
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  
  @ApiModelProperty(example = "null", value = "The URI for this object")
  @JsonProperty("selfUri")
  public String getSelfUri() {
    return selfUri;
  }

  
  @ApiModelProperty(example = "null", value = "Correlation ID for the event")
  @JsonProperty("correlationId")
  public String getCorrelationId() {
    return correlationId;
  }

  
  @ApiModelProperty(example = "null", value = "Time the event occurred. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("timestamp")
  public Date getTimestamp() {
    return timestamp;
  }

  
  @ApiModelProperty(example = "null", value = "Indicates the severity of the event.")
  @JsonProperty("level")
  public LevelEnum getLevel() {
    return level;
  }

  
  @ApiModelProperty(example = "null", value = "A classification for the event. Suitable for programmatic searching, sorting, or filtering")
  @JsonProperty("eventCode")
  public String getEventCode() {
    return eventCode;
  }

  
  @ApiModelProperty(example = "null", value = "Message indicating what happened")
  @JsonProperty("message")
  public MessageInfo getMessage() {
    return message;
  }

  
  @ApiModelProperty(example = "null", value = "Collection of entities affected by or pertaining to the event (e.g. a list of Integrations or Bridge connectors)")
  @JsonProperty("entities")
  public List<EventEntity> getEntities() {
    return entities;
  }

  
  @ApiModelProperty(example = "null", value = "Map of context attributes specific to this event.")
  @JsonProperty("contextAttributes")
  public Map<String, String> getContextAttributes() {
    return contextAttributes;
  }

  
  /**
   * Message with additional details about the event. (e.g. an exception cause.)
   **/
  public IntegrationEvent detailMessage(MessageInfo detailMessage) {
    this.detailMessage = detailMessage;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Message with additional details about the event. (e.g. an exception cause.)")
  @JsonProperty("detailMessage")
  public MessageInfo getDetailMessage() {
    return detailMessage;
  }
  public void setDetailMessage(MessageInfo detailMessage) {
    this.detailMessage = detailMessage;
  }

  
  @ApiModelProperty(example = "null", value = "User that took an action that resulted in the event.")
  @JsonProperty("user")
  public User getUser() {
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
    IntegrationEvent integrationEvent = (IntegrationEvent) o;
    return Objects.equals(this.id, integrationEvent.id) &&
        Objects.equals(this.selfUri, integrationEvent.selfUri) &&
        Objects.equals(this.correlationId, integrationEvent.correlationId) &&
        Objects.equals(this.timestamp, integrationEvent.timestamp) &&
        Objects.equals(this.level, integrationEvent.level) &&
        Objects.equals(this.eventCode, integrationEvent.eventCode) &&
        Objects.equals(this.message, integrationEvent.message) &&
        Objects.equals(this.entities, integrationEvent.entities) &&
        Objects.equals(this.contextAttributes, integrationEvent.contextAttributes) &&
        Objects.equals(this.detailMessage, integrationEvent.detailMessage) &&
        Objects.equals(this.user, integrationEvent.user);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, selfUri, correlationId, timestamp, level, eventCode, message, entities, contextAttributes, detailMessage, user);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IntegrationEvent {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    selfUri: ").append(toIndentedString(selfUri)).append("\n");
    sb.append("    correlationId: ").append(toIndentedString(correlationId)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    level: ").append(toIndentedString(level)).append("\n");
    sb.append("    eventCode: ").append(toIndentedString(eventCode)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    entities: ").append(toIndentedString(entities)).append("\n");
    sb.append("    contextAttributes: ").append(toIndentedString(contextAttributes)).append("\n");
    sb.append("    detailMessage: ").append(toIndentedString(detailMessage)).append("\n");
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

