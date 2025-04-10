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
import com.mypurecloud.sdk.v2.model.BaseMediaSettings;
import com.mypurecloud.sdk.v2.model.DomainEntityRef;
import com.mypurecloud.sdk.v2.model.ServiceLevel;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import java.io.Serializable;
/**
 * CallbackMediaSettings
 */

public class CallbackMediaSettings  implements Serializable {
  
  private Boolean enableAutoAnswer = null;
  private Integer alertingTimeoutSeconds = null;
  private ServiceLevel serviceLevel = null;
  private Double autoAnswerAlertToneSeconds = null;
  private Double manualAnswerAlertToneSeconds = null;
  private Map<String, BaseMediaSettings> subTypeSettings = null;

  private static class ModeEnumDeserializer extends StdDeserializer<ModeEnum> {
    public ModeEnumDeserializer() {
      super(ModeEnumDeserializer.class);
    }

    @Override
    public ModeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return ModeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The mode callbacks will use on this queue.
   */
 @JsonDeserialize(using = ModeEnumDeserializer.class)
  public enum ModeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    AGENTFIRST("AgentFirst"),
    CUSTOMERFIRST("CustomerFirst");

    private String value;

    ModeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static ModeEnum fromString(String key) {
      if (key == null) return null;

      for (ModeEnum value : ModeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return ModeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private ModeEnum mode = null;
  private Boolean enableAutoDialAndEnd = null;
  private Integer autoDialDelaySeconds = null;
  private Integer autoEndDelaySeconds = null;
  private Double pacingModifier = null;

  private static class LiveVoiceReactionTypeEnumDeserializer extends StdDeserializer<LiveVoiceReactionTypeEnum> {
    public LiveVoiceReactionTypeEnumDeserializer() {
      super(LiveVoiceReactionTypeEnumDeserializer.class);
    }

    @Override
    public LiveVoiceReactionTypeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return LiveVoiceReactionTypeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The action to take if a live voice is detected during the outbound call of a customer first callback.
   */
 @JsonDeserialize(using = LiveVoiceReactionTypeEnumDeserializer.class)
  public enum LiveVoiceReactionTypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    HANGUP("HangUp"),
    TRANSFERTOQUEUE("TransferToQueue"),
    TRANSFERTOFLOW("TransferToFlow");

    private String value;

    LiveVoiceReactionTypeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static LiveVoiceReactionTypeEnum fromString(String key) {
      if (key == null) return null;

      for (LiveVoiceReactionTypeEnum value : LiveVoiceReactionTypeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return LiveVoiceReactionTypeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private LiveVoiceReactionTypeEnum liveVoiceReactionType = null;
  private DomainEntityRef liveVoiceFlow = null;

  private static class AnsweringMachineReactionTypeEnumDeserializer extends StdDeserializer<AnsweringMachineReactionTypeEnum> {
    public AnsweringMachineReactionTypeEnumDeserializer() {
      super(AnsweringMachineReactionTypeEnumDeserializer.class);
    }

    @Override
    public AnsweringMachineReactionTypeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return AnsweringMachineReactionTypeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The action to take if an answering machine is detected during the outbound call of a customer first callback.
   */
 @JsonDeserialize(using = AnsweringMachineReactionTypeEnumDeserializer.class)
  public enum AnsweringMachineReactionTypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    HANGUP("HangUp"),
    TRANSFERTOQUEUE("TransferToQueue"),
    TRANSFERTOFLOW("TransferToFlow");

    private String value;

    AnsweringMachineReactionTypeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static AnsweringMachineReactionTypeEnum fromString(String key) {
      if (key == null) return null;

      for (AnsweringMachineReactionTypeEnum value : AnsweringMachineReactionTypeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return AnsweringMachineReactionTypeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private AnsweringMachineReactionTypeEnum answeringMachineReactionType = null;
  private DomainEntityRef answeringMachineFlow = null;

  public CallbackMediaSettings() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * Indicates if auto-answer is enabled for the given media type or subtype (default is false).  Subtype settings take precedence over media type settings.
   **/
  public CallbackMediaSettings enableAutoAnswer(Boolean enableAutoAnswer) {
    this.enableAutoAnswer = enableAutoAnswer;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Indicates if auto-answer is enabled for the given media type or subtype (default is false).  Subtype settings take precedence over media type settings.")
  @JsonProperty("enableAutoAnswer")
  public Boolean getEnableAutoAnswer() {
    return enableAutoAnswer;
  }
  public void setEnableAutoAnswer(Boolean enableAutoAnswer) {
    this.enableAutoAnswer = enableAutoAnswer;
  }


  /**
   * The alerting timeout for the media type, in seconds
   **/
  public CallbackMediaSettings alertingTimeoutSeconds(Integer alertingTimeoutSeconds) {
    this.alertingTimeoutSeconds = alertingTimeoutSeconds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The alerting timeout for the media type, in seconds")
  @JsonProperty("alertingTimeoutSeconds")
  public Integer getAlertingTimeoutSeconds() {
    return alertingTimeoutSeconds;
  }
  public void setAlertingTimeoutSeconds(Integer alertingTimeoutSeconds) {
    this.alertingTimeoutSeconds = alertingTimeoutSeconds;
  }


  /**
   * The targeted service level for the media type
   **/
  public CallbackMediaSettings serviceLevel(ServiceLevel serviceLevel) {
    this.serviceLevel = serviceLevel;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The targeted service level for the media type")
  @JsonProperty("serviceLevel")
  public ServiceLevel getServiceLevel() {
    return serviceLevel;
  }
  public void setServiceLevel(ServiceLevel serviceLevel) {
    this.serviceLevel = serviceLevel;
  }


  /**
   * How long to play the alerting tone for an auto-answer interaction
   **/
  public CallbackMediaSettings autoAnswerAlertToneSeconds(Double autoAnswerAlertToneSeconds) {
    this.autoAnswerAlertToneSeconds = autoAnswerAlertToneSeconds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "How long to play the alerting tone for an auto-answer interaction")
  @JsonProperty("autoAnswerAlertToneSeconds")
  public Double getAutoAnswerAlertToneSeconds() {
    return autoAnswerAlertToneSeconds;
  }
  public void setAutoAnswerAlertToneSeconds(Double autoAnswerAlertToneSeconds) {
    this.autoAnswerAlertToneSeconds = autoAnswerAlertToneSeconds;
  }


  /**
   * How long to play the alerting tone for a manual-answer interaction
   **/
  public CallbackMediaSettings manualAnswerAlertToneSeconds(Double manualAnswerAlertToneSeconds) {
    this.manualAnswerAlertToneSeconds = manualAnswerAlertToneSeconds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "How long to play the alerting tone for a manual-answer interaction")
  @JsonProperty("manualAnswerAlertToneSeconds")
  public Double getManualAnswerAlertToneSeconds() {
    return manualAnswerAlertToneSeconds;
  }
  public void setManualAnswerAlertToneSeconds(Double manualAnswerAlertToneSeconds) {
    this.manualAnswerAlertToneSeconds = manualAnswerAlertToneSeconds;
  }


  /**
   * Map of media subtype to media subtype specific settings.
   **/
  public CallbackMediaSettings subTypeSettings(Map<String, BaseMediaSettings> subTypeSettings) {
    this.subTypeSettings = subTypeSettings;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Map of media subtype to media subtype specific settings.")
  @JsonProperty("subTypeSettings")
  public Map<String, BaseMediaSettings> getSubTypeSettings() {
    return subTypeSettings;
  }
  public void setSubTypeSettings(Map<String, BaseMediaSettings> subTypeSettings) {
    this.subTypeSettings = subTypeSettings;
  }


  /**
   * The mode callbacks will use on this queue.
   **/
  public CallbackMediaSettings mode(ModeEnum mode) {
    this.mode = mode;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The mode callbacks will use on this queue.")
  @JsonProperty("mode")
  public ModeEnum getMode() {
    return mode;
  }
  public void setMode(ModeEnum mode) {
    this.mode = mode;
  }


  /**
   * Flag to enable Auto-Dial and Auto-End automation for callbacks on this queue.
   **/
  public CallbackMediaSettings enableAutoDialAndEnd(Boolean enableAutoDialAndEnd) {
    this.enableAutoDialAndEnd = enableAutoDialAndEnd;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Flag to enable Auto-Dial and Auto-End automation for callbacks on this queue.")
  @JsonProperty("enableAutoDialAndEnd")
  public Boolean getEnableAutoDialAndEnd() {
    return enableAutoDialAndEnd;
  }
  public void setEnableAutoDialAndEnd(Boolean enableAutoDialAndEnd) {
    this.enableAutoDialAndEnd = enableAutoDialAndEnd;
  }


  /**
   * Time in seconds after agent connects to callback before outgoing call is auto-dialed. Allowable values in range 0 - 1200 seconds. Defaults to 300 seconds.
   **/
  public CallbackMediaSettings autoDialDelaySeconds(Integer autoDialDelaySeconds) {
    this.autoDialDelaySeconds = autoDialDelaySeconds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Time in seconds after agent connects to callback before outgoing call is auto-dialed. Allowable values in range 0 - 1200 seconds. Defaults to 300 seconds.")
  @JsonProperty("autoDialDelaySeconds")
  public Integer getAutoDialDelaySeconds() {
    return autoDialDelaySeconds;
  }
  public void setAutoDialDelaySeconds(Integer autoDialDelaySeconds) {
    this.autoDialDelaySeconds = autoDialDelaySeconds;
  }


  /**
   * Time in seconds after agent disconnects from the outgoing call before the encasing callback is auto-ended. Allowable values in range 0 - 1200 seconds. Defaults to 300 seconds.
   **/
  public CallbackMediaSettings autoEndDelaySeconds(Integer autoEndDelaySeconds) {
    this.autoEndDelaySeconds = autoEndDelaySeconds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Time in seconds after agent disconnects from the outgoing call before the encasing callback is auto-ended. Allowable values in range 0 - 1200 seconds. Defaults to 300 seconds.")
  @JsonProperty("autoEndDelaySeconds")
  public Integer getAutoEndDelaySeconds() {
    return autoEndDelaySeconds;
  }
  public void setAutoEndDelaySeconds(Integer autoEndDelaySeconds) {
    this.autoEndDelaySeconds = autoEndDelaySeconds;
  }


  /**
   * Controls the maximum number of outbound calls at one time when mode is CustomerFirst.
   **/
  public CallbackMediaSettings pacingModifier(Double pacingModifier) {
    this.pacingModifier = pacingModifier;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Controls the maximum number of outbound calls at one time when mode is CustomerFirst.")
  @JsonProperty("pacingModifier")
  public Double getPacingModifier() {
    return pacingModifier;
  }
  public void setPacingModifier(Double pacingModifier) {
    this.pacingModifier = pacingModifier;
  }


  /**
   * The action to take if a live voice is detected during the outbound call of a customer first callback.
   **/
  public CallbackMediaSettings liveVoiceReactionType(LiveVoiceReactionTypeEnum liveVoiceReactionType) {
    this.liveVoiceReactionType = liveVoiceReactionType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The action to take if a live voice is detected during the outbound call of a customer first callback.")
  @JsonProperty("liveVoiceReactionType")
  public LiveVoiceReactionTypeEnum getLiveVoiceReactionType() {
    return liveVoiceReactionType;
  }
  public void setLiveVoiceReactionType(LiveVoiceReactionTypeEnum liveVoiceReactionType) {
    this.liveVoiceReactionType = liveVoiceReactionType;
  }


  /**
   * The inbound flow to transfer to if a live voice is detected during the outbound call of a customer first callback.
   **/
  public CallbackMediaSettings liveVoiceFlow(DomainEntityRef liveVoiceFlow) {
    this.liveVoiceFlow = liveVoiceFlow;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The inbound flow to transfer to if a live voice is detected during the outbound call of a customer first callback.")
  @JsonProperty("liveVoiceFlow")
  public DomainEntityRef getLiveVoiceFlow() {
    return liveVoiceFlow;
  }
  public void setLiveVoiceFlow(DomainEntityRef liveVoiceFlow) {
    this.liveVoiceFlow = liveVoiceFlow;
  }


  /**
   * The action to take if an answering machine is detected during the outbound call of a customer first callback.
   **/
  public CallbackMediaSettings answeringMachineReactionType(AnsweringMachineReactionTypeEnum answeringMachineReactionType) {
    this.answeringMachineReactionType = answeringMachineReactionType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The action to take if an answering machine is detected during the outbound call of a customer first callback.")
  @JsonProperty("answeringMachineReactionType")
  public AnsweringMachineReactionTypeEnum getAnsweringMachineReactionType() {
    return answeringMachineReactionType;
  }
  public void setAnsweringMachineReactionType(AnsweringMachineReactionTypeEnum answeringMachineReactionType) {
    this.answeringMachineReactionType = answeringMachineReactionType;
  }


  /**
   * The inbound flow to transfer to if an answering machine is detected during the outbound call of a customer first callback when answeringMachineReactionType is set to TransferToFlow.
   **/
  public CallbackMediaSettings answeringMachineFlow(DomainEntityRef answeringMachineFlow) {
    this.answeringMachineFlow = answeringMachineFlow;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The inbound flow to transfer to if an answering machine is detected during the outbound call of a customer first callback when answeringMachineReactionType is set to TransferToFlow.")
  @JsonProperty("answeringMachineFlow")
  public DomainEntityRef getAnsweringMachineFlow() {
    return answeringMachineFlow;
  }
  public void setAnsweringMachineFlow(DomainEntityRef answeringMachineFlow) {
    this.answeringMachineFlow = answeringMachineFlow;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CallbackMediaSettings callbackMediaSettings = (CallbackMediaSettings) o;

    return Objects.equals(this.enableAutoAnswer, callbackMediaSettings.enableAutoAnswer) &&
            Objects.equals(this.alertingTimeoutSeconds, callbackMediaSettings.alertingTimeoutSeconds) &&
            Objects.equals(this.serviceLevel, callbackMediaSettings.serviceLevel) &&
            Objects.equals(this.autoAnswerAlertToneSeconds, callbackMediaSettings.autoAnswerAlertToneSeconds) &&
            Objects.equals(this.manualAnswerAlertToneSeconds, callbackMediaSettings.manualAnswerAlertToneSeconds) &&
            Objects.equals(this.subTypeSettings, callbackMediaSettings.subTypeSettings) &&
            Objects.equals(this.mode, callbackMediaSettings.mode) &&
            Objects.equals(this.enableAutoDialAndEnd, callbackMediaSettings.enableAutoDialAndEnd) &&
            Objects.equals(this.autoDialDelaySeconds, callbackMediaSettings.autoDialDelaySeconds) &&
            Objects.equals(this.autoEndDelaySeconds, callbackMediaSettings.autoEndDelaySeconds) &&
            Objects.equals(this.pacingModifier, callbackMediaSettings.pacingModifier) &&
            Objects.equals(this.liveVoiceReactionType, callbackMediaSettings.liveVoiceReactionType) &&
            Objects.equals(this.liveVoiceFlow, callbackMediaSettings.liveVoiceFlow) &&
            Objects.equals(this.answeringMachineReactionType, callbackMediaSettings.answeringMachineReactionType) &&
            Objects.equals(this.answeringMachineFlow, callbackMediaSettings.answeringMachineFlow);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enableAutoAnswer, alertingTimeoutSeconds, serviceLevel, autoAnswerAlertToneSeconds, manualAnswerAlertToneSeconds, subTypeSettings, mode, enableAutoDialAndEnd, autoDialDelaySeconds, autoEndDelaySeconds, pacingModifier, liveVoiceReactionType, liveVoiceFlow, answeringMachineReactionType, answeringMachineFlow);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CallbackMediaSettings {\n");
    
    sb.append("    enableAutoAnswer: ").append(toIndentedString(enableAutoAnswer)).append("\n");
    sb.append("    alertingTimeoutSeconds: ").append(toIndentedString(alertingTimeoutSeconds)).append("\n");
    sb.append("    serviceLevel: ").append(toIndentedString(serviceLevel)).append("\n");
    sb.append("    autoAnswerAlertToneSeconds: ").append(toIndentedString(autoAnswerAlertToneSeconds)).append("\n");
    sb.append("    manualAnswerAlertToneSeconds: ").append(toIndentedString(manualAnswerAlertToneSeconds)).append("\n");
    sb.append("    subTypeSettings: ").append(toIndentedString(subTypeSettings)).append("\n");
    sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
    sb.append("    enableAutoDialAndEnd: ").append(toIndentedString(enableAutoDialAndEnd)).append("\n");
    sb.append("    autoDialDelaySeconds: ").append(toIndentedString(autoDialDelaySeconds)).append("\n");
    sb.append("    autoEndDelaySeconds: ").append(toIndentedString(autoEndDelaySeconds)).append("\n");
    sb.append("    pacingModifier: ").append(toIndentedString(pacingModifier)).append("\n");
    sb.append("    liveVoiceReactionType: ").append(toIndentedString(liveVoiceReactionType)).append("\n");
    sb.append("    liveVoiceFlow: ").append(toIndentedString(liveVoiceFlow)).append("\n");
    sb.append("    answeringMachineReactionType: ").append(toIndentedString(answeringMachineReactionType)).append("\n");
    sb.append("    answeringMachineFlow: ").append(toIndentedString(answeringMachineFlow)).append("\n");
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

