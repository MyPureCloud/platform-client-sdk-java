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
import com.mypurecloud.sdk.v2.model.SchedulingNoForecastOptionsRequest;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * SchedulingOptionsRequest
 */

public class SchedulingOptionsRequest  implements Serializable {
  
  private SchedulingNoForecastOptionsRequest noForecastOptions = null;

  private static class ActivitySmoothingTypeEnumDeserializer extends StdDeserializer<ActivitySmoothingTypeEnum> {
    public ActivitySmoothingTypeEnumDeserializer() {
      super(ActivitySmoothingTypeEnumDeserializer.class);
    }

    @Override
    public ActivitySmoothingTypeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return ActivitySmoothingTypeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Overrides the default BU level activity smoothing type for this schedule generation
   */
 @JsonDeserialize(using = ActivitySmoothingTypeEnumDeserializer.class)
  public enum ActivitySmoothingTypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    REDUCECONCURRENTACTIVITIESACROSSBU("ReduceConcurrentActivitiesAcrossBu"),
    REDUCECONCURRENTACTIVITIESACROSSMU("ReduceConcurrentActivitiesAcrossMu"),
    CONSISTENTSERVICELEVEL("ConsistentServiceLevel");

    private String value;

    ActivitySmoothingTypeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static ActivitySmoothingTypeEnum fromString(String key) {
      if (key == null) return null;

      for (ActivitySmoothingTypeEnum value : ActivitySmoothingTypeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return ActivitySmoothingTypeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private ActivitySmoothingTypeEnum activitySmoothingType = null;
  private Boolean induceScheduleVariability = null;

  
  /**
   * Schedule generation options to apply if no forecast is supplied
   **/
  public SchedulingOptionsRequest noForecastOptions(SchedulingNoForecastOptionsRequest noForecastOptions) {
    this.noForecastOptions = noForecastOptions;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Schedule generation options to apply if no forecast is supplied")
  @JsonProperty("noForecastOptions")
  public SchedulingNoForecastOptionsRequest getNoForecastOptions() {
    return noForecastOptions;
  }
  public void setNoForecastOptions(SchedulingNoForecastOptionsRequest noForecastOptions) {
    this.noForecastOptions = noForecastOptions;
  }


  /**
   * Overrides the default BU level activity smoothing type for this schedule generation
   **/
  public SchedulingOptionsRequest activitySmoothingType(ActivitySmoothingTypeEnum activitySmoothingType) {
    this.activitySmoothingType = activitySmoothingType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Overrides the default BU level activity smoothing type for this schedule generation")
  @JsonProperty("activitySmoothingType")
  public ActivitySmoothingTypeEnum getActivitySmoothingType() {
    return activitySmoothingType;
  }
  public void setActivitySmoothingType(ActivitySmoothingTypeEnum activitySmoothingType) {
    this.activitySmoothingType = activitySmoothingType;
  }


  /**
   * Overrides the default BU level induce schedule variability setting for this schedule generation
   **/
  public SchedulingOptionsRequest induceScheduleVariability(Boolean induceScheduleVariability) {
    this.induceScheduleVariability = induceScheduleVariability;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Overrides the default BU level induce schedule variability setting for this schedule generation")
  @JsonProperty("induceScheduleVariability")
  public Boolean getInduceScheduleVariability() {
    return induceScheduleVariability;
  }
  public void setInduceScheduleVariability(Boolean induceScheduleVariability) {
    this.induceScheduleVariability = induceScheduleVariability;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SchedulingOptionsRequest schedulingOptionsRequest = (SchedulingOptionsRequest) o;

    return Objects.equals(this.noForecastOptions, schedulingOptionsRequest.noForecastOptions) &&
            Objects.equals(this.activitySmoothingType, schedulingOptionsRequest.activitySmoothingType) &&
            Objects.equals(this.induceScheduleVariability, schedulingOptionsRequest.induceScheduleVariability);
  }

  @Override
  public int hashCode() {
    return Objects.hash(noForecastOptions, activitySmoothingType, induceScheduleVariability);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SchedulingOptionsRequest {\n");
    
    sb.append("    noForecastOptions: ").append(toIndentedString(noForecastOptions)).append("\n");
    sb.append("    activitySmoothingType: ").append(toIndentedString(activitySmoothingType)).append("\n");
    sb.append("    induceScheduleVariability: ").append(toIndentedString(induceScheduleVariability)).append("\n");
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

