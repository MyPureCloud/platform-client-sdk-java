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
import java.util.Date;

import java.io.Serializable;
/**
 * EstimateAvailablePartialDayTimeOffResponse
 */

public class EstimateAvailablePartialDayTimeOffResponse  implements Serializable {
  
  private Date date = null;
  private Integer durationMinutes = null;
  private Integer payableMinutes = null;
  private Boolean flexible = null;

  public EstimateAvailablePartialDayTimeOffResponse() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * Start date-time in ISO-8601 format for partial day request
   **/
  public EstimateAvailablePartialDayTimeOffResponse date(Date date) {
    this.date = date;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Start date-time in ISO-8601 format for partial day request")
  @JsonProperty("date")
  public Date getDate() {
    return date;
  }
  public void setDate(Date date) {
    this.date = date;
  }


  /**
   * An estimation of time off request length in minutes
   **/
  public EstimateAvailablePartialDayTimeOffResponse durationMinutes(Integer durationMinutes) {
    this.durationMinutes = durationMinutes;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "An estimation of time off request length in minutes")
  @JsonProperty("durationMinutes")
  public Integer getDurationMinutes() {
    return durationMinutes;
  }
  public void setDurationMinutes(Integer durationMinutes) {
    this.durationMinutes = durationMinutes;
  }


  /**
   * An estimation of payable part of time off request in minutes
   **/
  public EstimateAvailablePartialDayTimeOffResponse payableMinutes(Integer payableMinutes) {
    this.payableMinutes = payableMinutes;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "An estimation of payable part of time off request in minutes")
  @JsonProperty("payableMinutes")
  public Integer getPayableMinutes() {
    return payableMinutes;
  }
  public void setPayableMinutes(Integer payableMinutes) {
    this.payableMinutes = payableMinutes;
  }


  /**
   * Whether there is flexibility for a user to choose different hours than the system estimated
   **/
  public EstimateAvailablePartialDayTimeOffResponse flexible(Boolean flexible) {
    this.flexible = flexible;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Whether there is flexibility for a user to choose different hours than the system estimated")
  @JsonProperty("flexible")
  public Boolean getFlexible() {
    return flexible;
  }
  public void setFlexible(Boolean flexible) {
    this.flexible = flexible;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EstimateAvailablePartialDayTimeOffResponse estimateAvailablePartialDayTimeOffResponse = (EstimateAvailablePartialDayTimeOffResponse) o;

    return Objects.equals(this.date, estimateAvailablePartialDayTimeOffResponse.date) &&
            Objects.equals(this.durationMinutes, estimateAvailablePartialDayTimeOffResponse.durationMinutes) &&
            Objects.equals(this.payableMinutes, estimateAvailablePartialDayTimeOffResponse.payableMinutes) &&
            Objects.equals(this.flexible, estimateAvailablePartialDayTimeOffResponse.flexible);
  }

  @Override
  public int hashCode() {
    return Objects.hash(date, durationMinutes, payableMinutes, flexible);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EstimateAvailablePartialDayTimeOffResponse {\n");
    
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    durationMinutes: ").append(toIndentedString(durationMinutes)).append("\n");
    sb.append("    payableMinutes: ").append(toIndentedString(payableMinutes)).append("\n");
    sb.append("    flexible: ").append(toIndentedString(flexible)).append("\n");
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

