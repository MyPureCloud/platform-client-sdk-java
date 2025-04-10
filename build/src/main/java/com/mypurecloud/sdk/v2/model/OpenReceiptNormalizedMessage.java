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
import com.mypurecloud.sdk.v2.model.ConversationReason;
import com.mypurecloud.sdk.v2.model.OpenMessagingChannel;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * Open Messaging rich media message structure
 */
@ApiModel(description = "Open Messaging rich media message structure")

public class OpenReceiptNormalizedMessage  implements Serializable {
  
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
   * Message receipt status.
   */
 @JsonDeserialize(using = StatusEnumDeserializer.class)
  public enum StatusEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    SENT("Sent"),
    DELIVERED("Delivered"),
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
  private List<ConversationReason> reasons = null;
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

  public OpenReceiptNormalizedMessage() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      reasons = new ArrayList<ConversationReason>();
    }
  }

  
  /**
   * The original unique message Id generated by the messaging platform, that this receipt message is referencing.
   **/
  public OpenReceiptNormalizedMessage id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The original unique message Id generated by the messaging platform, that this receipt message is referencing.")
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
  public OpenReceiptNormalizedMessage channel(OpenMessagingChannel channel) {
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
  public OpenReceiptNormalizedMessage type(TypeEnum type) {
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
   * Message receipt status.
   **/
  public OpenReceiptNormalizedMessage status(StatusEnum status) {
    this.status = status;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Message receipt status.")
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
  public OpenReceiptNormalizedMessage reasons(List<ConversationReason> reasons) {
    this.reasons = reasons;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "List of reasons for a message receipt that indicates the message has failed. Only used with Failed status.")
  @JsonProperty("reasons")
  public List<ConversationReason> getReasons() {
    return reasons;
  }
  public void setReasons(List<ConversationReason> reasons) {
    this.reasons = reasons;
  }


  /**
   * Indicates if this is the last message receipt for this message, or if another message receipt can be expected.
   **/
  public OpenReceiptNormalizedMessage isFinalReceipt(Boolean isFinalReceipt) {
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
  public OpenReceiptNormalizedMessage direction(DirectionEnum direction) {
    this.direction = direction;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The direction of the message.")
  @JsonProperty("direction")
  public DirectionEnum getDirection() {
    return direction;
  }
  public void setDirection(DirectionEnum direction) {
    this.direction = direction;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OpenReceiptNormalizedMessage openReceiptNormalizedMessage = (OpenReceiptNormalizedMessage) o;

    return Objects.equals(this.id, openReceiptNormalizedMessage.id) &&
            Objects.equals(this.channel, openReceiptNormalizedMessage.channel) &&
            Objects.equals(this.type, openReceiptNormalizedMessage.type) &&
            Objects.equals(this.status, openReceiptNormalizedMessage.status) &&
            Objects.equals(this.reasons, openReceiptNormalizedMessage.reasons) &&
            Objects.equals(this.isFinalReceipt, openReceiptNormalizedMessage.isFinalReceipt) &&
            Objects.equals(this.direction, openReceiptNormalizedMessage.direction);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, channel, type, status, reasons, isFinalReceipt, direction);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpenReceiptNormalizedMessage {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    channel: ").append(toIndentedString(channel)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    reasons: ").append(toIndentedString(reasons)).append("\n");
    sb.append("    isFinalReceipt: ").append(toIndentedString(isFinalReceipt)).append("\n");
    sb.append("    direction: ").append(toIndentedString(direction)).append("\n");
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

