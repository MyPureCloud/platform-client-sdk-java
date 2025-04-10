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
import com.mypurecloud.sdk.v2.model.BuNotificationSettingsRequest;
import com.mypurecloud.sdk.v2.model.BuSchedulingSettingsRequest;
import com.mypurecloud.sdk.v2.model.BuShortTermForecastingSettings;
import com.mypurecloud.sdk.v2.model.WfmVersionedEntityMetadata;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * UpdateBusinessUnitSettingsRequest
 */

public class UpdateBusinessUnitSettingsRequest  implements Serializable {
  

  private static class StartDayOfWeekEnumDeserializer extends StdDeserializer<StartDayOfWeekEnum> {
    public StartDayOfWeekEnumDeserializer() {
      super(StartDayOfWeekEnumDeserializer.class);
    }

    @Override
    public StartDayOfWeekEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return StartDayOfWeekEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The start day of week for this business unit
   */
 @JsonDeserialize(using = StartDayOfWeekEnumDeserializer.class)
  public enum StartDayOfWeekEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    SUNDAY("Sunday"),
    MONDAY("Monday"),
    TUESDAY("Tuesday"),
    WEDNESDAY("Wednesday"),
    THURSDAY("Thursday"),
    FRIDAY("Friday"),
    SATURDAY("Saturday");

    private String value;

    StartDayOfWeekEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static StartDayOfWeekEnum fromString(String key) {
      if (key == null) return null;

      for (StartDayOfWeekEnum value : StartDayOfWeekEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return StartDayOfWeekEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private StartDayOfWeekEnum startDayOfWeek = null;
  private String timeZone = null;
  private BuShortTermForecastingSettings shortTermForecasting = null;
  private BuSchedulingSettingsRequest scheduling = null;
  private BuNotificationSettingsRequest notifications = null;
  private WfmVersionedEntityMetadata metadata = null;

  public UpdateBusinessUnitSettingsRequest() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  @ApiModelProperty(example = "null", value = "The start day of week for this business unit")
  @JsonProperty("startDayOfWeek")
  public StartDayOfWeekEnum getStartDayOfWeek() {
    return startDayOfWeek;
  }


  @ApiModelProperty(example = "null", value = "The time zone for this business unit, using the Olsen tz database format")
  @JsonProperty("timeZone")
  public String getTimeZone() {
    return timeZone;
  }


  /**
   * Short term forecasting settings
   **/
  public UpdateBusinessUnitSettingsRequest shortTermForecasting(BuShortTermForecastingSettings shortTermForecasting) {
    this.shortTermForecasting = shortTermForecasting;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Short term forecasting settings")
  @JsonProperty("shortTermForecasting")
  public BuShortTermForecastingSettings getShortTermForecasting() {
    return shortTermForecasting;
  }
  public void setShortTermForecasting(BuShortTermForecastingSettings shortTermForecasting) {
    this.shortTermForecasting = shortTermForecasting;
  }


  /**
   * Scheduling settings
   **/
  public UpdateBusinessUnitSettingsRequest scheduling(BuSchedulingSettingsRequest scheduling) {
    this.scheduling = scheduling;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Scheduling settings")
  @JsonProperty("scheduling")
  public BuSchedulingSettingsRequest getScheduling() {
    return scheduling;
  }
  public void setScheduling(BuSchedulingSettingsRequest scheduling) {
    this.scheduling = scheduling;
  }


  /**
   * Notification settings
   **/
  public UpdateBusinessUnitSettingsRequest notifications(BuNotificationSettingsRequest notifications) {
    this.notifications = notifications;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Notification settings")
  @JsonProperty("notifications")
  public BuNotificationSettingsRequest getNotifications() {
    return notifications;
  }
  public void setNotifications(BuNotificationSettingsRequest notifications) {
    this.notifications = notifications;
  }


  /**
   * Version metadata for this business unit
   **/
  public UpdateBusinessUnitSettingsRequest metadata(WfmVersionedEntityMetadata metadata) {
    this.metadata = metadata;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Version metadata for this business unit")
  @JsonProperty("metadata")
  public WfmVersionedEntityMetadata getMetadata() {
    return metadata;
  }
  public void setMetadata(WfmVersionedEntityMetadata metadata) {
    this.metadata = metadata;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateBusinessUnitSettingsRequest updateBusinessUnitSettingsRequest = (UpdateBusinessUnitSettingsRequest) o;

    return Objects.equals(this.startDayOfWeek, updateBusinessUnitSettingsRequest.startDayOfWeek) &&
            Objects.equals(this.timeZone, updateBusinessUnitSettingsRequest.timeZone) &&
            Objects.equals(this.shortTermForecasting, updateBusinessUnitSettingsRequest.shortTermForecasting) &&
            Objects.equals(this.scheduling, updateBusinessUnitSettingsRequest.scheduling) &&
            Objects.equals(this.notifications, updateBusinessUnitSettingsRequest.notifications) &&
            Objects.equals(this.metadata, updateBusinessUnitSettingsRequest.metadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(startDayOfWeek, timeZone, shortTermForecasting, scheduling, notifications, metadata);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateBusinessUnitSettingsRequest {\n");
    
    sb.append("    startDayOfWeek: ").append(toIndentedString(startDayOfWeek)).append("\n");
    sb.append("    timeZone: ").append(toIndentedString(timeZone)).append("\n");
    sb.append("    shortTermForecasting: ").append(toIndentedString(shortTermForecasting)).append("\n");
    sb.append("    scheduling: ").append(toIndentedString(scheduling)).append("\n");
    sb.append("    notifications: ").append(toIndentedString(notifications)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
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

