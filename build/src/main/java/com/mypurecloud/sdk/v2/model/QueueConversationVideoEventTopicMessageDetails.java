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
import com.mypurecloud.sdk.v2.model.QueueConversationVideoEventTopicErrorDetails;
import com.mypurecloud.sdk.v2.model.QueueConversationVideoEventTopicMessageMedia;
import com.mypurecloud.sdk.v2.model.QueueConversationVideoEventTopicMessageMetadata;
import com.mypurecloud.sdk.v2.model.QueueConversationVideoEventTopicMessageSticker;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import java.io.Serializable;
/**
 * QueueConversationVideoEventTopicMessageDetails
 */

public class QueueConversationVideoEventTopicMessageDetails  implements Serializable {
  
  private String messageId = null;
  private Date messageTime = null;

  private static class MessageStatusEnumDeserializer extends StdDeserializer<MessageStatusEnum> {
    public MessageStatusEnumDeserializer() {
      super(MessageStatusEnumDeserializer.class);
    }

    @Override
    public MessageStatusEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return MessageStatusEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Indicates the delivery status of the message.
   */
 @JsonDeserialize(using = MessageStatusEnumDeserializer.class)
  public enum MessageStatusEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    QUEUED("queued"),
    SENT("sent"),
    FAILED("failed"),
    RECEIVED("received"),
    DELIVERY_SUCCESS("delivery-success"),
    DELIVERY_FAILED("delivery-failed"),
    READ("read"),
    REMOVED("removed");

    private String value;

    MessageStatusEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static MessageStatusEnum fromString(String key) {
      if (key == null) return null;

      for (MessageStatusEnum value : MessageStatusEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return MessageStatusEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private MessageStatusEnum messageStatus = null;
  private Integer messageSegmentCount = null;
  private List<QueueConversationVideoEventTopicMessageMedia> media = new ArrayList<QueueConversationVideoEventTopicMessageMedia>();
  private QueueConversationVideoEventTopicErrorDetails errorInfo = null;
  private List<QueueConversationVideoEventTopicMessageSticker> stickers = new ArrayList<QueueConversationVideoEventTopicMessageSticker>();
  private QueueConversationVideoEventTopicMessageMetadata messageMetadata = null;

  
  /**
   * UUID identifying the message media.
   **/
  public QueueConversationVideoEventTopicMessageDetails messageId(String messageId) {
    this.messageId = messageId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "UUID identifying the message media.")
  @JsonProperty("messageId")
  public String getMessageId() {
    return messageId;
  }
  public void setMessageId(String messageId) {
    this.messageId = messageId;
  }


  /**
   * The time when the message was sent or received.
   **/
  public QueueConversationVideoEventTopicMessageDetails messageTime(Date messageTime) {
    this.messageTime = messageTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The time when the message was sent or received.")
  @JsonProperty("messageTime")
  public Date getMessageTime() {
    return messageTime;
  }
  public void setMessageTime(Date messageTime) {
    this.messageTime = messageTime;
  }


  /**
   * Indicates the delivery status of the message.
   **/
  public QueueConversationVideoEventTopicMessageDetails messageStatus(MessageStatusEnum messageStatus) {
    this.messageStatus = messageStatus;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Indicates the delivery status of the message.")
  @JsonProperty("messageStatus")
  public MessageStatusEnum getMessageStatus() {
    return messageStatus;
  }
  public void setMessageStatus(MessageStatusEnum messageStatus) {
    this.messageStatus = messageStatus;
  }


  /**
   * The message segment count, greater than 1 if the message content was split into multiple parts for this message type, e.g. SMS character limits.
   **/
  public QueueConversationVideoEventTopicMessageDetails messageSegmentCount(Integer messageSegmentCount) {
    this.messageSegmentCount = messageSegmentCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The message segment count, greater than 1 if the message content was split into multiple parts for this message type, e.g. SMS character limits.")
  @JsonProperty("messageSegmentCount")
  public Integer getMessageSegmentCount() {
    return messageSegmentCount;
  }
  public void setMessageSegmentCount(Integer messageSegmentCount) {
    this.messageSegmentCount = messageSegmentCount;
  }


  /**
   * The media (images, files, etc) associated with this message, if any
   **/
  public QueueConversationVideoEventTopicMessageDetails media(List<QueueConversationVideoEventTopicMessageMedia> media) {
    this.media = media;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The media (images, files, etc) associated with this message, if any")
  @JsonProperty("media")
  public List<QueueConversationVideoEventTopicMessageMedia> getMedia() {
    return media;
  }
  public void setMedia(List<QueueConversationVideoEventTopicMessageMedia> media) {
    this.media = media;
  }


  /**
   * Detailed information about an error response.
   **/
  public QueueConversationVideoEventTopicMessageDetails errorInfo(QueueConversationVideoEventTopicErrorDetails errorInfo) {
    this.errorInfo = errorInfo;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Detailed information about an error response.")
  @JsonProperty("errorInfo")
  public QueueConversationVideoEventTopicErrorDetails getErrorInfo() {
    return errorInfo;
  }
  public void setErrorInfo(QueueConversationVideoEventTopicErrorDetails errorInfo) {
    this.errorInfo = errorInfo;
  }


  /**
   * A list of stickers included in the message
   **/
  public QueueConversationVideoEventTopicMessageDetails stickers(List<QueueConversationVideoEventTopicMessageSticker> stickers) {
    this.stickers = stickers;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A list of stickers included in the message")
  @JsonProperty("stickers")
  public List<QueueConversationVideoEventTopicMessageSticker> getStickers() {
    return stickers;
  }
  public void setStickers(List<QueueConversationVideoEventTopicMessageSticker> stickers) {
    this.stickers = stickers;
  }


  /**
   **/
  public QueueConversationVideoEventTopicMessageDetails messageMetadata(QueueConversationVideoEventTopicMessageMetadata messageMetadata) {
    this.messageMetadata = messageMetadata;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("messageMetadata")
  public QueueConversationVideoEventTopicMessageMetadata getMessageMetadata() {
    return messageMetadata;
  }
  public void setMessageMetadata(QueueConversationVideoEventTopicMessageMetadata messageMetadata) {
    this.messageMetadata = messageMetadata;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QueueConversationVideoEventTopicMessageDetails queueConversationVideoEventTopicMessageDetails = (QueueConversationVideoEventTopicMessageDetails) o;

    return Objects.equals(this.messageId, queueConversationVideoEventTopicMessageDetails.messageId) &&
            Objects.equals(this.messageTime, queueConversationVideoEventTopicMessageDetails.messageTime) &&
            Objects.equals(this.messageStatus, queueConversationVideoEventTopicMessageDetails.messageStatus) &&
            Objects.equals(this.messageSegmentCount, queueConversationVideoEventTopicMessageDetails.messageSegmentCount) &&
            Objects.equals(this.media, queueConversationVideoEventTopicMessageDetails.media) &&
            Objects.equals(this.errorInfo, queueConversationVideoEventTopicMessageDetails.errorInfo) &&
            Objects.equals(this.stickers, queueConversationVideoEventTopicMessageDetails.stickers) &&
            Objects.equals(this.messageMetadata, queueConversationVideoEventTopicMessageDetails.messageMetadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(messageId, messageTime, messageStatus, messageSegmentCount, media, errorInfo, stickers, messageMetadata);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueueConversationVideoEventTopicMessageDetails {\n");
    
    sb.append("    messageId: ").append(toIndentedString(messageId)).append("\n");
    sb.append("    messageTime: ").append(toIndentedString(messageTime)).append("\n");
    sb.append("    messageStatus: ").append(toIndentedString(messageStatus)).append("\n");
    sb.append("    messageSegmentCount: ").append(toIndentedString(messageSegmentCount)).append("\n");
    sb.append("    media: ").append(toIndentedString(media)).append("\n");
    sb.append("    errorInfo: ").append(toIndentedString(errorInfo)).append("\n");
    sb.append("    stickers: ").append(toIndentedString(stickers)).append("\n");
    sb.append("    messageMetadata: ").append(toIndentedString(messageMetadata)).append("\n");
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

