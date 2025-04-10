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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * AssignUsers
 */

public class AssignUsers  implements Serializable {
  
  private List<String> membersToAssign = null;
  private List<String> membersToRemove = null;

  public AssignUsers() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      membersToAssign = new ArrayList<String>();
      membersToRemove = new ArrayList<String>();
    }
  }

  
  /**
   * List of user ids to assign to a performance profile
   **/
  public AssignUsers membersToAssign(List<String> membersToAssign) {
    this.membersToAssign = membersToAssign;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "List of user ids to assign to a performance profile")
  @JsonProperty("membersToAssign")
  public List<String> getMembersToAssign() {
    return membersToAssign;
  }
  public void setMembersToAssign(List<String> membersToAssign) {
    this.membersToAssign = membersToAssign;
  }


  /**
   * List of user ids to remove from a performance profile
   **/
  public AssignUsers membersToRemove(List<String> membersToRemove) {
    this.membersToRemove = membersToRemove;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "List of user ids to remove from a performance profile")
  @JsonProperty("membersToRemove")
  public List<String> getMembersToRemove() {
    return membersToRemove;
  }
  public void setMembersToRemove(List<String> membersToRemove) {
    this.membersToRemove = membersToRemove;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AssignUsers assignUsers = (AssignUsers) o;

    return Objects.equals(this.membersToAssign, assignUsers.membersToAssign) &&
            Objects.equals(this.membersToRemove, assignUsers.membersToRemove);
  }

  @Override
  public int hashCode() {
    return Objects.hash(membersToAssign, membersToRemove);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssignUsers {\n");
    
    sb.append("    membersToAssign: ").append(toIndentedString(membersToAssign)).append("\n");
    sb.append("    membersToRemove: ").append(toIndentedString(membersToRemove)).append("\n");
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

