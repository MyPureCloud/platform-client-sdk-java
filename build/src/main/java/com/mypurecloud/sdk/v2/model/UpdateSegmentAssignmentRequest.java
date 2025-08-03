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
 * UpdateSegmentAssignmentRequest
 */

public class UpdateSegmentAssignmentRequest  implements Serializable {
  
  private SegmentAssignments assign = null;
  private SegmentUnassignments unassign = null;

  public UpdateSegmentAssignmentRequest() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * The segment assignments to apply.
   **/
  public UpdateSegmentAssignmentRequest assign(SegmentAssignments assign) {
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
  public UpdateSegmentAssignmentRequest unassign(SegmentUnassignments unassign) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateSegmentAssignmentRequest updateSegmentAssignmentRequest = (UpdateSegmentAssignmentRequest) o;

    return Objects.equals(this.assign, updateSegmentAssignmentRequest.assign) &&
            Objects.equals(this.unassign, updateSegmentAssignmentRequest.unassign);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assign, unassign);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateSegmentAssignmentRequest {\n");
    
    sb.append("    assign: ").append(toIndentedString(assign)).append("\n");
    sb.append("    unassign: ").append(toIndentedString(unassign)).append("\n");
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

