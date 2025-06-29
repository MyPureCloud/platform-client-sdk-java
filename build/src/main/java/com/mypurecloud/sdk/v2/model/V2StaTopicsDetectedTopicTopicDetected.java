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
 * V2StaTopicsDetectedTopicTopicDetected
 */

public class V2StaTopicsDetectedTopicTopicDetected  implements Serializable {
  
  private String participant = null;
  private String topicId = null;
  private String topicName = null;

  public V2StaTopicsDetectedTopicTopicDetected() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   **/
  public V2StaTopicsDetectedTopicTopicDetected participant(String participant) {
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
  public V2StaTopicsDetectedTopicTopicDetected topicId(String topicId) {
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
  public V2StaTopicsDetectedTopicTopicDetected topicName(String topicName) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V2StaTopicsDetectedTopicTopicDetected v2StaTopicsDetectedTopicTopicDetected = (V2StaTopicsDetectedTopicTopicDetected) o;

    return Objects.equals(this.participant, v2StaTopicsDetectedTopicTopicDetected.participant) &&
            Objects.equals(this.topicId, v2StaTopicsDetectedTopicTopicDetected.topicId) &&
            Objects.equals(this.topicName, v2StaTopicsDetectedTopicTopicDetected.topicName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(participant, topicId, topicName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V2StaTopicsDetectedTopicTopicDetected {\n");
    
    sb.append("    participant: ").append(toIndentedString(participant)).append("\n");
    sb.append("    topicId: ").append(toIndentedString(topicId)).append("\n");
    sb.append("    topicName: ").append(toIndentedString(topicName)).append("\n");
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

