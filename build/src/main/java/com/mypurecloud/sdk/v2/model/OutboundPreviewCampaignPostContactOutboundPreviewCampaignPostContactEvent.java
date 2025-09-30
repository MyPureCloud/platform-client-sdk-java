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
import com.mypurecloud.sdk.v2.model.OutboundPreviewCampaignPostContactVoiceAttributes;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * OutboundPreviewCampaignPostContactOutboundPreviewCampaignPostContactEvent
 */

public class OutboundPreviewCampaignPostContactOutboundPreviewCampaignPostContactEvent  implements Serializable {
  
  private Long eventTime = null;
  private OutboundPreviewCampaignPostContactVoiceAttributes voiceAttributes = null;
  private String wrapupCode = null;
  private String outboundCampaignId = null;

  private static class DialingModeEnumDeserializer extends StdDeserializer<DialingModeEnum> {
    public DialingModeEnumDeserializer() {
      super(DialingModeEnumDeserializer.class);
    }

    @Override
    public DialingModeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return DialingModeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Gets or Sets dialingMode
   */
 @JsonDeserialize(using = DialingModeEnumDeserializer.class)
  public enum DialingModeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    UNKNOWN("UNKNOWN"),
    PREVIEW("PREVIEW"),
    POWER("POWER"),
    PREDICTIVE("PREDICTIVE"),
    AGENTLESS("AGENTLESS"),
    EXTERNAL("EXTERNAL"),
    PROGRESSIVE("PROGRESSIVE");

    private String value;

    DialingModeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static DialingModeEnum fromString(String key) {
      if (key == null) return null;

      for (DialingModeEnum value : DialingModeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return DialingModeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private DialingModeEnum dialingMode = null;
  private String agentScriptId = null;
  private String divisionId = null;
  private String outboundContactListId = null;
  private String outboundContactListFilterId = null;
  private String outboundQueueId = null;
  private String outboundContactId = null;
  private Boolean isCampaignAlwaysRunning = null;
  private Boolean isCampaignSkillBased = null;
  private Boolean isCampaignDynamicSorting = null;
  private Boolean isCampaignDynamicFiltering = null;
  private Long outboundCampaignHealthMask = null;
  private Boolean isReCall = null;
  private String scheduledDateTime = null;
  private String conversationId = null;
  private Boolean isRightPartyContact = null;
  private String callAnalysisDisposition = null;
  private String agentId = null;

  public OutboundPreviewCampaignPostContactOutboundPreviewCampaignPostContactEvent() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   **/
  public OutboundPreviewCampaignPostContactOutboundPreviewCampaignPostContactEvent eventTime(Long eventTime) {
    this.eventTime = eventTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("eventTime")
  public Long getEventTime() {
    return eventTime;
  }
  public void setEventTime(Long eventTime) {
    this.eventTime = eventTime;
  }


  /**
   **/
  public OutboundPreviewCampaignPostContactOutboundPreviewCampaignPostContactEvent voiceAttributes(OutboundPreviewCampaignPostContactVoiceAttributes voiceAttributes) {
    this.voiceAttributes = voiceAttributes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("voiceAttributes")
  public OutboundPreviewCampaignPostContactVoiceAttributes getVoiceAttributes() {
    return voiceAttributes;
  }
  public void setVoiceAttributes(OutboundPreviewCampaignPostContactVoiceAttributes voiceAttributes) {
    this.voiceAttributes = voiceAttributes;
  }


  /**
   **/
  public OutboundPreviewCampaignPostContactOutboundPreviewCampaignPostContactEvent wrapupCode(String wrapupCode) {
    this.wrapupCode = wrapupCode;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("wrapupCode")
  public String getWrapupCode() {
    return wrapupCode;
  }
  public void setWrapupCode(String wrapupCode) {
    this.wrapupCode = wrapupCode;
  }


  /**
   **/
  public OutboundPreviewCampaignPostContactOutboundPreviewCampaignPostContactEvent outboundCampaignId(String outboundCampaignId) {
    this.outboundCampaignId = outboundCampaignId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("outboundCampaignId")
  public String getOutboundCampaignId() {
    return outboundCampaignId;
  }
  public void setOutboundCampaignId(String outboundCampaignId) {
    this.outboundCampaignId = outboundCampaignId;
  }


  /**
   **/
  public OutboundPreviewCampaignPostContactOutboundPreviewCampaignPostContactEvent dialingMode(DialingModeEnum dialingMode) {
    this.dialingMode = dialingMode;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("dialingMode")
  public DialingModeEnum getDialingMode() {
    return dialingMode;
  }
  public void setDialingMode(DialingModeEnum dialingMode) {
    this.dialingMode = dialingMode;
  }


  /**
   **/
  public OutboundPreviewCampaignPostContactOutboundPreviewCampaignPostContactEvent agentScriptId(String agentScriptId) {
    this.agentScriptId = agentScriptId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("agentScriptId")
  public String getAgentScriptId() {
    return agentScriptId;
  }
  public void setAgentScriptId(String agentScriptId) {
    this.agentScriptId = agentScriptId;
  }


  /**
   **/
  public OutboundPreviewCampaignPostContactOutboundPreviewCampaignPostContactEvent divisionId(String divisionId) {
    this.divisionId = divisionId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("divisionId")
  public String getDivisionId() {
    return divisionId;
  }
  public void setDivisionId(String divisionId) {
    this.divisionId = divisionId;
  }


  /**
   **/
  public OutboundPreviewCampaignPostContactOutboundPreviewCampaignPostContactEvent outboundContactListId(String outboundContactListId) {
    this.outboundContactListId = outboundContactListId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("outboundContactListId")
  public String getOutboundContactListId() {
    return outboundContactListId;
  }
  public void setOutboundContactListId(String outboundContactListId) {
    this.outboundContactListId = outboundContactListId;
  }


  /**
   **/
  public OutboundPreviewCampaignPostContactOutboundPreviewCampaignPostContactEvent outboundContactListFilterId(String outboundContactListFilterId) {
    this.outboundContactListFilterId = outboundContactListFilterId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("outboundContactListFilterId")
  public String getOutboundContactListFilterId() {
    return outboundContactListFilterId;
  }
  public void setOutboundContactListFilterId(String outboundContactListFilterId) {
    this.outboundContactListFilterId = outboundContactListFilterId;
  }


  /**
   **/
  public OutboundPreviewCampaignPostContactOutboundPreviewCampaignPostContactEvent outboundQueueId(String outboundQueueId) {
    this.outboundQueueId = outboundQueueId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("outboundQueueId")
  public String getOutboundQueueId() {
    return outboundQueueId;
  }
  public void setOutboundQueueId(String outboundQueueId) {
    this.outboundQueueId = outboundQueueId;
  }


  /**
   **/
  public OutboundPreviewCampaignPostContactOutboundPreviewCampaignPostContactEvent outboundContactId(String outboundContactId) {
    this.outboundContactId = outboundContactId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("outboundContactId")
  public String getOutboundContactId() {
    return outboundContactId;
  }
  public void setOutboundContactId(String outboundContactId) {
    this.outboundContactId = outboundContactId;
  }


  /**
   **/
  public OutboundPreviewCampaignPostContactOutboundPreviewCampaignPostContactEvent isCampaignAlwaysRunning(Boolean isCampaignAlwaysRunning) {
    this.isCampaignAlwaysRunning = isCampaignAlwaysRunning;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("isCampaignAlwaysRunning")
  public Boolean getIsCampaignAlwaysRunning() {
    return isCampaignAlwaysRunning;
  }
  public void setIsCampaignAlwaysRunning(Boolean isCampaignAlwaysRunning) {
    this.isCampaignAlwaysRunning = isCampaignAlwaysRunning;
  }


  /**
   **/
  public OutboundPreviewCampaignPostContactOutboundPreviewCampaignPostContactEvent isCampaignSkillBased(Boolean isCampaignSkillBased) {
    this.isCampaignSkillBased = isCampaignSkillBased;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("isCampaignSkillBased")
  public Boolean getIsCampaignSkillBased() {
    return isCampaignSkillBased;
  }
  public void setIsCampaignSkillBased(Boolean isCampaignSkillBased) {
    this.isCampaignSkillBased = isCampaignSkillBased;
  }


  /**
   **/
  public OutboundPreviewCampaignPostContactOutboundPreviewCampaignPostContactEvent isCampaignDynamicSorting(Boolean isCampaignDynamicSorting) {
    this.isCampaignDynamicSorting = isCampaignDynamicSorting;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("isCampaignDynamicSorting")
  public Boolean getIsCampaignDynamicSorting() {
    return isCampaignDynamicSorting;
  }
  public void setIsCampaignDynamicSorting(Boolean isCampaignDynamicSorting) {
    this.isCampaignDynamicSorting = isCampaignDynamicSorting;
  }


  /**
   **/
  public OutboundPreviewCampaignPostContactOutboundPreviewCampaignPostContactEvent isCampaignDynamicFiltering(Boolean isCampaignDynamicFiltering) {
    this.isCampaignDynamicFiltering = isCampaignDynamicFiltering;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("isCampaignDynamicFiltering")
  public Boolean getIsCampaignDynamicFiltering() {
    return isCampaignDynamicFiltering;
  }
  public void setIsCampaignDynamicFiltering(Boolean isCampaignDynamicFiltering) {
    this.isCampaignDynamicFiltering = isCampaignDynamicFiltering;
  }


  /**
   **/
  public OutboundPreviewCampaignPostContactOutboundPreviewCampaignPostContactEvent outboundCampaignHealthMask(Long outboundCampaignHealthMask) {
    this.outboundCampaignHealthMask = outboundCampaignHealthMask;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("outboundCampaignHealthMask")
  public Long getOutboundCampaignHealthMask() {
    return outboundCampaignHealthMask;
  }
  public void setOutboundCampaignHealthMask(Long outboundCampaignHealthMask) {
    this.outboundCampaignHealthMask = outboundCampaignHealthMask;
  }


  /**
   **/
  public OutboundPreviewCampaignPostContactOutboundPreviewCampaignPostContactEvent isReCall(Boolean isReCall) {
    this.isReCall = isReCall;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("isReCall")
  public Boolean getIsReCall() {
    return isReCall;
  }
  public void setIsReCall(Boolean isReCall) {
    this.isReCall = isReCall;
  }


  /**
   **/
  public OutboundPreviewCampaignPostContactOutboundPreviewCampaignPostContactEvent scheduledDateTime(String scheduledDateTime) {
    this.scheduledDateTime = scheduledDateTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("scheduledDateTime")
  public String getScheduledDateTime() {
    return scheduledDateTime;
  }
  public void setScheduledDateTime(String scheduledDateTime) {
    this.scheduledDateTime = scheduledDateTime;
  }


  /**
   **/
  public OutboundPreviewCampaignPostContactOutboundPreviewCampaignPostContactEvent conversationId(String conversationId) {
    this.conversationId = conversationId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("conversationId")
  public String getConversationId() {
    return conversationId;
  }
  public void setConversationId(String conversationId) {
    this.conversationId = conversationId;
  }


  /**
   **/
  public OutboundPreviewCampaignPostContactOutboundPreviewCampaignPostContactEvent isRightPartyContact(Boolean isRightPartyContact) {
    this.isRightPartyContact = isRightPartyContact;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("isRightPartyContact")
  public Boolean getIsRightPartyContact() {
    return isRightPartyContact;
  }
  public void setIsRightPartyContact(Boolean isRightPartyContact) {
    this.isRightPartyContact = isRightPartyContact;
  }


  /**
   **/
  public OutboundPreviewCampaignPostContactOutboundPreviewCampaignPostContactEvent callAnalysisDisposition(String callAnalysisDisposition) {
    this.callAnalysisDisposition = callAnalysisDisposition;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("callAnalysisDisposition")
  public String getCallAnalysisDisposition() {
    return callAnalysisDisposition;
  }
  public void setCallAnalysisDisposition(String callAnalysisDisposition) {
    this.callAnalysisDisposition = callAnalysisDisposition;
  }


  /**
   **/
  public OutboundPreviewCampaignPostContactOutboundPreviewCampaignPostContactEvent agentId(String agentId) {
    this.agentId = agentId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("agentId")
  public String getAgentId() {
    return agentId;
  }
  public void setAgentId(String agentId) {
    this.agentId = agentId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OutboundPreviewCampaignPostContactOutboundPreviewCampaignPostContactEvent outboundPreviewCampaignPostContactOutboundPreviewCampaignPostContactEvent = (OutboundPreviewCampaignPostContactOutboundPreviewCampaignPostContactEvent) o;

    return Objects.equals(this.eventTime, outboundPreviewCampaignPostContactOutboundPreviewCampaignPostContactEvent.eventTime) &&
            Objects.equals(this.voiceAttributes, outboundPreviewCampaignPostContactOutboundPreviewCampaignPostContactEvent.voiceAttributes) &&
            Objects.equals(this.wrapupCode, outboundPreviewCampaignPostContactOutboundPreviewCampaignPostContactEvent.wrapupCode) &&
            Objects.equals(this.outboundCampaignId, outboundPreviewCampaignPostContactOutboundPreviewCampaignPostContactEvent.outboundCampaignId) &&
            Objects.equals(this.dialingMode, outboundPreviewCampaignPostContactOutboundPreviewCampaignPostContactEvent.dialingMode) &&
            Objects.equals(this.agentScriptId, outboundPreviewCampaignPostContactOutboundPreviewCampaignPostContactEvent.agentScriptId) &&
            Objects.equals(this.divisionId, outboundPreviewCampaignPostContactOutboundPreviewCampaignPostContactEvent.divisionId) &&
            Objects.equals(this.outboundContactListId, outboundPreviewCampaignPostContactOutboundPreviewCampaignPostContactEvent.outboundContactListId) &&
            Objects.equals(this.outboundContactListFilterId, outboundPreviewCampaignPostContactOutboundPreviewCampaignPostContactEvent.outboundContactListFilterId) &&
            Objects.equals(this.outboundQueueId, outboundPreviewCampaignPostContactOutboundPreviewCampaignPostContactEvent.outboundQueueId) &&
            Objects.equals(this.outboundContactId, outboundPreviewCampaignPostContactOutboundPreviewCampaignPostContactEvent.outboundContactId) &&
            Objects.equals(this.isCampaignAlwaysRunning, outboundPreviewCampaignPostContactOutboundPreviewCampaignPostContactEvent.isCampaignAlwaysRunning) &&
            Objects.equals(this.isCampaignSkillBased, outboundPreviewCampaignPostContactOutboundPreviewCampaignPostContactEvent.isCampaignSkillBased) &&
            Objects.equals(this.isCampaignDynamicSorting, outboundPreviewCampaignPostContactOutboundPreviewCampaignPostContactEvent.isCampaignDynamicSorting) &&
            Objects.equals(this.isCampaignDynamicFiltering, outboundPreviewCampaignPostContactOutboundPreviewCampaignPostContactEvent.isCampaignDynamicFiltering) &&
            Objects.equals(this.outboundCampaignHealthMask, outboundPreviewCampaignPostContactOutboundPreviewCampaignPostContactEvent.outboundCampaignHealthMask) &&
            Objects.equals(this.isReCall, outboundPreviewCampaignPostContactOutboundPreviewCampaignPostContactEvent.isReCall) &&
            Objects.equals(this.scheduledDateTime, outboundPreviewCampaignPostContactOutboundPreviewCampaignPostContactEvent.scheduledDateTime) &&
            Objects.equals(this.conversationId, outboundPreviewCampaignPostContactOutboundPreviewCampaignPostContactEvent.conversationId) &&
            Objects.equals(this.isRightPartyContact, outboundPreviewCampaignPostContactOutboundPreviewCampaignPostContactEvent.isRightPartyContact) &&
            Objects.equals(this.callAnalysisDisposition, outboundPreviewCampaignPostContactOutboundPreviewCampaignPostContactEvent.callAnalysisDisposition) &&
            Objects.equals(this.agentId, outboundPreviewCampaignPostContactOutboundPreviewCampaignPostContactEvent.agentId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eventTime, voiceAttributes, wrapupCode, outboundCampaignId, dialingMode, agentScriptId, divisionId, outboundContactListId, outboundContactListFilterId, outboundQueueId, outboundContactId, isCampaignAlwaysRunning, isCampaignSkillBased, isCampaignDynamicSorting, isCampaignDynamicFiltering, outboundCampaignHealthMask, isReCall, scheduledDateTime, conversationId, isRightPartyContact, callAnalysisDisposition, agentId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OutboundPreviewCampaignPostContactOutboundPreviewCampaignPostContactEvent {\n");
    
    sb.append("    eventTime: ").append(toIndentedString(eventTime)).append("\n");
    sb.append("    voiceAttributes: ").append(toIndentedString(voiceAttributes)).append("\n");
    sb.append("    wrapupCode: ").append(toIndentedString(wrapupCode)).append("\n");
    sb.append("    outboundCampaignId: ").append(toIndentedString(outboundCampaignId)).append("\n");
    sb.append("    dialingMode: ").append(toIndentedString(dialingMode)).append("\n");
    sb.append("    agentScriptId: ").append(toIndentedString(agentScriptId)).append("\n");
    sb.append("    divisionId: ").append(toIndentedString(divisionId)).append("\n");
    sb.append("    outboundContactListId: ").append(toIndentedString(outboundContactListId)).append("\n");
    sb.append("    outboundContactListFilterId: ").append(toIndentedString(outboundContactListFilterId)).append("\n");
    sb.append("    outboundQueueId: ").append(toIndentedString(outboundQueueId)).append("\n");
    sb.append("    outboundContactId: ").append(toIndentedString(outboundContactId)).append("\n");
    sb.append("    isCampaignAlwaysRunning: ").append(toIndentedString(isCampaignAlwaysRunning)).append("\n");
    sb.append("    isCampaignSkillBased: ").append(toIndentedString(isCampaignSkillBased)).append("\n");
    sb.append("    isCampaignDynamicSorting: ").append(toIndentedString(isCampaignDynamicSorting)).append("\n");
    sb.append("    isCampaignDynamicFiltering: ").append(toIndentedString(isCampaignDynamicFiltering)).append("\n");
    sb.append("    outboundCampaignHealthMask: ").append(toIndentedString(outboundCampaignHealthMask)).append("\n");
    sb.append("    isReCall: ").append(toIndentedString(isReCall)).append("\n");
    sb.append("    scheduledDateTime: ").append(toIndentedString(scheduledDateTime)).append("\n");
    sb.append("    conversationId: ").append(toIndentedString(conversationId)).append("\n");
    sb.append("    isRightPartyContact: ").append(toIndentedString(isRightPartyContact)).append("\n");
    sb.append("    callAnalysisDisposition: ").append(toIndentedString(callAnalysisDisposition)).append("\n");
    sb.append("    agentId: ").append(toIndentedString(agentId)).append("\n");
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

