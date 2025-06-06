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
 * ValidateAssignUsers
 */

public class ValidateAssignUsers  implements Serializable {
  
  private List<String> membersToAssign = null;

  public ValidateAssignUsers() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      membersToAssign = new ArrayList<String>();
    }
  }

  
  /**
   * List of user ids to assign to a performance profile
   **/
  public ValidateAssignUsers membersToAssign(List<String> membersToAssign) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ValidateAssignUsers validateAssignUsers = (ValidateAssignUsers) o;

    return Objects.equals(this.membersToAssign, validateAssignUsers.membersToAssign);
  }

  @Override
  public int hashCode() {
    return Objects.hash(membersToAssign);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ValidateAssignUsers {\n");
    
    sb.append("    membersToAssign: ").append(toIndentedString(membersToAssign)).append("\n");
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

