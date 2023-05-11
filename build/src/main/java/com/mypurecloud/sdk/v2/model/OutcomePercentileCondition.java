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

import java.io.Serializable;
/**
 * OutcomePercentileCondition
 */

public class OutcomePercentileCondition  implements Serializable {
  
  private String outcomeId = null;
  private Float maximumPercentile = null;
  private Float fallbackPercentile = null;

  
  /**
   * The outcome ID.
   **/
  public OutcomePercentileCondition outcomeId(String outcomeId) {
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
   * Percentile value for the selected outcome, at or above which the action map will trigger.
   **/
  public OutcomePercentileCondition maximumPercentile(Float maximumPercentile) {
    this.maximumPercentile = maximumPercentile;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Percentile value for the selected outcome, at or above which the action map will trigger.")
  @JsonProperty("maximumPercentile")
  public Float getMaximumPercentile() {
    return maximumPercentile;
  }
  public void setMaximumPercentile(Float maximumPercentile) {
    this.maximumPercentile = maximumPercentile;
  }


  /**
   * Additional percentile condition, where if set, the action map will trigger if the current outcome percentile is lower or equal to the value.
   **/
  public OutcomePercentileCondition fallbackPercentile(Float fallbackPercentile) {
    this.fallbackPercentile = fallbackPercentile;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Additional percentile condition, where if set, the action map will trigger if the current outcome percentile is lower or equal to the value.")
  @JsonProperty("fallbackPercentile")
  public Float getFallbackPercentile() {
    return fallbackPercentile;
  }
  public void setFallbackPercentile(Float fallbackPercentile) {
    this.fallbackPercentile = fallbackPercentile;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OutcomePercentileCondition outcomePercentileCondition = (OutcomePercentileCondition) o;

    return Objects.equals(this.outcomeId, outcomePercentileCondition.outcomeId) &&
            Objects.equals(this.maximumPercentile, outcomePercentileCondition.maximumPercentile) &&
            Objects.equals(this.fallbackPercentile, outcomePercentileCondition.fallbackPercentile);
  }

  @Override
  public int hashCode() {
    return Objects.hash(outcomeId, maximumPercentile, fallbackPercentile);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OutcomePercentileCondition {\n");
    
    sb.append("    outcomeId: ").append(toIndentedString(outcomeId)).append("\n");
    sb.append("    maximumPercentile: ").append(toIndentedString(maximumPercentile)).append("\n");
    sb.append("    fallbackPercentile: ").append(toIndentedString(fallbackPercentile)).append("\n");
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

