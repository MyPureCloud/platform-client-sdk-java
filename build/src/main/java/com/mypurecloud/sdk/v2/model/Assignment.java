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
import com.mypurecloud.sdk.v2.model.AssignmentError;
import com.mypurecloud.sdk.v2.model.UserReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * Assignment
 */

public class Assignment  implements Serializable {
  
  private List<UserReference> assignedMembers = null;
  private List<UserReference> removedMembers = null;
  private List<AssignmentError> assignmentErrors = null;

  
  /**
   * The list of users successfully assigned to the custom performance profile
   **/
  public Assignment assignedMembers(List<UserReference> assignedMembers) {
    this.assignedMembers = assignedMembers;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The list of users successfully assigned to the custom performance profile")
  @JsonProperty("assignedMembers")
  public List<UserReference> getAssignedMembers() {
    return assignedMembers;
  }
  public void setAssignedMembers(List<UserReference> assignedMembers) {
    this.assignedMembers = assignedMembers;
  }


  /**
   * The list of users successfully removed from the custom performance profile
   **/
  public Assignment removedMembers(List<UserReference> removedMembers) {
    this.removedMembers = removedMembers;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The list of users successfully removed from the custom performance profile")
  @JsonProperty("removedMembers")
  public List<UserReference> getRemovedMembers() {
    return removedMembers;
  }
  public void setRemovedMembers(List<UserReference> removedMembers) {
    this.removedMembers = removedMembers;
  }


  /**
   * The list of users failed assignment or removal for the custom performance profile
   **/
  public Assignment assignmentErrors(List<AssignmentError> assignmentErrors) {
    this.assignmentErrors = assignmentErrors;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The list of users failed assignment or removal for the custom performance profile")
  @JsonProperty("assignmentErrors")
  public List<AssignmentError> getAssignmentErrors() {
    return assignmentErrors;
  }
  public void setAssignmentErrors(List<AssignmentError> assignmentErrors) {
    this.assignmentErrors = assignmentErrors;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Assignment assignment = (Assignment) o;

    return Objects.equals(this.assignedMembers, assignment.assignedMembers) &&
            Objects.equals(this.removedMembers, assignment.removedMembers) &&
            Objects.equals(this.assignmentErrors, assignment.assignmentErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assignedMembers, removedMembers, assignmentErrors);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Assignment {\n");
    
    sb.append("    assignedMembers: ").append(toIndentedString(assignedMembers)).append("\n");
    sb.append("    removedMembers: ").append(toIndentedString(removedMembers)).append("\n");
    sb.append("    assignmentErrors: ").append(toIndentedString(assignmentErrors)).append("\n");
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

