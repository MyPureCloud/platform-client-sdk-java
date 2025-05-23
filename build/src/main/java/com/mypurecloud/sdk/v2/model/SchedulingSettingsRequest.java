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
import com.mypurecloud.sdk.v2.model.ShrinkageOverrides;
import com.mypurecloud.sdk.v2.model.ValueWrapperMonthlyPlanningPeriodSettings;
import com.mypurecloud.sdk.v2.model.ValueWrapperPlanningPeriodSettings;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * SchedulingSettingsRequest
 */

public class SchedulingSettingsRequest  implements Serializable {
  
  private Integer maxOccupancyPercentForDeferredWork = null;
  private Double defaultShrinkagePercent = null;
  private ShrinkageOverrides shrinkageOverrides = null;
  private ValueWrapperPlanningPeriodSettings planningPeriod = null;
  private ValueWrapperMonthlyPlanningPeriodSettings monthlyPlanningPeriod = null;

  private static class StartDayOfWeekendEnumDeserializer extends StdDeserializer<StartDayOfWeekendEnum> {
    public StartDayOfWeekendEnumDeserializer() {
      super(StartDayOfWeekendEnumDeserializer.class);
    }

    @Override
    public StartDayOfWeekendEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return StartDayOfWeekendEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Start day of weekend for scheduling
   */
 @JsonDeserialize(using = StartDayOfWeekendEnumDeserializer.class)
  public enum StartDayOfWeekendEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    SUNDAY("Sunday"),
    MONDAY("Monday"),
    TUESDAY("Tuesday"),
    WEDNESDAY("Wednesday"),
    THURSDAY("Thursday"),
    FRIDAY("Friday"),
    SATURDAY("Saturday");

    private String value;

    StartDayOfWeekendEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static StartDayOfWeekendEnum fromString(String key) {
      if (key == null) return null;

      for (StartDayOfWeekendEnum value : StartDayOfWeekendEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return StartDayOfWeekendEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private StartDayOfWeekendEnum startDayOfWeekend = null;

  public SchedulingSettingsRequest() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * Max occupancy percent for deferred work
   **/
  public SchedulingSettingsRequest maxOccupancyPercentForDeferredWork(Integer maxOccupancyPercentForDeferredWork) {
    this.maxOccupancyPercentForDeferredWork = maxOccupancyPercentForDeferredWork;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Max occupancy percent for deferred work")
  @JsonProperty("maxOccupancyPercentForDeferredWork")
  public Integer getMaxOccupancyPercentForDeferredWork() {
    return maxOccupancyPercentForDeferredWork;
  }
  public void setMaxOccupancyPercentForDeferredWork(Integer maxOccupancyPercentForDeferredWork) {
    this.maxOccupancyPercentForDeferredWork = maxOccupancyPercentForDeferredWork;
  }


  /**
   * Default shrinkage percent for scheduling
   **/
  public SchedulingSettingsRequest defaultShrinkagePercent(Double defaultShrinkagePercent) {
    this.defaultShrinkagePercent = defaultShrinkagePercent;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Default shrinkage percent for scheduling")
  @JsonProperty("defaultShrinkagePercent")
  public Double getDefaultShrinkagePercent() {
    return defaultShrinkagePercent;
  }
  public void setDefaultShrinkagePercent(Double defaultShrinkagePercent) {
    this.defaultShrinkagePercent = defaultShrinkagePercent;
  }


  /**
   * Shrinkage overrides for scheduling
   **/
  public SchedulingSettingsRequest shrinkageOverrides(ShrinkageOverrides shrinkageOverrides) {
    this.shrinkageOverrides = shrinkageOverrides;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Shrinkage overrides for scheduling")
  @JsonProperty("shrinkageOverrides")
  public ShrinkageOverrides getShrinkageOverrides() {
    return shrinkageOverrides;
  }
  public void setShrinkageOverrides(ShrinkageOverrides shrinkageOverrides) {
    this.shrinkageOverrides = shrinkageOverrides;
  }


  /**
   * Planning period settings for scheduling. Only one of planningPeriod or monthlyPlanningPeriod may be defined
   **/
  public SchedulingSettingsRequest planningPeriod(ValueWrapperPlanningPeriodSettings planningPeriod) {
    this.planningPeriod = planningPeriod;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Planning period settings for scheduling. Only one of planningPeriod or monthlyPlanningPeriod may be defined")
  @JsonProperty("planningPeriod")
  public ValueWrapperPlanningPeriodSettings getPlanningPeriod() {
    return planningPeriod;
  }
  public void setPlanningPeriod(ValueWrapperPlanningPeriodSettings planningPeriod) {
    this.planningPeriod = planningPeriod;
  }


  /**
   * Monthly planning period setting for scheduling. Only one of planningPeriod or monthlyPlanningPeriod may be defined
   **/
  public SchedulingSettingsRequest monthlyPlanningPeriod(ValueWrapperMonthlyPlanningPeriodSettings monthlyPlanningPeriod) {
    this.monthlyPlanningPeriod = monthlyPlanningPeriod;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Monthly planning period setting for scheduling. Only one of planningPeriod or monthlyPlanningPeriod may be defined")
  @JsonProperty("monthlyPlanningPeriod")
  public ValueWrapperMonthlyPlanningPeriodSettings getMonthlyPlanningPeriod() {
    return monthlyPlanningPeriod;
  }
  public void setMonthlyPlanningPeriod(ValueWrapperMonthlyPlanningPeriodSettings monthlyPlanningPeriod) {
    this.monthlyPlanningPeriod = monthlyPlanningPeriod;
  }


  /**
   * Start day of weekend for scheduling
   **/
  public SchedulingSettingsRequest startDayOfWeekend(StartDayOfWeekendEnum startDayOfWeekend) {
    this.startDayOfWeekend = startDayOfWeekend;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Start day of weekend for scheduling")
  @JsonProperty("startDayOfWeekend")
  public StartDayOfWeekendEnum getStartDayOfWeekend() {
    return startDayOfWeekend;
  }
  public void setStartDayOfWeekend(StartDayOfWeekendEnum startDayOfWeekend) {
    this.startDayOfWeekend = startDayOfWeekend;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SchedulingSettingsRequest schedulingSettingsRequest = (SchedulingSettingsRequest) o;

    return Objects.equals(this.maxOccupancyPercentForDeferredWork, schedulingSettingsRequest.maxOccupancyPercentForDeferredWork) &&
            Objects.equals(this.defaultShrinkagePercent, schedulingSettingsRequest.defaultShrinkagePercent) &&
            Objects.equals(this.shrinkageOverrides, schedulingSettingsRequest.shrinkageOverrides) &&
            Objects.equals(this.planningPeriod, schedulingSettingsRequest.planningPeriod) &&
            Objects.equals(this.monthlyPlanningPeriod, schedulingSettingsRequest.monthlyPlanningPeriod) &&
            Objects.equals(this.startDayOfWeekend, schedulingSettingsRequest.startDayOfWeekend);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maxOccupancyPercentForDeferredWork, defaultShrinkagePercent, shrinkageOverrides, planningPeriod, monthlyPlanningPeriod, startDayOfWeekend);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SchedulingSettingsRequest {\n");
    
    sb.append("    maxOccupancyPercentForDeferredWork: ").append(toIndentedString(maxOccupancyPercentForDeferredWork)).append("\n");
    sb.append("    defaultShrinkagePercent: ").append(toIndentedString(defaultShrinkagePercent)).append("\n");
    sb.append("    shrinkageOverrides: ").append(toIndentedString(shrinkageOverrides)).append("\n");
    sb.append("    planningPeriod: ").append(toIndentedString(planningPeriod)).append("\n");
    sb.append("    monthlyPlanningPeriod: ").append(toIndentedString(monthlyPlanningPeriod)).append("\n");
    sb.append("    startDayOfWeekend: ").append(toIndentedString(startDayOfWeekend)).append("\n");
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

