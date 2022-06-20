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
import com.mypurecloud.sdk.v2.model.ConversationMessageMetadataContent;
import com.mypurecloud.sdk.v2.model.ConversationMessageMetadataEvent;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * Metadata information about a message.
 */
@ApiModel(description = "Metadata information about a message.")

public class ConversationMessageMetadata  implements Serializable {
  

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
    EVENT("Event"),
    UNKNOWN("Unknown");

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
  private List<ConversationMessageMetadataEvent> events = new ArrayList<ConversationMessageMetadataEvent>();
  private List<ConversationMessageMetadataContent> content = new ArrayList<ConversationMessageMetadataContent>();

  
  /**
   * Message type.
   **/
  public ConversationMessageMetadata type(TypeEnum type) {
    this.type = type;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Message type.")
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
    this.type = type;
  }


  /**
   * List of events metadata
   **/
  public ConversationMessageMetadata events(List<ConversationMessageMetadataEvent> events) {
    this.events = events;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "List of events metadata")
  @JsonProperty("events")
  public List<ConversationMessageMetadataEvent> getEvents() {
    return events;
  }
  public void setEvents(List<ConversationMessageMetadataEvent> events) {
    this.events = events;
  }


  /**
   * List of message content
   **/
  public ConversationMessageMetadata content(List<ConversationMessageMetadataContent> content) {
    this.content = content;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "List of message content")
  @JsonProperty("content")
  public List<ConversationMessageMetadataContent> getContent() {
    return content;
  }
  public void setContent(List<ConversationMessageMetadataContent> content) {
    this.content = content;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConversationMessageMetadata conversationMessageMetadata = (ConversationMessageMetadata) o;

    return Objects.equals(this.type, conversationMessageMetadata.type) &&
            Objects.equals(this.events, conversationMessageMetadata.events) &&
            Objects.equals(this.content, conversationMessageMetadata.content);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, events, content);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConversationMessageMetadata {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    events: ").append(toIndentedString(events)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
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

