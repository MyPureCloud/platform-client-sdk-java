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
import com.mypurecloud.sdk.v2.model.HistoricalShrinkageActivityCodeResponse;
import com.mypurecloud.sdk.v2.model.HistoricalShrinkageAggregateResponse;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * HistoricalShrinkageActivityCategoryResponse
 */

public class HistoricalShrinkageActivityCategoryResponse  implements Serializable {
  

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
   * Activity category for which shrinkage data is provided
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
  private HistoricalShrinkageAggregateResponse shrinkageForActivityCategory = null;
  private List<HistoricalShrinkageActivityCodeResponse> shrinkageForActivityCodes = null;

  public HistoricalShrinkageActivityCategoryResponse() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      shrinkageForActivityCodes = new ArrayList<HistoricalShrinkageActivityCodeResponse>();
    }
  }

  
  /**
   * Activity category for which shrinkage data is provided
   **/
  public HistoricalShrinkageActivityCategoryResponse activityCategory(ActivityCategoryEnum activityCategory) {
    this.activityCategory = activityCategory;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Activity category for which shrinkage data is provided")
  @JsonProperty("activityCategory")
  public ActivityCategoryEnum getActivityCategory() {
    return activityCategory;
  }
  public void setActivityCategory(ActivityCategoryEnum activityCategory) {
    this.activityCategory = activityCategory;
  }


  /**
   * Aggregated shrinkage data for the activity category
   **/
  public HistoricalShrinkageActivityCategoryResponse shrinkageForActivityCategory(HistoricalShrinkageAggregateResponse shrinkageForActivityCategory) {
    this.shrinkageForActivityCategory = shrinkageForActivityCategory;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Aggregated shrinkage data for the activity category")
  @JsonProperty("shrinkageForActivityCategory")
  public HistoricalShrinkageAggregateResponse getShrinkageForActivityCategory() {
    return shrinkageForActivityCategory;
  }
  public void setShrinkageForActivityCategory(HistoricalShrinkageAggregateResponse shrinkageForActivityCategory) {
    this.shrinkageForActivityCategory = shrinkageForActivityCategory;
  }


  /**
   * Shrinkage for the activity codes under this activity category
   **/
  public HistoricalShrinkageActivityCategoryResponse shrinkageForActivityCodes(List<HistoricalShrinkageActivityCodeResponse> shrinkageForActivityCodes) {
    this.shrinkageForActivityCodes = shrinkageForActivityCodes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Shrinkage for the activity codes under this activity category")
  @JsonProperty("shrinkageForActivityCodes")
  public List<HistoricalShrinkageActivityCodeResponse> getShrinkageForActivityCodes() {
    return shrinkageForActivityCodes;
  }
  public void setShrinkageForActivityCodes(List<HistoricalShrinkageActivityCodeResponse> shrinkageForActivityCodes) {
    this.shrinkageForActivityCodes = shrinkageForActivityCodes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HistoricalShrinkageActivityCategoryResponse historicalShrinkageActivityCategoryResponse = (HistoricalShrinkageActivityCategoryResponse) o;

    return Objects.equals(this.activityCategory, historicalShrinkageActivityCategoryResponse.activityCategory) &&
            Objects.equals(this.shrinkageForActivityCategory, historicalShrinkageActivityCategoryResponse.shrinkageForActivityCategory) &&
            Objects.equals(this.shrinkageForActivityCodes, historicalShrinkageActivityCategoryResponse.shrinkageForActivityCodes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(activityCategory, shrinkageForActivityCategory, shrinkageForActivityCodes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HistoricalShrinkageActivityCategoryResponse {\n");
    
    sb.append("    activityCategory: ").append(toIndentedString(activityCategory)).append("\n");
    sb.append("    shrinkageForActivityCategory: ").append(toIndentedString(shrinkageForActivityCategory)).append("\n");
    sb.append("    shrinkageForActivityCodes: ").append(toIndentedString(shrinkageForActivityCodes)).append("\n");
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

