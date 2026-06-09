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
 * RecordingNotificationResponse
 */

public class RecordingNotificationResponse  implements Serializable {
  
  private String originatingMessageId = null;
  private String referenceId = null;

  private static class NotificationStatusEnumDeserializer extends StdDeserializer<NotificationStatusEnum> {
    public NotificationStatusEnumDeserializer() {
      super(NotificationStatusEnumDeserializer.class);
    }

    @Override
    public NotificationStatusEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return NotificationStatusEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The status of the notification response.
   */
 @JsonDeserialize(using = NotificationStatusEnumDeserializer.class)
  public enum NotificationStatusEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    ACCEPTED("Accepted"),
    DECLINED("Declined");

    private String value;

    NotificationStatusEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static NotificationStatusEnum fromString(String key) {
      if (key == null) return null;

      for (NotificationStatusEnum value : NotificationStatusEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return NotificationStatusEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private NotificationStatusEnum notificationStatus = null;
  private String notificationText = null;

  public RecordingNotificationResponse() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  public RecordingNotificationResponse(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
    }
  }

  
  /**
   * Reference to the ID of the original outbound notification message this response is for (e.g. the Apple requestIdentifier).
   **/
  public RecordingNotificationResponse originatingMessageId(String originatingMessageId) {
    this.originatingMessageId = originatingMessageId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Reference to the ID of the original outbound notification message this response is for (e.g. the Apple requestIdentifier).")
  @JsonProperty("originatingMessageId")
  public String getOriginatingMessageId() {
    return originatingMessageId;
  }
  public void setOriginatingMessageId(String originatingMessageId) {
    this.originatingMessageId = originatingMessageId;
  }


  /**
   * The business context reference associated with the notification (e.g. order ID, case ID). May be empty if the provider does not return it.
   **/
  public RecordingNotificationResponse referenceId(String referenceId) {
    this.referenceId = referenceId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The business context reference associated with the notification (e.g. order ID, case ID). May be empty if the provider does not return it.")
  @JsonProperty("referenceId")
  public String getReferenceId() {
    return referenceId;
  }
  public void setReferenceId(String referenceId) {
    this.referenceId = referenceId;
  }


  /**
   * The status of the notification response.
   **/
  public RecordingNotificationResponse notificationStatus(NotificationStatusEnum notificationStatus) {
    this.notificationStatus = notificationStatus;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The status of the notification response.")
  @JsonProperty("notificationStatus")
  public NotificationStatusEnum getNotificationStatus() {
    return notificationStatus;
  }
  public void setNotificationStatus(NotificationStatusEnum notificationStatus) {
    this.notificationStatus = notificationStatus;
  }


  /**
   * The localized display text of the user's response (e.g. \"Yes\").
   **/
  public RecordingNotificationResponse notificationText(String notificationText) {
    this.notificationText = notificationText;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The localized display text of the user's response (e.g. \"Yes\").")
  @JsonProperty("notificationText")
  public String getNotificationText() {
    return notificationText;
  }
  public void setNotificationText(String notificationText) {
    this.notificationText = notificationText;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RecordingNotificationResponse recordingNotificationResponse = (RecordingNotificationResponse) o;

    return Objects.equals(this.originatingMessageId, recordingNotificationResponse.originatingMessageId) &&
            Objects.equals(this.referenceId, recordingNotificationResponse.referenceId) &&
            Objects.equals(this.notificationStatus, recordingNotificationResponse.notificationStatus) &&
            Objects.equals(this.notificationText, recordingNotificationResponse.notificationText);
  }

  @Override
  public int hashCode() {
    return Objects.hash(originatingMessageId, referenceId, notificationStatus, notificationText);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecordingNotificationResponse {\n");
    
    sb.append("    originatingMessageId: ").append(toIndentedString(originatingMessageId)).append("\n");
    sb.append("    referenceId: ").append(toIndentedString(referenceId)).append("\n");
    sb.append("    notificationStatus: ").append(toIndentedString(notificationStatus)).append("\n");
    sb.append("    notificationText: ").append(toIndentedString(notificationText)).append("\n");
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

