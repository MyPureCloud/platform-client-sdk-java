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
import com.mypurecloud.sdk.v2.model.CampaignRuleDayOfMonthInterval;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * CampaignRuleDayOfMonthParameters
 */

public class CampaignRuleDayOfMonthParameters  implements Serializable {
  
  private String thresholdValue = null;
  private List<String> inSet = null;
  private CampaignRuleDayOfMonthInterval interval = null;

  public CampaignRuleDayOfMonthParameters() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      inSet = new ArrayList<String>();
    }
  }

  public CampaignRuleDayOfMonthParameters(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
      inSet = new ArrayList<String>();
    }
  }

  
  /**
   * The operand for the \"before\" and \"after\" operators, can be either exact day (1-31) or \"LAST_DAY\"
   **/
  public CampaignRuleDayOfMonthParameters thresholdValue(String thresholdValue) {
    this.thresholdValue = thresholdValue;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The operand for the \"before\" and \"after\" operators, can be either exact day (1-31) or \"LAST_DAY\"")
  @JsonProperty("thresholdValue")
  public String getThresholdValue() {
    return thresholdValue;
  }
  public void setThresholdValue(String thresholdValue) {
    this.thresholdValue = thresholdValue;
  }


  /**
   * The operand for the \"in\" operator, each element can be either exact day (1,31) or \"LAST_DAY\", \"EVEN_DAY\", \"ODD_DAY\"
   **/
  public CampaignRuleDayOfMonthParameters inSet(List<String> inSet) {
    this.inSet = inSet;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The operand for the \"in\" operator, each element can be either exact day (1,31) or \"LAST_DAY\", \"EVEN_DAY\", \"ODD_DAY\"")
  @JsonProperty("inSet")
  public List<String> getInSet() {
    return inSet;
  }
  public void setInSet(List<String> inSet) {
    this.inSet = inSet;
  }


  /**
   * The interval operand for the \"between\" operator
   **/
  public CampaignRuleDayOfMonthParameters interval(CampaignRuleDayOfMonthInterval interval) {
    this.interval = interval;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The interval operand for the \"between\" operator")
  @JsonProperty("interval")
  public CampaignRuleDayOfMonthInterval getInterval() {
    return interval;
  }
  public void setInterval(CampaignRuleDayOfMonthInterval interval) {
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
    CampaignRuleDayOfMonthParameters campaignRuleDayOfMonthParameters = (CampaignRuleDayOfMonthParameters) o;

    return Objects.equals(this.thresholdValue, campaignRuleDayOfMonthParameters.thresholdValue) &&
            Objects.equals(this.inSet, campaignRuleDayOfMonthParameters.inSet) &&
            Objects.equals(this.interval, campaignRuleDayOfMonthParameters.interval);
  }

  @Override
  public int hashCode() {
    return Objects.hash(thresholdValue, inSet, interval);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignRuleDayOfMonthParameters {\n");
    
    sb.append("    thresholdValue: ").append(toIndentedString(thresholdValue)).append("\n");
    sb.append("    inSet: ").append(toIndentedString(inSet)).append("\n");
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

