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
import com.mypurecloud.sdk.v2.model.TranscriptionsTopicTranscriptWord;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * TranscriptionsTopicTranscriptAlternative
 */

public class TranscriptionsTopicTranscriptAlternative  implements Serializable {
  
  private BigDecimal confidence = null;
  private String transcript = null;
  private List<TranscriptionsTopicTranscriptWord> words = new ArrayList<TranscriptionsTopicTranscriptWord>();

  
  /**
   **/
  public TranscriptionsTopicTranscriptAlternative confidence(BigDecimal confidence) {
    this.confidence = confidence;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("confidence")
  public BigDecimal getConfidence() {
    return confidence;
  }
  public void setConfidence(BigDecimal confidence) {
    this.confidence = confidence;
  }

  
  /**
   **/
  public TranscriptionsTopicTranscriptAlternative transcript(String transcript) {
    this.transcript = transcript;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("transcript")
  public String getTranscript() {
    return transcript;
  }
  public void setTranscript(String transcript) {
    this.transcript = transcript;
  }

  
  /**
   **/
  public TranscriptionsTopicTranscriptAlternative words(List<TranscriptionsTopicTranscriptWord> words) {
    this.words = words;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("words")
  public List<TranscriptionsTopicTranscriptWord> getWords() {
    return words;
  }
  public void setWords(List<TranscriptionsTopicTranscriptWord> words) {
    this.words = words;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TranscriptionsTopicTranscriptAlternative transcriptionsTopicTranscriptAlternative = (TranscriptionsTopicTranscriptAlternative) o;
    return Objects.equals(this.confidence, transcriptionsTopicTranscriptAlternative.confidence) &&
        Objects.equals(this.transcript, transcriptionsTopicTranscriptAlternative.transcript) &&
        Objects.equals(this.words, transcriptionsTopicTranscriptAlternative.words);
  }

  @Override
  public int hashCode() {
    return Objects.hash(confidence, transcript, words);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TranscriptionsTopicTranscriptAlternative {\n");
    
    sb.append("    confidence: ").append(toIndentedString(confidence)).append("\n");
    sb.append("    transcript: ").append(toIndentedString(transcript)).append("\n");
    sb.append("    words: ").append(toIndentedString(words)).append("\n");
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

