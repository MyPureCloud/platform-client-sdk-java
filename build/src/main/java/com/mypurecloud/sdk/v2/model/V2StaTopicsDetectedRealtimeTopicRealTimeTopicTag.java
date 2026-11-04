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
 * V2StaTopicsDetectedRealtimeTopicRealTimeTopicTag
 */

public class V2StaTopicsDetectedRealtimeTopicRealTimeTopicTag  implements Serializable {
  
  private String topicId = null;
  private String topicName = null;
  private String participant = null;
  private String topicPhrase = null;
  private String matchedTranscript = null;
  private Long confidence = null;

  public V2StaTopicsDetectedRealtimeTopicRealTimeTopicTag() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  public V2StaTopicsDetectedRealtimeTopicRealTimeTopicTag(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
    }
  }

  
  /**
   **/
  public V2StaTopicsDetectedRealtimeTopicRealTimeTopicTag topicId(String topicId) {
    this.topicId = topicId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("topicId")
  public String getTopicId() {
    return topicId;
  }
  public void setTopicId(String topicId) {
    this.topicId = topicId;
  }


  /**
   **/
  public V2StaTopicsDetectedRealtimeTopicRealTimeTopicTag topicName(String topicName) {
    this.topicName = topicName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("topicName")
  public String getTopicName() {
    return topicName;
  }
  public void setTopicName(String topicName) {
    this.topicName = topicName;
  }


  /**
   **/
  public V2StaTopicsDetectedRealtimeTopicRealTimeTopicTag participant(String participant) {
    this.participant = participant;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("participant")
  public String getParticipant() {
    return participant;
  }
  public void setParticipant(String participant) {
    this.participant = participant;
  }


  /**
   **/
  public V2StaTopicsDetectedRealtimeTopicRealTimeTopicTag topicPhrase(String topicPhrase) {
    this.topicPhrase = topicPhrase;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("topicPhrase")
  public String getTopicPhrase() {
    return topicPhrase;
  }
  public void setTopicPhrase(String topicPhrase) {
    this.topicPhrase = topicPhrase;
  }


  /**
   **/
  public V2StaTopicsDetectedRealtimeTopicRealTimeTopicTag matchedTranscript(String matchedTranscript) {
    this.matchedTranscript = matchedTranscript;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("matchedTranscript")
  public String getMatchedTranscript() {
    return matchedTranscript;
  }
  public void setMatchedTranscript(String matchedTranscript) {
    this.matchedTranscript = matchedTranscript;
  }


  /**
   **/
  public V2StaTopicsDetectedRealtimeTopicRealTimeTopicTag confidence(Long confidence) {
    this.confidence = confidence;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("confidence")
  public Long getConfidence() {
    return confidence;
  }
  public void setConfidence(Long confidence) {
    this.confidence = confidence;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V2StaTopicsDetectedRealtimeTopicRealTimeTopicTag v2StaTopicsDetectedRealtimeTopicRealTimeTopicTag = (V2StaTopicsDetectedRealtimeTopicRealTimeTopicTag) o;

    return Objects.equals(this.topicId, v2StaTopicsDetectedRealtimeTopicRealTimeTopicTag.topicId) &&
            Objects.equals(this.topicName, v2StaTopicsDetectedRealtimeTopicRealTimeTopicTag.topicName) &&
            Objects.equals(this.participant, v2StaTopicsDetectedRealtimeTopicRealTimeTopicTag.participant) &&
            Objects.equals(this.topicPhrase, v2StaTopicsDetectedRealtimeTopicRealTimeTopicTag.topicPhrase) &&
            Objects.equals(this.matchedTranscript, v2StaTopicsDetectedRealtimeTopicRealTimeTopicTag.matchedTranscript) &&
            Objects.equals(this.confidence, v2StaTopicsDetectedRealtimeTopicRealTimeTopicTag.confidence);
  }

  @Override
  public int hashCode() {
    return Objects.hash(topicId, topicName, participant, topicPhrase, matchedTranscript, confidence);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V2StaTopicsDetectedRealtimeTopicRealTimeTopicTag {\n");
    
    sb.append("    topicId: ").append(toIndentedString(topicId)).append("\n");
    sb.append("    topicName: ").append(toIndentedString(topicName)).append("\n");
    sb.append("    participant: ").append(toIndentedString(participant)).append("\n");
    sb.append("    topicPhrase: ").append(toIndentedString(topicPhrase)).append("\n");
    sb.append("    matchedTranscript: ").append(toIndentedString(matchedTranscript)).append("\n");
    sb.append("    confidence: ").append(toIndentedString(confidence)).append("\n");
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

