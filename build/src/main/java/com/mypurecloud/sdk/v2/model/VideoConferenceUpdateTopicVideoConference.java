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
import com.mypurecloud.sdk.v2.model.VideoConferenceUpdateTopicParticipantInfo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * VideoConferenceUpdateTopicVideoConference
 */

public class VideoConferenceUpdateTopicVideoConference  implements Serializable {
  
  private String conversationId = null;
  private String conferenceId = null;
  private VideoConferenceUpdateTopicParticipantInfo participantInfo = null;

  
  /**
   **/
  public VideoConferenceUpdateTopicVideoConference conversationId(String conversationId) {
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
  public VideoConferenceUpdateTopicVideoConference conferenceId(String conferenceId) {
    this.conferenceId = conferenceId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("conferenceId")
  public String getConferenceId() {
    return conferenceId;
  }
  public void setConferenceId(String conferenceId) {
    this.conferenceId = conferenceId;
  }


  /**
   **/
  public VideoConferenceUpdateTopicVideoConference participantInfo(VideoConferenceUpdateTopicParticipantInfo participantInfo) {
    this.participantInfo = participantInfo;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("participantInfo")
  public VideoConferenceUpdateTopicParticipantInfo getParticipantInfo() {
    return participantInfo;
  }
  public void setParticipantInfo(VideoConferenceUpdateTopicParticipantInfo participantInfo) {
    this.participantInfo = participantInfo;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VideoConferenceUpdateTopicVideoConference videoConferenceUpdateTopicVideoConference = (VideoConferenceUpdateTopicVideoConference) o;

    return Objects.equals(this.conversationId, videoConferenceUpdateTopicVideoConference.conversationId) &&
            Objects.equals(this.conferenceId, videoConferenceUpdateTopicVideoConference.conferenceId) &&
            Objects.equals(this.participantInfo, videoConferenceUpdateTopicVideoConference.participantInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(conversationId, conferenceId, participantInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VideoConferenceUpdateTopicVideoConference {\n");
    
    sb.append("    conversationId: ").append(toIndentedString(conversationId)).append("\n");
    sb.append("    conferenceId: ").append(toIndentedString(conferenceId)).append("\n");
    sb.append("    participantInfo: ").append(toIndentedString(participantInfo)).append("\n");
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

