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
import com.mypurecloud.sdk.v2.model.DialerCampaignProgressEventUriReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;

import java.io.Serializable;
/**
 * DialerCampaignProgressEventCampaignProgress
 */

public class DialerCampaignProgressEventCampaignProgress  implements Serializable {
  
  private DialerCampaignProgressEventUriReference campaign = null;
  private BigDecimal numberOfContactsCalled = null;
  private BigDecimal numberOfContactsMessaged = null;
  private BigDecimal totalNumberOfContacts = null;
  private Integer percentage = null;
  private Object additionalProperties = null;

  
  /**
   **/
  public DialerCampaignProgressEventCampaignProgress campaign(DialerCampaignProgressEventUriReference campaign) {
    this.campaign = campaign;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("campaign")
  public DialerCampaignProgressEventUriReference getCampaign() {
    return campaign;
  }
  public void setCampaign(DialerCampaignProgressEventUriReference campaign) {
    this.campaign = campaign;
  }

  
  /**
   **/
  public DialerCampaignProgressEventCampaignProgress numberOfContactsCalled(BigDecimal numberOfContactsCalled) {
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
  public DialerCampaignProgressEventCampaignProgress numberOfContactsMessaged(BigDecimal numberOfContactsMessaged) {
    this.numberOfContactsMessaged = numberOfContactsMessaged;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("numberOfContactsMessaged")
  public BigDecimal getNumberOfContactsMessaged() {
    return numberOfContactsMessaged;
  }
  public void setNumberOfContactsMessaged(BigDecimal numberOfContactsMessaged) {
    this.numberOfContactsMessaged = numberOfContactsMessaged;
  }

  
  /**
   **/
  public DialerCampaignProgressEventCampaignProgress totalNumberOfContacts(BigDecimal totalNumberOfContacts) {
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
  public DialerCampaignProgressEventCampaignProgress percentage(Integer percentage) {
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
  public DialerCampaignProgressEventCampaignProgress additionalProperties(Object additionalProperties) {
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
    DialerCampaignProgressEventCampaignProgress dialerCampaignProgressEventCampaignProgress = (DialerCampaignProgressEventCampaignProgress) o;
    return Objects.equals(this.campaign, dialerCampaignProgressEventCampaignProgress.campaign) &&
        Objects.equals(this.numberOfContactsCalled, dialerCampaignProgressEventCampaignProgress.numberOfContactsCalled) &&
        Objects.equals(this.numberOfContactsMessaged, dialerCampaignProgressEventCampaignProgress.numberOfContactsMessaged) &&
        Objects.equals(this.totalNumberOfContacts, dialerCampaignProgressEventCampaignProgress.totalNumberOfContacts) &&
        Objects.equals(this.percentage, dialerCampaignProgressEventCampaignProgress.percentage) &&
        Objects.equals(this.additionalProperties, dialerCampaignProgressEventCampaignProgress.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(campaign, numberOfContactsCalled, numberOfContactsMessaged, totalNumberOfContacts, percentage, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DialerCampaignProgressEventCampaignProgress {\n");
    
    sb.append("    campaign: ").append(toIndentedString(campaign)).append("\n");
    sb.append("    numberOfContactsCalled: ").append(toIndentedString(numberOfContactsCalled)).append("\n");
    sb.append("    numberOfContactsMessaged: ").append(toIndentedString(numberOfContactsMessaged)).append("\n");
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

