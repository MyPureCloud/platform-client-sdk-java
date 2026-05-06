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
import com.mypurecloud.sdk.v2.model.DialerCampaignSkillCombinationStatsEventSkillCombinationDetailNotification;
import com.mypurecloud.sdk.v2.model.DialerCampaignSkillCombinationStatsEventUriReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * DialerCampaignSkillCombinationStatsEventCampaignSkillCombinationStats
 */

public class DialerCampaignSkillCombinationStatsEventCampaignSkillCombinationStats  implements Serializable {
  
  private DialerCampaignSkillCombinationStatsEventUriReference campaign = null;
  private DialerCampaignSkillCombinationStatsEventUriReference contactList = null;
  private Long totalSkillCombinations = null;
  private Long totalRemainingContacts = null;
  private Long totalProcessedContacts = null;
  private List<DialerCampaignSkillCombinationStatsEventSkillCombinationDetailNotification> skillCombinationDetails = null;

  public DialerCampaignSkillCombinationStatsEventCampaignSkillCombinationStats() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      skillCombinationDetails = new ArrayList<DialerCampaignSkillCombinationStatsEventSkillCombinationDetailNotification>();
    }
  }

  
  /**
   **/
  public DialerCampaignSkillCombinationStatsEventCampaignSkillCombinationStats campaign(DialerCampaignSkillCombinationStatsEventUriReference campaign) {
    this.campaign = campaign;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("campaign")
  public DialerCampaignSkillCombinationStatsEventUriReference getCampaign() {
    return campaign;
  }
  public void setCampaign(DialerCampaignSkillCombinationStatsEventUriReference campaign) {
    this.campaign = campaign;
  }


  /**
   * A UriReference for a resource
   **/
  public DialerCampaignSkillCombinationStatsEventCampaignSkillCombinationStats contactList(DialerCampaignSkillCombinationStatsEventUriReference contactList) {
    this.contactList = contactList;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A UriReference for a resource")
  @JsonProperty("contactList")
  public DialerCampaignSkillCombinationStatsEventUriReference getContactList() {
    return contactList;
  }
  public void setContactList(DialerCampaignSkillCombinationStatsEventUriReference contactList) {
    this.contactList = contactList;
  }


  /**
   * The total number of unique skill combinations
   **/
  public DialerCampaignSkillCombinationStatsEventCampaignSkillCombinationStats totalSkillCombinations(Long totalSkillCombinations) {
    this.totalSkillCombinations = totalSkillCombinations;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The total number of unique skill combinations")
  @JsonProperty("totalSkillCombinations")
  public Long getTotalSkillCombinations() {
    return totalSkillCombinations;
  }
  public void setTotalSkillCombinations(Long totalSkillCombinations) {
    this.totalSkillCombinations = totalSkillCombinations;
  }


  /**
   * The total number of remaining contacts
   **/
  public DialerCampaignSkillCombinationStatsEventCampaignSkillCombinationStats totalRemainingContacts(Long totalRemainingContacts) {
    this.totalRemainingContacts = totalRemainingContacts;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The total number of remaining contacts")
  @JsonProperty("totalRemainingContacts")
  public Long getTotalRemainingContacts() {
    return totalRemainingContacts;
  }
  public void setTotalRemainingContacts(Long totalRemainingContacts) {
    this.totalRemainingContacts = totalRemainingContacts;
  }


  /**
   * The total number of processed contacts
   **/
  public DialerCampaignSkillCombinationStatsEventCampaignSkillCombinationStats totalProcessedContacts(Long totalProcessedContacts) {
    this.totalProcessedContacts = totalProcessedContacts;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The total number of processed contacts")
  @JsonProperty("totalProcessedContacts")
  public Long getTotalProcessedContacts() {
    return totalProcessedContacts;
  }
  public void setTotalProcessedContacts(Long totalProcessedContacts) {
    this.totalProcessedContacts = totalProcessedContacts;
  }


  /**
   * Details for each skill combination
   **/
  public DialerCampaignSkillCombinationStatsEventCampaignSkillCombinationStats skillCombinationDetails(List<DialerCampaignSkillCombinationStatsEventSkillCombinationDetailNotification> skillCombinationDetails) {
    this.skillCombinationDetails = skillCombinationDetails;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Details for each skill combination")
  @JsonProperty("skillCombinationDetails")
  public List<DialerCampaignSkillCombinationStatsEventSkillCombinationDetailNotification> getSkillCombinationDetails() {
    return skillCombinationDetails;
  }
  public void setSkillCombinationDetails(List<DialerCampaignSkillCombinationStatsEventSkillCombinationDetailNotification> skillCombinationDetails) {
    this.skillCombinationDetails = skillCombinationDetails;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DialerCampaignSkillCombinationStatsEventCampaignSkillCombinationStats dialerCampaignSkillCombinationStatsEventCampaignSkillCombinationStats = (DialerCampaignSkillCombinationStatsEventCampaignSkillCombinationStats) o;

    return Objects.equals(this.campaign, dialerCampaignSkillCombinationStatsEventCampaignSkillCombinationStats.campaign) &&
            Objects.equals(this.contactList, dialerCampaignSkillCombinationStatsEventCampaignSkillCombinationStats.contactList) &&
            Objects.equals(this.totalSkillCombinations, dialerCampaignSkillCombinationStatsEventCampaignSkillCombinationStats.totalSkillCombinations) &&
            Objects.equals(this.totalRemainingContacts, dialerCampaignSkillCombinationStatsEventCampaignSkillCombinationStats.totalRemainingContacts) &&
            Objects.equals(this.totalProcessedContacts, dialerCampaignSkillCombinationStatsEventCampaignSkillCombinationStats.totalProcessedContacts) &&
            Objects.equals(this.skillCombinationDetails, dialerCampaignSkillCombinationStatsEventCampaignSkillCombinationStats.skillCombinationDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(campaign, contactList, totalSkillCombinations, totalRemainingContacts, totalProcessedContacts, skillCombinationDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DialerCampaignSkillCombinationStatsEventCampaignSkillCombinationStats {\n");
    
    sb.append("    campaign: ").append(toIndentedString(campaign)).append("\n");
    sb.append("    contactList: ").append(toIndentedString(contactList)).append("\n");
    sb.append("    totalSkillCombinations: ").append(toIndentedString(totalSkillCombinations)).append("\n");
    sb.append("    totalRemainingContacts: ").append(toIndentedString(totalRemainingContacts)).append("\n");
    sb.append("    totalProcessedContacts: ").append(toIndentedString(totalProcessedContacts)).append("\n");
    sb.append("    skillCombinationDetails: ").append(toIndentedString(skillCombinationDetails)).append("\n");
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

