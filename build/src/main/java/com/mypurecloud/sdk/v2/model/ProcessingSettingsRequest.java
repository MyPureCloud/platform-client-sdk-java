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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * ProcessingSettingsRequest
 */

public class ProcessingSettingsRequest  implements Serializable {
  
  private Boolean sentimentAnalysisEnabled = null;
  private Boolean agentEmpathyAnalysisEnabled = null;

  public ProcessingSettingsRequest() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  public ProcessingSettingsRequest(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
    }
  }

  
  /**
   * Whether sentiment analysis is enabled for the program
   **/
  public ProcessingSettingsRequest sentimentAnalysisEnabled(Boolean sentimentAnalysisEnabled) {
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
  public ProcessingSettingsRequest agentEmpathyAnalysisEnabled(Boolean agentEmpathyAnalysisEnabled) {
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
    ProcessingSettingsRequest processingSettingsRequest = (ProcessingSettingsRequest) o;

    return Objects.equals(this.sentimentAnalysisEnabled, processingSettingsRequest.sentimentAnalysisEnabled) &&
            Objects.equals(this.agentEmpathyAnalysisEnabled, processingSettingsRequest.agentEmpathyAnalysisEnabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sentimentAnalysisEnabled, agentEmpathyAnalysisEnabled);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProcessingSettingsRequest {\n");
    
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

