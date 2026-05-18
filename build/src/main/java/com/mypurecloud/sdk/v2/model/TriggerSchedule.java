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
 * Schedule configuration for a scheduled trigger
 */
@ApiModel(description = "Schedule configuration for a scheduled trigger")

public class TriggerSchedule  implements Serializable {
  
  private String minutes = null;
  private String hours = null;
  private String daysOfMonth = null;
  private String months = null;
  private String daysOfWeek = null;
  private String timezone = null;

  public TriggerSchedule() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  public TriggerSchedule(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
    }
  }

  
  /**
   * Minutes on which the trigger should fire. Coma separated list of up to 2 values 0-59
   **/
  public TriggerSchedule minutes(String minutes) {
    this.minutes = minutes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Minutes on which the trigger should fire. Coma separated list of up to 2 values 0-59")
  @JsonProperty("minutes")
  public String getMinutes() {
    return minutes;
  }
  public void setMinutes(String minutes) {
    this.minutes = minutes;
  }


  /**
   * Hours on which the trigger should fire. 0-23 or '*' for every hour.
   **/
  public TriggerSchedule hours(String hours) {
    this.hours = hours;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Hours on which the trigger should fire. 0-23 or '*' for every hour.")
  @JsonProperty("hours")
  public String getHours() {
    return hours;
  }
  public void setHours(String hours) {
    this.hours = hours;
  }


  /**
   * Days of month on which the trigger should fire. 1-31 or '*' for every or '?' for any
   **/
  public TriggerSchedule daysOfMonth(String daysOfMonth) {
    this.daysOfMonth = daysOfMonth;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Days of month on which the trigger should fire. 1-31 or '*' for every or '?' for any")
  @JsonProperty("daysOfMonth")
  public String getDaysOfMonth() {
    return daysOfMonth;
  }
  public void setDaysOfMonth(String daysOfMonth) {
    this.daysOfMonth = daysOfMonth;
  }


  /**
   * Months on which the trigger should fire. 1-12 or '*' for every
   **/
  public TriggerSchedule months(String months) {
    this.months = months;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Months on which the trigger should fire. 1-12 or '*' for every")
  @JsonProperty("months")
  public String getMonths() {
    return months;
  }
  public void setMonths(String months) {
    this.months = months;
  }


  /**
   * Days of week on which the trigger should fire. 1-7 or '*' for every or '?' for any
   **/
  public TriggerSchedule daysOfWeek(String daysOfWeek) {
    this.daysOfWeek = daysOfWeek;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Days of week on which the trigger should fire. 1-7 or '*' for every or '?' for any")
  @JsonProperty("daysOfWeek")
  public String getDaysOfWeek() {
    return daysOfWeek;
  }
  public void setDaysOfWeek(String daysOfWeek) {
    this.daysOfWeek = daysOfWeek;
  }


  /**
   * Timezone for the trigger schedule
   **/
  public TriggerSchedule timezone(String timezone) {
    this.timezone = timezone;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Timezone for the trigger schedule")
  @JsonProperty("timezone")
  public String getTimezone() {
    return timezone;
  }
  public void setTimezone(String timezone) {
    this.timezone = timezone;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TriggerSchedule triggerSchedule = (TriggerSchedule) o;

    return Objects.equals(this.minutes, triggerSchedule.minutes) &&
            Objects.equals(this.hours, triggerSchedule.hours) &&
            Objects.equals(this.daysOfMonth, triggerSchedule.daysOfMonth) &&
            Objects.equals(this.months, triggerSchedule.months) &&
            Objects.equals(this.daysOfWeek, triggerSchedule.daysOfWeek) &&
            Objects.equals(this.timezone, triggerSchedule.timezone);
  }

  @Override
  public int hashCode() {
    return Objects.hash(minutes, hours, daysOfMonth, months, daysOfWeek, timezone);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TriggerSchedule {\n");
    
    sb.append("    minutes: ").append(toIndentedString(minutes)).append("\n");
    sb.append("    hours: ").append(toIndentedString(hours)).append("\n");
    sb.append("    daysOfMonth: ").append(toIndentedString(daysOfMonth)).append("\n");
    sb.append("    months: ").append(toIndentedString(months)).append("\n");
    sb.append("    daysOfWeek: ").append(toIndentedString(daysOfWeek)).append("\n");
    sb.append("    timezone: ").append(toIndentedString(timezone)).append("\n");
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

