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
import com.mypurecloud.sdk.v2.model.V2StaRealtimeCustomerSentimentTopicConversationParticipant;
import com.mypurecloud.sdk.v2.model.V2StaRealtimeCustomerSentimentTopicRealTimeSentimentTag;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * V2StaRealtimeCustomerSentimentTopicRealTimeCustomerSentimentMessage
 */

public class V2StaRealtimeCustomerSentimentTopicRealTimeCustomerSentimentMessage  implements Serializable {
  
  private String organizationId = null;
  private String conversationId = null;
  private String communicationId = null;
  private String programId = null;
  private List<V2StaRealtimeCustomerSentimentTopicRealTimeSentimentTag> sentiments = null;
  private List<V2StaRealtimeCustomerSentimentTopicConversationParticipant> participants = null;

  public V2StaRealtimeCustomerSentimentTopicRealTimeCustomerSentimentMessage() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      sentiments = new ArrayList<V2StaRealtimeCustomerSentimentTopicRealTimeSentimentTag>();
      participants = new ArrayList<V2StaRealtimeCustomerSentimentTopicConversationParticipant>();
    }
  }

  public V2StaRealtimeCustomerSentimentTopicRealTimeCustomerSentimentMessage(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
      sentiments = new ArrayList<V2StaRealtimeCustomerSentimentTopicRealTimeSentimentTag>();
      participants = new ArrayList<V2StaRealtimeCustomerSentimentTopicConversationParticipant>();
    }
  }

  
  /**
   **/
  public V2StaRealtimeCustomerSentimentTopicRealTimeCustomerSentimentMessage organizationId(String organizationId) {
    this.organizationId = organizationId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("organizationId")
  public String getOrganizationId() {
    return organizationId;
  }
  public void setOrganizationId(String organizationId) {
    this.organizationId = organizationId;
  }


  /**
   **/
  public V2StaRealtimeCustomerSentimentTopicRealTimeCustomerSentimentMessage conversationId(String conversationId) {
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
  public V2StaRealtimeCustomerSentimentTopicRealTimeCustomerSentimentMessage communicationId(String communicationId) {
    this.communicationId = communicationId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("communicationId")
  public String getCommunicationId() {
    return communicationId;
  }
  public void setCommunicationId(String communicationId) {
    this.communicationId = communicationId;
  }


  /**
   **/
  public V2StaRealtimeCustomerSentimentTopicRealTimeCustomerSentimentMessage programId(String programId) {
    this.programId = programId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("programId")
  public String getProgramId() {
    return programId;
  }
  public void setProgramId(String programId) {
    this.programId = programId;
  }


  /**
   **/
  public V2StaRealtimeCustomerSentimentTopicRealTimeCustomerSentimentMessage sentiments(List<V2StaRealtimeCustomerSentimentTopicRealTimeSentimentTag> sentiments) {
    this.sentiments = sentiments;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("sentiments")
  public List<V2StaRealtimeCustomerSentimentTopicRealTimeSentimentTag> getSentiments() {
    return sentiments;
  }
  public void setSentiments(List<V2StaRealtimeCustomerSentimentTopicRealTimeSentimentTag> sentiments) {
    this.sentiments = sentiments;
  }


  /**
   **/
  public V2StaRealtimeCustomerSentimentTopicRealTimeCustomerSentimentMessage participants(List<V2StaRealtimeCustomerSentimentTopicConversationParticipant> participants) {
    this.participants = participants;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("participants")
  public List<V2StaRealtimeCustomerSentimentTopicConversationParticipant> getParticipants() {
    return participants;
  }
  public void setParticipants(List<V2StaRealtimeCustomerSentimentTopicConversationParticipant> participants) {
    this.participants = participants;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V2StaRealtimeCustomerSentimentTopicRealTimeCustomerSentimentMessage v2StaRealtimeCustomerSentimentTopicRealTimeCustomerSentimentMessage = (V2StaRealtimeCustomerSentimentTopicRealTimeCustomerSentimentMessage) o;

    return Objects.equals(this.organizationId, v2StaRealtimeCustomerSentimentTopicRealTimeCustomerSentimentMessage.organizationId) &&
            Objects.equals(this.conversationId, v2StaRealtimeCustomerSentimentTopicRealTimeCustomerSentimentMessage.conversationId) &&
            Objects.equals(this.communicationId, v2StaRealtimeCustomerSentimentTopicRealTimeCustomerSentimentMessage.communicationId) &&
            Objects.equals(this.programId, v2StaRealtimeCustomerSentimentTopicRealTimeCustomerSentimentMessage.programId) &&
            Objects.equals(this.sentiments, v2StaRealtimeCustomerSentimentTopicRealTimeCustomerSentimentMessage.sentiments) &&
            Objects.equals(this.participants, v2StaRealtimeCustomerSentimentTopicRealTimeCustomerSentimentMessage.participants);
  }

  @Override
  public int hashCode() {
    return Objects.hash(organizationId, conversationId, communicationId, programId, sentiments, participants);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V2StaRealtimeCustomerSentimentTopicRealTimeCustomerSentimentMessage {\n");
    
    sb.append("    organizationId: ").append(toIndentedString(organizationId)).append("\n");
    sb.append("    conversationId: ").append(toIndentedString(conversationId)).append("\n");
    sb.append("    communicationId: ").append(toIndentedString(communicationId)).append("\n");
    sb.append("    programId: ").append(toIndentedString(programId)).append("\n");
    sb.append("    sentiments: ").append(toIndentedString(sentiments)).append("\n");
    sb.append("    participants: ").append(toIndentedString(participants)).append("\n");
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

