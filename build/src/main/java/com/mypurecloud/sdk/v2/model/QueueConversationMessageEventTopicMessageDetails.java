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
import com.mypurecloud.sdk.v2.model.QueueConversationMessageEventTopicErrorDetails;
import com.mypurecloud.sdk.v2.model.QueueConversationMessageEventTopicMessageMedia;
import com.mypurecloud.sdk.v2.model.QueueConversationMessageEventTopicMessageMetadata;
import com.mypurecloud.sdk.v2.model.QueueConversationMessageEventTopicMessageSticker;
import com.mypurecloud.sdk.v2.model.QueueConversationMessageEventTopicUriReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import java.io.Serializable;
/**
 * QueueConversationMessageEventTopicMessageDetails
 */

public class QueueConversationMessageEventTopicMessageDetails  implements Serializable {
  
  private QueueConversationMessageEventTopicUriReference message = null;
  private Date messageTime = null;
  private Long messageSegmentCount = null;

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
   * Gets or Sets messageStatus
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
  private List<QueueConversationMessageEventTopicMessageMedia> media = null;
  private List<QueueConversationMessageEventTopicMessageSticker> stickers = null;
  private QueueConversationMessageEventTopicErrorDetails errorInfo = null;
  private QueueConversationMessageEventTopicMessageMetadata messageMetadata = null;

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
   * Gets or Sets socialVisibility
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

  public QueueConversationMessageEventTopicMessageDetails() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      media = new ArrayList<QueueConversationMessageEventTopicMessageMedia>();
      stickers = new ArrayList<QueueConversationMessageEventTopicMessageSticker>();
    }
  }

  
  /**
   **/
  public QueueConversationMessageEventTopicMessageDetails message(QueueConversationMessageEventTopicUriReference message) {
    this.message = message;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("message")
  public QueueConversationMessageEventTopicUriReference getMessage() {
    return message;
  }
  public void setMessage(QueueConversationMessageEventTopicUriReference message) {
    this.message = message;
  }


  /**
   **/
  public QueueConversationMessageEventTopicMessageDetails messageTime(Date messageTime) {
    this.messageTime = messageTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("messageTime")
  public Date getMessageTime() {
    return messageTime;
  }
  public void setMessageTime(Date messageTime) {
    this.messageTime = messageTime;
  }


  /**
   **/
  public QueueConversationMessageEventTopicMessageDetails messageSegmentCount(Long messageSegmentCount) {
    this.messageSegmentCount = messageSegmentCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("messageSegmentCount")
  public Long getMessageSegmentCount() {
    return messageSegmentCount;
  }
  public void setMessageSegmentCount(Long messageSegmentCount) {
    this.messageSegmentCount = messageSegmentCount;
  }


  /**
   **/
  public QueueConversationMessageEventTopicMessageDetails messageStatus(MessageStatusEnum messageStatus) {
    this.messageStatus = messageStatus;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("messageStatus")
  public MessageStatusEnum getMessageStatus() {
    return messageStatus;
  }
  public void setMessageStatus(MessageStatusEnum messageStatus) {
    this.messageStatus = messageStatus;
  }


  /**
   **/
  public QueueConversationMessageEventTopicMessageDetails media(List<QueueConversationMessageEventTopicMessageMedia> media) {
    this.media = media;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("media")
  public List<QueueConversationMessageEventTopicMessageMedia> getMedia() {
    return media;
  }
  public void setMedia(List<QueueConversationMessageEventTopicMessageMedia> media) {
    this.media = media;
  }


  /**
   **/
  public QueueConversationMessageEventTopicMessageDetails stickers(List<QueueConversationMessageEventTopicMessageSticker> stickers) {
    this.stickers = stickers;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("stickers")
  public List<QueueConversationMessageEventTopicMessageSticker> getStickers() {
    return stickers;
  }
  public void setStickers(List<QueueConversationMessageEventTopicMessageSticker> stickers) {
    this.stickers = stickers;
  }


  /**
   **/
  public QueueConversationMessageEventTopicMessageDetails errorInfo(QueueConversationMessageEventTopicErrorDetails errorInfo) {
    this.errorInfo = errorInfo;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("errorInfo")
  public QueueConversationMessageEventTopicErrorDetails getErrorInfo() {
    return errorInfo;
  }
  public void setErrorInfo(QueueConversationMessageEventTopicErrorDetails errorInfo) {
    this.errorInfo = errorInfo;
  }


  /**
   **/
  public QueueConversationMessageEventTopicMessageDetails messageMetadata(QueueConversationMessageEventTopicMessageMetadata messageMetadata) {
    this.messageMetadata = messageMetadata;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("messageMetadata")
  public QueueConversationMessageEventTopicMessageMetadata getMessageMetadata() {
    return messageMetadata;
  }
  public void setMessageMetadata(QueueConversationMessageEventTopicMessageMetadata messageMetadata) {
    this.messageMetadata = messageMetadata;
  }


  /**
   **/
  public QueueConversationMessageEventTopicMessageDetails socialVisibility(SocialVisibilityEnum socialVisibility) {
    this.socialVisibility = socialVisibility;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
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
    QueueConversationMessageEventTopicMessageDetails queueConversationMessageEventTopicMessageDetails = (QueueConversationMessageEventTopicMessageDetails) o;

    return Objects.equals(this.message, queueConversationMessageEventTopicMessageDetails.message) &&
            Objects.equals(this.messageTime, queueConversationMessageEventTopicMessageDetails.messageTime) &&
            Objects.equals(this.messageSegmentCount, queueConversationMessageEventTopicMessageDetails.messageSegmentCount) &&
            Objects.equals(this.messageStatus, queueConversationMessageEventTopicMessageDetails.messageStatus) &&
            Objects.equals(this.media, queueConversationMessageEventTopicMessageDetails.media) &&
            Objects.equals(this.stickers, queueConversationMessageEventTopicMessageDetails.stickers) &&
            Objects.equals(this.errorInfo, queueConversationMessageEventTopicMessageDetails.errorInfo) &&
            Objects.equals(this.messageMetadata, queueConversationMessageEventTopicMessageDetails.messageMetadata) &&
            Objects.equals(this.socialVisibility, queueConversationMessageEventTopicMessageDetails.socialVisibility);
  }

  @Override
  public int hashCode() {
    return Objects.hash(message, messageTime, messageSegmentCount, messageStatus, media, stickers, errorInfo, messageMetadata, socialVisibility);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueueConversationMessageEventTopicMessageDetails {\n");
    
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    messageTime: ").append(toIndentedString(messageTime)).append("\n");
    sb.append("    messageSegmentCount: ").append(toIndentedString(messageSegmentCount)).append("\n");
    sb.append("    messageStatus: ").append(toIndentedString(messageStatus)).append("\n");
    sb.append("    media: ").append(toIndentedString(media)).append("\n");
    sb.append("    stickers: ").append(toIndentedString(stickers)).append("\n");
    sb.append("    errorInfo: ").append(toIndentedString(errorInfo)).append("\n");
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

