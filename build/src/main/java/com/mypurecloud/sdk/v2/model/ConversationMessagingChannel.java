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
import com.mypurecloud.sdk.v2.model.ConversationMessagingFromRecipient;
import com.mypurecloud.sdk.v2.model.ConversationMessagingToRecipient;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

import java.io.Serializable;
/**
 * Channel-specific information that describes the message and the message channel/provider.
 */
@ApiModel(description = "Channel-specific information that describes the message and the message channel/provider.")

public class ConversationMessagingChannel  implements Serializable {
  
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
    TWITTER("Twitter"),
    FACEBOOK("Facebook"),
    INSTAGRAM("Instagram"),
    LINE("Line"),
    WHATSAPP("Whatsapp"),
    WEBMESSAGING("WebMessaging"),
    OPEN("Open"),
    SMS("Sms");

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
  private String messageId = null;
  private ConversationMessagingToRecipient to = null;
  private ConversationMessagingFromRecipient from = null;
  private Date time = null;
  private Date dateModified = null;
  private Date dateDeleted = null;

  
  @ApiModelProperty(example = "null", value = "The integration ID.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  
  @ApiModelProperty(example = "null", value = "The provider type.")
  @JsonProperty("platform")
  public PlatformEnum getPlatform() {
    return platform;
  }

  
  @ApiModelProperty(example = "null", value = "Unique provider ID of the message such as a Facebook message ID.")
  @JsonProperty("messageId")
  public String getMessageId() {
    return messageId;
  }

  
  @ApiModelProperty(example = "null", value = "Information about the recipient the message is sent to.")
  @JsonProperty("to")
  public ConversationMessagingToRecipient getTo() {
    return to;
  }

  
  @ApiModelProperty(example = "null", value = "Information about the recipient the message is received from.")
  @JsonProperty("from")
  public ConversationMessagingFromRecipient getFrom() {
    return from;
  }

  
  @ApiModelProperty(example = "null", value = "Original time of the event. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("time")
  public Date getTime() {
    return time;
  }

  
  @ApiModelProperty(example = "null", value = "Time the message was edited. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateModified")
  public Date getDateModified() {
    return dateModified;
  }

  
  @ApiModelProperty(example = "null", value = "Time the message was deleted. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateDeleted")
  public Date getDateDeleted() {
    return dateDeleted;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConversationMessagingChannel conversationMessagingChannel = (ConversationMessagingChannel) o;
    return Objects.equals(this.id, conversationMessagingChannel.id) &&
        Objects.equals(this.platform, conversationMessagingChannel.platform) &&
        Objects.equals(this.messageId, conversationMessagingChannel.messageId) &&
        Objects.equals(this.to, conversationMessagingChannel.to) &&
        Objects.equals(this.from, conversationMessagingChannel.from) &&
        Objects.equals(this.time, conversationMessagingChannel.time) &&
        Objects.equals(this.dateModified, conversationMessagingChannel.dateModified) &&
        Objects.equals(this.dateDeleted, conversationMessagingChannel.dateDeleted);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, platform, messageId, to, from, time, dateModified, dateDeleted);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConversationMessagingChannel {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    platform: ").append(toIndentedString(platform)).append("\n");
    sb.append("    messageId: ").append(toIndentedString(messageId)).append("\n");
    sb.append("    to: ").append(toIndentedString(to)).append("\n");
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
    sb.append("    dateModified: ").append(toIndentedString(dateModified)).append("\n");
    sb.append("    dateDeleted: ").append(toIndentedString(dateDeleted)).append("\n");
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

