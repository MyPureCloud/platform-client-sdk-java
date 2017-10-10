package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.mypurecloud.sdk.v2.model.AgentActivityNotificationPresencePresenceDefinition;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

import java.io.Serializable;
/**
 * AgentActivityNotificationPresence
 */

public class AgentActivityNotificationPresence  implements Serializable {
  
  private AgentActivityNotificationPresencePresenceDefinition presenceDefinition = null;
  private String presenceMessage = null;
  private Date modifiedDate = null;

  
  /**
   **/
  public AgentActivityNotificationPresence presenceDefinition(AgentActivityNotificationPresencePresenceDefinition presenceDefinition) {
    this.presenceDefinition = presenceDefinition;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("presenceDefinition")
  public AgentActivityNotificationPresencePresenceDefinition getPresenceDefinition() {
    return presenceDefinition;
  }
  public void setPresenceDefinition(AgentActivityNotificationPresencePresenceDefinition presenceDefinition) {
    this.presenceDefinition = presenceDefinition;
  }

  
  /**
   **/
  public AgentActivityNotificationPresence presenceMessage(String presenceMessage) {
    this.presenceMessage = presenceMessage;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("presenceMessage")
  public String getPresenceMessage() {
    return presenceMessage;
  }
  public void setPresenceMessage(String presenceMessage) {
    this.presenceMessage = presenceMessage;
  }

  
  /**
   **/
  public AgentActivityNotificationPresence modifiedDate(Date modifiedDate) {
    this.modifiedDate = modifiedDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("modifiedDate")
  public Date getModifiedDate() {
    return modifiedDate;
  }
  public void setModifiedDate(Date modifiedDate) {
    this.modifiedDate = modifiedDate;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AgentActivityNotificationPresence agentActivityNotificationPresence = (AgentActivityNotificationPresence) o;
    return Objects.equals(this.presenceDefinition, agentActivityNotificationPresence.presenceDefinition) &&
        Objects.equals(this.presenceMessage, agentActivityNotificationPresence.presenceMessage) &&
        Objects.equals(this.modifiedDate, agentActivityNotificationPresence.modifiedDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(presenceDefinition, presenceMessage, modifiedDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AgentActivityNotificationPresence {\n");
    
    sb.append("    presenceDefinition: ").append(toIndentedString(presenceDefinition)).append("\n");
    sb.append("    presenceMessage: ").append(toIndentedString(presenceMessage)).append("\n");
    sb.append("    modifiedDate: ").append(toIndentedString(modifiedDate)).append("\n");
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

