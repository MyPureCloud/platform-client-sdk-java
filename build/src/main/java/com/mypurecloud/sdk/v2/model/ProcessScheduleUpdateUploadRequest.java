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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * ProcessScheduleUpdateUploadRequest
 */

public class ProcessScheduleUpdateUploadRequest  implements Serializable {
  
  private String uploadKey = null;
  private List<String> teamIds = new ArrayList<String>();
  private List<String> managementUnitIdsForAddedTeamUsers = new ArrayList<String>();

  
  /**
   * The uploadKey provided by the request to get an upload URL
   **/
  public ProcessScheduleUpdateUploadRequest uploadKey(String uploadKey) {
    this.uploadKey = uploadKey;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The uploadKey provided by the request to get an upload URL")
  @JsonProperty("uploadKey")
  public String getUploadKey() {
    return uploadKey;
  }
  public void setUploadKey(String uploadKey) {
    this.uploadKey = uploadKey;
  }

  
  /**
   * The list of teams to which the users being modified belong. Only required if the requesting user has conditional permission to wfm:schedule:edit
   **/
  public ProcessScheduleUpdateUploadRequest teamIds(List<String> teamIds) {
    this.teamIds = teamIds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The list of teams to which the users being modified belong. Only required if the requesting user has conditional permission to wfm:schedule:edit")
  @JsonProperty("teamIds")
  public List<String> getTeamIds() {
    return teamIds;
  }
  public void setTeamIds(List<String> teamIds) {
    this.teamIds = teamIds;
  }

  
  /**
   * The set of muIds to which agents belong if agents are being newly added to the schedule, if the requesting user has conditional permission to wfm:schedule:edit
   **/
  public ProcessScheduleUpdateUploadRequest managementUnitIdsForAddedTeamUsers(List<String> managementUnitIdsForAddedTeamUsers) {
    this.managementUnitIdsForAddedTeamUsers = managementUnitIdsForAddedTeamUsers;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The set of muIds to which agents belong if agents are being newly added to the schedule, if the requesting user has conditional permission to wfm:schedule:edit")
  @JsonProperty("managementUnitIdsForAddedTeamUsers")
  public List<String> getManagementUnitIdsForAddedTeamUsers() {
    return managementUnitIdsForAddedTeamUsers;
  }
  public void setManagementUnitIdsForAddedTeamUsers(List<String> managementUnitIdsForAddedTeamUsers) {
    this.managementUnitIdsForAddedTeamUsers = managementUnitIdsForAddedTeamUsers;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProcessScheduleUpdateUploadRequest processScheduleUpdateUploadRequest = (ProcessScheduleUpdateUploadRequest) o;
    return Objects.equals(this.uploadKey, processScheduleUpdateUploadRequest.uploadKey) &&
        Objects.equals(this.teamIds, processScheduleUpdateUploadRequest.teamIds) &&
        Objects.equals(this.managementUnitIdsForAddedTeamUsers, processScheduleUpdateUploadRequest.managementUnitIdsForAddedTeamUsers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uploadKey, teamIds, managementUnitIdsForAddedTeamUsers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProcessScheduleUpdateUploadRequest {\n");
    
    sb.append("    uploadKey: ").append(toIndentedString(uploadKey)).append("\n");
    sb.append("    teamIds: ").append(toIndentedString(teamIds)).append("\n");
    sb.append("    managementUnitIdsForAddedTeamUsers: ").append(toIndentedString(managementUnitIdsForAddedTeamUsers)).append("\n");
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

