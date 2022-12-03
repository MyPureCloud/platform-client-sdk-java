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
import com.mypurecloud.sdk.v2.model.AddressableEntityRef;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * OutcomeEventScore
 */

public class OutcomeEventScore  implements Serializable {
  
  private AddressableEntityRef outcome = null;
  private Float sessionMaxProbability = null;
  private Float probability = null;
  private Integer percentile = null;
  private Integer sessionMaxPercentile = null;

  
  /**
   * The outcome that the score was calculated for.
   **/
  public OutcomeEventScore outcome(AddressableEntityRef outcome) {
    this.outcome = outcome;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The outcome that the score was calculated for.")
  @JsonProperty("outcome")
  public AddressableEntityRef getOutcome() {
    return outcome;
  }
  public void setOutcome(AddressableEntityRef outcome) {
    this.outcome = outcome;
  }


  /**
   * Represents the max probability reached in the session.
   **/
  public OutcomeEventScore sessionMaxProbability(Float sessionMaxProbability) {
    this.sessionMaxProbability = sessionMaxProbability;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Represents the max probability reached in the session.")
  @JsonProperty("sessionMaxProbability")
  public Float getSessionMaxProbability() {
    return sessionMaxProbability;
  }
  public void setSessionMaxProbability(Float sessionMaxProbability) {
    this.sessionMaxProbability = sessionMaxProbability;
  }


  /**
   * Represents the likelihood of a customer reaching or achieving a given outcome.
   **/
  public OutcomeEventScore probability(Float probability) {
    this.probability = probability;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Represents the likelihood of a customer reaching or achieving a given outcome.")
  @JsonProperty("probability")
  public Float getProbability() {
    return probability;
  }
  public void setProbability(Float probability) {
    this.probability = probability;
  }


  /**
   * Represents the predicted probability's percentile score when compared with all other generated probabilities for a given outcome.
   **/
  public OutcomeEventScore percentile(Integer percentile) {
    this.percentile = percentile;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Represents the predicted probability's percentile score when compared with all other generated probabilities for a given outcome.")
  @JsonProperty("percentile")
  public Integer getPercentile() {
    return percentile;
  }
  public void setPercentile(Integer percentile) {
    this.percentile = percentile;
  }


  /**
   * Represents the maximum likelihood percentile score reached for a given outcome by the current session.
   **/
  public OutcomeEventScore sessionMaxPercentile(Integer sessionMaxPercentile) {
    this.sessionMaxPercentile = sessionMaxPercentile;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Represents the maximum likelihood percentile score reached for a given outcome by the current session.")
  @JsonProperty("sessionMaxPercentile")
  public Integer getSessionMaxPercentile() {
    return sessionMaxPercentile;
  }
  public void setSessionMaxPercentile(Integer sessionMaxPercentile) {
    this.sessionMaxPercentile = sessionMaxPercentile;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OutcomeEventScore outcomeEventScore = (OutcomeEventScore) o;

    return Objects.equals(this.outcome, outcomeEventScore.outcome) &&
            Objects.equals(this.sessionMaxProbability, outcomeEventScore.sessionMaxProbability) &&
            Objects.equals(this.probability, outcomeEventScore.probability) &&
            Objects.equals(this.percentile, outcomeEventScore.percentile) &&
            Objects.equals(this.sessionMaxPercentile, outcomeEventScore.sessionMaxPercentile);
  }

  @Override
  public int hashCode() {
    return Objects.hash(outcome, sessionMaxProbability, probability, percentile, sessionMaxPercentile);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OutcomeEventScore {\n");
    
    sb.append("    outcome: ").append(toIndentedString(outcome)).append("\n");
    sb.append("    sessionMaxProbability: ").append(toIndentedString(sessionMaxProbability)).append("\n");
    sb.append("    probability: ").append(toIndentedString(probability)).append("\n");
    sb.append("    percentile: ").append(toIndentedString(percentile)).append("\n");
    sb.append("    sessionMaxPercentile: ").append(toIndentedString(sessionMaxPercentile)).append("\n");
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

