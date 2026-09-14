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
import com.mypurecloud.sdk.v2.model.AgentSchedulingPreference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * UpdateAgentSchedulingPreferencesRequest
 */

public class UpdateAgentSchedulingPreferencesRequest  implements Serializable {
  
  private List<AgentSchedulingPreference> preferencesToAdd = null;
  private List<String> preferenceIdsToRemove = null;

  public UpdateAgentSchedulingPreferencesRequest() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      preferencesToAdd = new ArrayList<AgentSchedulingPreference>();
      preferenceIdsToRemove = new ArrayList<String>();
    }
  }

  public UpdateAgentSchedulingPreferencesRequest(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
      preferencesToAdd = new ArrayList<AgentSchedulingPreference>();
      preferenceIdsToRemove = new ArrayList<String>();
    }
  }

  
  /**
   * Scheduling preferences to add
   **/
  public UpdateAgentSchedulingPreferencesRequest preferencesToAdd(List<AgentSchedulingPreference> preferencesToAdd) {
    this.preferencesToAdd = preferencesToAdd;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Scheduling preferences to add")
  @JsonProperty("preferencesToAdd")
  public List<AgentSchedulingPreference> getPreferencesToAdd() {
    return preferencesToAdd;
  }
  public void setPreferencesToAdd(List<AgentSchedulingPreference> preferencesToAdd) {
    this.preferencesToAdd = preferencesToAdd;
  }


  /**
   * IDs of scheduling preferences to remove
   **/
  public UpdateAgentSchedulingPreferencesRequest preferenceIdsToRemove(List<String> preferenceIdsToRemove) {
    this.preferenceIdsToRemove = preferenceIdsToRemove;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "IDs of scheduling preferences to remove")
  @JsonProperty("preferenceIdsToRemove")
  public List<String> getPreferenceIdsToRemove() {
    return preferenceIdsToRemove;
  }
  public void setPreferenceIdsToRemove(List<String> preferenceIdsToRemove) {
    this.preferenceIdsToRemove = preferenceIdsToRemove;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateAgentSchedulingPreferencesRequest updateAgentSchedulingPreferencesRequest = (UpdateAgentSchedulingPreferencesRequest) o;

    return Objects.equals(this.preferencesToAdd, updateAgentSchedulingPreferencesRequest.preferencesToAdd) &&
            Objects.equals(this.preferenceIdsToRemove, updateAgentSchedulingPreferencesRequest.preferenceIdsToRemove);
  }

  @Override
  public int hashCode() {
    return Objects.hash(preferencesToAdd, preferenceIdsToRemove);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateAgentSchedulingPreferencesRequest {\n");
    
    sb.append("    preferencesToAdd: ").append(toIndentedString(preferencesToAdd)).append("\n");
    sb.append("    preferenceIdsToRemove: ").append(toIndentedString(preferenceIdsToRemove)).append("\n");
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

