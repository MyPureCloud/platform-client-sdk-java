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
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * SpeechTextAnalyticsSettingsRequest
 */

public class SpeechTextAnalyticsSettingsRequest  implements Serializable {
  
  private String defaultProgramId = null;
  private List<String> expectedDialects = new ArrayList<String>();
  private Boolean textAnalyticsEnabled = null;
  private Boolean agentEmpathyEnabled = null;

  
  /**
   * Setting to choose name for the default program for topic detection
   **/
  public SpeechTextAnalyticsSettingsRequest defaultProgramId(String defaultProgramId) {
    this.defaultProgramId = defaultProgramId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Setting to choose name for the default program for topic detection")
  @JsonProperty("defaultProgramId")
  public String getDefaultProgramId() {
    return defaultProgramId;
  }
  public void setDefaultProgramId(String defaultProgramId) {
    this.defaultProgramId = defaultProgramId;
  }


  /**
   * Setting to choose expected dialects
   **/
  public SpeechTextAnalyticsSettingsRequest expectedDialects(List<String> expectedDialects) {
    this.expectedDialects = expectedDialects;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Setting to choose expected dialects")
  @JsonProperty("expectedDialects")
  public List<String> getExpectedDialects() {
    return expectedDialects;
  }
  public void setExpectedDialects(List<String> expectedDialects) {
    this.expectedDialects = expectedDialects;
  }


  /**
   * Setting to enable/disable text analytics
   **/
  public SpeechTextAnalyticsSettingsRequest textAnalyticsEnabled(Boolean textAnalyticsEnabled) {
    this.textAnalyticsEnabled = textAnalyticsEnabled;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Setting to enable/disable text analytics")
  @JsonProperty("textAnalyticsEnabled")
  public Boolean getTextAnalyticsEnabled() {
    return textAnalyticsEnabled;
  }
  public void setTextAnalyticsEnabled(Boolean textAnalyticsEnabled) {
    this.textAnalyticsEnabled = textAnalyticsEnabled;
  }


  /**
   * Setting to enable/disable Agent Empathy setting
   **/
  public SpeechTextAnalyticsSettingsRequest agentEmpathyEnabled(Boolean agentEmpathyEnabled) {
    this.agentEmpathyEnabled = agentEmpathyEnabled;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Setting to enable/disable Agent Empathy setting")
  @JsonProperty("agentEmpathyEnabled")
  public Boolean getAgentEmpathyEnabled() {
    return agentEmpathyEnabled;
  }
  public void setAgentEmpathyEnabled(Boolean agentEmpathyEnabled) {
    this.agentEmpathyEnabled = agentEmpathyEnabled;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SpeechTextAnalyticsSettingsRequest speechTextAnalyticsSettingsRequest = (SpeechTextAnalyticsSettingsRequest) o;

    return Objects.equals(this.defaultProgramId, speechTextAnalyticsSettingsRequest.defaultProgramId) &&
            Objects.equals(this.expectedDialects, speechTextAnalyticsSettingsRequest.expectedDialects) &&
            Objects.equals(this.textAnalyticsEnabled, speechTextAnalyticsSettingsRequest.textAnalyticsEnabled) &&
            Objects.equals(this.agentEmpathyEnabled, speechTextAnalyticsSettingsRequest.agentEmpathyEnabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(defaultProgramId, expectedDialects, textAnalyticsEnabled, agentEmpathyEnabled);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SpeechTextAnalyticsSettingsRequest {\n");
    
    sb.append("    defaultProgramId: ").append(toIndentedString(defaultProgramId)).append("\n");
    sb.append("    expectedDialects: ").append(toIndentedString(expectedDialects)).append("\n");
    sb.append("    textAnalyticsEnabled: ").append(toIndentedString(textAnalyticsEnabled)).append("\n");
    sb.append("    agentEmpathyEnabled: ").append(toIndentedString(agentEmpathyEnabled)).append("\n");
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

