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
import com.mypurecloud.sdk.v2.model.AnswerGenerationConfig;
import com.mypurecloud.sdk.v2.model.KnowledgeAnswerConfig;
import com.mypurecloud.sdk.v2.model.NluConfig;
import com.mypurecloud.sdk.v2.model.RuleEngineConfig;
import com.mypurecloud.sdk.v2.model.SummaryGenerationConfig;
import com.mypurecloud.sdk.v2.model.WrapupCodePredictionConfig;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * Copilot
 */

public class Copilot  implements Serializable {
  
  private Boolean enabled = null;
  private Boolean liveOnQueue = null;
  private String defaultLanguage = null;
  private KnowledgeAnswerConfig knowledgeAnswerConfig = null;
  private SummaryGenerationConfig summaryGenerationConfig = null;
  private WrapupCodePredictionConfig wrapupCodePredictionConfig = null;
  private AnswerGenerationConfig answerGenerationConfig = null;

  private static class NluEngineTypeEnumDeserializer extends StdDeserializer<NluEngineTypeEnum> {
    public NluEngineTypeEnumDeserializer() {
      super(NluEngineTypeEnumDeserializer.class);
    }

    @Override
    public NluEngineTypeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return NluEngineTypeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Language understanding engine type.
   */
 @JsonDeserialize(using = NluEngineTypeEnumDeserializer.class)
  public enum NluEngineTypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    NLUV3("NluV3");

    private String value;

    NluEngineTypeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static NluEngineTypeEnum fromString(String key) {
      if (key == null) return null;

      for (NluEngineTypeEnum value : NluEngineTypeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return NluEngineTypeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private NluEngineTypeEnum nluEngineType = null;
  private NluConfig nluConfig = null;
  private RuleEngineConfig ruleEngineConfig = null;
  private String selfUri = null;

  public Copilot() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  @ApiModelProperty(example = "null", value = "Copilot is enabled.")
  @JsonProperty("enabled")
  public Boolean getEnabled() {
    return enabled;
  }


  /**
   * Copilot is live on selected queue.
   **/
  public Copilot liveOnQueue(Boolean liveOnQueue) {
    this.liveOnQueue = liveOnQueue;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Copilot is live on selected queue.")
  @JsonProperty("liveOnQueue")
  public Boolean getLiveOnQueue() {
    return liveOnQueue;
  }
  public void setLiveOnQueue(Boolean liveOnQueue) {
    this.liveOnQueue = liveOnQueue;
  }


  /**
   * Copilot default language, e.g. [en-US, es-US, es-ES]. Once set, it can not be modified.
   **/
  public Copilot defaultLanguage(String defaultLanguage) {
    this.defaultLanguage = defaultLanguage;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Copilot default language, e.g. [en-US, es-US, es-ES]. Once set, it can not be modified.")
  @JsonProperty("defaultLanguage")
  public String getDefaultLanguage() {
    return defaultLanguage;
  }
  public void setDefaultLanguage(String defaultLanguage) {
    this.defaultLanguage = defaultLanguage;
  }


  /**
   * Knowledge answer configuration.
   **/
  public Copilot knowledgeAnswerConfig(KnowledgeAnswerConfig knowledgeAnswerConfig) {
    this.knowledgeAnswerConfig = knowledgeAnswerConfig;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Knowledge answer configuration.")
  @JsonProperty("knowledgeAnswerConfig")
  public KnowledgeAnswerConfig getKnowledgeAnswerConfig() {
    return knowledgeAnswerConfig;
  }
  public void setKnowledgeAnswerConfig(KnowledgeAnswerConfig knowledgeAnswerConfig) {
    this.knowledgeAnswerConfig = knowledgeAnswerConfig;
  }


  /**
   * Copilot generated summary configuration.
   **/
  public Copilot summaryGenerationConfig(SummaryGenerationConfig summaryGenerationConfig) {
    this.summaryGenerationConfig = summaryGenerationConfig;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Copilot generated summary configuration.")
  @JsonProperty("summaryGenerationConfig")
  public SummaryGenerationConfig getSummaryGenerationConfig() {
    return summaryGenerationConfig;
  }
  public void setSummaryGenerationConfig(SummaryGenerationConfig summaryGenerationConfig) {
    this.summaryGenerationConfig = summaryGenerationConfig;
  }


  /**
   * Copilot generated wrapup code prediction configuration.
   **/
  public Copilot wrapupCodePredictionConfig(WrapupCodePredictionConfig wrapupCodePredictionConfig) {
    this.wrapupCodePredictionConfig = wrapupCodePredictionConfig;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Copilot generated wrapup code prediction configuration.")
  @JsonProperty("wrapupCodePredictionConfig")
  public WrapupCodePredictionConfig getWrapupCodePredictionConfig() {
    return wrapupCodePredictionConfig;
  }
  public void setWrapupCodePredictionConfig(WrapupCodePredictionConfig wrapupCodePredictionConfig) {
    this.wrapupCodePredictionConfig = wrapupCodePredictionConfig;
  }


  /**
   * Answer generation configuration.
   **/
  public Copilot answerGenerationConfig(AnswerGenerationConfig answerGenerationConfig) {
    this.answerGenerationConfig = answerGenerationConfig;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Answer generation configuration.")
  @JsonProperty("answerGenerationConfig")
  public AnswerGenerationConfig getAnswerGenerationConfig() {
    return answerGenerationConfig;
  }
  public void setAnswerGenerationConfig(AnswerGenerationConfig answerGenerationConfig) {
    this.answerGenerationConfig = answerGenerationConfig;
  }


  /**
   * Language understanding engine type.
   **/
  public Copilot nluEngineType(NluEngineTypeEnum nluEngineType) {
    this.nluEngineType = nluEngineType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Language understanding engine type.")
  @JsonProperty("nluEngineType")
  public NluEngineTypeEnum getNluEngineType() {
    return nluEngineType;
  }
  public void setNluEngineType(NluEngineTypeEnum nluEngineType) {
    this.nluEngineType = nluEngineType;
  }


  /**
   * NLU configuration.
   **/
  public Copilot nluConfig(NluConfig nluConfig) {
    this.nluConfig = nluConfig;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "NLU configuration.")
  @JsonProperty("nluConfig")
  public NluConfig getNluConfig() {
    return nluConfig;
  }
  public void setNluConfig(NluConfig nluConfig) {
    this.nluConfig = nluConfig;
  }


  /**
   * Rule engine configuration.
   **/
  public Copilot ruleEngineConfig(RuleEngineConfig ruleEngineConfig) {
    this.ruleEngineConfig = ruleEngineConfig;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Rule engine configuration.")
  @JsonProperty("ruleEngineConfig")
  public RuleEngineConfig getRuleEngineConfig() {
    return ruleEngineConfig;
  }
  public void setRuleEngineConfig(RuleEngineConfig ruleEngineConfig) {
    this.ruleEngineConfig = ruleEngineConfig;
  }


  @ApiModelProperty(example = "null", value = "The URI for this object")
  @JsonProperty("selfUri")
  public String getSelfUri() {
    return selfUri;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Copilot copilot = (Copilot) o;

    return Objects.equals(this.enabled, copilot.enabled) &&
            Objects.equals(this.liveOnQueue, copilot.liveOnQueue) &&
            Objects.equals(this.defaultLanguage, copilot.defaultLanguage) &&
            Objects.equals(this.knowledgeAnswerConfig, copilot.knowledgeAnswerConfig) &&
            Objects.equals(this.summaryGenerationConfig, copilot.summaryGenerationConfig) &&
            Objects.equals(this.wrapupCodePredictionConfig, copilot.wrapupCodePredictionConfig) &&
            Objects.equals(this.answerGenerationConfig, copilot.answerGenerationConfig) &&
            Objects.equals(this.nluEngineType, copilot.nluEngineType) &&
            Objects.equals(this.nluConfig, copilot.nluConfig) &&
            Objects.equals(this.ruleEngineConfig, copilot.ruleEngineConfig) &&
            Objects.equals(this.selfUri, copilot.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enabled, liveOnQueue, defaultLanguage, knowledgeAnswerConfig, summaryGenerationConfig, wrapupCodePredictionConfig, answerGenerationConfig, nluEngineType, nluConfig, ruleEngineConfig, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Copilot {\n");
    
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    liveOnQueue: ").append(toIndentedString(liveOnQueue)).append("\n");
    sb.append("    defaultLanguage: ").append(toIndentedString(defaultLanguage)).append("\n");
    sb.append("    knowledgeAnswerConfig: ").append(toIndentedString(knowledgeAnswerConfig)).append("\n");
    sb.append("    summaryGenerationConfig: ").append(toIndentedString(summaryGenerationConfig)).append("\n");
    sb.append("    wrapupCodePredictionConfig: ").append(toIndentedString(wrapupCodePredictionConfig)).append("\n");
    sb.append("    answerGenerationConfig: ").append(toIndentedString(answerGenerationConfig)).append("\n");
    sb.append("    nluEngineType: ").append(toIndentedString(nluEngineType)).append("\n");
    sb.append("    nluConfig: ").append(toIndentedString(nluConfig)).append("\n");
    sb.append("    ruleEngineConfig: ").append(toIndentedString(ruleEngineConfig)).append("\n");
    sb.append("    selfUri: ").append(toIndentedString(selfUri)).append("\n");
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

