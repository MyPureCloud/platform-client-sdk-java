package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.mypurecloud.sdk.v2.model.IntradayForecastData;
import com.mypurecloud.sdk.v2.model.IntradayHistoricalAgentData;
import com.mypurecloud.sdk.v2.model.IntradayHistoricalQueueData;
import com.mypurecloud.sdk.v2.model.IntradayPerformancePredictionAgentData;
import com.mypurecloud.sdk.v2.model.IntradayPerformancePredictionQueueData;
import com.mypurecloud.sdk.v2.model.IntradayScheduleData;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * IntradayDataGroup
 */

public class IntradayDataGroup  implements Serializable {
  

  /**
   * The media type associated with this intraday group
   */
  public enum MediaTypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    VOICE("Voice"),
    CHAT("Chat"),
    EMAIL("Email"),
    CALLBACK("Callback"),
    MESSAGE("Message");

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
  private List<IntradayForecastData> forecastDataPerInterval = new ArrayList<IntradayForecastData>();
  private List<IntradayScheduleData> scheduleDataPerInterval = new ArrayList<IntradayScheduleData>();
  private List<IntradayHistoricalAgentData> historicalAgentDataPerInterval = new ArrayList<IntradayHistoricalAgentData>();
  private List<IntradayHistoricalQueueData> historicalQueueDataPerInterval = new ArrayList<IntradayHistoricalQueueData>();
  private List<IntradayPerformancePredictionAgentData> performancePredictionAgentDataPerInterval = new ArrayList<IntradayPerformancePredictionAgentData>();
  private List<IntradayPerformancePredictionQueueData> performancePredictionQueueDataPerInterval = new ArrayList<IntradayPerformancePredictionQueueData>();

  
  /**
   * The media type associated with this intraday group
   **/
  public IntradayDataGroup mediaType(MediaTypeEnum mediaType) {
    this.mediaType = mediaType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The media type associated with this intraday group")
  @JsonProperty("mediaType")
  public MediaTypeEnum getMediaType() {
    return mediaType;
  }
  public void setMediaType(MediaTypeEnum mediaType) {
    this.mediaType = mediaType;
  }

  
  /**
   * Forecast data for this date range
   **/
  public IntradayDataGroup forecastDataPerInterval(List<IntradayForecastData> forecastDataPerInterval) {
    this.forecastDataPerInterval = forecastDataPerInterval;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Forecast data for this date range")
  @JsonProperty("forecastDataPerInterval")
  public List<IntradayForecastData> getForecastDataPerInterval() {
    return forecastDataPerInterval;
  }
  public void setForecastDataPerInterval(List<IntradayForecastData> forecastDataPerInterval) {
    this.forecastDataPerInterval = forecastDataPerInterval;
  }

  
  /**
   * Schedule data for this date range
   **/
  public IntradayDataGroup scheduleDataPerInterval(List<IntradayScheduleData> scheduleDataPerInterval) {
    this.scheduleDataPerInterval = scheduleDataPerInterval;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Schedule data for this date range")
  @JsonProperty("scheduleDataPerInterval")
  public List<IntradayScheduleData> getScheduleDataPerInterval() {
    return scheduleDataPerInterval;
  }
  public void setScheduleDataPerInterval(List<IntradayScheduleData> scheduleDataPerInterval) {
    this.scheduleDataPerInterval = scheduleDataPerInterval;
  }

  
  /**
   * Historical agent data for this date range
   **/
  public IntradayDataGroup historicalAgentDataPerInterval(List<IntradayHistoricalAgentData> historicalAgentDataPerInterval) {
    this.historicalAgentDataPerInterval = historicalAgentDataPerInterval;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Historical agent data for this date range")
  @JsonProperty("historicalAgentDataPerInterval")
  public List<IntradayHistoricalAgentData> getHistoricalAgentDataPerInterval() {
    return historicalAgentDataPerInterval;
  }
  public void setHistoricalAgentDataPerInterval(List<IntradayHistoricalAgentData> historicalAgentDataPerInterval) {
    this.historicalAgentDataPerInterval = historicalAgentDataPerInterval;
  }

  
  /**
   * Historical queue data for this date range
   **/
  public IntradayDataGroup historicalQueueDataPerInterval(List<IntradayHistoricalQueueData> historicalQueueDataPerInterval) {
    this.historicalQueueDataPerInterval = historicalQueueDataPerInterval;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Historical queue data for this date range")
  @JsonProperty("historicalQueueDataPerInterval")
  public List<IntradayHistoricalQueueData> getHistoricalQueueDataPerInterval() {
    return historicalQueueDataPerInterval;
  }
  public void setHistoricalQueueDataPerInterval(List<IntradayHistoricalQueueData> historicalQueueDataPerInterval) {
    this.historicalQueueDataPerInterval = historicalQueueDataPerInterval;
  }

  
  /**
   * Performance prediction data for this date range
   **/
  public IntradayDataGroup performancePredictionAgentDataPerInterval(List<IntradayPerformancePredictionAgentData> performancePredictionAgentDataPerInterval) {
    this.performancePredictionAgentDataPerInterval = performancePredictionAgentDataPerInterval;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Performance prediction data for this date range")
  @JsonProperty("performancePredictionAgentDataPerInterval")
  public List<IntradayPerformancePredictionAgentData> getPerformancePredictionAgentDataPerInterval() {
    return performancePredictionAgentDataPerInterval;
  }
  public void setPerformancePredictionAgentDataPerInterval(List<IntradayPerformancePredictionAgentData> performancePredictionAgentDataPerInterval) {
    this.performancePredictionAgentDataPerInterval = performancePredictionAgentDataPerInterval;
  }

  
  /**
   * Performance prediction data for this date range
   **/
  public IntradayDataGroup performancePredictionQueueDataPerInterval(List<IntradayPerformancePredictionQueueData> performancePredictionQueueDataPerInterval) {
    this.performancePredictionQueueDataPerInterval = performancePredictionQueueDataPerInterval;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Performance prediction data for this date range")
  @JsonProperty("performancePredictionQueueDataPerInterval")
  public List<IntradayPerformancePredictionQueueData> getPerformancePredictionQueueDataPerInterval() {
    return performancePredictionQueueDataPerInterval;
  }
  public void setPerformancePredictionQueueDataPerInterval(List<IntradayPerformancePredictionQueueData> performancePredictionQueueDataPerInterval) {
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
    IntradayDataGroup intradayDataGroup = (IntradayDataGroup) o;
    return Objects.equals(this.mediaType, intradayDataGroup.mediaType) &&
        Objects.equals(this.forecastDataPerInterval, intradayDataGroup.forecastDataPerInterval) &&
        Objects.equals(this.scheduleDataPerInterval, intradayDataGroup.scheduleDataPerInterval) &&
        Objects.equals(this.historicalAgentDataPerInterval, intradayDataGroup.historicalAgentDataPerInterval) &&
        Objects.equals(this.historicalQueueDataPerInterval, intradayDataGroup.historicalQueueDataPerInterval) &&
        Objects.equals(this.performancePredictionAgentDataPerInterval, intradayDataGroup.performancePredictionAgentDataPerInterval) &&
        Objects.equals(this.performancePredictionQueueDataPerInterval, intradayDataGroup.performancePredictionQueueDataPerInterval);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mediaType, forecastDataPerInterval, scheduleDataPerInterval, historicalAgentDataPerInterval, historicalQueueDataPerInterval, performancePredictionAgentDataPerInterval, performancePredictionQueueDataPerInterval);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IntradayDataGroup {\n");
    
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

