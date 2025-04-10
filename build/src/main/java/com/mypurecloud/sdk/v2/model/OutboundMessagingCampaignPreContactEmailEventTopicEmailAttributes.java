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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * OutboundMessagingCampaignPreContactEmailEventTopicEmailAttributes
 */

public class OutboundMessagingCampaignPreContactEmailEventTopicEmailAttributes  implements Serializable {
  
  private String emailSubject = null;
  private String configuredEmailAddress = null;
  private String contactEmailAddress = null;
  private String replyToAddress = null;
  private String contactEmailColumnName = null;

  public OutboundMessagingCampaignPreContactEmailEventTopicEmailAttributes() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   **/
  public OutboundMessagingCampaignPreContactEmailEventTopicEmailAttributes emailSubject(String emailSubject) {
    this.emailSubject = emailSubject;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("emailSubject")
  public String getEmailSubject() {
    return emailSubject;
  }
  public void setEmailSubject(String emailSubject) {
    this.emailSubject = emailSubject;
  }


  /**
   **/
  public OutboundMessagingCampaignPreContactEmailEventTopicEmailAttributes configuredEmailAddress(String configuredEmailAddress) {
    this.configuredEmailAddress = configuredEmailAddress;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("configuredEmailAddress")
  public String getConfiguredEmailAddress() {
    return configuredEmailAddress;
  }
  public void setConfiguredEmailAddress(String configuredEmailAddress) {
    this.configuredEmailAddress = configuredEmailAddress;
  }


  /**
   **/
  public OutboundMessagingCampaignPreContactEmailEventTopicEmailAttributes contactEmailAddress(String contactEmailAddress) {
    this.contactEmailAddress = contactEmailAddress;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("contactEmailAddress")
  public String getContactEmailAddress() {
    return contactEmailAddress;
  }
  public void setContactEmailAddress(String contactEmailAddress) {
    this.contactEmailAddress = contactEmailAddress;
  }


  /**
   **/
  public OutboundMessagingCampaignPreContactEmailEventTopicEmailAttributes replyToAddress(String replyToAddress) {
    this.replyToAddress = replyToAddress;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("replyToAddress")
  public String getReplyToAddress() {
    return replyToAddress;
  }
  public void setReplyToAddress(String replyToAddress) {
    this.replyToAddress = replyToAddress;
  }


  /**
   **/
  public OutboundMessagingCampaignPreContactEmailEventTopicEmailAttributes contactEmailColumnName(String contactEmailColumnName) {
    this.contactEmailColumnName = contactEmailColumnName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("contactEmailColumnName")
  public String getContactEmailColumnName() {
    return contactEmailColumnName;
  }
  public void setContactEmailColumnName(String contactEmailColumnName) {
    this.contactEmailColumnName = contactEmailColumnName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OutboundMessagingCampaignPreContactEmailEventTopicEmailAttributes outboundMessagingCampaignPreContactEmailEventTopicEmailAttributes = (OutboundMessagingCampaignPreContactEmailEventTopicEmailAttributes) o;

    return Objects.equals(this.emailSubject, outboundMessagingCampaignPreContactEmailEventTopicEmailAttributes.emailSubject) &&
            Objects.equals(this.configuredEmailAddress, outboundMessagingCampaignPreContactEmailEventTopicEmailAttributes.configuredEmailAddress) &&
            Objects.equals(this.contactEmailAddress, outboundMessagingCampaignPreContactEmailEventTopicEmailAttributes.contactEmailAddress) &&
            Objects.equals(this.replyToAddress, outboundMessagingCampaignPreContactEmailEventTopicEmailAttributes.replyToAddress) &&
            Objects.equals(this.contactEmailColumnName, outboundMessagingCampaignPreContactEmailEventTopicEmailAttributes.contactEmailColumnName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(emailSubject, configuredEmailAddress, contactEmailAddress, replyToAddress, contactEmailColumnName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OutboundMessagingCampaignPreContactEmailEventTopicEmailAttributes {\n");
    
    sb.append("    emailSubject: ").append(toIndentedString(emailSubject)).append("\n");
    sb.append("    configuredEmailAddress: ").append(toIndentedString(configuredEmailAddress)).append("\n");
    sb.append("    contactEmailAddress: ").append(toIndentedString(contactEmailAddress)).append("\n");
    sb.append("    replyToAddress: ").append(toIndentedString(replyToAddress)).append("\n");
    sb.append("    contactEmailColumnName: ").append(toIndentedString(contactEmailColumnName)).append("\n");
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

