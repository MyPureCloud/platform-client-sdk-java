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
import com.mypurecloud.sdk.v2.model.V2StaEmpathyOverallTopicAgentEmpathyScore;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * V2StaEmpathyOverallTopicOverallEmpathyMessage
 */

public class V2StaEmpathyOverallTopicOverallEmpathyMessage  implements Serializable {
  
  private String conversationId = null;
  private List<String> queueIds = null;
  private List<String> divisionIds = null;
  private List<String> flowIds = null;
  private List<V2StaEmpathyOverallTopicAgentEmpathyScore> agents = null;

  public V2StaEmpathyOverallTopicOverallEmpathyMessage() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      queueIds = new ArrayList<String>();
      divisionIds = new ArrayList<String>();
      flowIds = new ArrayList<String>();
      agents = new ArrayList<V2StaEmpathyOverallTopicAgentEmpathyScore>();
    }
  }

  
  /**
   **/
  public V2StaEmpathyOverallTopicOverallEmpathyMessage conversationId(String conversationId) {
    this.conversationId = conversationId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("conversationId")
  public String getConversationId() {
    return conversationId;
  }
  public void setConversationId(String conversationId) {
    this.conversationId = conversationId;
  }


  /**
   **/
  public V2StaEmpathyOverallTopicOverallEmpathyMessage queueIds(List<String> queueIds) {
    this.queueIds = queueIds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("queueIds")
  public List<String> getQueueIds() {
    return queueIds;
  }
  public void setQueueIds(List<String> queueIds) {
    this.queueIds = queueIds;
  }


  /**
   **/
  public V2StaEmpathyOverallTopicOverallEmpathyMessage divisionIds(List<String> divisionIds) {
    this.divisionIds = divisionIds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("divisionIds")
  public List<String> getDivisionIds() {
    return divisionIds;
  }
  public void setDivisionIds(List<String> divisionIds) {
    this.divisionIds = divisionIds;
  }


  /**
   **/
  public V2StaEmpathyOverallTopicOverallEmpathyMessage flowIds(List<String> flowIds) {
    this.flowIds = flowIds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("flowIds")
  public List<String> getFlowIds() {
    return flowIds;
  }
  public void setFlowIds(List<String> flowIds) {
    this.flowIds = flowIds;
  }


  /**
   **/
  public V2StaEmpathyOverallTopicOverallEmpathyMessage agents(List<V2StaEmpathyOverallTopicAgentEmpathyScore> agents) {
    this.agents = agents;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("agents")
  public List<V2StaEmpathyOverallTopicAgentEmpathyScore> getAgents() {
    return agents;
  }
  public void setAgents(List<V2StaEmpathyOverallTopicAgentEmpathyScore> agents) {
    this.agents = agents;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V2StaEmpathyOverallTopicOverallEmpathyMessage v2StaEmpathyOverallTopicOverallEmpathyMessage = (V2StaEmpathyOverallTopicOverallEmpathyMessage) o;

    return Objects.equals(this.conversationId, v2StaEmpathyOverallTopicOverallEmpathyMessage.conversationId) &&
            Objects.equals(this.queueIds, v2StaEmpathyOverallTopicOverallEmpathyMessage.queueIds) &&
            Objects.equals(this.divisionIds, v2StaEmpathyOverallTopicOverallEmpathyMessage.divisionIds) &&
            Objects.equals(this.flowIds, v2StaEmpathyOverallTopicOverallEmpathyMessage.flowIds) &&
            Objects.equals(this.agents, v2StaEmpathyOverallTopicOverallEmpathyMessage.agents);
  }

  @Override
  public int hashCode() {
    return Objects.hash(conversationId, queueIds, divisionIds, flowIds, agents);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V2StaEmpathyOverallTopicOverallEmpathyMessage {\n");
    
    sb.append("    conversationId: ").append(toIndentedString(conversationId)).append("\n");
    sb.append("    queueIds: ").append(toIndentedString(queueIds)).append("\n");
    sb.append("    divisionIds: ").append(toIndentedString(divisionIds)).append("\n");
    sb.append("    flowIds: ").append(toIndentedString(flowIds)).append("\n");
    sb.append("    agents: ").append(toIndentedString(agents)).append("\n");
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

