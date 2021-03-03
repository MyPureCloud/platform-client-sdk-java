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
import com.mypurecloud.sdk.v2.model.AgentActivityChangedTopicOrganizationPresence;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

import java.io.Serializable;
/**
 * AgentActivityChangedTopicPresence
 */

public class AgentActivityChangedTopicPresence  implements Serializable {
  
  private AgentActivityChangedTopicOrganizationPresence presenceDefinition = null;
  private String presenceMessage = null;
  private Date modifiedDate = null;

  
  /**
   **/
  public AgentActivityChangedTopicPresence presenceDefinition(AgentActivityChangedTopicOrganizationPresence presenceDefinition) {
    this.presenceDefinition = presenceDefinition;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("presenceDefinition")
  public AgentActivityChangedTopicOrganizationPresence getPresenceDefinition() {
    return presenceDefinition;
  }
  public void setPresenceDefinition(AgentActivityChangedTopicOrganizationPresence presenceDefinition) {
    this.presenceDefinition = presenceDefinition;
  }

  
  /**
   **/
  public AgentActivityChangedTopicPresence presenceMessage(String presenceMessage) {
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
  public AgentActivityChangedTopicPresence modifiedDate(Date modifiedDate) {
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
    AgentActivityChangedTopicPresence agentActivityChangedTopicPresence = (AgentActivityChangedTopicPresence) o;
    return Objects.equals(this.presenceDefinition, agentActivityChangedTopicPresence.presenceDefinition) &&
        Objects.equals(this.presenceMessage, agentActivityChangedTopicPresence.presenceMessage) &&
        Objects.equals(this.modifiedDate, agentActivityChangedTopicPresence.modifiedDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(presenceDefinition, presenceMessage, modifiedDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AgentActivityChangedTopicPresence {\n");
    
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

