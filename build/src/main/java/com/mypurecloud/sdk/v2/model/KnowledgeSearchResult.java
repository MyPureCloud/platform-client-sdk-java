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
import com.mypurecloud.sdk.v2.model.KnowledgeRetrievedReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * KnowledgeSearchResult
 */

public class KnowledgeSearchResult  implements Serializable {
  
  private String generatedAnswer = null;
  private List<KnowledgeRetrievedReference> retrievedReferences = null;

  public KnowledgeSearchResult() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      retrievedReferences = new ArrayList<KnowledgeRetrievedReference>();
    }
  }

  public KnowledgeSearchResult(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
      retrievedReferences = new ArrayList<KnowledgeRetrievedReference>();
    }
  }

  
  /**
   * The generated answer for search query.
   **/
  public KnowledgeSearchResult generatedAnswer(String generatedAnswer) {
    this.generatedAnswer = generatedAnswer;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The generated answer for search query.")
  @JsonProperty("generatedAnswer")
  public String getGeneratedAnswer() {
    return generatedAnswer;
  }
  public void setGeneratedAnswer(String generatedAnswer) {
    this.generatedAnswer = generatedAnswer;
  }


  /**
   * The retrieved references for the search query.
   **/
  public KnowledgeSearchResult retrievedReferences(List<KnowledgeRetrievedReference> retrievedReferences) {
    this.retrievedReferences = retrievedReferences;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The retrieved references for the search query.")
  @JsonProperty("retrievedReferences")
  public List<KnowledgeRetrievedReference> getRetrievedReferences() {
    return retrievedReferences;
  }
  public void setRetrievedReferences(List<KnowledgeRetrievedReference> retrievedReferences) {
    this.retrievedReferences = retrievedReferences;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KnowledgeSearchResult knowledgeSearchResult = (KnowledgeSearchResult) o;

    return Objects.equals(this.generatedAnswer, knowledgeSearchResult.generatedAnswer) &&
            Objects.equals(this.retrievedReferences, knowledgeSearchResult.retrievedReferences);
  }

  @Override
  public int hashCode() {
    return Objects.hash(generatedAnswer, retrievedReferences);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KnowledgeSearchResult {\n");
    
    sb.append("    generatedAnswer: ").append(toIndentedString(generatedAnswer)).append("\n");
    sb.append("    retrievedReferences: ").append(toIndentedString(retrievedReferences)).append("\n");
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

