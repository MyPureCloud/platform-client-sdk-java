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
import com.mypurecloud.sdk.v2.model.AnswerGenerationDocument;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * KnowledgeAnswerGenerationResponse
 */

public class KnowledgeAnswerGenerationResponse  implements Serializable {
  
  private String answer = null;
  private List<AnswerGenerationDocument> documents = null;

  public KnowledgeAnswerGenerationResponse() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      documents = new ArrayList<AnswerGenerationDocument>();
    }
  }

  
  /**
   * The AI-generated answer.
   **/
  public KnowledgeAnswerGenerationResponse answer(String answer) {
    this.answer = answer;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The AI-generated answer.")
  @JsonProperty("answer")
  public String getAnswer() {
    return answer;
  }
  public void setAnswer(String answer) {
    this.answer = answer;
  }


  /**
   * The documents used for answer generation.
   **/
  public KnowledgeAnswerGenerationResponse documents(List<AnswerGenerationDocument> documents) {
    this.documents = documents;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The documents used for answer generation.")
  @JsonProperty("documents")
  public List<AnswerGenerationDocument> getDocuments() {
    return documents;
  }
  public void setDocuments(List<AnswerGenerationDocument> documents) {
    this.documents = documents;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KnowledgeAnswerGenerationResponse knowledgeAnswerGenerationResponse = (KnowledgeAnswerGenerationResponse) o;

    return Objects.equals(this.answer, knowledgeAnswerGenerationResponse.answer) &&
            Objects.equals(this.documents, knowledgeAnswerGenerationResponse.documents);
  }

  @Override
  public int hashCode() {
    return Objects.hash(answer, documents);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KnowledgeAnswerGenerationResponse {\n");
    
    sb.append("    answer: ").append(toIndentedString(answer)).append("\n");
    sb.append("    documents: ").append(toIndentedString(documents)).append("\n");
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

