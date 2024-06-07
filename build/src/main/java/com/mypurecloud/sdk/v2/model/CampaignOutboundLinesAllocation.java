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
import com.mypurecloud.sdk.v2.model.DomainEntityRef;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * CampaignOutboundLinesAllocation
 */

public class CampaignOutboundLinesAllocation  implements Serializable {
  
  private DomainEntityRef campaign = null;
  private Integer campaignWeight = null;
  private Integer linesAssigned = null;
  private Boolean legacyWeight = null;

  
  /**
   * The Campaign
   **/
  public CampaignOutboundLinesAllocation campaign(DomainEntityRef campaign) {
    this.campaign = campaign;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The Campaign")
  @JsonProperty("campaign")
  public DomainEntityRef getCampaign() {
    return campaign;
  }
  public void setCampaign(DomainEntityRef campaign) {
    this.campaign = campaign;
  }


  /**
   * The relative weight of the campaign
   **/
  public CampaignOutboundLinesAllocation campaignWeight(Integer campaignWeight) {
    this.campaignWeight = campaignWeight;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The relative weight of the campaign")
  @JsonProperty("campaignWeight")
  public Integer getCampaignWeight() {
    return campaignWeight;
  }
  public void setCampaignWeight(Integer campaignWeight) {
    this.campaignWeight = campaignWeight;
  }


  /**
   * The number of lines dynamically assigned to the campaign
   **/
  public CampaignOutboundLinesAllocation linesAssigned(Integer linesAssigned) {
    this.linesAssigned = linesAssigned;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The number of lines dynamically assigned to the campaign")
  @JsonProperty("linesAssigned")
  public Integer getLinesAssigned() {
    return linesAssigned;
  }
  public void setLinesAssigned(Integer linesAssigned) {
    this.linesAssigned = linesAssigned;
  }


  /**
   * true if relative weight of the campaign is not explicitly specified, false otherwise
   **/
  public CampaignOutboundLinesAllocation legacyWeight(Boolean legacyWeight) {
    this.legacyWeight = legacyWeight;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "true if relative weight of the campaign is not explicitly specified, false otherwise")
  @JsonProperty("legacyWeight")
  public Boolean getLegacyWeight() {
    return legacyWeight;
  }
  public void setLegacyWeight(Boolean legacyWeight) {
    this.legacyWeight = legacyWeight;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CampaignOutboundLinesAllocation campaignOutboundLinesAllocation = (CampaignOutboundLinesAllocation) o;

    return Objects.equals(this.campaign, campaignOutboundLinesAllocation.campaign) &&
            Objects.equals(this.campaignWeight, campaignOutboundLinesAllocation.campaignWeight) &&
            Objects.equals(this.linesAssigned, campaignOutboundLinesAllocation.linesAssigned) &&
            Objects.equals(this.legacyWeight, campaignOutboundLinesAllocation.legacyWeight);
  }

  @Override
  public int hashCode() {
    return Objects.hash(campaign, campaignWeight, linesAssigned, legacyWeight);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignOutboundLinesAllocation {\n");
    
    sb.append("    campaign: ").append(toIndentedString(campaign)).append("\n");
    sb.append("    campaignWeight: ").append(toIndentedString(campaignWeight)).append("\n");
    sb.append("    linesAssigned: ").append(toIndentedString(linesAssigned)).append("\n");
    sb.append("    legacyWeight: ").append(toIndentedString(legacyWeight)).append("\n");
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

