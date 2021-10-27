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
import com.mypurecloud.sdk.v2.model.OpenMessageContent;
import com.mypurecloud.sdk.v2.model.OpenMessagingChannel;
import com.mypurecloud.sdk.v2.model.Reason;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import java.io.Serializable;
/**
 * Open Messaging rich media message structure
 */
@ApiModel(description = "Open Messaging rich media message structure")

public class OpenNormalizedMessage  implements Serializable {
  
  private String id = null;
  private OpenMessagingChannel channel = null;

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
    RECEIPT("Receipt");

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
  private List<OpenMessageContent> content = new ArrayList<OpenMessageContent>();

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
  private List<Reason> reasons = new ArrayList<Reason>();
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

  
  /**
   * Unique ID of the message. This ID is generated by Messaging Platform. Message receipts will have the same ID as the message they reference, as such should only be set when sending a message receipt.
   **/
  public OpenNormalizedMessage id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Unique ID of the message. This ID is generated by Messaging Platform. Message receipts will have the same ID as the message they reference, as such should only be set when sending a message receipt.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  
  /**
   * Channel-specific information that describes the message and the message channel/provider.
   **/
  public OpenNormalizedMessage channel(OpenMessagingChannel channel) {
    this.channel = channel;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Channel-specific information that describes the message and the message channel/provider.")
  @JsonProperty("channel")
  public OpenMessagingChannel getChannel() {
    return channel;
  }
  public void setChannel(OpenMessagingChannel channel) {
    this.channel = channel;
  }

  
  /**
   * Message type.
   **/
  public OpenNormalizedMessage type(TypeEnum type) {
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
  public OpenNormalizedMessage text(String text) {
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
   * List of content elements.
   **/
  public OpenNormalizedMessage content(List<OpenMessageContent> content) {
    this.content = content;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "List of content elements.")
  @JsonProperty("content")
  public List<OpenMessageContent> getContent() {
    return content;
  }
  public void setContent(List<OpenMessageContent> content) {
    this.content = content;
  }

  
  /**
   * Message receipt status, only used with type Receipt.
   **/
  public OpenNormalizedMessage status(StatusEnum status) {
    this.status = status;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Message receipt status, only used with type Receipt.")
  @JsonProperty("status")
  public StatusEnum getStatus() {
    return status;
  }
  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  
  /**
   * List of reasons for a message receipt that indicates the message has failed. Only used with Failed status.
   **/
  public OpenNormalizedMessage reasons(List<Reason> reasons) {
    this.reasons = reasons;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "List of reasons for a message receipt that indicates the message has failed. Only used with Failed status.")
  @JsonProperty("reasons")
  public List<Reason> getReasons() {
    return reasons;
  }
  public void setReasons(List<Reason> reasons) {
    this.reasons = reasons;
  }

  
  /**
   * Indicates if this is the last message receipt for this message, or if another message receipt can be expected.
   **/
  public OpenNormalizedMessage isFinalReceipt(Boolean isFinalReceipt) {
    this.isFinalReceipt = isFinalReceipt;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Indicates if this is the last message receipt for this message, or if another message receipt can be expected.")
  @JsonProperty("isFinalReceipt")
  public Boolean getIsFinalReceipt() {
    return isFinalReceipt;
  }
  public void setIsFinalReceipt(Boolean isFinalReceipt) {
    this.isFinalReceipt = isFinalReceipt;
  }

  
  /**
   * The direction of the message.
   **/
  public OpenNormalizedMessage direction(DirectionEnum direction) {
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
   * Additional metadata about this message.
   **/
  public OpenNormalizedMessage metadata(Map<String, String> metadata) {
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
    OpenNormalizedMessage openNormalizedMessage = (OpenNormalizedMessage) o;
    return Objects.equals(this.id, openNormalizedMessage.id) &&
        Objects.equals(this.channel, openNormalizedMessage.channel) &&
        Objects.equals(this.type, openNormalizedMessage.type) &&
        Objects.equals(this.text, openNormalizedMessage.text) &&
        Objects.equals(this.content, openNormalizedMessage.content) &&
        Objects.equals(this.status, openNormalizedMessage.status) &&
        Objects.equals(this.reasons, openNormalizedMessage.reasons) &&
        Objects.equals(this.isFinalReceipt, openNormalizedMessage.isFinalReceipt) &&
        Objects.equals(this.direction, openNormalizedMessage.direction) &&
        Objects.equals(this.metadata, openNormalizedMessage.metadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, channel, type, text, content, status, reasons, isFinalReceipt, direction, metadata);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpenNormalizedMessage {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    channel: ").append(toIndentedString(channel)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    reasons: ").append(toIndentedString(reasons)).append("\n");
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

