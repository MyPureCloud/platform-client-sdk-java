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
import com.mypurecloud.sdk.v2.model.SetWrapperAssignmentEffectiveDateRange;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * UpdateUserAssignmentsRequest
 */

public class UpdateUserAssignmentsRequest  implements Serializable {
  
  private String userId = null;
  private SetWrapperAssignmentEffectiveDateRange assignments = null;

  public UpdateUserAssignmentsRequest() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * The ID of the user assigned to the staffing group.
   **/
  public UpdateUserAssignmentsRequest userId(String userId) {
    this.userId = userId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The ID of the user assigned to the staffing group.")
  @JsonProperty("userId")
  public String getUserId() {
    return userId;
  }
  public void setUserId(String userId) {
    this.userId = userId;
  }


  /**
   * Assignment effective date ranges for the user. Empty list removes all assignments.
   **/
  public UpdateUserAssignmentsRequest assignments(SetWrapperAssignmentEffectiveDateRange assignments) {
    this.assignments = assignments;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Assignment effective date ranges for the user. Empty list removes all assignments.")
  @JsonProperty("assignments")
  public SetWrapperAssignmentEffectiveDateRange getAssignments() {
    return assignments;
  }
  public void setAssignments(SetWrapperAssignmentEffectiveDateRange assignments) {
    this.assignments = assignments;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateUserAssignmentsRequest updateUserAssignmentsRequest = (UpdateUserAssignmentsRequest) o;

    return Objects.equals(this.userId, updateUserAssignmentsRequest.userId) &&
            Objects.equals(this.assignments, updateUserAssignmentsRequest.assignments);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userId, assignments);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateUserAssignmentsRequest {\n");
    
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    assignments: ").append(toIndentedString(assignments)).append("\n");
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

