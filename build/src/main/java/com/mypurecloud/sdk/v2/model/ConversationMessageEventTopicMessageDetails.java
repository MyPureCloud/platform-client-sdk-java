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
import com.mypurecloud.sdk.v2.model.ConversationMessageEventTopicErrorDetails;
import com.mypurecloud.sdk.v2.model.ConversationMessageEventTopicMessageMedia;
import com.mypurecloud.sdk.v2.model.ConversationMessageEventTopicMessageMetadata;
import com.mypurecloud.sdk.v2.model.ConversationMessageEventTopicMessageSticker;
import com.mypurecloud.sdk.v2.model.ConversationMessageEventTopicUriReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import java.io.Serializable;
/**
 * ConversationMessageEventTopicMessageDetails
 */

public class ConversationMessageEventTopicMessageDetails  implements Serializable {
  
  private ConversationMessageEventTopicUriReference message = null;
  private Date messageTime = null;
  private Integer messageSegmentCount = null;

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
  private List<ConversationMessageEventTopicMessageMedia> media = new ArrayList<ConversationMessageEventTopicMessageMedia>();
  private List<ConversationMessageEventTopicMessageSticker> stickers = new ArrayList<ConversationMessageEventTopicMessageSticker>();
  private ConversationMessageEventTopicErrorDetails errorInfo = null;
  private ConversationMessageEventTopicMessageMetadata messageMetadata = null;

  
  /**
   **/
  public ConversationMessageEventTopicMessageDetails message(ConversationMessageEventTopicUriReference message) {
    this.message = message;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("message")
  public ConversationMessageEventTopicUriReference getMessage() {
    return message;
  }
  public void setMessage(ConversationMessageEventTopicUriReference message) {
    this.message = message;
  }


  /**
   **/
  public ConversationMessageEventTopicMessageDetails messageTime(Date messageTime) {
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
  public ConversationMessageEventTopicMessageDetails messageSegmentCount(Integer messageSegmentCount) {
    this.messageSegmentCount = messageSegmentCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("messageSegmentCount")
  public Integer getMessageSegmentCount() {
    return messageSegmentCount;
  }
  public void setMessageSegmentCount(Integer messageSegmentCount) {
    this.messageSegmentCount = messageSegmentCount;
  }


  /**
   **/
  public ConversationMessageEventTopicMessageDetails messageStatus(MessageStatusEnum messageStatus) {
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
  public ConversationMessageEventTopicMessageDetails media(List<ConversationMessageEventTopicMessageMedia> media) {
    this.media = media;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("media")
  public List<ConversationMessageEventTopicMessageMedia> getMedia() {
    return media;
  }
  public void setMedia(List<ConversationMessageEventTopicMessageMedia> media) {
    this.media = media;
  }


  /**
   **/
  public ConversationMessageEventTopicMessageDetails stickers(List<ConversationMessageEventTopicMessageSticker> stickers) {
    this.stickers = stickers;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("stickers")
  public List<ConversationMessageEventTopicMessageSticker> getStickers() {
    return stickers;
  }
  public void setStickers(List<ConversationMessageEventTopicMessageSticker> stickers) {
    this.stickers = stickers;
  }


  /**
   **/
  public ConversationMessageEventTopicMessageDetails errorInfo(ConversationMessageEventTopicErrorDetails errorInfo) {
    this.errorInfo = errorInfo;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("errorInfo")
  public ConversationMessageEventTopicErrorDetails getErrorInfo() {
    return errorInfo;
  }
  public void setErrorInfo(ConversationMessageEventTopicErrorDetails errorInfo) {
    this.errorInfo = errorInfo;
  }


  /**
   **/
  public ConversationMessageEventTopicMessageDetails messageMetadata(ConversationMessageEventTopicMessageMetadata messageMetadata) {
    this.messageMetadata = messageMetadata;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("messageMetadata")
  public ConversationMessageEventTopicMessageMetadata getMessageMetadata() {
    return messageMetadata;
  }
  public void setMessageMetadata(ConversationMessageEventTopicMessageMetadata messageMetadata) {
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
    ConversationMessageEventTopicMessageDetails conversationMessageEventTopicMessageDetails = (ConversationMessageEventTopicMessageDetails) o;

    return Objects.equals(this.message, conversationMessageEventTopicMessageDetails.message) &&
            Objects.equals(this.messageTime, conversationMessageEventTopicMessageDetails.messageTime) &&
            Objects.equals(this.messageSegmentCount, conversationMessageEventTopicMessageDetails.messageSegmentCount) &&
            Objects.equals(this.messageStatus, conversationMessageEventTopicMessageDetails.messageStatus) &&
            Objects.equals(this.media, conversationMessageEventTopicMessageDetails.media) &&
            Objects.equals(this.stickers, conversationMessageEventTopicMessageDetails.stickers) &&
            Objects.equals(this.errorInfo, conversationMessageEventTopicMessageDetails.errorInfo) &&
            Objects.equals(this.messageMetadata, conversationMessageEventTopicMessageDetails.messageMetadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(message, messageTime, messageSegmentCount, messageStatus, media, stickers, errorInfo, messageMetadata);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConversationMessageEventTopicMessageDetails {\n");
    
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    messageTime: ").append(toIndentedString(messageTime)).append("\n");
    sb.append("    messageSegmentCount: ").append(toIndentedString(messageSegmentCount)).append("\n");
    sb.append("    messageStatus: ").append(toIndentedString(messageStatus)).append("\n");
    sb.append("    media: ").append(toIndentedString(media)).append("\n");
    sb.append("    stickers: ").append(toIndentedString(stickers)).append("\n");
    sb.append("    errorInfo: ").append(toIndentedString(errorInfo)).append("\n");
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

