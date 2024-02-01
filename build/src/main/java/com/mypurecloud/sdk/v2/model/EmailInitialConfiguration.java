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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import java.io.Serializable;
/**
 * EmailInitialConfiguration
 */

public class EmailInitialConfiguration  implements Serializable {
  
  private String to = null;
  private String from = null;
  private List<String> cc = new ArrayList<String>();
  private List<String> bcc = new ArrayList<String>();
  private String subject = null;
  private String previousEmailId = null;
  private Boolean held = null;
  private Boolean alerting = null;
  private Boolean inbound = null;
  private String invitedBy = null;
  private Map<String, String> additionalInfo = null;

  
  /**
   * An email address that this email is to.
   **/
  public EmailInitialConfiguration to(String to) {
    this.to = to;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "An email address that this email is to.")
  @JsonProperty("to")
  public String getTo() {
    return to;
  }
  public void setTo(String to) {
    this.to = to;
  }


  /**
   * An email address that this email is from.
   **/
  public EmailInitialConfiguration from(String from) {
    this.from = from;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "An email address that this email is from.")
  @JsonProperty("from")
  public String getFrom() {
    return from;
  }
  public void setFrom(String from) {
    this.from = from;
  }


  /**
   * An email addresses that this email is carbon copied to.
   **/
  public EmailInitialConfiguration cc(List<String> cc) {
    this.cc = cc;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "An email addresses that this email is carbon copied to.")
  @JsonProperty("cc")
  public List<String> getCc() {
    return cc;
  }
  public void setCc(List<String> cc) {
    this.cc = cc;
  }


  /**
   * An email addresses that this email is blind carbon copied to.
   **/
  public EmailInitialConfiguration bcc(List<String> bcc) {
    this.bcc = bcc;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "An email addresses that this email is blind carbon copied to.")
  @JsonProperty("bcc")
  public List<String> getBcc() {
    return bcc;
  }
  public void setBcc(List<String> bcc) {
    this.bcc = bcc;
  }


  /**
   * The subject for this email.
   **/
  public EmailInitialConfiguration subject(String subject) {
    this.subject = subject;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The subject for this email.")
  @JsonProperty("subject")
  public String getSubject() {
    return subject;
  }
  public void setSubject(String subject) {
    this.subject = subject;
  }


  /**
   * UUID identifying the most recent previous email communication ID from the same participant on this email conversation. Will be null if this is a new participant.
   **/
  public EmailInitialConfiguration previousEmailId(String previousEmailId) {
    this.previousEmailId = previousEmailId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "UUID identifying the most recent previous email communication ID from the same participant on this email conversation. Will be null if this is a new participant.")
  @JsonProperty("previousEmailId")
  public String getPreviousEmailId() {
    return previousEmailId;
  }
  public void setPreviousEmailId(String previousEmailId) {
    this.previousEmailId = previousEmailId;
  }


  /**
   * Indicates that this communication's initial state is held.
   **/
  public EmailInitialConfiguration held(Boolean held) {
    this.held = held;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Indicates that this communication's initial state is held.")
  @JsonProperty("held")
  public Boolean getHeld() {
    return held;
  }
  public void setHeld(Boolean held) {
    this.held = held;
  }


  /**
   * Indicates that this communication's initial state is alerting. If false, the communication started in a connected state.
   **/
  public EmailInitialConfiguration alerting(Boolean alerting) {
    this.alerting = alerting;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Indicates that this communication's initial state is alerting. If false, the communication started in a connected state.")
  @JsonProperty("alerting")
  public Boolean getAlerting() {
    return alerting;
  }
  public void setAlerting(Boolean alerting) {
    this.alerting = alerting;
  }


  /**
   * Indicates the direction of this communication with respect to the contact center. `true` means the communication is INBOUND. `false` means the communication is OUTBOUND.
   **/
  public EmailInitialConfiguration inbound(Boolean inbound) {
    this.inbound = inbound;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Indicates the direction of this communication with respect to the contact center. `true` means the communication is INBOUND. `false` means the communication is OUTBOUND.")
  @JsonProperty("inbound")
  public Boolean getInbound() {
    return inbound;
  }
  public void setInbound(Boolean inbound) {
    this.inbound = inbound;
  }


  /**
   * The id of the communication (the \"peer\") that \"invited\" this communication, if this occurred.
   **/
  public EmailInitialConfiguration invitedBy(String invitedBy) {
    this.invitedBy = invitedBy;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The id of the communication (the \"peer\") that \"invited\" this communication, if this occurred.")
  @JsonProperty("invitedBy")
  public String getInvitedBy() {
    return invitedBy;
  }
  public void setInvitedBy(String invitedBy) {
    this.invitedBy = invitedBy;
  }


  /**
   * Additional metadata about this session which should be recorded by the platform but which will not be indexed or searchable. Primarily for diagnostic value. Any information that needs to be accessible through other components like Analytics should be moved to dedicated fields.
   **/
  public EmailInitialConfiguration additionalInfo(Map<String, String> additionalInfo) {
    this.additionalInfo = additionalInfo;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Additional metadata about this session which should be recorded by the platform but which will not be indexed or searchable. Primarily for diagnostic value. Any information that needs to be accessible through other components like Analytics should be moved to dedicated fields.")
  @JsonProperty("additionalInfo")
  public Map<String, String> getAdditionalInfo() {
    return additionalInfo;
  }
  public void setAdditionalInfo(Map<String, String> additionalInfo) {
    this.additionalInfo = additionalInfo;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EmailInitialConfiguration emailInitialConfiguration = (EmailInitialConfiguration) o;

    return Objects.equals(this.to, emailInitialConfiguration.to) &&
            Objects.equals(this.from, emailInitialConfiguration.from) &&
            Objects.equals(this.cc, emailInitialConfiguration.cc) &&
            Objects.equals(this.bcc, emailInitialConfiguration.bcc) &&
            Objects.equals(this.subject, emailInitialConfiguration.subject) &&
            Objects.equals(this.previousEmailId, emailInitialConfiguration.previousEmailId) &&
            Objects.equals(this.held, emailInitialConfiguration.held) &&
            Objects.equals(this.alerting, emailInitialConfiguration.alerting) &&
            Objects.equals(this.inbound, emailInitialConfiguration.inbound) &&
            Objects.equals(this.invitedBy, emailInitialConfiguration.invitedBy) &&
            Objects.equals(this.additionalInfo, emailInitialConfiguration.additionalInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(to, from, cc, bcc, subject, previousEmailId, held, alerting, inbound, invitedBy, additionalInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmailInitialConfiguration {\n");
    
    sb.append("    to: ").append(toIndentedString(to)).append("\n");
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    cc: ").append(toIndentedString(cc)).append("\n");
    sb.append("    bcc: ").append(toIndentedString(bcc)).append("\n");
    sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
    sb.append("    previousEmailId: ").append(toIndentedString(previousEmailId)).append("\n");
    sb.append("    held: ").append(toIndentedString(held)).append("\n");
    sb.append("    alerting: ").append(toIndentedString(alerting)).append("\n");
    sb.append("    inbound: ").append(toIndentedString(inbound)).append("\n");
    sb.append("    invitedBy: ").append(toIndentedString(invitedBy)).append("\n");
    sb.append("    additionalInfo: ").append(toIndentedString(additionalInfo)).append("\n");
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

