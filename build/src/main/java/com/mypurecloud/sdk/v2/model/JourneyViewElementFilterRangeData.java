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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * JourneyViewElementFilterRangeData
 */

public class JourneyViewElementFilterRangeData  implements Serializable {
  
  private String duration = null;
  private Double number = null;

  public JourneyViewElementFilterRangeData() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * An ISO 8601 time duration. Only one of number or duration must be specified.
   **/
  public JourneyViewElementFilterRangeData duration(String duration) {
    this.duration = duration;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "An ISO 8601 time duration. Only one of number or duration must be specified.")
  @JsonProperty("duration")
  public String getDuration() {
    return duration;
  }
  public void setDuration(String duration) {
    this.duration = duration;
  }


  /**
   * A numeric value. Only one of number or duration must be specified.
   **/
  public JourneyViewElementFilterRangeData number(Double number) {
    this.number = number;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A numeric value. Only one of number or duration must be specified.")
  @JsonProperty("number")
  public Double getNumber() {
    return number;
  }
  public void setNumber(Double number) {
    this.number = number;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JourneyViewElementFilterRangeData journeyViewElementFilterRangeData = (JourneyViewElementFilterRangeData) o;

    return Objects.equals(this.duration, journeyViewElementFilterRangeData.duration) &&
            Objects.equals(this.number, journeyViewElementFilterRangeData.number);
  }

  @Override
  public int hashCode() {
    return Objects.hash(duration, number);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JourneyViewElementFilterRangeData {\n");
    
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
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

