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
import com.mypurecloud.sdk.v2.model.AssignmentEffectiveDateRange;
import com.mypurecloud.sdk.v2.model.UserReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.List;

import java.io.Serializable;
/**
 * UserAssignmentsResponse
 */

public class UserAssignmentsResponse  implements Serializable {
  
  private UserReference user = null;
  private List<AssignmentEffectiveDateRange> assignments = null;

  public UserAssignmentsResponse() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      assignments = new ArrayList<AssignmentEffectiveDateRange>();
    }
  }

  public UserAssignmentsResponse(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
      assignments = new ArrayList<AssignmentEffectiveDateRange>();
    }
  }

  
  /**
   * User assigned to the staffing group.
   **/
  public UserAssignmentsResponse user(UserReference user) {
    this.user = user;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "User assigned to the staffing group.")
  @JsonProperty("user")
  public UserReference getUser() {
    return user;
  }
  public void setUser(UserReference user) {
    this.user = user;
  }


  /**
   * Date pairs representing the assignments for the user.
   **/
  public UserAssignmentsResponse assignments(List<AssignmentEffectiveDateRange> assignments) {
    this.assignments = assignments;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Date pairs representing the assignments for the user.")
  @JsonProperty("assignments")
  public List<AssignmentEffectiveDateRange> getAssignments() {
    return assignments;
  }
  public void setAssignments(List<AssignmentEffectiveDateRange> assignments) {
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
    UserAssignmentsResponse userAssignmentsResponse = (UserAssignmentsResponse) o;

    return Objects.equals(this.user, userAssignmentsResponse.user) &&
            Objects.equals(this.assignments, userAssignmentsResponse.assignments);
  }

  @Override
  public int hashCode() {
    return Objects.hash(user, assignments);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserAssignmentsResponse {\n");
    
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
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

