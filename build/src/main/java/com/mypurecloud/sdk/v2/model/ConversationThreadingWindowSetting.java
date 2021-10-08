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

import java.io.Serializable;
/**
 * ConversationThreadingWindowSetting
 */

public class ConversationThreadingWindowSetting  implements Serializable {
  

  private static class MessengerTypeEnumDeserializer extends StdDeserializer<MessengerTypeEnum> {
    public MessengerTypeEnumDeserializer() {
      super(MessengerTypeEnumDeserializer.class);
    }

    @Override
    public MessengerTypeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return MessengerTypeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The type of messenger
   */
 @JsonDeserialize(using = MessengerTypeEnumDeserializer.class)
  public enum MessengerTypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    SMS("sms"),
    FACEBOOK("facebook"),
    TWITTER("twitter"),
    LINE("line"),
    WHATSAPP("whatsapp"),
    WEBMESSAGING("webmessaging"),
    INSTAGRAM("instagram"),
    OPEN("open");

    private String value;

    MessengerTypeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static MessengerTypeEnum fromString(String key) {
      if (key == null) return null;

      for (MessengerTypeEnum value : MessengerTypeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return MessengerTypeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private MessengerTypeEnum messengerType = null;
  private Long timeoutInMinutes = null;

  
  /**
   * The type of messenger
   **/
  public ConversationThreadingWindowSetting messengerType(MessengerTypeEnum messengerType) {
    this.messengerType = messengerType;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The type of messenger")
  @JsonProperty("messengerType")
  public MessengerTypeEnum getMessengerType() {
    return messengerType;
  }
  public void setMessengerType(MessengerTypeEnum messengerType) {
    this.messengerType = messengerType;
  }

  
  /**
   * The conversation threading window timeout (Minutes) of specified messenger type
   **/
  public ConversationThreadingWindowSetting timeoutInMinutes(Long timeoutInMinutes) {
    this.timeoutInMinutes = timeoutInMinutes;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The conversation threading window timeout (Minutes) of specified messenger type")
  @JsonProperty("timeoutInMinutes")
  public Long getTimeoutInMinutes() {
    return timeoutInMinutes;
  }
  public void setTimeoutInMinutes(Long timeoutInMinutes) {
    this.timeoutInMinutes = timeoutInMinutes;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConversationThreadingWindowSetting conversationThreadingWindowSetting = (ConversationThreadingWindowSetting) o;
    return Objects.equals(this.messengerType, conversationThreadingWindowSetting.messengerType) &&
        Objects.equals(this.timeoutInMinutes, conversationThreadingWindowSetting.timeoutInMinutes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(messengerType, timeoutInMinutes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConversationThreadingWindowSetting {\n");
    
    sb.append("    messengerType: ").append(toIndentedString(messengerType)).append("\n");
    sb.append("    timeoutInMinutes: ").append(toIndentedString(timeoutInMinutes)).append("\n");
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

