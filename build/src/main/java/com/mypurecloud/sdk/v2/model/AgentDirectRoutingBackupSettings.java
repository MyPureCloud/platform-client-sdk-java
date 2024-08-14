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
import java.util.List;

import java.io.Serializable;
/**
 * AgentDirectRoutingBackupSettings
 */

public class AgentDirectRoutingBackupSettings  implements Serializable {
  
  private String queueId = null;
  private String userId = null;
  private Boolean waitForAgent = null;
  private Integer agentWaitSeconds = null;
  private List<String> backedUpUsers = new ArrayList<String>();

  
  /**
   * ID of queue to be used as backup. If queueId and userId are both specified, queue behaves as secondary backup.
   **/
  public AgentDirectRoutingBackupSettings queueId(String queueId) {
    this.queueId = queueId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "ID of queue to be used as backup. If queueId and userId are both specified, queue behaves as secondary backup.")
  @JsonProperty("queueId")
  public String getQueueId() {
    return queueId;
  }
  public void setQueueId(String queueId) {
    this.queueId = queueId;
  }


  /**
   * ID of user to be used as backup. If queueId and userId are both specified, user behaves as primary backup.
   **/
  public AgentDirectRoutingBackupSettings userId(String userId) {
    this.userId = userId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "ID of user to be used as backup. If queueId and userId are both specified, user behaves as primary backup.")
  @JsonProperty("userId")
  public String getUserId() {
    return userId;
  }
  public void setUserId(String userId) {
    this.userId = userId;
  }


  /**
   * Flag indicating if Direct Routing interactions should wait for Direct Routing agent or go immediately to selected backup.
   **/
  public AgentDirectRoutingBackupSettings waitForAgent(Boolean waitForAgent) {
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
  public AgentDirectRoutingBackupSettings agentWaitSeconds(Integer agentWaitSeconds) {
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


  @ApiModelProperty(example = "null", value = "Set of users that this user is a backup for.")
  @JsonProperty("backedUpUsers")
  public List<String> getBackedUpUsers() {
    return backedUpUsers;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AgentDirectRoutingBackupSettings agentDirectRoutingBackupSettings = (AgentDirectRoutingBackupSettings) o;

    return Objects.equals(this.queueId, agentDirectRoutingBackupSettings.queueId) &&
            Objects.equals(this.userId, agentDirectRoutingBackupSettings.userId) &&
            Objects.equals(this.waitForAgent, agentDirectRoutingBackupSettings.waitForAgent) &&
            Objects.equals(this.agentWaitSeconds, agentDirectRoutingBackupSettings.agentWaitSeconds) &&
            Objects.equals(this.backedUpUsers, agentDirectRoutingBackupSettings.backedUpUsers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(queueId, userId, waitForAgent, agentWaitSeconds, backedUpUsers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AgentDirectRoutingBackupSettings {\n");
    
    sb.append("    queueId: ").append(toIndentedString(queueId)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    waitForAgent: ").append(toIndentedString(waitForAgent)).append("\n");
    sb.append("    agentWaitSeconds: ").append(toIndentedString(agentWaitSeconds)).append("\n");
    sb.append("    backedUpUsers: ").append(toIndentedString(backedUpUsers)).append("\n");
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

