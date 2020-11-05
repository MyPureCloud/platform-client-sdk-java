package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * SegmentAssignmentsUpdate
 */

public class SegmentAssignmentsUpdate  implements Serializable {
  
  private String segmentId = null;

  /**
   * Segment assignment state
   */
  public enum StateEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    ASSIGNED("Assigned"),
    UNASSIGNED("Unassigned");

    private String value;

    StateEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static StateEnum fromString(String key) {
      if (key == null) return null;

      for (StateEnum value : StateEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return StateEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private StateEnum state = null;

  
  /**
   * ID of segment to be assigned/unnassigned
   **/
  public SegmentAssignmentsUpdate segmentId(String segmentId) {
    this.segmentId = segmentId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "ID of segment to be assigned/unnassigned")
  @JsonProperty("segmentId")
  public String getSegmentId() {
    return segmentId;
  }
  public void setSegmentId(String segmentId) {
    this.segmentId = segmentId;
  }

  
  /**
   * Segment assignment state
   **/
  public SegmentAssignmentsUpdate state(StateEnum state) {
    this.state = state;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Segment assignment state")
  @JsonProperty("state")
  public StateEnum getState() {
    return state;
  }
  public void setState(StateEnum state) {
    this.state = state;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SegmentAssignmentsUpdate segmentAssignmentsUpdate = (SegmentAssignmentsUpdate) o;
    return Objects.equals(this.segmentId, segmentAssignmentsUpdate.segmentId) &&
        Objects.equals(this.state, segmentAssignmentsUpdate.state);
  }

  @Override
  public int hashCode() {
    return Objects.hash(segmentId, state);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SegmentAssignmentsUpdate {\n");
    
    sb.append("    segmentId: ").append(toIndentedString(segmentId)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
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

