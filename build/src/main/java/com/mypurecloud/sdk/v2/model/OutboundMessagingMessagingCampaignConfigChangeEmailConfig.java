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
import com.mypurecloud.sdk.v2.model.OutboundMessagingMessagingCampaignConfigChangeFromEmailAddress;
import com.mypurecloud.sdk.v2.model.OutboundMessagingMessagingCampaignConfigChangeReplyToEmailAddress;
import com.mypurecloud.sdk.v2.model.OutboundMessagingMessagingCampaignConfigChangeResponseRef;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * OutboundMessagingMessagingCampaignConfigChangeEmailConfig
 */

public class OutboundMessagingMessagingCampaignConfigChangeEmailConfig  implements Serializable {
  
  private List<String> emailColumns = new ArrayList<String>();
  private OutboundMessagingMessagingCampaignConfigChangeResponseRef contentTemplate = null;
  private OutboundMessagingMessagingCampaignConfigChangeFromEmailAddress fromAddress = null;
  private OutboundMessagingMessagingCampaignConfigChangeReplyToEmailAddress replyToAddress = null;

  
  /**
   **/
  public OutboundMessagingMessagingCampaignConfigChangeEmailConfig emailColumns(List<String> emailColumns) {
    this.emailColumns = emailColumns;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("emailColumns")
  public List<String> getEmailColumns() {
    return emailColumns;
  }
  public void setEmailColumns(List<String> emailColumns) {
    this.emailColumns = emailColumns;
  }

  
  /**
   **/
  public OutboundMessagingMessagingCampaignConfigChangeEmailConfig contentTemplate(OutboundMessagingMessagingCampaignConfigChangeResponseRef contentTemplate) {
    this.contentTemplate = contentTemplate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("contentTemplate")
  public OutboundMessagingMessagingCampaignConfigChangeResponseRef getContentTemplate() {
    return contentTemplate;
  }
  public void setContentTemplate(OutboundMessagingMessagingCampaignConfigChangeResponseRef contentTemplate) {
    this.contentTemplate = contentTemplate;
  }

  
  /**
   **/
  public OutboundMessagingMessagingCampaignConfigChangeEmailConfig fromAddress(OutboundMessagingMessagingCampaignConfigChangeFromEmailAddress fromAddress) {
    this.fromAddress = fromAddress;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("fromAddress")
  public OutboundMessagingMessagingCampaignConfigChangeFromEmailAddress getFromAddress() {
    return fromAddress;
  }
  public void setFromAddress(OutboundMessagingMessagingCampaignConfigChangeFromEmailAddress fromAddress) {
    this.fromAddress = fromAddress;
  }

  
  /**
   **/
  public OutboundMessagingMessagingCampaignConfigChangeEmailConfig replyToAddress(OutboundMessagingMessagingCampaignConfigChangeReplyToEmailAddress replyToAddress) {
    this.replyToAddress = replyToAddress;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("replyToAddress")
  public OutboundMessagingMessagingCampaignConfigChangeReplyToEmailAddress getReplyToAddress() {
    return replyToAddress;
  }
  public void setReplyToAddress(OutboundMessagingMessagingCampaignConfigChangeReplyToEmailAddress replyToAddress) {
    this.replyToAddress = replyToAddress;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OutboundMessagingMessagingCampaignConfigChangeEmailConfig outboundMessagingMessagingCampaignConfigChangeEmailConfig = (OutboundMessagingMessagingCampaignConfigChangeEmailConfig) o;
    return Objects.equals(this.emailColumns, outboundMessagingMessagingCampaignConfigChangeEmailConfig.emailColumns) &&
        Objects.equals(this.contentTemplate, outboundMessagingMessagingCampaignConfigChangeEmailConfig.contentTemplate) &&
        Objects.equals(this.fromAddress, outboundMessagingMessagingCampaignConfigChangeEmailConfig.fromAddress) &&
        Objects.equals(this.replyToAddress, outboundMessagingMessagingCampaignConfigChangeEmailConfig.replyToAddress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(emailColumns, contentTemplate, fromAddress, replyToAddress);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OutboundMessagingMessagingCampaignConfigChangeEmailConfig {\n");
    
    sb.append("    emailColumns: ").append(toIndentedString(emailColumns)).append("\n");
    sb.append("    contentTemplate: ").append(toIndentedString(contentTemplate)).append("\n");
    sb.append("    fromAddress: ").append(toIndentedString(fromAddress)).append("\n");
    sb.append("    replyToAddress: ").append(toIndentedString(replyToAddress)).append("\n");
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

