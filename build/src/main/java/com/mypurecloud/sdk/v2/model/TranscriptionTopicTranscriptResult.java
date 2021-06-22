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
import com.mypurecloud.sdk.v2.model.TranscriptionTopicTranscriptAlternative;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * TranscriptionTopicTranscriptResult
 */

public class TranscriptionTopicTranscriptResult  implements Serializable {
  
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
  private List<TranscriptionTopicTranscriptAlternative> alternatives = new ArrayList<TranscriptionTopicTranscriptAlternative>();
  private String agentAssistantId = null;
  private String engineId = null;
  private String dialect = null;
  private String speechTextAnalyticsProgramId = null;
  private Boolean agentAssistEnabled = null;
  private Boolean voiceTranscriptionEnabled = null;

  
  /**
   **/
  public TranscriptionTopicTranscriptResult utteranceId(String utteranceId) {
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
  public TranscriptionTopicTranscriptResult isFinal(Boolean isFinal) {
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
  public TranscriptionTopicTranscriptResult channel(ChannelEnum channel) {
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
  public TranscriptionTopicTranscriptResult alternatives(List<TranscriptionTopicTranscriptAlternative> alternatives) {
    this.alternatives = alternatives;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("alternatives")
  public List<TranscriptionTopicTranscriptAlternative> getAlternatives() {
    return alternatives;
  }
  public void setAlternatives(List<TranscriptionTopicTranscriptAlternative> alternatives) {
    this.alternatives = alternatives;
  }

  
  /**
   **/
  public TranscriptionTopicTranscriptResult agentAssistantId(String agentAssistantId) {
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
  public TranscriptionTopicTranscriptResult engineId(String engineId) {
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
  public TranscriptionTopicTranscriptResult dialect(String dialect) {
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
  public TranscriptionTopicTranscriptResult speechTextAnalyticsProgramId(String speechTextAnalyticsProgramId) {
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
  public TranscriptionTopicTranscriptResult agentAssistEnabled(Boolean agentAssistEnabled) {
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
  public TranscriptionTopicTranscriptResult voiceTranscriptionEnabled(Boolean voiceTranscriptionEnabled) {
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
    TranscriptionTopicTranscriptResult transcriptionTopicTranscriptResult = (TranscriptionTopicTranscriptResult) o;
    return Objects.equals(this.utteranceId, transcriptionTopicTranscriptResult.utteranceId) &&
        Objects.equals(this.isFinal, transcriptionTopicTranscriptResult.isFinal) &&
        Objects.equals(this.channel, transcriptionTopicTranscriptResult.channel) &&
        Objects.equals(this.alternatives, transcriptionTopicTranscriptResult.alternatives) &&
        Objects.equals(this.agentAssistantId, transcriptionTopicTranscriptResult.agentAssistantId) &&
        Objects.equals(this.engineId, transcriptionTopicTranscriptResult.engineId) &&
        Objects.equals(this.dialect, transcriptionTopicTranscriptResult.dialect) &&
        Objects.equals(this.speechTextAnalyticsProgramId, transcriptionTopicTranscriptResult.speechTextAnalyticsProgramId) &&
        Objects.equals(this.agentAssistEnabled, transcriptionTopicTranscriptResult.agentAssistEnabled) &&
        Objects.equals(this.voiceTranscriptionEnabled, transcriptionTopicTranscriptResult.voiceTranscriptionEnabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(utteranceId, isFinal, channel, alternatives, agentAssistantId, engineId, dialect, speechTextAnalyticsProgramId, agentAssistEnabled, voiceTranscriptionEnabled);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TranscriptionTopicTranscriptResult {\n");
    
    sb.append("    utteranceId: ").append(toIndentedString(utteranceId)).append("\n");
    sb.append("    isFinal: ").append(toIndentedString(isFinal)).append("\n");
    sb.append("    channel: ").append(toIndentedString(channel)).append("\n");
    sb.append("    alternatives: ").append(toIndentedString(alternatives)).append("\n");
    sb.append("    agentAssistantId: ").append(toIndentedString(agentAssistantId)).append("\n");
    sb.append("    engineId: ").append(toIndentedString(engineId)).append("\n");
    sb.append("    dialect: ").append(toIndentedString(dialect)).append("\n");
    sb.append("    speechTextAnalyticsProgramId: ").append(toIndentedString(speechTextAnalyticsProgramId)).append("\n");
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

