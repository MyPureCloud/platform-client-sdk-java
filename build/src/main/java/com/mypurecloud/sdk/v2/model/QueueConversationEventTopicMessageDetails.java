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
import com.mypurecloud.sdk.v2.model.QueueConversationEventTopicMessageMedia;
import com.mypurecloud.sdk.v2.model.QueueConversationEventTopicMessageSticker;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import java.io.Serializable;
/**
 * QueueConversationEventTopicMessageDetails
 */

public class QueueConversationEventTopicMessageDetails  implements Serializable {
  
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
   * Gets or Sets messageStatus
   */
 @JsonDeserialize(using = MessageStatusEnumDeserializer.class)
  public enum MessageStatusEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    QUEUED("QUEUED"),
    SENT("SENT"),
    FAILED("FAILED"),
    RECEIVED("RECEIVED"),
    DELIVERY_SUCCESS("DELIVERY_SUCCESS"),
    DELIVERY_FAILED("DELIVERY_FAILED"),
    READ("READ");

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
  private List<QueueConversationEventTopicMessageMedia> media = new ArrayList<QueueConversationEventTopicMessageMedia>();
  private List<QueueConversationEventTopicMessageSticker> stickers = new ArrayList<QueueConversationEventTopicMessageSticker>();

  
  /**
   **/
  public QueueConversationEventTopicMessageDetails messageId(String messageId) {
    this.messageId = messageId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("messageId")
  public String getMessageId() {
    return messageId;
  }
  public void setMessageId(String messageId) {
    this.messageId = messageId;
  }

  
  /**
   **/
  public QueueConversationEventTopicMessageDetails messageTime(Date messageTime) {
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
  public QueueConversationEventTopicMessageDetails messageStatus(MessageStatusEnum messageStatus) {
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
  public QueueConversationEventTopicMessageDetails messageSegmentCount(Integer messageSegmentCount) {
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
  public QueueConversationEventTopicMessageDetails media(List<QueueConversationEventTopicMessageMedia> media) {
    this.media = media;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("media")
  public List<QueueConversationEventTopicMessageMedia> getMedia() {
    return media;
  }
  public void setMedia(List<QueueConversationEventTopicMessageMedia> media) {
    this.media = media;
  }

  
  /**
   **/
  public QueueConversationEventTopicMessageDetails stickers(List<QueueConversationEventTopicMessageSticker> stickers) {
    this.stickers = stickers;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("stickers")
  public List<QueueConversationEventTopicMessageSticker> getStickers() {
    return stickers;
  }
  public void setStickers(List<QueueConversationEventTopicMessageSticker> stickers) {
    this.stickers = stickers;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QueueConversationEventTopicMessageDetails queueConversationEventTopicMessageDetails = (QueueConversationEventTopicMessageDetails) o;
    return Objects.equals(this.messageId, queueConversationEventTopicMessageDetails.messageId) &&
        Objects.equals(this.messageTime, queueConversationEventTopicMessageDetails.messageTime) &&
        Objects.equals(this.messageStatus, queueConversationEventTopicMessageDetails.messageStatus) &&
        Objects.equals(this.messageSegmentCount, queueConversationEventTopicMessageDetails.messageSegmentCount) &&
        Objects.equals(this.media, queueConversationEventTopicMessageDetails.media) &&
        Objects.equals(this.stickers, queueConversationEventTopicMessageDetails.stickers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(messageId, messageTime, messageStatus, messageSegmentCount, media, stickers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueueConversationEventTopicMessageDetails {\n");
    
    sb.append("    messageId: ").append(toIndentedString(messageId)).append("\n");
    sb.append("    messageTime: ").append(toIndentedString(messageTime)).append("\n");
    sb.append("    messageStatus: ").append(toIndentedString(messageStatus)).append("\n");
    sb.append("    messageSegmentCount: ").append(toIndentedString(messageSegmentCount)).append("\n");
    sb.append("    media: ").append(toIndentedString(media)).append("\n");
    sb.append("    stickers: ").append(toIndentedString(stickers)).append("\n");
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

