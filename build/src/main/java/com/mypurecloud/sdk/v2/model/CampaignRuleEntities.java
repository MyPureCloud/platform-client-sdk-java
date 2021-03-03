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
import com.mypurecloud.sdk.v2.model.DomainEntityRef;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * CampaignRuleEntities
 */

public class CampaignRuleEntities  implements Serializable {
  
  private List<DomainEntityRef> campaigns = new ArrayList<DomainEntityRef>();
  private List<DomainEntityRef> sequences = new ArrayList<DomainEntityRef>();

  
  /**
   * The list of campaigns for a CampaignRule to monitor. Required if the CampaignRule has any conditions that run on a campaign.
   **/
  public CampaignRuleEntities campaigns(List<DomainEntityRef> campaigns) {
    this.campaigns = campaigns;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The list of campaigns for a CampaignRule to monitor. Required if the CampaignRule has any conditions that run on a campaign.")
  @JsonProperty("campaigns")
  public List<DomainEntityRef> getCampaigns() {
    return campaigns;
  }
  public void setCampaigns(List<DomainEntityRef> campaigns) {
    this.campaigns = campaigns;
  }

  
  /**
   * The list of sequences for a CampaignRule to monitor. Required if the CampaignRule has any conditions that run on a sequence.
   **/
  public CampaignRuleEntities sequences(List<DomainEntityRef> sequences) {
    this.sequences = sequences;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The list of sequences for a CampaignRule to monitor. Required if the CampaignRule has any conditions that run on a sequence.")
  @JsonProperty("sequences")
  public List<DomainEntityRef> getSequences() {
    return sequences;
  }
  public void setSequences(List<DomainEntityRef> sequences) {
    this.sequences = sequences;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CampaignRuleEntities campaignRuleEntities = (CampaignRuleEntities) o;
    return Objects.equals(this.campaigns, campaignRuleEntities.campaigns) &&
        Objects.equals(this.sequences, campaignRuleEntities.sequences);
  }

  @Override
  public int hashCode() {
    return Objects.hash(campaigns, sequences);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignRuleEntities {\n");
    
    sb.append("    campaigns: ").append(toIndentedString(campaigns)).append("\n");
    sb.append("    sequences: ").append(toIndentedString(sequences)).append("\n");
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

