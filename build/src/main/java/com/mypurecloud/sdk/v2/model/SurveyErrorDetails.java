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
import com.mypurecloud.sdk.v2.model.FlowDiagnosticInfo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * SurveyErrorDetails
 */

public class SurveyErrorDetails  implements Serializable {
  
  private FlowDiagnosticInfo flowDiagnosticInfo = null;
  private String surveyErrorReason = null;

  
  /**
   * Additional information about any errors that occurred in the survey invite flow.
   **/
  public SurveyErrorDetails flowDiagnosticInfo(FlowDiagnosticInfo flowDiagnosticInfo) {
    this.flowDiagnosticInfo = flowDiagnosticInfo;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Additional information about any errors that occurred in the survey invite flow.")
  @JsonProperty("flowDiagnosticInfo")
  public FlowDiagnosticInfo getFlowDiagnosticInfo() {
    return flowDiagnosticInfo;
  }
  public void setFlowDiagnosticInfo(FlowDiagnosticInfo flowDiagnosticInfo) {
    this.flowDiagnosticInfo = flowDiagnosticInfo;
  }

  
  /**
   * An error code indicating the reason for the survey failure.
   **/
  public SurveyErrorDetails surveyErrorReason(String surveyErrorReason) {
    this.surveyErrorReason = surveyErrorReason;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "An error code indicating the reason for the survey failure.")
  @JsonProperty("surveyErrorReason")
  public String getSurveyErrorReason() {
    return surveyErrorReason;
  }
  public void setSurveyErrorReason(String surveyErrorReason) {
    this.surveyErrorReason = surveyErrorReason;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SurveyErrorDetails surveyErrorDetails = (SurveyErrorDetails) o;
    return Objects.equals(this.flowDiagnosticInfo, surveyErrorDetails.flowDiagnosticInfo) &&
        Objects.equals(this.surveyErrorReason, surveyErrorDetails.surveyErrorReason);
  }

  @Override
  public int hashCode() {
    return Objects.hash(flowDiagnosticInfo, surveyErrorReason);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SurveyErrorDetails {\n");
    
    sb.append("    flowDiagnosticInfo: ").append(toIndentedString(flowDiagnosticInfo)).append("\n");
    sb.append("    surveyErrorReason: ").append(toIndentedString(surveyErrorReason)).append("\n");
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

