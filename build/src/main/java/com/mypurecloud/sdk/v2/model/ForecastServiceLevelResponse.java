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
 * ForecastServiceLevelResponse
 */

public class ForecastServiceLevelResponse  implements Serializable {
  
  private Integer percent = null;
  private Integer seconds = null;

  
  /**
   * The percent of calls to answer in the number of seconds defined
   **/
  public ForecastServiceLevelResponse percent(Integer percent) {
    this.percent = percent;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The percent of calls to answer in the number of seconds defined")
  @JsonProperty("percent")
  public Integer getPercent() {
    return percent;
  }
  public void setPercent(Integer percent) {
    this.percent = percent;
  }

  
  /**
   * The number of seconds to define for the percent of calls to be answered
   **/
  public ForecastServiceLevelResponse seconds(Integer seconds) {
    this.seconds = seconds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The number of seconds to define for the percent of calls to be answered")
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
    ForecastServiceLevelResponse forecastServiceLevelResponse = (ForecastServiceLevelResponse) o;
    return Objects.equals(this.percent, forecastServiceLevelResponse.percent) &&
        Objects.equals(this.seconds, forecastServiceLevelResponse.seconds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(percent, seconds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ForecastServiceLevelResponse {\n");
    
    sb.append("    percent: ").append(toIndentedString(percent)).append("\n");
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

