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
 * OutboundMessagingCampaignPostContactWhatsappEventTopicWhatsAppAttributes
 */

public class OutboundMessagingCampaignPostContactWhatsappEventTopicWhatsAppAttributes  implements Serializable {
  
  private String contactPhoneNumber = null;
  private String contactWhatsAppColumnName = null;
  private String whatsAppIntegrationId = null;

  public OutboundMessagingCampaignPostContactWhatsappEventTopicWhatsAppAttributes() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   **/
  public OutboundMessagingCampaignPostContactWhatsappEventTopicWhatsAppAttributes contactPhoneNumber(String contactPhoneNumber) {
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
  public OutboundMessagingCampaignPostContactWhatsappEventTopicWhatsAppAttributes contactWhatsAppColumnName(String contactWhatsAppColumnName) {
    this.contactWhatsAppColumnName = contactWhatsAppColumnName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("contactWhatsAppColumnName")
  public String getContactWhatsAppColumnName() {
    return contactWhatsAppColumnName;
  }
  public void setContactWhatsAppColumnName(String contactWhatsAppColumnName) {
    this.contactWhatsAppColumnName = contactWhatsAppColumnName;
  }


  /**
   **/
  public OutboundMessagingCampaignPostContactWhatsappEventTopicWhatsAppAttributes whatsAppIntegrationId(String whatsAppIntegrationId) {
    this.whatsAppIntegrationId = whatsAppIntegrationId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("whatsAppIntegrationId")
  public String getWhatsAppIntegrationId() {
    return whatsAppIntegrationId;
  }
  public void setWhatsAppIntegrationId(String whatsAppIntegrationId) {
    this.whatsAppIntegrationId = whatsAppIntegrationId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OutboundMessagingCampaignPostContactWhatsappEventTopicWhatsAppAttributes outboundMessagingCampaignPostContactWhatsappEventTopicWhatsAppAttributes = (OutboundMessagingCampaignPostContactWhatsappEventTopicWhatsAppAttributes) o;

    return Objects.equals(this.contactPhoneNumber, outboundMessagingCampaignPostContactWhatsappEventTopicWhatsAppAttributes.contactPhoneNumber) &&
            Objects.equals(this.contactWhatsAppColumnName, outboundMessagingCampaignPostContactWhatsappEventTopicWhatsAppAttributes.contactWhatsAppColumnName) &&
            Objects.equals(this.whatsAppIntegrationId, outboundMessagingCampaignPostContactWhatsappEventTopicWhatsAppAttributes.whatsAppIntegrationId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contactPhoneNumber, contactWhatsAppColumnName, whatsAppIntegrationId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OutboundMessagingCampaignPostContactWhatsappEventTopicWhatsAppAttributes {\n");
    
    sb.append("    contactPhoneNumber: ").append(toIndentedString(contactPhoneNumber)).append("\n");
    sb.append("    contactWhatsAppColumnName: ").append(toIndentedString(contactWhatsAppColumnName)).append("\n");
    sb.append("    whatsAppIntegrationId: ").append(toIndentedString(whatsAppIntegrationId)).append("\n");
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

