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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.LocalDate;

import java.io.Serializable;
/**
 * SingleWorkdayAveragePoints
 */

public class SingleWorkdayAveragePoints  implements Serializable {
  
  private LocalDate dateWorkday = null;
  private Division division = null;
  private Double averagePoints = null;
  private AddressableEntityRef performanceProfile = null;

  
  @ApiModelProperty(example = "null", value = "Queried target workday. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd")
  @JsonProperty("dateWorkday")
  public LocalDate getDateWorkday() {
    return dateWorkday;
  }

  
  @ApiModelProperty(example = "null", value = "The targeted division for the average points")
  @JsonProperty("division")
  public Division getDivision() {
    return division;
  }

  
  @ApiModelProperty(example = "null", value = "The average points per agent earned within the division")
  @JsonProperty("averagePoints")
  public Double getAveragePoints() {
    return averagePoints;
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
    SingleWorkdayAveragePoints singleWorkdayAveragePoints = (SingleWorkdayAveragePoints) o;
    return Objects.equals(this.dateWorkday, singleWorkdayAveragePoints.dateWorkday) &&
        Objects.equals(this.division, singleWorkdayAveragePoints.division) &&
        Objects.equals(this.averagePoints, singleWorkdayAveragePoints.averagePoints) &&
        Objects.equals(this.performanceProfile, singleWorkdayAveragePoints.performanceProfile);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dateWorkday, division, averagePoints, performanceProfile);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SingleWorkdayAveragePoints {\n");
    
    sb.append("    dateWorkday: ").append(toIndentedString(dateWorkday)).append("\n");
    sb.append("    division: ").append(toIndentedString(division)).append("\n");
    sb.append("    averagePoints: ").append(toIndentedString(averagePoints)).append("\n");
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

