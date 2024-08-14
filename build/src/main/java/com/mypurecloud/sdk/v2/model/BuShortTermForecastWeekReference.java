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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.LocalDate;

import java.io.Serializable;
/**
 * BuShortTermForecastWeekReference
 */

public class BuShortTermForecastWeekReference  implements Serializable {
  
  private String id = null;
  private LocalDate weekDate = null;
  private String description = null;
  private Integer weekNumber = null;
  private String selfUri = null;

  
  /**
   * Forecast id used in this work plan bid
   **/
  public BuShortTermForecastWeekReference id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Forecast id used in this work plan bid")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }


  /**
   * The weekDate of the short term forecast in yyyy-MM-dd format. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd
   **/
  public BuShortTermForecastWeekReference weekDate(LocalDate weekDate) {
    this.weekDate = weekDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The weekDate of the short term forecast in yyyy-MM-dd format. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd")
  @JsonProperty("weekDate")
  public LocalDate getWeekDate() {
    return weekDate;
  }
  public void setWeekDate(LocalDate weekDate) {
    this.weekDate = weekDate;
  }


  @ApiModelProperty(example = "null", value = "The description of the short term forecast")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }


  /**
   * The week number used for this bid. First week starts with number 1
   **/
  public BuShortTermForecastWeekReference weekNumber(Integer weekNumber) {
    this.weekNumber = weekNumber;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The week number used for this bid. First week starts with number 1")
  @JsonProperty("weekNumber")
  public Integer getWeekNumber() {
    return weekNumber;
  }
  public void setWeekNumber(Integer weekNumber) {
    this.weekNumber = weekNumber;
  }


  @ApiModelProperty(example = "null", value = "The URI for this object")
  @JsonProperty("selfUri")
  public String getSelfUri() {
    return selfUri;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BuShortTermForecastWeekReference buShortTermForecastWeekReference = (BuShortTermForecastWeekReference) o;

    return Objects.equals(this.id, buShortTermForecastWeekReference.id) &&
            Objects.equals(this.weekDate, buShortTermForecastWeekReference.weekDate) &&
            Objects.equals(this.description, buShortTermForecastWeekReference.description) &&
            Objects.equals(this.weekNumber, buShortTermForecastWeekReference.weekNumber) &&
            Objects.equals(this.selfUri, buShortTermForecastWeekReference.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, weekDate, description, weekNumber, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BuShortTermForecastWeekReference {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    weekDate: ").append(toIndentedString(weekDate)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    weekNumber: ").append(toIndentedString(weekNumber)).append("\n");
    sb.append("    selfUri: ").append(toIndentedString(selfUri)).append("\n");
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

