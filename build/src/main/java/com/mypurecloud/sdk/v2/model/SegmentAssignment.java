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
import com.mypurecloud.sdk.v2.model.AddressableEntityRef;
import com.mypurecloud.sdk.v2.model.SegmentAssignmentSegment;
import com.mypurecloud.sdk.v2.model.SegmentAssignmentSession;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

import java.io.Serializable;
/**
 * SegmentAssignment
 */

public class SegmentAssignment  implements Serializable {
  
  private Date dateAssigned = null;
  private Date dateForUnassignment = null;
  private SegmentAssignmentSegment segment = null;
  private SegmentAssignmentSession session = null;
  private AddressableEntityRef externalContact = null;

  public SegmentAssignment() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * Date when the segment was assigned. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public SegmentAssignment dateAssigned(Date dateAssigned) {
    this.dateAssigned = dateAssigned;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Date when the segment was assigned. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateAssigned")
  public Date getDateAssigned() {
    return dateAssigned;
  }
  public void setDateAssigned(Date dateAssigned) {
    this.dateAssigned = dateAssigned;
  }


  /**
   * Date indicating when a segment is scheduled to be unassigned. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public SegmentAssignment dateForUnassignment(Date dateForUnassignment) {
    this.dateForUnassignment = dateForUnassignment;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Date indicating when a segment is scheduled to be unassigned. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateForUnassignment")
  public Date getDateForUnassignment() {
    return dateForUnassignment;
  }
  public void setDateForUnassignment(Date dateForUnassignment) {
    this.dateForUnassignment = dateForUnassignment;
  }


  /**
   * The segment the assignment is for.
   **/
  public SegmentAssignment segment(SegmentAssignmentSegment segment) {
    this.segment = segment;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The segment the assignment is for.")
  @JsonProperty("segment")
  public SegmentAssignmentSegment getSegment() {
    return segment;
  }
  public void setSegment(SegmentAssignmentSegment segment) {
    this.segment = segment;
  }


  /**
   * For session-scoped segments, the session for which the segment was assigned.
   **/
  public SegmentAssignment session(SegmentAssignmentSession session) {
    this.session = session;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "For session-scoped segments, the session for which the segment was assigned.")
  @JsonProperty("session")
  public SegmentAssignmentSession getSession() {
    return session;
  }
  public void setSession(SegmentAssignmentSession session) {
    this.session = session;
  }


  @ApiModelProperty(example = "null", required = true, value = "External contact of the customer to which the segment is assigned.")
  @JsonProperty("externalContact")
  public AddressableEntityRef getExternalContact() {
    return externalContact;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SegmentAssignment segmentAssignment = (SegmentAssignment) o;

    return Objects.equals(this.dateAssigned, segmentAssignment.dateAssigned) &&
            Objects.equals(this.dateForUnassignment, segmentAssignment.dateForUnassignment) &&
            Objects.equals(this.segment, segmentAssignment.segment) &&
            Objects.equals(this.session, segmentAssignment.session) &&
            Objects.equals(this.externalContact, segmentAssignment.externalContact);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dateAssigned, dateForUnassignment, segment, session, externalContact);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SegmentAssignment {\n");
    
    sb.append("    dateAssigned: ").append(toIndentedString(dateAssigned)).append("\n");
    sb.append("    dateForUnassignment: ").append(toIndentedString(dateForUnassignment)).append("\n");
    sb.append("    segment: ").append(toIndentedString(segment)).append("\n");
    sb.append("    session: ").append(toIndentedString(session)).append("\n");
    sb.append("    externalContact: ").append(toIndentedString(externalContact)).append("\n");
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

