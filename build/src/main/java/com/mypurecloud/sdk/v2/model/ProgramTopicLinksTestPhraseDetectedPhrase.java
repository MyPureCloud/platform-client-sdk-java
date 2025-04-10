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
 * ProgramTopicLinksTestPhraseDetectedPhrase
 */

public class ProgramTopicLinksTestPhraseDetectedPhrase  implements Serializable {
  
  private String foundPhrase = null;
  private String snippet = null;
  private Long confidence = null;

  public ProgramTopicLinksTestPhraseDetectedPhrase() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   **/
  public ProgramTopicLinksTestPhraseDetectedPhrase foundPhrase(String foundPhrase) {
    this.foundPhrase = foundPhrase;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("foundPhrase")
  public String getFoundPhrase() {
    return foundPhrase;
  }
  public void setFoundPhrase(String foundPhrase) {
    this.foundPhrase = foundPhrase;
  }


  /**
   **/
  public ProgramTopicLinksTestPhraseDetectedPhrase snippet(String snippet) {
    this.snippet = snippet;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("snippet")
  public String getSnippet() {
    return snippet;
  }
  public void setSnippet(String snippet) {
    this.snippet = snippet;
  }


  /**
   **/
  public ProgramTopicLinksTestPhraseDetectedPhrase confidence(Long confidence) {
    this.confidence = confidence;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("confidence")
  public Long getConfidence() {
    return confidence;
  }
  public void setConfidence(Long confidence) {
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
    ProgramTopicLinksTestPhraseDetectedPhrase programTopicLinksTestPhraseDetectedPhrase = (ProgramTopicLinksTestPhraseDetectedPhrase) o;

    return Objects.equals(this.foundPhrase, programTopicLinksTestPhraseDetectedPhrase.foundPhrase) &&
            Objects.equals(this.snippet, programTopicLinksTestPhraseDetectedPhrase.snippet) &&
            Objects.equals(this.confidence, programTopicLinksTestPhraseDetectedPhrase.confidence);
  }

  @Override
  public int hashCode() {
    return Objects.hash(foundPhrase, snippet, confidence);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProgramTopicLinksTestPhraseDetectedPhrase {\n");
    
    sb.append("    foundPhrase: ").append(toIndentedString(foundPhrase)).append("\n");
    sb.append("    snippet: ").append(toIndentedString(snippet)).append("\n");
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

