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
import java.time.LocalDate;

import java.io.Serializable;
/**
 * UserStaffingGroupResponse
 */

public class UserStaffingGroupResponse  implements Serializable {
  
  private LocalDate startDate = null;
  private LocalDate endDate = null;
  private UserReference user = null;
  private StaffingGroupReference staffingGroup = null;

  public UserStaffingGroupResponse() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  public UserStaffingGroupResponse(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
    }
  }

  
  /**
   * Effective start date of the user assignment in ISO-8601 format or empty value. Empty value means no limit on start-date.
   **/
  public UserStaffingGroupResponse startDate(LocalDate startDate) {
    this.startDate = startDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Effective start date of the user assignment in ISO-8601 format or empty value. Empty value means no limit on start-date.")
  @JsonProperty("startDate")
  public LocalDate getStartDate() {
    return startDate;
  }
  public void setStartDate(LocalDate startDate) {
    this.startDate = startDate;
  }


  /**
   * Effective end date of the user assignment in ISO-8601 format or empty value. Empty value means no limit on end-date.
   **/
  public UserStaffingGroupResponse endDate(LocalDate endDate) {
    this.endDate = endDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Effective end date of the user assignment in ISO-8601 format or empty value. Empty value means no limit on end-date.")
  @JsonProperty("endDate")
  public LocalDate getEndDate() {
    return endDate;
  }
  public void setEndDate(LocalDate endDate) {
    this.endDate = endDate;
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
   * The staffing group associated with the user
   **/
  public UserStaffingGroupResponse staffingGroup(StaffingGroupReference staffingGroup) {
    this.staffingGroup = staffingGroup;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The staffing group associated with the user")
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

    return Objects.equals(this.startDate, userStaffingGroupResponse.startDate) &&
            Objects.equals(this.endDate, userStaffingGroupResponse.endDate) &&
            Objects.equals(this.user, userStaffingGroupResponse.user) &&
            Objects.equals(this.staffingGroup, userStaffingGroupResponse.staffingGroup);
  }

  @Override
  public int hashCode() {
    return Objects.hash(startDate, endDate, user, staffingGroup);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserStaffingGroupResponse {\n");
    
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
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

