package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import java.util.Objects;
import java.io.IOException;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.mypurecloud.sdk.v2.model.PlanningPeriodSettings;
import com.mypurecloud.sdk.v2.model.ShrinkageOverrides;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * Scheduling Settings
 */
@ApiModel(description = "Scheduling Settings")

public class SchedulingSettingsResponse  implements Serializable {
  
  private Integer maxOccupancyPercentForDeferredWork = null;
  private Double defaultShrinkagePercent = null;
  private ShrinkageOverrides shrinkageOverrides = null;
  private PlanningPeriodSettings planningPeriod = null;

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

  
  /**
   * Max occupancy percent for deferred work
   **/
  public SchedulingSettingsResponse maxOccupancyPercentForDeferredWork(Integer maxOccupancyPercentForDeferredWork) {
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
  public SchedulingSettingsResponse defaultShrinkagePercent(Double defaultShrinkagePercent) {
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
  public SchedulingSettingsResponse shrinkageOverrides(ShrinkageOverrides shrinkageOverrides) {
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
   * Planning period settings for scheduling
   **/
  public SchedulingSettingsResponse planningPeriod(PlanningPeriodSettings planningPeriod) {
    this.planningPeriod = planningPeriod;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Planning period settings for scheduling")
  @JsonProperty("planningPeriod")
  public PlanningPeriodSettings getPlanningPeriod() {
    return planningPeriod;
  }
  public void setPlanningPeriod(PlanningPeriodSettings planningPeriod) {
    this.planningPeriod = planningPeriod;
  }

  
  /**
   * Start day of weekend for scheduling
   **/
  public SchedulingSettingsResponse startDayOfWeekend(StartDayOfWeekendEnum startDayOfWeekend) {
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
    SchedulingSettingsResponse schedulingSettingsResponse = (SchedulingSettingsResponse) o;
    return Objects.equals(this.maxOccupancyPercentForDeferredWork, schedulingSettingsResponse.maxOccupancyPercentForDeferredWork) &&
        Objects.equals(this.defaultShrinkagePercent, schedulingSettingsResponse.defaultShrinkagePercent) &&
        Objects.equals(this.shrinkageOverrides, schedulingSettingsResponse.shrinkageOverrides) &&
        Objects.equals(this.planningPeriod, schedulingSettingsResponse.planningPeriod) &&
        Objects.equals(this.startDayOfWeekend, schedulingSettingsResponse.startDayOfWeekend);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maxOccupancyPercentForDeferredWork, defaultShrinkagePercent, shrinkageOverrides, planningPeriod, startDayOfWeekend);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SchedulingSettingsResponse {\n");
    
    sb.append("    maxOccupancyPercentForDeferredWork: ").append(toIndentedString(maxOccupancyPercentForDeferredWork)).append("\n");
    sb.append("    defaultShrinkagePercent: ").append(toIndentedString(defaultShrinkagePercent)).append("\n");
    sb.append("    shrinkageOverrides: ").append(toIndentedString(shrinkageOverrides)).append("\n");
    sb.append("    planningPeriod: ").append(toIndentedString(planningPeriod)).append("\n");
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

