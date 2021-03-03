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
import com.mypurecloud.sdk.v2.model.EmailAddress;
import com.mypurecloud.sdk.v2.model.EmailAttachment;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import java.io.Serializable;
/**
 * RecordingEmailMessage
 */

public class RecordingEmailMessage  implements Serializable {
  
  private String htmlBody = null;
  private String textBody = null;
  private String id = null;
  private List<EmailAddress> to = new ArrayList<EmailAddress>();
  private List<EmailAddress> cc = new ArrayList<EmailAddress>();
  private List<EmailAddress> bcc = new ArrayList<EmailAddress>();
  private EmailAddress from = null;
  private String subject = null;
  private List<EmailAttachment> attachments = new ArrayList<EmailAttachment>();
  private Date time = null;

  
  /**
   **/
  public RecordingEmailMessage htmlBody(String htmlBody) {
    this.htmlBody = htmlBody;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("htmlBody")
  public String getHtmlBody() {
    return htmlBody;
  }
  public void setHtmlBody(String htmlBody) {
    this.htmlBody = htmlBody;
  }

  
  /**
   **/
  public RecordingEmailMessage textBody(String textBody) {
    this.textBody = textBody;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("textBody")
  public String getTextBody() {
    return textBody;
  }
  public void setTextBody(String textBody) {
    this.textBody = textBody;
  }

  
  /**
   **/
  public RecordingEmailMessage id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  
  /**
   **/
  public RecordingEmailMessage to(List<EmailAddress> to) {
    this.to = to;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("to")
  public List<EmailAddress> getTo() {
    return to;
  }
  public void setTo(List<EmailAddress> to) {
    this.to = to;
  }

  
  /**
   **/
  public RecordingEmailMessage cc(List<EmailAddress> cc) {
    this.cc = cc;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("cc")
  public List<EmailAddress> getCc() {
    return cc;
  }
  public void setCc(List<EmailAddress> cc) {
    this.cc = cc;
  }

  
  /**
   **/
  public RecordingEmailMessage bcc(List<EmailAddress> bcc) {
    this.bcc = bcc;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("bcc")
  public List<EmailAddress> getBcc() {
    return bcc;
  }
  public void setBcc(List<EmailAddress> bcc) {
    this.bcc = bcc;
  }

  
  /**
   **/
  public RecordingEmailMessage from(EmailAddress from) {
    this.from = from;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("from")
  public EmailAddress getFrom() {
    return from;
  }
  public void setFrom(EmailAddress from) {
    this.from = from;
  }

  
  /**
   **/
  public RecordingEmailMessage subject(String subject) {
    this.subject = subject;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("subject")
  public String getSubject() {
    return subject;
  }
  public void setSubject(String subject) {
    this.subject = subject;
  }

  
  /**
   **/
  public RecordingEmailMessage attachments(List<EmailAttachment> attachments) {
    this.attachments = attachments;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("attachments")
  public List<EmailAttachment> getAttachments() {
    return attachments;
  }
  public void setAttachments(List<EmailAttachment> attachments) {
    this.attachments = attachments;
  }

  
  /**
   * Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public RecordingEmailMessage time(Date time) {
    this.time = time;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("time")
  public Date getTime() {
    return time;
  }
  public void setTime(Date time) {
    this.time = time;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RecordingEmailMessage recordingEmailMessage = (RecordingEmailMessage) o;
    return Objects.equals(this.htmlBody, recordingEmailMessage.htmlBody) &&
        Objects.equals(this.textBody, recordingEmailMessage.textBody) &&
        Objects.equals(this.id, recordingEmailMessage.id) &&
        Objects.equals(this.to, recordingEmailMessage.to) &&
        Objects.equals(this.cc, recordingEmailMessage.cc) &&
        Objects.equals(this.bcc, recordingEmailMessage.bcc) &&
        Objects.equals(this.from, recordingEmailMessage.from) &&
        Objects.equals(this.subject, recordingEmailMessage.subject) &&
        Objects.equals(this.attachments, recordingEmailMessage.attachments) &&
        Objects.equals(this.time, recordingEmailMessage.time);
  }

  @Override
  public int hashCode() {
    return Objects.hash(htmlBody, textBody, id, to, cc, bcc, from, subject, attachments, time);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecordingEmailMessage {\n");
    
    sb.append("    htmlBody: ").append(toIndentedString(htmlBody)).append("\n");
    sb.append("    textBody: ").append(toIndentedString(textBody)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    to: ").append(toIndentedString(to)).append("\n");
    sb.append("    cc: ").append(toIndentedString(cc)).append("\n");
    sb.append("    bcc: ").append(toIndentedString(bcc)).append("\n");
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
    sb.append("    attachments: ").append(toIndentedString(attachments)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
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

