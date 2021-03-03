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
import com.mypurecloud.sdk.v2.model.NluUtteranceSegment;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * NluUtterance
 */

public class NluUtterance  implements Serializable {
  
  private List<NluUtteranceSegment> segments = new ArrayList<NluUtteranceSegment>();

  
  /**
   * The list of segments that that constitute this utterance for the given intent.
   **/
  public NluUtterance segments(List<NluUtteranceSegment> segments) {
    this.segments = segments;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The list of segments that that constitute this utterance for the given intent.")
  @JsonProperty("segments")
  public List<NluUtteranceSegment> getSegments() {
    return segments;
  }
  public void setSegments(List<NluUtteranceSegment> segments) {
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
    NluUtterance nluUtterance = (NluUtterance) o;
    return Objects.equals(this.segments, nluUtterance.segments);
  }

  @Override
  public int hashCode() {
    return Objects.hash(segments);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NluUtterance {\n");
    
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

