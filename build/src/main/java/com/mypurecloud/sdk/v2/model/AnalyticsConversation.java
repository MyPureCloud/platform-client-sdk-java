package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.mypurecloud.sdk.v2.model.AnalyticsEvaluation;
import com.mypurecloud.sdk.v2.model.AnalyticsParticipant;
import com.mypurecloud.sdk.v2.model.AnalyticsSurvey;
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
  private Double mediaStatsMinConversationMos = null;
  private Double mediaStatsMinConversationRFactor = null;

  /**
   * The original direction of the conversation
   */
  public enum OriginatingDirectionEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    INBOUND("inbound"),
    OUTBOUND("outbound");

    private String value;

    OriginatingDirectionEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static OriginatingDirectionEnum fromString(String key) {
      if (key == null) return null;

      for (OriginatingDirectionEnum value : OriginatingDirectionEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return OriginatingDirectionEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private OriginatingDirectionEnum originatingDirection = null;
  private List<AnalyticsEvaluation> evaluations = new ArrayList<AnalyticsEvaluation>();
  private List<AnalyticsSurvey> surveys = new ArrayList<AnalyticsSurvey>();
  private List<String> divisionIds = new ArrayList<String>();
  private List<AnalyticsParticipant> participants = new ArrayList<AnalyticsParticipant>();

  
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
   * Date/time the conversation started. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public AnalyticsConversation conversationStart(Date conversationStart) {
    this.conversationStart = conversationStart;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Date/time the conversation started. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("conversationStart")
  public Date getConversationStart() {
    return conversationStart;
  }
  public void setConversationStart(Date conversationStart) {
    this.conversationStart = conversationStart;
  }

  
  /**
   * Date/time the conversation ended. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public AnalyticsConversation conversationEnd(Date conversationEnd) {
    this.conversationEnd = conversationEnd;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Date/time the conversation ended. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("conversationEnd")
  public Date getConversationEnd() {
    return conversationEnd;
  }
  public void setConversationEnd(Date conversationEnd) {
    this.conversationEnd = conversationEnd;
  }

  
  /**
   * The lowest estimated average MOS among all the audio streams belonging to this conversation
   **/
  public AnalyticsConversation mediaStatsMinConversationMos(Double mediaStatsMinConversationMos) {
    this.mediaStatsMinConversationMos = mediaStatsMinConversationMos;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The lowest estimated average MOS among all the audio streams belonging to this conversation")
  @JsonProperty("mediaStatsMinConversationMos")
  public Double getMediaStatsMinConversationMos() {
    return mediaStatsMinConversationMos;
  }
  public void setMediaStatsMinConversationMos(Double mediaStatsMinConversationMos) {
    this.mediaStatsMinConversationMos = mediaStatsMinConversationMos;
  }

  
  /**
   * The lowest R-factor value among all of the audio streams belonging to this conversation
   **/
  public AnalyticsConversation mediaStatsMinConversationRFactor(Double mediaStatsMinConversationRFactor) {
    this.mediaStatsMinConversationRFactor = mediaStatsMinConversationRFactor;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The lowest R-factor value among all of the audio streams belonging to this conversation")
  @JsonProperty("mediaStatsMinConversationRFactor")
  public Double getMediaStatsMinConversationRFactor() {
    return mediaStatsMinConversationRFactor;
  }
  public void setMediaStatsMinConversationRFactor(Double mediaStatsMinConversationRFactor) {
    this.mediaStatsMinConversationRFactor = mediaStatsMinConversationRFactor;
  }

  
  /**
   * The original direction of the conversation
   **/
  public AnalyticsConversation originatingDirection(OriginatingDirectionEnum originatingDirection) {
    this.originatingDirection = originatingDirection;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The original direction of the conversation")
  @JsonProperty("originatingDirection")
  public OriginatingDirectionEnum getOriginatingDirection() {
    return originatingDirection;
  }
  public void setOriginatingDirection(OriginatingDirectionEnum originatingDirection) {
    this.originatingDirection = originatingDirection;
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
   * Surveys tied to this conversation
   **/
  public AnalyticsConversation surveys(List<AnalyticsSurvey> surveys) {
    this.surveys = surveys;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Surveys tied to this conversation")
  @JsonProperty("surveys")
  public List<AnalyticsSurvey> getSurveys() {
    return surveys;
  }
  public void setSurveys(List<AnalyticsSurvey> surveys) {
    this.surveys = surveys;
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
        Objects.equals(this.mediaStatsMinConversationMos, analyticsConversation.mediaStatsMinConversationMos) &&
        Objects.equals(this.mediaStatsMinConversationRFactor, analyticsConversation.mediaStatsMinConversationRFactor) &&
        Objects.equals(this.originatingDirection, analyticsConversation.originatingDirection) &&
        Objects.equals(this.evaluations, analyticsConversation.evaluations) &&
        Objects.equals(this.surveys, analyticsConversation.surveys) &&
        Objects.equals(this.divisionIds, analyticsConversation.divisionIds) &&
        Objects.equals(this.participants, analyticsConversation.participants);
  }

  @Override
  public int hashCode() {
    return Objects.hash(conversationId, conversationStart, conversationEnd, mediaStatsMinConversationMos, mediaStatsMinConversationRFactor, originatingDirection, evaluations, surveys, divisionIds, participants);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AnalyticsConversation {\n");
    
    sb.append("    conversationId: ").append(toIndentedString(conversationId)).append("\n");
    sb.append("    conversationStart: ").append(toIndentedString(conversationStart)).append("\n");
    sb.append("    conversationEnd: ").append(toIndentedString(conversationEnd)).append("\n");
    sb.append("    mediaStatsMinConversationMos: ").append(toIndentedString(mediaStatsMinConversationMos)).append("\n");
    sb.append("    mediaStatsMinConversationRFactor: ").append(toIndentedString(mediaStatsMinConversationRFactor)).append("\n");
    sb.append("    originatingDirection: ").append(toIndentedString(originatingDirection)).append("\n");
    sb.append("    evaluations: ").append(toIndentedString(evaluations)).append("\n");
    sb.append("    surveys: ").append(toIndentedString(surveys)).append("\n");
    sb.append("    divisionIds: ").append(toIndentedString(divisionIds)).append("\n");
    sb.append("    participants: ").append(toIndentedString(participants)).append("\n");
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

