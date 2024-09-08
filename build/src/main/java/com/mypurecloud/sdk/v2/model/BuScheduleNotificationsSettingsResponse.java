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
import com.mypurecloud.sdk.v2.model.BuScheduleNotificationsCategorySettings;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * BuScheduleNotificationsSettingsResponse
 */

public class BuScheduleNotificationsSettingsResponse  implements Serializable {
  
  private Integer earlyReminderMinutes = null;
  private List<BuScheduleNotificationsCategorySettings> activityCategorySettings = new ArrayList<BuScheduleNotificationsCategorySettings>();

  
  /**
   * The number of minutes prior to the scheduled event to display an early reminder notification
   **/
  public BuScheduleNotificationsSettingsResponse earlyReminderMinutes(Integer earlyReminderMinutes) {
    this.earlyReminderMinutes = earlyReminderMinutes;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The number of minutes prior to the scheduled event to display an early reminder notification")
  @JsonProperty("earlyReminderMinutes")
  public Integer getEarlyReminderMinutes() {
    return earlyReminderMinutes;
  }
  public void setEarlyReminderMinutes(Integer earlyReminderMinutes) {
    this.earlyReminderMinutes = earlyReminderMinutes;
  }


  /**
   * List of activity category notification settings
   **/
  public BuScheduleNotificationsSettingsResponse activityCategorySettings(List<BuScheduleNotificationsCategorySettings> activityCategorySettings) {
    this.activityCategorySettings = activityCategorySettings;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "List of activity category notification settings")
  @JsonProperty("activityCategorySettings")
  public List<BuScheduleNotificationsCategorySettings> getActivityCategorySettings() {
    return activityCategorySettings;
  }
  public void setActivityCategorySettings(List<BuScheduleNotificationsCategorySettings> activityCategorySettings) {
    this.activityCategorySettings = activityCategorySettings;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BuScheduleNotificationsSettingsResponse buScheduleNotificationsSettingsResponse = (BuScheduleNotificationsSettingsResponse) o;

    return Objects.equals(this.earlyReminderMinutes, buScheduleNotificationsSettingsResponse.earlyReminderMinutes) &&
            Objects.equals(this.activityCategorySettings, buScheduleNotificationsSettingsResponse.activityCategorySettings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(earlyReminderMinutes, activityCategorySettings);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BuScheduleNotificationsSettingsResponse {\n");
    
    sb.append("    earlyReminderMinutes: ").append(toIndentedString(earlyReminderMinutes)).append("\n");
    sb.append("    activityCategorySettings: ").append(toIndentedString(activityCategorySettings)).append("\n");
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

