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
 * TeamMembers
 */

public class TeamMembers  implements Serializable {
  
  private List<String> memberIds = null;

  public TeamMembers() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      memberIds = new ArrayList<String>();
    }
  }

  
  /**
   * A list of the ids of the members to add or remove
   **/
  public TeamMembers memberIds(List<String> memberIds) {
    this.memberIds = memberIds;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "A list of the ids of the members to add or remove")
  @JsonProperty("memberIds")
  public List<String> getMemberIds() {
    return memberIds;
  }
  public void setMemberIds(List<String> memberIds) {
    this.memberIds = memberIds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TeamMembers teamMembers = (TeamMembers) o;

    return Objects.equals(this.memberIds, teamMembers.memberIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(memberIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TeamMembers {\n");
    
    sb.append("    memberIds: ").append(toIndentedString(memberIds)).append("\n");
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

