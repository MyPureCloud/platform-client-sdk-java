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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.List;

import java.io.Serializable;
/**
 * AlertNotification
 */

public class AlertNotification  implements Serializable {
  
  private String recipient = null;

  private static class NotificationTypesEnumDeserializer extends StdDeserializer<NotificationTypesEnum> {
    public NotificationTypesEnumDeserializer() {
      super(NotificationTypesEnumDeserializer.class);
    }

    @Override
    public NotificationTypesEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return NotificationTypesEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Gets or Sets notificationTypes
   */
 @JsonDeserialize(using = NotificationTypesEnumDeserializer.class)
  public enum NotificationTypesEnum {
    SMS("Sms"),
    DEVICE("Device"),
    EMAIL("Email"),
    PUSH("Push");

    private String value;

    NotificationTypesEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static NotificationTypesEnum fromString(String key) {
      if (key == null) return null;

      for (NotificationTypesEnum value : NotificationTypesEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return NotificationTypesEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private List<NotificationTypesEnum> notificationTypes = new ArrayList<NotificationTypesEnum>();
  private String locale = null;

  
  /**
   * The entity to receive the notification.
   **/
  public AlertNotification recipient(String recipient) {
    this.recipient = recipient;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The entity to receive the notification.")
  @JsonProperty("recipient")
  public String getRecipient() {
    return recipient;
  }
  public void setRecipient(String recipient) {
    this.recipient = recipient;
  }


  /**
   * The notification types the user will receive.
   **/
  public AlertNotification notificationTypes(List<NotificationTypesEnum> notificationTypes) {
    this.notificationTypes = notificationTypes;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The notification types the user will receive.")
  @JsonProperty("notificationTypes")
  public List<NotificationTypesEnum> getNotificationTypes() {
    return notificationTypes;
  }
  public void setNotificationTypes(List<NotificationTypesEnum> notificationTypes) {
    this.notificationTypes = notificationTypes;
  }


  /**
   * The locale whose language will be used when sending alerts.  Locale should be in theformat language_COUNTRY where language is always lower case and country is always upper case.
   **/
  public AlertNotification locale(String locale) {
    this.locale = locale;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The locale whose language will be used when sending alerts.  Locale should be in theformat language_COUNTRY where language is always lower case and country is always upper case.")
  @JsonProperty("locale")
  public String getLocale() {
    return locale;
  }
  public void setLocale(String locale) {
    this.locale = locale;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlertNotification alertNotification = (AlertNotification) o;

    return Objects.equals(this.recipient, alertNotification.recipient) &&
            Objects.equals(this.notificationTypes, alertNotification.notificationTypes) &&
            Objects.equals(this.locale, alertNotification.locale);
  }

  @Override
  public int hashCode() {
    return Objects.hash(recipient, notificationTypes, locale);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlertNotification {\n");
    
    sb.append("    recipient: ").append(toIndentedString(recipient)).append("\n");
    sb.append("    notificationTypes: ").append(toIndentedString(notificationTypes)).append("\n");
    sb.append("    locale: ").append(toIndentedString(locale)).append("\n");
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

