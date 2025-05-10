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
 * DiagnosticsSettings
 */

public class DiagnosticsSettings  implements Serializable {
  
  private Boolean reportLowMaxCallsPerAgentAlert = null;

  public DiagnosticsSettings() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * Whether to report on low max calls per agent alerts.
   **/
  public DiagnosticsSettings reportLowMaxCallsPerAgentAlert(Boolean reportLowMaxCallsPerAgentAlert) {
    this.reportLowMaxCallsPerAgentAlert = reportLowMaxCallsPerAgentAlert;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Whether to report on low max calls per agent alerts.")
  @JsonProperty("reportLowMaxCallsPerAgentAlert")
  public Boolean getReportLowMaxCallsPerAgentAlert() {
    return reportLowMaxCallsPerAgentAlert;
  }
  public void setReportLowMaxCallsPerAgentAlert(Boolean reportLowMaxCallsPerAgentAlert) {
    this.reportLowMaxCallsPerAgentAlert = reportLowMaxCallsPerAgentAlert;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DiagnosticsSettings diagnosticsSettings = (DiagnosticsSettings) o;

    return Objects.equals(this.reportLowMaxCallsPerAgentAlert, diagnosticsSettings.reportLowMaxCallsPerAgentAlert);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reportLowMaxCallsPerAgentAlert);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DiagnosticsSettings {\n");
    
    sb.append("    reportLowMaxCallsPerAgentAlert: ").append(toIndentedString(reportLowMaxCallsPerAgentAlert)).append("\n");
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

