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
 * OutcomeProbabilityCondition
 */

public class OutcomeProbabilityCondition  implements Serializable {
  
  private String outcomeId = null;
  private Float maximumProbability = null;
  private Float probability = null;

  
  /**
   * The outcome ID.
   **/
  public OutcomeProbabilityCondition outcomeId(String outcomeId) {
    this.outcomeId = outcomeId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The outcome ID.")
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
  public OutcomeProbabilityCondition maximumProbability(Float maximumProbability) {
    this.maximumProbability = maximumProbability;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Probability value for the selected outcome at or above which the action map will trigger.")
  @JsonProperty("maximumProbability")
  public Float getMaximumProbability() {
    return maximumProbability;
  }
  public void setMaximumProbability(Float maximumProbability) {
    this.maximumProbability = maximumProbability;
  }

  
  /**
   * Additional probability condition, where if set, the action map will trigger if the current outcome probability is lower or equal to the value.
   **/
  public OutcomeProbabilityCondition probability(Float probability) {
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

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OutcomeProbabilityCondition outcomeProbabilityCondition = (OutcomeProbabilityCondition) o;
    return Objects.equals(this.outcomeId, outcomeProbabilityCondition.outcomeId) &&
        Objects.equals(this.maximumProbability, outcomeProbabilityCondition.maximumProbability) &&
        Objects.equals(this.probability, outcomeProbabilityCondition.probability);
  }

  @Override
  public int hashCode() {
    return Objects.hash(outcomeId, maximumProbability, probability);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OutcomeProbabilityCondition {\n");
    
    sb.append("    outcomeId: ").append(toIndentedString(outcomeId)).append("\n");
    sb.append("    maximumProbability: ").append(toIndentedString(maximumProbability)).append("\n");
    sb.append("    probability: ").append(toIndentedString(probability)).append("\n");
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

