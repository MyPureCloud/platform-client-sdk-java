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
import com.mypurecloud.sdk.v2.model.SelectedAnswer;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * ChunkSearchRegisterRequest
 */

public class ChunkSearchRegisterRequest  implements Serializable {
  
  private String sessionId = null;
  private Boolean answered = null;
  private List<SelectedAnswer> selectedAnswers = null;

  public ChunkSearchRegisterRequest() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      selectedAnswers = new ArrayList<SelectedAnswer>();
    }
  }

  
  /**
   * The unique identifier of this session
   **/
  public ChunkSearchRegisterRequest sessionId(String sessionId) {
    this.sessionId = sessionId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The unique identifier of this session")
  @JsonProperty("sessionId")
  public String getSessionId() {
    return sessionId;
  }
  public void setSessionId(String sessionId) {
    this.sessionId = sessionId;
  }


  /**
   * Mark the chunks search as answered/unanswered
   **/
  public ChunkSearchRegisterRequest answered(Boolean answered) {
    this.answered = answered;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Mark the chunks search as answered/unanswered")
  @JsonProperty("answered")
  public Boolean getAnswered() {
    return answered;
  }
  public void setAnswered(Boolean answered) {
    this.answered = answered;
  }


  /**
   * The search results selected as answers
   **/
  public ChunkSearchRegisterRequest selectedAnswers(List<SelectedAnswer> selectedAnswers) {
    this.selectedAnswers = selectedAnswers;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The search results selected as answers")
  @JsonProperty("selectedAnswers")
  public List<SelectedAnswer> getSelectedAnswers() {
    return selectedAnswers;
  }
  public void setSelectedAnswers(List<SelectedAnswer> selectedAnswers) {
    this.selectedAnswers = selectedAnswers;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChunkSearchRegisterRequest chunkSearchRegisterRequest = (ChunkSearchRegisterRequest) o;

    return Objects.equals(this.sessionId, chunkSearchRegisterRequest.sessionId) &&
            Objects.equals(this.answered, chunkSearchRegisterRequest.answered) &&
            Objects.equals(this.selectedAnswers, chunkSearchRegisterRequest.selectedAnswers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sessionId, answered, selectedAnswers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChunkSearchRegisterRequest {\n");
    
    sb.append("    sessionId: ").append(toIndentedString(sessionId)).append("\n");
    sb.append("    answered: ").append(toIndentedString(answered)).append("\n");
    sb.append("    selectedAnswers: ").append(toIndentedString(selectedAnswers)).append("\n");
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

