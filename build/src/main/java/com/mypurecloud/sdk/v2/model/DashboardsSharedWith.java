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
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * DashboardsSharedWith
 */

public class DashboardsSharedWith  implements Serializable {
  
  private List<String> userIds = new ArrayList<String>();
  private List<String> teamIds = new ArrayList<String>();

  
  /**
   * The list of user ids to share the dashboard with
   **/
  public DashboardsSharedWith userIds(List<String> userIds) {
    this.userIds = userIds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The list of user ids to share the dashboard with")
  @JsonProperty("userIds")
  public List<String> getUserIds() {
    return userIds;
  }
  public void setUserIds(List<String> userIds) {
    this.userIds = userIds;
  }


  /**
   * The list of team ids to share the dashboard with
   **/
  public DashboardsSharedWith teamIds(List<String> teamIds) {
    this.teamIds = teamIds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The list of team ids to share the dashboard with")
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
    DashboardsSharedWith dashboardsSharedWith = (DashboardsSharedWith) o;

    return Objects.equals(this.userIds, dashboardsSharedWith.userIds) &&
            Objects.equals(this.teamIds, dashboardsSharedWith.teamIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userIds, teamIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DashboardsSharedWith {\n");
    
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

