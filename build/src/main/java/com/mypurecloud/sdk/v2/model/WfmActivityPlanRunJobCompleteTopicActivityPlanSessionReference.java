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
 * WfmActivityPlanRunJobCompleteTopicActivityPlanSessionReference
 */

public class WfmActivityPlanRunJobCompleteTopicActivityPlanSessionReference  implements Serializable {
  
  private String id = null;
  private List<String> users = null;

  public WfmActivityPlanRunJobCompleteTopicActivityPlanSessionReference() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      users = new ArrayList<String>();
    }
  }

  
  /**
   **/
  public WfmActivityPlanRunJobCompleteTopicActivityPlanSessionReference id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }


  /**
   **/
  public WfmActivityPlanRunJobCompleteTopicActivityPlanSessionReference users(List<String> users) {
    this.users = users;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("users")
  public List<String> getUsers() {
    return users;
  }
  public void setUsers(List<String> users) {
    this.users = users;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WfmActivityPlanRunJobCompleteTopicActivityPlanSessionReference wfmActivityPlanRunJobCompleteTopicActivityPlanSessionReference = (WfmActivityPlanRunJobCompleteTopicActivityPlanSessionReference) o;

    return Objects.equals(this.id, wfmActivityPlanRunJobCompleteTopicActivityPlanSessionReference.id) &&
            Objects.equals(this.users, wfmActivityPlanRunJobCompleteTopicActivityPlanSessionReference.users);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, users);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WfmActivityPlanRunJobCompleteTopicActivityPlanSessionReference {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    users: ").append(toIndentedString(users)).append("\n");
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

