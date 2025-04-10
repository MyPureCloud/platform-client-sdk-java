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
import com.mypurecloud.sdk.v2.model.OutcomeRefRequest;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * OutcomePredictorRequest
 */

public class OutcomePredictorRequest  implements Serializable {
  
  private OutcomeRefRequest outcome = null;

  public OutcomePredictorRequest() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * The outcome for which this predictor will provide predictions.
   **/
  public OutcomePredictorRequest outcome(OutcomeRefRequest outcome) {
    this.outcome = outcome;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The outcome for which this predictor will provide predictions.")
  @JsonProperty("outcome")
  public OutcomeRefRequest getOutcome() {
    return outcome;
  }
  public void setOutcome(OutcomeRefRequest outcome) {
    this.outcome = outcome;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OutcomePredictorRequest outcomePredictorRequest = (OutcomePredictorRequest) o;

    return Objects.equals(this.outcome, outcomePredictorRequest.outcome);
  }

  @Override
  public int hashCode() {
    return Objects.hash(outcome);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OutcomePredictorRequest {\n");
    
    sb.append("    outcome: ").append(toIndentedString(outcome)).append("\n");
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

