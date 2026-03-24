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
 * CampaignRuleTimeOfDayInterval
 */

public class CampaignRuleTimeOfDayInterval  implements Serializable {
  
  private String min = null;
  private String max = null;

  public CampaignRuleTimeOfDayInterval() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * Time is represented as an ISO-8601 string without a timezone. For example: HH:mm:ss.SSS
   **/
  public CampaignRuleTimeOfDayInterval min(String min) {
    this.min = min;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Time is represented as an ISO-8601 string without a timezone. For example: HH:mm:ss.SSS")
  @JsonProperty("min")
  public String getMin() {
    return min;
  }
  public void setMin(String min) {
    this.min = min;
  }


  /**
   * Time is represented as an ISO-8601 string without a timezone. For example: HH:mm:ss.SSS
   **/
  public CampaignRuleTimeOfDayInterval max(String max) {
    this.max = max;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Time is represented as an ISO-8601 string without a timezone. For example: HH:mm:ss.SSS")
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
    CampaignRuleTimeOfDayInterval campaignRuleTimeOfDayInterval = (CampaignRuleTimeOfDayInterval) o;

    return Objects.equals(this.min, campaignRuleTimeOfDayInterval.min) &&
            Objects.equals(this.max, campaignRuleTimeOfDayInterval.max);
  }

  @Override
  public int hashCode() {
    return Objects.hash(min, max);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignRuleTimeOfDayInterval {\n");
    
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

