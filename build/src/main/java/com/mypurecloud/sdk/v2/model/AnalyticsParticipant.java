package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.mypurecloud.sdk.v2.model.AnalyticsSession;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import java.io.Serializable;
/**
 * AnalyticsParticipant
 */

public class AnalyticsParticipant  implements Serializable {
  
  private String participantId = null;
  private String participantName = null;
  private String userId = null;

  /**
   * The participant's purpose
   */
  public enum PurposeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    MANUAL("manual"),
    DIALER("dialer"),
    INBOUND("inbound"),
    ACD("acd"),
    IVR("ivr"),
    VOICEMAIL("voicemail"),
    OUTBOUND("outbound"),
    AGENT("agent"),
    USER("user"),
    STATION("station"),
    GROUP("group"),
    CUSTOMER("customer"),
    EXTERNAL("external"),
    FAX("fax"),
    WORKFLOW("workflow"),
    CAMPAIGN("campaign"),
    API("api");

    private String value;

    PurposeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static PurposeEnum fromString(String key) {
      if (key == null) return null;

      for (PurposeEnum value : PurposeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return PurposeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private PurposeEnum purpose = null;
  private String externalContactId = null;
  private String externalOrganizationId = null;

  /**
   * Reason for which participant flagged conversation
   */
  public enum FlaggedReasonEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    GENERAL("general");

    private String value;

    FlaggedReasonEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static FlaggedReasonEnum fromString(String key) {
      if (key == null) return null;

      for (FlaggedReasonEnum value : FlaggedReasonEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return FlaggedReasonEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private FlaggedReasonEnum flaggedReason = null;
  private String teamId = null;
  private List<String> agentAssistantIds = new ArrayList<String>();
  private List<AnalyticsSession> sessions = new ArrayList<AnalyticsSession>();
  private Map<String, String> attributes = null;

  
  /**
   * Unique identifier for the participant
   **/
  public AnalyticsParticipant participantId(String participantId) {
    this.participantId = participantId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Unique identifier for the participant")
  @JsonProperty("participantId")
  public String getParticipantId() {
    return participantId;
  }
  public void setParticipantId(String participantId) {
    this.participantId = participantId;
  }

  
  /**
   * A human readable name identifying the participant
   **/
  public AnalyticsParticipant participantName(String participantName) {
    this.participantName = participantName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A human readable name identifying the participant")
  @JsonProperty("participantName")
  public String getParticipantName() {
    return participantName;
  }
  public void setParticipantName(String participantName) {
    this.participantName = participantName;
  }

  
  /**
   * If a user, then this will be the unique identifier for the user
   **/
  public AnalyticsParticipant userId(String userId) {
    this.userId = userId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "If a user, then this will be the unique identifier for the user")
  @JsonProperty("userId")
  public String getUserId() {
    return userId;
  }
  public void setUserId(String userId) {
    this.userId = userId;
  }

  
  /**
   * The participant's purpose
   **/
  public AnalyticsParticipant purpose(PurposeEnum purpose) {
    this.purpose = purpose;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The participant's purpose")
  @JsonProperty("purpose")
  public PurposeEnum getPurpose() {
    return purpose;
  }
  public void setPurpose(PurposeEnum purpose) {
    this.purpose = purpose;
  }

  
  /**
   * External Contact Identifier
   **/
  public AnalyticsParticipant externalContactId(String externalContactId) {
    this.externalContactId = externalContactId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "External Contact Identifier")
  @JsonProperty("externalContactId")
  public String getExternalContactId() {
    return externalContactId;
  }
  public void setExternalContactId(String externalContactId) {
    this.externalContactId = externalContactId;
  }

  
  /**
   * External Organization Identifier
   **/
  public AnalyticsParticipant externalOrganizationId(String externalOrganizationId) {
    this.externalOrganizationId = externalOrganizationId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "External Organization Identifier")
  @JsonProperty("externalOrganizationId")
  public String getExternalOrganizationId() {
    return externalOrganizationId;
  }
  public void setExternalOrganizationId(String externalOrganizationId) {
    this.externalOrganizationId = externalOrganizationId;
  }

  
  /**
   * Reason for which participant flagged conversation
   **/
  public AnalyticsParticipant flaggedReason(FlaggedReasonEnum flaggedReason) {
    this.flaggedReason = flaggedReason;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Reason for which participant flagged conversation")
  @JsonProperty("flaggedReason")
  public FlaggedReasonEnum getFlaggedReason() {
    return flaggedReason;
  }
  public void setFlaggedReason(FlaggedReasonEnum flaggedReason) {
    this.flaggedReason = flaggedReason;
  }

  
  /**
   * The team id the user is a member of
   **/
  public AnalyticsParticipant teamId(String teamId) {
    this.teamId = teamId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The team id the user is a member of")
  @JsonProperty("teamId")
  public String getTeamId() {
    return teamId;
  }
  public void setTeamId(String teamId) {
    this.teamId = teamId;
  }

  
  /**
   * Unique identifiers of the active virtual agent assistants
   **/
  public AnalyticsParticipant agentAssistantIds(List<String> agentAssistantIds) {
    this.agentAssistantIds = agentAssistantIds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Unique identifiers of the active virtual agent assistants")
  @JsonProperty("agentAssistantIds")
  public List<String> getAgentAssistantIds() {
    return agentAssistantIds;
  }
  public void setAgentAssistantIds(List<String> agentAssistantIds) {
    this.agentAssistantIds = agentAssistantIds;
  }

  
  /**
   * List of sessions associated to this participant
   **/
  public AnalyticsParticipant sessions(List<AnalyticsSession> sessions) {
    this.sessions = sessions;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "List of sessions associated to this participant")
  @JsonProperty("sessions")
  public List<AnalyticsSession> getSessions() {
    return sessions;
  }
  public void setSessions(List<AnalyticsSession> sessions) {
    this.sessions = sessions;
  }

  
  /**
   * List of attributes associated to this participant
   **/
  public AnalyticsParticipant attributes(Map<String, String> attributes) {
    this.attributes = attributes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "List of attributes associated to this participant")
  @JsonProperty("attributes")
  public Map<String, String> getAttributes() {
    return attributes;
  }
  public void setAttributes(Map<String, String> attributes) {
    this.attributes = attributes;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AnalyticsParticipant analyticsParticipant = (AnalyticsParticipant) o;
    return Objects.equals(this.participantId, analyticsParticipant.participantId) &&
        Objects.equals(this.participantName, analyticsParticipant.participantName) &&
        Objects.equals(this.userId, analyticsParticipant.userId) &&
        Objects.equals(this.purpose, analyticsParticipant.purpose) &&
        Objects.equals(this.externalContactId, analyticsParticipant.externalContactId) &&
        Objects.equals(this.externalOrganizationId, analyticsParticipant.externalOrganizationId) &&
        Objects.equals(this.flaggedReason, analyticsParticipant.flaggedReason) &&
        Objects.equals(this.teamId, analyticsParticipant.teamId) &&
        Objects.equals(this.agentAssistantIds, analyticsParticipant.agentAssistantIds) &&
        Objects.equals(this.sessions, analyticsParticipant.sessions) &&
        Objects.equals(this.attributes, analyticsParticipant.attributes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(participantId, participantName, userId, purpose, externalContactId, externalOrganizationId, flaggedReason, teamId, agentAssistantIds, sessions, attributes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AnalyticsParticipant {\n");
    
    sb.append("    participantId: ").append(toIndentedString(participantId)).append("\n");
    sb.append("    participantName: ").append(toIndentedString(participantName)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    purpose: ").append(toIndentedString(purpose)).append("\n");
    sb.append("    externalContactId: ").append(toIndentedString(externalContactId)).append("\n");
    sb.append("    externalOrganizationId: ").append(toIndentedString(externalOrganizationId)).append("\n");
    sb.append("    flaggedReason: ").append(toIndentedString(flaggedReason)).append("\n");
    sb.append("    teamId: ").append(toIndentedString(teamId)).append("\n");
    sb.append("    agentAssistantIds: ").append(toIndentedString(agentAssistantIds)).append("\n");
    sb.append("    sessions: ").append(toIndentedString(sessions)).append("\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
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

