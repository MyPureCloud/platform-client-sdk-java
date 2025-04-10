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
import com.mypurecloud.sdk.v2.model.InvalidAssignment;
import com.mypurecloud.sdk.v2.model.OtherProfileAssignment;
import com.mypurecloud.sdk.v2.model.UserReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * AssignmentValidation
 */

public class AssignmentValidation  implements Serializable {
  
  private List<UserReference> membersNotAssigned = null;
  private List<UserReference> membersAlreadyAssigned = null;
  private List<OtherProfileAssignment> membersAlreadyAssignedToOther = null;
  private List<InvalidAssignment> invalidMemberAssignments = null;

  public AssignmentValidation() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      membersNotAssigned = new ArrayList<UserReference>();
      membersAlreadyAssigned = new ArrayList<UserReference>();
      membersAlreadyAssignedToOther = new ArrayList<OtherProfileAssignment>();
      invalidMemberAssignments = new ArrayList<InvalidAssignment>();
    }
  }

  
  /**
   * The list of users that are not assigned to any custom performance profile
   **/
  public AssignmentValidation membersNotAssigned(List<UserReference> membersNotAssigned) {
    this.membersNotAssigned = membersNotAssigned;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The list of users that are not assigned to any custom performance profile")
  @JsonProperty("membersNotAssigned")
  public List<UserReference> getMembersNotAssigned() {
    return membersNotAssigned;
  }
  public void setMembersNotAssigned(List<UserReference> membersNotAssigned) {
    this.membersNotAssigned = membersNotAssigned;
  }


  /**
   * The list of users that are already assigned to the requesting custom performance profile
   **/
  public AssignmentValidation membersAlreadyAssigned(List<UserReference> membersAlreadyAssigned) {
    this.membersAlreadyAssigned = membersAlreadyAssigned;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The list of users that are already assigned to the requesting custom performance profile")
  @JsonProperty("membersAlreadyAssigned")
  public List<UserReference> getMembersAlreadyAssigned() {
    return membersAlreadyAssigned;
  }
  public void setMembersAlreadyAssigned(List<UserReference> membersAlreadyAssigned) {
    this.membersAlreadyAssigned = membersAlreadyAssigned;
  }


  /**
   * The list of users that are already assigned to other custom performance profiles
   **/
  public AssignmentValidation membersAlreadyAssignedToOther(List<OtherProfileAssignment> membersAlreadyAssignedToOther) {
    this.membersAlreadyAssignedToOther = membersAlreadyAssignedToOther;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The list of users that are already assigned to other custom performance profiles")
  @JsonProperty("membersAlreadyAssignedToOther")
  public List<OtherProfileAssignment> getMembersAlreadyAssignedToOther() {
    return membersAlreadyAssignedToOther;
  }
  public void setMembersAlreadyAssignedToOther(List<OtherProfileAssignment> membersAlreadyAssignedToOther) {
    this.membersAlreadyAssignedToOther = membersAlreadyAssignedToOther;
  }


  /**
   * The list of user id that are invalid for the gamfication service to handle
   **/
  public AssignmentValidation invalidMemberAssignments(List<InvalidAssignment> invalidMemberAssignments) {
    this.invalidMemberAssignments = invalidMemberAssignments;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The list of user id that are invalid for the gamfication service to handle")
  @JsonProperty("invalidMemberAssignments")
  public List<InvalidAssignment> getInvalidMemberAssignments() {
    return invalidMemberAssignments;
  }
  public void setInvalidMemberAssignments(List<InvalidAssignment> invalidMemberAssignments) {
    this.invalidMemberAssignments = invalidMemberAssignments;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AssignmentValidation assignmentValidation = (AssignmentValidation) o;

    return Objects.equals(this.membersNotAssigned, assignmentValidation.membersNotAssigned) &&
            Objects.equals(this.membersAlreadyAssigned, assignmentValidation.membersAlreadyAssigned) &&
            Objects.equals(this.membersAlreadyAssignedToOther, assignmentValidation.membersAlreadyAssignedToOther) &&
            Objects.equals(this.invalidMemberAssignments, assignmentValidation.invalidMemberAssignments);
  }

  @Override
  public int hashCode() {
    return Objects.hash(membersNotAssigned, membersAlreadyAssigned, membersAlreadyAssignedToOther, invalidMemberAssignments);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssignmentValidation {\n");
    
    sb.append("    membersNotAssigned: ").append(toIndentedString(membersNotAssigned)).append("\n");
    sb.append("    membersAlreadyAssigned: ").append(toIndentedString(membersAlreadyAssigned)).append("\n");
    sb.append("    membersAlreadyAssignedToOther: ").append(toIndentedString(membersAlreadyAssignedToOther)).append("\n");
    sb.append("    invalidMemberAssignments: ").append(toIndentedString(invalidMemberAssignments)).append("\n");
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

