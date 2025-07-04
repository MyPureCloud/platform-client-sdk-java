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
import com.fasterxml.jackson.annotation.JsonValue;
import com.mypurecloud.sdk.v2.model.AnalyticsEvaluation;
import com.mypurecloud.sdk.v2.model.AnalyticsParticipantWithoutAttributes;
import com.mypurecloud.sdk.v2.model.AnalyticsResolution;
import com.mypurecloud.sdk.v2.model.AnalyticsSurvey;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import java.io.Serializable;
/**
 * AnalyticsConversationWithoutAttributes
 */

public class AnalyticsConversationWithoutAttributes  implements Serializable {
  
  private Date conferenceStart = null;
  private Date conversationEnd = null;
  private String conversationId = null;

  private static class ConversationInitiatorEnumDeserializer extends StdDeserializer<ConversationInitiatorEnum> {
    public ConversationInitiatorEnumDeserializer() {
      super(ConversationInitiatorEnumDeserializer.class);
    }

    @Override
    public ConversationInitiatorEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return ConversationInitiatorEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Indicates the participant purpose of the participant initiating a message conversation
   */
 @JsonDeserialize(using = ConversationInitiatorEnumDeserializer.class)
  public enum ConversationInitiatorEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    ACD("acd"),
    AGENT("agent"),
    API("api"),
    BOTFLOW("botflow"),
    CAMPAIGN("campaign"),
    CUSTOMER("customer"),
    DIALER("dialer"),
    EXTERNAL("external"),
    FAX("fax"),
    GROUP("group"),
    INBOUND("inbound"),
    IVR("ivr"),
    MANUAL("manual"),
    OUTBOUND("outbound"),
    STATION("station"),
    USER("user"),
    VOICEMAIL("voicemail"),
    VOICESURVEYFLOW("voicesurveyflow"),
    WORKFLOW("workflow");

    private String value;

    ConversationInitiatorEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static ConversationInitiatorEnum fromString(String key) {
      if (key == null) return null;

      for (ConversationInitiatorEnum value : ConversationInitiatorEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return ConversationInitiatorEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private ConversationInitiatorEnum conversationInitiator = null;
  private Date conversationStart = null;
  private Boolean customerParticipation = null;
  private List<String> divisionIds = null;
  private String externalTag = null;
  private Date inactivityTimeout = null;
  private List<String> knowledgeBaseIds = null;
  private Double mediaStatsMinConversationMos = null;
  private Double mediaStatsMinConversationRFactor = null;

  private static class OriginatingDirectionEnumDeserializer extends StdDeserializer<OriginatingDirectionEnum> {
    public OriginatingDirectionEnumDeserializer() {
      super(OriginatingDirectionEnumDeserializer.class);
    }

    @Override
    public OriginatingDirectionEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return OriginatingDirectionEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The original direction of the conversation
   */
 @JsonDeserialize(using = OriginatingDirectionEnumDeserializer.class)
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
  private Boolean originatingSocialMediaPublic = null;
  private Boolean selfServed = null;
  private List<AnalyticsEvaluation> evaluations = null;
  private List<AnalyticsSurvey> surveys = null;
  private List<AnalyticsResolution> resolutions = null;
  private List<AnalyticsParticipantWithoutAttributes> participants = null;

  public AnalyticsConversationWithoutAttributes() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      divisionIds = new ArrayList<String>();
      knowledgeBaseIds = new ArrayList<String>();
      evaluations = new ArrayList<AnalyticsEvaluation>();
      surveys = new ArrayList<AnalyticsSurvey>();
      resolutions = new ArrayList<AnalyticsResolution>();
      participants = new ArrayList<AnalyticsParticipantWithoutAttributes>();
    }
  }

  
  /**
   * The start time of a conference call. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public AnalyticsConversationWithoutAttributes conferenceStart(Date conferenceStart) {
    this.conferenceStart = conferenceStart;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The start time of a conference call. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("conferenceStart")
  public Date getConferenceStart() {
    return conferenceStart;
  }
  public void setConferenceStart(Date conferenceStart) {
    this.conferenceStart = conferenceStart;
  }


  /**
   * The end time of a conversation. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public AnalyticsConversationWithoutAttributes conversationEnd(Date conversationEnd) {
    this.conversationEnd = conversationEnd;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The end time of a conversation. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("conversationEnd")
  public Date getConversationEnd() {
    return conversationEnd;
  }
  public void setConversationEnd(Date conversationEnd) {
    this.conversationEnd = conversationEnd;
  }


  /**
   * Unique identifier for the conversation
   **/
  public AnalyticsConversationWithoutAttributes conversationId(String conversationId) {
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
   * Indicates the participant purpose of the participant initiating a message conversation
   **/
  public AnalyticsConversationWithoutAttributes conversationInitiator(ConversationInitiatorEnum conversationInitiator) {
    this.conversationInitiator = conversationInitiator;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Indicates the participant purpose of the participant initiating a message conversation")
  @JsonProperty("conversationInitiator")
  public ConversationInitiatorEnum getConversationInitiator() {
    return conversationInitiator;
  }
  public void setConversationInitiator(ConversationInitiatorEnum conversationInitiator) {
    this.conversationInitiator = conversationInitiator;
  }


  /**
   * The start time of a conversation. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public AnalyticsConversationWithoutAttributes conversationStart(Date conversationStart) {
    this.conversationStart = conversationStart;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The start time of a conversation. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("conversationStart")
  public Date getConversationStart() {
    return conversationStart;
  }
  public void setConversationStart(Date conversationStart) {
    this.conversationStart = conversationStart;
  }


  /**
   * Indicates a messaging conversation in which the customer participated by sending at least one message
   **/
  public AnalyticsConversationWithoutAttributes customerParticipation(Boolean customerParticipation) {
    this.customerParticipation = customerParticipation;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Indicates a messaging conversation in which the customer participated by sending at least one message")
  @JsonProperty("customerParticipation")
  public Boolean getCustomerParticipation() {
    return customerParticipation;
  }
  public void setCustomerParticipation(Boolean customerParticipation) {
    this.customerParticipation = customerParticipation;
  }


  /**
   * Identifier(s) of division(s) associated with a conversation
   **/
  public AnalyticsConversationWithoutAttributes divisionIds(List<String> divisionIds) {
    this.divisionIds = divisionIds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Identifier(s) of division(s) associated with a conversation")
  @JsonProperty("divisionIds")
  public List<String> getDivisionIds() {
    return divisionIds;
  }
  public void setDivisionIds(List<String> divisionIds) {
    this.divisionIds = divisionIds;
  }


  /**
   * External tag for the conversation
   **/
  public AnalyticsConversationWithoutAttributes externalTag(String externalTag) {
    this.externalTag = externalTag;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "External tag for the conversation")
  @JsonProperty("externalTag")
  public String getExternalTag() {
    return externalTag;
  }
  public void setExternalTag(String externalTag) {
    this.externalTag = externalTag;
  }


  /**
   * The time in the future, after which this conversation would be considered inactive. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public AnalyticsConversationWithoutAttributes inactivityTimeout(Date inactivityTimeout) {
    this.inactivityTimeout = inactivityTimeout;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The time in the future, after which this conversation would be considered inactive. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("inactivityTimeout")
  public Date getInactivityTimeout() {
    return inactivityTimeout;
  }
  public void setInactivityTimeout(Date inactivityTimeout) {
    this.inactivityTimeout = inactivityTimeout;
  }


  /**
   * The unique identifier(s) of the knowledge base(s) used
   **/
  public AnalyticsConversationWithoutAttributes knowledgeBaseIds(List<String> knowledgeBaseIds) {
    this.knowledgeBaseIds = knowledgeBaseIds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The unique identifier(s) of the knowledge base(s) used")
  @JsonProperty("knowledgeBaseIds")
  public List<String> getKnowledgeBaseIds() {
    return knowledgeBaseIds;
  }
  public void setKnowledgeBaseIds(List<String> knowledgeBaseIds) {
    this.knowledgeBaseIds = knowledgeBaseIds;
  }


  /**
   * The lowest estimated average MOS among all the audio streams belonging to this conversation
   **/
  public AnalyticsConversationWithoutAttributes mediaStatsMinConversationMos(Double mediaStatsMinConversationMos) {
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
  public AnalyticsConversationWithoutAttributes mediaStatsMinConversationRFactor(Double mediaStatsMinConversationRFactor) {
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
  public AnalyticsConversationWithoutAttributes originatingDirection(OriginatingDirectionEnum originatingDirection) {
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
   * Indicates that the conversation originated from a public message on social media
   **/
  public AnalyticsConversationWithoutAttributes originatingSocialMediaPublic(Boolean originatingSocialMediaPublic) {
    this.originatingSocialMediaPublic = originatingSocialMediaPublic;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Indicates that the conversation originated from a public message on social media")
  @JsonProperty("originatingSocialMediaPublic")
  public Boolean getOriginatingSocialMediaPublic() {
    return originatingSocialMediaPublic;
  }
  public void setOriginatingSocialMediaPublic(Boolean originatingSocialMediaPublic) {
    this.originatingSocialMediaPublic = originatingSocialMediaPublic;
  }


  /**
   * Indicates whether all flow sessions were self serviced
   **/
  public AnalyticsConversationWithoutAttributes selfServed(Boolean selfServed) {
    this.selfServed = selfServed;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Indicates whether all flow sessions were self serviced")
  @JsonProperty("selfServed")
  public Boolean getSelfServed() {
    return selfServed;
  }
  public void setSelfServed(Boolean selfServed) {
    this.selfServed = selfServed;
  }


  /**
   * Evaluations associated with this conversation
   **/
  public AnalyticsConversationWithoutAttributes evaluations(List<AnalyticsEvaluation> evaluations) {
    this.evaluations = evaluations;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Evaluations associated with this conversation")
  @JsonProperty("evaluations")
  public List<AnalyticsEvaluation> getEvaluations() {
    return evaluations;
  }
  public void setEvaluations(List<AnalyticsEvaluation> evaluations) {
    this.evaluations = evaluations;
  }


  /**
   * Surveys associated with this conversation
   **/
  public AnalyticsConversationWithoutAttributes surveys(List<AnalyticsSurvey> surveys) {
    this.surveys = surveys;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Surveys associated with this conversation")
  @JsonProperty("surveys")
  public List<AnalyticsSurvey> getSurveys() {
    return surveys;
  }
  public void setSurveys(List<AnalyticsSurvey> surveys) {
    this.surveys = surveys;
  }


  /**
   * Resolutions associated with this conversation
   **/
  public AnalyticsConversationWithoutAttributes resolutions(List<AnalyticsResolution> resolutions) {
    this.resolutions = resolutions;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Resolutions associated with this conversation")
  @JsonProperty("resolutions")
  public List<AnalyticsResolution> getResolutions() {
    return resolutions;
  }
  public void setResolutions(List<AnalyticsResolution> resolutions) {
    this.resolutions = resolutions;
  }


  /**
   * Participants in the conversation
   **/
  public AnalyticsConversationWithoutAttributes participants(List<AnalyticsParticipantWithoutAttributes> participants) {
    this.participants = participants;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Participants in the conversation")
  @JsonProperty("participants")
  public List<AnalyticsParticipantWithoutAttributes> getParticipants() {
    return participants;
  }
  public void setParticipants(List<AnalyticsParticipantWithoutAttributes> participants) {
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
    AnalyticsConversationWithoutAttributes analyticsConversationWithoutAttributes = (AnalyticsConversationWithoutAttributes) o;

    return Objects.equals(this.conferenceStart, analyticsConversationWithoutAttributes.conferenceStart) &&
            Objects.equals(this.conversationEnd, analyticsConversationWithoutAttributes.conversationEnd) &&
            Objects.equals(this.conversationId, analyticsConversationWithoutAttributes.conversationId) &&
            Objects.equals(this.conversationInitiator, analyticsConversationWithoutAttributes.conversationInitiator) &&
            Objects.equals(this.conversationStart, analyticsConversationWithoutAttributes.conversationStart) &&
            Objects.equals(this.customerParticipation, analyticsConversationWithoutAttributes.customerParticipation) &&
            Objects.equals(this.divisionIds, analyticsConversationWithoutAttributes.divisionIds) &&
            Objects.equals(this.externalTag, analyticsConversationWithoutAttributes.externalTag) &&
            Objects.equals(this.inactivityTimeout, analyticsConversationWithoutAttributes.inactivityTimeout) &&
            Objects.equals(this.knowledgeBaseIds, analyticsConversationWithoutAttributes.knowledgeBaseIds) &&
            Objects.equals(this.mediaStatsMinConversationMos, analyticsConversationWithoutAttributes.mediaStatsMinConversationMos) &&
            Objects.equals(this.mediaStatsMinConversationRFactor, analyticsConversationWithoutAttributes.mediaStatsMinConversationRFactor) &&
            Objects.equals(this.originatingDirection, analyticsConversationWithoutAttributes.originatingDirection) &&
            Objects.equals(this.originatingSocialMediaPublic, analyticsConversationWithoutAttributes.originatingSocialMediaPublic) &&
            Objects.equals(this.selfServed, analyticsConversationWithoutAttributes.selfServed) &&
            Objects.equals(this.evaluations, analyticsConversationWithoutAttributes.evaluations) &&
            Objects.equals(this.surveys, analyticsConversationWithoutAttributes.surveys) &&
            Objects.equals(this.resolutions, analyticsConversationWithoutAttributes.resolutions) &&
            Objects.equals(this.participants, analyticsConversationWithoutAttributes.participants);
  }

  @Override
  public int hashCode() {
    return Objects.hash(conferenceStart, conversationEnd, conversationId, conversationInitiator, conversationStart, customerParticipation, divisionIds, externalTag, inactivityTimeout, knowledgeBaseIds, mediaStatsMinConversationMos, mediaStatsMinConversationRFactor, originatingDirection, originatingSocialMediaPublic, selfServed, evaluations, surveys, resolutions, participants);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AnalyticsConversationWithoutAttributes {\n");
    
    sb.append("    conferenceStart: ").append(toIndentedString(conferenceStart)).append("\n");
    sb.append("    conversationEnd: ").append(toIndentedString(conversationEnd)).append("\n");
    sb.append("    conversationId: ").append(toIndentedString(conversationId)).append("\n");
    sb.append("    conversationInitiator: ").append(toIndentedString(conversationInitiator)).append("\n");
    sb.append("    conversationStart: ").append(toIndentedString(conversationStart)).append("\n");
    sb.append("    customerParticipation: ").append(toIndentedString(customerParticipation)).append("\n");
    sb.append("    divisionIds: ").append(toIndentedString(divisionIds)).append("\n");
    sb.append("    externalTag: ").append(toIndentedString(externalTag)).append("\n");
    sb.append("    inactivityTimeout: ").append(toIndentedString(inactivityTimeout)).append("\n");
    sb.append("    knowledgeBaseIds: ").append(toIndentedString(knowledgeBaseIds)).append("\n");
    sb.append("    mediaStatsMinConversationMos: ").append(toIndentedString(mediaStatsMinConversationMos)).append("\n");
    sb.append("    mediaStatsMinConversationRFactor: ").append(toIndentedString(mediaStatsMinConversationRFactor)).append("\n");
    sb.append("    originatingDirection: ").append(toIndentedString(originatingDirection)).append("\n");
    sb.append("    originatingSocialMediaPublic: ").append(toIndentedString(originatingSocialMediaPublic)).append("\n");
    sb.append("    selfServed: ").append(toIndentedString(selfServed)).append("\n");
    sb.append("    evaluations: ").append(toIndentedString(evaluations)).append("\n");
    sb.append("    surveys: ").append(toIndentedString(surveys)).append("\n");
    sb.append("    resolutions: ").append(toIndentedString(resolutions)).append("\n");
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

