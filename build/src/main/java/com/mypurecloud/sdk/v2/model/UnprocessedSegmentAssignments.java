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
import com.mypurecloud.sdk.v2.model.SegmentAssignments;
import com.mypurecloud.sdk.v2.model.SegmentUnassignments;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * UnprocessedSegmentAssignments
 */

public class UnprocessedSegmentAssignments  implements Serializable {
  
  private SegmentAssignments assign = null;
  private SegmentUnassignments unassign = null;
  private Integer count = null;

  public UnprocessedSegmentAssignments() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * The segment assignments to apply.
   **/
  public UnprocessedSegmentAssignments assign(SegmentAssignments assign) {
    this.assign = assign;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The segment assignments to apply.")
  @JsonProperty("assign")
  public SegmentAssignments getAssign() {
    return assign;
  }
  public void setAssign(SegmentAssignments assign) {
    this.assign = assign;
  }


  /**
   * The segment unassignments to apply.
   **/
  public UnprocessedSegmentAssignments unassign(SegmentUnassignments unassign) {
    this.unassign = unassign;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The segment unassignments to apply.")
  @JsonProperty("unassign")
  public SegmentUnassignments getUnassign() {
    return unassign;
  }
  public void setUnassign(SegmentUnassignments unassign) {
    this.unassign = unassign;
  }


  /**
   * The total number of segment assignments and unassignments that were not successfully processed.
   **/
  public UnprocessedSegmentAssignments count(Integer count) {
    this.count = count;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The total number of segment assignments and unassignments that were not successfully processed.")
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
    UnprocessedSegmentAssignments unprocessedSegmentAssignments = (UnprocessedSegmentAssignments) o;

    return Objects.equals(this.assign, unprocessedSegmentAssignments.assign) &&
            Objects.equals(this.unassign, unprocessedSegmentAssignments.unassign) &&
            Objects.equals(this.count, unprocessedSegmentAssignments.count);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assign, unassign, count);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UnprocessedSegmentAssignments {\n");
    
    sb.append("    assign: ").append(toIndentedString(assign)).append("\n");
    sb.append("    unassign: ").append(toIndentedString(unassign)).append("\n");
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

