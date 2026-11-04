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
 * V2StaTopicsDetectedRealtimeTopicConversationParticipant
 */

public class V2StaTopicsDetectedRealtimeTopicConversationParticipant  implements Serializable {
  
  private String userId = null;
  private String queueId = null;
  private String divisionId = null;

  public V2StaTopicsDetectedRealtimeTopicConversationParticipant() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  public V2StaTopicsDetectedRealtimeTopicConversationParticipant(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
    }
  }

  
  /**
   **/
  public V2StaTopicsDetectedRealtimeTopicConversationParticipant userId(String userId) {
    this.userId = userId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("userId")
  public String getUserId() {
    return userId;
  }
  public void setUserId(String userId) {
    this.userId = userId;
  }


  /**
   **/
  public V2StaTopicsDetectedRealtimeTopicConversationParticipant queueId(String queueId) {
    this.queueId = queueId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("queueId")
  public String getQueueId() {
    return queueId;
  }
  public void setQueueId(String queueId) {
    this.queueId = queueId;
  }


  /**
   **/
  public V2StaTopicsDetectedRealtimeTopicConversationParticipant divisionId(String divisionId) {
    this.divisionId = divisionId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("divisionId")
  public String getDivisionId() {
    return divisionId;
  }
  public void setDivisionId(String divisionId) {
    this.divisionId = divisionId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V2StaTopicsDetectedRealtimeTopicConversationParticipant v2StaTopicsDetectedRealtimeTopicConversationParticipant = (V2StaTopicsDetectedRealtimeTopicConversationParticipant) o;

    return Objects.equals(this.userId, v2StaTopicsDetectedRealtimeTopicConversationParticipant.userId) &&
            Objects.equals(this.queueId, v2StaTopicsDetectedRealtimeTopicConversationParticipant.queueId) &&
            Objects.equals(this.divisionId, v2StaTopicsDetectedRealtimeTopicConversationParticipant.divisionId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userId, queueId, divisionId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V2StaTopicsDetectedRealtimeTopicConversationParticipant {\n");
    
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    queueId: ").append(toIndentedString(queueId)).append("\n");
    sb.append("    divisionId: ").append(toIndentedString(divisionId)).append("\n");
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

