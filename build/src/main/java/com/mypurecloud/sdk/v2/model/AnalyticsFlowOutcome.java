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
import java.util.Date;

import java.io.Serializable;
/**
 * AnalyticsFlowOutcome
 */

public class AnalyticsFlowOutcome  implements Serializable {
  
  private String flowOutcome = null;
  private Date flowOutcomeEndTimestamp = null;
  private String flowOutcomeId = null;
  private Date flowOutcomeStartTimestamp = null;
  private String flowOutcomeValue = null;

  
  /**
   * Combination of unique flow outcome identifier and its value separated by colon
   **/
  public AnalyticsFlowOutcome flowOutcome(String flowOutcome) {
    this.flowOutcome = flowOutcome;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Combination of unique flow outcome identifier and its value separated by colon")
  @JsonProperty("flowOutcome")
  public String getFlowOutcome() {
    return flowOutcome;
  }
  public void setFlowOutcome(String flowOutcome) {
    this.flowOutcome = flowOutcome;
  }

  
  /**
   * The outcome ending timestamp in ISO 8601 format. This may be null if the outcome did not succeed.
   **/
  public AnalyticsFlowOutcome flowOutcomeEndTimestamp(Date flowOutcomeEndTimestamp) {
    this.flowOutcomeEndTimestamp = flowOutcomeEndTimestamp;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The outcome ending timestamp in ISO 8601 format. This may be null if the outcome did not succeed.")
  @JsonProperty("flowOutcomeEndTimestamp")
  public Date getFlowOutcomeEndTimestamp() {
    return flowOutcomeEndTimestamp;
  }
  public void setFlowOutcomeEndTimestamp(Date flowOutcomeEndTimestamp) {
    this.flowOutcomeEndTimestamp = flowOutcomeEndTimestamp;
  }

  
  /**
   * Unique identifier of a flow outcome
   **/
  public AnalyticsFlowOutcome flowOutcomeId(String flowOutcomeId) {
    this.flowOutcomeId = flowOutcomeId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Unique identifier of a flow outcome")
  @JsonProperty("flowOutcomeId")
  public String getFlowOutcomeId() {
    return flowOutcomeId;
  }
  public void setFlowOutcomeId(String flowOutcomeId) {
    this.flowOutcomeId = flowOutcomeId;
  }

  
  /**
   * The outcome starting timestamp in ISO 8601 format
   **/
  public AnalyticsFlowOutcome flowOutcomeStartTimestamp(Date flowOutcomeStartTimestamp) {
    this.flowOutcomeStartTimestamp = flowOutcomeStartTimestamp;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The outcome starting timestamp in ISO 8601 format")
  @JsonProperty("flowOutcomeStartTimestamp")
  public Date getFlowOutcomeStartTimestamp() {
    return flowOutcomeStartTimestamp;
  }
  public void setFlowOutcomeStartTimestamp(Date flowOutcomeStartTimestamp) {
    this.flowOutcomeStartTimestamp = flowOutcomeStartTimestamp;
  }

  
  /**
   * Flow outcome value, e.g. SUCCESS
   **/
  public AnalyticsFlowOutcome flowOutcomeValue(String flowOutcomeValue) {
    this.flowOutcomeValue = flowOutcomeValue;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Flow outcome value, e.g. SUCCESS")
  @JsonProperty("flowOutcomeValue")
  public String getFlowOutcomeValue() {
    return flowOutcomeValue;
  }
  public void setFlowOutcomeValue(String flowOutcomeValue) {
    this.flowOutcomeValue = flowOutcomeValue;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AnalyticsFlowOutcome analyticsFlowOutcome = (AnalyticsFlowOutcome) o;
    return Objects.equals(this.flowOutcome, analyticsFlowOutcome.flowOutcome) &&
        Objects.equals(this.flowOutcomeEndTimestamp, analyticsFlowOutcome.flowOutcomeEndTimestamp) &&
        Objects.equals(this.flowOutcomeId, analyticsFlowOutcome.flowOutcomeId) &&
        Objects.equals(this.flowOutcomeStartTimestamp, analyticsFlowOutcome.flowOutcomeStartTimestamp) &&
        Objects.equals(this.flowOutcomeValue, analyticsFlowOutcome.flowOutcomeValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(flowOutcome, flowOutcomeEndTimestamp, flowOutcomeId, flowOutcomeStartTimestamp, flowOutcomeValue);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AnalyticsFlowOutcome {\n");
    
    sb.append("    flowOutcome: ").append(toIndentedString(flowOutcome)).append("\n");
    sb.append("    flowOutcomeEndTimestamp: ").append(toIndentedString(flowOutcomeEndTimestamp)).append("\n");
    sb.append("    flowOutcomeId: ").append(toIndentedString(flowOutcomeId)).append("\n");
    sb.append("    flowOutcomeStartTimestamp: ").append(toIndentedString(flowOutcomeStartTimestamp)).append("\n");
    sb.append("    flowOutcomeValue: ").append(toIndentedString(flowOutcomeValue)).append("\n");
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

