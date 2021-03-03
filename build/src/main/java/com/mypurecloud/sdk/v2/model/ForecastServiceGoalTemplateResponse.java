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
import com.mypurecloud.sdk.v2.model.ForecastAbandonRateResponse;
import com.mypurecloud.sdk.v2.model.ForecastAverageSpeedOfAnswerResponse;
import com.mypurecloud.sdk.v2.model.ForecastServiceLevelResponse;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * ForecastServiceGoalTemplateResponse
 */

public class ForecastServiceGoalTemplateResponse  implements Serializable {
  
  private ForecastServiceLevelResponse serviceLevel = null;
  private ForecastAverageSpeedOfAnswerResponse averageSpeedOfAnswer = null;
  private ForecastAbandonRateResponse abandonRate = null;

  
  /**
   * The service level goal for this forecast
   **/
  public ForecastServiceGoalTemplateResponse serviceLevel(ForecastServiceLevelResponse serviceLevel) {
    this.serviceLevel = serviceLevel;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The service level goal for this forecast")
  @JsonProperty("serviceLevel")
  public ForecastServiceLevelResponse getServiceLevel() {
    return serviceLevel;
  }
  public void setServiceLevel(ForecastServiceLevelResponse serviceLevel) {
    this.serviceLevel = serviceLevel;
  }

  
  /**
   * The average speed of answer goal for this forecast
   **/
  public ForecastServiceGoalTemplateResponse averageSpeedOfAnswer(ForecastAverageSpeedOfAnswerResponse averageSpeedOfAnswer) {
    this.averageSpeedOfAnswer = averageSpeedOfAnswer;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The average speed of answer goal for this forecast")
  @JsonProperty("averageSpeedOfAnswer")
  public ForecastAverageSpeedOfAnswerResponse getAverageSpeedOfAnswer() {
    return averageSpeedOfAnswer;
  }
  public void setAverageSpeedOfAnswer(ForecastAverageSpeedOfAnswerResponse averageSpeedOfAnswer) {
    this.averageSpeedOfAnswer = averageSpeedOfAnswer;
  }

  
  /**
   * The abandon rate goal for this forecast
   **/
  public ForecastServiceGoalTemplateResponse abandonRate(ForecastAbandonRateResponse abandonRate) {
    this.abandonRate = abandonRate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The abandon rate goal for this forecast")
  @JsonProperty("abandonRate")
  public ForecastAbandonRateResponse getAbandonRate() {
    return abandonRate;
  }
  public void setAbandonRate(ForecastAbandonRateResponse abandonRate) {
    this.abandonRate = abandonRate;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ForecastServiceGoalTemplateResponse forecastServiceGoalTemplateResponse = (ForecastServiceGoalTemplateResponse) o;
    return Objects.equals(this.serviceLevel, forecastServiceGoalTemplateResponse.serviceLevel) &&
        Objects.equals(this.averageSpeedOfAnswer, forecastServiceGoalTemplateResponse.averageSpeedOfAnswer) &&
        Objects.equals(this.abandonRate, forecastServiceGoalTemplateResponse.abandonRate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(serviceLevel, averageSpeedOfAnswer, abandonRate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ForecastServiceGoalTemplateResponse {\n");
    
    sb.append("    serviceLevel: ").append(toIndentedString(serviceLevel)).append("\n");
    sb.append("    averageSpeedOfAnswer: ").append(toIndentedString(averageSpeedOfAnswer)).append("\n");
    sb.append("    abandonRate: ").append(toIndentedString(abandonRate)).append("\n");
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

