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
import com.mypurecloud.sdk.v2.model.AgentActivityChangedTopicOutOfOffice;
import com.mypurecloud.sdk.v2.model.AgentActivityChangedTopicPresence;
import com.mypurecloud.sdk.v2.model.AgentActivityChangedTopicRoutingStatus;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import java.io.Serializable;
/**
 * AgentActivityChangedTopicAgentActivity
 */

public class AgentActivityChangedTopicAgentActivity  implements Serializable {
  
  private String id = null;
  private AgentActivityChangedTopicRoutingStatus routingStatus = null;
  private AgentActivityChangedTopicPresence presence = null;
  private AgentActivityChangedTopicOutOfOffice outOfOffice = null;
  private List<String> activeQueueIds = new ArrayList<String>();
  private Date dateActiveQueuesChanged = null;

  
  /**
   **/
  public AgentActivityChangedTopicAgentActivity id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  
  /**
   **/
  public AgentActivityChangedTopicAgentActivity routingStatus(AgentActivityChangedTopicRoutingStatus routingStatus) {
    this.routingStatus = routingStatus;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("routingStatus")
  public AgentActivityChangedTopicRoutingStatus getRoutingStatus() {
    return routingStatus;
  }
  public void setRoutingStatus(AgentActivityChangedTopicRoutingStatus routingStatus) {
    this.routingStatus = routingStatus;
  }

  
  /**
   **/
  public AgentActivityChangedTopicAgentActivity presence(AgentActivityChangedTopicPresence presence) {
    this.presence = presence;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("presence")
  public AgentActivityChangedTopicPresence getPresence() {
    return presence;
  }
  public void setPresence(AgentActivityChangedTopicPresence presence) {
    this.presence = presence;
  }

  
  /**
   **/
  public AgentActivityChangedTopicAgentActivity outOfOffice(AgentActivityChangedTopicOutOfOffice outOfOffice) {
    this.outOfOffice = outOfOffice;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("outOfOffice")
  public AgentActivityChangedTopicOutOfOffice getOutOfOffice() {
    return outOfOffice;
  }
  public void setOutOfOffice(AgentActivityChangedTopicOutOfOffice outOfOffice) {
    this.outOfOffice = outOfOffice;
  }

  
  /**
   **/
  public AgentActivityChangedTopicAgentActivity activeQueueIds(List<String> activeQueueIds) {
    this.activeQueueIds = activeQueueIds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("activeQueueIds")
  public List<String> getActiveQueueIds() {
    return activeQueueIds;
  }
  public void setActiveQueueIds(List<String> activeQueueIds) {
    this.activeQueueIds = activeQueueIds;
  }

  
  /**
   **/
  public AgentActivityChangedTopicAgentActivity dateActiveQueuesChanged(Date dateActiveQueuesChanged) {
    this.dateActiveQueuesChanged = dateActiveQueuesChanged;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("dateActiveQueuesChanged")
  public Date getDateActiveQueuesChanged() {
    return dateActiveQueuesChanged;
  }
  public void setDateActiveQueuesChanged(Date dateActiveQueuesChanged) {
    this.dateActiveQueuesChanged = dateActiveQueuesChanged;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AgentActivityChangedTopicAgentActivity agentActivityChangedTopicAgentActivity = (AgentActivityChangedTopicAgentActivity) o;
    return Objects.equals(this.id, agentActivityChangedTopicAgentActivity.id) &&
        Objects.equals(this.routingStatus, agentActivityChangedTopicAgentActivity.routingStatus) &&
        Objects.equals(this.presence, agentActivityChangedTopicAgentActivity.presence) &&
        Objects.equals(this.outOfOffice, agentActivityChangedTopicAgentActivity.outOfOffice) &&
        Objects.equals(this.activeQueueIds, agentActivityChangedTopicAgentActivity.activeQueueIds) &&
        Objects.equals(this.dateActiveQueuesChanged, agentActivityChangedTopicAgentActivity.dateActiveQueuesChanged);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, routingStatus, presence, outOfOffice, activeQueueIds, dateActiveQueuesChanged);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AgentActivityChangedTopicAgentActivity {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    routingStatus: ").append(toIndentedString(routingStatus)).append("\n");
    sb.append("    presence: ").append(toIndentedString(presence)).append("\n");
    sb.append("    outOfOffice: ").append(toIndentedString(outOfOffice)).append("\n");
    sb.append("    activeQueueIds: ").append(toIndentedString(activeQueueIds)).append("\n");
    sb.append("    dateActiveQueuesChanged: ").append(toIndentedString(dateActiveQueuesChanged)).append("\n");
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

