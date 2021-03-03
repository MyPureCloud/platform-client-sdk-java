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
import com.mypurecloud.sdk.v2.model.MessageMedia;
import com.mypurecloud.sdk.v2.model.MessageSticker;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import java.io.Serializable;
/**
 * MessageDetails
 */

public class MessageDetails  implements Serializable {
  
  private String messageId = null;
  private String messageURI = null;

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
    READ("read");

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
  private Date messageTime = null;
  private List<MessageMedia> media = new ArrayList<MessageMedia>();
  private List<MessageSticker> stickers = new ArrayList<MessageSticker>();

  
  /**
   * UUID identifying the message media.
   **/
  public MessageDetails messageId(String messageId) {
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
   * A URI for this message entity.
   **/
  public MessageDetails messageURI(String messageURI) {
    this.messageURI = messageURI;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A URI for this message entity.")
  @JsonProperty("messageURI")
  public String getMessageURI() {
    return messageURI;
  }
  public void setMessageURI(String messageURI) {
    this.messageURI = messageURI;
  }

  
  /**
   * Indicates the delivery status of the message.
   **/
  public MessageDetails messageStatus(MessageStatusEnum messageStatus) {
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
  public MessageDetails messageSegmentCount(Integer messageSegmentCount) {
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
   * The time when the message was sent or received. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public MessageDetails messageTime(Date messageTime) {
    this.messageTime = messageTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The time when the message was sent or received. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("messageTime")
  public Date getMessageTime() {
    return messageTime;
  }
  public void setMessageTime(Date messageTime) {
    this.messageTime = messageTime;
  }

  
  /**
   * The media (images, files, etc) associated with this message, if any
   **/
  public MessageDetails media(List<MessageMedia> media) {
    this.media = media;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The media (images, files, etc) associated with this message, if any")
  @JsonProperty("media")
  public List<MessageMedia> getMedia() {
    return media;
  }
  public void setMedia(List<MessageMedia> media) {
    this.media = media;
  }

  
  /**
   * One or more stickers associated with this message, if any
   **/
  public MessageDetails stickers(List<MessageSticker> stickers) {
    this.stickers = stickers;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "One or more stickers associated with this message, if any")
  @JsonProperty("stickers")
  public List<MessageSticker> getStickers() {
    return stickers;
  }
  public void setStickers(List<MessageSticker> stickers) {
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
    MessageDetails messageDetails = (MessageDetails) o;
    return Objects.equals(this.messageId, messageDetails.messageId) &&
        Objects.equals(this.messageURI, messageDetails.messageURI) &&
        Objects.equals(this.messageStatus, messageDetails.messageStatus) &&
        Objects.equals(this.messageSegmentCount, messageDetails.messageSegmentCount) &&
        Objects.equals(this.messageTime, messageDetails.messageTime) &&
        Objects.equals(this.media, messageDetails.media) &&
        Objects.equals(this.stickers, messageDetails.stickers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(messageId, messageURI, messageStatus, messageSegmentCount, messageTime, media, stickers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MessageDetails {\n");
    
    sb.append("    messageId: ").append(toIndentedString(messageId)).append("\n");
    sb.append("    messageURI: ").append(toIndentedString(messageURI)).append("\n");
    sb.append("    messageStatus: ").append(toIndentedString(messageStatus)).append("\n");
    sb.append("    messageSegmentCount: ").append(toIndentedString(messageSegmentCount)).append("\n");
    sb.append("    messageTime: ").append(toIndentedString(messageTime)).append("\n");
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

