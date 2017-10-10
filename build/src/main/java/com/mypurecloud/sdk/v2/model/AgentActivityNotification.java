package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.mypurecloud.sdk.v2.model.AgentActivityNotificationOutOfOffice;
import com.mypurecloud.sdk.v2.model.AgentActivityNotificationPresence;
import com.mypurecloud.sdk.v2.model.AgentActivityNotificationRoutingStatus;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import java.io.Serializable;
/**
 * AgentActivityNotification
 */

public class AgentActivityNotification  implements Serializable {
  
  private String id = null;
  private AgentActivityNotificationRoutingStatus routingStatus = null;
  private AgentActivityNotificationPresence presence = null;
  private AgentActivityNotificationOutOfOffice outOfOffice = null;
  private List<String> activeQueueIds = new ArrayList<String>();
  private Date dateActiveQueuesChanged = null;

  
  /**
   **/
  public AgentActivityNotification id(String id) {
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
  public AgentActivityNotification routingStatus(AgentActivityNotificationRoutingStatus routingStatus) {
    this.routingStatus = routingStatus;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("routingStatus")
  public AgentActivityNotificationRoutingStatus getRoutingStatus() {
    return routingStatus;
  }
  public void setRoutingStatus(AgentActivityNotificationRoutingStatus routingStatus) {
    this.routingStatus = routingStatus;
  }

  
  /**
   **/
  public AgentActivityNotification presence(AgentActivityNotificationPresence presence) {
    this.presence = presence;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("presence")
  public AgentActivityNotificationPresence getPresence() {
    return presence;
  }
  public void setPresence(AgentActivityNotificationPresence presence) {
    this.presence = presence;
  }

  
  /**
   **/
  public AgentActivityNotification outOfOffice(AgentActivityNotificationOutOfOffice outOfOffice) {
    this.outOfOffice = outOfOffice;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("outOfOffice")
  public AgentActivityNotificationOutOfOffice getOutOfOffice() {
    return outOfOffice;
  }
  public void setOutOfOffice(AgentActivityNotificationOutOfOffice outOfOffice) {
    this.outOfOffice = outOfOffice;
  }

  
  /**
   **/
  public AgentActivityNotification activeQueueIds(List<String> activeQueueIds) {
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
  public AgentActivityNotification dateActiveQueuesChanged(Date dateActiveQueuesChanged) {
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
    AgentActivityNotification agentActivityNotification = (AgentActivityNotification) o;
    return Objects.equals(this.id, agentActivityNotification.id) &&
        Objects.equals(this.routingStatus, agentActivityNotification.routingStatus) &&
        Objects.equals(this.presence, agentActivityNotification.presence) &&
        Objects.equals(this.outOfOffice, agentActivityNotification.outOfOffice) &&
        Objects.equals(this.activeQueueIds, agentActivityNotification.activeQueueIds) &&
        Objects.equals(this.dateActiveQueuesChanged, agentActivityNotification.dateActiveQueuesChanged);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, routingStatus, presence, outOfOffice, activeQueueIds, dateActiveQueuesChanged);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AgentActivityNotification {\n");
    
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

