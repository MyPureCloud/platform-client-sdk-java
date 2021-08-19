package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import java.util.Objects;
import java.io.IOException;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * ReportingTurnKnowledgeDocument
 */

public class ReportingTurnKnowledgeDocument  implements Serializable {
  
  private String id = null;
  private String question = null;
  private String answer = null;
  private Double confidence = null;

  
  /**
   * The ID of the knowledge document.
   **/
  public ReportingTurnKnowledgeDocument id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The ID of the knowledge document.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  
  /**
   * The the question that was used to match against the search query.
   **/
  public ReportingTurnKnowledgeDocument question(String question) {
    this.question = question;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The the question that was used to match against the search query.")
  @JsonProperty("question")
  public String getQuestion() {
    return question;
  }
  public void setQuestion(String question) {
    this.question = question;
  }

  
  /**
   * The corresponding answer to the question.
   **/
  public ReportingTurnKnowledgeDocument answer(String answer) {
    this.answer = answer;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The corresponding answer to the question.")
  @JsonProperty("answer")
  public String getAnswer() {
    return answer;
  }
  public void setAnswer(String answer) {
    this.answer = answer;
  }

  
  /**
   * The confidence score of how well the question matched the search query.
   **/
  public ReportingTurnKnowledgeDocument confidence(Double confidence) {
    this.confidence = confidence;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The confidence score of how well the question matched the search query.")
  @JsonProperty("confidence")
  public Double getConfidence() {
    return confidence;
  }
  public void setConfidence(Double confidence) {
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
    ReportingTurnKnowledgeDocument reportingTurnKnowledgeDocument = (ReportingTurnKnowledgeDocument) o;
    return Objects.equals(this.id, reportingTurnKnowledgeDocument.id) &&
        Objects.equals(this.question, reportingTurnKnowledgeDocument.question) &&
        Objects.equals(this.answer, reportingTurnKnowledgeDocument.answer) &&
        Objects.equals(this.confidence, reportingTurnKnowledgeDocument.confidence);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, question, answer, confidence);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportingTurnKnowledgeDocument {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    question: ").append(toIndentedString(question)).append("\n");
    sb.append("    answer: ").append(toIndentedString(answer)).append("\n");
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

