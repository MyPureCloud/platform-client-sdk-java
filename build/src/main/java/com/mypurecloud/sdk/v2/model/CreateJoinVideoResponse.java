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
 * CreateJoinVideoResponse
 */

public class CreateJoinVideoResponse  implements Serializable {
  
  private String communicationId = null;
  private String conversationId = null;
  private String joinCode = null;

  public CreateJoinVideoResponse() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  public CreateJoinVideoResponse(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
    }
  }

  
  /**
   * The communication id for the video or modified by the command.
   **/
  public CreateJoinVideoResponse communicationId(String communicationId) {
    this.communicationId = communicationId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The communication id for the video or modified by the command.")
  @JsonProperty("communicationId")
  public String getCommunicationId() {
    return communicationId;
  }
  public void setCommunicationId(String communicationId) {
    this.communicationId = communicationId;
  }


  /**
   * The conversation id for the conversation created or modified by the command.
   **/
  public CreateJoinVideoResponse conversationId(String conversationId) {
    this.conversationId = conversationId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The conversation id for the conversation created or modified by the command.")
  @JsonProperty("conversationId")
  public String getConversationId() {
    return conversationId;
  }
  public void setConversationId(String conversationId) {
    this.conversationId = conversationId;
  }


  /**
   * The join code for the video conference. Only returned by the voice-to-video upgrade endpoint (POST /conversations/videos/{conversationId}/agentconference/communications/{communicationId}); not populated by POST /conversations/videos. Valid until the voice-to-video offer expires (default 5 minutes) or until used by a guest. One-time use.
   **/
  public CreateJoinVideoResponse joinCode(String joinCode) {
    this.joinCode = joinCode;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The join code for the video conference. Only returned by the voice-to-video upgrade endpoint (POST /conversations/videos/{conversationId}/agentconference/communications/{communicationId}); not populated by POST /conversations/videos. Valid until the voice-to-video offer expires (default 5 minutes) or until used by a guest. One-time use.")
  @JsonProperty("joinCode")
  public String getJoinCode() {
    return joinCode;
  }
  public void setJoinCode(String joinCode) {
    this.joinCode = joinCode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateJoinVideoResponse createJoinVideoResponse = (CreateJoinVideoResponse) o;

    return Objects.equals(this.communicationId, createJoinVideoResponse.communicationId) &&
            Objects.equals(this.conversationId, createJoinVideoResponse.conversationId) &&
            Objects.equals(this.joinCode, createJoinVideoResponse.joinCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(communicationId, conversationId, joinCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateJoinVideoResponse {\n");
    
    sb.append("    communicationId: ").append(toIndentedString(communicationId)).append("\n");
    sb.append("    conversationId: ").append(toIndentedString(conversationId)).append("\n");
    sb.append("    joinCode: ").append(toIndentedString(joinCode)).append("\n");
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

