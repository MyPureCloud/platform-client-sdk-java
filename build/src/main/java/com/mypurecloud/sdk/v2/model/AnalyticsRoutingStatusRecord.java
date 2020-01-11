package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

import java.io.Serializable;
/**
 * AnalyticsRoutingStatusRecord
 */

public class AnalyticsRoutingStatusRecord  implements Serializable {
  
  private Date startTime = null;
  private Date endTime = null;

  /**
   * The user's ACD routing status
   */
  public enum RoutingStatusEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    OFF_QUEUE("OFF_QUEUE"),
    IDLE("IDLE"),
    INTERACTING("INTERACTING"),
    NOT_RESPONDING("NOT_RESPONDING"),
    COMMUNICATING("COMMUNICATING");

    private String value;

    RoutingStatusEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static RoutingStatusEnum fromString(String key) {
      if (key == null) return null;

      for (RoutingStatusEnum value : RoutingStatusEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return RoutingStatusEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private RoutingStatusEnum routingStatus = null;

  
  /**
   * The start time of the record. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ
   **/
  public AnalyticsRoutingStatusRecord startTime(Date startTime) {
    this.startTime = startTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The start time of the record. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ")
  @JsonProperty("startTime")
  public Date getStartTime() {
    return startTime;
  }
  public void setStartTime(Date startTime) {
    this.startTime = startTime;
  }

  
  /**
   * The end time of the record. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ
   **/
  public AnalyticsRoutingStatusRecord endTime(Date endTime) {
    this.endTime = endTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The end time of the record. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ")
  @JsonProperty("endTime")
  public Date getEndTime() {
    return endTime;
  }
  public void setEndTime(Date endTime) {
    this.endTime = endTime;
  }

  
  /**
   * The user's ACD routing status
   **/
  public AnalyticsRoutingStatusRecord routingStatus(RoutingStatusEnum routingStatus) {
    this.routingStatus = routingStatus;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The user's ACD routing status")
  @JsonProperty("routingStatus")
  public RoutingStatusEnum getRoutingStatus() {
    return routingStatus;
  }
  public void setRoutingStatus(RoutingStatusEnum routingStatus) {
    this.routingStatus = routingStatus;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AnalyticsRoutingStatusRecord analyticsRoutingStatusRecord = (AnalyticsRoutingStatusRecord) o;
    return Objects.equals(this.startTime, analyticsRoutingStatusRecord.startTime) &&
        Objects.equals(this.endTime, analyticsRoutingStatusRecord.endTime) &&
        Objects.equals(this.routingStatus, analyticsRoutingStatusRecord.routingStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(startTime, endTime, routingStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AnalyticsRoutingStatusRecord {\n");
    
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    routingStatus: ").append(toIndentedString(routingStatus)).append("\n");
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

