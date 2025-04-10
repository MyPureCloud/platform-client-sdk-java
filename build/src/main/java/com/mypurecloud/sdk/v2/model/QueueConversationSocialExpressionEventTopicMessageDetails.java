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
import com.mypurecloud.sdk.v2.model.QueueConversationSocialExpressionEventTopicErrorDetails;
import com.mypurecloud.sdk.v2.model.QueueConversationSocialExpressionEventTopicMessageMedia;
import com.mypurecloud.sdk.v2.model.QueueConversationSocialExpressionEventTopicMessageMetadata;
import com.mypurecloud.sdk.v2.model.QueueConversationSocialExpressionEventTopicMessageSticker;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import java.io.Serializable;
/**
 * QueueConversationSocialExpressionEventTopicMessageDetails
 */

public class QueueConversationSocialExpressionEventTopicMessageDetails  implements Serializable {
  
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
    REMOVED("removed"),
    PUBLISHED("published");

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
  private Long messageSegmentCount = null;
  private List<QueueConversationSocialExpressionEventTopicMessageMedia> media = null;
  private QueueConversationSocialExpressionEventTopicErrorDetails errorInfo = null;
  private List<QueueConversationSocialExpressionEventTopicMessageSticker> stickers = null;
  private QueueConversationSocialExpressionEventTopicMessageMetadata messageMetadata = null;

  private static class SocialVisibilityEnumDeserializer extends StdDeserializer<SocialVisibilityEnum> {
    public SocialVisibilityEnumDeserializer() {
      super(SocialVisibilityEnumDeserializer.class);
    }

    @Override
    public SocialVisibilityEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return SocialVisibilityEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * For social media messages, the visibility of the message in the originating social platform
   */
 @JsonDeserialize(using = SocialVisibilityEnumDeserializer.class)
  public enum SocialVisibilityEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    PRIVATE("private"),
    PUBLIC("public");

    private String value;

    SocialVisibilityEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static SocialVisibilityEnum fromString(String key) {
      if (key == null) return null;

      for (SocialVisibilityEnum value : SocialVisibilityEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return SocialVisibilityEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private SocialVisibilityEnum socialVisibility = null;

  public QueueConversationSocialExpressionEventTopicMessageDetails() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      media = new ArrayList<QueueConversationSocialExpressionEventTopicMessageMedia>();
      stickers = new ArrayList<QueueConversationSocialExpressionEventTopicMessageSticker>();
    }
  }

  
  /**
   * UUID identifying the message media.
   **/
  public QueueConversationSocialExpressionEventTopicMessageDetails messageId(String messageId) {
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
  public QueueConversationSocialExpressionEventTopicMessageDetails messageTime(Date messageTime) {
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
  public QueueConversationSocialExpressionEventTopicMessageDetails messageStatus(MessageStatusEnum messageStatus) {
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
  public QueueConversationSocialExpressionEventTopicMessageDetails messageSegmentCount(Long messageSegmentCount) {
    this.messageSegmentCount = messageSegmentCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The message segment count, greater than 1 if the message content was split into multiple parts for this message type, e.g. SMS character limits.")
  @JsonProperty("messageSegmentCount")
  public Long getMessageSegmentCount() {
    return messageSegmentCount;
  }
  public void setMessageSegmentCount(Long messageSegmentCount) {
    this.messageSegmentCount = messageSegmentCount;
  }


  /**
   * The media (images, files, etc) associated with this message, if any
   **/
  public QueueConversationSocialExpressionEventTopicMessageDetails media(List<QueueConversationSocialExpressionEventTopicMessageMedia> media) {
    this.media = media;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The media (images, files, etc) associated with this message, if any")
  @JsonProperty("media")
  public List<QueueConversationSocialExpressionEventTopicMessageMedia> getMedia() {
    return media;
  }
  public void setMedia(List<QueueConversationSocialExpressionEventTopicMessageMedia> media) {
    this.media = media;
  }


  /**
   * Detailed information about an error response.
   **/
  public QueueConversationSocialExpressionEventTopicMessageDetails errorInfo(QueueConversationSocialExpressionEventTopicErrorDetails errorInfo) {
    this.errorInfo = errorInfo;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Detailed information about an error response.")
  @JsonProperty("errorInfo")
  public QueueConversationSocialExpressionEventTopicErrorDetails getErrorInfo() {
    return errorInfo;
  }
  public void setErrorInfo(QueueConversationSocialExpressionEventTopicErrorDetails errorInfo) {
    this.errorInfo = errorInfo;
  }


  /**
   * A list of stickers included in the message
   **/
  public QueueConversationSocialExpressionEventTopicMessageDetails stickers(List<QueueConversationSocialExpressionEventTopicMessageSticker> stickers) {
    this.stickers = stickers;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A list of stickers included in the message")
  @JsonProperty("stickers")
  public List<QueueConversationSocialExpressionEventTopicMessageSticker> getStickers() {
    return stickers;
  }
  public void setStickers(List<QueueConversationSocialExpressionEventTopicMessageSticker> stickers) {
    this.stickers = stickers;
  }


  /**
   **/
  public QueueConversationSocialExpressionEventTopicMessageDetails messageMetadata(QueueConversationSocialExpressionEventTopicMessageMetadata messageMetadata) {
    this.messageMetadata = messageMetadata;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("messageMetadata")
  public QueueConversationSocialExpressionEventTopicMessageMetadata getMessageMetadata() {
    return messageMetadata;
  }
  public void setMessageMetadata(QueueConversationSocialExpressionEventTopicMessageMetadata messageMetadata) {
    this.messageMetadata = messageMetadata;
  }


  /**
   * For social media messages, the visibility of the message in the originating social platform
   **/
  public QueueConversationSocialExpressionEventTopicMessageDetails socialVisibility(SocialVisibilityEnum socialVisibility) {
    this.socialVisibility = socialVisibility;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "For social media messages, the visibility of the message in the originating social platform")
  @JsonProperty("socialVisibility")
  public SocialVisibilityEnum getSocialVisibility() {
    return socialVisibility;
  }
  public void setSocialVisibility(SocialVisibilityEnum socialVisibility) {
    this.socialVisibility = socialVisibility;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QueueConversationSocialExpressionEventTopicMessageDetails queueConversationSocialExpressionEventTopicMessageDetails = (QueueConversationSocialExpressionEventTopicMessageDetails) o;

    return Objects.equals(this.messageId, queueConversationSocialExpressionEventTopicMessageDetails.messageId) &&
            Objects.equals(this.messageTime, queueConversationSocialExpressionEventTopicMessageDetails.messageTime) &&
            Objects.equals(this.messageStatus, queueConversationSocialExpressionEventTopicMessageDetails.messageStatus) &&
            Objects.equals(this.messageSegmentCount, queueConversationSocialExpressionEventTopicMessageDetails.messageSegmentCount) &&
            Objects.equals(this.media, queueConversationSocialExpressionEventTopicMessageDetails.media) &&
            Objects.equals(this.errorInfo, queueConversationSocialExpressionEventTopicMessageDetails.errorInfo) &&
            Objects.equals(this.stickers, queueConversationSocialExpressionEventTopicMessageDetails.stickers) &&
            Objects.equals(this.messageMetadata, queueConversationSocialExpressionEventTopicMessageDetails.messageMetadata) &&
            Objects.equals(this.socialVisibility, queueConversationSocialExpressionEventTopicMessageDetails.socialVisibility);
  }

  @Override
  public int hashCode() {
    return Objects.hash(messageId, messageTime, messageStatus, messageSegmentCount, media, errorInfo, stickers, messageMetadata, socialVisibility);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueueConversationSocialExpressionEventTopicMessageDetails {\n");
    
    sb.append("    messageId: ").append(toIndentedString(messageId)).append("\n");
    sb.append("    messageTime: ").append(toIndentedString(messageTime)).append("\n");
    sb.append("    messageStatus: ").append(toIndentedString(messageStatus)).append("\n");
    sb.append("    messageSegmentCount: ").append(toIndentedString(messageSegmentCount)).append("\n");
    sb.append("    media: ").append(toIndentedString(media)).append("\n");
    sb.append("    errorInfo: ").append(toIndentedString(errorInfo)).append("\n");
    sb.append("    stickers: ").append(toIndentedString(stickers)).append("\n");
    sb.append("    messageMetadata: ").append(toIndentedString(messageMetadata)).append("\n");
    sb.append("    socialVisibility: ").append(toIndentedString(socialVisibility)).append("\n");
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

