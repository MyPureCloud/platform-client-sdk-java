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
import com.mypurecloud.sdk.v2.model.OutboundMessagingEmailCampaignConfigChangeFromEmailAddress;
import com.mypurecloud.sdk.v2.model.OutboundMessagingEmailCampaignConfigChangeReplyToEmailAddress;
import com.mypurecloud.sdk.v2.model.OutboundMessagingEmailCampaignConfigChangeResponseRef;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * An outbound-messaging messaging campaign email Config
 */
@ApiModel(description = "An outbound-messaging messaging campaign email Config")

public class OutboundMessagingEmailCampaignConfigChangeEmailConfig  implements Serializable {
  
  private List<String> emailColumns = new ArrayList<String>();
  private OutboundMessagingEmailCampaignConfigChangeResponseRef contentTemplate = null;
  private OutboundMessagingEmailCampaignConfigChangeFromEmailAddress fromAddress = null;
  private OutboundMessagingEmailCampaignConfigChangeReplyToEmailAddress replyToAddress = null;

  
  /**
   * The Contact List column specifying the email to send to the contact.
   **/
  public OutboundMessagingEmailCampaignConfigChangeEmailConfig emailColumns(List<String> emailColumns) {
    this.emailColumns = emailColumns;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The Contact List column specifying the email to send to the contact.")
  @JsonProperty("emailColumns")
  public List<String> getEmailColumns() {
    return emailColumns;
  }
  public void setEmailColumns(List<String> emailColumns) {
    this.emailColumns = emailColumns;
  }


  /**
   * A reference for a Response
   **/
  public OutboundMessagingEmailCampaignConfigChangeEmailConfig contentTemplate(OutboundMessagingEmailCampaignConfigChangeResponseRef contentTemplate) {
    this.contentTemplate = contentTemplate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A reference for a Response")
  @JsonProperty("contentTemplate")
  public OutboundMessagingEmailCampaignConfigChangeResponseRef getContentTemplate() {
    return contentTemplate;
  }
  public void setContentTemplate(OutboundMessagingEmailCampaignConfigChangeResponseRef contentTemplate) {
    this.contentTemplate = contentTemplate;
  }


  /**
   **/
  public OutboundMessagingEmailCampaignConfigChangeEmailConfig fromAddress(OutboundMessagingEmailCampaignConfigChangeFromEmailAddress fromAddress) {
    this.fromAddress = fromAddress;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("fromAddress")
  public OutboundMessagingEmailCampaignConfigChangeFromEmailAddress getFromAddress() {
    return fromAddress;
  }
  public void setFromAddress(OutboundMessagingEmailCampaignConfigChangeFromEmailAddress fromAddress) {
    this.fromAddress = fromAddress;
  }


  /**
   **/
  public OutboundMessagingEmailCampaignConfigChangeEmailConfig replyToAddress(OutboundMessagingEmailCampaignConfigChangeReplyToEmailAddress replyToAddress) {
    this.replyToAddress = replyToAddress;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("replyToAddress")
  public OutboundMessagingEmailCampaignConfigChangeReplyToEmailAddress getReplyToAddress() {
    return replyToAddress;
  }
  public void setReplyToAddress(OutboundMessagingEmailCampaignConfigChangeReplyToEmailAddress replyToAddress) {
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
    OutboundMessagingEmailCampaignConfigChangeEmailConfig outboundMessagingEmailCampaignConfigChangeEmailConfig = (OutboundMessagingEmailCampaignConfigChangeEmailConfig) o;

    return Objects.equals(this.emailColumns, outboundMessagingEmailCampaignConfigChangeEmailConfig.emailColumns) &&
            Objects.equals(this.contentTemplate, outboundMessagingEmailCampaignConfigChangeEmailConfig.contentTemplate) &&
            Objects.equals(this.fromAddress, outboundMessagingEmailCampaignConfigChangeEmailConfig.fromAddress) &&
            Objects.equals(this.replyToAddress, outboundMessagingEmailCampaignConfigChangeEmailConfig.replyToAddress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(emailColumns, contentTemplate, fromAddress, replyToAddress);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OutboundMessagingEmailCampaignConfigChangeEmailConfig {\n");
    
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

