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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * ForecastAverageSpeedOfAnswerResponse
 */

public class ForecastAverageSpeedOfAnswerResponse  implements Serializable {
  
  private Integer seconds = null;

  
  /**
   * the average speed of answer goal in seconds
   **/
  public ForecastAverageSpeedOfAnswerResponse seconds(Integer seconds) {
    this.seconds = seconds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "the average speed of answer goal in seconds")
  @JsonProperty("seconds")
  public Integer getSeconds() {
    return seconds;
  }
  public void setSeconds(Integer seconds) {
    this.seconds = seconds;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ForecastAverageSpeedOfAnswerResponse forecastAverageSpeedOfAnswerResponse = (ForecastAverageSpeedOfAnswerResponse) o;
    return Objects.equals(this.seconds, forecastAverageSpeedOfAnswerResponse.seconds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(seconds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ForecastAverageSpeedOfAnswerResponse {\n");
    
    sb.append("    seconds: ").append(toIndentedString(seconds)).append("\n");
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

