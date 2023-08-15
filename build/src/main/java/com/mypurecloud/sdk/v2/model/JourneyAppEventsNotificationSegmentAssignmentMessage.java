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
import com.mypurecloud.sdk.v2.model.JourneyAppEventsNotificationSegment;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * JourneyAppEventsNotificationSegmentAssignmentMessage
 */

public class JourneyAppEventsNotificationSegmentAssignmentMessage  implements Serializable {
  
  private JourneyAppEventsNotificationSegment segment = null;

  
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JourneyAppEventsNotificationSegmentAssignmentMessage journeyAppEventsNotificationSegmentAssignmentMessage = (JourneyAppEventsNotificationSegmentAssignmentMessage) o;

    return Objects.equals(this.segment, journeyAppEventsNotificationSegmentAssignmentMessage.segment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(segment);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JourneyAppEventsNotificationSegmentAssignmentMessage {\n");
    
    sb.append("    segment: ").append(toIndentedString(segment)).append("\n");
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

