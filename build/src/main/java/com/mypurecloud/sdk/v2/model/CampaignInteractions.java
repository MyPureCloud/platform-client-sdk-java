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
import com.mypurecloud.sdk.v2.model.CampaignInteraction;
import com.mypurecloud.sdk.v2.model.DomainEntityRef;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * CampaignInteractions
 */

public class CampaignInteractions  implements Serializable {
  
  private DomainEntityRef campaign = null;
  private List<CampaignInteraction> pendingInteractions = new ArrayList<CampaignInteraction>();
  private List<CampaignInteraction> proceedingInteractions = new ArrayList<CampaignInteraction>();
  private List<CampaignInteraction> previewingInteractions = new ArrayList<CampaignInteraction>();
  private List<CampaignInteraction> interactingInteractions = new ArrayList<CampaignInteraction>();
  private List<CampaignInteraction> scheduledInteractions = new ArrayList<CampaignInteraction>();

  
  /**
   **/
  public CampaignInteractions campaign(DomainEntityRef campaign) {
    this.campaign = campaign;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("campaign")
  public DomainEntityRef getCampaign() {
    return campaign;
  }
  public void setCampaign(DomainEntityRef campaign) {
    this.campaign = campaign;
  }

  
  /**
   **/
  public CampaignInteractions pendingInteractions(List<CampaignInteraction> pendingInteractions) {
    this.pendingInteractions = pendingInteractions;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("pendingInteractions")
  public List<CampaignInteraction> getPendingInteractions() {
    return pendingInteractions;
  }
  public void setPendingInteractions(List<CampaignInteraction> pendingInteractions) {
    this.pendingInteractions = pendingInteractions;
  }

  
  /**
   **/
  public CampaignInteractions proceedingInteractions(List<CampaignInteraction> proceedingInteractions) {
    this.proceedingInteractions = proceedingInteractions;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("proceedingInteractions")
  public List<CampaignInteraction> getProceedingInteractions() {
    return proceedingInteractions;
  }
  public void setProceedingInteractions(List<CampaignInteraction> proceedingInteractions) {
    this.proceedingInteractions = proceedingInteractions;
  }

  
  /**
   **/
  public CampaignInteractions previewingInteractions(List<CampaignInteraction> previewingInteractions) {
    this.previewingInteractions = previewingInteractions;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("previewingInteractions")
  public List<CampaignInteraction> getPreviewingInteractions() {
    return previewingInteractions;
  }
  public void setPreviewingInteractions(List<CampaignInteraction> previewingInteractions) {
    this.previewingInteractions = previewingInteractions;
  }

  
  /**
   **/
  public CampaignInteractions interactingInteractions(List<CampaignInteraction> interactingInteractions) {
    this.interactingInteractions = interactingInteractions;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("interactingInteractions")
  public List<CampaignInteraction> getInteractingInteractions() {
    return interactingInteractions;
  }
  public void setInteractingInteractions(List<CampaignInteraction> interactingInteractions) {
    this.interactingInteractions = interactingInteractions;
  }

  
  /**
   **/
  public CampaignInteractions scheduledInteractions(List<CampaignInteraction> scheduledInteractions) {
    this.scheduledInteractions = scheduledInteractions;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("scheduledInteractions")
  public List<CampaignInteraction> getScheduledInteractions() {
    return scheduledInteractions;
  }
  public void setScheduledInteractions(List<CampaignInteraction> scheduledInteractions) {
    this.scheduledInteractions = scheduledInteractions;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CampaignInteractions campaignInteractions = (CampaignInteractions) o;
    return Objects.equals(this.campaign, campaignInteractions.campaign) &&
        Objects.equals(this.pendingInteractions, campaignInteractions.pendingInteractions) &&
        Objects.equals(this.proceedingInteractions, campaignInteractions.proceedingInteractions) &&
        Objects.equals(this.previewingInteractions, campaignInteractions.previewingInteractions) &&
        Objects.equals(this.interactingInteractions, campaignInteractions.interactingInteractions) &&
        Objects.equals(this.scheduledInteractions, campaignInteractions.scheduledInteractions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(campaign, pendingInteractions, proceedingInteractions, previewingInteractions, interactingInteractions, scheduledInteractions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignInteractions {\n");
    
    sb.append("    campaign: ").append(toIndentedString(campaign)).append("\n");
    sb.append("    pendingInteractions: ").append(toIndentedString(pendingInteractions)).append("\n");
    sb.append("    proceedingInteractions: ").append(toIndentedString(proceedingInteractions)).append("\n");
    sb.append("    previewingInteractions: ").append(toIndentedString(previewingInteractions)).append("\n");
    sb.append("    interactingInteractions: ").append(toIndentedString(interactingInteractions)).append("\n");
    sb.append("    scheduledInteractions: ").append(toIndentedString(scheduledInteractions)).append("\n");
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

