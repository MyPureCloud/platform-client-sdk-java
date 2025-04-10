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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * WfmHistoricalAdherenceBulkUserDayMetrics
 */

public class WfmHistoricalAdherenceBulkUserDayMetrics  implements Serializable {
  
  private Integer dayStartOffsetSeconds = null;
  private Integer adherenceScheduleSeconds = null;
  private Integer conformanceScheduleSeconds = null;
  private Integer conformanceActualSeconds = null;
  private Integer exceptionCount = null;
  private Integer exceptionDurationSeconds = null;
  private Integer impactSeconds = null;
  private Integer scheduleLengthSeconds = null;
  private Integer actualLengthSeconds = null;
  private Double adherencePercentage = null;
  private Double conformancePercentage = null;

  public WfmHistoricalAdherenceBulkUserDayMetrics() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * Start of day offset in seconds relative to query start time
   **/
  public WfmHistoricalAdherenceBulkUserDayMetrics dayStartOffsetSeconds(Integer dayStartOffsetSeconds) {
    this.dayStartOffsetSeconds = dayStartOffsetSeconds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Start of day offset in seconds relative to query start time")
  @JsonProperty("dayStartOffsetSeconds")
  public Integer getDayStartOffsetSeconds() {
    return dayStartOffsetSeconds;
  }
  public void setDayStartOffsetSeconds(Integer dayStartOffsetSeconds) {
    this.dayStartOffsetSeconds = dayStartOffsetSeconds;
  }


  /**
   * Duration of schedule in seconds included for adherence percentage calculation
   **/
  public WfmHistoricalAdherenceBulkUserDayMetrics adherenceScheduleSeconds(Integer adherenceScheduleSeconds) {
    this.adherenceScheduleSeconds = adherenceScheduleSeconds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Duration of schedule in seconds included for adherence percentage calculation")
  @JsonProperty("adherenceScheduleSeconds")
  public Integer getAdherenceScheduleSeconds() {
    return adherenceScheduleSeconds;
  }
  public void setAdherenceScheduleSeconds(Integer adherenceScheduleSeconds) {
    this.adherenceScheduleSeconds = adherenceScheduleSeconds;
  }


  /**
   * Total scheduled duration in seconds for OnQueue activities
   **/
  public WfmHistoricalAdherenceBulkUserDayMetrics conformanceScheduleSeconds(Integer conformanceScheduleSeconds) {
    this.conformanceScheduleSeconds = conformanceScheduleSeconds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Total scheduled duration in seconds for OnQueue activities")
  @JsonProperty("conformanceScheduleSeconds")
  public Integer getConformanceScheduleSeconds() {
    return conformanceScheduleSeconds;
  }
  public void setConformanceScheduleSeconds(Integer conformanceScheduleSeconds) {
    this.conformanceScheduleSeconds = conformanceScheduleSeconds;
  }


  /**
   * Total actually worked duration in seconds for OnQueue activities
   **/
  public WfmHistoricalAdherenceBulkUserDayMetrics conformanceActualSeconds(Integer conformanceActualSeconds) {
    this.conformanceActualSeconds = conformanceActualSeconds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Total actually worked duration in seconds for OnQueue activities")
  @JsonProperty("conformanceActualSeconds")
  public Integer getConformanceActualSeconds() {
    return conformanceActualSeconds;
  }
  public void setConformanceActualSeconds(Integer conformanceActualSeconds) {
    this.conformanceActualSeconds = conformanceActualSeconds;
  }


  /**
   * Total number of adherence exceptions for this user
   **/
  public WfmHistoricalAdherenceBulkUserDayMetrics exceptionCount(Integer exceptionCount) {
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
  public WfmHistoricalAdherenceBulkUserDayMetrics exceptionDurationSeconds(Integer exceptionDurationSeconds) {
    this.exceptionDurationSeconds = exceptionDurationSeconds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Total duration in seconds of adherence exceptions for this user")
  @JsonProperty("exceptionDurationSeconds")
  public Integer getExceptionDurationSeconds() {
    return exceptionDurationSeconds;
  }
  public void setExceptionDurationSeconds(Integer exceptionDurationSeconds) {
    this.exceptionDurationSeconds = exceptionDurationSeconds;
  }


  /**
   * The impact duration in seconds of current adherence state for this user
   **/
  public WfmHistoricalAdherenceBulkUserDayMetrics impactSeconds(Integer impactSeconds) {
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
  public WfmHistoricalAdherenceBulkUserDayMetrics scheduleLengthSeconds(Integer scheduleLengthSeconds) {
    this.scheduleLengthSeconds = scheduleLengthSeconds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Total duration in seconds for all scheduled activities")
  @JsonProperty("scheduleLengthSeconds")
  public Integer getScheduleLengthSeconds() {
    return scheduleLengthSeconds;
  }
  public void setScheduleLengthSeconds(Integer scheduleLengthSeconds) {
    this.scheduleLengthSeconds = scheduleLengthSeconds;
  }


  /**
   * Total duration in seconds for all actually worked activities
   **/
  public WfmHistoricalAdherenceBulkUserDayMetrics actualLengthSeconds(Integer actualLengthSeconds) {
    this.actualLengthSeconds = actualLengthSeconds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Total duration in seconds for all actually worked activities")
  @JsonProperty("actualLengthSeconds")
  public Integer getActualLengthSeconds() {
    return actualLengthSeconds;
  }
  public void setActualLengthSeconds(Integer actualLengthSeconds) {
    this.actualLengthSeconds = actualLengthSeconds;
  }


  /**
   * Total adherence percentage for this user, in the scale of 0 - 100
   **/
  public WfmHistoricalAdherenceBulkUserDayMetrics adherencePercentage(Double adherencePercentage) {
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
  public WfmHistoricalAdherenceBulkUserDayMetrics conformancePercentage(Double conformancePercentage) {
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
    WfmHistoricalAdherenceBulkUserDayMetrics wfmHistoricalAdherenceBulkUserDayMetrics = (WfmHistoricalAdherenceBulkUserDayMetrics) o;

    return Objects.equals(this.dayStartOffsetSeconds, wfmHistoricalAdherenceBulkUserDayMetrics.dayStartOffsetSeconds) &&
            Objects.equals(this.adherenceScheduleSeconds, wfmHistoricalAdherenceBulkUserDayMetrics.adherenceScheduleSeconds) &&
            Objects.equals(this.conformanceScheduleSeconds, wfmHistoricalAdherenceBulkUserDayMetrics.conformanceScheduleSeconds) &&
            Objects.equals(this.conformanceActualSeconds, wfmHistoricalAdherenceBulkUserDayMetrics.conformanceActualSeconds) &&
            Objects.equals(this.exceptionCount, wfmHistoricalAdherenceBulkUserDayMetrics.exceptionCount) &&
            Objects.equals(this.exceptionDurationSeconds, wfmHistoricalAdherenceBulkUserDayMetrics.exceptionDurationSeconds) &&
            Objects.equals(this.impactSeconds, wfmHistoricalAdherenceBulkUserDayMetrics.impactSeconds) &&
            Objects.equals(this.scheduleLengthSeconds, wfmHistoricalAdherenceBulkUserDayMetrics.scheduleLengthSeconds) &&
            Objects.equals(this.actualLengthSeconds, wfmHistoricalAdherenceBulkUserDayMetrics.actualLengthSeconds) &&
            Objects.equals(this.adherencePercentage, wfmHistoricalAdherenceBulkUserDayMetrics.adherencePercentage) &&
            Objects.equals(this.conformancePercentage, wfmHistoricalAdherenceBulkUserDayMetrics.conformancePercentage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dayStartOffsetSeconds, adherenceScheduleSeconds, conformanceScheduleSeconds, conformanceActualSeconds, exceptionCount, exceptionDurationSeconds, impactSeconds, scheduleLengthSeconds, actualLengthSeconds, adherencePercentage, conformancePercentage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WfmHistoricalAdherenceBulkUserDayMetrics {\n");
    
    sb.append("    dayStartOffsetSeconds: ").append(toIndentedString(dayStartOffsetSeconds)).append("\n");
    sb.append("    adherenceScheduleSeconds: ").append(toIndentedString(adherenceScheduleSeconds)).append("\n");
    sb.append("    conformanceScheduleSeconds: ").append(toIndentedString(conformanceScheduleSeconds)).append("\n");
    sb.append("    conformanceActualSeconds: ").append(toIndentedString(conformanceActualSeconds)).append("\n");
    sb.append("    exceptionCount: ").append(toIndentedString(exceptionCount)).append("\n");
    sb.append("    exceptionDurationSeconds: ").append(toIndentedString(exceptionDurationSeconds)).append("\n");
    sb.append("    impactSeconds: ").append(toIndentedString(impactSeconds)).append("\n");
    sb.append("    scheduleLengthSeconds: ").append(toIndentedString(scheduleLengthSeconds)).append("\n");
    sb.append("    actualLengthSeconds: ").append(toIndentedString(actualLengthSeconds)).append("\n");
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

