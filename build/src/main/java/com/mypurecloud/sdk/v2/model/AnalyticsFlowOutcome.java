package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

import java.io.Serializable;
/**
 * AnalyticsFlowOutcome
 */

public class AnalyticsFlowOutcome  implements Serializable {
  
  private String flowOutcomeId = null;
  private String flowOutcomeValue = null;
  private String flowOutcome = null;
  private Date flowOutcomeStartTimestamp = null;
  private Date flowOutcomeEndTimestamp = null;

  
  /**
   * Unique identifiers of a flow outcome
   **/
  public AnalyticsFlowOutcome flowOutcomeId(String flowOutcomeId) {
    this.flowOutcomeId = flowOutcomeId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Unique identifiers of a flow outcome")
  @JsonProperty("flowOutcomeId")
  public String getFlowOutcomeId() {
    return flowOutcomeId;
  }
  public void setFlowOutcomeId(String flowOutcomeId) {
    this.flowOutcomeId = flowOutcomeId;
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

  
  /**
   * Colon-separated combinations of unique flow outcome identifier and value
   **/
  public AnalyticsFlowOutcome flowOutcome(String flowOutcome) {
    this.flowOutcome = flowOutcome;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Colon-separated combinations of unique flow outcome identifier and value")
  @JsonProperty("flowOutcome")
  public String getFlowOutcome() {
    return flowOutcome;
  }
  public void setFlowOutcome(String flowOutcome) {
    this.flowOutcome = flowOutcome;
  }

  
  /**
   * Date/time the outcome started. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ
   **/
  public AnalyticsFlowOutcome flowOutcomeStartTimestamp(Date flowOutcomeStartTimestamp) {
    this.flowOutcomeStartTimestamp = flowOutcomeStartTimestamp;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Date/time the outcome started. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ")
  @JsonProperty("flowOutcomeStartTimestamp")
  public Date getFlowOutcomeStartTimestamp() {
    return flowOutcomeStartTimestamp;
  }
  public void setFlowOutcomeStartTimestamp(Date flowOutcomeStartTimestamp) {
    this.flowOutcomeStartTimestamp = flowOutcomeStartTimestamp;
  }

  
  /**
   * Date/time the outcome ended. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ
   **/
  public AnalyticsFlowOutcome flowOutcomeEndTimestamp(Date flowOutcomeEndTimestamp) {
    this.flowOutcomeEndTimestamp = flowOutcomeEndTimestamp;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Date/time the outcome ended. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ")
  @JsonProperty("flowOutcomeEndTimestamp")
  public Date getFlowOutcomeEndTimestamp() {
    return flowOutcomeEndTimestamp;
  }
  public void setFlowOutcomeEndTimestamp(Date flowOutcomeEndTimestamp) {
    this.flowOutcomeEndTimestamp = flowOutcomeEndTimestamp;
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
    return Objects.equals(this.flowOutcomeId, analyticsFlowOutcome.flowOutcomeId) &&
        Objects.equals(this.flowOutcomeValue, analyticsFlowOutcome.flowOutcomeValue) &&
        Objects.equals(this.flowOutcome, analyticsFlowOutcome.flowOutcome) &&
        Objects.equals(this.flowOutcomeStartTimestamp, analyticsFlowOutcome.flowOutcomeStartTimestamp) &&
        Objects.equals(this.flowOutcomeEndTimestamp, analyticsFlowOutcome.flowOutcomeEndTimestamp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(flowOutcomeId, flowOutcomeValue, flowOutcome, flowOutcomeStartTimestamp, flowOutcomeEndTimestamp);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AnalyticsFlowOutcome {\n");
    
    sb.append("    flowOutcomeId: ").append(toIndentedString(flowOutcomeId)).append("\n");
    sb.append("    flowOutcomeValue: ").append(toIndentedString(flowOutcomeValue)).append("\n");
    sb.append("    flowOutcome: ").append(toIndentedString(flowOutcome)).append("\n");
    sb.append("    flowOutcomeStartTimestamp: ").append(toIndentedString(flowOutcomeStartTimestamp)).append("\n");
    sb.append("    flowOutcomeEndTimestamp: ").append(toIndentedString(flowOutcomeEndTimestamp)).append("\n");
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

