package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import java.util.Objects;
import java.io.IOException;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.mypurecloud.sdk.v2.model.TimeOffLimitReference;
import com.mypurecloud.sdk.v2.model.TimeOffRequestReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.LocalDate;

import java.io.Serializable;
/**
 * WaitlistPosition
 */

public class WaitlistPosition  implements Serializable {
  
  private TimeOffRequestReference timeOffRequest = null;
  private TimeOffLimitReference timeOffLimit = null;
  private LocalDate date = null;
  private Integer waitlistPosition = null;

  
  /**
   * The time off request for this wait list position
   **/
  public WaitlistPosition timeOffRequest(TimeOffRequestReference timeOffRequest) {
    this.timeOffRequest = timeOffRequest;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The time off request for this wait list position")
  @JsonProperty("timeOffRequest")
  public TimeOffRequestReference getTimeOffRequest() {
    return timeOffRequest;
  }
  public void setTimeOffRequest(TimeOffRequestReference timeOffRequest) {
    this.timeOffRequest = timeOffRequest;
  }

  
  /**
   * The time off limit for which time off request is waitlisted
   **/
  public WaitlistPosition timeOffLimit(TimeOffLimitReference timeOffLimit) {
    this.timeOffLimit = timeOffLimit;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The time off limit for which time off request is waitlisted")
  @JsonProperty("timeOffLimit")
  public TimeOffLimitReference getTimeOffLimit() {
    return timeOffLimit;
  }
  public void setTimeOffLimit(TimeOffLimitReference timeOffLimit) {
    this.timeOffLimit = timeOffLimit;
  }

  
  /**
   * The date to which this wait list position applies, as defined by the time zone of the business unit. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd
   **/
  public WaitlistPosition date(LocalDate date) {
    this.date = date;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The date to which this wait list position applies, as defined by the time zone of the business unit. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd")
  @JsonProperty("date")
  public LocalDate getDate() {
    return date;
  }
  public void setDate(LocalDate date) {
    this.date = date;
  }

  
  /**
   * The time off request's position in the waitlist on the date. 1 means time off is the first in the waitlist
   **/
  public WaitlistPosition waitlistPosition(Integer waitlistPosition) {
    this.waitlistPosition = waitlistPosition;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The time off request's position in the waitlist on the date. 1 means time off is the first in the waitlist")
  @JsonProperty("waitlistPosition")
  public Integer getWaitlistPosition() {
    return waitlistPosition;
  }
  public void setWaitlistPosition(Integer waitlistPosition) {
    this.waitlistPosition = waitlistPosition;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WaitlistPosition waitlistPosition = (WaitlistPosition) o;
    return Objects.equals(this.timeOffRequest, waitlistPosition.timeOffRequest) &&
        Objects.equals(this.timeOffLimit, waitlistPosition.timeOffLimit) &&
        Objects.equals(this.date, waitlistPosition.date) &&
        Objects.equals(this.waitlistPosition, waitlistPosition.waitlistPosition);
  }

  @Override
  public int hashCode() {
    return Objects.hash(timeOffRequest, timeOffLimit, date, waitlistPosition);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WaitlistPosition {\n");
    
    sb.append("    timeOffRequest: ").append(toIndentedString(timeOffRequest)).append("\n");
    sb.append("    timeOffLimit: ").append(toIndentedString(timeOffLimit)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    waitlistPosition: ").append(toIndentedString(waitlistPosition)).append("\n");
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

