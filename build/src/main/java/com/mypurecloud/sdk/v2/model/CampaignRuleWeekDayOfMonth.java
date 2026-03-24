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
 * CampaignRuleWeekDayOfMonth
 */

public class CampaignRuleWeekDayOfMonth  implements Serializable {
  
  private Integer dayOfWeek = null;
  private Integer month = null;
  private Integer occurrence = null;

  public CampaignRuleWeekDayOfMonth() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * Day of week (1-7)
   **/
  public CampaignRuleWeekDayOfMonth dayOfWeek(Integer dayOfWeek) {
    this.dayOfWeek = dayOfWeek;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Day of week (1-7)")
  @JsonProperty("dayOfWeek")
  public Integer getDayOfWeek() {
    return dayOfWeek;
  }
  public void setDayOfWeek(Integer dayOfWeek) {
    this.dayOfWeek = dayOfWeek;
  }


  /**
   * Month (1-12)
   **/
  public CampaignRuleWeekDayOfMonth month(Integer month) {
    this.month = month;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Month (1-12)")
  @JsonProperty("month")
  public Integer getMonth() {
    return month;
  }
  public void setMonth(Integer month) {
    this.month = month;
  }


  /**
   * Occurrence 1-4, -1 (last)
   **/
  public CampaignRuleWeekDayOfMonth occurrence(Integer occurrence) {
    this.occurrence = occurrence;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Occurrence 1-4, -1 (last)")
  @JsonProperty("occurrence")
  public Integer getOccurrence() {
    return occurrence;
  }
  public void setOccurrence(Integer occurrence) {
    this.occurrence = occurrence;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CampaignRuleWeekDayOfMonth campaignRuleWeekDayOfMonth = (CampaignRuleWeekDayOfMonth) o;

    return Objects.equals(this.dayOfWeek, campaignRuleWeekDayOfMonth.dayOfWeek) &&
            Objects.equals(this.month, campaignRuleWeekDayOfMonth.month) &&
            Objects.equals(this.occurrence, campaignRuleWeekDayOfMonth.occurrence);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dayOfWeek, month, occurrence);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignRuleWeekDayOfMonth {\n");
    
    sb.append("    dayOfWeek: ").append(toIndentedString(dayOfWeek)).append("\n");
    sb.append("    month: ").append(toIndentedString(month)).append("\n");
    sb.append("    occurrence: ").append(toIndentedString(occurrence)).append("\n");
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

