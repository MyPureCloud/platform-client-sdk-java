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

import java.io.Serializable;
/**
 * QueueConversationCallEventTopicRecordersState
 */

public class QueueConversationCallEventTopicRecordersState  implements Serializable {
  
  private String adhocState = null;
  private String customerExperienceState = null;
  private String agentExperienceState = null;

  public QueueConversationCallEventTopicRecordersState() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * Indicates the state of the adhoc recorder.
   **/
  public QueueConversationCallEventTopicRecordersState adhocState(String adhocState) {
    this.adhocState = adhocState;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Indicates the state of the adhoc recorder.")
  @JsonProperty("adhocState")
  public String getAdhocState() {
    return adhocState;
  }
  public void setAdhocState(String adhocState) {
    this.adhocState = adhocState;
  }


  /**
   * Indicates the state of the customer experience recorder.
   **/
  public QueueConversationCallEventTopicRecordersState customerExperienceState(String customerExperienceState) {
    this.customerExperienceState = customerExperienceState;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Indicates the state of the customer experience recorder.")
  @JsonProperty("customerExperienceState")
  public String getCustomerExperienceState() {
    return customerExperienceState;
  }
  public void setCustomerExperienceState(String customerExperienceState) {
    this.customerExperienceState = customerExperienceState;
  }


  /**
   * Indicates the state of the agent experience recorder.
   **/
  public QueueConversationCallEventTopicRecordersState agentExperienceState(String agentExperienceState) {
    this.agentExperienceState = agentExperienceState;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Indicates the state of the agent experience recorder.")
  @JsonProperty("agentExperienceState")
  public String getAgentExperienceState() {
    return agentExperienceState;
  }
  public void setAgentExperienceState(String agentExperienceState) {
    this.agentExperienceState = agentExperienceState;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QueueConversationCallEventTopicRecordersState queueConversationCallEventTopicRecordersState = (QueueConversationCallEventTopicRecordersState) o;

    return Objects.equals(this.adhocState, queueConversationCallEventTopicRecordersState.adhocState) &&
            Objects.equals(this.customerExperienceState, queueConversationCallEventTopicRecordersState.customerExperienceState) &&
            Objects.equals(this.agentExperienceState, queueConversationCallEventTopicRecordersState.agentExperienceState);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adhocState, customerExperienceState, agentExperienceState);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueueConversationCallEventTopicRecordersState {\n");
    
    sb.append("    adhocState: ").append(toIndentedString(adhocState)).append("\n");
    sb.append("    customerExperienceState: ").append(toIndentedString(customerExperienceState)).append("\n");
    sb.append("    agentExperienceState: ").append(toIndentedString(agentExperienceState)).append("\n");
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

