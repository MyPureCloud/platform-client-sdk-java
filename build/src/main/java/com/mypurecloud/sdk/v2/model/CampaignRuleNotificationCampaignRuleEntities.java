package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.mypurecloud.sdk.v2.model.CampaignRuleNotificationUriReference;
import com.mypurecloud.sdk.v2.model.DocumentDataV2NotificationCreatedBy;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * CampaignRuleNotificationCampaignRuleEntities
 */

public class CampaignRuleNotificationCampaignRuleEntities  implements Serializable {
  
  private List<DocumentDataV2NotificationCreatedBy> campaigns = new ArrayList<DocumentDataV2NotificationCreatedBy>();
  private List<CampaignRuleNotificationUriReference> sequences = new ArrayList<CampaignRuleNotificationUriReference>();

  
  /**
   **/
  public CampaignRuleNotificationCampaignRuleEntities campaigns(List<DocumentDataV2NotificationCreatedBy> campaigns) {
    this.campaigns = campaigns;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("campaigns")
  public List<DocumentDataV2NotificationCreatedBy> getCampaigns() {
    return campaigns;
  }
  public void setCampaigns(List<DocumentDataV2NotificationCreatedBy> campaigns) {
    this.campaigns = campaigns;
  }


  /**
   **/
  public CampaignRuleNotificationCampaignRuleEntities sequences(List<CampaignRuleNotificationUriReference> sequences) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CampaignRuleNotificationCampaignRuleEntities campaignRuleNotificationCampaignRuleEntities = (CampaignRuleNotificationCampaignRuleEntities) o;
    return Objects.equals(this.campaigns, campaignRuleNotificationCampaignRuleEntities.campaigns) &&
        Objects.equals(this.sequences, campaignRuleNotificationCampaignRuleEntities.sequences);
  }

  @Override
  public int hashCode() {
    return Objects.hash(campaigns, sequences);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignRuleNotificationCampaignRuleEntities {\n");
    
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

