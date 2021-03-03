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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import java.io.Serializable;
/**
 * TestMessage
 */

public class TestMessage  implements Serializable {
  
  private String id = null;
  private List<EmailAddress> to = new ArrayList<EmailAddress>();
  private EmailAddress from = null;
  private String subject = null;
  private String textBody = null;
  private String htmlBody = null;
  private Date time = null;

  
  @ApiModelProperty(example = "null", value = "After the message has been sent, this is the value of the Message-ID email header.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  
  /**
   * The recipients of the email message.
   **/
  public TestMessage to(List<EmailAddress> to) {
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
   * The sender of the email message.
   **/
  public TestMessage from(EmailAddress from) {
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
   * The subject of the email message.
   **/
  public TestMessage subject(String subject) {
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
   * The text body of the email message.
   **/
  public TestMessage textBody(String textBody) {
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
   * The html body of the email message
   **/
  public TestMessage htmlBody(String htmlBody) {
    this.htmlBody = htmlBody;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The html body of the email message")
  @JsonProperty("htmlBody")
  public String getHtmlBody() {
    return htmlBody;
  }
  public void setHtmlBody(String htmlBody) {
    this.htmlBody = htmlBody;
  }

  
  /**
   * The time when the message was sent. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public TestMessage time(Date time) {
    this.time = time;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The time when the message was sent. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
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
    TestMessage testMessage = (TestMessage) o;
    return Objects.equals(this.id, testMessage.id) &&
        Objects.equals(this.to, testMessage.to) &&
        Objects.equals(this.from, testMessage.from) &&
        Objects.equals(this.subject, testMessage.subject) &&
        Objects.equals(this.textBody, testMessage.textBody) &&
        Objects.equals(this.htmlBody, testMessage.htmlBody) &&
        Objects.equals(this.time, testMessage.time);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, to, from, subject, textBody, htmlBody, time);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TestMessage {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    to: ").append(toIndentedString(to)).append("\n");
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
    sb.append("    textBody: ").append(toIndentedString(textBody)).append("\n");
    sb.append("    htmlBody: ").append(toIndentedString(htmlBody)).append("\n");
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

