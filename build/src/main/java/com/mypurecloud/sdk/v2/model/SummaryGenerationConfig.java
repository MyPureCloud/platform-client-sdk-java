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
import com.mypurecloud.sdk.v2.model.ModelConfig;
import com.mypurecloud.sdk.v2.model.OnDemandSummaryConfig;
import com.mypurecloud.sdk.v2.model.SummarySettingEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * SummaryGenerationConfig
 */

public class SummaryGenerationConfig  implements Serializable {
  
  private Boolean enabled = null;
  private SummarySettingEntity summarySetting = null;
  private Integer retentionSeconds = null;
  private OnDemandSummaryConfig onDemandSummaryConfig = null;
  private ModelConfig modelConfig = null;

  public SummaryGenerationConfig() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  public SummaryGenerationConfig(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
    }
  }

  
  /**
   * Copilot generated summary is enabled.
   **/
  public SummaryGenerationConfig enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Copilot generated summary is enabled.")
  @JsonProperty("enabled")
  public Boolean getEnabled() {
    return enabled;
  }
  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }


  /**
   * Configured summary setting object.
   **/
  public SummaryGenerationConfig summarySetting(SummarySettingEntity summarySetting) {
    this.summarySetting = summarySetting;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Configured summary setting object.")
  @JsonProperty("summarySetting")
  public SummarySettingEntity getSummarySetting() {
    return summarySetting;
  }
  public void setSummarySetting(SummarySettingEntity summarySetting) {
    this.summarySetting = summarySetting;
  }


  /**
   * Summary retention time in seconds. Can only be modified on the parent assistant.
   * minimum: 3600
   * maximum: 864000
   **/
  public SummaryGenerationConfig retentionSeconds(Integer retentionSeconds) {
    this.retentionSeconds = retentionSeconds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Summary retention time in seconds. Can only be modified on the parent assistant.")
  @JsonProperty("retentionSeconds")
  public Integer getRetentionSeconds() {
    return retentionSeconds;
  }
  public void setRetentionSeconds(Integer retentionSeconds) {
    this.retentionSeconds = retentionSeconds;
  }


  /**
   * On-demand summary configuration.
   **/
  public SummaryGenerationConfig onDemandSummaryConfig(OnDemandSummaryConfig onDemandSummaryConfig) {
    this.onDemandSummaryConfig = onDemandSummaryConfig;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "On-demand summary configuration.")
  @JsonProperty("onDemandSummaryConfig")
  public OnDemandSummaryConfig getOnDemandSummaryConfig() {
    return onDemandSummaryConfig;
  }
  public void setOnDemandSummaryConfig(OnDemandSummaryConfig onDemandSummaryConfig) {
    this.onDemandSummaryConfig = onDemandSummaryConfig;
  }


  /**
   * Model configuration for summarization.
   **/
  public SummaryGenerationConfig modelConfig(ModelConfig modelConfig) {
    this.modelConfig = modelConfig;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Model configuration for summarization.")
  @JsonProperty("modelConfig")
  public ModelConfig getModelConfig() {
    return modelConfig;
  }
  public void setModelConfig(ModelConfig modelConfig) {
    this.modelConfig = modelConfig;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SummaryGenerationConfig summaryGenerationConfig = (SummaryGenerationConfig) o;

    return Objects.equals(this.enabled, summaryGenerationConfig.enabled) &&
            Objects.equals(this.summarySetting, summaryGenerationConfig.summarySetting) &&
            Objects.equals(this.retentionSeconds, summaryGenerationConfig.retentionSeconds) &&
            Objects.equals(this.onDemandSummaryConfig, summaryGenerationConfig.onDemandSummaryConfig) &&
            Objects.equals(this.modelConfig, summaryGenerationConfig.modelConfig);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enabled, summarySetting, retentionSeconds, onDemandSummaryConfig, modelConfig);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SummaryGenerationConfig {\n");
    
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    summarySetting: ").append(toIndentedString(summarySetting)).append("\n");
    sb.append("    retentionSeconds: ").append(toIndentedString(retentionSeconds)).append("\n");
    sb.append("    onDemandSummaryConfig: ").append(toIndentedString(onDemandSummaryConfig)).append("\n");
    sb.append("    modelConfig: ").append(toIndentedString(modelConfig)).append("\n");
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

