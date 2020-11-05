package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
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
  
  private String id = null;

  /**
   * State of the segment assignment.
   */
  public enum StateEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    ASSIGNED("Assigned"),
    UNASSIGNED("Unassigned");

    private String value;

    StateEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static StateEnum fromString(String key) {
      if (key == null) return null;

      for (StateEnum value : StateEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return StateEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private StateEnum state = null;
  private Date dateAssigned = null;
  private Date dateUnassigned = null;
  private Date dateModified = null;
  private SegmentAssignmentSegment segment = null;
  private String customerId = null;
  private String customerIdType = null;
  private SegmentAssignmentSession session = null;
  private AddressableEntityRef externalContact = null;

  
  /**
   * Unique identifier for the segment assignment.
   **/
  public SegmentAssignment id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Unique identifier for the segment assignment.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  
  /**
   * State of the segment assignment.
   **/
  public SegmentAssignment state(StateEnum state) {
    this.state = state;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "State of the segment assignment.")
  @JsonProperty("state")
  public StateEnum getState() {
    return state;
  }
  public void setState(StateEnum state) {
    this.state = state;
  }

  
  /**
   * Date when the segment was assigned. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public SegmentAssignment dateAssigned(Date dateAssigned) {
    this.dateAssigned = dateAssigned;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Date when the segment was assigned. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateAssigned")
  public Date getDateAssigned() {
    return dateAssigned;
  }
  public void setDateAssigned(Date dateAssigned) {
    this.dateAssigned = dateAssigned;
  }

  
  /**
   * Date when the segment was unassigned. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public SegmentAssignment dateUnassigned(Date dateUnassigned) {
    this.dateUnassigned = dateUnassigned;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Date when the segment was unassigned. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateUnassigned")
  public Date getDateUnassigned() {
    return dateUnassigned;
  }
  public void setDateUnassigned(Date dateUnassigned) {
    this.dateUnassigned = dateUnassigned;
  }

  
  /**
   * Date when the segment assignment was last modified. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public SegmentAssignment dateModified(Date dateModified) {
    this.dateModified = dateModified;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Date when the segment assignment was last modified. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateModified")
  public Date getDateModified() {
    return dateModified;
  }
  public void setDateModified(Date dateModified) {
    this.dateModified = dateModified;
  }

  
  /**
   * The segment the assignment is for.
   **/
  public SegmentAssignment segment(SegmentAssignmentSegment segment) {
    this.segment = segment;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The segment the assignment is for.")
  @JsonProperty("segment")
  public SegmentAssignmentSegment getSegment() {
    return segment;
  }
  public void setSegment(SegmentAssignmentSegment segment) {
    this.segment = segment;
  }

  
  /**
   * ID of the customer to which the segment is assigned.
   **/
  public SegmentAssignment customerId(String customerId) {
    this.customerId = customerId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "ID of the customer to which the segment is assigned.")
  @JsonProperty("customerId")
  public String getCustomerId() {
    return customerId;
  }
  public void setCustomerId(String customerId) {
    this.customerId = customerId;
  }

  
  /**
   * Type of customer ID (e.g. cookie, email, phone).
   **/
  public SegmentAssignment customerIdType(String customerIdType) {
    this.customerIdType = customerIdType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Type of customer ID (e.g. cookie, email, phone).")
  @JsonProperty("customerIdType")
  public String getCustomerIdType() {
    return customerIdType;
  }
  public void setCustomerIdType(String customerIdType) {
    this.customerIdType = customerIdType;
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

  
  /**
   * External contact of the customer to which the segment is assigned.
   **/
  public SegmentAssignment externalContact(AddressableEntityRef externalContact) {
    this.externalContact = externalContact;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "External contact of the customer to which the segment is assigned.")
  @JsonProperty("externalContact")
  public AddressableEntityRef getExternalContact() {
    return externalContact;
  }
  public void setExternalContact(AddressableEntityRef externalContact) {
    this.externalContact = externalContact;
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
    return Objects.equals(this.id, segmentAssignment.id) &&
        Objects.equals(this.state, segmentAssignment.state) &&
        Objects.equals(this.dateAssigned, segmentAssignment.dateAssigned) &&
        Objects.equals(this.dateUnassigned, segmentAssignment.dateUnassigned) &&
        Objects.equals(this.dateModified, segmentAssignment.dateModified) &&
        Objects.equals(this.segment, segmentAssignment.segment) &&
        Objects.equals(this.customerId, segmentAssignment.customerId) &&
        Objects.equals(this.customerIdType, segmentAssignment.customerIdType) &&
        Objects.equals(this.session, segmentAssignment.session) &&
        Objects.equals(this.externalContact, segmentAssignment.externalContact);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, state, dateAssigned, dateUnassigned, dateModified, segment, customerId, customerIdType, session, externalContact);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SegmentAssignment {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    dateAssigned: ").append(toIndentedString(dateAssigned)).append("\n");
    sb.append("    dateUnassigned: ").append(toIndentedString(dateUnassigned)).append("\n");
    sb.append("    dateModified: ").append(toIndentedString(dateModified)).append("\n");
    sb.append("    segment: ").append(toIndentedString(segment)).append("\n");
    sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
    sb.append("    customerIdType: ").append(toIndentedString(customerIdType)).append("\n");
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

