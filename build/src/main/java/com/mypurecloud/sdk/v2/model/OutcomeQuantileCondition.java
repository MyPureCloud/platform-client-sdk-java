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
 * OutcomeQuantileCondition
 */

public class OutcomeQuantileCondition  implements Serializable {
  
  private String outcomeId = null;
  private Float maxQuantileThreshold = null;
  private Float fallbackQuantileThreshold = null;

  public OutcomeQuantileCondition() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * The outcome ID.
   **/
  public OutcomeQuantileCondition outcomeId(String outcomeId) {
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
   * This Outcome Quantile Condition is met when sessionMaxQuantile of the OutcomeScore is above this value, (unless fallbackQuantile is set). Range 0.00-1.00
   **/
  public OutcomeQuantileCondition maxQuantileThreshold(Float maxQuantileThreshold) {
    this.maxQuantileThreshold = maxQuantileThreshold;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "This Outcome Quantile Condition is met when sessionMaxQuantile of the OutcomeScore is above this value, (unless fallbackQuantile is set). Range 0.00-1.00")
  @JsonProperty("maxQuantileThreshold")
  public Float getMaxQuantileThreshold() {
    return maxQuantileThreshold;
  }
  public void setMaxQuantileThreshold(Float maxQuantileThreshold) {
    this.maxQuantileThreshold = maxQuantileThreshold;
  }


  /**
   * (Optional) If set, this Condition is met when maxQuantileThreshold is met, AND the current quantile of the OutcomeScore is below this fallbackQuantileThreshold. Range 0.00-1.00
   **/
  public OutcomeQuantileCondition fallbackQuantileThreshold(Float fallbackQuantileThreshold) {
    this.fallbackQuantileThreshold = fallbackQuantileThreshold;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "(Optional) If set, this Condition is met when maxQuantileThreshold is met, AND the current quantile of the OutcomeScore is below this fallbackQuantileThreshold. Range 0.00-1.00")
  @JsonProperty("fallbackQuantileThreshold")
  public Float getFallbackQuantileThreshold() {
    return fallbackQuantileThreshold;
  }
  public void setFallbackQuantileThreshold(Float fallbackQuantileThreshold) {
    this.fallbackQuantileThreshold = fallbackQuantileThreshold;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OutcomeQuantileCondition outcomeQuantileCondition = (OutcomeQuantileCondition) o;

    return Objects.equals(this.outcomeId, outcomeQuantileCondition.outcomeId) &&
            Objects.equals(this.maxQuantileThreshold, outcomeQuantileCondition.maxQuantileThreshold) &&
            Objects.equals(this.fallbackQuantileThreshold, outcomeQuantileCondition.fallbackQuantileThreshold);
  }

  @Override
  public int hashCode() {
    return Objects.hash(outcomeId, maxQuantileThreshold, fallbackQuantileThreshold);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OutcomeQuantileCondition {\n");
    
    sb.append("    outcomeId: ").append(toIndentedString(outcomeId)).append("\n");
    sb.append("    maxQuantileThreshold: ").append(toIndentedString(maxQuantileThreshold)).append("\n");
    sb.append("    fallbackQuantileThreshold: ").append(toIndentedString(fallbackQuantileThreshold)).append("\n");
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

