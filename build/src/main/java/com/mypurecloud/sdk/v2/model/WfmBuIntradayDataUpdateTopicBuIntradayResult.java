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
import com.mypurecloud.sdk.v2.model.WfmBuIntradayDataUpdateTopicBuIntradayDataGroup;
import com.mypurecloud.sdk.v2.model.WfmBuIntradayDataUpdateTopicBuScheduleReference;
import com.mypurecloud.sdk.v2.model.WfmBuIntradayDataUpdateTopicBuShortTermForecastReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import java.io.Serializable;
/**
 * WfmBuIntradayDataUpdateTopicBuIntradayResult
 */

public class WfmBuIntradayDataUpdateTopicBuIntradayResult  implements Serializable {
  
  private Date startDate = null;
  private Date endDate = null;
  private Integer intervalLengthMinutes = null;
  private List<WfmBuIntradayDataUpdateTopicBuIntradayDataGroup> intradayDataGroupings = new ArrayList<WfmBuIntradayDataUpdateTopicBuIntradayDataGroup>();

  private static class CategoriesEnumDeserializer extends StdDeserializer<CategoriesEnum> {
    public CategoriesEnumDeserializer() {
      super(CategoriesEnumDeserializer.class);
    }

    @Override
    public CategoriesEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return CategoriesEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Gets or Sets categories
   */
 @JsonDeserialize(using = CategoriesEnumDeserializer.class)
  public enum CategoriesEnum {
    FORECASTDATA("ForecastData"),
    SCHEDULEDATA("ScheduleData"),
    PERFORMANCEPREDICTIONDATA("PerformancePredictionData");

    private String value;

    CategoriesEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static CategoriesEnum fromString(String key) {
      if (key == null) return null;

      for (CategoriesEnum value : CategoriesEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return CategoriesEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private List<CategoriesEnum> categories = new ArrayList<CategoriesEnum>();
  private String noDataReason = null;
  private WfmBuIntradayDataUpdateTopicBuScheduleReference schedule = null;
  private WfmBuIntradayDataUpdateTopicBuShortTermForecastReference shortTermForecast = null;

  
  /**
   **/
  public WfmBuIntradayDataUpdateTopicBuIntradayResult startDate(Date startDate) {
    this.startDate = startDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("startDate")
  public Date getStartDate() {
    return startDate;
  }
  public void setStartDate(Date startDate) {
    this.startDate = startDate;
  }

  
  /**
   **/
  public WfmBuIntradayDataUpdateTopicBuIntradayResult endDate(Date endDate) {
    this.endDate = endDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("endDate")
  public Date getEndDate() {
    return endDate;
  }
  public void setEndDate(Date endDate) {
    this.endDate = endDate;
  }

  
  /**
   **/
  public WfmBuIntradayDataUpdateTopicBuIntradayResult intervalLengthMinutes(Integer intervalLengthMinutes) {
    this.intervalLengthMinutes = intervalLengthMinutes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("intervalLengthMinutes")
  public Integer getIntervalLengthMinutes() {
    return intervalLengthMinutes;
  }
  public void setIntervalLengthMinutes(Integer intervalLengthMinutes) {
    this.intervalLengthMinutes = intervalLengthMinutes;
  }

  
  /**
   **/
  public WfmBuIntradayDataUpdateTopicBuIntradayResult intradayDataGroupings(List<WfmBuIntradayDataUpdateTopicBuIntradayDataGroup> intradayDataGroupings) {
    this.intradayDataGroupings = intradayDataGroupings;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("intradayDataGroupings")
  public List<WfmBuIntradayDataUpdateTopicBuIntradayDataGroup> getIntradayDataGroupings() {
    return intradayDataGroupings;
  }
  public void setIntradayDataGroupings(List<WfmBuIntradayDataUpdateTopicBuIntradayDataGroup> intradayDataGroupings) {
    this.intradayDataGroupings = intradayDataGroupings;
  }

  
  /**
   **/
  public WfmBuIntradayDataUpdateTopicBuIntradayResult categories(List<CategoriesEnum> categories) {
    this.categories = categories;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("categories")
  public List<CategoriesEnum> getCategories() {
    return categories;
  }
  public void setCategories(List<CategoriesEnum> categories) {
    this.categories = categories;
  }

  
  /**
   **/
  public WfmBuIntradayDataUpdateTopicBuIntradayResult noDataReason(String noDataReason) {
    this.noDataReason = noDataReason;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("noDataReason")
  public String getNoDataReason() {
    return noDataReason;
  }
  public void setNoDataReason(String noDataReason) {
    this.noDataReason = noDataReason;
  }

  
  /**
   **/
  public WfmBuIntradayDataUpdateTopicBuIntradayResult schedule(WfmBuIntradayDataUpdateTopicBuScheduleReference schedule) {
    this.schedule = schedule;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("schedule")
  public WfmBuIntradayDataUpdateTopicBuScheduleReference getSchedule() {
    return schedule;
  }
  public void setSchedule(WfmBuIntradayDataUpdateTopicBuScheduleReference schedule) {
    this.schedule = schedule;
  }

  
  /**
   **/
  public WfmBuIntradayDataUpdateTopicBuIntradayResult shortTermForecast(WfmBuIntradayDataUpdateTopicBuShortTermForecastReference shortTermForecast) {
    this.shortTermForecast = shortTermForecast;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("shortTermForecast")
  public WfmBuIntradayDataUpdateTopicBuShortTermForecastReference getShortTermForecast() {
    return shortTermForecast;
  }
  public void setShortTermForecast(WfmBuIntradayDataUpdateTopicBuShortTermForecastReference shortTermForecast) {
    this.shortTermForecast = shortTermForecast;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WfmBuIntradayDataUpdateTopicBuIntradayResult wfmBuIntradayDataUpdateTopicBuIntradayResult = (WfmBuIntradayDataUpdateTopicBuIntradayResult) o;
    return Objects.equals(this.startDate, wfmBuIntradayDataUpdateTopicBuIntradayResult.startDate) &&
        Objects.equals(this.endDate, wfmBuIntradayDataUpdateTopicBuIntradayResult.endDate) &&
        Objects.equals(this.intervalLengthMinutes, wfmBuIntradayDataUpdateTopicBuIntradayResult.intervalLengthMinutes) &&
        Objects.equals(this.intradayDataGroupings, wfmBuIntradayDataUpdateTopicBuIntradayResult.intradayDataGroupings) &&
        Objects.equals(this.categories, wfmBuIntradayDataUpdateTopicBuIntradayResult.categories) &&
        Objects.equals(this.noDataReason, wfmBuIntradayDataUpdateTopicBuIntradayResult.noDataReason) &&
        Objects.equals(this.schedule, wfmBuIntradayDataUpdateTopicBuIntradayResult.schedule) &&
        Objects.equals(this.shortTermForecast, wfmBuIntradayDataUpdateTopicBuIntradayResult.shortTermForecast);
  }

  @Override
  public int hashCode() {
    return Objects.hash(startDate, endDate, intervalLengthMinutes, intradayDataGroupings, categories, noDataReason, schedule, shortTermForecast);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WfmBuIntradayDataUpdateTopicBuIntradayResult {\n");
    
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    intervalLengthMinutes: ").append(toIndentedString(intervalLengthMinutes)).append("\n");
    sb.append("    intradayDataGroupings: ").append(toIndentedString(intradayDataGroupings)).append("\n");
    sb.append("    categories: ").append(toIndentedString(categories)).append("\n");
    sb.append("    noDataReason: ").append(toIndentedString(noDataReason)).append("\n");
    sb.append("    schedule: ").append(toIndentedString(schedule)).append("\n");
    sb.append("    shortTermForecast: ").append(toIndentedString(shortTermForecast)).append("\n");
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

