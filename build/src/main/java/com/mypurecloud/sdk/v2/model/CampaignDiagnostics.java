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
import com.mypurecloud.sdk.v2.model.CallableContactsDiagnostic;
import com.mypurecloud.sdk.v2.model.QueueUtilizationDiagnostic;
import com.mypurecloud.sdk.v2.model.RuleSetDiagnostic;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * CampaignDiagnostics
 */

public class CampaignDiagnostics  implements Serializable {
  
  private CallableContactsDiagnostic callableContacts = null;
  private QueueUtilizationDiagnostic queueUtilizationDiagnostic = null;
  private List<RuleSetDiagnostic> ruleSetDiagnostics = new ArrayList<RuleSetDiagnostic>();
  private Integer outstandingInteractionsCount = null;
  private Integer scheduledInteractionsCount = null;

  
  @ApiModelProperty(example = "null", value = "Campaign properties that can impact which contacts are callable")
  @JsonProperty("callableContacts")
  public CallableContactsDiagnostic getCallableContacts() {
    return callableContacts;
  }

  
  @ApiModelProperty(example = "null", value = "Information regarding the campaign's queue")
  @JsonProperty("queueUtilizationDiagnostic")
  public QueueUtilizationDiagnostic getQueueUtilizationDiagnostic() {
    return queueUtilizationDiagnostic;
  }

  
  @ApiModelProperty(example = "null", value = "Information regarding the campaign's rule sets")
  @JsonProperty("ruleSetDiagnostics")
  public List<RuleSetDiagnostic> getRuleSetDiagnostics() {
    return ruleSetDiagnostics;
  }

  
  @ApiModelProperty(example = "null", value = "Current number of outstanding interactions on the campaign")
  @JsonProperty("outstandingInteractionsCount")
  public Integer getOutstandingInteractionsCount() {
    return outstandingInteractionsCount;
  }

  
  @ApiModelProperty(example = "null", value = "Current number of scheduled interactions on the campaign")
  @JsonProperty("scheduledInteractionsCount")
  public Integer getScheduledInteractionsCount() {
    return scheduledInteractionsCount;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CampaignDiagnostics campaignDiagnostics = (CampaignDiagnostics) o;
    return Objects.equals(this.callableContacts, campaignDiagnostics.callableContacts) &&
        Objects.equals(this.queueUtilizationDiagnostic, campaignDiagnostics.queueUtilizationDiagnostic) &&
        Objects.equals(this.ruleSetDiagnostics, campaignDiagnostics.ruleSetDiagnostics) &&
        Objects.equals(this.outstandingInteractionsCount, campaignDiagnostics.outstandingInteractionsCount) &&
        Objects.equals(this.scheduledInteractionsCount, campaignDiagnostics.scheduledInteractionsCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(callableContacts, queueUtilizationDiagnostic, ruleSetDiagnostics, outstandingInteractionsCount, scheduledInteractionsCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignDiagnostics {\n");
    
    sb.append("    callableContacts: ").append(toIndentedString(callableContacts)).append("\n");
    sb.append("    queueUtilizationDiagnostic: ").append(toIndentedString(queueUtilizationDiagnostic)).append("\n");
    sb.append("    ruleSetDiagnostics: ").append(toIndentedString(ruleSetDiagnostics)).append("\n");
    sb.append("    outstandingInteractionsCount: ").append(toIndentedString(outstandingInteractionsCount)).append("\n");
    sb.append("    scheduledInteractionsCount: ").append(toIndentedString(scheduledInteractionsCount)).append("\n");
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

