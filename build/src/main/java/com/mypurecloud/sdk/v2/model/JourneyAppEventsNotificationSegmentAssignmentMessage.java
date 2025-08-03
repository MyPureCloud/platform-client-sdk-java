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
import com.fasterxml.jackson.annotation.JsonValue;
import com.mypurecloud.sdk.v2.model.JourneyAppEventsNotificationSegment;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

import java.io.Serializable;
/**
 * JourneyAppEventsNotificationSegmentAssignmentMessage
 */

public class JourneyAppEventsNotificationSegmentAssignmentMessage  implements Serializable {
  
  private JourneyAppEventsNotificationSegment segment = null;

  private static class AssignmentStateEnumDeserializer extends StdDeserializer<AssignmentStateEnum> {
    public AssignmentStateEnumDeserializer() {
      super(AssignmentStateEnumDeserializer.class);
    }

    @Override
    public AssignmentStateEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return AssignmentStateEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Gets or Sets assignmentState
   */
 @JsonDeserialize(using = AssignmentStateEnumDeserializer.class)
  public enum AssignmentStateEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    UNKNOWN("Unknown"),
    ASSIGNED("Assigned"),
    UNASSIGNED("Unassigned");

    private String value;

    AssignmentStateEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static AssignmentStateEnum fromString(String key) {
      if (key == null) return null;

      for (AssignmentStateEnum value : AssignmentStateEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return AssignmentStateEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private AssignmentStateEnum assignmentState = null;
  private Date dateAssigned = null;
  private Date dateForUnassignment = null;

  public JourneyAppEventsNotificationSegmentAssignmentMessage() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   **/
  public JourneyAppEventsNotificationSegmentAssignmentMessage segment(JourneyAppEventsNotificationSegment segment) {
    this.segment = segment;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("segment")
  public JourneyAppEventsNotificationSegment getSegment() {
    return segment;
  }
  public void setSegment(JourneyAppEventsNotificationSegment segment) {
    this.segment = segment;
  }


  /**
   **/
  public JourneyAppEventsNotificationSegmentAssignmentMessage assignmentState(AssignmentStateEnum assignmentState) {
    this.assignmentState = assignmentState;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("assignmentState")
  public AssignmentStateEnum getAssignmentState() {
    return assignmentState;
  }
  public void setAssignmentState(AssignmentStateEnum assignmentState) {
    this.assignmentState = assignmentState;
  }


  /**
   **/
  public JourneyAppEventsNotificationSegmentAssignmentMessage dateAssigned(Date dateAssigned) {
    this.dateAssigned = dateAssigned;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("dateAssigned")
  public Date getDateAssigned() {
    return dateAssigned;
  }
  public void setDateAssigned(Date dateAssigned) {
    this.dateAssigned = dateAssigned;
  }


  /**
   **/
  public JourneyAppEventsNotificationSegmentAssignmentMessage dateForUnassignment(Date dateForUnassignment) {
    this.dateForUnassignment = dateForUnassignment;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("dateForUnassignment")
  public Date getDateForUnassignment() {
    return dateForUnassignment;
  }
  public void setDateForUnassignment(Date dateForUnassignment) {
    this.dateForUnassignment = dateForUnassignment;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JourneyAppEventsNotificationSegmentAssignmentMessage journeyAppEventsNotificationSegmentAssignmentMessage = (JourneyAppEventsNotificationSegmentAssignmentMessage) o;

    return Objects.equals(this.segment, journeyAppEventsNotificationSegmentAssignmentMessage.segment) &&
            Objects.equals(this.assignmentState, journeyAppEventsNotificationSegmentAssignmentMessage.assignmentState) &&
            Objects.equals(this.dateAssigned, journeyAppEventsNotificationSegmentAssignmentMessage.dateAssigned) &&
            Objects.equals(this.dateForUnassignment, journeyAppEventsNotificationSegmentAssignmentMessage.dateForUnassignment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(segment, assignmentState, dateAssigned, dateForUnassignment);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JourneyAppEventsNotificationSegmentAssignmentMessage {\n");
    
    sb.append("    segment: ").append(toIndentedString(segment)).append("\n");
    sb.append("    assignmentState: ").append(toIndentedString(assignmentState)).append("\n");
    sb.append("    dateAssigned: ").append(toIndentedString(dateAssigned)).append("\n");
    sb.append("    dateForUnassignment: ").append(toIndentedString(dateForUnassignment)).append("\n");
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

