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
 * TrustRequestCreate
 */

public class TrustRequestCreate  implements Serializable {
  
  private List<String> userIds = new ArrayList<String>();
  private List<String> groupIds = new ArrayList<String>();

  
  /**
   * The list of trustee users that are requesting access. If no users are specified, at least one group is required.
   **/
  public TrustRequestCreate userIds(List<String> userIds) {
    this.userIds = userIds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The list of trustee users that are requesting access. If no users are specified, at least one group is required.")
  @JsonProperty("userIds")
  public List<String> getUserIds() {
    return userIds;
  }
  public void setUserIds(List<String> userIds) {
    this.userIds = userIds;
  }

  
  /**
   * The list of trustee groups that are requesting access. If no groups are specified, at least one user is required.
   **/
  public TrustRequestCreate groupIds(List<String> groupIds) {
    this.groupIds = groupIds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The list of trustee groups that are requesting access. If no groups are specified, at least one user is required.")
  @JsonProperty("groupIds")
  public List<String> getGroupIds() {
    return groupIds;
  }
  public void setGroupIds(List<String> groupIds) {
    this.groupIds = groupIds;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TrustRequestCreate trustRequestCreate = (TrustRequestCreate) o;
    return Objects.equals(this.userIds, trustRequestCreate.userIds) &&
        Objects.equals(this.groupIds, trustRequestCreate.groupIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userIds, groupIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TrustRequestCreate {\n");
    
    sb.append("    userIds: ").append(toIndentedString(userIds)).append("\n");
    sb.append("    groupIds: ").append(toIndentedString(groupIds)).append("\n");
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

