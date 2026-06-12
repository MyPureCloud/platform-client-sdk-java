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
import com.mypurecloud.sdk.v2.model.WfmAgentManagementUnitScheduleChangedTopicAgentMuScheduleVisibilityRange;
import com.mypurecloud.sdk.v2.model.WfmAgentManagementUnitScheduleChangedTopicAgentMuUserScheduleChanged;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * WfmAgentManagementUnitScheduleChangedTopicAgentMuScheduleChangedNotification
 */

public class WfmAgentManagementUnitScheduleChangedTopicAgentMuScheduleChangedNotification  implements Serializable {
  
  private List<WfmAgentManagementUnitScheduleChangedTopicAgentMuUserScheduleChanged> agents = null;
  private WfmAgentManagementUnitScheduleChangedTopicAgentMuScheduleVisibilityRange visibilityRange = null;

  public WfmAgentManagementUnitScheduleChangedTopicAgentMuScheduleChangedNotification() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      agents = new ArrayList<WfmAgentManagementUnitScheduleChangedTopicAgentMuUserScheduleChanged>();
    }
  }

  public WfmAgentManagementUnitScheduleChangedTopicAgentMuScheduleChangedNotification(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
      agents = new ArrayList<WfmAgentManagementUnitScheduleChangedTopicAgentMuUserScheduleChanged>();
    }
  }

  
  /**
   **/
  public WfmAgentManagementUnitScheduleChangedTopicAgentMuScheduleChangedNotification agents(List<WfmAgentManagementUnitScheduleChangedTopicAgentMuUserScheduleChanged> agents) {
    this.agents = agents;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("agents")
  public List<WfmAgentManagementUnitScheduleChangedTopicAgentMuUserScheduleChanged> getAgents() {
    return agents;
  }
  public void setAgents(List<WfmAgentManagementUnitScheduleChangedTopicAgentMuUserScheduleChanged> agents) {
    this.agents = agents;
  }


  /**
   **/
  public WfmAgentManagementUnitScheduleChangedTopicAgentMuScheduleChangedNotification visibilityRange(WfmAgentManagementUnitScheduleChangedTopicAgentMuScheduleVisibilityRange visibilityRange) {
    this.visibilityRange = visibilityRange;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("visibilityRange")
  public WfmAgentManagementUnitScheduleChangedTopicAgentMuScheduleVisibilityRange getVisibilityRange() {
    return visibilityRange;
  }
  public void setVisibilityRange(WfmAgentManagementUnitScheduleChangedTopicAgentMuScheduleVisibilityRange visibilityRange) {
    this.visibilityRange = visibilityRange;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WfmAgentManagementUnitScheduleChangedTopicAgentMuScheduleChangedNotification wfmAgentManagementUnitScheduleChangedTopicAgentMuScheduleChangedNotification = (WfmAgentManagementUnitScheduleChangedTopicAgentMuScheduleChangedNotification) o;

    return Objects.equals(this.agents, wfmAgentManagementUnitScheduleChangedTopicAgentMuScheduleChangedNotification.agents) &&
            Objects.equals(this.visibilityRange, wfmAgentManagementUnitScheduleChangedTopicAgentMuScheduleChangedNotification.visibilityRange);
  }

  @Override
  public int hashCode() {
    return Objects.hash(agents, visibilityRange);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WfmAgentManagementUnitScheduleChangedTopicAgentMuScheduleChangedNotification {\n");
    
    sb.append("    agents: ").append(toIndentedString(agents)).append("\n");
    sb.append("    visibilityRange: ").append(toIndentedString(visibilityRange)).append("\n");
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

