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

import java.io.Serializable;
/**
 * CampaignProgress
 */

public class CampaignProgress  implements Serializable {
  
  private DomainEntityRef campaign = null;
  private DomainEntityRef contactList = null;
  private Long numberOfContactsCalled = null;
  private Long numberOfContactsMessaged = null;
  private Long totalNumberOfContacts = null;
  private Long percentage = null;

  
  /**
   * Identifier of the campaign
   **/
  public CampaignProgress campaign(DomainEntityRef campaign) {
    this.campaign = campaign;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Identifier of the campaign")
  @JsonProperty("campaign")
  public DomainEntityRef getCampaign() {
    return campaign;
  }
  public void setCampaign(DomainEntityRef campaign) {
    this.campaign = campaign;
  }

  
  /**
   * Identifier of the contact list
   **/
  public CampaignProgress contactList(DomainEntityRef contactList) {
    this.contactList = contactList;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Identifier of the contact list")
  @JsonProperty("contactList")
  public DomainEntityRef getContactList() {
    return contactList;
  }
  public void setContactList(DomainEntityRef contactList) {
    this.contactList = contactList;
  }

  
  @ApiModelProperty(example = "null", value = "Number of contacts called during the campaign")
  @JsonProperty("numberOfContactsCalled")
  public Long getNumberOfContactsCalled() {
    return numberOfContactsCalled;
  }

  
  @ApiModelProperty(example = "null", value = "Number of contacts messaged during the campaign")
  @JsonProperty("numberOfContactsMessaged")
  public Long getNumberOfContactsMessaged() {
    return numberOfContactsMessaged;
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
        Objects.equals(this.numberOfContactsMessaged, campaignProgress.numberOfContactsMessaged) &&
        Objects.equals(this.totalNumberOfContacts, campaignProgress.totalNumberOfContacts) &&
        Objects.equals(this.percentage, campaignProgress.percentage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(campaign, contactList, numberOfContactsCalled, numberOfContactsMessaged, totalNumberOfContacts, percentage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignProgress {\n");
    
    sb.append("    campaign: ").append(toIndentedString(campaign)).append("\n");
    sb.append("    contactList: ").append(toIndentedString(contactList)).append("\n");
    sb.append("    numberOfContactsCalled: ").append(toIndentedString(numberOfContactsCalled)).append("\n");
    sb.append("    numberOfContactsMessaged: ").append(toIndentedString(numberOfContactsMessaged)).append("\n");
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

