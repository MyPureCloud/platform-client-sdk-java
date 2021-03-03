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
import com.mypurecloud.sdk.v2.model.WfmIntradayDataUpdateTopicIntradayForecastData;
import com.mypurecloud.sdk.v2.model.WfmIntradayDataUpdateTopicIntradayHistoricalAgentData;
import com.mypurecloud.sdk.v2.model.WfmIntradayDataUpdateTopicIntradayHistoricalQueueData;
import com.mypurecloud.sdk.v2.model.WfmIntradayDataUpdateTopicIntradayPerformancePredictionAgentData;
import com.mypurecloud.sdk.v2.model.WfmIntradayDataUpdateTopicIntradayPerformancePredictionQueueData;
import com.mypurecloud.sdk.v2.model.WfmIntradayDataUpdateTopicIntradayScheduleData;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * WfmIntradayDataUpdateTopicIntradayDataGroup
 */

public class WfmIntradayDataUpdateTopicIntradayDataGroup  implements Serializable {
  

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
  private List<WfmIntradayDataUpdateTopicIntradayForecastData> forecastDataPerInterval = new ArrayList<WfmIntradayDataUpdateTopicIntradayForecastData>();
  private List<WfmIntradayDataUpdateTopicIntradayScheduleData> scheduleDataPerInterval = new ArrayList<WfmIntradayDataUpdateTopicIntradayScheduleData>();
  private List<WfmIntradayDataUpdateTopicIntradayHistoricalAgentData> historicalAgentDataPerInterval = new ArrayList<WfmIntradayDataUpdateTopicIntradayHistoricalAgentData>();
  private List<WfmIntradayDataUpdateTopicIntradayHistoricalQueueData> historicalQueueDataPerInterval = new ArrayList<WfmIntradayDataUpdateTopicIntradayHistoricalQueueData>();
  private List<WfmIntradayDataUpdateTopicIntradayPerformancePredictionAgentData> performancePredictionAgentDataPerInterval = new ArrayList<WfmIntradayDataUpdateTopicIntradayPerformancePredictionAgentData>();
  private List<WfmIntradayDataUpdateTopicIntradayPerformancePredictionQueueData> performancePredictionQueueDataPerInterval = new ArrayList<WfmIntradayDataUpdateTopicIntradayPerformancePredictionQueueData>();

  
  /**
   **/
  public WfmIntradayDataUpdateTopicIntradayDataGroup mediaType(MediaTypeEnum mediaType) {
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
  public WfmIntradayDataUpdateTopicIntradayDataGroup forecastDataPerInterval(List<WfmIntradayDataUpdateTopicIntradayForecastData> forecastDataPerInterval) {
    this.forecastDataPerInterval = forecastDataPerInterval;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("forecastDataPerInterval")
  public List<WfmIntradayDataUpdateTopicIntradayForecastData> getForecastDataPerInterval() {
    return forecastDataPerInterval;
  }
  public void setForecastDataPerInterval(List<WfmIntradayDataUpdateTopicIntradayForecastData> forecastDataPerInterval) {
    this.forecastDataPerInterval = forecastDataPerInterval;
  }

  
  /**
   **/
  public WfmIntradayDataUpdateTopicIntradayDataGroup scheduleDataPerInterval(List<WfmIntradayDataUpdateTopicIntradayScheduleData> scheduleDataPerInterval) {
    this.scheduleDataPerInterval = scheduleDataPerInterval;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("scheduleDataPerInterval")
  public List<WfmIntradayDataUpdateTopicIntradayScheduleData> getScheduleDataPerInterval() {
    return scheduleDataPerInterval;
  }
  public void setScheduleDataPerInterval(List<WfmIntradayDataUpdateTopicIntradayScheduleData> scheduleDataPerInterval) {
    this.scheduleDataPerInterval = scheduleDataPerInterval;
  }

  
  /**
   **/
  public WfmIntradayDataUpdateTopicIntradayDataGroup historicalAgentDataPerInterval(List<WfmIntradayDataUpdateTopicIntradayHistoricalAgentData> historicalAgentDataPerInterval) {
    this.historicalAgentDataPerInterval = historicalAgentDataPerInterval;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("historicalAgentDataPerInterval")
  public List<WfmIntradayDataUpdateTopicIntradayHistoricalAgentData> getHistoricalAgentDataPerInterval() {
    return historicalAgentDataPerInterval;
  }
  public void setHistoricalAgentDataPerInterval(List<WfmIntradayDataUpdateTopicIntradayHistoricalAgentData> historicalAgentDataPerInterval) {
    this.historicalAgentDataPerInterval = historicalAgentDataPerInterval;
  }

  
  /**
   **/
  public WfmIntradayDataUpdateTopicIntradayDataGroup historicalQueueDataPerInterval(List<WfmIntradayDataUpdateTopicIntradayHistoricalQueueData> historicalQueueDataPerInterval) {
    this.historicalQueueDataPerInterval = historicalQueueDataPerInterval;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("historicalQueueDataPerInterval")
  public List<WfmIntradayDataUpdateTopicIntradayHistoricalQueueData> getHistoricalQueueDataPerInterval() {
    return historicalQueueDataPerInterval;
  }
  public void setHistoricalQueueDataPerInterval(List<WfmIntradayDataUpdateTopicIntradayHistoricalQueueData> historicalQueueDataPerInterval) {
    this.historicalQueueDataPerInterval = historicalQueueDataPerInterval;
  }

  
  /**
   **/
  public WfmIntradayDataUpdateTopicIntradayDataGroup performancePredictionAgentDataPerInterval(List<WfmIntradayDataUpdateTopicIntradayPerformancePredictionAgentData> performancePredictionAgentDataPerInterval) {
    this.performancePredictionAgentDataPerInterval = performancePredictionAgentDataPerInterval;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("performancePredictionAgentDataPerInterval")
  public List<WfmIntradayDataUpdateTopicIntradayPerformancePredictionAgentData> getPerformancePredictionAgentDataPerInterval() {
    return performancePredictionAgentDataPerInterval;
  }
  public void setPerformancePredictionAgentDataPerInterval(List<WfmIntradayDataUpdateTopicIntradayPerformancePredictionAgentData> performancePredictionAgentDataPerInterval) {
    this.performancePredictionAgentDataPerInterval = performancePredictionAgentDataPerInterval;
  }

  
  /**
   **/
  public WfmIntradayDataUpdateTopicIntradayDataGroup performancePredictionQueueDataPerInterval(List<WfmIntradayDataUpdateTopicIntradayPerformancePredictionQueueData> performancePredictionQueueDataPerInterval) {
    this.performancePredictionQueueDataPerInterval = performancePredictionQueueDataPerInterval;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("performancePredictionQueueDataPerInterval")
  public List<WfmIntradayDataUpdateTopicIntradayPerformancePredictionQueueData> getPerformancePredictionQueueDataPerInterval() {
    return performancePredictionQueueDataPerInterval;
  }
  public void setPerformancePredictionQueueDataPerInterval(List<WfmIntradayDataUpdateTopicIntradayPerformancePredictionQueueData> performancePredictionQueueDataPerInterval) {
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
    WfmIntradayDataUpdateTopicIntradayDataGroup wfmIntradayDataUpdateTopicIntradayDataGroup = (WfmIntradayDataUpdateTopicIntradayDataGroup) o;
    return Objects.equals(this.mediaType, wfmIntradayDataUpdateTopicIntradayDataGroup.mediaType) &&
        Objects.equals(this.forecastDataPerInterval, wfmIntradayDataUpdateTopicIntradayDataGroup.forecastDataPerInterval) &&
        Objects.equals(this.scheduleDataPerInterval, wfmIntradayDataUpdateTopicIntradayDataGroup.scheduleDataPerInterval) &&
        Objects.equals(this.historicalAgentDataPerInterval, wfmIntradayDataUpdateTopicIntradayDataGroup.historicalAgentDataPerInterval) &&
        Objects.equals(this.historicalQueueDataPerInterval, wfmIntradayDataUpdateTopicIntradayDataGroup.historicalQueueDataPerInterval) &&
        Objects.equals(this.performancePredictionAgentDataPerInterval, wfmIntradayDataUpdateTopicIntradayDataGroup.performancePredictionAgentDataPerInterval) &&
        Objects.equals(this.performancePredictionQueueDataPerInterval, wfmIntradayDataUpdateTopicIntradayDataGroup.performancePredictionQueueDataPerInterval);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mediaType, forecastDataPerInterval, scheduleDataPerInterval, historicalAgentDataPerInterval, historicalQueueDataPerInterval, performancePredictionAgentDataPerInterval, performancePredictionQueueDataPerInterval);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WfmIntradayDataUpdateTopicIntradayDataGroup {\n");
    
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

