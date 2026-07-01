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
 * ScreenMonitorSettings
 */

public class ScreenMonitorSettings  implements Serializable {
  
  private Boolean enableAgentNotifications = null;
  private Integer maxSimultaneousScreenMonitoringSessions = null;

  public ScreenMonitorSettings() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  public ScreenMonitorSettings(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
    }
  }

  
  /**
   **/
  public ScreenMonitorSettings enableAgentNotifications(Boolean enableAgentNotifications) {
    this.enableAgentNotifications = enableAgentNotifications;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("enableAgentNotifications")
  public Boolean getEnableAgentNotifications() {
    return enableAgentNotifications;
  }
  public void setEnableAgentNotifications(Boolean enableAgentNotifications) {
    this.enableAgentNotifications = enableAgentNotifications;
  }


  /**
   **/
  public ScreenMonitorSettings maxSimultaneousScreenMonitoringSessions(Integer maxSimultaneousScreenMonitoringSessions) {
    this.maxSimultaneousScreenMonitoringSessions = maxSimultaneousScreenMonitoringSessions;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("maxSimultaneousScreenMonitoringSessions")
  public Integer getMaxSimultaneousScreenMonitoringSessions() {
    return maxSimultaneousScreenMonitoringSessions;
  }
  public void setMaxSimultaneousScreenMonitoringSessions(Integer maxSimultaneousScreenMonitoringSessions) {
    this.maxSimultaneousScreenMonitoringSessions = maxSimultaneousScreenMonitoringSessions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ScreenMonitorSettings screenMonitorSettings = (ScreenMonitorSettings) o;

    return Objects.equals(this.enableAgentNotifications, screenMonitorSettings.enableAgentNotifications) &&
            Objects.equals(this.maxSimultaneousScreenMonitoringSessions, screenMonitorSettings.maxSimultaneousScreenMonitoringSessions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enableAgentNotifications, maxSimultaneousScreenMonitoringSessions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScreenMonitorSettings {\n");
    
    sb.append("    enableAgentNotifications: ").append(toIndentedString(enableAgentNotifications)).append("\n");
    sb.append("    maxSimultaneousScreenMonitoringSessions: ").append(toIndentedString(maxSimultaneousScreenMonitoringSessions)).append("\n");
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

