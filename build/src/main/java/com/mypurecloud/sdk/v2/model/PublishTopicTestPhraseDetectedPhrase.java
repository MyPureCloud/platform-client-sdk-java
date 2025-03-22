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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * PublishTopicTestPhraseDetectedPhrase
 */

public class PublishTopicTestPhraseDetectedPhrase  implements Serializable {
  
  private String foundPhrase = null;
  private String snippet = null;
  private Integer confidence = null;

  
  /**
   **/
  public PublishTopicTestPhraseDetectedPhrase foundPhrase(String foundPhrase) {
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
  public PublishTopicTestPhraseDetectedPhrase snippet(String snippet) {
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
  public PublishTopicTestPhraseDetectedPhrase confidence(Integer confidence) {
    this.confidence = confidence;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("confidence")
  public Integer getConfidence() {
    return confidence;
  }
  public void setConfidence(Integer confidence) {
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
    PublishTopicTestPhraseDetectedPhrase publishTopicTestPhraseDetectedPhrase = (PublishTopicTestPhraseDetectedPhrase) o;

    return Objects.equals(this.foundPhrase, publishTopicTestPhraseDetectedPhrase.foundPhrase) &&
            Objects.equals(this.snippet, publishTopicTestPhraseDetectedPhrase.snippet) &&
            Objects.equals(this.confidence, publishTopicTestPhraseDetectedPhrase.confidence);
  }

  @Override
  public int hashCode() {
    return Objects.hash(foundPhrase, snippet, confidence);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PublishTopicTestPhraseDetectedPhrase {\n");
    
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

