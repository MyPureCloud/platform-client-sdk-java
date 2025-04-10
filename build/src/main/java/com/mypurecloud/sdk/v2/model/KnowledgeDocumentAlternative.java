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
 * KnowledgeDocumentAlternative
 */

public class KnowledgeDocumentAlternative  implements Serializable {
  
  private String phrase = null;
  private Boolean autocomplete = null;

  public KnowledgeDocumentAlternative() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * Alternate phrasing to the document title, having a limit of 500 words.
   **/
  public KnowledgeDocumentAlternative phrase(String phrase) {
    this.phrase = phrase;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Alternate phrasing to the document title, having a limit of 500 words.")
  @JsonProperty("phrase")
  public String getPhrase() {
    return phrase;
  }
  public void setPhrase(String phrase) {
    this.phrase = phrase;
  }


  /**
   * Autocomplete enabled for the alternate phrase.
   **/
  public KnowledgeDocumentAlternative autocomplete(Boolean autocomplete) {
    this.autocomplete = autocomplete;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Autocomplete enabled for the alternate phrase.")
  @JsonProperty("autocomplete")
  public Boolean getAutocomplete() {
    return autocomplete;
  }
  public void setAutocomplete(Boolean autocomplete) {
    this.autocomplete = autocomplete;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KnowledgeDocumentAlternative knowledgeDocumentAlternative = (KnowledgeDocumentAlternative) o;

    return Objects.equals(this.phrase, knowledgeDocumentAlternative.phrase) &&
            Objects.equals(this.autocomplete, knowledgeDocumentAlternative.autocomplete);
  }

  @Override
  public int hashCode() {
    return Objects.hash(phrase, autocomplete);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KnowledgeDocumentAlternative {\n");
    
    sb.append("    phrase: ").append(toIndentedString(phrase)).append("\n");
    sb.append("    autocomplete: ").append(toIndentedString(autocomplete)).append("\n");
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

