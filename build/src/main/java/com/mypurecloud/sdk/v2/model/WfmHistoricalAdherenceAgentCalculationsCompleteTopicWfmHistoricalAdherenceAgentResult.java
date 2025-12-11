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
import com.fasterxml.jackson.annotation.JsonValue;
import com.mypurecloud.sdk.v2.model.WfmHistoricalAdherenceAgentCalculationsCompleteTopicUserReference;
import com.mypurecloud.sdk.v2.model.WfmHistoricalAdherenceAgentCalculationsCompleteTopicWfmHistoricalAdherenceActuals;
import com.mypurecloud.sdk.v2.model.WfmHistoricalAdherenceAgentCalculationsCompleteTopicWfmHistoricalAdherenceAgentDayMetrics;
import com.mypurecloud.sdk.v2.model.WfmHistoricalAdherenceAgentCalculationsCompleteTopicWfmHistoricalAdherenceExceptionInfo;
import com.mypurecloud.sdk.v2.model.WfmHistoricalAdherenceAgentCalculationsCompleteTopicWfmHistoricalAdherenceScheduledActivity;
import com.mypurecloud.sdk.v2.model.WfmHistoricalAdherenceAgentCalculationsCompleteTopicWfmSecondaryPresenceLookupItem;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import java.io.Serializable;
/**
 * WfmHistoricalAdherenceAgentCalculationsCompleteTopicWfmHistoricalAdherenceAgentResult
 */

public class WfmHistoricalAdherenceAgentCalculationsCompleteTopicWfmHistoricalAdherenceAgentResult  implements Serializable {
  
  private WfmHistoricalAdherenceAgentCalculationsCompleteTopicUserReference user = null;
  private Date startDate = null;
  private Date endDate = null;
  private Date calculationsCompletedDate = null;
  private BigDecimal targetAdherencePercentage = null;
  private BigDecimal adherencePercentage = null;
  private BigDecimal conformancePercentage = null;

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
   * Gets or Sets impact
   */
 @JsonDeserialize(using = ImpactEnumDeserializer.class)
  public enum ImpactEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    UNKNOWN("Unknown"),
    POSITIVE("Positive"),
    NEGATIVE("Negative"),
    NEUTRAL("Neutral");

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
  private List<WfmHistoricalAdherenceAgentCalculationsCompleteTopicWfmHistoricalAdherenceExceptionInfo> exceptionInfo = null;
  private List<WfmHistoricalAdherenceAgentCalculationsCompleteTopicWfmHistoricalAdherenceAgentDayMetrics> dayMetrics = null;
  private List<WfmHistoricalAdherenceAgentCalculationsCompleteTopicWfmHistoricalAdherenceActuals> actuals = null;
  private List<WfmHistoricalAdherenceAgentCalculationsCompleteTopicWfmHistoricalAdherenceScheduledActivity> scheduledActivities = null;
  private List<WfmHistoricalAdherenceAgentCalculationsCompleteTopicWfmSecondaryPresenceLookupItem> secondaryPresenceLookupItems = null;

