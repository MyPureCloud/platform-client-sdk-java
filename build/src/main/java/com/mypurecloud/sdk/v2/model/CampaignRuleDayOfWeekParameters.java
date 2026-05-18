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
import com.mypurecloud.sdk.v2.model.CampaignRuleDayOfWeekInterval;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * CampaignRuleDayOfWeekParameters
 */

public class CampaignRuleDayOfWeekParameters  implements Serializable {
  
  private List<Integer> inSet = null;
  private CampaignRuleDayOfWeekInterval interval = null;

  public CampaignRuleDayOfWeekParameters() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      inSet = new ArrayList<Integer>();
    }
  }

  public CampaignRuleDayOfWeekParameters(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
      inSet = new ArrayList<Integer>();
    }
  }

  
  /**
   * The operand for the \"in\" operator, each value in 1-7 (Monday-Sunday) format
   **/
  public CampaignRuleDayOfWeekParameters inSet(List<Integer> inSet) {
    this.inSet = inSet;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The operand for the \"in\" operator, each value in 1-7 (Monday-Sunday) format")
  @JsonProperty("inSet")
  public List<Integer> getInSet() {
    return inSet;
  }
  public void setInSet(List<Integer> inSet) {
    this.inSet = inSet;
  }


  /**
   * The operand for the \"between\" operator
   **/
  public CampaignRuleDayOfWeekParameters interval(CampaignRuleDayOfWeekInterval interval) {
    this.interval = interval;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The operand for the \"between\" operator")
  @JsonProperty("interval")
  public CampaignRuleDayOfWeekInterval getInterval() {
    return interval;
  }
  public void setInterval(CampaignRuleDayOfWeekInterval interval) {
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
    CampaignRuleDayOfWeekParameters campaignRuleDayOfWeekParameters = (CampaignRuleDayOfWeekParameters) o;

    return Objects.equals(this.inSet, campaignRuleDayOfWeekParameters.inSet) &&
            Objects.equals(this.interval, campaignRuleDayOfWeekParameters.interval);
  }

  @Override
  public int hashCode() {
    return Objects.hash(inSet, interval);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignRuleDayOfWeekParameters {\n");
    
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

