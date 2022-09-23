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
import com.mypurecloud.sdk.v2.model.SegmentEstimateCount;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * ActionMapEstimateResult
 */

public class ActionMapEstimateResult  implements Serializable {
  
  private Integer qualifiedSessionCount = null;
  private Integer totalSessionCount = null;
  private List<SegmentEstimateCount> perSegmentCounts = new ArrayList<SegmentEstimateCount>();
  private Integer outcomesScoresCount = null;

  
  /**
   * Number of sessions qualified for Action map.
   **/
  public ActionMapEstimateResult qualifiedSessionCount(Integer qualifiedSessionCount) {
    this.qualifiedSessionCount = qualifiedSessionCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Number of sessions qualified for Action map.")
  @JsonProperty("qualifiedSessionCount")
  public Integer getQualifiedSessionCount() {
    return qualifiedSessionCount;
  }
  public void setQualifiedSessionCount(Integer qualifiedSessionCount) {
    this.qualifiedSessionCount = qualifiedSessionCount;
  }


  /**
   * Total number of sessions.
   **/
  public ActionMapEstimateResult totalSessionCount(Integer totalSessionCount) {
    this.totalSessionCount = totalSessionCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Total number of sessions.")
  @JsonProperty("totalSessionCount")
  public Integer getTotalSessionCount() {
    return totalSessionCount;
  }
  public void setTotalSessionCount(Integer totalSessionCount) {
    this.totalSessionCount = totalSessionCount;
  }


  /**
   * Number of sessions qualified for Action map per segment.
   **/
  public ActionMapEstimateResult perSegmentCounts(List<SegmentEstimateCount> perSegmentCounts) {
    this.perSegmentCounts = perSegmentCounts;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Number of sessions qualified for Action map per segment.")
  @JsonProperty("perSegmentCounts")
  public List<SegmentEstimateCount> getPerSegmentCounts() {
    return perSegmentCounts;
  }
  public void setPerSegmentCounts(List<SegmentEstimateCount> perSegmentCounts) {
    this.perSegmentCounts = perSegmentCounts;
  }


  /**
   * Difference made by outcome criteria to number of sessions qualified for Action map.
   **/
  public ActionMapEstimateResult outcomesScoresCount(Integer outcomesScoresCount) {
    this.outcomesScoresCount = outcomesScoresCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Difference made by outcome criteria to number of sessions qualified for Action map.")
  @JsonProperty("outcomesScoresCount")
  public Integer getOutcomesScoresCount() {
    return outcomesScoresCount;
  }
  public void setOutcomesScoresCount(Integer outcomesScoresCount) {
    this.outcomesScoresCount = outcomesScoresCount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ActionMapEstimateResult actionMapEstimateResult = (ActionMapEstimateResult) o;

    return Objects.equals(this.qualifiedSessionCount, actionMapEstimateResult.qualifiedSessionCount) &&
            Objects.equals(this.totalSessionCount, actionMapEstimateResult.totalSessionCount) &&
            Objects.equals(this.perSegmentCounts, actionMapEstimateResult.perSegmentCounts) &&
            Objects.equals(this.outcomesScoresCount, actionMapEstimateResult.outcomesScoresCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(qualifiedSessionCount, totalSessionCount, perSegmentCounts, outcomesScoresCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ActionMapEstimateResult {\n");
    
    sb.append("    qualifiedSessionCount: ").append(toIndentedString(qualifiedSessionCount)).append("\n");
    sb.append("    totalSessionCount: ").append(toIndentedString(totalSessionCount)).append("\n");
    sb.append("    perSegmentCounts: ").append(toIndentedString(perSegmentCounts)).append("\n");
    sb.append("    outcomesScoresCount: ").append(toIndentedString(outcomesScoresCount)).append("\n");
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

