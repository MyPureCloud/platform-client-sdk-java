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
import com.mypurecloud.sdk.v2.model.BuAgentSchedulePublishedScheduleReference;
import com.mypurecloud.sdk.v2.model.BuAgentScheduleSearchResponse;
import com.mypurecloud.sdk.v2.model.BuAgentScheduleUpdate;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import java.io.Serializable;
/**
 * BuCurrentAgentScheduleSearchResponse
 */

public class BuCurrentAgentScheduleSearchResponse  implements Serializable {
  
  private List<BuAgentScheduleSearchResponse> agentSchedules = new ArrayList<BuAgentScheduleSearchResponse>();
  private String businessUnitTimeZone = null;
  private List<BuAgentSchedulePublishedScheduleReference> publishedSchedules = new ArrayList<BuAgentSchedulePublishedScheduleReference>();
  private Date startDate = null;
  private Date endDate = null;
  private List<BuAgentScheduleUpdate> updates = new ArrayList<BuAgentScheduleUpdate>();

  
  /**
   * The requested agent schedules
   **/
  public BuCurrentAgentScheduleSearchResponse agentSchedules(List<BuAgentScheduleSearchResponse> agentSchedules) {
    this.agentSchedules = agentSchedules;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The requested agent schedules")
  @JsonProperty("agentSchedules")
  public List<BuAgentScheduleSearchResponse> getAgentSchedules() {
    return agentSchedules;
  }
  public void setAgentSchedules(List<BuAgentScheduleSearchResponse> agentSchedules) {
    this.agentSchedules = agentSchedules;
  }

  
  /**
   * The time zone configured for the business unit to which this schedule applies
   **/
  public BuCurrentAgentScheduleSearchResponse businessUnitTimeZone(String businessUnitTimeZone) {
    this.businessUnitTimeZone = businessUnitTimeZone;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The time zone configured for the business unit to which this schedule applies")
  @JsonProperty("businessUnitTimeZone")
  public String getBusinessUnitTimeZone() {
    return businessUnitTimeZone;
  }
  public void setBusinessUnitTimeZone(String businessUnitTimeZone) {
    this.businessUnitTimeZone = businessUnitTimeZone;
  }

  
  /**
   * References to all published week schedules overlapping the start/end date query parameters
   **/
  public BuCurrentAgentScheduleSearchResponse publishedSchedules(List<BuAgentSchedulePublishedScheduleReference> publishedSchedules) {
    this.publishedSchedules = publishedSchedules;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "References to all published week schedules overlapping the start/end date query parameters")
  @JsonProperty("publishedSchedules")
  public List<BuAgentSchedulePublishedScheduleReference> getPublishedSchedules() {
    return publishedSchedules;
  }
  public void setPublishedSchedules(List<BuAgentSchedulePublishedScheduleReference> publishedSchedules) {
    this.publishedSchedules = publishedSchedules;
  }

  
  /**
   * The start date of the schedules. Only populated on notifications. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public BuCurrentAgentScheduleSearchResponse startDate(Date startDate) {
    this.startDate = startDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The start date of the schedules. Only populated on notifications. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("startDate")
  public Date getStartDate() {
    return startDate;
  }
  public void setStartDate(Date startDate) {
    this.startDate = startDate;
  }

  
  /**
   * The end date of the schedules. Only populated on notifications. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public BuCurrentAgentScheduleSearchResponse endDate(Date endDate) {
    this.endDate = endDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The end date of the schedules. Only populated on notifications. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("endDate")
  public Date getEndDate() {
    return endDate;
  }
  public void setEndDate(Date endDate) {
    this.endDate = endDate;
  }

  
  /**
   * The list of updates for the schedule. Only used in notifications
   **/
  public BuCurrentAgentScheduleSearchResponse updates(List<BuAgentScheduleUpdate> updates) {
    this.updates = updates;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The list of updates for the schedule. Only used in notifications")
  @JsonProperty("updates")
  public List<BuAgentScheduleUpdate> getUpdates() {
    return updates;
  }
  public void setUpdates(List<BuAgentScheduleUpdate> updates) {
    this.updates = updates;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BuCurrentAgentScheduleSearchResponse buCurrentAgentScheduleSearchResponse = (BuCurrentAgentScheduleSearchResponse) o;
    return Objects.equals(this.agentSchedules, buCurrentAgentScheduleSearchResponse.agentSchedules) &&
        Objects.equals(this.businessUnitTimeZone, buCurrentAgentScheduleSearchResponse.businessUnitTimeZone) &&
        Objects.equals(this.publishedSchedules, buCurrentAgentScheduleSearchResponse.publishedSchedules) &&
        Objects.equals(this.startDate, buCurrentAgentScheduleSearchResponse.startDate) &&
        Objects.equals(this.endDate, buCurrentAgentScheduleSearchResponse.endDate) &&
        Objects.equals(this.updates, buCurrentAgentScheduleSearchResponse.updates);
  }

  @Override
  public int hashCode() {
    return Objects.hash(agentSchedules, businessUnitTimeZone, publishedSchedules, startDate, endDate, updates);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BuCurrentAgentScheduleSearchResponse {\n");
    
    sb.append("    agentSchedules: ").append(toIndentedString(agentSchedules)).append("\n");
    sb.append("    businessUnitTimeZone: ").append(toIndentedString(businessUnitTimeZone)).append("\n");
    sb.append("    publishedSchedules: ").append(toIndentedString(publishedSchedules)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    updates: ").append(toIndentedString(updates)).append("\n");
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

