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
import com.mypurecloud.sdk.v2.model.AgentAdherenceDayMetrics;
import com.mypurecloud.sdk.v2.model.AgentAdherenceScheduledActivity;
import com.mypurecloud.sdk.v2.model.HistoricalAdherenceActuals;
import com.mypurecloud.sdk.v2.model.HistoricalAdherenceExceptionInfo;
import com.mypurecloud.sdk.v2.model.SecondaryPresenceLookupItem;
import com.mypurecloud.sdk.v2.model.UserReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import java.io.Serializable;
/**
 * WfmAgentHistoricalAdherenceResult
 */

public class WfmAgentHistoricalAdherenceResult  implements Serializable {
  
  private UserReference user = null;
  private Date startDate = null;
  private Date endDate = null;
  private Date calculationsCompletedDate = null;
  private Double targetAdherencePercentage = null;
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
  private List<HistoricalAdherenceExceptionInfo> exceptionInfo = null;
  private List<AgentAdherenceDayMetrics> dayMetrics = null;
  private List<HistoricalAdherenceActuals> actuals = null;
  private List<AgentAdherenceScheduledActivity> scheduledActivities = null;
  private List<SecondaryPresenceLookupItem> secondaryPresenceLookupItems = null;

  public WfmAgentHistoricalAdherenceResult() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      exceptionInfo = new ArrayList<HistoricalAdherenceExceptionInfo>();
      dayMetrics = new ArrayList<AgentAdherenceDayMetrics>();
      actuals = new ArrayList<HistoricalAdherenceActuals>();
      scheduledActivities = new ArrayList<AgentAdherenceScheduledActivity>();
      secondaryPresenceLookupItems = new ArrayList<SecondaryPresenceLookupItem>();
    }
  }

  
  /**
   * The user who submitted the agent historical adherence query
   **/
  public WfmAgentHistoricalAdherenceResult user(UserReference user) {
    this.user = user;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The user who submitted the agent historical adherence query")
  @JsonProperty("user")
  public UserReference getUser() {
    return user;
  }
  public void setUser(UserReference user) {
    this.user = user;
  }


  /**
   * Beginning of the date range that was queried, in ISO-8601 format
   **/
  public WfmAgentHistoricalAdherenceResult startDate(Date startDate) {
    this.startDate = startDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Beginning of the date range that was queried, in ISO-8601 format")
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
  public WfmAgentHistoricalAdherenceResult endDate(Date endDate) {
    this.endDate = endDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "End of the date range that was queried, in ISO-8601 format. If it was not set, end date will be set to the queried time")
  @JsonProperty("endDate")
  public Date getEndDate() {
    return endDate;
  }
  public void setEndDate(Date endDate) {
    this.endDate = endDate;
  }


  /**
   * Completed date of calculations that was queried, in ISO-8601 format.
   **/
  public WfmAgentHistoricalAdherenceResult calculationsCompletedDate(Date calculationsCompletedDate) {
    this.calculationsCompletedDate = calculationsCompletedDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Completed date of calculations that was queried, in ISO-8601 format.")
  @JsonProperty("calculationsCompletedDate")
  public Date getCalculationsCompletedDate() {
    return calculationsCompletedDate;
  }
  public void setCalculationsCompletedDate(Date calculationsCompletedDate) {
    this.calculationsCompletedDate = calculationsCompletedDate;
  }


  /**
   * Target percentage for this user, in the scale of 0 - 100
   **/
  public WfmAgentHistoricalAdherenceResult targetAdherencePercentage(Double targetAdherencePercentage) {
    this.targetAdherencePercentage = targetAdherencePercentage;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Target percentage for this user, in the scale of 0 - 100")
  @JsonProperty("targetAdherencePercentage")
  public Double getTargetAdherencePercentage() {
    return targetAdherencePercentage;
  }
  public void setTargetAdherencePercentage(Double targetAdherencePercentage) {
    this.targetAdherencePercentage = targetAdherencePercentage;
  }


  /**
   * Adherence percentage for this user, in the scale of 0 - 100
   **/
  public WfmAgentHistoricalAdherenceResult adherencePercentage(Double adherencePercentage) {
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
  public WfmAgentHistoricalAdherenceResult conformancePercentage(Double conformancePercentage) {
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
  public WfmAgentHistoricalAdherenceResult impact(ImpactEnum impact) {
    this.impact = impact;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The impact of the current adherence state for this user")
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
  public WfmAgentHistoricalAdherenceResult exceptionInfo(List<HistoricalAdherenceExceptionInfo> exceptionInfo) {
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
  public WfmAgentHistoricalAdherenceResult dayMetrics(List<AgentAdherenceDayMetrics> dayMetrics) {
    this.dayMetrics = dayMetrics;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Adherence and conformance metrics for days in query range")
  @JsonProperty("dayMetrics")
  public List<AgentAdherenceDayMetrics> getDayMetrics() {
    return dayMetrics;
  }
  public void setDayMetrics(List<AgentAdherenceDayMetrics> dayMetrics) {
    this.dayMetrics = dayMetrics;
  }


  /**
   * List of actual activity with offset for this user
   **/
  public WfmAgentHistoricalAdherenceResult actuals(List<HistoricalAdherenceActuals> actuals) {
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


  /**
   * List of scheduled activities for this user
   **/
  public WfmAgentHistoricalAdherenceResult scheduledActivities(List<AgentAdherenceScheduledActivity> scheduledActivities) {
    this.scheduledActivities = scheduledActivities;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "List of scheduled activities for this user")
  @JsonProperty("scheduledActivities")
  public List<AgentAdherenceScheduledActivity> getScheduledActivities() {
    return scheduledActivities;
  }
  public void setScheduledActivities(List<AgentAdherenceScheduledActivity> scheduledActivities) {
    this.scheduledActivities = scheduledActivities;
  }


  /**
   * List of secondary presence lookup ID to corresponding secondary presence ID item
   **/
  public WfmAgentHistoricalAdherenceResult secondaryPresenceLookupItems(List<SecondaryPresenceLookupItem> secondaryPresenceLookupItems) {
    this.secondaryPresenceLookupItems = secondaryPresenceLookupItems;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "List of secondary presence lookup ID to corresponding secondary presence ID item")
  @JsonProperty("secondaryPresenceLookupItems")
  public List<SecondaryPresenceLookupItem> getSecondaryPresenceLookupItems() {
    return secondaryPresenceLookupItems;
  }
  public void setSecondaryPresenceLookupItems(List<SecondaryPresenceLookupItem> secondaryPresenceLookupItems) {
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
    WfmAgentHistoricalAdherenceResult wfmAgentHistoricalAdherenceResult = (WfmAgentHistoricalAdherenceResult) o;

    return Objects.equals(this.user, wfmAgentHistoricalAdherenceResult.user) &&
            Objects.equals(this.startDate, wfmAgentHistoricalAdherenceResult.startDate) &&
            Objects.equals(this.endDate, wfmAgentHistoricalAdherenceResult.endDate) &&
            Objects.equals(this.calculationsCompletedDate, wfmAgentHistoricalAdherenceResult.calculationsCompletedDate) &&
            Objects.equals(this.targetAdherencePercentage, wfmAgentHistoricalAdherenceResult.targetAdherencePercentage) &&
            Objects.equals(this.adherencePercentage, wfmAgentHistoricalAdherenceResult.adherencePercentage) &&
            Objects.equals(this.conformancePercentage, wfmAgentHistoricalAdherenceResult.conformancePercentage) &&
            Objects.equals(this.impact, wfmAgentHistoricalAdherenceResult.impact) &&
            Objects.equals(this.exceptionInfo, wfmAgentHistoricalAdherenceResult.exceptionInfo) &&
            Objects.equals(this.dayMetrics, wfmAgentHistoricalAdherenceResult.dayMetrics) &&
            Objects.equals(this.actuals, wfmAgentHistoricalAdherenceResult.actuals) &&
            Objects.equals(this.scheduledActivities, wfmAgentHistoricalAdherenceResult.scheduledActivities) &&
            Objects.equals(this.secondaryPresenceLookupItems, wfmAgentHistoricalAdherenceResult.secondaryPresenceLookupItems);
  }

  @Override
  public int hashCode() {
    return Objects.hash(user, startDate, endDate, calculationsCompletedDate, targetAdherencePercentage, adherencePercentage, conformancePercentage, impact, exceptionInfo, dayMetrics, actuals, scheduledActivities, secondaryPresenceLookupItems);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WfmAgentHistoricalAdherenceResult {\n");
    
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

