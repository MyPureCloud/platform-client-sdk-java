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
import com.mypurecloud.sdk.v2.model.AgentWorkPlanBiddingPreferenceRequest;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * UpdateAgentWorkPlanBiddingPreference
 */

public class UpdateAgentWorkPlanBiddingPreference  implements Serializable {
  
  private Boolean submitted = null;
  private List<AgentWorkPlanBiddingPreferenceRequest> agentWorkPlanBidPreferences = null;

  public UpdateAgentWorkPlanBiddingPreference() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      agentWorkPlanBidPreferences = new ArrayList<AgentWorkPlanBiddingPreferenceRequest>();
    }
  }

  
  /**
   * Whether the preference is submitted
   **/
  public UpdateAgentWorkPlanBiddingPreference submitted(Boolean submitted) {
    this.submitted = submitted;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Whether the preference is submitted")
  @JsonProperty("submitted")
  public Boolean getSubmitted() {
    return submitted;
  }
  public void setSubmitted(Boolean submitted) {
    this.submitted = submitted;
  }


  /**
   * The list of work plan bidding preferences
   **/
  public UpdateAgentWorkPlanBiddingPreference agentWorkPlanBidPreferences(List<AgentWorkPlanBiddingPreferenceRequest> agentWorkPlanBidPreferences) {
    this.agentWorkPlanBidPreferences = agentWorkPlanBidPreferences;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The list of work plan bidding preferences")
  @JsonProperty("agentWorkPlanBidPreferences")
  public List<AgentWorkPlanBiddingPreferenceRequest> getAgentWorkPlanBidPreferences() {
    return agentWorkPlanBidPreferences;
  }
  public void setAgentWorkPlanBidPreferences(List<AgentWorkPlanBiddingPreferenceRequest> agentWorkPlanBidPreferences) {
    this.agentWorkPlanBidPreferences = agentWorkPlanBidPreferences;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateAgentWorkPlanBiddingPreference updateAgentWorkPlanBiddingPreference = (UpdateAgentWorkPlanBiddingPreference) o;

    return Objects.equals(this.submitted, updateAgentWorkPlanBiddingPreference.submitted) &&
            Objects.equals(this.agentWorkPlanBidPreferences, updateAgentWorkPlanBiddingPreference.agentWorkPlanBidPreferences);
  }

  @Override
  public int hashCode() {
    return Objects.hash(submitted, agentWorkPlanBidPreferences);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateAgentWorkPlanBiddingPreference {\n");
    
    sb.append("    submitted: ").append(toIndentedString(submitted)).append("\n");
    sb.append("    agentWorkPlanBidPreferences: ").append(toIndentedString(agentWorkPlanBidPreferences)).append("\n");
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

