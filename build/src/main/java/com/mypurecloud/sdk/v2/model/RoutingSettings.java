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
 * RoutingSettings
 */

public class RoutingSettings  implements Serializable {
  
  private Boolean resetAgentScoreOnPresenceChange = null;

  
  /**
   * Reset agent score when agent presence changes from off-queue to on-queue
   **/
  public RoutingSettings resetAgentScoreOnPresenceChange(Boolean resetAgentScoreOnPresenceChange) {
    this.resetAgentScoreOnPresenceChange = resetAgentScoreOnPresenceChange;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Reset agent score when agent presence changes from off-queue to on-queue")
  @JsonProperty("resetAgentScoreOnPresenceChange")
  public Boolean getResetAgentScoreOnPresenceChange() {
    return resetAgentScoreOnPresenceChange;
  }
  public void setResetAgentScoreOnPresenceChange(Boolean resetAgentScoreOnPresenceChange) {
    this.resetAgentScoreOnPresenceChange = resetAgentScoreOnPresenceChange;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RoutingSettings routingSettings = (RoutingSettings) o;
    return Objects.equals(this.resetAgentScoreOnPresenceChange, routingSettings.resetAgentScoreOnPresenceChange);
  }

  @Override
  public int hashCode() {
    return Objects.hash(resetAgentScoreOnPresenceChange);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RoutingSettings {\n");
    
    sb.append("    resetAgentScoreOnPresenceChange: ").append(toIndentedString(resetAgentScoreOnPresenceChange)).append("\n");
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

