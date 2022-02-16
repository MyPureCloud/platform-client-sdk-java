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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * AnalyticsReportingSettings
 */

public class AnalyticsReportingSettings  implements Serializable {
  
  private Boolean piiMaskingEnabled = null;
  private Boolean queueAgentAccessObfuscation = null;

  
  /**
   * Indication of whether or not personal data is masked in data export and the Analytics/Reporting UI
   **/
  public AnalyticsReportingSettings piiMaskingEnabled(Boolean piiMaskingEnabled) {
    this.piiMaskingEnabled = piiMaskingEnabled;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Indication of whether or not personal data is masked in data export and the Analytics/Reporting UI")
  @JsonProperty("piiMaskingEnabled")
  public Boolean getPiiMaskingEnabled() {
    return piiMaskingEnabled;
  }
  public void setPiiMaskingEnabled(Boolean piiMaskingEnabled) {
    this.piiMaskingEnabled = piiMaskingEnabled;
  }

  
  /**
   * Indication of whether or not to obfuscate export data from the Queue Agent Details view based on User ACL
   **/
  public AnalyticsReportingSettings queueAgentAccessObfuscation(Boolean queueAgentAccessObfuscation) {
    this.queueAgentAccessObfuscation = queueAgentAccessObfuscation;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Indication of whether or not to obfuscate export data from the Queue Agent Details view based on User ACL")
  @JsonProperty("queueAgentAccessObfuscation")
  public Boolean getQueueAgentAccessObfuscation() {
    return queueAgentAccessObfuscation;
  }
  public void setQueueAgentAccessObfuscation(Boolean queueAgentAccessObfuscation) {
    this.queueAgentAccessObfuscation = queueAgentAccessObfuscation;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AnalyticsReportingSettings analyticsReportingSettings = (AnalyticsReportingSettings) o;
    return Objects.equals(this.piiMaskingEnabled, analyticsReportingSettings.piiMaskingEnabled) &&
        Objects.equals(this.queueAgentAccessObfuscation, analyticsReportingSettings.queueAgentAccessObfuscation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(piiMaskingEnabled, queueAgentAccessObfuscation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AnalyticsReportingSettings {\n");
    
    sb.append("    piiMaskingEnabled: ").append(toIndentedString(piiMaskingEnabled)).append("\n");
    sb.append("    queueAgentAccessObfuscation: ").append(toIndentedString(queueAgentAccessObfuscation)).append("\n");
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

