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
import com.mypurecloud.sdk.v2.model.AssignedSegment;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

import java.io.Serializable;
/**
 * SessionSegmentAssignment
 */

public class SessionSegmentAssignment  implements Serializable {
  
  private AssignedSegment segment = null;
  private Date assignedDate = null;

  
  /**
   * The segment that was assigned.
   **/
  public SessionSegmentAssignment segment(AssignedSegment segment) {
    this.segment = segment;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The segment that was assigned.")
  @JsonProperty("segment")
  public AssignedSegment getSegment() {
    return segment;
  }
  public void setSegment(AssignedSegment segment) {
    this.segment = segment;
  }

  
  /**
   * Timestamp indicating when the segment was assigned. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public SessionSegmentAssignment assignedDate(Date assignedDate) {
    this.assignedDate = assignedDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Timestamp indicating when the segment was assigned. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("assignedDate")
  public Date getAssignedDate() {
    return assignedDate;
  }
  public void setAssignedDate(Date assignedDate) {
    this.assignedDate = assignedDate;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SessionSegmentAssignment sessionSegmentAssignment = (SessionSegmentAssignment) o;
    return Objects.equals(this.segment, sessionSegmentAssignment.segment) &&
        Objects.equals(this.assignedDate, sessionSegmentAssignment.assignedDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(segment, assignedDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SessionSegmentAssignment {\n");
    
    sb.append("    segment: ").append(toIndentedString(segment)).append("\n");
    sb.append("    assignedDate: ").append(toIndentedString(assignedDate)).append("\n");
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

