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
import com.mypurecloud.sdk.v2.model.StaffingGroupReference;
import com.mypurecloud.sdk.v2.model.UserReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * UserStaffingGroupResponse
 */

public class UserStaffingGroupResponse  implements Serializable {
  
  private UserReference user = null;
  private StaffingGroupReference staffingGroup = null;

  public UserStaffingGroupResponse() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * The user associated with the staffing group
   **/
  public UserStaffingGroupResponse user(UserReference user) {
    this.user = user;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The user associated with the staffing group")
  @JsonProperty("user")
  public UserReference getUser() {
    return user;
  }
  public void setUser(UserReference user) {
    this.user = user;
  }


  /**
   * The staffing group
   **/
  public UserStaffingGroupResponse staffingGroup(StaffingGroupReference staffingGroup) {
    this.staffingGroup = staffingGroup;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The staffing group")
  @JsonProperty("staffingGroup")
  public StaffingGroupReference getStaffingGroup() {
    return staffingGroup;
  }
  public void setStaffingGroup(StaffingGroupReference staffingGroup) {
    this.staffingGroup = staffingGroup;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserStaffingGroupResponse userStaffingGroupResponse = (UserStaffingGroupResponse) o;

    return Objects.equals(this.user, userStaffingGroupResponse.user) &&
            Objects.equals(this.staffingGroup, userStaffingGroupResponse.staffingGroup);
  }

  @Override
  public int hashCode() {
    return Objects.hash(user, staffingGroup);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserStaffingGroupResponse {\n");
    
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    staffingGroup: ").append(toIndentedString(staffingGroup)).append("\n");
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

