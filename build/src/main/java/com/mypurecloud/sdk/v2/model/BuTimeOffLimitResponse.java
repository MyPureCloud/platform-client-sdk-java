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
import com.mypurecloud.sdk.v2.model.StaffingGroupReference;
import com.mypurecloud.sdk.v2.model.WfmVersionedEntityMetadata;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * BuTimeOffLimitResponse
 */

public class BuTimeOffLimitResponse  implements Serializable {
  
  private String id = null;
  private StaffingGroupReference staffingGroup = null;
  private ManagementUnitReference managementUnit = null;
  private WfmVersionedEntityMetadata metadata = null;
  private String selfUri = null;

  public BuTimeOffLimitResponse() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }


  /**
   * The staffing group to which this time-off limit is associated. If managementUnit is set, then the staffing group belongs to that management unit.Otherwise, if managementUnit is not set, it is a business unit level staffing group.At least one of managementUnit and staffingGroup must be set
   **/
  public BuTimeOffLimitResponse staffingGroup(StaffingGroupReference staffingGroup) {
    this.staffingGroup = staffingGroup;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The staffing group to which this time-off limit is associated. If managementUnit is set, then the staffing group belongs to that management unit.Otherwise, if managementUnit is not set, it is a business unit level staffing group.At least one of managementUnit and staffingGroup must be set")
  @JsonProperty("staffingGroup")
  public StaffingGroupReference getStaffingGroup() {
    return staffingGroup;
  }
  public void setStaffingGroup(StaffingGroupReference staffingGroup) {
    this.staffingGroup = staffingGroup;
  }


  /**
   * The management unit to which this time-off limit is associated. If staffingGroup is set, then the limit is associated with that staffing group, which belongs to this management unit.At least one of managementUnit and staffingGroup must be set
   **/
  public BuTimeOffLimitResponse managementUnit(ManagementUnitReference managementUnit) {
    this.managementUnit = managementUnit;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The management unit to which this time-off limit is associated. If staffingGroup is set, then the limit is associated with that staffing group, which belongs to this management unit.At least one of managementUnit and staffingGroup must be set")
  @JsonProperty("managementUnit")
  public ManagementUnitReference getManagementUnit() {
    return managementUnit;
  }
  public void setManagementUnit(ManagementUnitReference managementUnit) {
    this.managementUnit = managementUnit;
  }


  /**
   * Version metadata for the time-off limit
   **/
  public BuTimeOffLimitResponse metadata(WfmVersionedEntityMetadata metadata) {
    this.metadata = metadata;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Version metadata for the time-off limit")
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
    BuTimeOffLimitResponse buTimeOffLimitResponse = (BuTimeOffLimitResponse) o;

    return Objects.equals(this.id, buTimeOffLimitResponse.id) &&
            Objects.equals(this.staffingGroup, buTimeOffLimitResponse.staffingGroup) &&
            Objects.equals(this.managementUnit, buTimeOffLimitResponse.managementUnit) &&
            Objects.equals(this.metadata, buTimeOffLimitResponse.metadata) &&
            Objects.equals(this.selfUri, buTimeOffLimitResponse.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, staffingGroup, managementUnit, metadata, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BuTimeOffLimitResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    staffingGroup: ").append(toIndentedString(staffingGroup)).append("\n");
    sb.append("    managementUnit: ").append(toIndentedString(managementUnit)).append("\n");
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