  public WfmHistoricalAdherenceAgentCalculationsCompleteTopicWfmHistoricalAdherenceAgentResult() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      exceptionInfo = new ArrayList<WfmHistoricalAdherenceAgentCalculationsCompleteTopicWfmHistoricalAdherenceExceptionInfo>();
      dayMetrics = new ArrayList<WfmHistoricalAdherenceAgentCalculationsCompleteTopicWfmHistoricalAdherenceAgentDayMetrics>();
      actuals = new ArrayList<WfmHistoricalAdherenceAgentCalculationsCompleteTopicWfmHistoricalAdherenceActuals>();
      scheduledActivities = new ArrayList<WfmHistoricalAdherenceAgentCalculationsCompleteTopicWfmHistoricalAdherenceScheduledActivity>();
      secondaryPresenceLookupItems = new ArrayList<WfmHistoricalAdherenceAgentCalculationsCompleteTopicWfmSecondaryPresenceLookupItem>();
    }
  }

  
  /**
   **/
  public WfmHistoricalAdherenceAgentCalculationsCompleteTopicWfmHistoricalAdherenceAgentResult user(WfmHistoricalAdherenceAgentCalculationsCompleteTopicUserReference user) {
    this.user = user;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("user")
  public WfmHistoricalAdherenceAgentCalculationsCompleteTopicUserReference getUser() {
    return user;
  }
  public void setUser(WfmHistoricalAdherenceAgentCalculationsCompleteTopicUserReference user) {
    this.user = user;
  }


  /**
   **/
  public WfmHistoricalAdherenceAgentCalculationsCompleteTopicWfmHistoricalAdherenceAgentResult startDate(Date startDate) {
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
  public WfmHistoricalAdherenceAgentCalculationsCompleteTopicWfmHistoricalAdherenceAgentResult endDate(Date endDate) {
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
  public WfmHistoricalAdherenceAgentCalculationsCompleteTopicWfmHistoricalAdherenceAgentResult calculationsCompletedDate(Date calculationsCompletedDate) {
    this.calculationsCompletedDate = calculationsCompletedDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("calculationsCompletedDate")
  public Date getCalculationsCompletedDate() {
    return calculationsCompletedDate;
  }
  public void setCalculationsCompletedDate(Date calculationsCompletedDate) {
    this.calculationsCompletedDate = calculationsCompletedDate;
  }


  /**
   **/
  public WfmHistoricalAdherenceAgentCalculationsCompleteTopicWfmHistoricalAdherenceAgentResult targetAdherencePercentage(BigDecimal targetAdherencePercentage) {
    this.targetAdherencePercentage = targetAdherencePercentage;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("targetAdherencePercentage")
  public BigDecimal getTargetAdherencePercentage() {
    return targetAdherencePercentage;
  }
  public void setTargetAdherencePercentage(BigDecimal targetAdherencePercentage) {
    this.targetAdherencePercentage = targetAdherencePercentage;
  }


  /**
   **/
  public WfmHistoricalAdherenceAgentCalculationsCompleteTopicWfmHistoricalAdherenceAgentResult adherencePercentage(BigDecimal adherencePercentage) {
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
  public WfmHistoricalAdherenceAgentCalculationsCompleteTopicWfmHistoricalAdherenceAgentResult conformancePercentage(BigDecimal conformancePercentage) {
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


  /**
   **/
  public WfmHistoricalAdherenceAgentCalculationsCompleteTopicWfmHistoricalAdherenceAgentResult impact(ImpactEnum impact) {
    this.impact = impact;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("impact")
  public ImpactEnum getImpact() {
    return impact;
  }
  public void setImpact(ImpactEnum impact) {
    this.impact = impact;
  }


  /**
   **/
  public WfmHistoricalAdherenceAgentCalculationsCompleteTopicWfmHistoricalAdherenceAgentResult exceptionInfo(List<WfmHistoricalAdherenceAgentCalculationsCompleteTopicWfmHistoricalAdherenceExceptionInfo> exceptionInfo) {
    this.exceptionInfo = exceptionInfo;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("exceptionInfo")
  public List<WfmHistoricalAdherenceAgentCalculationsCompleteTopicWfmHistoricalAdherenceExceptionInfo> getExceptionInfo() {
    return exceptionInfo;
  }
  public void setExceptionInfo(List<WfmHistoricalAdherenceAgentCalculationsCompleteTopicWfmHistoricalAdherenceExceptionInfo> exceptionInfo) {
    this.exceptionInfo = exceptionInfo;
  }


  /**
   **/
  public WfmHistoricalAdherenceAgentCalculationsCompleteTopicWfmHistoricalAdherenceAgentResult dayMetrics(List<WfmHistoricalAdherenceAgentCalculationsCompleteTopicWfmHistoricalAdherenceAgentDayMetrics> dayMetrics) {
    this.dayMetrics = dayMetrics;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("dayMetrics")
  public List<WfmHistoricalAdherenceAgentCalculationsCompleteTopicWfmHistoricalAdherenceAgentDayMetrics> getDayMetrics() {
    return dayMetrics;
  }
  public void setDayMetrics(List<WfmHistoricalAdherenceAgentCalculationsCompleteTopicWfmHistoricalAdherenceAgentDayMetrics> dayMetrics) {
    this.dayMetrics = dayMetrics;
  }


  /**
   **/
  public WfmHistoricalAdherenceAgentCalculationsCompleteTopicWfmHistoricalAdherenceAgentResult actuals(List<WfmHistoricalAdherenceAgentCalculationsCompleteTopicWfmHistoricalAdherenceActuals> actuals) {
    this.actuals = actuals;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("actuals")
  public List<WfmHistoricalAdherenceAgentCalculationsCompleteTopicWfmHistoricalAdherenceActuals> getActuals() {
    return actuals;
  }
  public void setActuals(List<WfmHistoricalAdherenceAgentCalculationsCompleteTopicWfmHistoricalAdherenceActuals> actuals) {
    this.actuals = actuals;
  }


  /**
   **/
  public WfmHistoricalAdherenceAgentCalculationsCompleteTopicWfmHistoricalAdherenceAgentResult scheduledActivities(List<WfmHistoricalAdherenceAgentCalculationsCompleteTopicWfmHistoricalAdherenceScheduledActivity> scheduledActivities) {
    this.scheduledActivities = scheduledActivities;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("scheduledActivities")
  public List<WfmHistoricalAdherenceAgentCalculationsCompleteTopicWfmHistoricalAdherenceScheduledActivity> getScheduledActivities() {
    return scheduledActivities;
  }
  public void setScheduledActivities(List<WfmHistoricalAdherenceAgentCalculationsCompleteTopicWfmHistoricalAdherenceScheduledActivity> scheduledActivities) {
    this.scheduledActivities = scheduledActivities;
  }


  /**
   **/
  public WfmHistoricalAdherenceAgentCalculationsCompleteTopicWfmHistoricalAdherenceAgentResult secondaryPresenceLookupItems(List<WfmHistoricalAdherenceAgentCalculationsCompleteTopicWfmSecondaryPresenceLookupItem> secondaryPresenceLookupItems) {
    this.secondaryPresenceLookupItems = secondaryPresenceLookupItems;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("secondaryPresenceLookupItems")
  public List<WfmHistoricalAdherenceAgentCalculationsCompleteTopicWfmSecondaryPresenceLookupItem> getSecondaryPresenceLookupItems() {
    return secondaryPresenceLookupItems;
  }
  public void setSecondaryPresenceLookupItems(List<WfmHistoricalAdherenceAgentCalculationsCompleteTopicWfmSecondaryPresenceLookupItem> secondaryPresenceLookupItems) {
    this.secondaryPresenceLookupItems = secondaryPresenceLookupItems;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WfmHistoricalAdherenceAgentCalculationsCompleteTopicWfmHistoricalAdherenceAgentResult wfmHistoricalAdherenceAgentCalculationsCompleteTopicWfmHistoricalAdherenceAgentResult = (WfmHistoricalAdherenceAgentCalculationsCompleteTopicWfmHistoricalAdherenceAgentResult) o;

    return Objects.equals(this.user, wfmHistoricalAdherenceAgentCalculationsCompleteTopicWfmHistoricalAdherenceAgentResult.user) &&
            Objects.equals(this.startDate, wfmHistoricalAdherenceAgentCalculationsCompleteTopicWfmHistoricalAdherenceAgentResult.startDate) &&
            Objects.equals(this.endDate, wfmHistoricalAdherenceAgentCalculationsCompleteTopicWfmHistoricalAdherenceAgentResult.endDate) &&
            Objects.equals(this.calculationsCompletedDate, wfmHistoricalAdherenceAgentCalculationsCompleteTopicWfmHistoricalAdherenceAgentResult.calculationsCompletedDate) &&
            Objects.equals(this.targetAdherencePercentage, wfmHistoricalAdherenceAgentCalculationsCompleteTopicWfmHistoricalAdherenceAgentResult.targetAdherencePercentage) &&
            Objects.equals(this.adherencePercentage, wfmHistoricalAdherenceAgentCalculationsCompleteTopicWfmHistoricalAdherenceAgentResult.adherencePercentage) &&
            Objects.equals(this.conformancePercentage, wfmHistoricalAdherenceAgentCalculationsCompleteTopicWfmHistoricalAdherenceAgentResult.conformancePercentage) &&
            Objects.equals(this.impact, wfmHistoricalAdherenceAgentCalculationsCompleteTopicWfmHistoricalAdherenceAgentResult.impact) &&
            Objects.equals(this.exceptionInfo, wfmHistoricalAdherenceAgentCalculationsCompleteTopicWfmHistoricalAdherenceAgentResult.exceptionInfo) &&
            Objects.equals(this.dayMetrics, wfmHistoricalAdherenceAgentCalculationsCompleteTopicWfmHistoricalAdherenceAgentResult.dayMetrics) &&
            Objects.equals(this.actuals, wfmHistoricalAdherenceAgentCalculationsCompleteTopicWfmHistoricalAdherenceAgentResult.actuals) &&
            Objects.equals(this.scheduledActivities, wfmHistoricalAdherenceAgentCalculationsCompleteTopicWfmHistoricalAdherenceAgentResult.scheduledActivities) &&
            Objects.equals(this.secondaryPresenceLookupItems, wfmHistoricalAdherenceAgentCalculationsCompleteTopicWfmHistoricalAdherenceAgentResult.secondaryPresenceLookupItems);
  }

  @Override
  public int hashCode() {
    return Objects.hash(user, startDate, endDate, calculationsCompletedDate, targetAdherencePercentage, adherencePercentage, conformancePercentage, impact, exceptionInfo, dayMetrics, actuals, scheduledActivities, secondaryPresenceLookupItems);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WfmHistoricalAdherenceAgentCalculationsCompleteTopicWfmHistoricalAdherenceAgentResult {\n");
    
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    calculationsCompletedDate: ").append(toIndentedString(calculationsCompletedDate)).append("\n");
    sb.append("    targetAdherencePercentage: ").append(toIndentedString(targetAdherencePercentage)).append("\n");
    sb.append("    adherencePercentage: ").append(toIndentedString(adherencePercentage)).append("\n");
    sb.append("    conformancePercentage: ").append(toIndentedString(conformancePercentage)).append("\n");
    sb.append("    impact: ").append(toIndentedString(impact)).append("\n");
    sb.append("    exceptionInfo: ").append(toIndentedString(exceptionInfo)).append("\n");
    sb.append("    dayMetrics: ").append(toIndentedString(dayMetrics)).append("\n");
    sb.append("    actuals: ").append(toIndentedString(actuals)).append("\n");
    sb.append("    scheduledActivities: ").append(toIndentedString(scheduledActivities)).append("\n");
    sb.append("    secondaryPresenceLookupItems: ").append(toIndentedString(secondaryPresenceLookupItems)).append("\n");
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

