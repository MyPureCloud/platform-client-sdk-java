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
import com.mypurecloud.sdk.v2.model.DomainEntityRef;
import com.mypurecloud.sdk.v2.model.FromEmailAddress;
import com.mypurecloud.sdk.v2.model.ReplyToEmailAddress;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * EmailConfig
 */

public class EmailConfig  implements Serializable {
  
  private List<String> emailColumns = new ArrayList<String>();
  private DomainEntityRef contentTemplate = null;
  private FromEmailAddress fromAddress = null;
  private ReplyToEmailAddress replyToAddress = null;

  
  /**
   * The contact list columns specifying the email address(es) of the contact.
   **/
  public EmailConfig emailColumns(List<String> emailColumns) {
    this.emailColumns = emailColumns;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The contact list columns specifying the email address(es) of the contact.")
  @JsonProperty("emailColumns")
  public List<String> getEmailColumns() {
    return emailColumns;
  }
  public void setEmailColumns(List<String> emailColumns) {
    this.emailColumns = emailColumns;
  }

  
  /**
   * The content template used to formulate the email to send to the contact.
   **/
  public EmailConfig contentTemplate(DomainEntityRef contentTemplate) {
    this.contentTemplate = contentTemplate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The content template used to formulate the email to send to the contact.")
  @JsonProperty("contentTemplate")
  public DomainEntityRef getContentTemplate() {
    return contentTemplate;
  }
  public void setContentTemplate(DomainEntityRef contentTemplate) {
    this.contentTemplate = contentTemplate;
  }

  
  /**
   * The email address that will be used as the sender of the email.
   **/
  public EmailConfig fromAddress(FromEmailAddress fromAddress) {
    this.fromAddress = fromAddress;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The email address that will be used as the sender of the email.")
  @JsonProperty("fromAddress")
  public FromEmailAddress getFromAddress() {
    return fromAddress;
  }
  public void setFromAddress(FromEmailAddress fromAddress) {
    this.fromAddress = fromAddress;
  }

  
  /**
   * The email address from which any reply will be sent.
   **/
  public EmailConfig replyToAddress(ReplyToEmailAddress replyToAddress) {
    this.replyToAddress = replyToAddress;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The email address from which any reply will be sent.")
  @JsonProperty("replyToAddress")
  public ReplyToEmailAddress getReplyToAddress() {
    return replyToAddress;
  }
  public void setReplyToAddress(ReplyToEmailAddress replyToAddress) {
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
    EmailConfig emailConfig = (EmailConfig) o;
    return Objects.equals(this.emailColumns, emailConfig.emailColumns) &&
        Objects.equals(this.contentTemplate, emailConfig.contentTemplate) &&
        Objects.equals(this.fromAddress, emailConfig.fromAddress) &&
        Objects.equals(this.replyToAddress, emailConfig.replyToAddress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(emailColumns, contentTemplate, fromAddress, replyToAddress);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmailConfig {\n");
    
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

