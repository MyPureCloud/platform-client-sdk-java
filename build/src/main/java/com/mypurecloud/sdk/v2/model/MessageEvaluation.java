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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

import java.io.Serializable;
/**
 * MessageEvaluation
 */

public class MessageEvaluation  implements Serializable {
  
  private String contactColumn = null;
  private String contactAddress = null;

  private static class MessageTypeEnumDeserializer extends StdDeserializer<MessageTypeEnum> {
    public MessageTypeEnumDeserializer() {
      super(MessageTypeEnumDeserializer.class);
    }

    @Override
    public MessageTypeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return MessageTypeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The type of message sent
   */
 @JsonDeserialize(using = MessageTypeEnumDeserializer.class)
  public enum MessageTypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    SMS("Sms"),
    EMAIL("Email");

    private String value;

    MessageTypeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static MessageTypeEnum fromString(String key) {
      if (key == null) return null;

      for (MessageTypeEnum value : MessageTypeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return MessageTypeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private MessageTypeEnum messageType = null;
  private String wrapupCodeId = null;
  private Date timestamp = null;

  
  /**
   * The name of the contact column that was wrapped up
   **/
  public MessageEvaluation contactColumn(String contactColumn) {
    this.contactColumn = contactColumn;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The name of the contact column that was wrapped up")
  @JsonProperty("contactColumn")
  public String getContactColumn() {
    return contactColumn;
  }
  public void setContactColumn(String contactColumn) {
    this.contactColumn = contactColumn;
  }

  
  /**
   * The address (phone or email) that was wrapped up
   **/
  public MessageEvaluation contactAddress(String contactAddress) {
    this.contactAddress = contactAddress;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The address (phone or email) that was wrapped up")
  @JsonProperty("contactAddress")
  public String getContactAddress() {
    return contactAddress;
  }
  public void setContactAddress(String contactAddress) {
    this.contactAddress = contactAddress;
  }

  
  /**
   * The type of message sent
   **/
  public MessageEvaluation messageType(MessageTypeEnum messageType) {
    this.messageType = messageType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The type of message sent")
  @JsonProperty("messageType")
  public MessageTypeEnum getMessageType() {
    return messageType;
  }
  public void setMessageType(MessageTypeEnum messageType) {
    this.messageType = messageType;
  }

  
  /**
   * The id of the wrap-up code
   **/
  public MessageEvaluation wrapupCodeId(String wrapupCodeId) {
    this.wrapupCodeId = wrapupCodeId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The id of the wrap-up code")
  @JsonProperty("wrapupCodeId")
  public String getWrapupCodeId() {
    return wrapupCodeId;
  }
  public void setWrapupCodeId(String wrapupCodeId) {
    this.wrapupCodeId = wrapupCodeId;
  }

  
  /**
   * The time that the wrap-up was applied. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public MessageEvaluation timestamp(Date timestamp) {
    this.timestamp = timestamp;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The time that the wrap-up was applied. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("timestamp")
  public Date getTimestamp() {
    return timestamp;
  }
  public void setTimestamp(Date timestamp) {
    this.timestamp = timestamp;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MessageEvaluation messageEvaluation = (MessageEvaluation) o;
    return Objects.equals(this.contactColumn, messageEvaluation.contactColumn) &&
        Objects.equals(this.contactAddress, messageEvaluation.contactAddress) &&
        Objects.equals(this.messageType, messageEvaluation.messageType) &&
        Objects.equals(this.wrapupCodeId, messageEvaluation.wrapupCodeId) &&
        Objects.equals(this.timestamp, messageEvaluation.timestamp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contactColumn, contactAddress, messageType, wrapupCodeId, timestamp);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MessageEvaluation {\n");
    
    sb.append("    contactColumn: ").append(toIndentedString(contactColumn)).append("\n");
    sb.append("    contactAddress: ").append(toIndentedString(contactAddress)).append("\n");
    sb.append("    messageType: ").append(toIndentedString(messageType)).append("\n");
    sb.append("    wrapupCodeId: ").append(toIndentedString(wrapupCodeId)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
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

