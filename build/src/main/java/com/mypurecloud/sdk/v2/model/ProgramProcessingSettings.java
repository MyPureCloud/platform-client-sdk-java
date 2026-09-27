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
import com.mypurecloud.sdk.v2.model.BaseProgramEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * ProgramProcessingSettings
 */

public class ProgramProcessingSettings  implements Serializable {
  
  private BaseProgramEntity program = null;
  private Boolean sentimentAnalysisEnabled = null;
  private Boolean agentEmpathyAnalysisEnabled = null;

  public ProgramProcessingSettings() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  public ProgramProcessingSettings(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
    }
  }

  
  /**
   * The ID of the program
   **/
  public ProgramProcessingSettings program(BaseProgramEntity program) {
    this.program = program;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The ID of the program")
  @JsonProperty("program")
  public BaseProgramEntity getProgram() {
    return program;
  }
  public void setProgram(BaseProgramEntity program) {
    this.program = program;
  }


  /**
   * Whether sentiment analysis is enabled for the program
   **/
  public ProgramProcessingSettings sentimentAnalysisEnabled(Boolean sentimentAnalysisEnabled) {
    this.sentimentAnalysisEnabled = sentimentAnalysisEnabled;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Whether sentiment analysis is enabled for the program")
  @JsonProperty("sentimentAnalysisEnabled")
  public Boolean getSentimentAnalysisEnabled() {
    return sentimentAnalysisEnabled;
  }
  public void setSentimentAnalysisEnabled(Boolean sentimentAnalysisEnabled) {
    this.sentimentAnalysisEnabled = sentimentAnalysisEnabled;
  }


  /**
   * Whether agent empathy analysis is enabled for the program
   **/
  public ProgramProcessingSettings agentEmpathyAnalysisEnabled(Boolean agentEmpathyAnalysisEnabled) {
    this.agentEmpathyAnalysisEnabled = agentEmpathyAnalysisEnabled;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Whether agent empathy analysis is enabled for the program")
  @JsonProperty("agentEmpathyAnalysisEnabled")
  public Boolean getAgentEmpathyAnalysisEnabled() {
    return agentEmpathyAnalysisEnabled;
  }
  public void setAgentEmpathyAnalysisEnabled(Boolean agentEmpathyAnalysisEnabled) {
    this.agentEmpathyAnalysisEnabled = agentEmpathyAnalysisEnabled;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProgramProcessingSettings programProcessingSettings = (ProgramProcessingSettings) o;

    return Objects.equals(this.program, programProcessingSettings.program) &&
            Objects.equals(this.sentimentAnalysisEnabled, programProcessingSettings.sentimentAnalysisEnabled) &&
            Objects.equals(this.agentEmpathyAnalysisEnabled, programProcessingSettings.agentEmpathyAnalysisEnabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(program, sentimentAnalysisEnabled, agentEmpathyAnalysisEnabled);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProgramProcessingSettings {\n");
    
    sb.append("    program: ").append(toIndentedString(program)).append("\n");
    sb.append("    sentimentAnalysisEnabled: ").append(toIndentedString(sentimentAnalysisEnabled)).append("\n");
    sb.append("    agentEmpathyAnalysisEnabled: ").append(toIndentedString(agentEmpathyAnalysisEnabled)).append("\n");
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

