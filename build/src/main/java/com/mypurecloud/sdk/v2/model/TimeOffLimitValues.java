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
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * TimeOffLimitValues
 */

public class TimeOffLimitValues  implements Serializable {
  
  private List<Integer> limitMinutes = null;
  private List<Integer> allocatedMinutes = null;
  private List<Integer> waitlistedMinutes = null;
  private List<Integer> waitlistedRequests = null;

  public TimeOffLimitValues() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      limitMinutes = new ArrayList<Integer>();
      allocatedMinutes = new ArrayList<Integer>();
      waitlistedMinutes = new ArrayList<Integer>();
      waitlistedRequests = new ArrayList<Integer>();
    }
  }

  public TimeOffLimitValues(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
      limitMinutes = new ArrayList<Integer>();
      allocatedMinutes = new ArrayList<Integer>();
      waitlistedMinutes = new ArrayList<Integer>();
      waitlistedRequests = new ArrayList<Integer>();
    }
  }

  
  /**
   * Time-off limit values in minutes per granularity interval
   **/
  public TimeOffLimitValues limitMinutes(List<Integer> limitMinutes) {
    this.limitMinutes = limitMinutes;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Time-off limit values in minutes per granularity interval")
  @JsonProperty("limitMinutes")
  public List<Integer> getLimitMinutes() {
    return limitMinutes;
  }
  public void setLimitMinutes(List<Integer> limitMinutes) {
    this.limitMinutes = limitMinutes;
  }


  /**
   * Allocated time-off minutes per granularity interval
   **/
  public TimeOffLimitValues allocatedMinutes(List<Integer> allocatedMinutes) {
    this.allocatedMinutes = allocatedMinutes;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Allocated time-off minutes per granularity interval")
  @JsonProperty("allocatedMinutes")
  public List<Integer> getAllocatedMinutes() {
    return allocatedMinutes;
  }
  public void setAllocatedMinutes(List<Integer> allocatedMinutes) {
    this.allocatedMinutes = allocatedMinutes;
  }


  /**
   * Waitlisted time-off minutes per granularity interval
   **/
  public TimeOffLimitValues waitlistedMinutes(List<Integer> waitlistedMinutes) {
    this.waitlistedMinutes = waitlistedMinutes;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Waitlisted time-off minutes per granularity interval")
  @JsonProperty("waitlistedMinutes")
  public List<Integer> getWaitlistedMinutes() {
    return waitlistedMinutes;
  }
  public void setWaitlistedMinutes(List<Integer> waitlistedMinutes) {
    this.waitlistedMinutes = waitlistedMinutes;
  }


  /**
   * The current number of waitlisted time-off requests per granularity interval
   **/
  public TimeOffLimitValues waitlistedRequests(List<Integer> waitlistedRequests) {
    this.waitlistedRequests = waitlistedRequests;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The current number of waitlisted time-off requests per granularity interval")
  @JsonProperty("waitlistedRequests")
  public List<Integer> getWaitlistedRequests() {
    return waitlistedRequests;
  }
  public void setWaitlistedRequests(List<Integer> waitlistedRequests) {
    this.waitlistedRequests = waitlistedRequests;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TimeOffLimitValues timeOffLimitValues = (TimeOffLimitValues) o;

    return Objects.equals(this.limitMinutes, timeOffLimitValues.limitMinutes) &&
            Objects.equals(this.allocatedMinutes, timeOffLimitValues.allocatedMinutes) &&
            Objects.equals(this.waitlistedMinutes, timeOffLimitValues.waitlistedMinutes) &&
            Objects.equals(this.waitlistedRequests, timeOffLimitValues.waitlistedRequests);
  }

  @Override
  public int hashCode() {
    return Objects.hash(limitMinutes, allocatedMinutes, waitlistedMinutes, waitlistedRequests);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TimeOffLimitValues {\n");
    
    sb.append("    limitMinutes: ").append(toIndentedString(limitMinutes)).append("\n");
    sb.append("    allocatedMinutes: ").append(toIndentedString(allocatedMinutes)).append("\n");
    sb.append("    waitlistedMinutes: ").append(toIndentedString(waitlistedMinutes)).append("\n");
    sb.append("    waitlistedRequests: ").append(toIndentedString(waitlistedRequests)).append("\n");
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

