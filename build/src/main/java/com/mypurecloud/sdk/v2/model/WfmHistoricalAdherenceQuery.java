package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import java.io.Serializable;
/**
 * Query to request a historical adherence report from Workforce Management Service
 */
@ApiModel(description = "Query to request a historical adherence report from Workforce Management Service")

public class WfmHistoricalAdherenceQuery  implements Serializable {
  
  private Date startDate = null;
  private Date endDate = null;
  private String timeZone = null;
  private List<String> userIds = new ArrayList<String>();
  private Boolean includeExceptions = null;

  
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
   * End of the date range to query in ISO-8601 format
   **/
  public WfmHistoricalAdherenceQuery endDate(Date endDate) {
    this.endDate = endDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "End of the date range to query in ISO-8601 format")
  @JsonProperty("endDate")
  public Date getEndDate() {
    return endDate;
  }
  public void setEndDate(Date endDate) {
    this.endDate = endDate;
  }

  
  /**
   * The time zone to use for returned results in olson format (See https://www.ibm.com/developerworks/aix/library/au-aix-posix/)
   **/
  public WfmHistoricalAdherenceQuery timeZone(String timeZone) {
    this.timeZone = timeZone;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The time zone to use for returned results in olson format (See https://www.ibm.com/developerworks/aix/library/au-aix-posix/)")
  @JsonProperty("timeZone")
  public String getTimeZone() {
    return timeZone;
  }
  public void setTimeZone(String timeZone) {
    this.timeZone = timeZone;
  }

  
  /**
   * The userIds to report on
   **/
  public WfmHistoricalAdherenceQuery userIds(List<String> userIds) {
    this.userIds = userIds;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The userIds to report on")
  @JsonProperty("userIds")
  public List<String> getUserIds() {
    return userIds;
  }
  public void setUserIds(List<String> userIds) {
    this.userIds = userIds;
  }

  
  /**
   **/
  public WfmHistoricalAdherenceQuery includeExceptions(Boolean includeExceptions) {
    this.includeExceptions = includeExceptions;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("includeExceptions")
  public Boolean getIncludeExceptions() {
    return includeExceptions;
  }
  public void setIncludeExceptions(Boolean includeExceptions) {
    this.includeExceptions = includeExceptions;
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
        Objects.equals(this.includeExceptions, wfmHistoricalAdherenceQuery.includeExceptions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(startDate, endDate, timeZone, userIds, includeExceptions);
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

