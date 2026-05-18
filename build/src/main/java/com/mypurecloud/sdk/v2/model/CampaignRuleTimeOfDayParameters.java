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
import com.mypurecloud.sdk.v2.model.CampaignRuleTimeOfDayInterval;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * CampaignRuleTimeOfDayParameters
 */

public class CampaignRuleTimeOfDayParameters  implements Serializable {
  
  private CampaignRuleTimeOfDayInterval interval = null;
  private String thresholdValue = null;

  public CampaignRuleTimeOfDayParameters() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  public CampaignRuleTimeOfDayParameters(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
    }
  }

  
  /**
   * The operand for the \"between\" operator
   **/
  public CampaignRuleTimeOfDayParameters interval(CampaignRuleTimeOfDayInterval interval) {
    this.interval = interval;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The operand for the \"between\" operator")
  @JsonProperty("interval")
  public CampaignRuleTimeOfDayInterval getInterval() {
    return interval;
  }
  public void setInterval(CampaignRuleTimeOfDayInterval interval) {
    this.interval = interval;
  }


  /**
   * Time is represented as an ISO-8601 string without a timezone. For example: HH:mm:ss.SSS
   **/
  public CampaignRuleTimeOfDayParameters thresholdValue(String thresholdValue) {
    this.thresholdValue = thresholdValue;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Time is represented as an ISO-8601 string without a timezone. For example: HH:mm:ss.SSS")
  @JsonProperty("thresholdValue")
  public String getThresholdValue() {
    return thresholdValue;
  }
  public void setThresholdValue(String thresholdValue) {
    this.thresholdValue = thresholdValue;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CampaignRuleTimeOfDayParameters campaignRuleTimeOfDayParameters = (CampaignRuleTimeOfDayParameters) o;

    return Objects.equals(this.interval, campaignRuleTimeOfDayParameters.interval) &&
            Objects.equals(this.thresholdValue, campaignRuleTimeOfDayParameters.thresholdValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(interval, thresholdValue);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignRuleTimeOfDayParameters {\n");
    
    sb.append("    interval: ").append(toIndentedString(interval)).append("\n");
    sb.append("    thresholdValue: ").append(toIndentedString(thresholdValue)).append("\n");
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

