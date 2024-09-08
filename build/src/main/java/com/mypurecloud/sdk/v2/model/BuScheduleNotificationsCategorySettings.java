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
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * BuScheduleNotificationsCategorySettings
 */

public class BuScheduleNotificationsCategorySettings  implements Serializable {
  

  private static class ActivityCategoryEnumDeserializer extends StdDeserializer<ActivityCategoryEnum> {
    public ActivityCategoryEnumDeserializer() {
      super(ActivityCategoryEnumDeserializer.class);
    }

    @Override
    public ActivityCategoryEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return ActivityCategoryEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The activity category
   */
 @JsonDeserialize(using = ActivityCategoryEnumDeserializer.class)
  public enum ActivityCategoryEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    ONQUEUEWORK("OnQueueWork"),
    BREAK("Break"),
    MEAL("Meal"),
    MEETING("Meeting"),
    OFFQUEUEWORK("OffQueueWork"),
    TIMEOFF("TimeOff"),
    TRAINING("Training"),
    UNAVAILABLE("Unavailable"),
    UNSCHEDULED("Unscheduled");

    private String value;

    ActivityCategoryEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static ActivityCategoryEnum fromString(String key) {
      if (key == null) return null;

      for (ActivityCategoryEnum value : ActivityCategoryEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return ActivityCategoryEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private ActivityCategoryEnum activityCategory = null;
  private Boolean earlyReminderEnabled = null;
  private Boolean onTimeReminderEnabled = null;

  
  /**
   * The activity category
   **/
  public BuScheduleNotificationsCategorySettings activityCategory(ActivityCategoryEnum activityCategory) {
    this.activityCategory = activityCategory;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The activity category")
  @JsonProperty("activityCategory")
  public ActivityCategoryEnum getActivityCategory() {
    return activityCategory;
  }
  public void setActivityCategory(ActivityCategoryEnum activityCategory) {
    this.activityCategory = activityCategory;
  }


  /**
   * Indicates if agents should receive early schedule reminder notifications.
   **/
  public BuScheduleNotificationsCategorySettings earlyReminderEnabled(Boolean earlyReminderEnabled) {
    this.earlyReminderEnabled = earlyReminderEnabled;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Indicates if agents should receive early schedule reminder notifications.")
  @JsonProperty("earlyReminderEnabled")
  public Boolean getEarlyReminderEnabled() {
    return earlyReminderEnabled;
  }
  public void setEarlyReminderEnabled(Boolean earlyReminderEnabled) {
    this.earlyReminderEnabled = earlyReminderEnabled;
  }


  /**
   * Indicates if agents should receive out of adherence notifications.
   **/
  public BuScheduleNotificationsCategorySettings onTimeReminderEnabled(Boolean onTimeReminderEnabled) {
    this.onTimeReminderEnabled = onTimeReminderEnabled;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Indicates if agents should receive out of adherence notifications.")
  @JsonProperty("onTimeReminderEnabled")
  public Boolean getOnTimeReminderEnabled() {
    return onTimeReminderEnabled;
  }
  public void setOnTimeReminderEnabled(Boolean onTimeReminderEnabled) {
    this.onTimeReminderEnabled = onTimeReminderEnabled;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BuScheduleNotificationsCategorySettings buScheduleNotificationsCategorySettings = (BuScheduleNotificationsCategorySettings) o;

    return Objects.equals(this.activityCategory, buScheduleNotificationsCategorySettings.activityCategory) &&
            Objects.equals(this.earlyReminderEnabled, buScheduleNotificationsCategorySettings.earlyReminderEnabled) &&
            Objects.equals(this.onTimeReminderEnabled, buScheduleNotificationsCategorySettings.onTimeReminderEnabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(activityCategory, earlyReminderEnabled, onTimeReminderEnabled);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BuScheduleNotificationsCategorySettings {\n");
    
    sb.append("    activityCategory: ").append(toIndentedString(activityCategory)).append("\n");
    sb.append("    earlyReminderEnabled: ").append(toIndentedString(earlyReminderEnabled)).append("\n");
    sb.append("    onTimeReminderEnabled: ").append(toIndentedString(onTimeReminderEnabled)).append("\n");
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

