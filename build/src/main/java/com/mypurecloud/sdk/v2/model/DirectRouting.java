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
import com.mypurecloud.sdk.v2.model.DirectRoutingMediaSettings;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * DirectRouting
 */

public class DirectRouting  implements Serializable {
  
  private DirectRoutingMediaSettings callMediaSettings = null;
  private DirectRoutingMediaSettings emailMediaSettings = null;
  private DirectRoutingMediaSettings messageMediaSettings = null;
  private String backupQueueId = null;
  private Boolean waitForAgent = null;
  private Integer agentWaitSeconds = null;

  
  /**
   * Direct Routing Settings specific to Call media.
   **/
  public DirectRouting callMediaSettings(DirectRoutingMediaSettings callMediaSettings) {
    this.callMediaSettings = callMediaSettings;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Direct Routing Settings specific to Call media.")
  @JsonProperty("callMediaSettings")
  public DirectRoutingMediaSettings getCallMediaSettings() {
    return callMediaSettings;
  }
  public void setCallMediaSettings(DirectRoutingMediaSettings callMediaSettings) {
    this.callMediaSettings = callMediaSettings;
  }


  /**
   * Direct Routing Settings specific to Email media.
   **/
  public DirectRouting emailMediaSettings(DirectRoutingMediaSettings emailMediaSettings) {
    this.emailMediaSettings = emailMediaSettings;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Direct Routing Settings specific to Email media.")
  @JsonProperty("emailMediaSettings")
  public DirectRoutingMediaSettings getEmailMediaSettings() {
    return emailMediaSettings;
  }
  public void setEmailMediaSettings(DirectRoutingMediaSettings emailMediaSettings) {
    this.emailMediaSettings = emailMediaSettings;
  }


  /**
   * Direct Routing Settings specific to Message media.
   **/
  public DirectRouting messageMediaSettings(DirectRoutingMediaSettings messageMediaSettings) {
    this.messageMediaSettings = messageMediaSettings;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Direct Routing Settings specific to Message media.")
  @JsonProperty("messageMediaSettings")
  public DirectRoutingMediaSettings getMessageMediaSettings() {
    return messageMediaSettings;
  }
  public void setMessageMediaSettings(DirectRoutingMediaSettings messageMediaSettings) {
    this.messageMediaSettings = messageMediaSettings;
  }


  /**
   * ID of another queue to be used as the default backup if an agent does not have their Backup Settings configured. If not set, the current queue will be used as backup, but with Direct Routing criteria removed from the conversation.
   **/
  public DirectRouting backupQueueId(String backupQueueId) {
    this.backupQueueId = backupQueueId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "ID of another queue to be used as the default backup if an agent does not have their Backup Settings configured. If not set, the current queue will be used as backup, but with Direct Routing criteria removed from the conversation.")
  @JsonProperty("backupQueueId")
  public String getBackupQueueId() {
    return backupQueueId;
  }
  public void setBackupQueueId(String backupQueueId) {
    this.backupQueueId = backupQueueId;
  }


  /**
   * Flag indicating if Direct Routing interactions should wait for Direct Routing agent or go immediately to selected backup.
   **/
  public DirectRouting waitForAgent(Boolean waitForAgent) {
    this.waitForAgent = waitForAgent;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Flag indicating if Direct Routing interactions should wait for Direct Routing agent or go immediately to selected backup.")
  @JsonProperty("waitForAgent")
  public Boolean getWaitForAgent() {
    return waitForAgent;
  }
  public void setWaitForAgent(Boolean waitForAgent) {
    this.waitForAgent = waitForAgent;
  }


  /**
   * Time (in seconds) that a Direct Routing interaction will wait for Direct Routing agent before going to selected backup. Valid range [60, 864000].
   **/
  public DirectRouting agentWaitSeconds(Integer agentWaitSeconds) {
    this.agentWaitSeconds = agentWaitSeconds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Time (in seconds) that a Direct Routing interaction will wait for Direct Routing agent before going to selected backup. Valid range [60, 864000].")
  @JsonProperty("agentWaitSeconds")
  public Integer getAgentWaitSeconds() {
    return agentWaitSeconds;
  }
  public void setAgentWaitSeconds(Integer agentWaitSeconds) {
    this.agentWaitSeconds = agentWaitSeconds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DirectRouting directRouting = (DirectRouting) o;

    return Objects.equals(this.callMediaSettings, directRouting.callMediaSettings) &&
            Objects.equals(this.emailMediaSettings, directRouting.emailMediaSettings) &&
            Objects.equals(this.messageMediaSettings, directRouting.messageMediaSettings) &&
            Objects.equals(this.backupQueueId, directRouting.backupQueueId) &&
            Objects.equals(this.waitForAgent, directRouting.waitForAgent) &&
            Objects.equals(this.agentWaitSeconds, directRouting.agentWaitSeconds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(callMediaSettings, emailMediaSettings, messageMediaSettings, backupQueueId, waitForAgent, agentWaitSeconds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DirectRouting {\n");
    
    sb.append("    callMediaSettings: ").append(toIndentedString(callMediaSettings)).append("\n");
    sb.append("    emailMediaSettings: ").append(toIndentedString(emailMediaSettings)).append("\n");
    sb.append("    messageMediaSettings: ").append(toIndentedString(messageMediaSettings)).append("\n");
    sb.append("    backupQueueId: ").append(toIndentedString(backupQueueId)).append("\n");
    sb.append("    waitForAgent: ").append(toIndentedString(waitForAgent)).append("\n");
    sb.append("    agentWaitSeconds: ").append(toIndentedString(agentWaitSeconds)).append("\n");
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

