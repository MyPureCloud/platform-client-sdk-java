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
 * HistoryHeadersTranslation
 */

public class HistoryHeadersTranslation  implements Serializable {
  
  private String from = null;
  private String to = null;
  private String cc = null;
  private String subject = null;
  private String replyPrefix = null;
  private String forwardPrefix = null;
  private String sent = null;
  private String language = null;
  private String timeZone = null;

  public HistoryHeadersTranslation() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * A translation for the word \"from\", for the expected language
   **/
  public HistoryHeadersTranslation from(String from) {
    this.from = from;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "A translation for the word \"from\", for the expected language")
  @JsonProperty("from")
  public String getFrom() {
    return from;
  }
  public void setFrom(String from) {
    this.from = from;
  }


  /**
   * A translation for the word \"to\", for the expected language
   **/
  public HistoryHeadersTranslation to(String to) {
    this.to = to;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "A translation for the word \"to\", for the expected language")
  @JsonProperty("to")
  public String getTo() {
    return to;
  }
  public void setTo(String to) {
    this.to = to;
  }


  /**
   * A translation for the word \"cc\", for the expected language
   **/
  public HistoryHeadersTranslation cc(String cc) {
    this.cc = cc;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "A translation for the word \"cc\", for the expected language")
  @JsonProperty("cc")
  public String getCc() {
    return cc;
  }
  public void setCc(String cc) {
    this.cc = cc;
  }


  /**
   * A translation for the word \"subject\", for the expected language
   **/
  public HistoryHeadersTranslation subject(String subject) {
    this.subject = subject;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "A translation for the word \"subject\", for the expected language")
  @JsonProperty("subject")
  public String getSubject() {
    return subject;
  }
  public void setSubject(String subject) {
    this.subject = subject;
  }


  /**
   * A translation for the subject prefix \"Reply\", for the expected language
   **/
  public HistoryHeadersTranslation replyPrefix(String replyPrefix) {
    this.replyPrefix = replyPrefix;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "A translation for the subject prefix \"Reply\", for the expected language")
  @JsonProperty("replyPrefix")
  public String getReplyPrefix() {
    return replyPrefix;
  }
  public void setReplyPrefix(String replyPrefix) {
    this.replyPrefix = replyPrefix;
  }


  /**
   * A translation for the subject prefix \"Forward\", for the expected language
   **/
  public HistoryHeadersTranslation forwardPrefix(String forwardPrefix) {
    this.forwardPrefix = forwardPrefix;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "A translation for the subject prefix \"Forward\", for the expected language")
  @JsonProperty("forwardPrefix")
  public String getForwardPrefix() {
    return forwardPrefix;
  }
  public void setForwardPrefix(String forwardPrefix) {
    this.forwardPrefix = forwardPrefix;
  }


  /**
   * A translation for the word \"sent\", for the expected language
   **/
  public HistoryHeadersTranslation sent(String sent) {
    this.sent = sent;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "A translation for the word \"sent\", for the expected language")
  @JsonProperty("sent")
  public String getSent() {
    return sent;
  }
  public void setSent(String sent) {
    this.sent = sent;
  }


  /**
   * The code of the expected language
   **/
  public HistoryHeadersTranslation language(String language) {
    this.language = language;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The code of the expected language")
  @JsonProperty("language")
  public String getLanguage() {
    return language;
  }
  public void setLanguage(String language) {
    this.language = language;
  }


  /**
   * Timezone used by the agent, used to format the sent email date and time. If not defined, will default to UTC. Time zones are represented as a string of the zone name as found in the IANA time zone database. For example: UTC, Etc/UTC, or Europe/London
   **/
  public HistoryHeadersTranslation timeZone(String timeZone) {
    this.timeZone = timeZone;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Timezone used by the agent, used to format the sent email date and time. If not defined, will default to UTC. Time zones are represented as a string of the zone name as found in the IANA time zone database. For example: UTC, Etc/UTC, or Europe/London")
  @JsonProperty("timeZone")
  public String getTimeZone() {
    return timeZone;
  }
  public void setTimeZone(String timeZone) {
    this.timeZone = timeZone;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HistoryHeadersTranslation historyHeadersTranslation = (HistoryHeadersTranslation) o;

    return Objects.equals(this.from, historyHeadersTranslation.from) &&
            Objects.equals(this.to, historyHeadersTranslation.to) &&
            Objects.equals(this.cc, historyHeadersTranslation.cc) &&
            Objects.equals(this.subject, historyHeadersTranslation.subject) &&
            Objects.equals(this.replyPrefix, historyHeadersTranslation.replyPrefix) &&
            Objects.equals(this.forwardPrefix, historyHeadersTranslation.forwardPrefix) &&
            Objects.equals(this.sent, historyHeadersTranslation.sent) &&
            Objects.equals(this.language, historyHeadersTranslation.language) &&
            Objects.equals(this.timeZone, historyHeadersTranslation.timeZone);
  }

  @Override
  public int hashCode() {
    return Objects.hash(from, to, cc, subject, replyPrefix, forwardPrefix, sent, language, timeZone);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HistoryHeadersTranslation {\n");
    
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    to: ").append(toIndentedString(to)).append("\n");
    sb.append("    cc: ").append(toIndentedString(cc)).append("\n");
    sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
    sb.append("    replyPrefix: ").append(toIndentedString(replyPrefix)).append("\n");
    sb.append("    forwardPrefix: ").append(toIndentedString(forwardPrefix)).append("\n");
    sb.append("    sent: ").append(toIndentedString(sent)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    timeZone: ").append(toIndentedString(timeZone)).append("\n");
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

