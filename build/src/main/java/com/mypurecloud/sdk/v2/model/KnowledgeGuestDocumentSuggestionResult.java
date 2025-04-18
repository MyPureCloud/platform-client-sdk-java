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
 * KnowledgeGuestDocumentSuggestionResult
 */

public class KnowledgeGuestDocumentSuggestionResult  implements Serializable {
  
  private String matchedPhrase = null;

  public KnowledgeGuestDocumentSuggestionResult() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * Matched phrase to the autocomplete suggestions query.
   **/
  public KnowledgeGuestDocumentSuggestionResult matchedPhrase(String matchedPhrase) {
    this.matchedPhrase = matchedPhrase;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Matched phrase to the autocomplete suggestions query.")
  @JsonProperty("matchedPhrase")
  public String getMatchedPhrase() {
    return matchedPhrase;
  }
  public void setMatchedPhrase(String matchedPhrase) {
    this.matchedPhrase = matchedPhrase;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KnowledgeGuestDocumentSuggestionResult knowledgeGuestDocumentSuggestionResult = (KnowledgeGuestDocumentSuggestionResult) o;

    return Objects.equals(this.matchedPhrase, knowledgeGuestDocumentSuggestionResult.matchedPhrase);
  }

  @Override
  public int hashCode() {
    return Objects.hash(matchedPhrase);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KnowledgeGuestDocumentSuggestionResult {\n");
    
    sb.append("    matchedPhrase: ").append(toIndentedString(matchedPhrase)).append("\n");
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

