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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * HistoricalAdherenceDayMetrics
 */

public class HistoricalAdherenceDayMetrics  implements Serializable {
  
  private Integer dayStartOffsetSecs = null;
  private Integer adherenceScheduleSecs = null;
  private Integer conformanceScheduleSecs = null;
  private Integer conformanceActualSecs = null;
  private Integer exceptionCount = null;
  private Integer exceptionDurationSecs = null;
  private Integer impactSeconds = null;
  private Integer scheduleLengthSecs = null;
  private Integer actualLengthSecs = null;
  private Double adherencePercentage = null;
  private Double conformancePercentage = null;

  
  /**
   * Start of day offset in seconds relative to query start time
   **/
  public HistoricalAdherenceDayMetrics dayStartOffsetSecs(Integer dayStartOffsetSecs) {
    this.dayStartOffsetSecs = dayStartOffsetSecs;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Start of day offset in seconds relative to query start time")
  @JsonProperty("dayStartOffsetSecs")
  public Integer getDayStartOffsetSecs() {
    return dayStartOffsetSecs;
  }
  public void setDayStartOffsetSecs(Integer dayStartOffsetSecs) {
    this.dayStartOffsetSecs = dayStartOffsetSecs;
  }

  
  /**
   * Duration of schedule in seconds included for adherence percentage calculation
   **/
  public HistoricalAdherenceDayMetrics adherenceScheduleSecs(Integer adherenceScheduleSecs) {
    this.adherenceScheduleSecs = adherenceScheduleSecs;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Duration of schedule in seconds included for adherence percentage calculation")
  @JsonProperty("adherenceScheduleSecs")
  public Integer getAdherenceScheduleSecs() {
    return adherenceScheduleSecs;
  }
  public void setAdherenceScheduleSecs(Integer adherenceScheduleSecs) {
    this.adherenceScheduleSecs = adherenceScheduleSecs;
  }

  
  /**
   * Total scheduled duration in seconds for OnQueue activities
   **/
  public HistoricalAdherenceDayMetrics conformanceScheduleSecs(Integer conformanceScheduleSecs) {
    this.conformanceScheduleSecs = conformanceScheduleSecs;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Total scheduled duration in seconds for OnQueue activities")
  @JsonProperty("conformanceScheduleSecs")
  public Integer getConformanceScheduleSecs() {
    return conformanceScheduleSecs;
  }
  public void setConformanceScheduleSecs(Integer conformanceScheduleSecs) {
    this.conformanceScheduleSecs = conformanceScheduleSecs;
  }

  
  /**
   * Total actually worked duration in seconds for OnQueue activities
   **/
  public HistoricalAdherenceDayMetrics conformanceActualSecs(Integer conformanceActualSecs) {
    this.conformanceActualSecs = conformanceActualSecs;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Total actually worked duration in seconds for OnQueue activities")
  @JsonProperty("conformanceActualSecs")
  public Integer getConformanceActualSecs() {
    return conformanceActualSecs;
  }
  public void setConformanceActualSecs(Integer conformanceActualSecs) {
    this.conformanceActualSecs = conformanceActualSecs;
  }

  
  /**
   * Total number of adherence exceptions for this user
   **/
  public HistoricalAdherenceDayMetrics exceptionCount(Integer exceptionCount) {
    this.exceptionCount = exceptionCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Total number of adherence exceptions for this user")
  @JsonProperty("exceptionCount")
  public Integer getExceptionCount() {
    return exceptionCount;
  }
  public void setExceptionCount(Integer exceptionCount) {
    this.exceptionCount = exceptionCount;
  }

  
  /**
   * Total duration in seconds of adherence exceptions for this user
   **/
  public HistoricalAdherenceDayMetrics exceptionDurationSecs(Integer exceptionDurationSecs) {
    this.exceptionDurationSecs = exceptionDurationSecs;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Total duration in seconds of adherence exceptions for this user")
  @JsonProperty("exceptionDurationSecs")
  public Integer getExceptionDurationSecs() {
    return exceptionDurationSecs;
  }
  public void setExceptionDurationSecs(Integer exceptionDurationSecs) {
    this.exceptionDurationSecs = exceptionDurationSecs;
  }

  
  /**
   * The impact duration in seconds of current adherence state for this user
   **/
  public HistoricalAdherenceDayMetrics impactSeconds(Integer impactSeconds) {
    this.impactSeconds = impactSeconds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The impact duration in seconds of current adherence state for this user")
  @JsonProperty("impactSeconds")
  public Integer getImpactSeconds() {
    return impactSeconds;
  }
  public void setImpactSeconds(Integer impactSeconds) {
    this.impactSeconds = impactSeconds;
  }

  
  /**
   * Total duration in seconds for all scheduled activities
   **/
  public HistoricalAdherenceDayMetrics scheduleLengthSecs(Integer scheduleLengthSecs) {
    this.scheduleLengthSecs = scheduleLengthSecs;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Total duration in seconds for all scheduled activities")
  @JsonProperty("scheduleLengthSecs")
  public Integer getScheduleLengthSecs() {
    return scheduleLengthSecs;
  }
  public void setScheduleLengthSecs(Integer scheduleLengthSecs) {
    this.scheduleLengthSecs = scheduleLengthSecs;
  }

  
  /**
   * Total duration in seconds for all actually worked activities
   **/
  public HistoricalAdherenceDayMetrics actualLengthSecs(Integer actualLengthSecs) {
    this.actualLengthSecs = actualLengthSecs;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Total duration in seconds for all actually worked activities")
  @JsonProperty("actualLengthSecs")
  public Integer getActualLengthSecs() {
    return actualLengthSecs;
  }
  public void setActualLengthSecs(Integer actualLengthSecs) {
    this.actualLengthSecs = actualLengthSecs;
  }

  
  /**
   * Total adherence percentage for this user, in the scale of 0 - 100
   **/
  public HistoricalAdherenceDayMetrics adherencePercentage(Double adherencePercentage) {
    this.adherencePercentage = adherencePercentage;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Total adherence percentage for this user, in the scale of 0 - 100")
  @JsonProperty("adherencePercentage")
  public Double getAdherencePercentage() {
    return adherencePercentage;
  }
  public void setAdherencePercentage(Double adherencePercentage) {
    this.adherencePercentage = adherencePercentage;
  }

  
  /**
   * Total conformance percentage for this user, in the scale of 0 - 100. Conformance percentage can be greater than 100 when the actual on queue time is greater than the scheduled on queue time for the same period.
   **/
  public HistoricalAdherenceDayMetrics conformancePercentage(Double conformancePercentage) {
    this.conformancePercentage = conformancePercentage;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Total conformance percentage for this user, in the scale of 0 - 100. Conformance percentage can be greater than 100 when the actual on queue time is greater than the scheduled on queue time for the same period.")
  @JsonProperty("conformancePercentage")
  public Double getConformancePercentage() {
    return conformancePercentage;
  }
  public void setConformancePercentage(Double conformancePercentage) {
    this.conformancePercentage = conformancePercentage;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HistoricalAdherenceDayMetrics historicalAdherenceDayMetrics = (HistoricalAdherenceDayMetrics) o;
    return Objects.equals(this.dayStartOffsetSecs, historicalAdherenceDayMetrics.dayStartOffsetSecs) &&
        Objects.equals(this.adherenceScheduleSecs, historicalAdherenceDayMetrics.adherenceScheduleSecs) &&
        Objects.equals(this.conformanceScheduleSecs, historicalAdherenceDayMetrics.conformanceScheduleSecs) &&
        Objects.equals(this.conformanceActualSecs, historicalAdherenceDayMetrics.conformanceActualSecs) &&
        Objects.equals(this.exceptionCount, historicalAdherenceDayMetrics.exceptionCount) &&
        Objects.equals(this.exceptionDurationSecs, historicalAdherenceDayMetrics.exceptionDurationSecs) &&
        Objects.equals(this.impactSeconds, historicalAdherenceDayMetrics.impactSeconds) &&
        Objects.equals(this.scheduleLengthSecs, historicalAdherenceDayMetrics.scheduleLengthSecs) &&
        Objects.equals(this.actualLengthSecs, historicalAdherenceDayMetrics.actualLengthSecs) &&
        Objects.equals(this.adherencePercentage, historicalAdherenceDayMetrics.adherencePercentage) &&
        Objects.equals(this.conformancePercentage, historicalAdherenceDayMetrics.conformancePercentage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dayStartOffsetSecs, adherenceScheduleSecs, conformanceScheduleSecs, conformanceActualSecs, exceptionCount, exceptionDurationSecs, impactSeconds, scheduleLengthSecs, actualLengthSecs, adherencePercentage, conformancePercentage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HistoricalAdherenceDayMetrics {\n");
    
    sb.append("    dayStartOffsetSecs: ").append(toIndentedString(dayStartOffsetSecs)).append("\n");
    sb.append("    adherenceScheduleSecs: ").append(toIndentedString(adherenceScheduleSecs)).append("\n");
    sb.append("    conformanceScheduleSecs: ").append(toIndentedString(conformanceScheduleSecs)).append("\n");
    sb.append("    conformanceActualSecs: ").append(toIndentedString(conformanceActualSecs)).append("\n");
    sb.append("    exceptionCount: ").append(toIndentedString(exceptionCount)).append("\n");
    sb.append("    exceptionDurationSecs: ").append(toIndentedString(exceptionDurationSecs)).append("\n");
    sb.append("    impactSeconds: ").append(toIndentedString(impactSeconds)).append("\n");
    sb.append("    scheduleLengthSecs: ").append(toIndentedString(scheduleLengthSecs)).append("\n");
    sb.append("    actualLengthSecs: ").append(toIndentedString(actualLengthSecs)).append("\n");
    sb.append("    adherencePercentage: ").append(toIndentedString(adherencePercentage)).append("\n");
    sb.append("    conformancePercentage: ").append(toIndentedString(conformancePercentage)).append("\n");
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

