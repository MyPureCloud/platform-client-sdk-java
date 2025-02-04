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
import com.mypurecloud.sdk.v2.model.OutboundMessagingMessagingCampaignConfigChangeIntegrationRef;
import com.mypurecloud.sdk.v2.model.OutboundMessagingMessagingCampaignConfigChangeResponseRef;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * An outbound-messaging messaging campaign WhatsApp Config
 */
@ApiModel(description = "An outbound-messaging messaging campaign WhatsApp Config")

public class OutboundMessagingMessagingCampaignConfigChangeWhatsAppConfig  implements Serializable {
  
  private List<String> whatsAppColumns = new ArrayList<String>();
  private OutboundMessagingMessagingCampaignConfigChangeIntegrationRef integration = null;
  private OutboundMessagingMessagingCampaignConfigChangeResponseRef contentTemplate = null;

  
  /**
   * The Contact List columns specifying the phone number to send a message to.
   **/
  public OutboundMessagingMessagingCampaignConfigChangeWhatsAppConfig whatsAppColumns(List<String> whatsAppColumns) {
    this.whatsAppColumns = whatsAppColumns;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The Contact List columns specifying the phone number to send a message to.")
  @JsonProperty("whatsAppColumns")
  public List<String> getWhatsAppColumns() {
    return whatsAppColumns;
  }
  public void setWhatsAppColumns(List<String> whatsAppColumns) {
    this.whatsAppColumns = whatsAppColumns;
  }


  /**
   **/
  public OutboundMessagingMessagingCampaignConfigChangeWhatsAppConfig integration(OutboundMessagingMessagingCampaignConfigChangeIntegrationRef integration) {
    this.integration = integration;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("integration")
  public OutboundMessagingMessagingCampaignConfigChangeIntegrationRef getIntegration() {
    return integration;
  }
  public void setIntegration(OutboundMessagingMessagingCampaignConfigChangeIntegrationRef integration) {
    this.integration = integration;
  }


  /**
   * A reference for a Response
   **/
  public OutboundMessagingMessagingCampaignConfigChangeWhatsAppConfig contentTemplate(OutboundMessagingMessagingCampaignConfigChangeResponseRef contentTemplate) {
    this.contentTemplate = contentTemplate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A reference for a Response")
  @JsonProperty("contentTemplate")
  public OutboundMessagingMessagingCampaignConfigChangeResponseRef getContentTemplate() {
    return contentTemplate;
  }
  public void setContentTemplate(OutboundMessagingMessagingCampaignConfigChangeResponseRef contentTemplate) {
    this.contentTemplate = contentTemplate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OutboundMessagingMessagingCampaignConfigChangeWhatsAppConfig outboundMessagingMessagingCampaignConfigChangeWhatsAppConfig = (OutboundMessagingMessagingCampaignConfigChangeWhatsAppConfig) o;

    return Objects.equals(this.whatsAppColumns, outboundMessagingMessagingCampaignConfigChangeWhatsAppConfig.whatsAppColumns) &&
            Objects.equals(this.integration, outboundMessagingMessagingCampaignConfigChangeWhatsAppConfig.integration) &&
            Objects.equals(this.contentTemplate, outboundMessagingMessagingCampaignConfigChangeWhatsAppConfig.contentTemplate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(whatsAppColumns, integration, contentTemplate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OutboundMessagingMessagingCampaignConfigChangeWhatsAppConfig {\n");
    
    sb.append("    whatsAppColumns: ").append(toIndentedString(whatsAppColumns)).append("\n");
    sb.append("    integration: ").append(toIndentedString(integration)).append("\n");
    sb.append("    contentTemplate: ").append(toIndentedString(contentTemplate)).append("\n");
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

