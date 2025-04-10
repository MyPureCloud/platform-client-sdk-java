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
import com.mypurecloud.sdk.v2.model.AddressableEntityRef;
import com.mypurecloud.sdk.v2.model.CampaignOutboundLinesAllocation;
import com.mypurecloud.sdk.v2.model.CampaignOutboundLinesReservation;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * Lines distribution information or Campaign&#39;s Edge Group or Site
 */
@ApiModel(description = "Lines distribution information or Campaign's Edge Group or Site")

public class CampaignOutboundLinesDistribution  implements Serializable {
  
  private AddressableEntityRef campaign = null;
  private Integer maxOutboundLineCount = null;
  private BigDecimal maxLineUtilization = null;
  private Integer availableOutboundLines = null;
  private Integer reservedLines = null;
  private List<CampaignOutboundLinesReservation> campaignsWithReservedLines = null;
  private List<CampaignOutboundLinesAllocation> campaignsWithDynamicallyAllocatedLines = null;

  public CampaignOutboundLinesDistribution() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      campaignsWithReservedLines = new ArrayList<CampaignOutboundLinesReservation>();
      campaignsWithDynamicallyAllocatedLines = new ArrayList<CampaignOutboundLinesAllocation>();
    }
  }

  
  /**
   * The Campaign for which dialing group distribution information was requested
   **/
  public CampaignOutboundLinesDistribution campaign(AddressableEntityRef campaign) {
    this.campaign = campaign;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The Campaign for which dialing group distribution information was requested")
  @JsonProperty("campaign")
  public AddressableEntityRef getCampaign() {
    return campaign;
  }
  public void setCampaign(AddressableEntityRef campaign) {
    this.campaign = campaign;
  }


  /**
   * Maximum outbound calls that can be placed for Campaign's Edge Group or Site
   **/
  public CampaignOutboundLinesDistribution maxOutboundLineCount(Integer maxOutboundLineCount) {
    this.maxOutboundLineCount = maxOutboundLineCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Maximum outbound calls that can be placed for Campaign's Edge Group or Site")
  @JsonProperty("maxOutboundLineCount")
  public Integer getMaxOutboundLineCount() {
    return maxOutboundLineCount;
  }
  public void setMaxOutboundLineCount(Integer maxOutboundLineCount) {
    this.maxOutboundLineCount = maxOutboundLineCount;
  }


  /**
   * Maximum ratio of dialer calls to Campaign's Edge Group or Site capacity
   **/
  public CampaignOutboundLinesDistribution maxLineUtilization(BigDecimal maxLineUtilization) {
    this.maxLineUtilization = maxLineUtilization;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Maximum ratio of dialer calls to Campaign's Edge Group or Site capacity")
  @JsonProperty("maxLineUtilization")
  public BigDecimal getMaxLineUtilization() {
    return maxLineUtilization;
  }
  public void setMaxLineUtilization(BigDecimal maxLineUtilization) {
    this.maxLineUtilization = maxLineUtilization;
  }


  /**
   * Number of available outbound lines in Campaign's Edge Group or Site
   **/
  public CampaignOutboundLinesDistribution availableOutboundLines(Integer availableOutboundLines) {
    this.availableOutboundLines = availableOutboundLines;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Number of available outbound lines in Campaign's Edge Group or Site")
  @JsonProperty("availableOutboundLines")
  public Integer getAvailableOutboundLines() {
    return availableOutboundLines;
  }
  public void setAvailableOutboundLines(Integer availableOutboundLines) {
    this.availableOutboundLines = availableOutboundLines;
  }


  /**
   * Number of reserved outbound lines in Campaign's Edge Group or Site
   **/
  public CampaignOutboundLinesDistribution reservedLines(Integer reservedLines) {
    this.reservedLines = reservedLines;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Number of reserved outbound lines in Campaign's Edge Group or Site")
  @JsonProperty("reservedLines")
  public Integer getReservedLines() {
    return reservedLines;
  }
  public void setReservedLines(Integer reservedLines) {
    this.reservedLines = reservedLines;
  }


  /**
   * Information about campaigns with reserving lines in Campaign's Edge Group or Site
   **/
  public CampaignOutboundLinesDistribution campaignsWithReservedLines(List<CampaignOutboundLinesReservation> campaignsWithReservedLines) {
    this.campaignsWithReservedLines = campaignsWithReservedLines;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Information about campaigns with reserving lines in Campaign's Edge Group or Site")
  @JsonProperty("campaignsWithReservedLines")
  public List<CampaignOutboundLinesReservation> getCampaignsWithReservedLines() {
    return campaignsWithReservedLines;
  }
  public void setCampaignsWithReservedLines(List<CampaignOutboundLinesReservation> campaignsWithReservedLines) {
    this.campaignsWithReservedLines = campaignsWithReservedLines;
  }


  /**
   * Information about campaigns using dynamic lines allocation in Campaign's Edge Group or Site
   **/
  public CampaignOutboundLinesDistribution campaignsWithDynamicallyAllocatedLines(List<CampaignOutboundLinesAllocation> campaignsWithDynamicallyAllocatedLines) {
    this.campaignsWithDynamicallyAllocatedLines = campaignsWithDynamicallyAllocatedLines;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Information about campaigns using dynamic lines allocation in Campaign's Edge Group or Site")
  @JsonProperty("campaignsWithDynamicallyAllocatedLines")
  public List<CampaignOutboundLinesAllocation> getCampaignsWithDynamicallyAllocatedLines() {
    return campaignsWithDynamicallyAllocatedLines;
  }
  public void setCampaignsWithDynamicallyAllocatedLines(List<CampaignOutboundLinesAllocation> campaignsWithDynamicallyAllocatedLines) {
    this.campaignsWithDynamicallyAllocatedLines = campaignsWithDynamicallyAllocatedLines;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CampaignOutboundLinesDistribution campaignOutboundLinesDistribution = (CampaignOutboundLinesDistribution) o;

    return Objects.equals(this.campaign, campaignOutboundLinesDistribution.campaign) &&
            Objects.equals(this.maxOutboundLineCount, campaignOutboundLinesDistribution.maxOutboundLineCount) &&
            Objects.equals(this.maxLineUtilization, campaignOutboundLinesDistribution.maxLineUtilization) &&
            Objects.equals(this.availableOutboundLines, campaignOutboundLinesDistribution.availableOutboundLines) &&
            Objects.equals(this.reservedLines, campaignOutboundLinesDistribution.reservedLines) &&
            Objects.equals(this.campaignsWithReservedLines, campaignOutboundLinesDistribution.campaignsWithReservedLines) &&
            Objects.equals(this.campaignsWithDynamicallyAllocatedLines, campaignOutboundLinesDistribution.campaignsWithDynamicallyAllocatedLines);
  }

  @Override
  public int hashCode() {
    return Objects.hash(campaign, maxOutboundLineCount, maxLineUtilization, availableOutboundLines, reservedLines, campaignsWithReservedLines, campaignsWithDynamicallyAllocatedLines);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignOutboundLinesDistribution {\n");
    
    sb.append("    campaign: ").append(toIndentedString(campaign)).append("\n");
    sb.append("    maxOutboundLineCount: ").append(toIndentedString(maxOutboundLineCount)).append("\n");
    sb.append("    maxLineUtilization: ").append(toIndentedString(maxLineUtilization)).append("\n");
    sb.append("    availableOutboundLines: ").append(toIndentedString(availableOutboundLines)).append("\n");
    sb.append("    reservedLines: ").append(toIndentedString(reservedLines)).append("\n");
    sb.append("    campaignsWithReservedLines: ").append(toIndentedString(campaignsWithReservedLines)).append("\n");
    sb.append("    campaignsWithDynamicallyAllocatedLines: ").append(toIndentedString(campaignsWithDynamicallyAllocatedLines)).append("\n");
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

