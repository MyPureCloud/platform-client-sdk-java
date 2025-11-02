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
import com.mypurecloud.sdk.v2.model.SuggestedSearchChunk;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * SuggestionGeneratedKnowledgeAnswer
 */

public class SuggestionGeneratedKnowledgeAnswer  implements Serializable {
  
  private String searchId = null;
  private String knowledgeAnswerGenerated = null;
  private List<SuggestedSearchChunk> suggestedSearchChunks = null;

  public SuggestionGeneratedKnowledgeAnswer() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      suggestedSearchChunks = new ArrayList<SuggestedSearchChunk>();
    }
  }

  
  @ApiModelProperty(example = "null", value = "The search id.")
  @JsonProperty("searchId")
  public String getSearchId() {
    return searchId;
  }


  @ApiModelProperty(example = "null", value = "The knowledge answer generated.")
  @JsonProperty("knowledgeAnswerGenerated")
  public String getKnowledgeAnswerGenerated() {
    return knowledgeAnswerGenerated;
  }


  @ApiModelProperty(example = "null", value = "The suggested search chunks.")
  @JsonProperty("suggestedSearchChunks")
  public List<SuggestedSearchChunk> getSuggestedSearchChunks() {
    return suggestedSearchChunks;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SuggestionGeneratedKnowledgeAnswer suggestionGeneratedKnowledgeAnswer = (SuggestionGeneratedKnowledgeAnswer) o;

    return Objects.equals(this.searchId, suggestionGeneratedKnowledgeAnswer.searchId) &&
            Objects.equals(this.knowledgeAnswerGenerated, suggestionGeneratedKnowledgeAnswer.knowledgeAnswerGenerated) &&
            Objects.equals(this.suggestedSearchChunks, suggestionGeneratedKnowledgeAnswer.suggestedSearchChunks);
  }

  @Override
  public int hashCode() {
    return Objects.hash(searchId, knowledgeAnswerGenerated, suggestedSearchChunks);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SuggestionGeneratedKnowledgeAnswer {\n");
    
    sb.append("    searchId: ").append(toIndentedString(searchId)).append("\n");
    sb.append("    knowledgeAnswerGenerated: ").append(toIndentedString(knowledgeAnswerGenerated)).append("\n");
    sb.append("    suggestedSearchChunks: ").append(toIndentedString(suggestedSearchChunks)).append("\n");
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

