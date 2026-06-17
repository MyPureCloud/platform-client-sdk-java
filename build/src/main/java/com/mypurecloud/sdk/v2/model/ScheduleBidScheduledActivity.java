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
import java.util.Date;

import java.io.Serializable;
/**
 * ScheduleBidScheduledActivity
 */

public class ScheduleBidScheduledActivity  implements Serializable {
  
  private Date startDate = null;
  private Integer lengthMinutes = null;
  private String description = null;

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
   * The activity code's category
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
    UNAVAILABLE("Unavailable");

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
  private String activityCodeId = null;
  private Boolean paid = null;

  public ScheduleBidScheduledActivity() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  public ScheduleBidScheduledActivity(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
    }
  }

  
  /**
   * The start date/time of this activity. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public ScheduleBidScheduledActivity startDate(Date startDate) {
    this.startDate = startDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The start date/time of this activity. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("startDate")
  public Date getStartDate() {
    return startDate;
  }
  public void setStartDate(Date startDate) {
    this.startDate = startDate;
  }


  /**
   * The length of this activity in minutes
   **/
  public ScheduleBidScheduledActivity lengthMinutes(Integer lengthMinutes) {
    this.lengthMinutes = lengthMinutes;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The length of this activity in minutes")
  @JsonProperty("lengthMinutes")
  public Integer getLengthMinutes() {
    return lengthMinutes;
  }
  public void setLengthMinutes(Integer lengthMinutes) {
    this.lengthMinutes = lengthMinutes;
  }


  /**
   * The description of this activity
   **/
  public ScheduleBidScheduledActivity description(String description) {
    this.description = description;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The description of this activity")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }


  /**
   * The activity code's category
   **/
  public ScheduleBidScheduledActivity activityCategory(ActivityCategoryEnum activityCategory) {
    this.activityCategory = activityCategory;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The activity code's category")
  @JsonProperty("activityCategory")
  public ActivityCategoryEnum getActivityCategory() {
    return activityCategory;
  }
  public void setActivityCategory(ActivityCategoryEnum activityCategory) {
    this.activityCategory = activityCategory;
  }


  /**
   * The ID of the activity code associated with this activity
   **/
  public ScheduleBidScheduledActivity activityCodeId(String activityCodeId) {
    this.activityCodeId = activityCodeId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The ID of the activity code associated with this activity")
  @JsonProperty("activityCodeId")
  public String getActivityCodeId() {
    return activityCodeId;
  }
  public void setActivityCodeId(String activityCodeId) {
    this.activityCodeId = activityCodeId;
  }


  /**
   * Whether this activity is paid
   **/
  public ScheduleBidScheduledActivity paid(Boolean paid) {
    this.paid = paid;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Whether this activity is paid")
  @JsonProperty("paid")
  public Boolean getPaid() {
    return paid;
  }
  public void setPaid(Boolean paid) {
    this.paid = paid;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ScheduleBidScheduledActivity scheduleBidScheduledActivity = (ScheduleBidScheduledActivity) o;

    return Objects.equals(this.startDate, scheduleBidScheduledActivity.startDate) &&
            Objects.equals(this.lengthMinutes, scheduleBidScheduledActivity.lengthMinutes) &&
            Objects.equals(this.description, scheduleBidScheduledActivity.description) &&
            Objects.equals(this.activityCategory, scheduleBidScheduledActivity.activityCategory) &&
            Objects.equals(this.activityCodeId, scheduleBidScheduledActivity.activityCodeId) &&
            Objects.equals(this.paid, scheduleBidScheduledActivity.paid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(startDate, lengthMinutes, description, activityCategory, activityCodeId, paid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScheduleBidScheduledActivity {\n");
    
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    lengthMinutes: ").append(toIndentedString(lengthMinutes)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    activityCategory: ").append(toIndentedString(activityCategory)).append("\n");
    sb.append("    activityCodeId: ").append(toIndentedString(activityCodeId)).append("\n");
    sb.append("    paid: ").append(toIndentedString(paid)).append("\n");
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

