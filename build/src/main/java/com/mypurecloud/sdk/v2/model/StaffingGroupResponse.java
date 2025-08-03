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
import com.mypurecloud.sdk.v2.model.ManagementUnitReference;
import com.mypurecloud.sdk.v2.model.PlanningGroupReference;
import com.mypurecloud.sdk.v2.model.UserReference;
import com.mypurecloud.sdk.v2.model.WfmVersionedEntityMetadata;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.List;

import java.io.Serializable;
/**
 * StaffingGroupResponse
 */

public class StaffingGroupResponse  implements Serializable {
  
  private String id = null;
  private String name = null;
  private List<UserReference> users = null;
  private ManagementUnitReference managementUnit = null;
  private List<PlanningGroupReference> planningGroups = null;
  private WfmVersionedEntityMetadata metadata = null;
  private String selfUri = null;

  public StaffingGroupResponse() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      users = new ArrayList<UserReference>();
      planningGroups = new ArrayList<PlanningGroupReference>();
    }
  }

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }


  /**
   * The name of the staffing group
   **/
  public StaffingGroupResponse name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The name of the staffing group")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }


  /**
   * The list of users that belong to the staffing group
   **/
  public StaffingGroupResponse users(List<UserReference> users) {
    this.users = users;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The list of users that belong to the staffing group")
  @JsonProperty("users")
  public List<UserReference> getUsers() {
    return users;
  }
  public void setUsers(List<UserReference> users) {
    this.users = users;
  }


  /**
   * The ID of the management unit to which the staffing group users belong. If undefined the staffing group can include users from the entire business unit
   **/
  public StaffingGroupResponse managementUnit(ManagementUnitReference managementUnit) {
    this.managementUnit = managementUnit;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The ID of the management unit to which the staffing group users belong. If undefined the staffing group can include users from the entire business unit")
  @JsonProperty("managementUnit")
  public ManagementUnitReference getManagementUnit() {
    return managementUnit;
  }
  public void setManagementUnit(ManagementUnitReference managementUnit) {
    this.managementUnit = managementUnit;
  }


  /**
   * The list of planning groups that are associated with the staffing group
   **/
  public StaffingGroupResponse planningGroups(List<PlanningGroupReference> planningGroups) {
    this.planningGroups = planningGroups;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The list of planning groups that are associated with the staffing group")
  @JsonProperty("planningGroups")
  public List<PlanningGroupReference> getPlanningGroups() {
    return planningGroups;
  }
  public void setPlanningGroups(List<PlanningGroupReference> planningGroups) {
    this.planningGroups = planningGroups;
  }


  /**
   * Version metadata for the staffing group
   **/
  public StaffingGroupResponse metadata(WfmVersionedEntityMetadata metadata) {
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


  @ApiModelProperty(example = "null", value = "The URI for this object")
  @JsonProperty("selfUri")
  public String getSelfUri() {
    return selfUri;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StaffingGroupResponse staffingGroupResponse = (StaffingGroupResponse) o;

    return Objects.equals(this.id, staffingGroupResponse.id) &&
            Objects.equals(this.name, staffingGroupResponse.name) &&
            Objects.equals(this.users, staffingGroupResponse.users) &&
            Objects.equals(this.managementUnit, staffingGroupResponse.managementUnit) &&
            Objects.equals(this.planningGroups, staffingGroupResponse.planningGroups) &&
            Objects.equals(this.metadata, staffingGroupResponse.metadata) &&
            Objects.equals(this.selfUri, staffingGroupResponse.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, users, managementUnit, planningGroups, metadata, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StaffingGroupResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    users: ").append(toIndentedString(users)).append("\n");
    sb.append("    managementUnit: ").append(toIndentedString(managementUnit)).append("\n");
    sb.append("    planningGroups: ").append(toIndentedString(planningGroups)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    selfUri: ").append(toIndentedString(selfUri)).append("\n");
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

