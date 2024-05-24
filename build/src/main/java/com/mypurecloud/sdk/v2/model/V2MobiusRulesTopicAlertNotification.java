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
import com.mypurecloud.sdk.v2.model.V2MobiusRulesTopicAlertNotificationRecipient;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * V2MobiusRulesTopicAlertNotification
 */

public class V2MobiusRulesTopicAlertNotification  implements Serializable {
  
  private V2MobiusRulesTopicAlertNotificationRecipient recipient = null;

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
    DEVICE("Device"),
    EMAIL("Email"),
    SMS("Sms"),
    PUSH("Push"),
    UNKNOWN("Unknown");

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
   **/
  public V2MobiusRulesTopicAlertNotification recipient(V2MobiusRulesTopicAlertNotificationRecipient recipient) {
    this.recipient = recipient;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("recipient")
  public V2MobiusRulesTopicAlertNotificationRecipient getRecipient() {
    return recipient;
  }
  public void setRecipient(V2MobiusRulesTopicAlertNotificationRecipient recipient) {
    this.recipient = recipient;
  }


  /**
   **/
  public V2MobiusRulesTopicAlertNotification notificationTypes(List<NotificationTypesEnum> notificationTypes) {
    this.notificationTypes = notificationTypes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("notificationTypes")
  public List<NotificationTypesEnum> getNotificationTypes() {
    return notificationTypes;
  }
  public void setNotificationTypes(List<NotificationTypesEnum> notificationTypes) {
    this.notificationTypes = notificationTypes;
  }


  /**
   **/
  public V2MobiusRulesTopicAlertNotification locale(String locale) {
    this.locale = locale;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
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
    V2MobiusRulesTopicAlertNotification v2MobiusRulesTopicAlertNotification = (V2MobiusRulesTopicAlertNotification) o;

    return Objects.equals(this.recipient, v2MobiusRulesTopicAlertNotification.recipient) &&
            Objects.equals(this.notificationTypes, v2MobiusRulesTopicAlertNotification.notificationTypes) &&
            Objects.equals(this.locale, v2MobiusRulesTopicAlertNotification.locale);
  }

  @Override
  public int hashCode() {
    return Objects.hash(recipient, notificationTypes, locale);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V2MobiusRulesTopicAlertNotification {\n");
    
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

