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
import com.fasterxml.jackson.annotation.JsonProperty;
import com.mypurecloud.sdk.v2.model.JourneySessionEventsNotificationSegment;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

import java.io.Serializable;
/**
 * JourneySessionEventsNotificationSegmentAssignment
 */

public class JourneySessionEventsNotificationSegmentAssignment  implements Serializable {
  
  private JourneySessionEventsNotificationSegment segment = null;
  private Date assignedDate = null;

  
  /**
   **/
  public JourneySessionEventsNotificationSegmentAssignment segment(JourneySessionEventsNotificationSegment segment) {
    this.segment = segment;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("segment")
  public JourneySessionEventsNotificationSegment getSegment() {
    return segment;
  }
  public void setSegment(JourneySessionEventsNotificationSegment segment) {
    this.segment = segment;
  }


  /**
   **/
  public JourneySessionEventsNotificationSegmentAssignment assignedDate(Date assignedDate) {
    this.assignedDate = assignedDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
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
    JourneySessionEventsNotificationSegmentAssignment journeySessionEventsNotificationSegmentAssignment = (JourneySessionEventsNotificationSegmentAssignment) o;

    return Objects.equals(this.segment, journeySessionEventsNotificationSegmentAssignment.segment) &&
            Objects.equals(this.assignedDate, journeySessionEventsNotificationSegmentAssignment.assignedDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(segment, assignedDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JourneySessionEventsNotificationSegmentAssignment {\n");
    
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

