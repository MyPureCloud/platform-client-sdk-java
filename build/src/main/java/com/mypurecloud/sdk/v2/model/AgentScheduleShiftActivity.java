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
 * AgentScheduleShiftActivity
 */

public class AgentScheduleShiftActivity  implements Serializable {
  

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
   * The activity category for which the agent is scheduled
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
  private Integer startOffsetMinutes = null;
  private Integer lengthMinutes = null;

  public AgentScheduleShiftActivity() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * The activity category for which the agent is scheduled
   **/
  public AgentScheduleShiftActivity activityCategory(ActivityCategoryEnum activityCategory) {
    this.activityCategory = activityCategory;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The activity category for which the agent is scheduled")
  @JsonProperty("activityCategory")
  public ActivityCategoryEnum getActivityCategory() {
    return activityCategory;
  }
  public void setActivityCategory(ActivityCategoryEnum activityCategory) {
    this.activityCategory = activityCategory;
  }


  /**
   * The start offset of the activity, relative to referenceStartDate at the top level
   **/
  public AgentScheduleShiftActivity startOffsetMinutes(Integer startOffsetMinutes) {
    this.startOffsetMinutes = startOffsetMinutes;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The start offset of the activity, relative to referenceStartDate at the top level")
  @JsonProperty("startOffsetMinutes")
  public Integer getStartOffsetMinutes() {
    return startOffsetMinutes;
  }
  public void setStartOffsetMinutes(Integer startOffsetMinutes) {
    this.startOffsetMinutes = startOffsetMinutes;
  }


  /**
   * The length of the activity in minutes
   **/
  public AgentScheduleShiftActivity lengthMinutes(Integer lengthMinutes) {
    this.lengthMinutes = lengthMinutes;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The length of the activity in minutes")
  @JsonProperty("lengthMinutes")
  public Integer getLengthMinutes() {
    return lengthMinutes;
  }
  public void setLengthMinutes(Integer lengthMinutes) {
    this.lengthMinutes = lengthMinutes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AgentScheduleShiftActivity agentScheduleShiftActivity = (AgentScheduleShiftActivity) o;

    return Objects.equals(this.activityCategory, agentScheduleShiftActivity.activityCategory) &&
            Objects.equals(this.startOffsetMinutes, agentScheduleShiftActivity.startOffsetMinutes) &&
            Objects.equals(this.lengthMinutes, agentScheduleShiftActivity.lengthMinutes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(activityCategory, startOffsetMinutes, lengthMinutes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AgentScheduleShiftActivity {\n");
    
    sb.append("    activityCategory: ").append(toIndentedString(activityCategory)).append("\n");
    sb.append("    startOffsetMinutes: ").append(toIndentedString(startOffsetMinutes)).append("\n");
    sb.append("    lengthMinutes: ").append(toIndentedString(lengthMinutes)).append("\n");
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

