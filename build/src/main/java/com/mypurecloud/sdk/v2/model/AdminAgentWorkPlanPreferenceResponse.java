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
import com.mypurecloud.sdk.v2.model.AdminAgentWorkPlanBiddingPreference;
import com.mypurecloud.sdk.v2.model.WorkPlanReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * AdminAgentWorkPlanPreferenceResponse
 */

public class AdminAgentWorkPlanPreferenceResponse  implements Serializable {
  
  private String id = null;
  private List<WorkPlanReference> workPlans = null;
  private List<AdminAgentWorkPlanBiddingPreference> agentWorkPlanBidPreferences = null;
  private String selfUri = null;

  public AdminAgentWorkPlanPreferenceResponse() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      workPlans = new ArrayList<WorkPlanReference>();
      agentWorkPlanBidPreferences = new ArrayList<AdminAgentWorkPlanBiddingPreference>();
    }
  }

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }


  /**
   * The list of work plans that belong to this bid group
   **/
  public AdminAgentWorkPlanPreferenceResponse workPlans(List<WorkPlanReference> workPlans) {
    this.workPlans = workPlans;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The list of work plans that belong to this bid group")
  @JsonProperty("workPlans")
  public List<WorkPlanReference> getWorkPlans() {
    return workPlans;
  }
  public void setWorkPlans(List<WorkPlanReference> workPlans) {
    this.workPlans = workPlans;
  }


  /**
   * The list of agents work plan bidding preferences
   **/
  public AdminAgentWorkPlanPreferenceResponse agentWorkPlanBidPreferences(List<AdminAgentWorkPlanBiddingPreference> agentWorkPlanBidPreferences) {
    this.agentWorkPlanBidPreferences = agentWorkPlanBidPreferences;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The list of agents work plan bidding preferences")
  @JsonProperty("agentWorkPlanBidPreferences")
  public List<AdminAgentWorkPlanBiddingPreference> getAgentWorkPlanBidPreferences() {
    return agentWorkPlanBidPreferences;
  }
  public void setAgentWorkPlanBidPreferences(List<AdminAgentWorkPlanBiddingPreference> agentWorkPlanBidPreferences) {
    this.agentWorkPlanBidPreferences = agentWorkPlanBidPreferences;
  }


  @ApiModelProperty(example = "null", value = "The URI for this object")
  @JsonProperty("selfUri")
  public String getSelfUri() {
    return selfUri;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdminAgentWorkPlanPreferenceResponse adminAgentWorkPlanPreferenceResponse = (AdminAgentWorkPlanPreferenceResponse) o;

    return Objects.equals(this.id, adminAgentWorkPlanPreferenceResponse.id) &&
            Objects.equals(this.workPlans, adminAgentWorkPlanPreferenceResponse.workPlans) &&
            Objects.equals(this.agentWorkPlanBidPreferences, adminAgentWorkPlanPreferenceResponse.agentWorkPlanBidPreferences) &&
            Objects.equals(this.selfUri, adminAgentWorkPlanPreferenceResponse.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, workPlans, agentWorkPlanBidPreferences, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdminAgentWorkPlanPreferenceResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    workPlans: ").append(toIndentedString(workPlans)).append("\n");
    sb.append("    agentWorkPlanBidPreferences: ").append(toIndentedString(agentWorkPlanBidPreferences)).append("\n");
    sb.append("    selfUri: ").append(toIndentedString(selfUri)).append("\n");
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

