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
import com.fasterxml.jackson.annotation.JsonProperty;
import com.mypurecloud.sdk.v2.model.QueueConversationSocialExpressionEventTopicParticipant;
import com.mypurecloud.sdk.v2.model.QueueConversationSocialExpressionEventTopicRecentTransfer;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * QueueConversationSocialExpressionEventTopicConversation
 */

public class QueueConversationSocialExpressionEventTopicConversation  implements Serializable {
  
  private String id = null;
  private Integer maxParticipants = null;
  private List<QueueConversationSocialExpressionEventTopicParticipant> participants = new ArrayList<QueueConversationSocialExpressionEventTopicParticipant>();
  private List<QueueConversationSocialExpressionEventTopicRecentTransfer> recentTransfers = new ArrayList<QueueConversationSocialExpressionEventTopicRecentTransfer>();
  private String recordingState = null;
  private String address = null;
  private String externalTag = null;
  private String utilizationLabelId = null;
  private Boolean securePause = null;

  
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
  public QueueConversationSocialExpressionEventTopicConversation maxParticipants(Integer maxParticipants) {
    this.maxParticipants = maxParticipants;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("maxParticipants")
  public Integer getMaxParticipants() {
    return maxParticipants;
  }
  public void setMaxParticipants(Integer maxParticipants) {
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
  public QueueConversationSocialExpressionEventTopicConversation recentTransfers(List<QueueConversationSocialExpressionEventTopicRecentTransfer> recentTransfers) {
    this.recentTransfers = recentTransfers;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("recentTransfers")
  public List<QueueConversationSocialExpressionEventTopicRecentTransfer> getRecentTransfers() {
    return recentTransfers;
  }
  public void setRecentTransfers(List<QueueConversationSocialExpressionEventTopicRecentTransfer> recentTransfers) {
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
            Objects.equals(this.securePause, queueConversationSocialExpressionEventTopicConversation.securePause);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, maxParticipants, participants, recentTransfers, recordingState, address, externalTag, utilizationLabelId, securePause);
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

