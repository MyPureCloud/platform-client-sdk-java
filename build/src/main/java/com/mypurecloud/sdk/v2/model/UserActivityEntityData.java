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
import java.util.Date;

import java.io.Serializable;
/**
 * UserActivityEntityData
 */

public class UserActivityEntityData  implements Serializable {
  
  private Date activityDate = null;
  private String organizationPresenceId = null;
  private Date presenceDate = null;
  private String queueId = null;
  private String queueMembershipStatus = null;
  private String routingStatus = null;
  private Date routingStatusDate = null;
  private String systemPresence = null;
  private String teamId = null;
  private String userId = null;

  
  /**
   * The time at which the activity was observed. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public UserActivityEntityData activityDate(Date activityDate) {
    this.activityDate = activityDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The time at which the activity was observed. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("activityDate")
  public Date getActivityDate() {
    return activityDate;
  }
  public void setActivityDate(Date activityDate) {
    this.activityDate = activityDate;
  }


  /**
   * Organization presence identifier
   **/
  public UserActivityEntityData organizationPresenceId(String organizationPresenceId) {
    this.organizationPresenceId = organizationPresenceId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Organization presence identifier")
  @JsonProperty("organizationPresenceId")
  public String getOrganizationPresenceId() {
    return organizationPresenceId;
  }
  public void setOrganizationPresenceId(String organizationPresenceId) {
    this.organizationPresenceId = organizationPresenceId;
  }


  /**
   * Date of the latest presence change. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public UserActivityEntityData presenceDate(Date presenceDate) {
    this.presenceDate = presenceDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Date of the latest presence change. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("presenceDate")
  public Date getPresenceDate() {
    return presenceDate;
  }
  public void setPresenceDate(Date presenceDate) {
    this.presenceDate = presenceDate;
  }


  /**
   * Queue identifier
   **/
  public UserActivityEntityData queueId(String queueId) {
    this.queueId = queueId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Queue identifier")
  @JsonProperty("queueId")
  public String getQueueId() {
    return queueId;
  }
  public void setQueueId(String queueId) {
    this.queueId = queueId;
  }


  /**
   * Queue membership status (e.g. active or inactive)
   **/
  public UserActivityEntityData queueMembershipStatus(String queueMembershipStatus) {
    this.queueMembershipStatus = queueMembershipStatus;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Queue membership status (e.g. active or inactive)")
  @JsonProperty("queueMembershipStatus")
  public String getQueueMembershipStatus() {
    return queueMembershipStatus;
  }
  public void setQueueMembershipStatus(String queueMembershipStatus) {
    this.queueMembershipStatus = queueMembershipStatus;
  }


  /**
   * Agent routing status
   **/
  public UserActivityEntityData routingStatus(String routingStatus) {
    this.routingStatus = routingStatus;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Agent routing status")
  @JsonProperty("routingStatus")
  public String getRoutingStatus() {
    return routingStatus;
  }
  public void setRoutingStatus(String routingStatus) {
    this.routingStatus = routingStatus;
  }


  /**
   * Date of the latest routing status change. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public UserActivityEntityData routingStatusDate(Date routingStatusDate) {
    this.routingStatusDate = routingStatusDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Date of the latest routing status change. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("routingStatusDate")
  public Date getRoutingStatusDate() {
    return routingStatusDate;
  }
  public void setRoutingStatusDate(Date routingStatusDate) {
    this.routingStatusDate = routingStatusDate;
  }


  /**
   * System presence
   **/
  public UserActivityEntityData systemPresence(String systemPresence) {
    this.systemPresence = systemPresence;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "System presence")
  @JsonProperty("systemPresence")
  public String getSystemPresence() {
    return systemPresence;
  }
  public void setSystemPresence(String systemPresence) {
    this.systemPresence = systemPresence;
  }


  /**
   * The team ID the user is a member of
   **/
  public UserActivityEntityData teamId(String teamId) {
    this.teamId = teamId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The team ID the user is a member of")
  @JsonProperty("teamId")
  public String getTeamId() {
    return teamId;
  }
  public void setTeamId(String teamId) {
    this.teamId = teamId;
  }


  /**
   * Unique identifier for the user
   **/
  public UserActivityEntityData userId(String userId) {
    this.userId = userId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Unique identifier for the user")
  @JsonProperty("userId")
  public String getUserId() {
    return userId;
  }
  public void setUserId(String userId) {
    this.userId = userId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserActivityEntityData userActivityEntityData = (UserActivityEntityData) o;

    return Objects.equals(this.activityDate, userActivityEntityData.activityDate) &&
            Objects.equals(this.organizationPresenceId, userActivityEntityData.organizationPresenceId) &&
            Objects.equals(this.presenceDate, userActivityEntityData.presenceDate) &&
            Objects.equals(this.queueId, userActivityEntityData.queueId) &&
            Objects.equals(this.queueMembershipStatus, userActivityEntityData.queueMembershipStatus) &&
            Objects.equals(this.routingStatus, userActivityEntityData.routingStatus) &&
            Objects.equals(this.routingStatusDate, userActivityEntityData.routingStatusDate) &&
            Objects.equals(this.systemPresence, userActivityEntityData.systemPresence) &&
            Objects.equals(this.teamId, userActivityEntityData.teamId) &&
            Objects.equals(this.userId, userActivityEntityData.userId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(activityDate, organizationPresenceId, presenceDate, queueId, queueMembershipStatus, routingStatus, routingStatusDate, systemPresence, teamId, userId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserActivityEntityData {\n");
    
    sb.append("    activityDate: ").append(toIndentedString(activityDate)).append("\n");
    sb.append("    organizationPresenceId: ").append(toIndentedString(organizationPresenceId)).append("\n");
    sb.append("    presenceDate: ").append(toIndentedString(presenceDate)).append("\n");
    sb.append("    queueId: ").append(toIndentedString(queueId)).append("\n");
    sb.append("    queueMembershipStatus: ").append(toIndentedString(queueMembershipStatus)).append("\n");
    sb.append("    routingStatus: ").append(toIndentedString(routingStatus)).append("\n");
    sb.append("    routingStatusDate: ").append(toIndentedString(routingStatusDate)).append("\n");
    sb.append("    systemPresence: ").append(toIndentedString(systemPresence)).append("\n");
    sb.append("    teamId: ").append(toIndentedString(teamId)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
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

