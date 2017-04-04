package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.mypurecloud.sdk.v2.model.IntradayDataUpdateNotificationForecastDataPerInterval;
import com.mypurecloud.sdk.v2.model.IntradayDataUpdateNotificationHistoricalAgentDataPerInterval;
import com.mypurecloud.sdk.v2.model.IntradayDataUpdateNotificationHistoricalQueueDataPerInterval;
import com.mypurecloud.sdk.v2.model.IntradayDataUpdateNotificationPerformancePredictionAgentDataPerInterval;
import com.mypurecloud.sdk.v2.model.IntradayDataUpdateNotificationPerformancePredictionQueueDataPerInterval;
import com.mypurecloud.sdk.v2.model.IntradayDataUpdateNotificationScheduleDataPerInterval;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * IntradayDataUpdateNotificationIntradayDataGroupings
 */

public class IntradayDataUpdateNotificationIntradayDataGroupings  implements Serializable {
  

  /**
   * Gets or Sets mediaType
   */
  public enum MediaTypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    VOICE("VOICE"),
    CHAT("CHAT"),
    EMAIL("EMAIL");

    private String value;

    MediaTypeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static MediaTypeEnum fromString(String key) {
      if (key == null) return null;

      for (MediaTypeEnum value : MediaTypeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return MediaTypeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private MediaTypeEnum mediaType = null;
  private List<IntradayDataUpdateNotificationForecastDataPerInterval> forecastDataPerInterval = new ArrayList<IntradayDataUpdateNotificationForecastDataPerInterval>();
  private List<IntradayDataUpdateNotificationScheduleDataPerInterval> scheduleDataPerInterval = new ArrayList<IntradayDataUpdateNotificationScheduleDataPerInterval>();
  private List<IntradayDataUpdateNotificationHistoricalAgentDataPerInterval> historicalAgentDataPerInterval = new ArrayList<IntradayDataUpdateNotificationHistoricalAgentDataPerInterval>();
  private List<IntradayDataUpdateNotificationHistoricalQueueDataPerInterval> historicalQueueDataPerInterval = new ArrayList<IntradayDataUpdateNotificationHistoricalQueueDataPerInterval>();
  private List<IntradayDataUpdateNotificationPerformancePredictionAgentDataPerInterval> performancePredictionAgentDataPerInterval = new ArrayList<IntradayDataUpdateNotificationPerformancePredictionAgentDataPerInterval>();
  private List<IntradayDataUpdateNotificationPerformancePredictionQueueDataPerInterval> performancePredictionQueueDataPerInterval = new ArrayList<IntradayDataUpdateNotificationPerformancePredictionQueueDataPerInterval>();

  
  /**
   **/
  public IntradayDataUpdateNotificationIntradayDataGroupings mediaType(MediaTypeEnum mediaType) {
    this.mediaType = mediaType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("mediaType")
  public MediaTypeEnum getMediaType() {
    return mediaType;
  }
  public void setMediaType(MediaTypeEnum mediaType) {
    this.mediaType = mediaType;
  }


  /**
   **/
  public IntradayDataUpdateNotificationIntradayDataGroupings forecastDataPerInterval(List<IntradayDataUpdateNotificationForecastDataPerInterval> forecastDataPerInterval) {
    this.forecastDataPerInterval = forecastDataPerInterval;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("forecastDataPerInterval")
  public List<IntradayDataUpdateNotificationForecastDataPerInterval> getForecastDataPerInterval() {
    return forecastDataPerInterval;
  }
  public void setForecastDataPerInterval(List<IntradayDataUpdateNotificationForecastDataPerInterval> forecastDataPerInterval) {
    this.forecastDataPerInterval = forecastDataPerInterval;
  }


  /**
   **/
  public IntradayDataUpdateNotificationIntradayDataGroupings scheduleDataPerInterval(List<IntradayDataUpdateNotificationScheduleDataPerInterval> scheduleDataPerInterval) {
    this.scheduleDataPerInterval = scheduleDataPerInterval;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("scheduleDataPerInterval")
  public List<IntradayDataUpdateNotificationScheduleDataPerInterval> getScheduleDataPerInterval() {
    return scheduleDataPerInterval;
  }
  public void setScheduleDataPerInterval(List<IntradayDataUpdateNotificationScheduleDataPerInterval> scheduleDataPerInterval) {
    this.scheduleDataPerInterval = scheduleDataPerInterval;
  }


  /**
   **/
  public IntradayDataUpdateNotificationIntradayDataGroupings historicalAgentDataPerInterval(List<IntradayDataUpdateNotificationHistoricalAgentDataPerInterval> historicalAgentDataPerInterval) {
    this.historicalAgentDataPerInterval = historicalAgentDataPerInterval;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("historicalAgentDataPerInterval")
  public List<IntradayDataUpdateNotificationHistoricalAgentDataPerInterval> getHistoricalAgentDataPerInterval() {
    return historicalAgentDataPerInterval;
  }
  public void setHistoricalAgentDataPerInterval(List<IntradayDataUpdateNotificationHistoricalAgentDataPerInterval> historicalAgentDataPerInterval) {
    this.historicalAgentDataPerInterval = historicalAgentDataPerInterval;
  }


  /**
   **/
  public IntradayDataUpdateNotificationIntradayDataGroupings historicalQueueDataPerInterval(List<IntradayDataUpdateNotificationHistoricalQueueDataPerInterval> historicalQueueDataPerInterval) {
    this.historicalQueueDataPerInterval = historicalQueueDataPerInterval;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("historicalQueueDataPerInterval")
  public List<IntradayDataUpdateNotificationHistoricalQueueDataPerInterval> getHistoricalQueueDataPerInterval() {
    return historicalQueueDataPerInterval;
  }
  public void setHistoricalQueueDataPerInterval(List<IntradayDataUpdateNotificationHistoricalQueueDataPerInterval> historicalQueueDataPerInterval) {
    this.historicalQueueDataPerInterval = historicalQueueDataPerInterval;
  }


  /**
   **/
  public IntradayDataUpdateNotificationIntradayDataGroupings performancePredictionAgentDataPerInterval(List<IntradayDataUpdateNotificationPerformancePredictionAgentDataPerInterval> performancePredictionAgentDataPerInterval) {
    this.performancePredictionAgentDataPerInterval = performancePredictionAgentDataPerInterval;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("performancePredictionAgentDataPerInterval")
  public List<IntradayDataUpdateNotificationPerformancePredictionAgentDataPerInterval> getPerformancePredictionAgentDataPerInterval() {
    return performancePredictionAgentDataPerInterval;
  }
  public void setPerformancePredictionAgentDataPerInterval(List<IntradayDataUpdateNotificationPerformancePredictionAgentDataPerInterval> performancePredictionAgentDataPerInterval) {
    this.performancePredictionAgentDataPerInterval = performancePredictionAgentDataPerInterval;
  }


  /**
   **/
  public IntradayDataUpdateNotificationIntradayDataGroupings performancePredictionQueueDataPerInterval(List<IntradayDataUpdateNotificationPerformancePredictionQueueDataPerInterval> performancePredictionQueueDataPerInterval) {
    this.performancePredictionQueueDataPerInterval = performancePredictionQueueDataPerInterval;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("performancePredictionQueueDataPerInterval")
  public List<IntradayDataUpdateNotificationPerformancePredictionQueueDataPerInterval> getPerformancePredictionQueueDataPerInterval() {
    return performancePredictionQueueDataPerInterval;
  }
  public void setPerformancePredictionQueueDataPerInterval(List<IntradayDataUpdateNotificationPerformancePredictionQueueDataPerInterval> performancePredictionQueueDataPerInterval) {
    this.performancePredictionQueueDataPerInterval = performancePredictionQueueDataPerInterval;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IntradayDataUpdateNotificationIntradayDataGroupings intradayDataUpdateNotificationIntradayDataGroupings = (IntradayDataUpdateNotificationIntradayDataGroupings) o;
    return Objects.equals(this.mediaType, intradayDataUpdateNotificationIntradayDataGroupings.mediaType) &&
        Objects.equals(this.forecastDataPerInterval, intradayDataUpdateNotificationIntradayDataGroupings.forecastDataPerInterval) &&
        Objects.equals(this.scheduleDataPerInterval, intradayDataUpdateNotificationIntradayDataGroupings.scheduleDataPerInterval) &&
        Objects.equals(this.historicalAgentDataPerInterval, intradayDataUpdateNotificationIntradayDataGroupings.historicalAgentDataPerInterval) &&
        Objects.equals(this.historicalQueueDataPerInterval, intradayDataUpdateNotificationIntradayDataGroupings.historicalQueueDataPerInterval) &&
        Objects.equals(this.performancePredictionAgentDataPerInterval, intradayDataUpdateNotificationIntradayDataGroupings.performancePredictionAgentDataPerInterval) &&
        Objects.equals(this.performancePredictionQueueDataPerInterval, intradayDataUpdateNotificationIntradayDataGroupings.performancePredictionQueueDataPerInterval);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mediaType, forecastDataPerInterval, scheduleDataPerInterval, historicalAgentDataPerInterval, historicalQueueDataPerInterval, performancePredictionAgentDataPerInterval, performancePredictionQueueDataPerInterval);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IntradayDataUpdateNotificationIntradayDataGroupings {\n");
    
    sb.append("    mediaType: ").append(toIndentedString(mediaType)).append("\n");
    sb.append("    forecastDataPerInterval: ").append(toIndentedString(forecastDataPerInterval)).append("\n");
    sb.append("    scheduleDataPerInterval: ").append(toIndentedString(scheduleDataPerInterval)).append("\n");
    sb.append("    historicalAgentDataPerInterval: ").append(toIndentedString(historicalAgentDataPerInterval)).append("\n");
    sb.append("    historicalQueueDataPerInterval: ").append(toIndentedString(historicalQueueDataPerInterval)).append("\n");
    sb.append("    performancePredictionAgentDataPerInterval: ").append(toIndentedString(performancePredictionAgentDataPerInterval)).append("\n");
    sb.append("    performancePredictionQueueDataPerInterval: ").append(toIndentedString(performancePredictionQueueDataPerInterval)).append("\n");
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

