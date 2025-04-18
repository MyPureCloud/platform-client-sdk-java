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
 * ActionMapEstimateOutcomeCriteria
 */

public class ActionMapEstimateOutcomeCriteria  implements Serializable {
  
  private String outcomeId = null;
  private Float maxProbability = null;
  private Float probability = null;
  private Float quantile = null;
  private Float maxQuantile = null;

  public ActionMapEstimateOutcomeCriteria() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * ID of outcome.
   **/
  public ActionMapEstimateOutcomeCriteria outcomeId(String outcomeId) {
    this.outcomeId = outcomeId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "ID of outcome.")
  @JsonProperty("outcomeId")
  public String getOutcomeId() {
    return outcomeId;
  }
  public void setOutcomeId(String outcomeId) {
    this.outcomeId = outcomeId;
  }


  /**
   * Probability value for the selected outcome at or above which the action map will trigger.
   **/
  public ActionMapEstimateOutcomeCriteria maxProbability(Float maxProbability) {
    this.maxProbability = maxProbability;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Probability value for the selected outcome at or above which the action map will trigger.")
  @JsonProperty("maxProbability")
  public Float getMaxProbability() {
    return maxProbability;
  }
  public void setMaxProbability(Float maxProbability) {
    this.maxProbability = maxProbability;
  }


  /**
   * Additional probability condition, where if set, the action map will trigger if the current outcome probability is lower or equal to the value.
   **/
  public ActionMapEstimateOutcomeCriteria probability(Float probability) {
    this.probability = probability;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Additional probability condition, where if set, the action map will trigger if the current outcome probability is lower or equal to the value.")
  @JsonProperty("probability")
  public Float getProbability() {
    return probability;
  }
  public void setProbability(Float probability) {
    this.probability = probability;
  }


  /**
   * Represents the quantity of sessions that have a maximum probability less than the predicted probability.
   **/
  public ActionMapEstimateOutcomeCriteria quantile(Float quantile) {
    this.quantile = quantile;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Represents the quantity of sessions that have a maximum probability less than the predicted probability.")
  @JsonProperty("quantile")
  public Float getQuantile() {
    return quantile;
  }
  public void setQuantile(Float quantile) {
    this.quantile = quantile;
  }


  /**
   * Represents the quantity of sessions that have a maximum probability less than the predicted session max probability.
   **/
  public ActionMapEstimateOutcomeCriteria maxQuantile(Float maxQuantile) {
    this.maxQuantile = maxQuantile;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Represents the quantity of sessions that have a maximum probability less than the predicted session max probability.")
  @JsonProperty("maxQuantile")
  public Float getMaxQuantile() {
    return maxQuantile;
  }
  public void setMaxQuantile(Float maxQuantile) {
    this.maxQuantile = maxQuantile;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ActionMapEstimateOutcomeCriteria actionMapEstimateOutcomeCriteria = (ActionMapEstimateOutcomeCriteria) o;

    return Objects.equals(this.outcomeId, actionMapEstimateOutcomeCriteria.outcomeId) &&
            Objects.equals(this.maxProbability, actionMapEstimateOutcomeCriteria.maxProbability) &&
            Objects.equals(this.probability, actionMapEstimateOutcomeCriteria.probability) &&
            Objects.equals(this.quantile, actionMapEstimateOutcomeCriteria.quantile) &&
            Objects.equals(this.maxQuantile, actionMapEstimateOutcomeCriteria.maxQuantile);
  }

  @Override
  public int hashCode() {
    return Objects.hash(outcomeId, maxProbability, probability, quantile, maxQuantile);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ActionMapEstimateOutcomeCriteria {\n");
    
    sb.append("    outcomeId: ").append(toIndentedString(outcomeId)).append("\n");
    sb.append("    maxProbability: ").append(toIndentedString(maxProbability)).append("\n");
    sb.append("    probability: ").append(toIndentedString(probability)).append("\n");
    sb.append("    quantile: ").append(toIndentedString(quantile)).append("\n");
    sb.append("    maxQuantile: ").append(toIndentedString(maxQuantile)).append("\n");
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

