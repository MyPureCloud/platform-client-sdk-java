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
import com.mypurecloud.sdk.v2.model.JourneyWebEventsNotificationSegment;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * JourneyWebEventsNotificationSegmentAssignmentMessage
 */

public class JourneyWebEventsNotificationSegmentAssignmentMessage  implements Serializable {
  
  private JourneyWebEventsNotificationSegment segment = null;

  
  /**
   **/
  public JourneyWebEventsNotificationSegmentAssignmentMessage segment(JourneyWebEventsNotificationSegment segment) {
    this.segment = segment;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("segment")
  public JourneyWebEventsNotificationSegment getSegment() {
    return segment;
  }
  public void setSegment(JourneyWebEventsNotificationSegment segment) {
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
    JourneyWebEventsNotificationSegmentAssignmentMessage journeyWebEventsNotificationSegmentAssignmentMessage = (JourneyWebEventsNotificationSegmentAssignmentMessage) o;

    return Objects.equals(this.segment, journeyWebEventsNotificationSegmentAssignmentMessage.segment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(segment);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JourneyWebEventsNotificationSegmentAssignmentMessage {\n");
    
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

