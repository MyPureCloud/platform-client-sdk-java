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
import com.mypurecloud.sdk.v2.model.CampaignRuleDayOfMonthParameters;
import com.mypurecloud.sdk.v2.model.CampaignRuleDayOfWeekParameters;
import com.mypurecloud.sdk.v2.model.CampaignRuleSpecificDateParameters;
import com.mypurecloud.sdk.v2.model.CampaignRuleTimeOfDayParameters;
import com.mypurecloud.sdk.v2.model.CampaignRuleWeekDayOfMonthParameters;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * CampaignRuleDateTimeConditionParameters
 */

public class CampaignRuleDateTimeConditionParameters  implements Serializable {
  
  private Boolean inverted = null;
  private CampaignRuleTimeOfDayParameters timeOfDay = null;
  private CampaignRuleDayOfWeekParameters dayOfWeek = null;
  private CampaignRuleDayOfMonthParameters dayOfMonth = null;
  private CampaignRuleSpecificDateParameters specificDate = null;
  private CampaignRuleWeekDayOfMonthParameters weekDayOfMonth = null;

  public CampaignRuleDateTimeConditionParameters() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  public CampaignRuleDateTimeConditionParameters(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
    }
  }

  
  /**
   * If true, inverts the result of evaluating this sub-condition. Default is false
   **/
  public CampaignRuleDateTimeConditionParameters inverted(Boolean inverted) {
    this.inverted = inverted;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "If true, inverts the result of evaluating this sub-condition. Default is false")
  @JsonProperty("inverted")
  public Boolean getInverted() {
    return inverted;
  }
  public void setInverted(Boolean inverted) {
    this.inverted = inverted;
  }


  /**
   * Parameters for \"timeOfDay\" conditionType
   **/
  public CampaignRuleDateTimeConditionParameters timeOfDay(CampaignRuleTimeOfDayParameters timeOfDay) {
    this.timeOfDay = timeOfDay;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Parameters for \"timeOfDay\" conditionType")
  @JsonProperty("timeOfDay")
  public CampaignRuleTimeOfDayParameters getTimeOfDay() {
    return timeOfDay;
  }
  public void setTimeOfDay(CampaignRuleTimeOfDayParameters timeOfDay) {
    this.timeOfDay = timeOfDay;
  }


  /**
   * Parameters for \"dayOfWeek\" conditionType
   **/
  public CampaignRuleDateTimeConditionParameters dayOfWeek(CampaignRuleDayOfWeekParameters dayOfWeek) {
    this.dayOfWeek = dayOfWeek;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Parameters for \"dayOfWeek\" conditionType")
  @JsonProperty("dayOfWeek")
  public CampaignRuleDayOfWeekParameters getDayOfWeek() {
    return dayOfWeek;
  }
  public void setDayOfWeek(CampaignRuleDayOfWeekParameters dayOfWeek) {
    this.dayOfWeek = dayOfWeek;
  }


  /**
   * Parameters for \"dayOfMonth\" conditionType
   **/
  public CampaignRuleDateTimeConditionParameters dayOfMonth(CampaignRuleDayOfMonthParameters dayOfMonth) {
    this.dayOfMonth = dayOfMonth;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Parameters for \"dayOfMonth\" conditionType")
  @JsonProperty("dayOfMonth")
  public CampaignRuleDayOfMonthParameters getDayOfMonth() {
    return dayOfMonth;
  }
  public void setDayOfMonth(CampaignRuleDayOfMonthParameters dayOfMonth) {
    this.dayOfMonth = dayOfMonth;
  }


  /**
   * Parameters for \"specificDate\" conditionType
   **/
  public CampaignRuleDateTimeConditionParameters specificDate(CampaignRuleSpecificDateParameters specificDate) {
    this.specificDate = specificDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Parameters for \"specificDate\" conditionType")
  @JsonProperty("specificDate")
  public CampaignRuleSpecificDateParameters getSpecificDate() {
    return specificDate;
  }
  public void setSpecificDate(CampaignRuleSpecificDateParameters specificDate) {
    this.specificDate = specificDate;
  }


  /**
   * Parameters for \"weekDayOfMonth\" conditionType
   **/
  public CampaignRuleDateTimeConditionParameters weekDayOfMonth(CampaignRuleWeekDayOfMonthParameters weekDayOfMonth) {
    this.weekDayOfMonth = weekDayOfMonth;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Parameters for \"weekDayOfMonth\" conditionType")
  @JsonProperty("weekDayOfMonth")
  public CampaignRuleWeekDayOfMonthParameters getWeekDayOfMonth() {
    return weekDayOfMonth;
  }
  public void setWeekDayOfMonth(CampaignRuleWeekDayOfMonthParameters weekDayOfMonth) {
    this.weekDayOfMonth = weekDayOfMonth;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CampaignRuleDateTimeConditionParameters campaignRuleDateTimeConditionParameters = (CampaignRuleDateTimeConditionParameters) o;

    return Objects.equals(this.inverted, campaignRuleDateTimeConditionParameters.inverted) &&
            Objects.equals(this.timeOfDay, campaignRuleDateTimeConditionParameters.timeOfDay) &&
            Objects.equals(this.dayOfWeek, campaignRuleDateTimeConditionParameters.dayOfWeek) &&
            Objects.equals(this.dayOfMonth, campaignRuleDateTimeConditionParameters.dayOfMonth) &&
            Objects.equals(this.specificDate, campaignRuleDateTimeConditionParameters.specificDate) &&
            Objects.equals(this.weekDayOfMonth, campaignRuleDateTimeConditionParameters.weekDayOfMonth);
  }

  @Override
  public int hashCode() {
    return Objects.hash(inverted, timeOfDay, dayOfWeek, dayOfMonth, specificDate, weekDayOfMonth);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignRuleDateTimeConditionParameters {\n");
    
    sb.append("    inverted: ").append(toIndentedString(inverted)).append("\n");
    sb.append("    timeOfDay: ").append(toIndentedString(timeOfDay)).append("\n");
    sb.append("    dayOfWeek: ").append(toIndentedString(dayOfWeek)).append("\n");
    sb.append("    dayOfMonth: ").append(toIndentedString(dayOfMonth)).append("\n");
    sb.append("    specificDate: ").append(toIndentedString(specificDate)).append("\n");
    sb.append("    weekDayOfMonth: ").append(toIndentedString(weekDayOfMonth)).append("\n");
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

