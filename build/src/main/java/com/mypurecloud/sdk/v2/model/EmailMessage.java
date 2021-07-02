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
import com.mypurecloud.sdk.v2.model.Attachment;
import com.mypurecloud.sdk.v2.model.EmailAddress;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import java.io.Serializable;
/**
 * EmailMessage
 */

public class EmailMessage  implements Serializable {
  
  private String id = null;
  private String name = null;
  private List<EmailAddress> to = new ArrayList<EmailAddress>();
  private List<EmailAddress> cc = new ArrayList<EmailAddress>();
  private List<EmailAddress> bcc = new ArrayList<EmailAddress>();
  private EmailAddress from = null;
  private EmailAddress replyTo = null;
  private String subject = null;
  private List<Attachment> attachments = new ArrayList<Attachment>();
  private String textBody = null;
  private String htmlBody = null;
  private Date time = null;
  private Boolean historyIncluded = null;
  private String selfUri = null;

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  
  /**
   **/
  public EmailMessage name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   * The recipients of the email message.
   **/
  public EmailMessage to(List<EmailAddress> to) {
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
  public EmailMessage cc(List<EmailAddress> cc) {
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
  public EmailMessage bcc(List<EmailAddress> bcc) {
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
  public EmailMessage from(EmailAddress from) {
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
  public EmailMessage replyTo(EmailAddress replyTo) {
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
  public EmailMessage subject(String subject) {
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
  public EmailMessage attachments(List<Attachment> attachments) {
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
  public EmailMessage textBody(String textBody) {
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
  public EmailMessage htmlBody(String htmlBody) {
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
  public EmailMessage time(Date time) {
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
  public EmailMessage historyIncluded(Boolean historyIncluded) {
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

  
  @ApiModelProperty(example = "null", value = "The URI for this object")
  @JsonProperty("selfUri")
  public String getSelfUri() {
    return selfUri;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EmailMessage emailMessage = (EmailMessage) o;
    return Objects.equals(this.id, emailMessage.id) &&
        Objects.equals(this.name, emailMessage.name) &&
        Objects.equals(this.to, emailMessage.to) &&
        Objects.equals(this.cc, emailMessage.cc) &&
        Objects.equals(this.bcc, emailMessage.bcc) &&
        Objects.equals(this.from, emailMessage.from) &&
        Objects.equals(this.replyTo, emailMessage.replyTo) &&
        Objects.equals(this.subject, emailMessage.subject) &&
        Objects.equals(this.attachments, emailMessage.attachments) &&
        Objects.equals(this.textBody, emailMessage.textBody) &&
        Objects.equals(this.htmlBody, emailMessage.htmlBody) &&
        Objects.equals(this.time, emailMessage.time) &&
        Objects.equals(this.historyIncluded, emailMessage.historyIncluded) &&
        Objects.equals(this.selfUri, emailMessage.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, to, cc, bcc, from, replyTo, subject, attachments, textBody, htmlBody, time, historyIncluded, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmailMessage {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
    sb.append("    selfUri: ").append(toIndentedString(selfUri)).append("\n");
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

