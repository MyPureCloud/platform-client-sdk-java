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
import com.mypurecloud.sdk.v2.model.AgentScheduleBiddingPreferencePriority;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * UpdateAgentScheduleBiddingPreference
 */

public class UpdateAgentScheduleBiddingPreference  implements Serializable {
  
  private Boolean submitted = null;
  private List<AgentScheduleBiddingPreferencePriority> agentScheduleBidPreferences = null;

  public UpdateAgentScheduleBiddingPreference() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      agentScheduleBidPreferences = new ArrayList<AgentScheduleBiddingPreferencePriority>();
    }
  }

  public UpdateAgentScheduleBiddingPreference(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
      agentScheduleBidPreferences = new ArrayList<AgentScheduleBiddingPreferencePriority>();
    }
  }

  
  /**
   * Whether the preference is submitted
   **/
  public UpdateAgentScheduleBiddingPreference submitted(Boolean submitted) {
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
   * The schedule bidding preferences
   **/
  public UpdateAgentScheduleBiddingPreference agentScheduleBidPreferences(List<AgentScheduleBiddingPreferencePriority> agentScheduleBidPreferences) {
    this.agentScheduleBidPreferences = agentScheduleBidPreferences;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The schedule bidding preferences")
  @JsonProperty("agentScheduleBidPreferences")
  public List<AgentScheduleBiddingPreferencePriority> getAgentScheduleBidPreferences() {
    return agentScheduleBidPreferences;
  }
  public void setAgentScheduleBidPreferences(List<AgentScheduleBiddingPreferencePriority> agentScheduleBidPreferences) {
    this.agentScheduleBidPreferences = agentScheduleBidPreferences;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateAgentScheduleBiddingPreference updateAgentScheduleBiddingPreference = (UpdateAgentScheduleBiddingPreference) o;

    return Objects.equals(this.submitted, updateAgentScheduleBiddingPreference.submitted) &&
            Objects.equals(this.agentScheduleBidPreferences, updateAgentScheduleBiddingPreference.agentScheduleBidPreferences);
  }

  @Override
  public int hashCode() {
    return Objects.hash(submitted, agentScheduleBidPreferences);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateAgentScheduleBiddingPreference {\n");
    
    sb.append("    submitted: ").append(toIndentedString(submitted)).append("\n");
    sb.append("    agentScheduleBidPreferences: ").append(toIndentedString(agentScheduleBidPreferences)).append("\n");
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

