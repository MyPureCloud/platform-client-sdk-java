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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * SegmentAssignmentEvent
 */

public class SegmentAssignmentEvent  implements Serializable {
  
  private AddressableEntityRef segment = null;

  public SegmentAssignmentEvent() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * The segment which was assigned.
   **/
  public SegmentAssignmentEvent segment(AddressableEntityRef segment) {
    this.segment = segment;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The segment which was assigned.")
  @JsonProperty("segment")
  public AddressableEntityRef getSegment() {
    return segment;
  }
  public void setSegment(AddressableEntityRef segment) {
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
    SegmentAssignmentEvent segmentAssignmentEvent = (SegmentAssignmentEvent) o;

    return Objects.equals(this.segment, segmentAssignmentEvent.segment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(segment);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SegmentAssignmentEvent {\n");
    
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

