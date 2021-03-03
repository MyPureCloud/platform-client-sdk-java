package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import java.util.Objects;
import java.io.IOException;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * GroupMembersUpdate
 */

public class GroupMembersUpdate  implements Serializable {
  
  private List<String> memberIds = new ArrayList<String>();
  private Integer version = null;

  
  /**
   * A list of the ids of the members to add.
   **/
  public GroupMembersUpdate memberIds(List<String> memberIds) {
    this.memberIds = memberIds;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "A list of the ids of the members to add.")
  @JsonProperty("memberIds")
  public List<String> getMemberIds() {
    return memberIds;
  }
  public void setMemberIds(List<String> memberIds) {
    this.memberIds = memberIds;
  }

  
  /**
   * The current group version.
   **/
  public GroupMembersUpdate version(Integer version) {
    this.version = version;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The current group version.")
  @JsonProperty("version")
  public Integer getVersion() {
    return version;
  }
  public void setVersion(Integer version) {
    this.version = version;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GroupMembersUpdate groupMembersUpdate = (GroupMembersUpdate) o;
    return Objects.equals(this.memberIds, groupMembersUpdate.memberIds) &&
        Objects.equals(this.version, groupMembersUpdate.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(memberIds, version);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GroupMembersUpdate {\n");
    
    sb.append("    memberIds: ").append(toIndentedString(memberIds)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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

