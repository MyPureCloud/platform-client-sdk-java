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
import com.mypurecloud.sdk.v2.model.Division;
import com.mypurecloud.sdk.v2.model.OverallBestPointsItem;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * OverallBestPoints
 */

public class OverallBestPoints  implements Serializable {
  
  private Division division = null;
  private List<OverallBestPointsItem> bestPoints = new ArrayList<OverallBestPointsItem>();

  
  /**
   * The requested division
   **/
  public OverallBestPoints division(Division division) {
    this.division = division;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The requested division")
  @JsonProperty("division")
  public Division getDivision() {
    return division;
  }
  public void setDivision(Division division) {
    this.division = division;
  }

  
  /**
   * List of gamification best point items
   **/
  public OverallBestPoints bestPoints(List<OverallBestPointsItem> bestPoints) {
    this.bestPoints = bestPoints;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "List of gamification best point items")
  @JsonProperty("bestPoints")
  public List<OverallBestPointsItem> getBestPoints() {
    return bestPoints;
  }
  public void setBestPoints(List<OverallBestPointsItem> bestPoints) {
    this.bestPoints = bestPoints;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OverallBestPoints overallBestPoints = (OverallBestPoints) o;
    return Objects.equals(this.division, overallBestPoints.division) &&
        Objects.equals(this.bestPoints, overallBestPoints.bestPoints);
  }

  @Override
  public int hashCode() {
    return Objects.hash(division, bestPoints);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OverallBestPoints {\n");
    
    sb.append("    division: ").append(toIndentedString(division)).append("\n");
    sb.append("    bestPoints: ").append(toIndentedString(bestPoints)).append("\n");
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

