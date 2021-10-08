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
import com.mypurecloud.sdk.v2.model.AddressableEntityRef;
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
  private AddressableEntityRef performanceProfile = null;

  
  @ApiModelProperty(example = "null", value = "The requested division")
  @JsonProperty("division")
  public Division getDivision() {
    return division;
  }

  
  @ApiModelProperty(example = "null", value = "List of gamification best point items")
  @JsonProperty("bestPoints")
  public List<OverallBestPointsItem> getBestPoints() {
    return bestPoints;
  }

  
  @ApiModelProperty(example = "null", value = "The targeted performance profile for the average points")
  @JsonProperty("performanceProfile")
  public AddressableEntityRef getPerformanceProfile() {
    return performanceProfile;
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
        Objects.equals(this.bestPoints, overallBestPoints.bestPoints) &&
        Objects.equals(this.performanceProfile, overallBestPoints.performanceProfile);
  }

  @Override
  public int hashCode() {
    return Objects.hash(division, bestPoints, performanceProfile);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OverallBestPoints {\n");
    
    sb.append("    division: ").append(toIndentedString(division)).append("\n");
    sb.append("    bestPoints: ").append(toIndentedString(bestPoints)).append("\n");
    sb.append("    performanceProfile: ").append(toIndentedString(performanceProfile)).append("\n");
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

