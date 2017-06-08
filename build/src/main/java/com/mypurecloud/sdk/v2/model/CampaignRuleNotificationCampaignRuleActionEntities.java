package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.mypurecloud.sdk.v2.model.CampaignRuleNotificationUriReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * CampaignRuleNotificationCampaignRuleActionEntities
 */

public class CampaignRuleNotificationCampaignRuleActionEntities  implements Serializable {
  
  private List<CampaignRuleNotificationUriReference> campaigns = new ArrayList<CampaignRuleNotificationUriReference>();
  private List<CampaignRuleNotificationUriReference> sequences = new ArrayList<CampaignRuleNotificationUriReference>();
  private Boolean useTriggeringEntity = null;
  private Object additionalProperties = null;

  
  /**
   **/
  public CampaignRuleNotificationCampaignRuleActionEntities campaigns(List<CampaignRuleNotificationUriReference> campaigns) {
    this.campaigns = campaigns;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("campaigns")
  public List<CampaignRuleNotificationUriReference> getCampaigns() {
    return campaigns;
  }
  public void setCampaigns(List<CampaignRuleNotificationUriReference> campaigns) {
    this.campaigns = campaigns;
  }

  
  /**
   **/
  public CampaignRuleNotificationCampaignRuleActionEntities sequences(List<CampaignRuleNotificationUriReference> sequences) {
    this.sequences = sequences;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("sequences")
  public List<CampaignRuleNotificationUriReference> getSequences() {
    return sequences;
  }
  public void setSequences(List<CampaignRuleNotificationUriReference> sequences) {
    this.sequences = sequences;
  }

  
  /**
   **/
  public CampaignRuleNotificationCampaignRuleActionEntities useTriggeringEntity(Boolean useTriggeringEntity) {
    this.useTriggeringEntity = useTriggeringEntity;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("useTriggeringEntity")
  public Boolean getUseTriggeringEntity() {
    return useTriggeringEntity;
  }
  public void setUseTriggeringEntity(Boolean useTriggeringEntity) {
    this.useTriggeringEntity = useTriggeringEntity;
  }

  
  /**
   **/
  public CampaignRuleNotificationCampaignRuleActionEntities additionalProperties(Object additionalProperties) {
    this.additionalProperties = additionalProperties;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("additionalProperties")
  public Object getAdditionalProperties() {
    return additionalProperties;
  }
  public void setAdditionalProperties(Object additionalProperties) {
    this.additionalProperties = additionalProperties;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CampaignRuleNotificationCampaignRuleActionEntities campaignRuleNotificationCampaignRuleActionEntities = (CampaignRuleNotificationCampaignRuleActionEntities) o;
    return Objects.equals(this.campaigns, campaignRuleNotificationCampaignRuleActionEntities.campaigns) &&
        Objects.equals(this.sequences, campaignRuleNotificationCampaignRuleActionEntities.sequences) &&
        Objects.equals(this.useTriggeringEntity, campaignRuleNotificationCampaignRuleActionEntities.useTriggeringEntity) &&
        Objects.equals(this.additionalProperties, campaignRuleNotificationCampaignRuleActionEntities.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(campaigns, sequences, useTriggeringEntity, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignRuleNotificationCampaignRuleActionEntities {\n");
    
    sb.append("    campaigns: ").append(toIndentedString(campaigns)).append("\n");
    sb.append("    sequences: ").append(toIndentedString(sequences)).append("\n");
    sb.append("    useTriggeringEntity: ").append(toIndentedString(useTriggeringEntity)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
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

