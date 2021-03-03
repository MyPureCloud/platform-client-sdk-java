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
import java.time.LocalDate;

import java.io.Serializable;
/**
 * BuAgentSchedulePublishedScheduleReference
 */

public class BuAgentSchedulePublishedScheduleReference  implements Serializable {
  
  private String id = null;
  private LocalDate weekDate = null;
  private Integer weekCount = null;
  private String selfUri = null;

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  
  /**
   * The start week date for this schedule. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd
   **/
  public BuAgentSchedulePublishedScheduleReference weekDate(LocalDate weekDate) {
    this.weekDate = weekDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The start week date for this schedule. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd")
  @JsonProperty("weekDate")
  public LocalDate getWeekDate() {
    return weekDate;
  }
  public void setWeekDate(LocalDate weekDate) {
    this.weekDate = weekDate;
  }

  
  /**
   * The number of weeks encompassed by the schedule
   **/
  public BuAgentSchedulePublishedScheduleReference weekCount(Integer weekCount) {
    this.weekCount = weekCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The number of weeks encompassed by the schedule")
  @JsonProperty("weekCount")
  public Integer getWeekCount() {
    return weekCount;
  }
  public void setWeekCount(Integer weekCount) {
    this.weekCount = weekCount;
  }

  
  @ApiModelProperty(example = "null", value = "The URI for this object")
  @JsonProperty("selfUri")
  public String getSelfUri() {
    return selfUri;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BuAgentSchedulePublishedScheduleReference buAgentSchedulePublishedScheduleReference = (BuAgentSchedulePublishedScheduleReference) o;
    return Objects.equals(this.id, buAgentSchedulePublishedScheduleReference.id) &&
        Objects.equals(this.weekDate, buAgentSchedulePublishedScheduleReference.weekDate) &&
        Objects.equals(this.weekCount, buAgentSchedulePublishedScheduleReference.weekCount) &&
        Objects.equals(this.selfUri, buAgentSchedulePublishedScheduleReference.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, weekDate, weekCount, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BuAgentSchedulePublishedScheduleReference {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    weekDate: ").append(toIndentedString(weekDate)).append("\n");
    sb.append("    weekCount: ").append(toIndentedString(weekCount)).append("\n");
    sb.append("    selfUri: ").append(toIndentedString(selfUri)).append("\n");
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

