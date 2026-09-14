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
import com.mypurecloud.sdk.v2.model.UserActivityAdherencePresence;
import com.mypurecloud.sdk.v2.model.UserActivityOutOfOffice;
import com.mypurecloud.sdk.v2.model.UserActivityRoutingStatus;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import java.io.Serializable;
/**
 * UserActivity
 */

public class UserActivity  implements Serializable {
  
  private String id = null;
  private UserActivityRoutingStatus routingStatus = null;
  private UserActivityAdherencePresence presence = null;
  private UserActivityOutOfOffice outOfOffice = null;
  private List<String> activeQueueIds = null;
  private Date dateActiveQueuesChanged = null;

  public UserActivity() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      activeQueueIds = new ArrayList<String>();
    }
  }

  public UserActivity(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
      activeQueueIds = new ArrayList<String>();
    }
  }

  
  /**
   * The ID of the user
   **/
  public UserActivity id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The ID of the user")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }


  /**
   * The current routing status of the user
   **/
  public UserActivity routingStatus(UserActivityRoutingStatus routingStatus) {
    this.routingStatus = routingStatus;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The current routing status of the user")
  @JsonProperty("routingStatus")
  public UserActivityRoutingStatus getRoutingStatus() {
    return routingStatus;
  }
  public void setRoutingStatus(UserActivityRoutingStatus routingStatus) {
    this.routingStatus = routingStatus;
  }


  /**
   * The current system presence of the user
   **/
  public UserActivity presence(UserActivityAdherencePresence presence) {
    this.presence = presence;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The current system presence of the user")
  @JsonProperty("presence")
  public UserActivityAdherencePresence getPresence() {
    return presence;
  }
  public void setPresence(UserActivityAdherencePresence presence) {
    this.presence = presence;
  }


  /**
   * The current out of office state of the user
   **/
  public UserActivity outOfOffice(UserActivityOutOfOffice outOfOffice) {
    this.outOfOffice = outOfOffice;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The current out of office state of the user")
  @JsonProperty("outOfOffice")
  public UserActivityOutOfOffice getOutOfOffice() {
    return outOfOffice;
  }
  public void setOutOfOffice(UserActivityOutOfOffice outOfOffice) {
    this.outOfOffice = outOfOffice;
  }


  /**
   * The IDs of the queues for which the user is active
   **/
  public UserActivity activeQueueIds(List<String> activeQueueIds) {
    this.activeQueueIds = activeQueueIds;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The IDs of the queues for which the user is active")
  @JsonProperty("activeQueueIds")
  public List<String> getActiveQueueIds() {
    return activeQueueIds;
  }
  public void setActiveQueueIds(List<String> activeQueueIds) {
    this.activeQueueIds = activeQueueIds;
  }


  /**
   * The date the activeQueueIds list was last modified. For reference only - subject to eventual consistency. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public UserActivity dateActiveQueuesChanged(Date dateActiveQueuesChanged) {
    this.dateActiveQueuesChanged = dateActiveQueuesChanged;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The date the activeQueueIds list was last modified. For reference only - subject to eventual consistency. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
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
    UserActivity userActivity = (UserActivity) o;

    return Objects.equals(this.id, userActivity.id) &&
            Objects.equals(this.routingStatus, userActivity.routingStatus) &&
            Objects.equals(this.presence, userActivity.presence) &&
            Objects.equals(this.outOfOffice, userActivity.outOfOffice) &&
            Objects.equals(this.activeQueueIds, userActivity.activeQueueIds) &&
            Objects.equals(this.dateActiveQueuesChanged, userActivity.dateActiveQueuesChanged);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, routingStatus, presence, outOfOffice, activeQueueIds, dateActiveQueuesChanged);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserActivity {\n");
    
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

