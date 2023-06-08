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
import com.mypurecloud.sdk.v2.model.ParticipantInfo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * VideoConferenceDetails
 */

public class VideoConferenceDetails  implements Serializable {
  
  private String conferenceId = null;
  private String conversationId = null;
  private ParticipantInfo participantInfo = null;

  
  /**
   * The conferenceId.
   **/
  public VideoConferenceDetails conferenceId(String conferenceId) {
    this.conferenceId = conferenceId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The conferenceId.")
  @JsonProperty("conferenceId")
  public String getConferenceId() {
    return conferenceId;
  }
  public void setConferenceId(String conferenceId) {
    this.conferenceId = conferenceId;
  }


  /**
   * The conversationId of the video conference.
   **/
  public VideoConferenceDetails conversationId(String conversationId) {
    this.conversationId = conversationId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The conversationId of the video conference.")
  @JsonProperty("conversationId")
  public String getConversationId() {
    return conversationId;
  }
  public void setConversationId(String conversationId) {
    this.conversationId = conversationId;
  }


  /**
   * Information about the participants of the video conference.
   **/
  public VideoConferenceDetails participantInfo(ParticipantInfo participantInfo) {
    this.participantInfo = participantInfo;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Information about the participants of the video conference.")
  @JsonProperty("participantInfo")
  public ParticipantInfo getParticipantInfo() {
    return participantInfo;
  }
  public void setParticipantInfo(ParticipantInfo participantInfo) {
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
    VideoConferenceDetails videoConferenceDetails = (VideoConferenceDetails) o;

    return Objects.equals(this.conferenceId, videoConferenceDetails.conferenceId) &&
            Objects.equals(this.conversationId, videoConferenceDetails.conversationId) &&
            Objects.equals(this.participantInfo, videoConferenceDetails.participantInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(conferenceId, conversationId, participantInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VideoConferenceDetails {\n");
    
    sb.append("    conferenceId: ").append(toIndentedString(conferenceId)).append("\n");
    sb.append("    conversationId: ").append(toIndentedString(conversationId)).append("\n");
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

