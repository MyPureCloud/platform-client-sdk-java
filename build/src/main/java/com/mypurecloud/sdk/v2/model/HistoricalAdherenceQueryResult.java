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
import com.mypurecloud.sdk.v2.model.HistoricalAdherenceActuals;
import com.mypurecloud.sdk.v2.model.HistoricalAdherenceDayMetrics;
import com.mypurecloud.sdk.v2.model.HistoricalAdherenceExceptionInfo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import java.io.Serializable;
/**
 * HistoricalAdherenceQueryResult
 */

public class HistoricalAdherenceQueryResult  implements Serializable {
  
  private String userId = null;
  private Date startDate = null;
  private Date endDate = null;
  private Double adherencePercentage = null;
  private Double conformancePercentage = null;

  private static class ImpactEnumDeserializer extends StdDeserializer<ImpactEnum> {
    public ImpactEnumDeserializer() {
      super(ImpactEnumDeserializer.class);
    }

    @Override
    public ImpactEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return ImpactEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The impact of the current adherence state for this user
   */
 @JsonDeserialize(using = ImpactEnumDeserializer.class)
  public enum ImpactEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    POSITIVE("Positive"),
    NEGATIVE("Negative"),
    NEUTRAL("Neutral"),
    UNKNOWN("Unknown");

    private String value;

    ImpactEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static ImpactEnum fromString(String key) {
      if (key == null) return null;

      for (ImpactEnum value : ImpactEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return ImpactEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private ImpactEnum impact = null;
  private List<HistoricalAdherenceExceptionInfo> exceptionInfo = new ArrayList<HistoricalAdherenceExceptionInfo>();
  private List<HistoricalAdherenceDayMetrics> dayMetrics = new ArrayList<HistoricalAdherenceDayMetrics>();
  private List<HistoricalAdherenceActuals> actuals = new ArrayList<HistoricalAdherenceActuals>();

  
  /**
   * The ID of the user for whom the adherence is queried
   **/
  public HistoricalAdherenceQueryResult userId(String userId) {
    this.userId = userId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The ID of the user for whom the adherence is queried")
  @JsonProperty("userId")
  public String getUserId() {
    return userId;
  }
  public void setUserId(String userId) {
    this.userId = userId;
  }

  
  /**
   * Beginning of the date range that was queried, in ISO-8601 format
   **/
  public HistoricalAdherenceQueryResult startDate(Date startDate) {
    this.startDate = startDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Beginning of the date range that was queried, in ISO-8601 format")
  @JsonProperty("startDate")
  public Date getStartDate() {
    return startDate;
  }
  public void setStartDate(Date startDate) {
    this.startDate = startDate;
  }

  
  /**
   * End of the date range that was queried, in ISO-8601 format. If it was not set, end date will be set to the queried time
   **/
  public HistoricalAdherenceQueryResult endDate(Date endDate) {
    this.endDate = endDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "End of the date range that was queried, in ISO-8601 format. If it was not set, end date will be set to the queried time")
  @JsonProperty("endDate")
  public Date getEndDate() {
    return endDate;
  }
  public void setEndDate(Date endDate) {
    this.endDate = endDate;
  }

  
  /**
   * Adherence percentage for this user, in the scale of 0 - 100
   **/
  public HistoricalAdherenceQueryResult adherencePercentage(Double adherencePercentage) {
    this.adherencePercentage = adherencePercentage;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Adherence percentage for this user, in the scale of 0 - 100")
  @JsonProperty("adherencePercentage")
  public Double getAdherencePercentage() {
    return adherencePercentage;
  }
  public void setAdherencePercentage(Double adherencePercentage) {
    this.adherencePercentage = adherencePercentage;
  }

  
  /**
   * Conformance percentage for this user, in the scale of 0 - 100. Conformance percentage can be greater than 100 when the actual on queue time is greater than the scheduled on queue time for the same period.
   **/
  public HistoricalAdherenceQueryResult conformancePercentage(Double conformancePercentage) {
    this.conformancePercentage = conformancePercentage;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Conformance percentage for this user, in the scale of 0 - 100. Conformance percentage can be greater than 100 when the actual on queue time is greater than the scheduled on queue time for the same period.")
  @JsonProperty("conformancePercentage")
  public Double getConformancePercentage() {
    return conformancePercentage;
  }
  public void setConformancePercentage(Double conformancePercentage) {
    this.conformancePercentage = conformancePercentage;
  }

  
  /**
   * The impact of the current adherence state for this user
   **/
  public HistoricalAdherenceQueryResult impact(ImpactEnum impact) {
    this.impact = impact;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The impact of the current adherence state for this user")
  @JsonProperty("impact")
  public ImpactEnum getImpact() {
    return impact;
  }
  public void setImpact(ImpactEnum impact) {
    this.impact = impact;
  }

  
  /**
   * List of adherence exceptions for this user
   **/
  public HistoricalAdherenceQueryResult exceptionInfo(List<HistoricalAdherenceExceptionInfo> exceptionInfo) {
    this.exceptionInfo = exceptionInfo;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "List of adherence exceptions for this user")
  @JsonProperty("exceptionInfo")
  public List<HistoricalAdherenceExceptionInfo> getExceptionInfo() {
    return exceptionInfo;
  }
  public void setExceptionInfo(List<HistoricalAdherenceExceptionInfo> exceptionInfo) {
    this.exceptionInfo = exceptionInfo;
  }

  
  /**
   * Adherence and conformance metrics for days in query range
   **/
  public HistoricalAdherenceQueryResult dayMetrics(List<HistoricalAdherenceDayMetrics> dayMetrics) {
    this.dayMetrics = dayMetrics;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Adherence and conformance metrics for days in query range")
  @JsonProperty("dayMetrics")
  public List<HistoricalAdherenceDayMetrics> getDayMetrics() {
    return dayMetrics;
  }
  public void setDayMetrics(List<HistoricalAdherenceDayMetrics> dayMetrics) {
    this.dayMetrics = dayMetrics;
  }

  
  /**
   * List of actual activity with offset for this user
   **/
  public HistoricalAdherenceQueryResult actuals(List<HistoricalAdherenceActuals> actuals) {
    this.actuals = actuals;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "List of actual activity with offset for this user")
  @JsonProperty("actuals")
  public List<HistoricalAdherenceActuals> getActuals() {
    return actuals;
  }
  public void setActuals(List<HistoricalAdherenceActuals> actuals) {
    this.actuals = actuals;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HistoricalAdherenceQueryResult historicalAdherenceQueryResult = (HistoricalAdherenceQueryResult) o;
    return Objects.equals(this.userId, historicalAdherenceQueryResult.userId) &&
        Objects.equals(this.startDate, historicalAdherenceQueryResult.startDate) &&
        Objects.equals(this.endDate, historicalAdherenceQueryResult.endDate) &&
        Objects.equals(this.adherencePercentage, historicalAdherenceQueryResult.adherencePercentage) &&
        Objects.equals(this.conformancePercentage, historicalAdherenceQueryResult.conformancePercentage) &&
        Objects.equals(this.impact, historicalAdherenceQueryResult.impact) &&
        Objects.equals(this.exceptionInfo, historicalAdherenceQueryResult.exceptionInfo) &&
        Objects.equals(this.dayMetrics, historicalAdherenceQueryResult.dayMetrics) &&
        Objects.equals(this.actuals, historicalAdherenceQueryResult.actuals);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userId, startDate, endDate, adherencePercentage, conformancePercentage, impact, exceptionInfo, dayMetrics, actuals);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HistoricalAdherenceQueryResult {\n");
    
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    adherencePercentage: ").append(toIndentedString(adherencePercentage)).append("\n");
    sb.append("    conformancePercentage: ").append(toIndentedString(conformancePercentage)).append("\n");
    sb.append("    impact: ").append(toIndentedString(impact)).append("\n");
    sb.append("    exceptionInfo: ").append(toIndentedString(exceptionInfo)).append("\n");
    sb.append("    dayMetrics: ").append(toIndentedString(dayMetrics)).append("\n");
    sb.append("    actuals: ").append(toIndentedString(actuals)).append("\n");
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

