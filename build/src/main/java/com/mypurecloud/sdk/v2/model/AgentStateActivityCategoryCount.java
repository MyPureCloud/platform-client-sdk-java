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
 * AgentStateActivityCategoryCount
 */

public class AgentStateActivityCategoryCount  implements Serializable {
  

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
   * Activity category
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
  private Integer count = null;

  public AgentStateActivityCategoryCount() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  public AgentStateActivityCategoryCount(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
    }
  }

  
  /**
   * Activity category
   **/
  public AgentStateActivityCategoryCount activityCategory(ActivityCategoryEnum activityCategory) {
    this.activityCategory = activityCategory;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Activity category")
  @JsonProperty("activityCategory")
  public ActivityCategoryEnum getActivityCategory() {
    return activityCategory;
  }
  public void setActivityCategory(ActivityCategoryEnum activityCategory) {
    this.activityCategory = activityCategory;
  }


  /**
   * Count of users with this activity category
   **/
  public AgentStateActivityCategoryCount count(Integer count) {
    this.count = count;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Count of users with this activity category")
  @JsonProperty("count")
  public Integer getCount() {
    return count;
  }
  public void setCount(Integer count) {
    this.count = count;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AgentStateActivityCategoryCount agentStateActivityCategoryCount = (AgentStateActivityCategoryCount) o;

    return Objects.equals(this.activityCategory, agentStateActivityCategoryCount.activityCategory) &&
            Objects.equals(this.count, agentStateActivityCategoryCount.count);
  }

  @Override
  public int hashCode() {
    return Objects.hash(activityCategory, count);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AgentStateActivityCategoryCount {\n");
    
    sb.append("    activityCategory: ").append(toIndentedString(activityCategory)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
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

