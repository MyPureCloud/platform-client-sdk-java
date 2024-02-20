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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * OutboundMessagingCampaignPostContactSmsEventTopicSMSAttributes
 */

public class OutboundMessagingCampaignPostContactSmsEventTopicSMSAttributes  implements Serializable {
  
  private String contactPhoneNumber = null;
  private String contactPhoneNumberColumnName = null;
  private String configuredSenderPhoneNumber = null;
  private String senderPhoneNumber = null;

  
  /**
   **/
  public OutboundMessagingCampaignPostContactSmsEventTopicSMSAttributes contactPhoneNumber(String contactPhoneNumber) {
    this.contactPhoneNumber = contactPhoneNumber;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("contactPhoneNumber")
  public String getContactPhoneNumber() {
    return contactPhoneNumber;
  }
  public void setContactPhoneNumber(String contactPhoneNumber) {
    this.contactPhoneNumber = contactPhoneNumber;
  }


  /**
   **/
  public OutboundMessagingCampaignPostContactSmsEventTopicSMSAttributes contactPhoneNumberColumnName(String contactPhoneNumberColumnName) {
    this.contactPhoneNumberColumnName = contactPhoneNumberColumnName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("contactPhoneNumberColumnName")
  public String getContactPhoneNumberColumnName() {
    return contactPhoneNumberColumnName;
  }
  public void setContactPhoneNumberColumnName(String contactPhoneNumberColumnName) {
    this.contactPhoneNumberColumnName = contactPhoneNumberColumnName;
  }


  /**
   **/
  public OutboundMessagingCampaignPostContactSmsEventTopicSMSAttributes configuredSenderPhoneNumber(String configuredSenderPhoneNumber) {
    this.configuredSenderPhoneNumber = configuredSenderPhoneNumber;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("configuredSenderPhoneNumber")
  public String getConfiguredSenderPhoneNumber() {
    return configuredSenderPhoneNumber;
  }
  public void setConfiguredSenderPhoneNumber(String configuredSenderPhoneNumber) {
    this.configuredSenderPhoneNumber = configuredSenderPhoneNumber;
  }


  /**
   **/
  public OutboundMessagingCampaignPostContactSmsEventTopicSMSAttributes senderPhoneNumber(String senderPhoneNumber) {
    this.senderPhoneNumber = senderPhoneNumber;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("senderPhoneNumber")
  public String getSenderPhoneNumber() {
    return senderPhoneNumber;
  }
  public void setSenderPhoneNumber(String senderPhoneNumber) {
    this.senderPhoneNumber = senderPhoneNumber;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OutboundMessagingCampaignPostContactSmsEventTopicSMSAttributes outboundMessagingCampaignPostContactSmsEventTopicSMSAttributes = (OutboundMessagingCampaignPostContactSmsEventTopicSMSAttributes) o;

    return Objects.equals(this.contactPhoneNumber, outboundMessagingCampaignPostContactSmsEventTopicSMSAttributes.contactPhoneNumber) &&
            Objects.equals(this.contactPhoneNumberColumnName, outboundMessagingCampaignPostContactSmsEventTopicSMSAttributes.contactPhoneNumberColumnName) &&
            Objects.equals(this.configuredSenderPhoneNumber, outboundMessagingCampaignPostContactSmsEventTopicSMSAttributes.configuredSenderPhoneNumber) &&
            Objects.equals(this.senderPhoneNumber, outboundMessagingCampaignPostContactSmsEventTopicSMSAttributes.senderPhoneNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contactPhoneNumber, contactPhoneNumberColumnName, configuredSenderPhoneNumber, senderPhoneNumber);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OutboundMessagingCampaignPostContactSmsEventTopicSMSAttributes {\n");
    
    sb.append("    contactPhoneNumber: ").append(toIndentedString(contactPhoneNumber)).append("\n");
    sb.append("    contactPhoneNumberColumnName: ").append(toIndentedString(contactPhoneNumberColumnName)).append("\n");
    sb.append("    configuredSenderPhoneNumber: ").append(toIndentedString(configuredSenderPhoneNumber)).append("\n");
    sb.append("    senderPhoneNumber: ").append(toIndentedString(senderPhoneNumber)).append("\n");
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

