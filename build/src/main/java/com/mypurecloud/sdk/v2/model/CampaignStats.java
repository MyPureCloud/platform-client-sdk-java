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
import com.mypurecloud.sdk.v2.model.CampaignBusinessCategoryMetrics;
import com.mypurecloud.sdk.v2.model.CampaignLinesUtilization;
import com.mypurecloud.sdk.v2.model.ConnectRate;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * CampaignStats
 */

public class CampaignStats  implements Serializable {
  
  private ConnectRate contactRate = null;
  private Integer idleAgents = null;
  private Double effectiveIdleAgents = null;
  private Double adjustedCallsPerAgent = null;
  private Integer outstandingCalls = null;
  private Integer scheduledCalls = null;
  private Integer timeZoneRescheduledCalls = null;
  private Integer filteredOutContactsCount = null;
  private Integer rightPartyContactsCount = null;
  private Integer validAttempts = null;
  private CampaignLinesUtilization linesUtilization = null;
  private CampaignBusinessCategoryMetrics businessCategoryMetrics = null;

  public CampaignStats() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  @ApiModelProperty(example = "null", value = "Information regarding the campaign's connect rate")
  @JsonProperty("contactRate")
  public ConnectRate getContactRate() {
    return contactRate;
  }


  @ApiModelProperty(example = "null", value = "Number of available agents not currently being utilized")
  @JsonProperty("idleAgents")
  public Integer getIdleAgents() {
    return idleAgents;
  }


  @ApiModelProperty(example = "null", value = "Number of effective available agents not currently being utilized")
  @JsonProperty("effectiveIdleAgents")
  public Double getEffectiveIdleAgents() {
    return effectiveIdleAgents;
  }


  @ApiModelProperty(example = "null", value = "Calls per agent adjusted by pace")
  @JsonProperty("adjustedCallsPerAgent")
  public Double getAdjustedCallsPerAgent() {
    return adjustedCallsPerAgent;
  }


  @ApiModelProperty(example = "null", value = "Number of campaign calls currently ongoing")
  @JsonProperty("outstandingCalls")
  public Integer getOutstandingCalls() {
    return outstandingCalls;
  }


  @ApiModelProperty(example = "null", value = "Number of campaign calls currently scheduled")
  @JsonProperty("scheduledCalls")
  public Integer getScheduledCalls() {
    return scheduledCalls;
  }


  @ApiModelProperty(example = "null", value = "Number of campaign calls currently timezone rescheduled")
  @JsonProperty("timeZoneRescheduledCalls")
  public Integer getTimeZoneRescheduledCalls() {
    return timeZoneRescheduledCalls;
  }


  @ApiModelProperty(example = "null", value = "Number of contacts that don't match filter. This is currently supported only for Campaigns with dynamic filter on.")
  @JsonProperty("filteredOutContactsCount")
  public Integer getFilteredOutContactsCount() {
    return filteredOutContactsCount;
  }


  @ApiModelProperty(example = "null", value = "Information on the campaign's number of Right Party Contacts")
  @JsonProperty("rightPartyContactsCount")
  public Integer getRightPartyContactsCount() {
    return rightPartyContactsCount;
  }


  @ApiModelProperty(example = "null", value = "Information on the campaign's valid attempts")
  @JsonProperty("validAttempts")
  public Integer getValidAttempts() {
    return validAttempts;
  }


  @ApiModelProperty(example = "null", value = "Information on the campaign's lines utilization")
  @JsonProperty("linesUtilization")
  public CampaignLinesUtilization getLinesUtilization() {
    return linesUtilization;
  }


  @ApiModelProperty(example = "null", value = "Information on the campaign's business category metrics")
  @JsonProperty("businessCategoryMetrics")
  public CampaignBusinessCategoryMetrics getBusinessCategoryMetrics() {
    return businessCategoryMetrics;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CampaignStats campaignStats = (CampaignStats) o;

    return Objects.equals(this.contactRate, campaignStats.contactRate) &&
            Objects.equals(this.idleAgents, campaignStats.idleAgents) &&
            Objects.equals(this.effectiveIdleAgents, campaignStats.effectiveIdleAgents) &&
            Objects.equals(this.adjustedCallsPerAgent, campaignStats.adjustedCallsPerAgent) &&
            Objects.equals(this.outstandingCalls, campaignStats.outstandingCalls) &&
            Objects.equals(this.scheduledCalls, campaignStats.scheduledCalls) &&
            Objects.equals(this.timeZoneRescheduledCalls, campaignStats.timeZoneRescheduledCalls) &&
            Objects.equals(this.filteredOutContactsCount, campaignStats.filteredOutContactsCount) &&
            Objects.equals(this.rightPartyContactsCount, campaignStats.rightPartyContactsCount) &&
            Objects.equals(this.validAttempts, campaignStats.validAttempts) &&
            Objects.equals(this.linesUtilization, campaignStats.linesUtilization) &&
            Objects.equals(this.businessCategoryMetrics, campaignStats.businessCategoryMetrics);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contactRate, idleAgents, effectiveIdleAgents, adjustedCallsPerAgent, outstandingCalls, scheduledCalls, timeZoneRescheduledCalls, filteredOutContactsCount, rightPartyContactsCount, validAttempts, linesUtilization, businessCategoryMetrics);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignStats {\n");
    
    sb.append("    contactRate: ").append(toIndentedString(contactRate)).append("\n");
    sb.append("    idleAgents: ").append(toIndentedString(idleAgents)).append("\n");
    sb.append("    effectiveIdleAgents: ").append(toIndentedString(effectiveIdleAgents)).append("\n");
    sb.append("    adjustedCallsPerAgent: ").append(toIndentedString(adjustedCallsPerAgent)).append("\n");
    sb.append("    outstandingCalls: ").append(toIndentedString(outstandingCalls)).append("\n");
    sb.append("    scheduledCalls: ").append(toIndentedString(scheduledCalls)).append("\n");
    sb.append("    timeZoneRescheduledCalls: ").append(toIndentedString(timeZoneRescheduledCalls)).append("\n");
    sb.append("    filteredOutContactsCount: ").append(toIndentedString(filteredOutContactsCount)).append("\n");
    sb.append("    rightPartyContactsCount: ").append(toIndentedString(rightPartyContactsCount)).append("\n");
    sb.append("    validAttempts: ").append(toIndentedString(validAttempts)).append("\n");
    sb.append("    linesUtilization: ").append(toIndentedString(linesUtilization)).append("\n");
    sb.append("    businessCategoryMetrics: ").append(toIndentedString(businessCategoryMetrics)).append("\n");
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

