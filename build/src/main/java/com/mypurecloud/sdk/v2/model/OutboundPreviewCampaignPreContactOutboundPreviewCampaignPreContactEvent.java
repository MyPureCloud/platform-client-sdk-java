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
import com.mypurecloud.sdk.v2.model.OutboundPreviewCampaignPreContactVoiceAttributes;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * OutboundPreviewCampaignPreContactOutboundPreviewCampaignPreContactEvent
 */

public class OutboundPreviewCampaignPreContactOutboundPreviewCampaignPreContactEvent  implements Serializable {
  
  private Long eventTime = null;
  private OutboundPreviewCampaignPreContactVoiceAttributes voiceAttributes = null;
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
  private Boolean isFinal = null;
  private String conversationId = null;

  public OutboundPreviewCampaignPreContactOutboundPreviewCampaignPreContactEvent() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   **/
  public OutboundPreviewCampaignPreContactOutboundPreviewCampaignPreContactEvent eventTime(Long eventTime) {
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
  public OutboundPreviewCampaignPreContactOutboundPreviewCampaignPreContactEvent voiceAttributes(OutboundPreviewCampaignPreContactVoiceAttributes voiceAttributes) {
    this.voiceAttributes = voiceAttributes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("voiceAttributes")
  public OutboundPreviewCampaignPreContactVoiceAttributes getVoiceAttributes() {
    return voiceAttributes;
  }
  public void setVoiceAttributes(OutboundPreviewCampaignPreContactVoiceAttributes voiceAttributes) {
    this.voiceAttributes = voiceAttributes;
  }


  /**
   **/
  public OutboundPreviewCampaignPreContactOutboundPreviewCampaignPreContactEvent wrapupCode(String wrapupCode) {
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
  public OutboundPreviewCampaignPreContactOutboundPreviewCampaignPreContactEvent outboundCampaignId(String outboundCampaignId) {
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
  public OutboundPreviewCampaignPreContactOutboundPreviewCampaignPreContactEvent dialingMode(DialingModeEnum dialingMode) {
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
  public OutboundPreviewCampaignPreContactOutboundPreviewCampaignPreContactEvent agentScriptId(String agentScriptId) {
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
  public OutboundPreviewCampaignPreContactOutboundPreviewCampaignPreContactEvent divisionId(String divisionId) {
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
  public OutboundPreviewCampaignPreContactOutboundPreviewCampaignPreContactEvent outboundContactListId(String outboundContactListId) {
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
  public OutboundPreviewCampaignPreContactOutboundPreviewCampaignPreContactEvent outboundContactListFilterId(String outboundContactListFilterId) {
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
  public OutboundPreviewCampaignPreContactOutboundPreviewCampaignPreContactEvent outboundQueueId(String outboundQueueId) {
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
  public OutboundPreviewCampaignPreContactOutboundPreviewCampaignPreContactEvent outboundContactId(String outboundContactId) {
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
  public OutboundPreviewCampaignPreContactOutboundPreviewCampaignPreContactEvent isCampaignAlwaysRunning(Boolean isCampaignAlwaysRunning) {
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
  public OutboundPreviewCampaignPreContactOutboundPreviewCampaignPreContactEvent isCampaignSkillBased(Boolean isCampaignSkillBased) {
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
  public OutboundPreviewCampaignPreContactOutboundPreviewCampaignPreContactEvent isCampaignDynamicSorting(Boolean isCampaignDynamicSorting) {
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
  public OutboundPreviewCampaignPreContactOutboundPreviewCampaignPreContactEvent isCampaignDynamicFiltering(Boolean isCampaignDynamicFiltering) {
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
  public OutboundPreviewCampaignPreContactOutboundPreviewCampaignPreContactEvent outboundCampaignHealthMask(Long outboundCampaignHealthMask) {
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
  public OutboundPreviewCampaignPreContactOutboundPreviewCampaignPreContactEvent isReCall(Boolean isReCall) {
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
  public OutboundPreviewCampaignPreContactOutboundPreviewCampaignPreContactEvent scheduledDateTime(String scheduledDateTime) {
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
  public OutboundPreviewCampaignPreContactOutboundPreviewCampaignPreContactEvent isFinal(Boolean isFinal) {
    this.isFinal = isFinal;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("isFinal")
  public Boolean getIsFinal() {
    return isFinal;
  }
  public void setIsFinal(Boolean isFinal) {
    this.isFinal = isFinal;
  }


  /**
   **/
  public OutboundPreviewCampaignPreContactOutboundPreviewCampaignPreContactEvent conversationId(String conversationId) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OutboundPreviewCampaignPreContactOutboundPreviewCampaignPreContactEvent outboundPreviewCampaignPreContactOutboundPreviewCampaignPreContactEvent = (OutboundPreviewCampaignPreContactOutboundPreviewCampaignPreContactEvent) o;

    return Objects.equals(this.eventTime, outboundPreviewCampaignPreContactOutboundPreviewCampaignPreContactEvent.eventTime) &&
            Objects.equals(this.voiceAttributes, outboundPreviewCampaignPreContactOutboundPreviewCampaignPreContactEvent.voiceAttributes) &&
            Objects.equals(this.wrapupCode, outboundPreviewCampaignPreContactOutboundPreviewCampaignPreContactEvent.wrapupCode) &&
            Objects.equals(this.outboundCampaignId, outboundPreviewCampaignPreContactOutboundPreviewCampaignPreContactEvent.outboundCampaignId) &&
            Objects.equals(this.dialingMode, outboundPreviewCampaignPreContactOutboundPreviewCampaignPreContactEvent.dialingMode) &&
            Objects.equals(this.agentScriptId, outboundPreviewCampaignPreContactOutboundPreviewCampaignPreContactEvent.agentScriptId) &&
            Objects.equals(this.divisionId, outboundPreviewCampaignPreContactOutboundPreviewCampaignPreContactEvent.divisionId) &&
            Objects.equals(this.outboundContactListId, outboundPreviewCampaignPreContactOutboundPreviewCampaignPreContactEvent.outboundContactListId) &&
            Objects.equals(this.outboundContactListFilterId, outboundPreviewCampaignPreContactOutboundPreviewCampaignPreContactEvent.outboundContactListFilterId) &&
            Objects.equals(this.outboundQueueId, outboundPreviewCampaignPreContactOutboundPreviewCampaignPreContactEvent.outboundQueueId) &&
            Objects.equals(this.outboundContactId, outboundPreviewCampaignPreContactOutboundPreviewCampaignPreContactEvent.outboundContactId) &&
            Objects.equals(this.isCampaignAlwaysRunning, outboundPreviewCampaignPreContactOutboundPreviewCampaignPreContactEvent.isCampaignAlwaysRunning) &&
            Objects.equals(this.isCampaignSkillBased, outboundPreviewCampaignPreContactOutboundPreviewCampaignPreContactEvent.isCampaignSkillBased) &&
            Objects.equals(this.isCampaignDynamicSorting, outboundPreviewCampaignPreContactOutboundPreviewCampaignPreContactEvent.isCampaignDynamicSorting) &&
            Objects.equals(this.isCampaignDynamicFiltering, outboundPreviewCampaignPreContactOutboundPreviewCampaignPreContactEvent.isCampaignDynamicFiltering) &&
            Objects.equals(this.outboundCampaignHealthMask, outboundPreviewCampaignPreContactOutboundPreviewCampaignPreContactEvent.outboundCampaignHealthMask) &&
            Objects.equals(this.isReCall, outboundPreviewCampaignPreContactOutboundPreviewCampaignPreContactEvent.isReCall) &&
            Objects.equals(this.scheduledDateTime, outboundPreviewCampaignPreContactOutboundPreviewCampaignPreContactEvent.scheduledDateTime) &&
            Objects.equals(this.isFinal, outboundPreviewCampaignPreContactOutboundPreviewCampaignPreContactEvent.isFinal) &&
            Objects.equals(this.conversationId, outboundPreviewCampaignPreContactOutboundPreviewCampaignPreContactEvent.conversationId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eventTime, voiceAttributes, wrapupCode, outboundCampaignId, dialingMode, agentScriptId, divisionId, outboundContactListId, outboundContactListFilterId, outboundQueueId, outboundContactId, isCampaignAlwaysRunning, isCampaignSkillBased, isCampaignDynamicSorting, isCampaignDynamicFiltering, outboundCampaignHealthMask, isReCall, scheduledDateTime, isFinal, conversationId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OutboundPreviewCampaignPreContactOutboundPreviewCampaignPreContactEvent {\n");
    
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
    sb.append("    isFinal: ").append(toIndentedString(isFinal)).append("\n");
    sb.append("    conversationId: ").append(toIndentedString(conversationId)).append("\n");
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

