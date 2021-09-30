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
import com.mypurecloud.sdk.v2.model.DomainEntityRef;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * QueueUtilizationDiagnostic
 */

public class QueueUtilizationDiagnostic  implements Serializable {
  
  private DomainEntityRef queue = null;
  private Integer usersInQueue = null;
  private Integer activeUsersInQueue = null;
  private Integer usersOnQueue = null;
  private Integer usersNotUtilized = null;
  private Integer usersOnQueueWithStation = null;
  private Integer usersOnACampaignCall = null;
  private Integer usersOnDifferentEdgeGroup = null;
  private Integer usersOnANonCampaignCall = null;

  
  @ApiModelProperty(example = "null", value = "Identifier of the queue")
  @JsonProperty("queue")
  public DomainEntityRef getQueue() {
    return queue;
  }

  
  @ApiModelProperty(example = "null", value = "The number of users joined to the queue")
  @JsonProperty("usersInQueue")
  public Integer getUsersInQueue() {
    return usersInQueue;
  }

  
  @ApiModelProperty(example = "null", value = "The number of users active on the queue")
  @JsonProperty("activeUsersInQueue")
  public Integer getActiveUsersInQueue() {
    return activeUsersInQueue;
  }

  
  @ApiModelProperty(example = "null", value = "The number of users with a status of on-queue")
  @JsonProperty("usersOnQueue")
  public Integer getUsersOnQueue() {
    return usersOnQueue;
  }

  
  @ApiModelProperty(example = "null", value = "The number of users in the queue currently not engaged")
  @JsonProperty("usersNotUtilized")
  public Integer getUsersNotUtilized() {
    return usersNotUtilized;
  }

  
  @ApiModelProperty(example = "null", value = "The number of users in the queue with a station")
  @JsonProperty("usersOnQueueWithStation")
  public Integer getUsersOnQueueWithStation() {
    return usersOnQueueWithStation;
  }

  
  @ApiModelProperty(example = "null", value = "The number of users currently engaged in a campaign call")
  @JsonProperty("usersOnACampaignCall")
  public Integer getUsersOnACampaignCall() {
    return usersOnACampaignCall;
  }

  
  @ApiModelProperty(example = "null", value = "The number of users whose station is homed to an edge different from the campaign")
  @JsonProperty("usersOnDifferentEdgeGroup")
  public Integer getUsersOnDifferentEdgeGroup() {
    return usersOnDifferentEdgeGroup;
  }

  
  @ApiModelProperty(example = "null", value = "The number of users currently engaged in a communication that is not part of the campaign")
  @JsonProperty("usersOnANonCampaignCall")
  public Integer getUsersOnANonCampaignCall() {
    return usersOnANonCampaignCall;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QueueUtilizationDiagnostic queueUtilizationDiagnostic = (QueueUtilizationDiagnostic) o;
    return Objects.equals(this.queue, queueUtilizationDiagnostic.queue) &&
        Objects.equals(this.usersInQueue, queueUtilizationDiagnostic.usersInQueue) &&
        Objects.equals(this.activeUsersInQueue, queueUtilizationDiagnostic.activeUsersInQueue) &&
        Objects.equals(this.usersOnQueue, queueUtilizationDiagnostic.usersOnQueue) &&
        Objects.equals(this.usersNotUtilized, queueUtilizationDiagnostic.usersNotUtilized) &&
        Objects.equals(this.usersOnQueueWithStation, queueUtilizationDiagnostic.usersOnQueueWithStation) &&
        Objects.equals(this.usersOnACampaignCall, queueUtilizationDiagnostic.usersOnACampaignCall) &&
        Objects.equals(this.usersOnDifferentEdgeGroup, queueUtilizationDiagnostic.usersOnDifferentEdgeGroup) &&
        Objects.equals(this.usersOnANonCampaignCall, queueUtilizationDiagnostic.usersOnANonCampaignCall);
  }

  @Override
  public int hashCode() {
    return Objects.hash(queue, usersInQueue, activeUsersInQueue, usersOnQueue, usersNotUtilized, usersOnQueueWithStation, usersOnACampaignCall, usersOnDifferentEdgeGroup, usersOnANonCampaignCall);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueueUtilizationDiagnostic {\n");
    
    sb.append("    queue: ").append(toIndentedString(queue)).append("\n");
    sb.append("    usersInQueue: ").append(toIndentedString(usersInQueue)).append("\n");
    sb.append("    activeUsersInQueue: ").append(toIndentedString(activeUsersInQueue)).append("\n");
    sb.append("    usersOnQueue: ").append(toIndentedString(usersOnQueue)).append("\n");
    sb.append("    usersNotUtilized: ").append(toIndentedString(usersNotUtilized)).append("\n");
    sb.append("    usersOnQueueWithStation: ").append(toIndentedString(usersOnQueueWithStation)).append("\n");
    sb.append("    usersOnACampaignCall: ").append(toIndentedString(usersOnACampaignCall)).append("\n");
    sb.append("    usersOnDifferentEdgeGroup: ").append(toIndentedString(usersOnDifferentEdgeGroup)).append("\n");
    sb.append("    usersOnANonCampaignCall: ").append(toIndentedString(usersOnANonCampaignCall)).append("\n");
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

