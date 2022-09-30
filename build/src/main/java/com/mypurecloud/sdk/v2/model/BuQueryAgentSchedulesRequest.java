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
 * BuQueryAgentSchedulesRequest
 */

public class BuQueryAgentSchedulesRequest  implements Serializable {
  
  private String managementUnitId = null;
  private List<String> userIds = new ArrayList<String>();
  private List<String> teamIds = new ArrayList<String>();

  
  /**
   * The ID of the management unit to query
   **/
  public BuQueryAgentSchedulesRequest managementUnitId(String managementUnitId) {
    this.managementUnitId = managementUnitId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The ID of the management unit to query")
  @JsonProperty("managementUnitId")
  public String getManagementUnitId() {
    return managementUnitId;
  }
  public void setManagementUnitId(String managementUnitId) {
    this.managementUnitId = managementUnitId;
  }


  /**
   * The IDs of the users to query.  Omit to query all user schedules in the management unit. 
   **/
  public BuQueryAgentSchedulesRequest userIds(List<String> userIds) {
    this.userIds = userIds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The IDs of the users to query.  Omit to query all user schedules in the management unit. ")
  @JsonProperty("userIds")
  public List<String> getUserIds() {
    return userIds;
  }
  public void setUserIds(List<String> userIds) {
    this.userIds = userIds;
  }


  /**
   * The teamIds to request. If null or not set, results will be queried for requested users if applicable or otherwise all users in the management unit
   **/
  public BuQueryAgentSchedulesRequest teamIds(List<String> teamIds) {
    this.teamIds = teamIds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The teamIds to request. If null or not set, results will be queried for requested users if applicable or otherwise all users in the management unit")
  @JsonProperty("teamIds")
  public List<String> getTeamIds() {
    return teamIds;
  }
  public void setTeamIds(List<String> teamIds) {
    this.teamIds = teamIds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BuQueryAgentSchedulesRequest buQueryAgentSchedulesRequest = (BuQueryAgentSchedulesRequest) o;

    return Objects.equals(this.managementUnitId, buQueryAgentSchedulesRequest.managementUnitId) &&
            Objects.equals(this.userIds, buQueryAgentSchedulesRequest.userIds) &&
            Objects.equals(this.teamIds, buQueryAgentSchedulesRequest.teamIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(managementUnitId, userIds, teamIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BuQueryAgentSchedulesRequest {\n");
    
    sb.append("    managementUnitId: ").append(toIndentedString(managementUnitId)).append("\n");
    sb.append("    userIds: ").append(toIndentedString(userIds)).append("\n");
    sb.append("    teamIds: ").append(toIndentedString(teamIds)).append("\n");
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

