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
import com.mypurecloud.sdk.v2.model.TranscriptionTopicTranscriptWord;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * TranscriptionTopicTranscriptAlternative
 */

public class TranscriptionTopicTranscriptAlternative  implements Serializable {
  
  private BigDecimal confidence = null;
  private Long offsetMs = null;
  private Long durationMs = null;
  private String transcript = null;
  private List<TranscriptionTopicTranscriptWord> words = null;
  private String decoratedTranscript = null;
  private List<TranscriptionTopicTranscriptWord> decoratedWords = null;

  public TranscriptionTopicTranscriptAlternative() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      words = new ArrayList<TranscriptionTopicTranscriptWord>();
      decoratedWords = new ArrayList<TranscriptionTopicTranscriptWord>();
    }
  }

  
  /**
   **/
  public TranscriptionTopicTranscriptAlternative confidence(BigDecimal confidence) {
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
  public TranscriptionTopicTranscriptAlternative offsetMs(Long offsetMs) {
    this.offsetMs = offsetMs;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("offsetMs")
  public Long getOffsetMs() {
    return offsetMs;
  }
  public void setOffsetMs(Long offsetMs) {
    this.offsetMs = offsetMs;
  }


  /**
   **/
  public TranscriptionTopicTranscriptAlternative durationMs(Long durationMs) {
    this.durationMs = durationMs;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("durationMs")
  public Long getDurationMs() {
    return durationMs;
  }
  public void setDurationMs(Long durationMs) {
    this.durationMs = durationMs;
  }


  /**
   **/
  public TranscriptionTopicTranscriptAlternative transcript(String transcript) {
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
  public TranscriptionTopicTranscriptAlternative words(List<TranscriptionTopicTranscriptWord> words) {
    this.words = words;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("words")
  public List<TranscriptionTopicTranscriptWord> getWords() {
    return words;
  }
  public void setWords(List<TranscriptionTopicTranscriptWord> words) {
    this.words = words;
  }


  /**
   **/
  public TranscriptionTopicTranscriptAlternative decoratedTranscript(String decoratedTranscript) {
    this.decoratedTranscript = decoratedTranscript;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("decoratedTranscript")
  public String getDecoratedTranscript() {
    return decoratedTranscript;
  }
  public void setDecoratedTranscript(String decoratedTranscript) {
    this.decoratedTranscript = decoratedTranscript;
  }


  /**
   **/
  public TranscriptionTopicTranscriptAlternative decoratedWords(List<TranscriptionTopicTranscriptWord> decoratedWords) {
    this.decoratedWords = decoratedWords;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("decoratedWords")
  public List<TranscriptionTopicTranscriptWord> getDecoratedWords() {
    return decoratedWords;
  }
  public void setDecoratedWords(List<TranscriptionTopicTranscriptWord> decoratedWords) {
    this.decoratedWords = decoratedWords;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TranscriptionTopicTranscriptAlternative transcriptionTopicTranscriptAlternative = (TranscriptionTopicTranscriptAlternative) o;

    return Objects.equals(this.confidence, transcriptionTopicTranscriptAlternative.confidence) &&
            Objects.equals(this.offsetMs, transcriptionTopicTranscriptAlternative.offsetMs) &&
            Objects.equals(this.durationMs, transcriptionTopicTranscriptAlternative.durationMs) &&
            Objects.equals(this.transcript, transcriptionTopicTranscriptAlternative.transcript) &&
            Objects.equals(this.words, transcriptionTopicTranscriptAlternative.words) &&
            Objects.equals(this.decoratedTranscript, transcriptionTopicTranscriptAlternative.decoratedTranscript) &&
            Objects.equals(this.decoratedWords, transcriptionTopicTranscriptAlternative.decoratedWords);
  }

  @Override
  public int hashCode() {
    return Objects.hash(confidence, offsetMs, durationMs, transcript, words, decoratedTranscript, decoratedWords);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TranscriptionTopicTranscriptAlternative {\n");
    
    sb.append("    confidence: ").append(toIndentedString(confidence)).append("\n");
    sb.append("    offsetMs: ").append(toIndentedString(offsetMs)).append("\n");
    sb.append("    durationMs: ").append(toIndentedString(durationMs)).append("\n");
    sb.append("    transcript: ").append(toIndentedString(transcript)).append("\n");
    sb.append("    words: ").append(toIndentedString(words)).append("\n");
    sb.append("    decoratedTranscript: ").append(toIndentedString(decoratedTranscript)).append("\n");
    sb.append("    decoratedWords: ").append(toIndentedString(decoratedWords)).append("\n");
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

