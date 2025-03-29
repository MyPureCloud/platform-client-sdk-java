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
import com.mypurecloud.sdk.v2.model.OutboundMessagingWhatsappCampaignProgressEventUriReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import java.io.Serializable;
/**
 * OutboundMessagingWhatsappCampaignProgressEventCampaignProgress
 */

public class OutboundMessagingWhatsappCampaignProgressEventCampaignProgress  implements Serializable {
  
  private OutboundMessagingWhatsappCampaignProgressEventUriReference campaign = null;
  private BigDecimal numberOfContactsCalled = null;
  private BigDecimal numberOfContactsMessaged = null;
  private BigDecimal totalNumberOfContacts = null;
  private Integer percentage = null;
  private Map<String, Integer> numberOfContactsSkipped = null;
  private Map<String, Object> additionalProperties = null;

  
  /**
   **/
  public OutboundMessagingWhatsappCampaignProgressEventCampaignProgress campaign(OutboundMessagingWhatsappCampaignProgressEventUriReference campaign) {
    this.campaign = campaign;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("campaign")
  public OutboundMessagingWhatsappCampaignProgressEventUriReference getCampaign() {
    return campaign;
  }
  public void setCampaign(OutboundMessagingWhatsappCampaignProgressEventUriReference campaign) {
    this.campaign = campaign;
  }


  /**
   * The number of contacts that have been called so far
   **/
  public OutboundMessagingWhatsappCampaignProgressEventCampaignProgress numberOfContactsCalled(BigDecimal numberOfContactsCalled) {
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
  public OutboundMessagingWhatsappCampaignProgressEventCampaignProgress numberOfContactsMessaged(BigDecimal numberOfContactsMessaged) {
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
  public OutboundMessagingWhatsappCampaignProgressEventCampaignProgress totalNumberOfContacts(BigDecimal totalNumberOfContacts) {
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
  public OutboundMessagingWhatsappCampaignProgressEventCampaignProgress percentage(Integer percentage) {
    this.percentage = percentage;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "numberOfContactsContacted/totalNumberOfContacts*100")
  @JsonProperty("percentage")
  public Integer getPercentage() {
    return percentage;
  }
  public void setPercentage(Integer percentage) {
    this.percentage = percentage;
  }


  /**
   * A map of skipped reasons and the number of contacts associated with each.
   **/
  public OutboundMessagingWhatsappCampaignProgressEventCampaignProgress numberOfContactsSkipped(Map<String, Integer> numberOfContactsSkipped) {
    this.numberOfContactsSkipped = numberOfContactsSkipped;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A map of skipped reasons and the number of contacts associated with each.")
  @JsonProperty("numberOfContactsSkipped")
  public Map<String, Integer> getNumberOfContactsSkipped() {
    return numberOfContactsSkipped;
  }
  public void setNumberOfContactsSkipped(Map<String, Integer> numberOfContactsSkipped) {
    this.numberOfContactsSkipped = numberOfContactsSkipped;
  }


  /**
   **/
  public OutboundMessagingWhatsappCampaignProgressEventCampaignProgress additionalProperties(Map<String, Object> additionalProperties) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OutboundMessagingWhatsappCampaignProgressEventCampaignProgress outboundMessagingWhatsappCampaignProgressEventCampaignProgress = (OutboundMessagingWhatsappCampaignProgressEventCampaignProgress) o;

    return Objects.equals(this.campaign, outboundMessagingWhatsappCampaignProgressEventCampaignProgress.campaign) &&
            Objects.equals(this.numberOfContactsCalled, outboundMessagingWhatsappCampaignProgressEventCampaignProgress.numberOfContactsCalled) &&
            Objects.equals(this.numberOfContactsMessaged, outboundMessagingWhatsappCampaignProgressEventCampaignProgress.numberOfContactsMessaged) &&
            Objects.equals(this.totalNumberOfContacts, outboundMessagingWhatsappCampaignProgressEventCampaignProgress.totalNumberOfContacts) &&
            Objects.equals(this.percentage, outboundMessagingWhatsappCampaignProgressEventCampaignProgress.percentage) &&
            Objects.equals(this.numberOfContactsSkipped, outboundMessagingWhatsappCampaignProgressEventCampaignProgress.numberOfContactsSkipped) &&
            Objects.equals(this.additionalProperties, outboundMessagingWhatsappCampaignProgressEventCampaignProgress.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(campaign, numberOfContactsCalled, numberOfContactsMessaged, totalNumberOfContacts, percentage, numberOfContactsSkipped, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OutboundMessagingWhatsappCampaignProgressEventCampaignProgress {\n");
    
    sb.append("    campaign: ").append(toIndentedString(campaign)).append("\n");
    sb.append("    numberOfContactsCalled: ").append(toIndentedString(numberOfContactsCalled)).append("\n");
    sb.append("    numberOfContactsMessaged: ").append(toIndentedString(numberOfContactsMessaged)).append("\n");
    sb.append("    totalNumberOfContacts: ").append(toIndentedString(totalNumberOfContacts)).append("\n");
    sb.append("    percentage: ").append(toIndentedString(percentage)).append("\n");
    sb.append("    numberOfContactsSkipped: ").append(toIndentedString(numberOfContactsSkipped)).append("\n");
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

