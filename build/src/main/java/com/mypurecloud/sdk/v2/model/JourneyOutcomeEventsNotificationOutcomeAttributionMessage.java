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
import com.mypurecloud.sdk.v2.model.JourneyOutcomeEventsNotificationOutcome;
import com.mypurecloud.sdk.v2.model.JourneyOutcomeEventsNotificationOutcomeTouchpoint;
import com.mypurecloud.sdk.v2.model.JourneyOutcomeEventsNotificationSegment;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * JourneyOutcomeEventsNotificationOutcomeAttributionMessage
 */

public class JourneyOutcomeEventsNotificationOutcomeAttributionMessage  implements Serializable {
  
  private JourneyOutcomeEventsNotificationOutcome outcome = null;
  private List<JourneyOutcomeEventsNotificationOutcomeTouchpoint> outcomeTouchpoints = new ArrayList<JourneyOutcomeEventsNotificationOutcomeTouchpoint>();
  private List<JourneyOutcomeEventsNotificationSegment> segmentAssignments = new ArrayList<JourneyOutcomeEventsNotificationSegment>();

  
  /**
   **/
  public JourneyOutcomeEventsNotificationOutcomeAttributionMessage outcome(JourneyOutcomeEventsNotificationOutcome outcome) {
    this.outcome = outcome;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("outcome")
  public JourneyOutcomeEventsNotificationOutcome getOutcome() {
    return outcome;
  }
  public void setOutcome(JourneyOutcomeEventsNotificationOutcome outcome) {
    this.outcome = outcome;
  }

  
  /**
   **/
  public JourneyOutcomeEventsNotificationOutcomeAttributionMessage outcomeTouchpoints(List<JourneyOutcomeEventsNotificationOutcomeTouchpoint> outcomeTouchpoints) {
    this.outcomeTouchpoints = outcomeTouchpoints;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("outcomeTouchpoints")
  public List<JourneyOutcomeEventsNotificationOutcomeTouchpoint> getOutcomeTouchpoints() {
    return outcomeTouchpoints;
  }
  public void setOutcomeTouchpoints(List<JourneyOutcomeEventsNotificationOutcomeTouchpoint> outcomeTouchpoints) {
    this.outcomeTouchpoints = outcomeTouchpoints;
  }

  
  /**
   **/
  public JourneyOutcomeEventsNotificationOutcomeAttributionMessage segmentAssignments(List<JourneyOutcomeEventsNotificationSegment> segmentAssignments) {
    this.segmentAssignments = segmentAssignments;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("segmentAssignments")
  public List<JourneyOutcomeEventsNotificationSegment> getSegmentAssignments() {
    return segmentAssignments;
  }
  public void setSegmentAssignments(List<JourneyOutcomeEventsNotificationSegment> segmentAssignments) {
    this.segmentAssignments = segmentAssignments;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JourneyOutcomeEventsNotificationOutcomeAttributionMessage journeyOutcomeEventsNotificationOutcomeAttributionMessage = (JourneyOutcomeEventsNotificationOutcomeAttributionMessage) o;
    return Objects.equals(this.outcome, journeyOutcomeEventsNotificationOutcomeAttributionMessage.outcome) &&
        Objects.equals(this.outcomeTouchpoints, journeyOutcomeEventsNotificationOutcomeAttributionMessage.outcomeTouchpoints) &&
        Objects.equals(this.segmentAssignments, journeyOutcomeEventsNotificationOutcomeAttributionMessage.segmentAssignments);
  }

  @Override
  public int hashCode() {
    return Objects.hash(outcome, outcomeTouchpoints, segmentAssignments);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JourneyOutcomeEventsNotificationOutcomeAttributionMessage {\n");
    
    sb.append("    outcome: ").append(toIndentedString(outcome)).append("\n");
    sb.append("    outcomeTouchpoints: ").append(toIndentedString(outcomeTouchpoints)).append("\n");
    sb.append("    segmentAssignments: ").append(toIndentedString(segmentAssignments)).append("\n");
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

