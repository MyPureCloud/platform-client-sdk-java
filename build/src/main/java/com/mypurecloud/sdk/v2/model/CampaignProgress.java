package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.mypurecloud.sdk.v2.model.UriReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * CampaignProgress
 */

public class CampaignProgress  implements Serializable {
  
  private UriReference campaign = null;
  private UriReference contactList = null;
  private Long numberOfContactsCalled = null;
  private Long totalNumberOfContacts = null;
  private Long percentage = null;

  
  /**
   * Identifier of the campaign
   **/
  public CampaignProgress campaign(UriReference campaign) {
    this.campaign = campaign;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Identifier of the campaign")
  @JsonProperty("campaign")
  public UriReference getCampaign() {
    return campaign;
  }
  public void setCampaign(UriReference campaign) {
    this.campaign = campaign;
  }

  
  /**
   * Identifier of the contact list
   **/
  public CampaignProgress contactList(UriReference contactList) {
    this.contactList = contactList;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Identifier of the contact list")
  @JsonProperty("contactList")
  public UriReference getContactList() {
    return contactList;
  }
  public void setContactList(UriReference contactList) {
    this.contactList = contactList;
  }

  
  @ApiModelProperty(example = "null", value = "Number of contacts processed during the campaign")
  @JsonProperty("numberOfContactsCalled")
  public Long getNumberOfContactsCalled() {
    return numberOfContactsCalled;
  }

  
  @ApiModelProperty(example = "null", value = "Total number of contacts in the campaign")
  @JsonProperty("totalNumberOfContacts")
  public Long getTotalNumberOfContacts() {
    return totalNumberOfContacts;
  }

  
  @ApiModelProperty(example = "null", value = "Percentage of contacts processed during the campaign")
  @JsonProperty("percentage")
  public Long getPercentage() {
    return percentage;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CampaignProgress campaignProgress = (CampaignProgress) o;
    return Objects.equals(this.campaign, campaignProgress.campaign) &&
        Objects.equals(this.contactList, campaignProgress.contactList) &&
        Objects.equals(this.numberOfContactsCalled, campaignProgress.numberOfContactsCalled) &&
        Objects.equals(this.totalNumberOfContacts, campaignProgress.totalNumberOfContacts) &&
        Objects.equals(this.percentage, campaignProgress.percentage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(campaign, contactList, numberOfContactsCalled, totalNumberOfContacts, percentage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignProgress {\n");
    
    sb.append("    campaign: ").append(toIndentedString(campaign)).append("\n");
    sb.append("    contactList: ").append(toIndentedString(contactList)).append("\n");
    sb.append("    numberOfContactsCalled: ").append(toIndentedString(numberOfContactsCalled)).append("\n");
    sb.append("    totalNumberOfContacts: ").append(toIndentedString(totalNumberOfContacts)).append("\n");
    sb.append("    percentage: ").append(toIndentedString(percentage)).append("\n");
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

