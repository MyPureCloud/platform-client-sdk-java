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
import com.mypurecloud.sdk.v2.model.SetWrapperString;
import com.mypurecloud.sdk.v2.model.WfmVersionedEntityMetadata;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * UpdateStaffingGroupRequest
 */

public class UpdateStaffingGroupRequest  implements Serializable {
  
  private String name = null;
  private SetWrapperString userIds = null;
  private SetWrapperString planningGroupIds = null;
  private WfmVersionedEntityMetadata metadata = null;

  public UpdateStaffingGroupRequest() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * The name of the staffing group
   **/
  public UpdateStaffingGroupRequest name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The name of the staffing group")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }


  /**
   * The set of user Ids to associate with the staffing group
   **/
  public UpdateStaffingGroupRequest userIds(SetWrapperString userIds) {
    this.userIds = userIds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The set of user Ids to associate with the staffing group")
  @JsonProperty("userIds")
  public SetWrapperString getUserIds() {
    return userIds;
  }
  public void setUserIds(SetWrapperString userIds) {
    this.userIds = userIds;
  }


  /**
   * The set of planning group Ids to associate with the staffing group
   **/
  public UpdateStaffingGroupRequest planningGroupIds(SetWrapperString planningGroupIds) {
    this.planningGroupIds = planningGroupIds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The set of planning group Ids to associate with the staffing group")
  @JsonProperty("planningGroupIds")
  public SetWrapperString getPlanningGroupIds() {
    return planningGroupIds;
  }
  public void setPlanningGroupIds(SetWrapperString planningGroupIds) {
    this.planningGroupIds = planningGroupIds;
  }


  /**
   * Version metadata for the staffing group
   **/
  public UpdateStaffingGroupRequest metadata(WfmVersionedEntityMetadata metadata) {
    this.metadata = metadata;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Version metadata for the staffing group")
  @JsonProperty("metadata")
  public WfmVersionedEntityMetadata getMetadata() {
    return metadata;
  }
  public void setMetadata(WfmVersionedEntityMetadata metadata) {
    this.metadata = metadata;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateStaffingGroupRequest updateStaffingGroupRequest = (UpdateStaffingGroupRequest) o;

    return Objects.equals(this.name, updateStaffingGroupRequest.name) &&
            Objects.equals(this.userIds, updateStaffingGroupRequest.userIds) &&
            Objects.equals(this.planningGroupIds, updateStaffingGroupRequest.planningGroupIds) &&
            Objects.equals(this.metadata, updateStaffingGroupRequest.metadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, userIds, planningGroupIds, metadata);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateStaffingGroupRequest {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    userIds: ").append(toIndentedString(userIds)).append("\n");
    sb.append("    planningGroupIds: ").append(toIndentedString(planningGroupIds)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
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

