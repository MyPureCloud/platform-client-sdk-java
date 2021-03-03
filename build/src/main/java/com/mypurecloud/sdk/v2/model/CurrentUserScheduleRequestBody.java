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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

import java.io.Serializable;
/**
 * POST request body for fetching the current user&#39;s schedule over a given range
 */
@ApiModel(description = "POST request body for fetching the current user's schedule over a given range")

public class CurrentUserScheduleRequestBody  implements Serializable {
  
  private Date startDate = null;
  private Date endDate = null;
  private Boolean loadFullWeeks = null;

  
  /**
   * Beginning of the range of schedules to fetch, in ISO-8601 format
   **/
  public CurrentUserScheduleRequestBody startDate(Date startDate) {
    this.startDate = startDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Beginning of the range of schedules to fetch, in ISO-8601 format")
  @JsonProperty("startDate")
  public Date getStartDate() {
    return startDate;
  }
  public void setStartDate(Date startDate) {
    this.startDate = startDate;
  }

  
  /**
   * End of the range of schedules to fetch, in ISO-8601 format
   **/
  public CurrentUserScheduleRequestBody endDate(Date endDate) {
    this.endDate = endDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "End of the range of schedules to fetch, in ISO-8601 format")
  @JsonProperty("endDate")
  public Date getEndDate() {
    return endDate;
  }
  public void setEndDate(Date endDate) {
    this.endDate = endDate;
  }

  
  /**
   * Whether to load the full week's schedule (for the current user) of any week overlapping the start/end date query parameters, defaults to false
   **/
  public CurrentUserScheduleRequestBody loadFullWeeks(Boolean loadFullWeeks) {
    this.loadFullWeeks = loadFullWeeks;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Whether to load the full week's schedule (for the current user) of any week overlapping the start/end date query parameters, defaults to false")
  @JsonProperty("loadFullWeeks")
  public Boolean getLoadFullWeeks() {
    return loadFullWeeks;
  }
  public void setLoadFullWeeks(Boolean loadFullWeeks) {
    this.loadFullWeeks = loadFullWeeks;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CurrentUserScheduleRequestBody currentUserScheduleRequestBody = (CurrentUserScheduleRequestBody) o;
    return Objects.equals(this.startDate, currentUserScheduleRequestBody.startDate) &&
        Objects.equals(this.endDate, currentUserScheduleRequestBody.endDate) &&
        Objects.equals(this.loadFullWeeks, currentUserScheduleRequestBody.loadFullWeeks);
  }

  @Override
  public int hashCode() {
    return Objects.hash(startDate, endDate, loadFullWeeks);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CurrentUserScheduleRequestBody {\n");
    
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    loadFullWeeks: ").append(toIndentedString(loadFullWeeks)).append("\n");
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

