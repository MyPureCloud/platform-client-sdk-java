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
import com.mypurecloud.sdk.v2.model.V2ConversationMessageTypingEventForUserTopicConversationMessagingFromRecipient;
import com.mypurecloud.sdk.v2.model.V2ConversationMessageTypingEventForUserTopicConversationMessagingToRecipient;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

import java.io.Serializable;
/**
 * V2ConversationMessageTypingEventForUserTopicConversationMessagingChannel
 */

public class V2ConversationMessageTypingEventForUserTopicConversationMessagingChannel  implements Serializable {
  
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
   * Gets or Sets platform
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
    SMS("Sms"),
    APPLE("Apple");

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
  private V2ConversationMessageTypingEventForUserTopicConversationMessagingToRecipient to = null;
  private V2ConversationMessageTypingEventForUserTopicConversationMessagingFromRecipient from = null;
  private Date time = null;

  public V2ConversationMessageTypingEventForUserTopicConversationMessagingChannel() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   **/
  public V2ConversationMessageTypingEventForUserTopicConversationMessagingChannel id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }


  /**
   **/
  public V2ConversationMessageTypingEventForUserTopicConversationMessagingChannel platform(PlatformEnum platform) {
    this.platform = platform;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("platform")
  public PlatformEnum getPlatform() {
    return platform;
  }
  public void setPlatform(PlatformEnum platform) {
    this.platform = platform;
  }


  /**
   **/
  public V2ConversationMessageTypingEventForUserTopicConversationMessagingChannel to(V2ConversationMessageTypingEventForUserTopicConversationMessagingToRecipient to) {
    this.to = to;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("to")
  public V2ConversationMessageTypingEventForUserTopicConversationMessagingToRecipient getTo() {
    return to;
  }
  public void setTo(V2ConversationMessageTypingEventForUserTopicConversationMessagingToRecipient to) {
    this.to = to;
  }


  /**
   **/
  public V2ConversationMessageTypingEventForUserTopicConversationMessagingChannel from(V2ConversationMessageTypingEventForUserTopicConversationMessagingFromRecipient from) {
    this.from = from;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("from")
  public V2ConversationMessageTypingEventForUserTopicConversationMessagingFromRecipient getFrom() {
    return from;
  }
  public void setFrom(V2ConversationMessageTypingEventForUserTopicConversationMessagingFromRecipient from) {
    this.from = from;
  }


  /**
   **/
  public V2ConversationMessageTypingEventForUserTopicConversationMessagingChannel time(Date time) {
    this.time = time;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("time")
  public Date getTime() {
    return time;
  }
  public void setTime(Date time) {
    this.time = time;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V2ConversationMessageTypingEventForUserTopicConversationMessagingChannel v2ConversationMessageTypingEventForUserTopicConversationMessagingChannel = (V2ConversationMessageTypingEventForUserTopicConversationMessagingChannel) o;

    return Objects.equals(this.id, v2ConversationMessageTypingEventForUserTopicConversationMessagingChannel.id) &&
            Objects.equals(this.platform, v2ConversationMessageTypingEventForUserTopicConversationMessagingChannel.platform) &&
            Objects.equals(this.to, v2ConversationMessageTypingEventForUserTopicConversationMessagingChannel.to) &&
            Objects.equals(this.from, v2ConversationMessageTypingEventForUserTopicConversationMessagingChannel.from) &&
            Objects.equals(this.time, v2ConversationMessageTypingEventForUserTopicConversationMessagingChannel.time);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, platform, to, from, time);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V2ConversationMessageTypingEventForUserTopicConversationMessagingChannel {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    platform: ").append(toIndentedString(platform)).append("\n");
    sb.append("    to: ").append(toIndentedString(to)).append("\n");
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
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

