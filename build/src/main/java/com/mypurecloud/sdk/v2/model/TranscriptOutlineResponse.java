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
import com.mypurecloud.sdk.v2.model.TranscriptOutlineSegment;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * TranscriptOutlineResponse
 */

public class TranscriptOutlineResponse  implements Serializable {
  
  private List<TranscriptOutlineSegment> segments = null;

  public TranscriptOutlineResponse() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      segments = new ArrayList<TranscriptOutlineSegment>();
    }
  }

  public TranscriptOutlineResponse(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
      segments = new ArrayList<TranscriptOutlineSegment>();
    }
  }

  
  /**
   * The list of outline segments for the communication
   **/
  public TranscriptOutlineResponse segments(List<TranscriptOutlineSegment> segments) {
    this.segments = segments;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The list of outline segments for the communication")
  @JsonProperty("segments")
  public List<TranscriptOutlineSegment> getSegments() {
    return segments;
  }
  public void setSegments(List<TranscriptOutlineSegment> segments) {
    this.segments = segments;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TranscriptOutlineResponse transcriptOutlineResponse = (TranscriptOutlineResponse) o;

    return Objects.equals(this.segments, transcriptOutlineResponse.segments);
  }

  @Override
  public int hashCode() {
    return Objects.hash(segments);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TranscriptOutlineResponse {\n");
    
    sb.append("    segments: ").append(toIndentedString(segments)).append("\n");
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

