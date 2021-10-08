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
import com.fasterxml.jackson.annotation.JsonValue;
import com.mypurecloud.sdk.v2.model.AnalyticsProperty;
import com.mypurecloud.sdk.v2.model.AnalyticsScoredAgent;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import java.io.Serializable;
/**
 * AnalyticsConversationSegment
 */

public class AnalyticsConversationSegment  implements Serializable {
  
  private Boolean audioMuted = null;
  private Boolean conference = null;
  private String destinationConversationId = null;
  private String destinationSessionId = null;

  private static class DisconnectTypeEnumDeserializer extends StdDeserializer<DisconnectTypeEnum> {
    public DisconnectTypeEnumDeserializer() {
      super(DisconnectTypeEnumDeserializer.class);
    }

    @Override
    public DisconnectTypeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return DisconnectTypeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The session disconnect type
   */
 @JsonDeserialize(using = DisconnectTypeEnumDeserializer.class)
  public enum DisconnectTypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    CLIENT("client"),
    CONFERENCETRANSFER("conferenceTransfer"),
    CONSULTTRANSFER("consultTransfer"),
    ENDPOINT("endpoint"),
    ERROR("error"),
    FORWARDTRANSFER("forwardTransfer"),
    NOANSWERTRANSFER("noAnswerTransfer"),
    NOTAVAILABLETRANSFER("notAvailableTransfer"),
    OTHER("other"),
    PEER("peer"),
    SPAM("spam"),
    SYSTEM("system"),
    TIMEOUT("timeout"),
    TRANSFER("transfer"),
    TRANSPORTFAILURE("transportFailure"),
    UNCALLABLE("uncallable");

    private String value;

    DisconnectTypeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static DisconnectTypeEnum fromString(String key) {
      if (key == null) return null;

      for (DisconnectTypeEnum value : DisconnectTypeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return DisconnectTypeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private DisconnectTypeEnum disconnectType = null;
  private String errorCode = null;
  private String groupId = null;
  private List<Long> q850ResponseCodes = new ArrayList<Long>();
  private String queueId = null;
  private String requestedLanguageId = null;
  private List<String> requestedRoutingSkillIds = new ArrayList<String>();
  private List<String> requestedRoutingUserIds = new ArrayList<String>();
  private Date segmentEnd = null;
  private Date segmentStart = null;

  private static class SegmentTypeEnumDeserializer extends StdDeserializer<SegmentTypeEnum> {
    public SegmentTypeEnumDeserializer() {
      super(SegmentTypeEnumDeserializer.class);
    }

    @Override
    public SegmentTypeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return SegmentTypeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The activity that takes place in the segment, such as hold or interact
   */
 @JsonDeserialize(using = SegmentTypeEnumDeserializer.class)
  public enum SegmentTypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    ALERT("alert"),
    CALLBACK("callback"),
    COACHING("coaching"),
    CONTACTING("contacting"),
    CONVERTING("converting"),
    DELAY("delay"),
    DIALING("dialing"),
    HOLD("hold"),
    INTERACT("interact"),
    IVR("ivr"),
    MONITORING("monitoring"),
    SCHEDULED("scheduled"),
    SHARING("sharing"),
    SYSTEM("system"),
    TRANSMITTING("transmitting"),
    UNKNOWN("unknown"),
    UPLOADING("uploading"),
    VOICEMAIL("voicemail"),
    WRAPUP("wrapup");

    private String value;

    SegmentTypeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static SegmentTypeEnum fromString(String key) {
      if (key == null) return null;

      for (SegmentTypeEnum value : SegmentTypeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return SegmentTypeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private SegmentTypeEnum segmentType = null;
  private List<Long> sipResponseCodes = new ArrayList<Long>();
  private String sourceConversationId = null;
  private String sourceSessionId = null;
  private String subject = null;
  private Boolean videoMuted = null;
  private String wrapUpCode = null;
  private String wrapUpNote = null;
  private List<String> wrapUpTags = new ArrayList<String>();
  private List<AnalyticsScoredAgent> scoredAgents = new ArrayList<AnalyticsScoredAgent>();
  private List<AnalyticsProperty> properties = new ArrayList<AnalyticsProperty>();

  
  /**
   * Flag indicating if audio is muted or not (true/false)
   **/
  public AnalyticsConversationSegment audioMuted(Boolean audioMuted) {
    this.audioMuted = audioMuted;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Flag indicating if audio is muted or not (true/false)")
  @JsonProperty("audioMuted")
  public Boolean getAudioMuted() {
    return audioMuted;
  }
  public void setAudioMuted(Boolean audioMuted) {
    this.audioMuted = audioMuted;
  }

  
  /**
   * Indicates whether the segment was a conference
   **/
  public AnalyticsConversationSegment conference(Boolean conference) {
    this.conference = conference;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Indicates whether the segment was a conference")
  @JsonProperty("conference")
  public Boolean getConference() {
    return conference;
  }
  public void setConference(Boolean conference) {
    this.conference = conference;
  }

  
  /**
   * The unique identifier of a new conversation when a conversation is ended for a conference
   **/
  public AnalyticsConversationSegment destinationConversationId(String destinationConversationId) {
    this.destinationConversationId = destinationConversationId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The unique identifier of a new conversation when a conversation is ended for a conference")
  @JsonProperty("destinationConversationId")
  public String getDestinationConversationId() {
    return destinationConversationId;
  }
  public void setDestinationConversationId(String destinationConversationId) {
    this.destinationConversationId = destinationConversationId;
  }

  
  /**
   * The unique identifier of a new session when a session is ended for a conference
   **/
  public AnalyticsConversationSegment destinationSessionId(String destinationSessionId) {
    this.destinationSessionId = destinationSessionId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The unique identifier of a new session when a session is ended for a conference")
  @JsonProperty("destinationSessionId")
  public String getDestinationSessionId() {
    return destinationSessionId;
  }
  public void setDestinationSessionId(String destinationSessionId) {
    this.destinationSessionId = destinationSessionId;
  }

  
  /**
   * The session disconnect type
   **/
  public AnalyticsConversationSegment disconnectType(DisconnectTypeEnum disconnectType) {
    this.disconnectType = disconnectType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The session disconnect type")
  @JsonProperty("disconnectType")
  public DisconnectTypeEnum getDisconnectType() {
    return disconnectType;
  }
  public void setDisconnectType(DisconnectTypeEnum disconnectType) {
    this.disconnectType = disconnectType;
  }

  
  /**
   * A code corresponding to the error that occurred
   **/
  public AnalyticsConversationSegment errorCode(String errorCode) {
    this.errorCode = errorCode;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A code corresponding to the error that occurred")
  @JsonProperty("errorCode")
  public String getErrorCode() {
    return errorCode;
  }
  public void setErrorCode(String errorCode) {
    this.errorCode = errorCode;
  }

  
  /**
   * Unique identifier for a PureCloud group
   **/
  public AnalyticsConversationSegment groupId(String groupId) {
    this.groupId = groupId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Unique identifier for a PureCloud group")
  @JsonProperty("groupId")
  public String getGroupId() {
    return groupId;
  }
  public void setGroupId(String groupId) {
    this.groupId = groupId;
  }

  
  /**
   * Q.850 response code(s)
   **/
  public AnalyticsConversationSegment q850ResponseCodes(List<Long> q850ResponseCodes) {
    this.q850ResponseCodes = q850ResponseCodes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Q.850 response code(s)")
  @JsonProperty("q850ResponseCodes")
  public List<Long> getQ850ResponseCodes() {
    return q850ResponseCodes;
  }
  public void setQ850ResponseCodes(List<Long> q850ResponseCodes) {
    this.q850ResponseCodes = q850ResponseCodes;
  }

  
  /**
   * Queue identifier
   **/
  public AnalyticsConversationSegment queueId(String queueId) {
    this.queueId = queueId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Queue identifier")
  @JsonProperty("queueId")
  public String getQueueId() {
    return queueId;
  }
  public void setQueueId(String queueId) {
    this.queueId = queueId;
  }

  
  /**
   * Unique identifier for the language requested for an interaction
   **/
  public AnalyticsConversationSegment requestedLanguageId(String requestedLanguageId) {
    this.requestedLanguageId = requestedLanguageId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Unique identifier for the language requested for an interaction")
  @JsonProperty("requestedLanguageId")
  public String getRequestedLanguageId() {
    return requestedLanguageId;
  }
  public void setRequestedLanguageId(String requestedLanguageId) {
    this.requestedLanguageId = requestedLanguageId;
  }

  
  /**
   * Unique identifier(s) for skill(s) requested for an interaction
   **/
  public AnalyticsConversationSegment requestedRoutingSkillIds(List<String> requestedRoutingSkillIds) {
    this.requestedRoutingSkillIds = requestedRoutingSkillIds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Unique identifier(s) for skill(s) requested for an interaction")
  @JsonProperty("requestedRoutingSkillIds")
  public List<String> getRequestedRoutingSkillIds() {
    return requestedRoutingSkillIds;
  }
  public void setRequestedRoutingSkillIds(List<String> requestedRoutingSkillIds) {
    this.requestedRoutingSkillIds = requestedRoutingSkillIds;
  }

  
  /**
   * Unique identifier(s) for agent(s) requested for an interaction
   **/
  public AnalyticsConversationSegment requestedRoutingUserIds(List<String> requestedRoutingUserIds) {
    this.requestedRoutingUserIds = requestedRoutingUserIds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Unique identifier(s) for agent(s) requested for an interaction")
  @JsonProperty("requestedRoutingUserIds")
  public List<String> getRequestedRoutingUserIds() {
    return requestedRoutingUserIds;
  }
  public void setRequestedRoutingUserIds(List<String> requestedRoutingUserIds) {
    this.requestedRoutingUserIds = requestedRoutingUserIds;
  }

  
  /**
   * The end time of a segment. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public AnalyticsConversationSegment segmentEnd(Date segmentEnd) {
    this.segmentEnd = segmentEnd;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The end time of a segment. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("segmentEnd")
  public Date getSegmentEnd() {
    return segmentEnd;
  }
  public void setSegmentEnd(Date segmentEnd) {
    this.segmentEnd = segmentEnd;
  }

  
  /**
   * The start time of a segment. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public AnalyticsConversationSegment segmentStart(Date segmentStart) {
    this.segmentStart = segmentStart;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The start time of a segment. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("segmentStart")
  public Date getSegmentStart() {
    return segmentStart;
  }
  public void setSegmentStart(Date segmentStart) {
    this.segmentStart = segmentStart;
  }

  
  /**
   * The activity that takes place in the segment, such as hold or interact
   **/
  public AnalyticsConversationSegment segmentType(SegmentTypeEnum segmentType) {
    this.segmentType = segmentType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The activity that takes place in the segment, such as hold or interact")
  @JsonProperty("segmentType")
  public SegmentTypeEnum getSegmentType() {
    return segmentType;
  }
  public void setSegmentType(SegmentTypeEnum segmentType) {
    this.segmentType = segmentType;
  }

  
  /**
   * SIP response code(s)
   **/
  public AnalyticsConversationSegment sipResponseCodes(List<Long> sipResponseCodes) {
    this.sipResponseCodes = sipResponseCodes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "SIP response code(s)")
  @JsonProperty("sipResponseCodes")
  public List<Long> getSipResponseCodes() {
    return sipResponseCodes;
  }
  public void setSipResponseCodes(List<Long> sipResponseCodes) {
    this.sipResponseCodes = sipResponseCodes;
  }

  
  /**
   * The unique identifier of the previous conversation when a new conversation is created for a conference
   **/
  public AnalyticsConversationSegment sourceConversationId(String sourceConversationId) {
    this.sourceConversationId = sourceConversationId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The unique identifier of the previous conversation when a new conversation is created for a conference")
  @JsonProperty("sourceConversationId")
  public String getSourceConversationId() {
    return sourceConversationId;
  }
  public void setSourceConversationId(String sourceConversationId) {
    this.sourceConversationId = sourceConversationId;
  }

  
  /**
   * The unique identifier of the previous session when a new session is created for a conference
   **/
  public AnalyticsConversationSegment sourceSessionId(String sourceSessionId) {
    this.sourceSessionId = sourceSessionId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The unique identifier of the previous session when a new session is created for a conference")
  @JsonProperty("sourceSessionId")
  public String getSourceSessionId() {
    return sourceSessionId;
  }
  public void setSourceSessionId(String sourceSessionId) {
    this.sourceSessionId = sourceSessionId;
  }

  
  /**
   * The subject for the initial email that started this conversation
   **/
  public AnalyticsConversationSegment subject(String subject) {
    this.subject = subject;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The subject for the initial email that started this conversation")
  @JsonProperty("subject")
  public String getSubject() {
    return subject;
  }
  public void setSubject(String subject) {
    this.subject = subject;
  }

  
  /**
   * Flag indicating if video is muted/paused or not (true/false)
   **/
  public AnalyticsConversationSegment videoMuted(Boolean videoMuted) {
    this.videoMuted = videoMuted;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Flag indicating if video is muted/paused or not (true/false)")
  @JsonProperty("videoMuted")
  public Boolean getVideoMuted() {
    return videoMuted;
  }
  public void setVideoMuted(Boolean videoMuted) {
    this.videoMuted = videoMuted;
  }

  
  /**
   * Wrap up code
   **/
  public AnalyticsConversationSegment wrapUpCode(String wrapUpCode) {
    this.wrapUpCode = wrapUpCode;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Wrap up code")
  @JsonProperty("wrapUpCode")
  public String getWrapUpCode() {
    return wrapUpCode;
  }
  public void setWrapUpCode(String wrapUpCode) {
    this.wrapUpCode = wrapUpCode;
  }

  
  /**
   * Note entered by an agent during after-call work
   **/
  public AnalyticsConversationSegment wrapUpNote(String wrapUpNote) {
    this.wrapUpNote = wrapUpNote;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Note entered by an agent during after-call work")
  @JsonProperty("wrapUpNote")
  public String getWrapUpNote() {
    return wrapUpNote;
  }
  public void setWrapUpNote(String wrapUpNote) {
    this.wrapUpNote = wrapUpNote;
  }

  
  /**
   * Tag(s) assigned during after-call work
   **/
  public AnalyticsConversationSegment wrapUpTags(List<String> wrapUpTags) {
    this.wrapUpTags = wrapUpTags;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Tag(s) assigned during after-call work")
  @JsonProperty("wrapUpTags")
  public List<String> getWrapUpTags() {
    return wrapUpTags;
  }
  public void setWrapUpTags(List<String> wrapUpTags) {
    this.wrapUpTags = wrapUpTags;
  }

  
  /**
   * Scored agents
   **/
  public AnalyticsConversationSegment scoredAgents(List<AnalyticsScoredAgent> scoredAgents) {
    this.scoredAgents = scoredAgents;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Scored agents")
  @JsonProperty("scoredAgents")
  public List<AnalyticsScoredAgent> getScoredAgents() {
    return scoredAgents;
  }
  public void setScoredAgents(List<AnalyticsScoredAgent> scoredAgents) {
    this.scoredAgents = scoredAgents;
  }

  
  /**
   * Additional segment properties
   **/
  public AnalyticsConversationSegment properties(List<AnalyticsProperty> properties) {
    this.properties = properties;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Additional segment properties")
  @JsonProperty("properties")
  public List<AnalyticsProperty> getProperties() {
    return properties;
  }
  public void setProperties(List<AnalyticsProperty> properties) {
    this.properties = properties;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AnalyticsConversationSegment analyticsConversationSegment = (AnalyticsConversationSegment) o;
    return Objects.equals(this.audioMuted, analyticsConversationSegment.audioMuted) &&
        Objects.equals(this.conference, analyticsConversationSegment.conference) &&
        Objects.equals(this.destinationConversationId, analyticsConversationSegment.destinationConversationId) &&
        Objects.equals(this.destinationSessionId, analyticsConversationSegment.destinationSessionId) &&
        Objects.equals(this.disconnectType, analyticsConversationSegment.disconnectType) &&
        Objects.equals(this.errorCode, analyticsConversationSegment.errorCode) &&
        Objects.equals(this.groupId, analyticsConversationSegment.groupId) &&
        Objects.equals(this.q850ResponseCodes, analyticsConversationSegment.q850ResponseCodes) &&
        Objects.equals(this.queueId, analyticsConversationSegment.queueId) &&
        Objects.equals(this.requestedLanguageId, analyticsConversationSegment.requestedLanguageId) &&
        Objects.equals(this.requestedRoutingSkillIds, analyticsConversationSegment.requestedRoutingSkillIds) &&
        Objects.equals(this.requestedRoutingUserIds, analyticsConversationSegment.requestedRoutingUserIds) &&
        Objects.equals(this.segmentEnd, analyticsConversationSegment.segmentEnd) &&
        Objects.equals(this.segmentStart, analyticsConversationSegment.segmentStart) &&
        Objects.equals(this.segmentType, analyticsConversationSegment.segmentType) &&
        Objects.equals(this.sipResponseCodes, analyticsConversationSegment.sipResponseCodes) &&
        Objects.equals(this.sourceConversationId, analyticsConversationSegment.sourceConversationId) &&
        Objects.equals(this.sourceSessionId, analyticsConversationSegment.sourceSessionId) &&
        Objects.equals(this.subject, analyticsConversationSegment.subject) &&
        Objects.equals(this.videoMuted, analyticsConversationSegment.videoMuted) &&
        Objects.equals(this.wrapUpCode, analyticsConversationSegment.wrapUpCode) &&
        Objects.equals(this.wrapUpNote, analyticsConversationSegment.wrapUpNote) &&
        Objects.equals(this.wrapUpTags, analyticsConversationSegment.wrapUpTags) &&
        Objects.equals(this.scoredAgents, analyticsConversationSegment.scoredAgents) &&
        Objects.equals(this.properties, analyticsConversationSegment.properties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(audioMuted, conference, destinationConversationId, destinationSessionId, disconnectType, errorCode, groupId, q850ResponseCodes, queueId, requestedLanguageId, requestedRoutingSkillIds, requestedRoutingUserIds, segmentEnd, segmentStart, segmentType, sipResponseCodes, sourceConversationId, sourceSessionId, subject, videoMuted, wrapUpCode, wrapUpNote, wrapUpTags, scoredAgents, properties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AnalyticsConversationSegment {\n");
    
    sb.append("    audioMuted: ").append(toIndentedString(audioMuted)).append("\n");
    sb.append("    conference: ").append(toIndentedString(conference)).append("\n");
    sb.append("    destinationConversationId: ").append(toIndentedString(destinationConversationId)).append("\n");
    sb.append("    destinationSessionId: ").append(toIndentedString(destinationSessionId)).append("\n");
    sb.append("    disconnectType: ").append(toIndentedString(disconnectType)).append("\n");
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
    sb.append("    q850ResponseCodes: ").append(toIndentedString(q850ResponseCodes)).append("\n");
    sb.append("    queueId: ").append(toIndentedString(queueId)).append("\n");
    sb.append("    requestedLanguageId: ").append(toIndentedString(requestedLanguageId)).append("\n");
    sb.append("    requestedRoutingSkillIds: ").append(toIndentedString(requestedRoutingSkillIds)).append("\n");
    sb.append("    requestedRoutingUserIds: ").append(toIndentedString(requestedRoutingUserIds)).append("\n");
    sb.append("    segmentEnd: ").append(toIndentedString(segmentEnd)).append("\n");
    sb.append("    segmentStart: ").append(toIndentedString(segmentStart)).append("\n");
    sb.append("    segmentType: ").append(toIndentedString(segmentType)).append("\n");
    sb.append("    sipResponseCodes: ").append(toIndentedString(sipResponseCodes)).append("\n");
    sb.append("    sourceConversationId: ").append(toIndentedString(sourceConversationId)).append("\n");
    sb.append("    sourceSessionId: ").append(toIndentedString(sourceSessionId)).append("\n");
    sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
    sb.append("    videoMuted: ").append(toIndentedString(videoMuted)).append("\n");
    sb.append("    wrapUpCode: ").append(toIndentedString(wrapUpCode)).append("\n");
    sb.append("    wrapUpNote: ").append(toIndentedString(wrapUpNote)).append("\n");
    sb.append("    wrapUpTags: ").append(toIndentedString(wrapUpTags)).append("\n");
    sb.append("    scoredAgents: ").append(toIndentedString(scoredAgents)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
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

