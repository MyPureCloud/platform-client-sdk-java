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
import com.mypurecloud.sdk.v2.model.QueueConversationSocialExpressionEventTopicConversationDivisionMembership;
import com.mypurecloud.sdk.v2.model.QueueConversationSocialExpressionEventTopicParticipant;
import com.mypurecloud.sdk.v2.model.QueueConversationSocialExpressionEventTopicTransferResponse;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import java.io.Serializable;
/**
 * QueueConversationSocialExpressionEventTopicConversation
 */

public class QueueConversationSocialExpressionEventTopicConversation  implements Serializable {
  
  private String id = null;
  private Long maxParticipants = null;
  private List<QueueConversationSocialExpressionEventTopicParticipant> participants = null;
  private List<QueueConversationSocialExpressionEventTopicTransferResponse> recentTransfers = null;
  private String recordingState = null;
  private String address = null;
  private String externalTag = null;
  private String utilizationLabelId = null;
  private Boolean securePause = null;
  private Date inactivityTimeout = null;
  private List<QueueConversationSocialExpressionEventTopicConversationDivisionMembership> divisions = null;

  public QueueConversationSocialExpressionEventTopicConversation() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      participants = new ArrayList<QueueConversationSocialExpressionEventTopicParticipant>();
      recentTransfers = new ArrayList<QueueConversationSocialExpressionEventTopicTransferResponse>();
      divisions = new ArrayList<QueueConversationSocialExpressionEventTopicConversationDivisionMembership>();
    }
  }

  
  /**
   **/
  public QueueConversationSocialExpressionEventTopicConversation id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }


  /**
   **/
  public QueueConversationSocialExpressionEventTopicConversation maxParticipants(Long maxParticipants) {
    this.maxParticipants = maxParticipants;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("maxParticipants")
  public Long getMaxParticipants() {
    return maxParticipants;
  }
  public void setMaxParticipants(Long maxParticipants) {
    this.maxParticipants = maxParticipants;
  }


  /**
   **/
  public QueueConversationSocialExpressionEventTopicConversation participants(List<QueueConversationSocialExpressionEventTopicParticipant> participants) {
    this.participants = participants;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("participants")
  public List<QueueConversationSocialExpressionEventTopicParticipant> getParticipants() {
    return participants;
  }
  public void setParticipants(List<QueueConversationSocialExpressionEventTopicParticipant> participants) {
    this.participants = participants;
  }


  /**
   **/
  public QueueConversationSocialExpressionEventTopicConversation recentTransfers(List<QueueConversationSocialExpressionEventTopicTransferResponse> recentTransfers) {
    this.recentTransfers = recentTransfers;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("recentTransfers")
  public List<QueueConversationSocialExpressionEventTopicTransferResponse> getRecentTransfers() {
    return recentTransfers;
  }
  public void setRecentTransfers(List<QueueConversationSocialExpressionEventTopicTransferResponse> recentTransfers) {
    this.recentTransfers = recentTransfers;
  }


  /**
   **/
  public QueueConversationSocialExpressionEventTopicConversation recordingState(String recordingState) {
    this.recordingState = recordingState;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("recordingState")
  public String getRecordingState() {
    return recordingState;
  }
  public void setRecordingState(String recordingState) {
    this.recordingState = recordingState;
  }


  /**
   **/
  public QueueConversationSocialExpressionEventTopicConversation address(String address) {
    this.address = address;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("address")
  public String getAddress() {
    return address;
  }
  public void setAddress(String address) {
    this.address = address;
  }


  /**
   **/
  public QueueConversationSocialExpressionEventTopicConversation externalTag(String externalTag) {
    this.externalTag = externalTag;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("externalTag")
  public String getExternalTag() {
    return externalTag;
  }
  public void setExternalTag(String externalTag) {
    this.externalTag = externalTag;
  }


  /**
   **/
  public QueueConversationSocialExpressionEventTopicConversation utilizationLabelId(String utilizationLabelId) {
    this.utilizationLabelId = utilizationLabelId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("utilizationLabelId")
  public String getUtilizationLabelId() {
    return utilizationLabelId;
  }
  public void setUtilizationLabelId(String utilizationLabelId) {
    this.utilizationLabelId = utilizationLabelId;
  }


  /**
   **/
  public QueueConversationSocialExpressionEventTopicConversation securePause(Boolean securePause) {
    this.securePause = securePause;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("securePause")
  public Boolean getSecurePause() {
    return securePause;
  }
  public void setSecurePause(Boolean securePause) {
    this.securePause = securePause;
  }


  /**
   **/
  public QueueConversationSocialExpressionEventTopicConversation inactivityTimeout(Date inactivityTimeout) {
    this.inactivityTimeout = inactivityTimeout;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("inactivityTimeout")
  public Date getInactivityTimeout() {
    return inactivityTimeout;
  }
  public void setInactivityTimeout(Date inactivityTimeout) {
    this.inactivityTimeout = inactivityTimeout;
  }


  /**
   **/
  public QueueConversationSocialExpressionEventTopicConversation divisions(List<QueueConversationSocialExpressionEventTopicConversationDivisionMembership> divisions) {
    this.divisions = divisions;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("divisions")
  public List<QueueConversationSocialExpressionEventTopicConversationDivisionMembership> getDivisions() {
    return divisions;
  }
  public void setDivisions(List<QueueConversationSocialExpressionEventTopicConversationDivisionMembership> divisions) {
    this.divisions = divisions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QueueConversationSocialExpressionEventTopicConversation queueConversationSocialExpressionEventTopicConversation = (QueueConversationSocialExpressionEventTopicConversation) o;

    return Objects.equals(this.id, queueConversationSocialExpressionEventTopicConversation.id) &&
            Objects.equals(this.maxParticipants, queueConversationSocialExpressionEventTopicConversation.maxParticipants) &&
            Objects.equals(this.participants, queueConversationSocialExpressionEventTopicConversation.participants) &&
            Objects.equals(this.recentTransfers, queueConversationSocialExpressionEventTopicConversation.recentTransfers) &&
            Objects.equals(this.recordingState, queueConversationSocialExpressionEventTopicConversation.recordingState) &&
            Objects.equals(this.address, queueConversationSocialExpressionEventTopicConversation.address) &&
            Objects.equals(this.externalTag, queueConversationSocialExpressionEventTopicConversation.externalTag) &&
            Objects.equals(this.utilizationLabelId, queueConversationSocialExpressionEventTopicConversation.utilizationLabelId) &&
            Objects.equals(this.securePause, queueConversationSocialExpressionEventTopicConversation.securePause) &&
            Objects.equals(this.inactivityTimeout, queueConversationSocialExpressionEventTopicConversation.inactivityTimeout) &&
            Objects.equals(this.divisions, queueConversationSocialExpressionEventTopicConversation.divisions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, maxParticipants, participants, recentTransfers, recordingState, address, externalTag, utilizationLabelId, securePause, inactivityTimeout, divisions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueueConversationSocialExpressionEventTopicConversation {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    maxParticipants: ").append(toIndentedString(maxParticipants)).append("\n");
    sb.append("    participants: ").append(toIndentedString(participants)).append("\n");
    sb.append("    recentTransfers: ").append(toIndentedString(recentTransfers)).append("\n");
    sb.append("    recordingState: ").append(toIndentedString(recordingState)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    externalTag: ").append(toIndentedString(externalTag)).append("\n");
    sb.append("    utilizationLabelId: ").append(toIndentedString(utilizationLabelId)).append("\n");
    sb.append("    securePause: ").append(toIndentedString(securePause)).append("\n");
    sb.append("    inactivityTimeout: ").append(toIndentedString(inactivityTimeout)).append("\n");
    sb.append("    divisions: ").append(toIndentedString(divisions)).append("\n");
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

