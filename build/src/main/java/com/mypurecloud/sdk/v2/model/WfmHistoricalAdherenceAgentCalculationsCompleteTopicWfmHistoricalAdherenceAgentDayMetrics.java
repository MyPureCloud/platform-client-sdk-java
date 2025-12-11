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
import java.math.BigDecimal;

import java.io.Serializable;
/**
 * WfmHistoricalAdherenceAgentCalculationsCompleteTopicWfmHistoricalAdherenceAgentDayMetrics
 */

public class WfmHistoricalAdherenceAgentCalculationsCompleteTopicWfmHistoricalAdherenceAgentDayMetrics  implements Serializable {
  
  private Long dayStartOffsetSeconds = null;
  private Long adherenceScheduleSeconds = null;
  private Long conformanceScheduleSeconds = null;
  private Long conformanceActualSeconds = null;
  private Long exceptionCount = null;
  private Long exceptionDurationSeconds = null;
  private Long actualLengthSeconds = null;
  private Long scheduleLengthSeconds = null;
  private Long impactSeconds = null;
  private BigDecimal adherencePercentage = null;
  private BigDecimal conformancePercentage = null;

  public WfmHistoricalAdherenceAgentCalculationsCompleteTopicWfmHistoricalAdherenceAgentDayMetrics() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   **/
  public WfmHistoricalAdherenceAgentCalculationsCompleteTopicWfmHistoricalAdherenceAgentDayMetrics dayStartOffsetSeconds(Long dayStartOffsetSeconds) {
    this.dayStartOffsetSeconds = dayStartOffsetSeconds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("dayStartOffsetSeconds")
  public Long getDayStartOffsetSeconds() {
    return dayStartOffsetSeconds;
  }
  public void setDayStartOffsetSeconds(Long dayStartOffsetSeconds) {
    this.dayStartOffsetSeconds = dayStartOffsetSeconds;
  }


  /**
   **/
  public WfmHistoricalAdherenceAgentCalculationsCompleteTopicWfmHistoricalAdherenceAgentDayMetrics adherenceScheduleSeconds(Long adherenceScheduleSeconds) {
    this.adherenceScheduleSeconds = adherenceScheduleSeconds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("adherenceScheduleSeconds")
  public Long getAdherenceScheduleSeconds() {
    return adherenceScheduleSeconds;
  }
  public void setAdherenceScheduleSeconds(Long adherenceScheduleSeconds) {
    this.adherenceScheduleSeconds = adherenceScheduleSeconds;
  }


  /**
   **/
  public WfmHistoricalAdherenceAgentCalculationsCompleteTopicWfmHistoricalAdherenceAgentDayMetrics conformanceScheduleSeconds(Long conformanceScheduleSeconds) {
    this.conformanceScheduleSeconds = conformanceScheduleSeconds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("conformanceScheduleSeconds")
  public Long getConformanceScheduleSeconds() {
    return conformanceScheduleSeconds;
  }
  public void setConformanceScheduleSeconds(Long conformanceScheduleSeconds) {
    this.conformanceScheduleSeconds = conformanceScheduleSeconds;
  }


  /**
   **/
  public WfmHistoricalAdherenceAgentCalculationsCompleteTopicWfmHistoricalAdherenceAgentDayMetrics conformanceActualSeconds(Long conformanceActualSeconds) {
    this.conformanceActualSeconds = conformanceActualSeconds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("conformanceActualSeconds")
  public Long getConformanceActualSeconds() {
    return conformanceActualSeconds;
  }
  public void setConformanceActualSeconds(Long conformanceActualSeconds) {
    this.conformanceActualSeconds = conformanceActualSeconds;
  }


  /**
   **/
  public WfmHistoricalAdherenceAgentCalculationsCompleteTopicWfmHistoricalAdherenceAgentDayMetrics exceptionCount(Long exceptionCount) {
    this.exceptionCount = exceptionCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("exceptionCount")
  public Long getExceptionCount() {
    return exceptionCount;
  }
  public void setExceptionCount(Long exceptionCount) {
    this.exceptionCount = exceptionCount;
  }


  /**
   **/
  public WfmHistoricalAdherenceAgentCalculationsCompleteTopicWfmHistoricalAdherenceAgentDayMetrics exceptionDurationSeconds(Long exceptionDurationSeconds) {
    this.exceptionDurationSeconds = exceptionDurationSeconds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("exceptionDurationSeconds")
  public Long getExceptionDurationSeconds() {
    return exceptionDurationSeconds;
  }
  public void setExceptionDurationSeconds(Long exceptionDurationSeconds) {
    this.exceptionDurationSeconds = exceptionDurationSeconds;
  }


  /**
   **/
  public WfmHistoricalAdherenceAgentCalculationsCompleteTopicWfmHistoricalAdherenceAgentDayMetrics actualLengthSeconds(Long actualLengthSeconds) {
    this.actualLengthSeconds = actualLengthSeconds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("actualLengthSeconds")
  public Long getActualLengthSeconds() {
    return actualLengthSeconds;
  }
  public void setActualLengthSeconds(Long actualLengthSeconds) {
    this.actualLengthSeconds = actualLengthSeconds;
  }


  /**
   **/
  public WfmHistoricalAdherenceAgentCalculationsCompleteTopicWfmHistoricalAdherenceAgentDayMetrics scheduleLengthSeconds(Long scheduleLengthSeconds) {
    this.scheduleLengthSeconds = scheduleLengthSeconds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("scheduleLengthSeconds")
  public Long getScheduleLengthSeconds() {
    return scheduleLengthSeconds;
  }
  public void setScheduleLengthSeconds(Long scheduleLengthSeconds) {
    this.scheduleLengthSeconds = scheduleLengthSeconds;
  }


  /**
   **/
  public WfmHistoricalAdherenceAgentCalculationsCompleteTopicWfmHistoricalAdherenceAgentDayMetrics impactSeconds(Long impactSeconds) {
    this.impactSeconds = impactSeconds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("impactSeconds")
  public Long getImpactSeconds() {
    return impactSeconds;
  }
  public void setImpactSeconds(Long impactSeconds) {
    this.impactSeconds = impactSeconds;
  }


  /**
   **/
  public WfmHistoricalAdherenceAgentCalculationsCompleteTopicWfmHistoricalAdherenceAgentDayMetrics adherencePercentage(BigDecimal adherencePercentage) {
    this.adherencePercentage = adherencePercentage;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("adherencePercentage")
  public BigDecimal getAdherencePercentage() {
    return adherencePercentage;
  }
  public void setAdherencePercentage(BigDecimal adherencePercentage) {
    this.adherencePercentage = adherencePercentage;
  }


  /**
   **/
  public WfmHistoricalAdherenceAgentCalculationsCompleteTopicWfmHistoricalAdherenceAgentDayMetrics conformancePercentage(BigDecimal conformancePercentage) {
    this.conformancePercentage = conformancePercentage;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("conformancePercentage")
  public BigDecimal getConformancePercentage() {
    return conformancePercentage;
  }
  public void setConformancePercentage(BigDecimal conformancePercentage) {
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
    WfmHistoricalAdherenceAgentCalculationsCompleteTopicWfmHistoricalAdherenceAgentDayMetrics wfmHistoricalAdherenceAgentCalculationsCompleteTopicWfmHistoricalAdherenceAgentDayMetrics = (WfmHistoricalAdherenceAgentCalculationsCompleteTopicWfmHistoricalAdherenceAgentDayMetrics) o;

    return Objects.equals(this.dayStartOffsetSeconds, wfmHistoricalAdherenceAgentCalculationsCompleteTopicWfmHistoricalAdherenceAgentDayMetrics.dayStartOffsetSeconds) &&
            Objects.equals(this.adherenceScheduleSeconds, wfmHistoricalAdherenceAgentCalculationsCompleteTopicWfmHistoricalAdherenceAgentDayMetrics.adherenceScheduleSeconds) &&
            Objects.equals(this.conformanceScheduleSeconds, wfmHistoricalAdherenceAgentCalculationsCompleteTopicWfmHistoricalAdherenceAgentDayMetrics.conformanceScheduleSeconds) &&
            Objects.equals(this.conformanceActualSeconds, wfmHistoricalAdherenceAgentCalculationsCompleteTopicWfmHistoricalAdherenceAgentDayMetrics.conformanceActualSeconds) &&
            Objects.equals(this.exceptionCount, wfmHistoricalAdherenceAgentCalculationsCompleteTopicWfmHistoricalAdherenceAgentDayMetrics.exceptionCount) &&
            Objects.equals(this.exceptionDurationSeconds, wfmHistoricalAdherenceAgentCalculationsCompleteTopicWfmHistoricalAdherenceAgentDayMetrics.exceptionDurationSeconds) &&
            Objects.equals(this.actualLengthSeconds, wfmHistoricalAdherenceAgentCalculationsCompleteTopicWfmHistoricalAdherenceAgentDayMetrics.actualLengthSeconds) &&
            Objects.equals(this.scheduleLengthSeconds, wfmHistoricalAdherenceAgentCalculationsCompleteTopicWfmHistoricalAdherenceAgentDayMetrics.scheduleLengthSeconds) &&
            Objects.equals(this.impactSeconds, wfmHistoricalAdherenceAgentCalculationsCompleteTopicWfmHistoricalAdherenceAgentDayMetrics.impactSeconds) &&
            Objects.equals(this.adherencePercentage, wfmHistoricalAdherenceAgentCalculationsCompleteTopicWfmHistoricalAdherenceAgentDayMetrics.adherencePercentage) &&
            Objects.equals(this.conformancePercentage, wfmHistoricalAdherenceAgentCalculationsCompleteTopicWfmHistoricalAdherenceAgentDayMetrics.conformancePercentage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dayStartOffsetSeconds, adherenceScheduleSeconds, conformanceScheduleSeconds, conformanceActualSeconds, exceptionCount, exceptionDurationSeconds, actualLengthSeconds, scheduleLengthSeconds, impactSeconds, adherencePercentage, conformancePercentage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WfmHistoricalAdherenceAgentCalculationsCompleteTopicWfmHistoricalAdherenceAgentDayMetrics {\n");
    
    sb.append("    dayStartOffsetSeconds: ").append(toIndentedString(dayStartOffsetSeconds)).append("\n");
    sb.append("    adherenceScheduleSeconds: ").append(toIndentedString(adherenceScheduleSeconds)).append("\n");
    sb.append("    conformanceScheduleSeconds: ").append(toIndentedString(conformanceScheduleSeconds)).append("\n");
    sb.append("    conformanceActualSeconds: ").append(toIndentedString(conformanceActualSeconds)).append("\n");
    sb.append("    exceptionCount: ").append(toIndentedString(exceptionCount)).append("\n");
    sb.append("    exceptionDurationSeconds: ").append(toIndentedString(exceptionDurationSeconds)).append("\n");
    sb.append("    actualLengthSeconds: ").append(toIndentedString(actualLengthSeconds)).append("\n");
    sb.append("    scheduleLengthSeconds: ").append(toIndentedString(scheduleLengthSeconds)).append("\n");
    sb.append("    impactSeconds: ").append(toIndentedString(impactSeconds)).append("\n");
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

