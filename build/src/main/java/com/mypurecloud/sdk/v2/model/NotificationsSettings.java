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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * Notification settings that handles messenger notifications
 */
@ApiModel(description = "Notification settings that handles messenger notifications")

public class NotificationsSettings  implements Serializable {
  
  private Boolean enabled = null;

  private static class NotificationContentTypeEnumDeserializer extends StdDeserializer<NotificationContentTypeEnum> {
    public NotificationContentTypeEnumDeserializer() {
      super(NotificationContentTypeEnumDeserializer.class);
    }

    @Override
    public NotificationContentTypeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return NotificationContentTypeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The notification content type settings for messenger
   */
 @JsonDeserialize(using = NotificationContentTypeEnumDeserializer.class)
  public enum NotificationContentTypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    INCLUDEMESSAGESCONTENT("IncludeMessagesContent"),
    EXCLUDEMESSAGESCONTENT("ExcludeMessagesContent");

    private String value;

    NotificationContentTypeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static NotificationContentTypeEnum fromString(String key) {
      if (key == null) return null;

      for (NotificationContentTypeEnum value : NotificationContentTypeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return NotificationContentTypeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private NotificationContentTypeEnum notificationContentType = null;

  public NotificationsSettings() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * The toggle to enable or disable notifications
   **/
  public NotificationsSettings enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The toggle to enable or disable notifications")
  @JsonProperty("enabled")
  public Boolean getEnabled() {
    return enabled;
  }
  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }


  /**
   * The notification content type settings for messenger
   **/
  public NotificationsSettings notificationContentType(NotificationContentTypeEnum notificationContentType) {
    this.notificationContentType = notificationContentType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The notification content type settings for messenger")
  @JsonProperty("notificationContentType")
  public NotificationContentTypeEnum getNotificationContentType() {
    return notificationContentType;
  }
  public void setNotificationContentType(NotificationContentTypeEnum notificationContentType) {
    this.notificationContentType = notificationContentType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NotificationsSettings notificationsSettings = (NotificationsSettings) o;

    return Objects.equals(this.enabled, notificationsSettings.enabled) &&
            Objects.equals(this.notificationContentType, notificationsSettings.notificationContentType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enabled, notificationContentType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NotificationsSettings {\n");
    
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    notificationContentType: ").append(toIndentedString(notificationContentType)).append("\n");
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

