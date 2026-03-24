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
import com.mypurecloud.sdk.v2.model.CampaignRuleSpecificDateInterval;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * CampaignRuleSpecificDateParameters
 */

public class CampaignRuleSpecificDateParameters  implements Serializable {
  
  private Boolean includeYear = null;
  private String thresholdValue = null;
  private CampaignRuleSpecificDateInterval interval = null;

  public CampaignRuleSpecificDateParameters() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * If true, includes year in date comparison for specificDate type. When false, only month and day are compared. Default is true. 
   **/
  public CampaignRuleSpecificDateParameters includeYear(Boolean includeYear) {
    this.includeYear = includeYear;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "If true, includes year in date comparison for specificDate type. When false, only month and day are compared. Default is true. ")
  @JsonProperty("includeYear")
  public Boolean getIncludeYear() {
    return includeYear;
  }
  public void setIncludeYear(Boolean includeYear) {
    this.includeYear = includeYear;
  }


  /**
   * The operand for the \"equals\", \"after\" and \"before\" operators in yyyy-MM-dd (if includeYear=true) or MM-dd (if includeYear=false) format.
   **/
  public CampaignRuleSpecificDateParameters thresholdValue(String thresholdValue) {
    this.thresholdValue = thresholdValue;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The operand for the \"equals\", \"after\" and \"before\" operators in yyyy-MM-dd (if includeYear=true) or MM-dd (if includeYear=false) format.")
  @JsonProperty("thresholdValue")
  public String getThresholdValue() {
    return thresholdValue;
  }
  public void setThresholdValue(String thresholdValue) {
    this.thresholdValue = thresholdValue;
  }


  /**
   * The operand for the \"between\" operator
   **/
  public CampaignRuleSpecificDateParameters interval(CampaignRuleSpecificDateInterval interval) {
    this.interval = interval;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The operand for the \"between\" operator")
  @JsonProperty("interval")
  public CampaignRuleSpecificDateInterval getInterval() {
    return interval;
  }
  public void setInterval(CampaignRuleSpecificDateInterval interval) {
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
    CampaignRuleSpecificDateParameters campaignRuleSpecificDateParameters = (CampaignRuleSpecificDateParameters) o;

    return Objects.equals(this.includeYear, campaignRuleSpecificDateParameters.includeYear) &&
            Objects.equals(this.thresholdValue, campaignRuleSpecificDateParameters.thresholdValue) &&
            Objects.equals(this.interval, campaignRuleSpecificDateParameters.interval);
  }

  @Override
  public int hashCode() {
    return Objects.hash(includeYear, thresholdValue, interval);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignRuleSpecificDateParameters {\n");
    
    sb.append("    includeYear: ").append(toIndentedString(includeYear)).append("\n");
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

