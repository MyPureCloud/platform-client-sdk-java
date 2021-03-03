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
import com.mypurecloud.sdk.v2.model.WfmBuIntradayDataUpdateTopicBuIntradayForecastData;
import com.mypurecloud.sdk.v2.model.WfmBuIntradayDataUpdateTopicBuIntradayScheduleData;
import com.mypurecloud.sdk.v2.model.WfmBuIntradayDataUpdateTopicIntradayPerformancePredictionData;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * WfmBuIntradayDataUpdateTopicBuIntradayDataGroup
 */

public class WfmBuIntradayDataUpdateTopicBuIntradayDataGroup  implements Serializable {
  

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
   * Gets or Sets mediaType
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
  private WfmBuIntradayDataUpdateTopicBuIntradayForecastData forecastDataSummary = null;
  private List<WfmBuIntradayDataUpdateTopicBuIntradayForecastData> forecastDataPerInterval = new ArrayList<WfmBuIntradayDataUpdateTopicBuIntradayForecastData>();
  private WfmBuIntradayDataUpdateTopicBuIntradayScheduleData scheduleDataSummary = null;
  private List<WfmBuIntradayDataUpdateTopicBuIntradayScheduleData> scheduleDataPerInterval = new ArrayList<WfmBuIntradayDataUpdateTopicBuIntradayScheduleData>();
  private WfmBuIntradayDataUpdateTopicIntradayPerformancePredictionData performancePredictionDataSummary = null;
  private List<WfmBuIntradayDataUpdateTopicIntradayPerformancePredictionData> performancePredictionDataPerInterval = new ArrayList<WfmBuIntradayDataUpdateTopicIntradayPerformancePredictionData>();

  
  /**
   **/
  public WfmBuIntradayDataUpdateTopicBuIntradayDataGroup mediaType(MediaTypeEnum mediaType) {
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
  public WfmBuIntradayDataUpdateTopicBuIntradayDataGroup forecastDataSummary(WfmBuIntradayDataUpdateTopicBuIntradayForecastData forecastDataSummary) {
    this.forecastDataSummary = forecastDataSummary;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("forecastDataSummary")
  public WfmBuIntradayDataUpdateTopicBuIntradayForecastData getForecastDataSummary() {
    return forecastDataSummary;
  }
  public void setForecastDataSummary(WfmBuIntradayDataUpdateTopicBuIntradayForecastData forecastDataSummary) {
    this.forecastDataSummary = forecastDataSummary;
  }

  
  /**
   **/
  public WfmBuIntradayDataUpdateTopicBuIntradayDataGroup forecastDataPerInterval(List<WfmBuIntradayDataUpdateTopicBuIntradayForecastData> forecastDataPerInterval) {
    this.forecastDataPerInterval = forecastDataPerInterval;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("forecastDataPerInterval")
  public List<WfmBuIntradayDataUpdateTopicBuIntradayForecastData> getForecastDataPerInterval() {
    return forecastDataPerInterval;
  }
  public void setForecastDataPerInterval(List<WfmBuIntradayDataUpdateTopicBuIntradayForecastData> forecastDataPerInterval) {
    this.forecastDataPerInterval = forecastDataPerInterval;
  }

  
  /**
   **/
  public WfmBuIntradayDataUpdateTopicBuIntradayDataGroup scheduleDataSummary(WfmBuIntradayDataUpdateTopicBuIntradayScheduleData scheduleDataSummary) {
    this.scheduleDataSummary = scheduleDataSummary;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("scheduleDataSummary")
  public WfmBuIntradayDataUpdateTopicBuIntradayScheduleData getScheduleDataSummary() {
    return scheduleDataSummary;
  }
  public void setScheduleDataSummary(WfmBuIntradayDataUpdateTopicBuIntradayScheduleData scheduleDataSummary) {
    this.scheduleDataSummary = scheduleDataSummary;
  }

  
  /**
   **/
  public WfmBuIntradayDataUpdateTopicBuIntradayDataGroup scheduleDataPerInterval(List<WfmBuIntradayDataUpdateTopicBuIntradayScheduleData> scheduleDataPerInterval) {
    this.scheduleDataPerInterval = scheduleDataPerInterval;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("scheduleDataPerInterval")
  public List<WfmBuIntradayDataUpdateTopicBuIntradayScheduleData> getScheduleDataPerInterval() {
    return scheduleDataPerInterval;
  }
  public void setScheduleDataPerInterval(List<WfmBuIntradayDataUpdateTopicBuIntradayScheduleData> scheduleDataPerInterval) {
    this.scheduleDataPerInterval = scheduleDataPerInterval;
  }

  
  /**
   **/
  public WfmBuIntradayDataUpdateTopicBuIntradayDataGroup performancePredictionDataSummary(WfmBuIntradayDataUpdateTopicIntradayPerformancePredictionData performancePredictionDataSummary) {
    this.performancePredictionDataSummary = performancePredictionDataSummary;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("performancePredictionDataSummary")
  public WfmBuIntradayDataUpdateTopicIntradayPerformancePredictionData getPerformancePredictionDataSummary() {
    return performancePredictionDataSummary;
  }
  public void setPerformancePredictionDataSummary(WfmBuIntradayDataUpdateTopicIntradayPerformancePredictionData performancePredictionDataSummary) {
    this.performancePredictionDataSummary = performancePredictionDataSummary;
  }

  
  /**
   **/
  public WfmBuIntradayDataUpdateTopicBuIntradayDataGroup performancePredictionDataPerInterval(List<WfmBuIntradayDataUpdateTopicIntradayPerformancePredictionData> performancePredictionDataPerInterval) {
    this.performancePredictionDataPerInterval = performancePredictionDataPerInterval;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("performancePredictionDataPerInterval")
  public List<WfmBuIntradayDataUpdateTopicIntradayPerformancePredictionData> getPerformancePredictionDataPerInterval() {
    return performancePredictionDataPerInterval;
  }
  public void setPerformancePredictionDataPerInterval(List<WfmBuIntradayDataUpdateTopicIntradayPerformancePredictionData> performancePredictionDataPerInterval) {
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
    WfmBuIntradayDataUpdateTopicBuIntradayDataGroup wfmBuIntradayDataUpdateTopicBuIntradayDataGroup = (WfmBuIntradayDataUpdateTopicBuIntradayDataGroup) o;
    return Objects.equals(this.mediaType, wfmBuIntradayDataUpdateTopicBuIntradayDataGroup.mediaType) &&
        Objects.equals(this.forecastDataSummary, wfmBuIntradayDataUpdateTopicBuIntradayDataGroup.forecastDataSummary) &&
        Objects.equals(this.forecastDataPerInterval, wfmBuIntradayDataUpdateTopicBuIntradayDataGroup.forecastDataPerInterval) &&
        Objects.equals(this.scheduleDataSummary, wfmBuIntradayDataUpdateTopicBuIntradayDataGroup.scheduleDataSummary) &&
        Objects.equals(this.scheduleDataPerInterval, wfmBuIntradayDataUpdateTopicBuIntradayDataGroup.scheduleDataPerInterval) &&
        Objects.equals(this.performancePredictionDataSummary, wfmBuIntradayDataUpdateTopicBuIntradayDataGroup.performancePredictionDataSummary) &&
        Objects.equals(this.performancePredictionDataPerInterval, wfmBuIntradayDataUpdateTopicBuIntradayDataGroup.performancePredictionDataPerInterval);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mediaType, forecastDataSummary, forecastDataPerInterval, scheduleDataSummary, scheduleDataPerInterval, performancePredictionDataSummary, performancePredictionDataPerInterval);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WfmBuIntradayDataUpdateTopicBuIntradayDataGroup {\n");
    
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

