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
import com.mypurecloud.sdk.v2.model.Attachment;
import com.mypurecloud.sdk.v2.model.EmailAddress;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import java.io.Serializable;
/**
 * EmailMessageReply
 */

public class EmailMessageReply  implements Serializable {
  
  private List<EmailAddress> to = null;
  private List<EmailAddress> cc = null;
  private List<EmailAddress> bcc = null;
  private EmailAddress from = null;
  private EmailAddress replyTo = null;
  private String subject = null;
  private List<Attachment> attachments = null;
  private String textBody = null;
  private String htmlBody = null;
  private Date time = null;
  private Boolean historyIncluded = null;
  private Integer emailSizeBytes = null;
  private Integer maxEmailSizeBytes = null;

  public EmailMessageReply() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      to = new ArrayList<EmailAddress>();
      cc = new ArrayList<EmailAddress>();
      bcc = new ArrayList<EmailAddress>();
      attachments = new ArrayList<Attachment>();
    }
  }

  
  /**
   * The recipients of the email message.
   **/
  public EmailMessageReply to(List<EmailAddress> to) {
    this.to = to;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The recipients of the email message.")
  @JsonProperty("to")
  public List<EmailAddress> getTo() {
    return to;
  }
  public void setTo(List<EmailAddress> to) {
    this.to = to;
  }


  /**
   * The recipients that were copied on the email message.
   **/
  public EmailMessageReply cc(List<EmailAddress> cc) {
    this.cc = cc;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The recipients that were copied on the email message.")
  @JsonProperty("cc")
  public List<EmailAddress> getCc() {
    return cc;
  }
  public void setCc(List<EmailAddress> cc) {
    this.cc = cc;
  }


  /**
   * The recipients that were blind copied on the email message.
   **/
  public EmailMessageReply bcc(List<EmailAddress> bcc) {
    this.bcc = bcc;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The recipients that were blind copied on the email message.")
  @JsonProperty("bcc")
  public List<EmailAddress> getBcc() {
    return bcc;
  }
  public void setBcc(List<EmailAddress> bcc) {
    this.bcc = bcc;
  }


  /**
   * The sender of the email message.
   **/
  public EmailMessageReply from(EmailAddress from) {
    this.from = from;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The sender of the email message.")
  @JsonProperty("from")
  public EmailAddress getFrom() {
    return from;
  }
  public void setFrom(EmailAddress from) {
    this.from = from;
  }


  /**
   * The receiver of the reply email message.
   **/
  public EmailMessageReply replyTo(EmailAddress replyTo) {
    this.replyTo = replyTo;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The receiver of the reply email message.")
  @JsonProperty("replyTo")
  public EmailAddress getReplyTo() {
    return replyTo;
  }
  public void setReplyTo(EmailAddress replyTo) {
    this.replyTo = replyTo;
  }


  /**
   * The subject of the email message.
   **/
  public EmailMessageReply subject(String subject) {
    this.subject = subject;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The subject of the email message.")
  @JsonProperty("subject")
  public String getSubject() {
    return subject;
  }
  public void setSubject(String subject) {
    this.subject = subject;
  }


  /**
   * The attachments of the email message.
   **/
  public EmailMessageReply attachments(List<Attachment> attachments) {
    this.attachments = attachments;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The attachments of the email message.")
  @JsonProperty("attachments")
  public List<Attachment> getAttachments() {
    return attachments;
  }
  public void setAttachments(List<Attachment> attachments) {
    this.attachments = attachments;
  }


  /**
   * The text body of the email message.
   **/
  public EmailMessageReply textBody(String textBody) {
    this.textBody = textBody;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The text body of the email message.")
  @JsonProperty("textBody")
  public String getTextBody() {
    return textBody;
  }
  public void setTextBody(String textBody) {
    this.textBody = textBody;
  }


  /**
   * The html body of the email message.
   **/
  public EmailMessageReply htmlBody(String htmlBody) {
    this.htmlBody = htmlBody;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The html body of the email message.")
  @JsonProperty("htmlBody")
  public String getHtmlBody() {
    return htmlBody;
  }
  public void setHtmlBody(String htmlBody) {
    this.htmlBody = htmlBody;
  }


  /**
   * The time when the message was received or sent. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public EmailMessageReply time(Date time) {
    this.time = time;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The time when the message was received or sent. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("time")
  public Date getTime() {
    return time;
  }
  public void setTime(Date time) {
    this.time = time;
  }


  /**
   * Indicates whether the history of previous emails of the conversation is included within the email bodies of this message.
   **/
  public EmailMessageReply historyIncluded(Boolean historyIncluded) {
    this.historyIncluded = historyIncluded;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Indicates whether the history of previous emails of the conversation is included within the email bodies of this message.")
  @JsonProperty("historyIncluded")
  public Boolean getHistoryIncluded() {
    return historyIncluded;
  }
  public void setHistoryIncluded(Boolean historyIncluded) {
    this.historyIncluded = historyIncluded;
  }


  @ApiModelProperty(example = "null", value = "Indicates an estimation of the size of the current email as a whole, in its final, ready to be sent form.")
  @JsonProperty("emailSizeBytes")
  public Integer getEmailSizeBytes() {
    return emailSizeBytes;
  }


  @ApiModelProperty(example = "null", value = "Indicates the maximum allowed size for an email to be send via SMTP server, based on the email domain configuration")
  @JsonProperty("maxEmailSizeBytes")
  public Integer getMaxEmailSizeBytes() {
    return maxEmailSizeBytes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EmailMessageReply emailMessageReply = (EmailMessageReply) o;

    return Objects.equals(this.to, emailMessageReply.to) &&
            Objects.equals(this.cc, emailMessageReply.cc) &&
            Objects.equals(this.bcc, emailMessageReply.bcc) &&
            Objects.equals(this.from, emailMessageReply.from) &&
            Objects.equals(this.replyTo, emailMessageReply.replyTo) &&
            Objects.equals(this.subject, emailMessageReply.subject) &&
            Objects.equals(this.attachments, emailMessageReply.attachments) &&
            Objects.equals(this.textBody, emailMessageReply.textBody) &&
            Objects.equals(this.htmlBody, emailMessageReply.htmlBody) &&
            Objects.equals(this.time, emailMessageReply.time) &&
            Objects.equals(this.historyIncluded, emailMessageReply.historyIncluded) &&
            Objects.equals(this.emailSizeBytes, emailMessageReply.emailSizeBytes) &&
            Objects.equals(this.maxEmailSizeBytes, emailMessageReply.maxEmailSizeBytes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(to, cc, bcc, from, replyTo, subject, attachments, textBody, htmlBody, time, historyIncluded, emailSizeBytes, maxEmailSizeBytes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmailMessageReply {\n");
    
    sb.append("    to: ").append(toIndentedString(to)).append("\n");
    sb.append("    cc: ").append(toIndentedString(cc)).append("\n");
    sb.append("    bcc: ").append(toIndentedString(bcc)).append("\n");
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    replyTo: ").append(toIndentedString(replyTo)).append("\n");
    sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
    sb.append("    attachments: ").append(toIndentedString(attachments)).append("\n");
    sb.append("    textBody: ").append(toIndentedString(textBody)).append("\n");
    sb.append("    htmlBody: ").append(toIndentedString(htmlBody)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
    sb.append("    historyIncluded: ").append(toIndentedString(historyIncluded)).append("\n");
    sb.append("    emailSizeBytes: ").append(toIndentedString(emailSizeBytes)).append("\n");
    sb.append("    maxEmailSizeBytes: ").append(toIndentedString(maxEmailSizeBytes)).append("\n");
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

