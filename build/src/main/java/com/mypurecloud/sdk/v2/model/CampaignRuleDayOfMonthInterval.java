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
 * CampaignRuleDayOfMonthInterval
 */

public class CampaignRuleDayOfMonthInterval  implements Serializable {
  
  private String min = null;
  private String max = null;

  public CampaignRuleDayOfMonthInterval() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  public CampaignRuleDayOfMonthInterval(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
    }
  }

  
  /**
   * The minimal day of month (exact day: 1-31) for the \"between\" operator
   **/
  public CampaignRuleDayOfMonthInterval min(String min) {
    this.min = min;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The minimal day of month (exact day: 1-31) for the \"between\" operator")
  @JsonProperty("min")
  public String getMin() {
    return min;
  }
  public void setMin(String min) {
    this.min = min;
  }


  /**
   * The maximum value of month (exact day: 1-31 or \"LAST_DAY\") for the \"between\" operator
   **/
  public CampaignRuleDayOfMonthInterval max(String max) {
    this.max = max;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The maximum value of month (exact day: 1-31 or \"LAST_DAY\") for the \"between\" operator")
  @JsonProperty("max")
  public String getMax() {
    return max;
  }
  public void setMax(String max) {
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
    CampaignRuleDayOfMonthInterval campaignRuleDayOfMonthInterval = (CampaignRuleDayOfMonthInterval) o;

    return Objects.equals(this.min, campaignRuleDayOfMonthInterval.min) &&
            Objects.equals(this.max, campaignRuleDayOfMonthInterval.max);
  }

  @Override
  public int hashCode() {
    return Objects.hash(min, max);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignRuleDayOfMonthInterval {\n");
    
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

