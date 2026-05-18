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
import com.mypurecloud.sdk.v2.model.CampaignRuleWeekDayOfMonth;
import com.mypurecloud.sdk.v2.model.CampaignRuleWeekDayOfMonthInterval;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * CampaignRuleWeekDayOfMonthParameters
 */

public class CampaignRuleWeekDayOfMonthParameters  implements Serializable {
  
  private CampaignRuleWeekDayOfMonth thresholdValue = null;
  private CampaignRuleWeekDayOfMonthInterval interval = null;

  public CampaignRuleWeekDayOfMonthParameters() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  public CampaignRuleWeekDayOfMonthParameters(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
    }
  }

  
  /**
   * The operand for the \"equals\", \"before\" and \"after\" operators
   **/
  public CampaignRuleWeekDayOfMonthParameters thresholdValue(CampaignRuleWeekDayOfMonth thresholdValue) {
    this.thresholdValue = thresholdValue;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The operand for the \"equals\", \"before\" and \"after\" operators")
  @JsonProperty("thresholdValue")
  public CampaignRuleWeekDayOfMonth getThresholdValue() {
    return thresholdValue;
  }
  public void setThresholdValue(CampaignRuleWeekDayOfMonth thresholdValue) {
    this.thresholdValue = thresholdValue;
  }


  /**
   * The operand for the \"between\" operator
   **/
  public CampaignRuleWeekDayOfMonthParameters interval(CampaignRuleWeekDayOfMonthInterval interval) {
    this.interval = interval;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The operand for the \"between\" operator")
  @JsonProperty("interval")
  public CampaignRuleWeekDayOfMonthInterval getInterval() {
    return interval;
  }
  public void setInterval(CampaignRuleWeekDayOfMonthInterval interval) {
    this.interval = interval;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CampaignRuleWeekDayOfMonthParameters campaignRuleWeekDayOfMonthParameters = (CampaignRuleWeekDayOfMonthParameters) o;

    return Objects.equals(this.thresholdValue, campaignRuleWeekDayOfMonthParameters.thresholdValue) &&
            Objects.equals(this.interval, campaignRuleWeekDayOfMonthParameters.interval);
  }

  @Override
  public int hashCode() {
    return Objects.hash(thresholdValue, interval);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignRuleWeekDayOfMonthParameters {\n");
    
    sb.append("    thresholdValue: ").append(toIndentedString(thresholdValue)).append("\n");
    sb.append("    interval: ").append(toIndentedString(interval)).append("\n");
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

