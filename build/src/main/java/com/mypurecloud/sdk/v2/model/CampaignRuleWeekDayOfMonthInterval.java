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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * CampaignRuleWeekDayOfMonthInterval
 */

public class CampaignRuleWeekDayOfMonthInterval  implements Serializable {
  
  private CampaignRuleWeekDayOfMonth min = null;
  private CampaignRuleWeekDayOfMonth max = null;

  public CampaignRuleWeekDayOfMonthInterval() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  public CampaignRuleWeekDayOfMonthInterval(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
    }
  }

  
  /**
   * The minimum value of the interval. Required for the \"between\" operator
   **/
  public CampaignRuleWeekDayOfMonthInterval min(CampaignRuleWeekDayOfMonth min) {
    this.min = min;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The minimum value of the interval. Required for the \"between\" operator")
  @JsonProperty("min")
  public CampaignRuleWeekDayOfMonth getMin() {
    return min;
  }
  public void setMin(CampaignRuleWeekDayOfMonth min) {
    this.min = min;
  }


  /**
   * The maximum value of the interval. Required for the \"between\" operator
   **/
  public CampaignRuleWeekDayOfMonthInterval max(CampaignRuleWeekDayOfMonth max) {
    this.max = max;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The maximum value of the interval. Required for the \"between\" operator")
  @JsonProperty("max")
  public CampaignRuleWeekDayOfMonth getMax() {
    return max;
  }
  public void setMax(CampaignRuleWeekDayOfMonth max) {
    this.max = max;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CampaignRuleWeekDayOfMonthInterval campaignRuleWeekDayOfMonthInterval = (CampaignRuleWeekDayOfMonthInterval) o;

    return Objects.equals(this.min, campaignRuleWeekDayOfMonthInterval.min) &&
            Objects.equals(this.max, campaignRuleWeekDayOfMonthInterval.max);
  }

  @Override
  public int hashCode() {
    return Objects.hash(min, max);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignRuleWeekDayOfMonthInterval {\n");
    
    sb.append("    min: ").append(toIndentedString(min)).append("\n");
    sb.append("    max: ").append(toIndentedString(max)).append("\n");
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

