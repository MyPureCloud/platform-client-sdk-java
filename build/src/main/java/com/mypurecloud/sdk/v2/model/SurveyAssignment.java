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
import com.mypurecloud.sdk.v2.model.PublishedSurveyFormReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * SurveyAssignment
 */

public class SurveyAssignment  implements Serializable {
  
  private PublishedSurveyFormReference surveyForm = null;
  private DomainEntityRef flow = null;
  private String inviteTimeInterval = null;
  private String sendingUser = null;
  private String sendingDomain = null;

  
  /**
   * The survey form used for this survey.
   **/
  public SurveyAssignment surveyForm(PublishedSurveyFormReference surveyForm) {
    this.surveyForm = surveyForm;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The survey form used for this survey.")
  @JsonProperty("surveyForm")
  public PublishedSurveyFormReference getSurveyForm() {
    return surveyForm;
  }
  public void setSurveyForm(PublishedSurveyFormReference surveyForm) {
    this.surveyForm = surveyForm;
  }

  
  /**
   * The URI reference to the flow associated with this survey.
   **/
  public SurveyAssignment flow(DomainEntityRef flow) {
    this.flow = flow;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The URI reference to the flow associated with this survey.")
  @JsonProperty("flow")
  public DomainEntityRef getFlow() {
    return flow;
  }
  public void setFlow(DomainEntityRef flow) {
    this.flow = flow;
  }

  
  /**
   * An ISO 8601 repeated interval consisting of the number of repetitions, the start datetime, and the interval (e.g. R2/2018-03-01T13:00:00Z/P1M10DT2H30M). Total duration must not exceed 90 days.
   **/
  public SurveyAssignment inviteTimeInterval(String inviteTimeInterval) {
    this.inviteTimeInterval = inviteTimeInterval;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "An ISO 8601 repeated interval consisting of the number of repetitions, the start datetime, and the interval (e.g. R2/2018-03-01T13:00:00Z/P1M10DT2H30M). Total duration must not exceed 90 days.")
  @JsonProperty("inviteTimeInterval")
  public String getInviteTimeInterval() {
    return inviteTimeInterval;
  }
  public void setInviteTimeInterval(String inviteTimeInterval) {
    this.inviteTimeInterval = inviteTimeInterval;
  }

  
  /**
   * User together with sendingDomain used to send email, null to use no-reply
   **/
  public SurveyAssignment sendingUser(String sendingUser) {
    this.sendingUser = sendingUser;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "User together with sendingDomain used to send email, null to use no-reply")
  @JsonProperty("sendingUser")
  public String getSendingUser() {
    return sendingUser;
  }
  public void setSendingUser(String sendingUser) {
    this.sendingUser = sendingUser;
  }

  
  /**
   * Validated email domain, required
   **/
  public SurveyAssignment sendingDomain(String sendingDomain) {
    this.sendingDomain = sendingDomain;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Validated email domain, required")
  @JsonProperty("sendingDomain")
  public String getSendingDomain() {
    return sendingDomain;
  }
  public void setSendingDomain(String sendingDomain) {
    this.sendingDomain = sendingDomain;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SurveyAssignment surveyAssignment = (SurveyAssignment) o;
    return Objects.equals(this.surveyForm, surveyAssignment.surveyForm) &&
        Objects.equals(this.flow, surveyAssignment.flow) &&
        Objects.equals(this.inviteTimeInterval, surveyAssignment.inviteTimeInterval) &&
        Objects.equals(this.sendingUser, surveyAssignment.sendingUser) &&
        Objects.equals(this.sendingDomain, surveyAssignment.sendingDomain);
  }

  @Override
  public int hashCode() {
    return Objects.hash(surveyForm, flow, inviteTimeInterval, sendingUser, sendingDomain);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SurveyAssignment {\n");
    
    sb.append("    surveyForm: ").append(toIndentedString(surveyForm)).append("\n");
    sb.append("    flow: ").append(toIndentedString(flow)).append("\n");
    sb.append("    inviteTimeInterval: ").append(toIndentedString(inviteTimeInterval)).append("\n");
    sb.append("    sendingUser: ").append(toIndentedString(sendingUser)).append("\n");
    sb.append("    sendingDomain: ").append(toIndentedString(sendingDomain)).append("\n");
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

