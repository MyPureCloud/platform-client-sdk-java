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
import com.mypurecloud.sdk.v2.model.BuIntradayForecastData;
import com.mypurecloud.sdk.v2.model.BuIntradayScheduleData;
import com.mypurecloud.sdk.v2.model.IntradayPerformancePredictionData;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * BuIntradayDataGroup
 */

public class BuIntradayDataGroup  implements Serializable {
  

  private static class MediaTypeEnumDeserializer extends StdDeserializer<MediaTypeEnum> {
    public MediaTypeEnumDeserializer() {
      super(MediaTypeEnumDeserializer.class);
    }

    @Override
    public MediaTypeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return MediaTypeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The media type associated with this intraday group
   */
 @JsonDeserialize(using = MediaTypeEnumDeserializer.class)
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
  private BuIntradayForecastData forecastDataSummary = null;
  private List<BuIntradayForecastData> forecastDataPerInterval = new ArrayList<BuIntradayForecastData>();
  private BuIntradayScheduleData scheduleDataSummary = null;
  private List<BuIntradayScheduleData> scheduleDataPerInterval = new ArrayList<BuIntradayScheduleData>();
  private IntradayPerformancePredictionData performancePredictionDataSummary = null;
  private List<IntradayPerformancePredictionData> performancePredictionDataPerInterval = new ArrayList<IntradayPerformancePredictionData>();

  
  /**
   * The media type associated with this intraday group
   **/
  public BuIntradayDataGroup mediaType(MediaTypeEnum mediaType) {
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
   * Forecast data summary for this date range
   **/
  public BuIntradayDataGroup forecastDataSummary(BuIntradayForecastData forecastDataSummary) {
    this.forecastDataSummary = forecastDataSummary;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Forecast data summary for this date range")
  @JsonProperty("forecastDataSummary")
  public BuIntradayForecastData getForecastDataSummary() {
    return forecastDataSummary;
  }
  public void setForecastDataSummary(BuIntradayForecastData forecastDataSummary) {
    this.forecastDataSummary = forecastDataSummary;
  }

  
  /**
   * Forecast data per interval for this date range
   **/
  public BuIntradayDataGroup forecastDataPerInterval(List<BuIntradayForecastData> forecastDataPerInterval) {
    this.forecastDataPerInterval = forecastDataPerInterval;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Forecast data per interval for this date range")
  @JsonProperty("forecastDataPerInterval")
  public List<BuIntradayForecastData> getForecastDataPerInterval() {
    return forecastDataPerInterval;
  }
  public void setForecastDataPerInterval(List<BuIntradayForecastData> forecastDataPerInterval) {
    this.forecastDataPerInterval = forecastDataPerInterval;
  }

  
  /**
   * Schedule data summary for this date range
   **/
  public BuIntradayDataGroup scheduleDataSummary(BuIntradayScheduleData scheduleDataSummary) {
    this.scheduleDataSummary = scheduleDataSummary;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Schedule data summary for this date range")
  @JsonProperty("scheduleDataSummary")
  public BuIntradayScheduleData getScheduleDataSummary() {
    return scheduleDataSummary;
  }
  public void setScheduleDataSummary(BuIntradayScheduleData scheduleDataSummary) {
    this.scheduleDataSummary = scheduleDataSummary;
  }

  
  /**
   * Schedule data per interval for this date range
   **/
  public BuIntradayDataGroup scheduleDataPerInterval(List<BuIntradayScheduleData> scheduleDataPerInterval) {
    this.scheduleDataPerInterval = scheduleDataPerInterval;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Schedule data per interval for this date range")
  @JsonProperty("scheduleDataPerInterval")
  public List<BuIntradayScheduleData> getScheduleDataPerInterval() {
    return scheduleDataPerInterval;
  }
  public void setScheduleDataPerInterval(List<BuIntradayScheduleData> scheduleDataPerInterval) {
    this.scheduleDataPerInterval = scheduleDataPerInterval;
  }

  
  /**
   * Performance prediction data summary for this date range
   **/
  public BuIntradayDataGroup performancePredictionDataSummary(IntradayPerformancePredictionData performancePredictionDataSummary) {
    this.performancePredictionDataSummary = performancePredictionDataSummary;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Performance prediction data summary for this date range")
  @JsonProperty("performancePredictionDataSummary")
  public IntradayPerformancePredictionData getPerformancePredictionDataSummary() {
    return performancePredictionDataSummary;
  }
  public void setPerformancePredictionDataSummary(IntradayPerformancePredictionData performancePredictionDataSummary) {
    this.performancePredictionDataSummary = performancePredictionDataSummary;
  }

  
  /**
   * Performance prediction data per interval for this date range
   **/
  public BuIntradayDataGroup performancePredictionDataPerInterval(List<IntradayPerformancePredictionData> performancePredictionDataPerInterval) {
    this.performancePredictionDataPerInterval = performancePredictionDataPerInterval;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Performance prediction data per interval for this date range")
  @JsonProperty("performancePredictionDataPerInterval")
  public List<IntradayPerformancePredictionData> getPerformancePredictionDataPerInterval() {
    return performancePredictionDataPerInterval;
  }
  public void setPerformancePredictionDataPerInterval(List<IntradayPerformancePredictionData> performancePredictionDataPerInterval) {
    this.performancePredictionDataPerInterval = performancePredictionDataPerInterval;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BuIntradayDataGroup buIntradayDataGroup = (BuIntradayDataGroup) o;
    return Objects.equals(this.mediaType, buIntradayDataGroup.mediaType) &&
        Objects.equals(this.forecastDataSummary, buIntradayDataGroup.forecastDataSummary) &&
        Objects.equals(this.forecastDataPerInterval, buIntradayDataGroup.forecastDataPerInterval) &&
        Objects.equals(this.scheduleDataSummary, buIntradayDataGroup.scheduleDataSummary) &&
        Objects.equals(this.scheduleDataPerInterval, buIntradayDataGroup.scheduleDataPerInterval) &&
        Objects.equals(this.performancePredictionDataSummary, buIntradayDataGroup.performancePredictionDataSummary) &&
        Objects.equals(this.performancePredictionDataPerInterval, buIntradayDataGroup.performancePredictionDataPerInterval);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mediaType, forecastDataSummary, forecastDataPerInterval, scheduleDataSummary, scheduleDataPerInterval, performancePredictionDataSummary, performancePredictionDataPerInterval);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BuIntradayDataGroup {\n");
    
    sb.append("    mediaType: ").append(toIndentedString(mediaType)).append("\n");
    sb.append("    forecastDataSummary: ").append(toIndentedString(forecastDataSummary)).append("\n");
    sb.append("    forecastDataPerInterval: ").append(toIndentedString(forecastDataPerInterval)).append("\n");
    sb.append("    scheduleDataSummary: ").append(toIndentedString(scheduleDataSummary)).append("\n");
    sb.append("    scheduleDataPerInterval: ").append(toIndentedString(scheduleDataPerInterval)).append("\n");
    sb.append("    performancePredictionDataSummary: ").append(toIndentedString(performancePredictionDataSummary)).append("\n");
    sb.append("    performancePredictionDataPerInterval: ").append(toIndentedString(performancePredictionDataPerInterval)).append("\n");
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

