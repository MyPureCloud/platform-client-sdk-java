package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.mypurecloud.sdk.v2.model.DocumentDataV2NotificationCreatedBy;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;

import java.io.Serializable;
/**
 * CampaignProgressNotification
 */

public class CampaignProgressNotification  implements Serializable {
  
  private DocumentDataV2NotificationCreatedBy campaign = null;
  private BigDecimal numberOfContactsCalled = null;
  private BigDecimal totalNumberOfContacts = null;
  private Integer percentage = null;
  private Object additionalProperties = null;

  
  /**
   **/
  public CampaignProgressNotification campaign(DocumentDataV2NotificationCreatedBy campaign) {
    this.campaign = campaign;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("campaign")
  public DocumentDataV2NotificationCreatedBy getCampaign() {
    return campaign;
  }
  public void setCampaign(DocumentDataV2NotificationCreatedBy campaign) {
    this.campaign = campaign;
  }

  
  /**
   **/
  public CampaignProgressNotification numberOfContactsCalled(BigDecimal numberOfContactsCalled) {
    this.numberOfContactsCalled = numberOfContactsCalled;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("numberOfContactsCalled")
  public BigDecimal getNumberOfContactsCalled() {
    return numberOfContactsCalled;
  }
  public void setNumberOfContactsCalled(BigDecimal numberOfContactsCalled) {
    this.numberOfContactsCalled = numberOfContactsCalled;
  }

  
  /**
   **/
  public CampaignProgressNotification totalNumberOfContacts(BigDecimal totalNumberOfContacts) {
    this.totalNumberOfContacts = totalNumberOfContacts;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("totalNumberOfContacts")
  public BigDecimal getTotalNumberOfContacts() {
    return totalNumberOfContacts;
  }
  public void setTotalNumberOfContacts(BigDecimal totalNumberOfContacts) {
    this.totalNumberOfContacts = totalNumberOfContacts;
  }

  
  /**
   **/
  public CampaignProgressNotification percentage(Integer percentage) {
    this.percentage = percentage;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("percentage")
  public Integer getPercentage() {
    return percentage;
  }
  public void setPercentage(Integer percentage) {
    this.percentage = percentage;
  }

  
  /**
   **/
  public CampaignProgressNotification additionalProperties(Object additionalProperties) {
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
    CampaignProgressNotification campaignProgressNotification = (CampaignProgressNotification) o;
    return Objects.equals(this.campaign, campaignProgressNotification.campaign) &&
        Objects.equals(this.numberOfContactsCalled, campaignProgressNotification.numberOfContactsCalled) &&
        Objects.equals(this.totalNumberOfContacts, campaignProgressNotification.totalNumberOfContacts) &&
        Objects.equals(this.percentage, campaignProgressNotification.percentage) &&
        Objects.equals(this.additionalProperties, campaignProgressNotification.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(campaign, numberOfContactsCalled, totalNumberOfContacts, percentage, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignProgressNotification {\n");
    
    sb.append("    campaign: ").append(toIndentedString(campaign)).append("\n");
    sb.append("    numberOfContactsCalled: ").append(toIndentedString(numberOfContactsCalled)).append("\n");
    sb.append("    totalNumberOfContacts: ").append(toIndentedString(totalNumberOfContacts)).append("\n");
    sb.append("    percentage: ").append(toIndentedString(percentage)).append("\n");
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

