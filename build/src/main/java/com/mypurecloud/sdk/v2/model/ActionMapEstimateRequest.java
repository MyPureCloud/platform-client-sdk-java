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
import com.mypurecloud.sdk.v2.model.ActionMapEstimateOutcomeCriteria;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * ActionMapEstimateRequest
 */

public class ActionMapEstimateRequest  implements Serializable {
  
  private List<String> segmentIds = new ArrayList<String>();
  private ActionMapEstimateOutcomeCriteria outcomeCriteria = null;

  
  /**
   * List of Segment IDs.
   **/
  public ActionMapEstimateRequest segmentIds(List<String> segmentIds) {
    this.segmentIds = segmentIds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "List of Segment IDs.")
  @JsonProperty("segmentIds")
  public List<String> getSegmentIds() {
    return segmentIds;
  }
  public void setSegmentIds(List<String> segmentIds) {
    this.segmentIds = segmentIds;
  }


  /**
   * Outcome Criteria containing outcomeId and probability thresholds.
   **/
  public ActionMapEstimateRequest outcomeCriteria(ActionMapEstimateOutcomeCriteria outcomeCriteria) {
    this.outcomeCriteria = outcomeCriteria;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Outcome Criteria containing outcomeId and probability thresholds.")
  @JsonProperty("outcomeCriteria")
  public ActionMapEstimateOutcomeCriteria getOutcomeCriteria() {
    return outcomeCriteria;
  }
  public void setOutcomeCriteria(ActionMapEstimateOutcomeCriteria outcomeCriteria) {
    this.outcomeCriteria = outcomeCriteria;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ActionMapEstimateRequest actionMapEstimateRequest = (ActionMapEstimateRequest) o;

    return Objects.equals(this.segmentIds, actionMapEstimateRequest.segmentIds) &&
            Objects.equals(this.outcomeCriteria, actionMapEstimateRequest.outcomeCriteria);
  }

  @Override
  public int hashCode() {
    return Objects.hash(segmentIds, outcomeCriteria);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ActionMapEstimateRequest {\n");
    
    sb.append("    segmentIds: ").append(toIndentedString(segmentIds)).append("\n");
    sb.append("    outcomeCriteria: ").append(toIndentedString(outcomeCriteria)).append("\n");
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

