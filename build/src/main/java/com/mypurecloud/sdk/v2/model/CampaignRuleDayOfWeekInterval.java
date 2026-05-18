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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * CampaignRuleDayOfWeekInterval
 */

public class CampaignRuleDayOfWeekInterval  implements Serializable {
  
  private Integer min = null;
  private Integer max = null;

  public CampaignRuleDayOfWeekInterval() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  public CampaignRuleDayOfWeekInterval(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
    }
  }

  
  /**
   * The minimum value of the interval in 1-7 (Monday-Sunday). Required for the \"between\" operator
   **/
  public CampaignRuleDayOfWeekInterval min(Integer min) {
    this.min = min;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The minimum value of the interval in 1-7 (Monday-Sunday). Required for the \"between\" operator")
  @JsonProperty("min")
  public Integer getMin() {
    return min;
  }
  public void setMin(Integer min) {
    this.min = min;
  }


  /**
   * The maximum value of the interval in 1-7 (Monday-Sunday). Required for the \"between\" operator
   **/
  public CampaignRuleDayOfWeekInterval max(Integer max) {
    this.max = max;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The maximum value of the interval in 1-7 (Monday-Sunday). Required for the \"between\" operator")
  @JsonProperty("max")
  public Integer getMax() {
    return max;
  }
  public void setMax(Integer max) {
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
    CampaignRuleDayOfWeekInterval campaignRuleDayOfWeekInterval = (CampaignRuleDayOfWeekInterval) o;

    return Objects.equals(this.min, campaignRuleDayOfWeekInterval.min) &&
            Objects.equals(this.max, campaignRuleDayOfWeekInterval.max);
  }

  @Override
  public int hashCode() {
    return Objects.hash(min, max);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignRuleDayOfWeekInterval {\n");
    
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

