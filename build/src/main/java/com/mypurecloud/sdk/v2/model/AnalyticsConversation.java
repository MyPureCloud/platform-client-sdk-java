package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.mypurecloud.sdk.v2.model.AnalyticsEvaluation;
import com.mypurecloud.sdk.v2.model.AnalyticsParticipant;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import java.io.Serializable;
/**
 * AnalyticsConversation
 */

public class AnalyticsConversation  implements Serializable {
  
  private String conversationId = null;
  private Date conversationStart = null;
  private Date conversationEnd = null;
  private List<AnalyticsParticipant> participants = new ArrayList<AnalyticsParticipant>();
  private List<AnalyticsEvaluation> evaluations = new ArrayList<AnalyticsEvaluation>();
  private List<String> divisionIds = new ArrayList<String>();

  
  /**
   * Unique identifier for the conversation
   **/
  public AnalyticsConversation conversationId(String conversationId) {
    this.conversationId = conversationId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Unique identifier for the conversation")
  @JsonProperty("conversationId")
  public String getConversationId() {
    return conversationId;
  }
  public void setConversationId(String conversationId) {
    this.conversationId = conversationId;
  }

  
  /**
   * Date/time the conversation started. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ
   **/
  public AnalyticsConversation conversationStart(Date conversationStart) {
    this.conversationStart = conversationStart;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Date/time the conversation started. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ")
  @JsonProperty("conversationStart")
  public Date getConversationStart() {
    return conversationStart;
  }
  public void setConversationStart(Date conversationStart) {
    this.conversationStart = conversationStart;
  }

  
  /**
   * Date/time the conversation ended. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ
   **/
  public AnalyticsConversation conversationEnd(Date conversationEnd) {
    this.conversationEnd = conversationEnd;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Date/time the conversation ended. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ")
  @JsonProperty("conversationEnd")
  public Date getConversationEnd() {
    return conversationEnd;
  }
  public void setConversationEnd(Date conversationEnd) {
    this.conversationEnd = conversationEnd;
  }

  
  /**
   * Participants in the conversation
   **/
  public AnalyticsConversation participants(List<AnalyticsParticipant> participants) {
    this.participants = participants;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Participants in the conversation")
  @JsonProperty("participants")
  public List<AnalyticsParticipant> getParticipants() {
    return participants;
  }
  public void setParticipants(List<AnalyticsParticipant> participants) {
    this.participants = participants;
  }

  
  /**
   * Evaluations tied to this conversation
   **/
  public AnalyticsConversation evaluations(List<AnalyticsEvaluation> evaluations) {
    this.evaluations = evaluations;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Evaluations tied to this conversation")
  @JsonProperty("evaluations")
  public List<AnalyticsEvaluation> getEvaluations() {
    return evaluations;
  }
  public void setEvaluations(List<AnalyticsEvaluation> evaluations) {
    this.evaluations = evaluations;
  }

  
  /**
   * Identifiers of divisions associated with this conversation
   **/
  public AnalyticsConversation divisionIds(List<String> divisionIds) {
    this.divisionIds = divisionIds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Identifiers of divisions associated with this conversation")
  @JsonProperty("divisionIds")
  public List<String> getDivisionIds() {
    return divisionIds;
  }
  public void setDivisionIds(List<String> divisionIds) {
    this.divisionIds = divisionIds;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AnalyticsConversation analyticsConversation = (AnalyticsConversation) o;
    return Objects.equals(this.conversationId, analyticsConversation.conversationId) &&
        Objects.equals(this.conversationStart, analyticsConversation.conversationStart) &&
        Objects.equals(this.conversationEnd, analyticsConversation.conversationEnd) &&
        Objects.equals(this.participants, analyticsConversation.participants) &&
        Objects.equals(this.evaluations, analyticsConversation.evaluations) &&
        Objects.equals(this.divisionIds, analyticsConversation.divisionIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(conversationId, conversationStart, conversationEnd, participants, evaluations, divisionIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AnalyticsConversation {\n");
    
    sb.append("    conversationId: ").append(toIndentedString(conversationId)).append("\n");
    sb.append("    conversationStart: ").append(toIndentedString(conversationStart)).append("\n");
    sb.append("    conversationEnd: ").append(toIndentedString(conversationEnd)).append("\n");
    sb.append("    participants: ").append(toIndentedString(participants)).append("\n");
    sb.append("    evaluations: ").append(toIndentedString(evaluations)).append("\n");
    sb.append("    divisionIds: ").append(toIndentedString(divisionIds)).append("\n");
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

