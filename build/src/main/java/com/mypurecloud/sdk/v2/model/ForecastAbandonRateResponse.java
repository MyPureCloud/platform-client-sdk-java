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
 * ForecastAbandonRateResponse
 */

public class ForecastAbandonRateResponse  implements Serializable {
  
  private Integer percent = null;

  
  /**
   * The target percent abandon rate goal
   **/
  public ForecastAbandonRateResponse percent(Integer percent) {
    this.percent = percent;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The target percent abandon rate goal")
  @JsonProperty("percent")
  public Integer getPercent() {
    return percent;
  }
  public void setPercent(Integer percent) {
    this.percent = percent;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ForecastAbandonRateResponse forecastAbandonRateResponse = (ForecastAbandonRateResponse) o;
    return Objects.equals(this.percent, forecastAbandonRateResponse.percent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(percent);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ForecastAbandonRateResponse {\n");
    
    sb.append("    percent: ").append(toIndentedString(percent)).append("\n");
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

