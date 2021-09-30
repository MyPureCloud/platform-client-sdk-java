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
import com.mypurecloud.sdk.v2.model.UserReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.LocalDate;

import java.io.Serializable;
/**
 * AllTimePoints
 */

public class AllTimePoints  implements Serializable {
  
  private UserReference user = null;
  private LocalDate dateEndWorkday = null;
  private Long allTimePoints = null;

  
  @ApiModelProperty(example = "null", value = "Queried user")
  @JsonProperty("user")
  public UserReference getUser() {
    return user;
  }

  
  @ApiModelProperty(example = "null", value = "Queried end workday for all time points to be collected. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd")
  @JsonProperty("dateEndWorkday")
  public LocalDate getDateEndWorkday() {
    return dateEndWorkday;
  }

  
  @ApiModelProperty(example = "null", value = "All time point collected bt the user")
  @JsonProperty("allTimePoints")
  public Long getAllTimePoints() {
    return allTimePoints;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AllTimePoints allTimePoints = (AllTimePoints) o;
    return Objects.equals(this.user, allTimePoints.user) &&
        Objects.equals(this.dateEndWorkday, allTimePoints.dateEndWorkday) &&
        Objects.equals(this.allTimePoints, allTimePoints.allTimePoints);
  }

  @Override
  public int hashCode() {
    return Objects.hash(user, dateEndWorkday, allTimePoints);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AllTimePoints {\n");
    
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    dateEndWorkday: ").append(toIndentedString(dateEndWorkday)).append("\n");
    sb.append("    allTimePoints: ").append(toIndentedString(allTimePoints)).append("\n");
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

