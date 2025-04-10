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
import com.mypurecloud.sdk.v2.model.KnowledgeGuestAnswerDocumentResponse;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * KnowledgeGuestAnswerDocumentsResponse
 */

public class KnowledgeGuestAnswerDocumentsResponse  implements Serializable {
  
  private List<KnowledgeGuestAnswerDocumentResponse> results = null;

  public KnowledgeGuestAnswerDocumentsResponse() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      results = new ArrayList<KnowledgeGuestAnswerDocumentResponse>();
    }
  }

  
  /**
   * The results with answers.
   **/
  public KnowledgeGuestAnswerDocumentsResponse results(List<KnowledgeGuestAnswerDocumentResponse> results) {
    this.results = results;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The results with answers.")
  @JsonProperty("results")
  public List<KnowledgeGuestAnswerDocumentResponse> getResults() {
    return results;
  }
  public void setResults(List<KnowledgeGuestAnswerDocumentResponse> results) {
    this.results = results;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KnowledgeGuestAnswerDocumentsResponse knowledgeGuestAnswerDocumentsResponse = (KnowledgeGuestAnswerDocumentsResponse) o;

    return Objects.equals(this.results, knowledgeGuestAnswerDocumentsResponse.results);
  }

  @Override
  public int hashCode() {
    return Objects.hash(results);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KnowledgeGuestAnswerDocumentsResponse {\n");
    
    sb.append("    results: ").append(toIndentedString(results)).append("\n");
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

