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
import com.mypurecloud.sdk.v2.model.ChannelMetadata;
import com.mypurecloud.sdk.v2.model.OpenMessagingFromRecipient;
import com.mypurecloud.sdk.v2.model.OpenMessagingToRecipient;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

import java.io.Serializable;
/**
 * Channel-specific information that describes the message and the message channel/provider.
 */
@ApiModel(description = "Channel-specific information that describes the message and the message channel/provider.")

public class OpenMessagingChannel  implements Serializable {
  
  private String id = null;

  private static class PlatformEnumDeserializer extends StdDeserializer<PlatformEnum> {
    public PlatformEnumDeserializer() {
      super(PlatformEnumDeserializer.class);
    }

    @Override
    public PlatformEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return PlatformEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The provider type.
   */
 @JsonDeserialize(using = PlatformEnumDeserializer.class)
  public enum PlatformEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    OPEN("Open");

    private String value;

    PlatformEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static PlatformEnum fromString(String key) {
      if (key == null) return null;

      for (PlatformEnum value : PlatformEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return PlatformEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private PlatformEnum platform = null;

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
   * Specifies if this message is part of a private or public conversation.
   */
 @JsonDeserialize(using = TypeEnumDeserializer.class)
  public enum TypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    PRIVATE("Private");

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
  private String messageId = null;
  private OpenMessagingToRecipient to = null;
  private OpenMessagingFromRecipient from = null;
  private Date time = null;
  private ChannelMetadata metadata = null;

  
  @ApiModelProperty(example = "null", value = "The Messaging Platform integration ID.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  
  @ApiModelProperty(example = "null", value = "The provider type.")
  @JsonProperty("platform")
  public PlatformEnum getPlatform() {
    return platform;
  }

  
  /**
   * Specifies if this message is part of a private or public conversation.
   **/
  public OpenMessagingChannel type(TypeEnum type) {
    this.type = type;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Specifies if this message is part of a private or public conversation.")
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
    this.type = type;
  }

  
  /**
   * Unique provider ID of the message such as a Facebook message ID.
   **/
  public OpenMessagingChannel messageId(String messageId) {
    this.messageId = messageId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Unique provider ID of the message such as a Facebook message ID.")
  @JsonProperty("messageId")
  public String getMessageId() {
    return messageId;
  }
  public void setMessageId(String messageId) {
    this.messageId = messageId;
  }

  
  /**
   * Information about the recipient the message is sent to.
   **/
  public OpenMessagingChannel to(OpenMessagingToRecipient to) {
    this.to = to;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Information about the recipient the message is sent to.")
  @JsonProperty("to")
  public OpenMessagingToRecipient getTo() {
    return to;
  }
  public void setTo(OpenMessagingToRecipient to) {
    this.to = to;
  }

  
  /**
   * Information about the recipient the message is received from.
   **/
  public OpenMessagingChannel from(OpenMessagingFromRecipient from) {
    this.from = from;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Information about the recipient the message is received from.")
  @JsonProperty("from")
  public OpenMessagingFromRecipient getFrom() {
    return from;
  }
  public void setFrom(OpenMessagingFromRecipient from) {
    this.from = from;
  }

  
  /**
   * Original time of the event. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public OpenMessagingChannel time(Date time) {
    this.time = time;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Original time of the event. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("time")
  public Date getTime() {
    return time;
  }
  public void setTime(Date time) {
    this.time = time;
  }

  
  /**
   * Information about the channel.
   **/
  public OpenMessagingChannel metadata(ChannelMetadata metadata) {
    this.metadata = metadata;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Information about the channel.")
  @JsonProperty("metadata")
  public ChannelMetadata getMetadata() {
    return metadata;
  }
  public void setMetadata(ChannelMetadata metadata) {
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
    OpenMessagingChannel openMessagingChannel = (OpenMessagingChannel) o;
    return Objects.equals(this.id, openMessagingChannel.id) &&
        Objects.equals(this.platform, openMessagingChannel.platform) &&
        Objects.equals(this.type, openMessagingChannel.type) &&
        Objects.equals(this.messageId, openMessagingChannel.messageId) &&
        Objects.equals(this.to, openMessagingChannel.to) &&
        Objects.equals(this.from, openMessagingChannel.from) &&
        Objects.equals(this.time, openMessagingChannel.time) &&
        Objects.equals(this.metadata, openMessagingChannel.metadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, platform, type, messageId, to, from, time, metadata);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpenMessagingChannel {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    platform: ").append(toIndentedString(platform)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    messageId: ").append(toIndentedString(messageId)).append("\n");
    sb.append("    to: ").append(toIndentedString(to)).append("\n");
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
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

