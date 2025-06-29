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
 * V2StaTopicsDetectedTopicParticipant
 */

public class V2StaTopicsDetectedTopicParticipant  implements Serializable {
  
  private String userId = null;
  private String queueId = null;
  private String divisionId = null;
  private String purpose = null;

  public V2StaTopicsDetectedTopicParticipant() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   **/
  public V2StaTopicsDetectedTopicParticipant userId(String userId) {
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
  public V2StaTopicsDetectedTopicParticipant queueId(String queueId) {
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
  public V2StaTopicsDetectedTopicParticipant divisionId(String divisionId) {
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


  /**
   **/
  public V2StaTopicsDetectedTopicParticipant purpose(String purpose) {
    this.purpose = purpose;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("purpose")
  public String getPurpose() {
    return purpose;
  }
  public void setPurpose(String purpose) {
    this.purpose = purpose;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V2StaTopicsDetectedTopicParticipant v2StaTopicsDetectedTopicParticipant = (V2StaTopicsDetectedTopicParticipant) o;

    return Objects.equals(this.userId, v2StaTopicsDetectedTopicParticipant.userId) &&
            Objects.equals(this.queueId, v2StaTopicsDetectedTopicParticipant.queueId) &&
            Objects.equals(this.divisionId, v2StaTopicsDetectedTopicParticipant.divisionId) &&
            Objects.equals(this.purpose, v2StaTopicsDetectedTopicParticipant.purpose);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userId, queueId, divisionId, purpose);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V2StaTopicsDetectedTopicParticipant {\n");
    
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    queueId: ").append(toIndentedString(queueId)).append("\n");
    sb.append("    divisionId: ").append(toIndentedString(divisionId)).append("\n");
    sb.append("    purpose: ").append(toIndentedString(purpose)).append("\n");
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

