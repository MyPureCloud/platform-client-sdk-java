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
import com.mypurecloud.sdk.v2.model.BuIntradayDataGroup;
import com.mypurecloud.sdk.v2.model.BuScheduleReference;
import com.mypurecloud.sdk.v2.model.BuShortTermForecastReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import java.io.Serializable;
/**
 * BuIntradayResponse
 */

public class BuIntradayResponse  implements Serializable {
  
  private Date startDate = null;
  private Date endDate = null;
  private Integer intervalLengthMinutes = null;

  private static class NoDataReasonEnumDeserializer extends StdDeserializer<NoDataReasonEnum> {
    public NoDataReasonEnumDeserializer() {
      super(NoDataReasonEnumDeserializer.class);
    }

    @Override
    public NoDataReasonEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return NoDataReasonEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * If not null, the reason there was no data for the request
   */
 @JsonDeserialize(using = NoDataReasonEnumDeserializer.class)
  public enum NoDataReasonEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    NOPUBLISHEDSCHEDULE("NoPublishedSchedule"),
    NOSOURCEFORECAST("NoSourceForecast");

    private String value;

    NoDataReasonEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static NoDataReasonEnum fromString(String key) {
      if (key == null) return null;

      for (NoDataReasonEnum value : NoDataReasonEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return NoDataReasonEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private NoDataReasonEnum noDataReason = null;

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
  private BuShortTermForecastReference shortTermForecast = null;
  private BuScheduleReference schedule = null;
  private List<BuIntradayDataGroup> intradayDataGroupings = new ArrayList<BuIntradayDataGroup>();

  
  /**
   * The start of the date range for which this data applies.  This is also the start reference point for the intervals represented in the various arrays. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public BuIntradayResponse startDate(Date startDate) {
    this.startDate = startDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The start of the date range for which this data applies.  This is also the start reference point for the intervals represented in the various arrays. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("startDate")
  public Date getStartDate() {
    return startDate;
  }
  public void setStartDate(Date startDate) {
    this.startDate = startDate;
  }

  
  /**
   * The end of the date range for which this data applies. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public BuIntradayResponse endDate(Date endDate) {
    this.endDate = endDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The end of the date range for which this data applies. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("endDate")
  public Date getEndDate() {
    return endDate;
  }
  public void setEndDate(Date endDate) {
    this.endDate = endDate;
  }

  
  /**
   * The aggregation period in minutes, which determines the interval duration of the returned data
   **/
  public BuIntradayResponse intervalLengthMinutes(Integer intervalLengthMinutes) {
    this.intervalLengthMinutes = intervalLengthMinutes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The aggregation period in minutes, which determines the interval duration of the returned data")
  @JsonProperty("intervalLengthMinutes")
  public Integer getIntervalLengthMinutes() {
    return intervalLengthMinutes;
  }
  public void setIntervalLengthMinutes(Integer intervalLengthMinutes) {
    this.intervalLengthMinutes = intervalLengthMinutes;
  }

  
  /**
   * If not null, the reason there was no data for the request
   **/
  public BuIntradayResponse noDataReason(NoDataReasonEnum noDataReason) {
    this.noDataReason = noDataReason;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "If not null, the reason there was no data for the request")
  @JsonProperty("noDataReason")
  public NoDataReasonEnum getNoDataReason() {
    return noDataReason;
  }
  public void setNoDataReason(NoDataReasonEnum noDataReason) {
    this.noDataReason = noDataReason;
  }

  
  /**
   * The categories to which this data corresponds
   **/
  public BuIntradayResponse categories(List<CategoriesEnum> categories) {
    this.categories = categories;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The categories to which this data corresponds")
  @JsonProperty("categories")
  public List<CategoriesEnum> getCategories() {
    return categories;
  }
  public void setCategories(List<CategoriesEnum> categories) {
    this.categories = categories;
  }

  
  /**
   * Short term forecast reference
   **/
  public BuIntradayResponse shortTermForecast(BuShortTermForecastReference shortTermForecast) {
    this.shortTermForecast = shortTermForecast;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Short term forecast reference")
  @JsonProperty("shortTermForecast")
  public BuShortTermForecastReference getShortTermForecast() {
    return shortTermForecast;
  }
  public void setShortTermForecast(BuShortTermForecastReference shortTermForecast) {
    this.shortTermForecast = shortTermForecast;
  }

  
  /**
   * Schedule reference
   **/
  public BuIntradayResponse schedule(BuScheduleReference schedule) {
    this.schedule = schedule;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Schedule reference")
  @JsonProperty("schedule")
  public BuScheduleReference getSchedule() {
    return schedule;
  }
  public void setSchedule(BuScheduleReference schedule) {
    this.schedule = schedule;
  }

  
  /**
   * Intraday data grouped by a single media type and set of planning group IDs
   **/
  public BuIntradayResponse intradayDataGroupings(List<BuIntradayDataGroup> intradayDataGroupings) {
    this.intradayDataGroupings = intradayDataGroupings;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Intraday data grouped by a single media type and set of planning group IDs")
  @JsonProperty("intradayDataGroupings")
  public List<BuIntradayDataGroup> getIntradayDataGroupings() {
    return intradayDataGroupings;
  }
  public void setIntradayDataGroupings(List<BuIntradayDataGroup> intradayDataGroupings) {
    this.intradayDataGroupings = intradayDataGroupings;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BuIntradayResponse buIntradayResponse = (BuIntradayResponse) o;
    return Objects.equals(this.startDate, buIntradayResponse.startDate) &&
        Objects.equals(this.endDate, buIntradayResponse.endDate) &&
        Objects.equals(this.intervalLengthMinutes, buIntradayResponse.intervalLengthMinutes) &&
        Objects.equals(this.noDataReason, buIntradayResponse.noDataReason) &&
        Objects.equals(this.categories, buIntradayResponse.categories) &&
        Objects.equals(this.shortTermForecast, buIntradayResponse.shortTermForecast) &&
        Objects.equals(this.schedule, buIntradayResponse.schedule) &&
        Objects.equals(this.intradayDataGroupings, buIntradayResponse.intradayDataGroupings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(startDate, endDate, intervalLengthMinutes, noDataReason, categories, shortTermForecast, schedule, intradayDataGroupings);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BuIntradayResponse {\n");
    
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    intervalLengthMinutes: ").append(toIndentedString(intervalLengthMinutes)).append("\n");
    sb.append("    noDataReason: ").append(toIndentedString(noDataReason)).append("\n");
    sb.append("    categories: ").append(toIndentedString(categories)).append("\n");
    sb.append("    shortTermForecast: ").append(toIndentedString(shortTermForecast)).append("\n");
    sb.append("    schedule: ").append(toIndentedString(schedule)).append("\n");
    sb.append("    intradayDataGroupings: ").append(toIndentedString(intradayDataGroupings)).append("\n");
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

