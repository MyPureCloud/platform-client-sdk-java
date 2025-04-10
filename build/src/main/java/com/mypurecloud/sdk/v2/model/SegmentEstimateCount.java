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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * SegmentEstimateCount
 */

public class SegmentEstimateCount  implements Serializable {
  
  private String segmentId = null;
  private Integer count = null;

  public SegmentEstimateCount() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * ID of Segment.
   **/
  public SegmentEstimateCount segmentId(String segmentId) {
    this.segmentId = segmentId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "ID of Segment.")
  @JsonProperty("segmentId")
  public String getSegmentId() {
    return segmentId;
  }
  public void setSegmentId(String segmentId) {
    this.segmentId = segmentId;
  }


  /**
   * Estimate count per segment.
   **/
  public SegmentEstimateCount count(Integer count) {
    this.count = count;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Estimate count per segment.")
  @JsonProperty("count")
  public Integer getCount() {
    return count;
  }
  public void setCount(Integer count) {
    this.count = count;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SegmentEstimateCount segmentEstimateCount = (SegmentEstimateCount) o;

    return Objects.equals(this.segmentId, segmentEstimateCount.segmentId) &&
            Objects.equals(this.count, segmentEstimateCount.count);
  }

  @Override
  public int hashCode() {
    return Objects.hash(segmentId, count);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SegmentEstimateCount {\n");
    
    sb.append("    segmentId: ").append(toIndentedString(segmentId)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
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

