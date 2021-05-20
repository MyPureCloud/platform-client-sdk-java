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
import com.mypurecloud.sdk.v2.model.TranscriptionsTopicTranscriptAlternative;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * TranscriptionsTopicTranscriptResult
 */

public class TranscriptionsTopicTranscriptResult  implements Serializable {
  
  private String utteranceId = null;
  private Boolean isFinal = null;

  private static class ChannelEnumDeserializer extends StdDeserializer<ChannelEnum> {
    public ChannelEnumDeserializer() {
      super(ChannelEnumDeserializer.class);
    }

    @Override
    public ChannelEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return ChannelEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Gets or Sets channel
   */
 @JsonDeserialize(using = ChannelEnumDeserializer.class)
  public enum ChannelEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    UNKNOWN("UNKNOWN"),
    INTERNAL("INTERNAL"),
    EXTERNAL("EXTERNAL"),
    BOTH("BOTH");

    private String value;

    ChannelEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static ChannelEnum fromString(String key) {
      if (key == null) return null;

      for (ChannelEnum value : ChannelEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return ChannelEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private ChannelEnum channel = null;
  private List<TranscriptionsTopicTranscriptAlternative> alternatives = new ArrayList<TranscriptionsTopicTranscriptAlternative>();
  private String agentAssistantId = null;
  private String engineId = null;
  private String dialect = null;
  private String speechTextAnalyticsProgramId = null;
  private Integer startTimeMs = null;
  private Integer offsetMs = null;
  private Integer durationMs = null;
  private Boolean agentAssistEnabled = null;
  private Boolean voiceTranscriptionEnabled = null;

  
  /**
   **/
  public TranscriptionsTopicTranscriptResult utteranceId(String utteranceId) {
    this.utteranceId = utteranceId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("utteranceId")
  public String getUtteranceId() {
    return utteranceId;
  }
  public void setUtteranceId(String utteranceId) {
    this.utteranceId = utteranceId;
  }

  
  /**
   **/
  public TranscriptionsTopicTranscriptResult isFinal(Boolean isFinal) {
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
  public TranscriptionsTopicTranscriptResult channel(ChannelEnum channel) {
    this.channel = channel;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("channel")
  public ChannelEnum getChannel() {
    return channel;
  }
  public void setChannel(ChannelEnum channel) {
    this.channel = channel;
  }

  
  /**
   **/
  public TranscriptionsTopicTranscriptResult alternatives(List<TranscriptionsTopicTranscriptAlternative> alternatives) {
    this.alternatives = alternatives;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("alternatives")
  public List<TranscriptionsTopicTranscriptAlternative> getAlternatives() {
    return alternatives;
  }
  public void setAlternatives(List<TranscriptionsTopicTranscriptAlternative> alternatives) {
    this.alternatives = alternatives;
  }

  
  /**
   **/
  public TranscriptionsTopicTranscriptResult agentAssistantId(String agentAssistantId) {
    this.agentAssistantId = agentAssistantId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("agentAssistantId")
  public String getAgentAssistantId() {
    return agentAssistantId;
  }
  public void setAgentAssistantId(String agentAssistantId) {
    this.agentAssistantId = agentAssistantId;
  }

  
  /**
   **/
  public TranscriptionsTopicTranscriptResult engineId(String engineId) {
    this.engineId = engineId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("engineId")
  public String getEngineId() {
    return engineId;
  }
  public void setEngineId(String engineId) {
    this.engineId = engineId;
  }

  
  /**
   **/
  public TranscriptionsTopicTranscriptResult dialect(String dialect) {
    this.dialect = dialect;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("dialect")
  public String getDialect() {
    return dialect;
  }
  public void setDialect(String dialect) {
    this.dialect = dialect;
  }

  
  /**
   **/
  public TranscriptionsTopicTranscriptResult speechTextAnalyticsProgramId(String speechTextAnalyticsProgramId) {
    this.speechTextAnalyticsProgramId = speechTextAnalyticsProgramId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("speechTextAnalyticsProgramId")
  public String getSpeechTextAnalyticsProgramId() {
    return speechTextAnalyticsProgramId;
  }
  public void setSpeechTextAnalyticsProgramId(String speechTextAnalyticsProgramId) {
    this.speechTextAnalyticsProgramId = speechTextAnalyticsProgramId;
  }

  
  /**
   **/
  public TranscriptionsTopicTranscriptResult startTimeMs(Integer startTimeMs) {
    this.startTimeMs = startTimeMs;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("startTimeMs")
  public Integer getStartTimeMs() {
    return startTimeMs;
  }
  public void setStartTimeMs(Integer startTimeMs) {
    this.startTimeMs = startTimeMs;
  }

  
  /**
   **/
  public TranscriptionsTopicTranscriptResult offsetMs(Integer offsetMs) {
    this.offsetMs = offsetMs;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("offsetMs")
  public Integer getOffsetMs() {
    return offsetMs;
  }
  public void setOffsetMs(Integer offsetMs) {
    this.offsetMs = offsetMs;
  }

  
  /**
   **/
  public TranscriptionsTopicTranscriptResult durationMs(Integer durationMs) {
    this.durationMs = durationMs;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("durationMs")
  public Integer getDurationMs() {
    return durationMs;
  }
  public void setDurationMs(Integer durationMs) {
    this.durationMs = durationMs;
  }

  
  /**
   **/
  public TranscriptionsTopicTranscriptResult agentAssistEnabled(Boolean agentAssistEnabled) {
    this.agentAssistEnabled = agentAssistEnabled;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("agentAssistEnabled")
  public Boolean getAgentAssistEnabled() {
    return agentAssistEnabled;
  }
  public void setAgentAssistEnabled(Boolean agentAssistEnabled) {
    this.agentAssistEnabled = agentAssistEnabled;
  }

  
  /**
   **/
  public TranscriptionsTopicTranscriptResult voiceTranscriptionEnabled(Boolean voiceTranscriptionEnabled) {
    this.voiceTranscriptionEnabled = voiceTranscriptionEnabled;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("voiceTranscriptionEnabled")
  public Boolean getVoiceTranscriptionEnabled() {
    return voiceTranscriptionEnabled;
  }
  public void setVoiceTranscriptionEnabled(Boolean voiceTranscriptionEnabled) {
    this.voiceTranscriptionEnabled = voiceTranscriptionEnabled;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TranscriptionsTopicTranscriptResult transcriptionsTopicTranscriptResult = (TranscriptionsTopicTranscriptResult) o;
    return Objects.equals(this.utteranceId, transcriptionsTopicTranscriptResult.utteranceId) &&
        Objects.equals(this.isFinal, transcriptionsTopicTranscriptResult.isFinal) &&
        Objects.equals(this.channel, transcriptionsTopicTranscriptResult.channel) &&
        Objects.equals(this.alternatives, transcriptionsTopicTranscriptResult.alternatives) &&
        Objects.equals(this.agentAssistantId, transcriptionsTopicTranscriptResult.agentAssistantId) &&
        Objects.equals(this.engineId, transcriptionsTopicTranscriptResult.engineId) &&
        Objects.equals(this.dialect, transcriptionsTopicTranscriptResult.dialect) &&
        Objects.equals(this.speechTextAnalyticsProgramId, transcriptionsTopicTranscriptResult.speechTextAnalyticsProgramId) &&
        Objects.equals(this.startTimeMs, transcriptionsTopicTranscriptResult.startTimeMs) &&
        Objects.equals(this.offsetMs, transcriptionsTopicTranscriptResult.offsetMs) &&
        Objects.equals(this.durationMs, transcriptionsTopicTranscriptResult.durationMs) &&
        Objects.equals(this.agentAssistEnabled, transcriptionsTopicTranscriptResult.agentAssistEnabled) &&
        Objects.equals(this.voiceTranscriptionEnabled, transcriptionsTopicTranscriptResult.voiceTranscriptionEnabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(utteranceId, isFinal, channel, alternatives, agentAssistantId, engineId, dialect, speechTextAnalyticsProgramId, startTimeMs, offsetMs, durationMs, agentAssistEnabled, voiceTranscriptionEnabled);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TranscriptionsTopicTranscriptResult {\n");
    
    sb.append("    utteranceId: ").append(toIndentedString(utteranceId)).append("\n");
    sb.append("    isFinal: ").append(toIndentedString(isFinal)).append("\n");
    sb.append("    channel: ").append(toIndentedString(channel)).append("\n");
    sb.append("    alternatives: ").append(toIndentedString(alternatives)).append("\n");
    sb.append("    agentAssistantId: ").append(toIndentedString(agentAssistantId)).append("\n");
    sb.append("    engineId: ").append(toIndentedString(engineId)).append("\n");
    sb.append("    dialect: ").append(toIndentedString(dialect)).append("\n");
    sb.append("    speechTextAnalyticsProgramId: ").append(toIndentedString(speechTextAnalyticsProgramId)).append("\n");
    sb.append("    startTimeMs: ").append(toIndentedString(startTimeMs)).append("\n");
    sb.append("    offsetMs: ").append(toIndentedString(offsetMs)).append("\n");
    sb.append("    durationMs: ").append(toIndentedString(durationMs)).append("\n");
    sb.append("    agentAssistEnabled: ").append(toIndentedString(agentAssistEnabled)).append("\n");
    sb.append("    voiceTranscriptionEnabled: ").append(toIndentedString(voiceTranscriptionEnabled)).append("\n");
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

