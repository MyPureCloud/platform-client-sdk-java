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
import java.util.List;

import java.io.Serializable;
/**
 * WfmHistoricalAdherenceQuery
 */

public class WfmHistoricalAdherenceQuery  implements Serializable {
  
  private Date startDate = null;
  private Date endDate = null;
  private String timeZone = null;
  private List<String> userIds = null;
  private Boolean includeExceptions = null;
  private List<String> teamIds = null;

  public WfmHistoricalAdherenceQuery() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      userIds = new ArrayList<String>();
      teamIds = new ArrayList<String>();
    }
  }

  
  /**
   * Beginning of the date range to query in ISO-8601 format
   **/
  public WfmHistoricalAdherenceQuery startDate(Date startDate) {
    this.startDate = startDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Beginning of the date range to query in ISO-8601 format")
  @JsonProperty("startDate")
  public Date getStartDate() {
    return startDate;
  }
  public void setStartDate(Date startDate) {
    this.startDate = startDate;
  }


  /**
   * End of the date range to query in ISO-8601 format. If it is not set, end date will be set to current time
   **/
  public WfmHistoricalAdherenceQuery endDate(Date endDate) {
    this.endDate = endDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "End of the date range to query in ISO-8601 format. If it is not set, end date will be set to current time")
  @JsonProperty("endDate")
  public Date getEndDate() {
    return endDate;
  }
  public void setEndDate(Date endDate) {
    this.endDate = endDate;
  }


  /**
   * The time zone, in olson format, to use in defining days when computing adherence. The results will be returned as UTC timestamps regardless of the time zone input.
   **/
  public WfmHistoricalAdherenceQuery timeZone(String timeZone) {
    this.timeZone = timeZone;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The time zone, in olson format, to use in defining days when computing adherence. The results will be returned as UTC timestamps regardless of the time zone input.")
  @JsonProperty("timeZone")
  public String getTimeZone() {
    return timeZone;
  }
  public void setTimeZone(String timeZone) {
    this.timeZone = timeZone;
  }


  /**
   * The userIds to report on. If null or not set, adherence will be computed for all the users in management unit or requested teamIds
   **/
  public WfmHistoricalAdherenceQuery userIds(List<String> userIds) {
    this.userIds = userIds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The userIds to report on. If null or not set, adherence will be computed for all the users in management unit or requested teamIds")
  @JsonProperty("userIds")
  public List<String> getUserIds() {
    return userIds;
  }
  public void setUserIds(List<String> userIds) {
    this.userIds = userIds;
  }


  /**
   * Whether user exceptions should be returned as part of the results
   **/
  public WfmHistoricalAdherenceQuery includeExceptions(Boolean includeExceptions) {
    this.includeExceptions = includeExceptions;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Whether user exceptions should be returned as part of the results")
  @JsonProperty("includeExceptions")
  public Boolean getIncludeExceptions() {
    return includeExceptions;
  }
  public void setIncludeExceptions(Boolean includeExceptions) {
    this.includeExceptions = includeExceptions;
  }


  /**
   * The teamIds to report on. If null or not set, adherence will be computed for requested users if applicable or otherwise all users in the management unit. Note: If teamIds is also specified, only adherence for users in the requested teams will be returned
   **/
  public WfmHistoricalAdherenceQuery teamIds(List<String> teamIds) {
    this.teamIds = teamIds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The teamIds to report on. If null or not set, adherence will be computed for requested users if applicable or otherwise all users in the management unit. Note: If teamIds is also specified, only adherence for users in the requested teams will be returned")
  @JsonProperty("teamIds")
  public List<String> getTeamIds() {
    return teamIds;
  }
  public void setTeamIds(List<String> teamIds) {
    this.teamIds = teamIds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WfmHistoricalAdherenceQuery wfmHistoricalAdherenceQuery = (WfmHistoricalAdherenceQuery) o;

    return Objects.equals(this.startDate, wfmHistoricalAdherenceQuery.startDate) &&
            Objects.equals(this.endDate, wfmHistoricalAdherenceQuery.endDate) &&
            Objects.equals(this.timeZone, wfmHistoricalAdherenceQuery.timeZone) &&
            Objects.equals(this.userIds, wfmHistoricalAdherenceQuery.userIds) &&
            Objects.equals(this.includeExceptions, wfmHistoricalAdherenceQuery.includeExceptions) &&
            Objects.equals(this.teamIds, wfmHistoricalAdherenceQuery.teamIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(startDate, endDate, timeZone, userIds, includeExceptions, teamIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WfmHistoricalAdherenceQuery {\n");
    
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    timeZone: ").append(toIndentedString(timeZone)).append("\n");
    sb.append("    userIds: ").append(toIndentedString(userIds)).append("\n");
    sb.append("    includeExceptions: ").append(toIndentedString(includeExceptions)).append("\n");
    sb.append("    teamIds: ").append(toIndentedString(teamIds)).append("\n");
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

