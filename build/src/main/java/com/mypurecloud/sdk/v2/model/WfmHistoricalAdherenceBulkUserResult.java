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
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.mypurecloud.sdk.v2.model.HistoricalAdherenceExceptionInfo;
import com.mypurecloud.sdk.v2.model.WfmHistoricalAdherenceBulkUserDayMetrics;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * WfmHistoricalAdherenceBulkUserResult
 */

public class WfmHistoricalAdherenceBulkUserResult  implements Serializable {
  
  private String userId = null;
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
  private List<WfmHistoricalAdherenceBulkUserDayMetrics> dayMetrics = new ArrayList<WfmHistoricalAdherenceBulkUserDayMetrics>();

  
  /**
   * The ID of the user for whom the adherence is queried
   **/
  public WfmHistoricalAdherenceBulkUserResult userId(String userId) {
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
   * Adherence percentage for this user, in the scale of 0 - 100
   **/
  public WfmHistoricalAdherenceBulkUserResult adherencePercentage(Double adherencePercentage) {
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
  public WfmHistoricalAdherenceBulkUserResult conformancePercentage(Double conformancePercentage) {
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
  public WfmHistoricalAdherenceBulkUserResult impact(ImpactEnum impact) {
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
  public WfmHistoricalAdherenceBulkUserResult exceptionInfo(List<HistoricalAdherenceExceptionInfo> exceptionInfo) {
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
  public WfmHistoricalAdherenceBulkUserResult dayMetrics(List<WfmHistoricalAdherenceBulkUserDayMetrics> dayMetrics) {
    this.dayMetrics = dayMetrics;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Adherence and conformance metrics for days in query range")
  @JsonProperty("dayMetrics")
  public List<WfmHistoricalAdherenceBulkUserDayMetrics> getDayMetrics() {
    return dayMetrics;
  }
  public void setDayMetrics(List<WfmHistoricalAdherenceBulkUserDayMetrics> dayMetrics) {
    this.dayMetrics = dayMetrics;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WfmHistoricalAdherenceBulkUserResult wfmHistoricalAdherenceBulkUserResult = (WfmHistoricalAdherenceBulkUserResult) o;

    return Objects.equals(this.userId, wfmHistoricalAdherenceBulkUserResult.userId) &&
            Objects.equals(this.adherencePercentage, wfmHistoricalAdherenceBulkUserResult.adherencePercentage) &&
            Objects.equals(this.conformancePercentage, wfmHistoricalAdherenceBulkUserResult.conformancePercentage) &&
            Objects.equals(this.impact, wfmHistoricalAdherenceBulkUserResult.impact) &&
            Objects.equals(this.exceptionInfo, wfmHistoricalAdherenceBulkUserResult.exceptionInfo) &&
            Objects.equals(this.dayMetrics, wfmHistoricalAdherenceBulkUserResult.dayMetrics);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userId, adherencePercentage, conformancePercentage, impact, exceptionInfo, dayMetrics);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WfmHistoricalAdherenceBulkUserResult {\n");
    
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    adherencePercentage: ").append(toIndentedString(adherencePercentage)).append("\n");
    sb.append("    conformancePercentage: ").append(toIndentedString(conformancePercentage)).append("\n");
    sb.append("    impact: ").append(toIndentedString(impact)).append("\n");
    sb.append("    exceptionInfo: ").append(toIndentedString(exceptionInfo)).append("\n");
    sb.append("    dayMetrics: ").append(toIndentedString(dayMetrics)).append("\n");
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

