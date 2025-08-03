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
import com.mypurecloud.sdk.v2.model.OutboundMessagingMessagingCampaignProgressEventUriReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import java.io.Serializable;
/**
 * OutboundMessagingMessagingCampaignProgressEventCampaignProgress
 */

public class OutboundMessagingMessagingCampaignProgressEventCampaignProgress  implements Serializable {
  
  private OutboundMessagingMessagingCampaignProgressEventUriReference campaign = null;
  private BigDecimal numberOfContactsCalled = null;
  private BigDecimal numberOfContactsMessaged = null;
  private BigDecimal totalNumberOfContacts = null;
  private Long percentage = null;
  private Map<String, Long> numberOfContactsSkipped = null;
  private Map<String, Object> additionalProperties = null;
  private Map<String, Object> getAdditionalProperties = null;

  public OutboundMessagingMessagingCampaignProgressEventCampaignProgress() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   **/
  public OutboundMessagingMessagingCampaignProgressEventCampaignProgress campaign(OutboundMessagingMessagingCampaignProgressEventUriReference campaign) {
    this.campaign = campaign;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("campaign")
  public OutboundMessagingMessagingCampaignProgressEventUriReference getCampaign() {
    return campaign;
  }
  public void setCampaign(OutboundMessagingMessagingCampaignProgressEventUriReference campaign) {
    this.campaign = campaign;
  }


  /**
   * The number of contacts that have been called so far
   **/
  public OutboundMessagingMessagingCampaignProgressEventCampaignProgress numberOfContactsCalled(BigDecimal numberOfContactsCalled) {
    this.numberOfContactsCalled = numberOfContactsCalled;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The number of contacts that have been called so far")
  @JsonProperty("numberOfContactsCalled")
  public BigDecimal getNumberOfContactsCalled() {
    return numberOfContactsCalled;
  }
  public void setNumberOfContactsCalled(BigDecimal numberOfContactsCalled) {
    this.numberOfContactsCalled = numberOfContactsCalled;
  }


  /**
   * The number of contacts that have been messaged so far
   **/
  public OutboundMessagingMessagingCampaignProgressEventCampaignProgress numberOfContactsMessaged(BigDecimal numberOfContactsMessaged) {
    this.numberOfContactsMessaged = numberOfContactsMessaged;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The number of contacts that have been messaged so far")
  @JsonProperty("numberOfContactsMessaged")
  public BigDecimal getNumberOfContactsMessaged() {
    return numberOfContactsMessaged;
  }
  public void setNumberOfContactsMessaged(BigDecimal numberOfContactsMessaged) {
    this.numberOfContactsMessaged = numberOfContactsMessaged;
  }


  /**
   * The total number of contacts in the contact list
   **/
  public OutboundMessagingMessagingCampaignProgressEventCampaignProgress totalNumberOfContacts(BigDecimal totalNumberOfContacts) {
    this.totalNumberOfContacts = totalNumberOfContacts;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The total number of contacts in the contact list")
  @JsonProperty("totalNumberOfContacts")
  public BigDecimal getTotalNumberOfContacts() {
    return totalNumberOfContacts;
  }
  public void setTotalNumberOfContacts(BigDecimal totalNumberOfContacts) {
    this.totalNumberOfContacts = totalNumberOfContacts;
  }


  /**
   * numberOfContactsContacted/totalNumberOfContacts*100
   **/
  public OutboundMessagingMessagingCampaignProgressEventCampaignProgress percentage(Long percentage) {
    this.percentage = percentage;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "numberOfContactsContacted/totalNumberOfContacts*100")
  @JsonProperty("percentage")
  public Long getPercentage() {
    return percentage;
  }
  public void setPercentage(Long percentage) {
    this.percentage = percentage;
  }


  /**
   * A map of skipped reasons and the number of contacts associated with each.
   **/
  public OutboundMessagingMessagingCampaignProgressEventCampaignProgress numberOfContactsSkipped(Map<String, Long> numberOfContactsSkipped) {
    this.numberOfContactsSkipped = numberOfContactsSkipped;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A map of skipped reasons and the number of contacts associated with each.")
  @JsonProperty("numberOfContactsSkipped")
  public Map<String, Long> getNumberOfContactsSkipped() {
    return numberOfContactsSkipped;
  }
  public void setNumberOfContactsSkipped(Map<String, Long> numberOfContactsSkipped) {
    this.numberOfContactsSkipped = numberOfContactsSkipped;
  }


  /**
   **/
  public OutboundMessagingMessagingCampaignProgressEventCampaignProgress additionalProperties(Map<String, Object> additionalProperties) {
    this.additionalProperties = additionalProperties;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("additionalProperties")
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }
  public void setAdditionalProperties(Map<String, Object> additionalProperties) {
    this.additionalProperties = additionalProperties;
  }


  /**
   **/
  public OutboundMessagingMessagingCampaignProgressEventCampaignProgress getAdditionalProperties(Map<String, Object> getAdditionalProperties) {
    this.getAdditionalProperties = getAdditionalProperties;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("getAdditionalProperties")
  public Map<String, Object> getGetAdditionalProperties() {
    return getAdditionalProperties;
  }
  public void setGetAdditionalProperties(Map<String, Object> getAdditionalProperties) {
    this.getAdditionalProperties = getAdditionalProperties;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OutboundMessagingMessagingCampaignProgressEventCampaignProgress outboundMessagingMessagingCampaignProgressEventCampaignProgress = (OutboundMessagingMessagingCampaignProgressEventCampaignProgress) o;

    return Objects.equals(this.campaign, outboundMessagingMessagingCampaignProgressEventCampaignProgress.campaign) &&
            Objects.equals(this.numberOfContactsCalled, outboundMessagingMessagingCampaignProgressEventCampaignProgress.numberOfContactsCalled) &&
            Objects.equals(this.numberOfContactsMessaged, outboundMessagingMessagingCampaignProgressEventCampaignProgress.numberOfContactsMessaged) &&
            Objects.equals(this.totalNumberOfContacts, outboundMessagingMessagingCampaignProgressEventCampaignProgress.totalNumberOfContacts) &&
            Objects.equals(this.percentage, outboundMessagingMessagingCampaignProgressEventCampaignProgress.percentage) &&
            Objects.equals(this.numberOfContactsSkipped, outboundMessagingMessagingCampaignProgressEventCampaignProgress.numberOfContactsSkipped) &&
            Objects.equals(this.additionalProperties, outboundMessagingMessagingCampaignProgressEventCampaignProgress.additionalProperties) &&
            Objects.equals(this.getAdditionalProperties, outboundMessagingMessagingCampaignProgressEventCampaignProgress.getAdditionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(campaign, numberOfContactsCalled, numberOfContactsMessaged, totalNumberOfContacts, percentage, numberOfContactsSkipped, additionalProperties, getAdditionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OutboundMessagingMessagingCampaignProgressEventCampaignProgress {\n");
    
    sb.append("    campaign: ").append(toIndentedString(campaign)).append("\n");
    sb.append("    numberOfContactsCalled: ").append(toIndentedString(numberOfContactsCalled)).append("\n");
    sb.append("    numberOfContactsMessaged: ").append(toIndentedString(numberOfContactsMessaged)).append("\n");
    sb.append("    totalNumberOfContacts: ").append(toIndentedString(totalNumberOfContacts)).append("\n");
    sb.append("    percentage: ").append(toIndentedString(percentage)).append("\n");
    sb.append("    numberOfContactsSkipped: ").append(toIndentedString(numberOfContactsSkipped)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
    sb.append("    getAdditionalProperties: ").append(toIndentedString(getAdditionalProperties)).append("\n");
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

