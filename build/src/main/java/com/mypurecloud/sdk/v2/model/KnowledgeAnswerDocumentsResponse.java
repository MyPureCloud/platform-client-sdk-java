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
import com.mypurecloud.sdk.v2.model.KnowledgeAnswerDocumentResponse;
import com.mypurecloud.sdk.v2.model.KnowledgeAnswerGenerationResponse;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * KnowledgeAnswerDocumentsResponse
 */

public class KnowledgeAnswerDocumentsResponse  implements Serializable {
  
  private List<KnowledgeAnswerDocumentResponse> results = new ArrayList<KnowledgeAnswerDocumentResponse>();
  private KnowledgeAnswerGenerationResponse answerGeneration = null;

  
  /**
   * The results with answers if the answerMode request property is not set or contains \"AnswerHighlight\". Empty array otherwise.
   **/
  public KnowledgeAnswerDocumentsResponse results(List<KnowledgeAnswerDocumentResponse> results) {
    this.results = results;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The results with answers if the answerMode request property is not set or contains \"AnswerHighlight\". Empty array otherwise.")
  @JsonProperty("results")
  public List<KnowledgeAnswerDocumentResponse> getResults() {
    return results;
  }
  public void setResults(List<KnowledgeAnswerDocumentResponse> results) {
    this.results = results;
  }


  /**
   * The results with AI-generated answer if the answerMode request property contains \"AnswerGeneration\".
   **/
  public KnowledgeAnswerDocumentsResponse answerGeneration(KnowledgeAnswerGenerationResponse answerGeneration) {
    this.answerGeneration = answerGeneration;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The results with AI-generated answer if the answerMode request property contains \"AnswerGeneration\".")
  @JsonProperty("answerGeneration")
  public KnowledgeAnswerGenerationResponse getAnswerGeneration() {
    return answerGeneration;
  }
  public void setAnswerGeneration(KnowledgeAnswerGenerationResponse answerGeneration) {
    this.answerGeneration = answerGeneration;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KnowledgeAnswerDocumentsResponse knowledgeAnswerDocumentsResponse = (KnowledgeAnswerDocumentsResponse) o;

    return Objects.equals(this.results, knowledgeAnswerDocumentsResponse.results) &&
            Objects.equals(this.answerGeneration, knowledgeAnswerDocumentsResponse.answerGeneration);
  }

  @Override
  public int hashCode() {
    return Objects.hash(results, answerGeneration);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KnowledgeAnswerDocumentsResponse {\n");
    
    sb.append("    results: ").append(toIndentedString(results)).append("\n");
    sb.append("    answerGeneration: ").append(toIndentedString(answerGeneration)).append("\n");
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

