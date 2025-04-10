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
import com.mypurecloud.sdk.v2.model.UserReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * AgentWorkPlans
 */

public class AgentWorkPlans  implements Serializable {
  
  private UserReference user = null;
  private List<Integer> workPlanLookupKeysPerWeek = null;

  public AgentWorkPlans() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      workPlanLookupKeysPerWeek = new ArrayList<Integer>();
    }
  }

  
  /**
   * The user (agent) for whom the work plans were requested
   **/
  public AgentWorkPlans user(UserReference user) {
    this.user = user;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The user (agent) for whom the work plans were requested")
  @JsonProperty("user")
  public UserReference getUser() {
    return user;
  }
  public void setUser(UserReference user) {
    this.user = user;
  }


  /**
   * The list of weekly work plan lookup keys. Keys to be searched under workPlanLookup property at top level of result
   **/
  public AgentWorkPlans workPlanLookupKeysPerWeek(List<Integer> workPlanLookupKeysPerWeek) {
    this.workPlanLookupKeysPerWeek = workPlanLookupKeysPerWeek;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The list of weekly work plan lookup keys. Keys to be searched under workPlanLookup property at top level of result")
  @JsonProperty("workPlanLookupKeysPerWeek")
  public List<Integer> getWorkPlanLookupKeysPerWeek() {
    return workPlanLookupKeysPerWeek;
  }
  public void setWorkPlanLookupKeysPerWeek(List<Integer> workPlanLookupKeysPerWeek) {
    this.workPlanLookupKeysPerWeek = workPlanLookupKeysPerWeek;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AgentWorkPlans agentWorkPlans = (AgentWorkPlans) o;

    return Objects.equals(this.user, agentWorkPlans.user) &&
            Objects.equals(this.workPlanLookupKeysPerWeek, agentWorkPlans.workPlanLookupKeysPerWeek);
  }

  @Override
  public int hashCode() {
    return Objects.hash(user, workPlanLookupKeysPerWeek);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AgentWorkPlans {\n");
    
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    workPlanLookupKeysPerWeek: ").append(toIndentedString(workPlanLookupKeysPerWeek)).append("\n");
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

