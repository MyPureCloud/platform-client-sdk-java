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
import com.mypurecloud.sdk.v2.model.SelectedAnswer;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * SearchUpdateRequest
 */

public class SearchUpdateRequest  implements Serializable {
  
  private String sessionId = null;
  private Boolean answered = null;
  private SelectedAnswer selectedAnswer = null;

  
  @ApiModelProperty(example = "null", value = "The unique identifier of this session")
  @JsonProperty("sessionId")
  public String getSessionId() {
    return sessionId;
  }


  /**
   * Mark the search as answered/unanswered
   **/
  public SearchUpdateRequest answered(Boolean answered) {
    this.answered = answered;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Mark the search as answered/unanswered")
  @JsonProperty("answered")
  public Boolean getAnswered() {
    return answered;
  }
  public void setAnswered(Boolean answered) {
    this.answered = answered;
  }


  /**
   * The selected search result chosen as the answer.
   **/
  public SearchUpdateRequest selectedAnswer(SelectedAnswer selectedAnswer) {
    this.selectedAnswer = selectedAnswer;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The selected search result chosen as the answer.")
  @JsonProperty("selectedAnswer")
  public SelectedAnswer getSelectedAnswer() {
    return selectedAnswer;
  }
  public void setSelectedAnswer(SelectedAnswer selectedAnswer) {
    this.selectedAnswer = selectedAnswer;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SearchUpdateRequest searchUpdateRequest = (SearchUpdateRequest) o;

    return Objects.equals(this.sessionId, searchUpdateRequest.sessionId) &&
            Objects.equals(this.answered, searchUpdateRequest.answered) &&
            Objects.equals(this.selectedAnswer, searchUpdateRequest.selectedAnswer);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sessionId, answered, selectedAnswer);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchUpdateRequest {\n");
    
    sb.append("    sessionId: ").append(toIndentedString(sessionId)).append("\n");
    sb.append("    answered: ").append(toIndentedString(answered)).append("\n");
    sb.append("    selectedAnswer: ").append(toIndentedString(selectedAnswer)).append("\n");
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

