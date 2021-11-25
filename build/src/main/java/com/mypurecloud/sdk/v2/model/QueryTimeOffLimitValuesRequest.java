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
import com.mypurecloud.sdk.v2.model.LocalDateRange;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * This sets up a filter to request date ranges of time off limit, allocated and waitlisted minutes
 */
@ApiModel(description = "This sets up a filter to request date ranges of time off limit, allocated and waitlisted minutes")

public class QueryTimeOffLimitValuesRequest  implements Serializable {
  
  private String timeOffLimitId = null;
  private String activityCodeId = null;
  private List<LocalDateRange> dateRanges = new ArrayList<LocalDateRange>();

  
  /**
   * The time off limit object id to retrieve values for. Required if activityCodeId is not specified
   **/
  public QueryTimeOffLimitValuesRequest timeOffLimitId(String timeOffLimitId) {
    this.timeOffLimitId = timeOffLimitId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The time off limit object id to retrieve values for. Required if activityCodeId is not specified")
  @JsonProperty("timeOffLimitId")
  public String getTimeOffLimitId() {
    return timeOffLimitId;
  }
  public void setTimeOffLimitId(String timeOffLimitId) {
    this.timeOffLimitId = timeOffLimitId;
  }

  
  /**
   * The activity code id to filter the affected limit objects by. Required if timeOffLimitId is not specified
   **/
  public QueryTimeOffLimitValuesRequest activityCodeId(String activityCodeId) {
    this.activityCodeId = activityCodeId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The activity code id to filter the affected limit objects by. Required if timeOffLimitId is not specified")
  @JsonProperty("activityCodeId")
  public String getActivityCodeId() {
    return activityCodeId;
  }
  public void setActivityCodeId(String activityCodeId) {
    this.activityCodeId = activityCodeId;
  }

  
  /**
   * The list of the date ranges to return time off limit, allocated and waitlisted minutes.
   **/
  public QueryTimeOffLimitValuesRequest dateRanges(List<LocalDateRange> dateRanges) {
    this.dateRanges = dateRanges;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The list of the date ranges to return time off limit, allocated and waitlisted minutes.")
  @JsonProperty("dateRanges")
  public List<LocalDateRange> getDateRanges() {
    return dateRanges;
  }
  public void setDateRanges(List<LocalDateRange> dateRanges) {
    this.dateRanges = dateRanges;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QueryTimeOffLimitValuesRequest queryTimeOffLimitValuesRequest = (QueryTimeOffLimitValuesRequest) o;
    return Objects.equals(this.timeOffLimitId, queryTimeOffLimitValuesRequest.timeOffLimitId) &&
        Objects.equals(this.activityCodeId, queryTimeOffLimitValuesRequest.activityCodeId) &&
        Objects.equals(this.dateRanges, queryTimeOffLimitValuesRequest.dateRanges);
  }

  @Override
  public int hashCode() {
    return Objects.hash(timeOffLimitId, activityCodeId, dateRanges);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueryTimeOffLimitValuesRequest {\n");
    
    sb.append("    timeOffLimitId: ").append(toIndentedString(timeOffLimitId)).append("\n");
    sb.append("    activityCodeId: ").append(toIndentedString(activityCodeId)).append("\n");
    sb.append("    dateRanges: ").append(toIndentedString(dateRanges)).append("\n");
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

