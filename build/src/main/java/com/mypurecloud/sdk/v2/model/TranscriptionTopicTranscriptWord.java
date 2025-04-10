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
import java.math.BigDecimal;

import java.io.Serializable;
/**
 * TranscriptionTopicTranscriptWord
 */

public class TranscriptionTopicTranscriptWord  implements Serializable {
  
  private BigDecimal confidence = null;
  private Long startTimeMs = null;
  private Long offsetMs = null;
  private Long durationMs = null;
  private String word = null;

  public TranscriptionTopicTranscriptWord() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   **/
  public TranscriptionTopicTranscriptWord confidence(BigDecimal confidence) {
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
  public TranscriptionTopicTranscriptWord startTimeMs(Long startTimeMs) {
    this.startTimeMs = startTimeMs;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("startTimeMs")
  public Long getStartTimeMs() {
    return startTimeMs;
  }
  public void setStartTimeMs(Long startTimeMs) {
    this.startTimeMs = startTimeMs;
  }


  /**
   **/
  public TranscriptionTopicTranscriptWord offsetMs(Long offsetMs) {
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
  public TranscriptionTopicTranscriptWord durationMs(Long durationMs) {
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
  public TranscriptionTopicTranscriptWord word(String word) {
    this.word = word;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("word")
  public String getWord() {
    return word;
  }
  public void setWord(String word) {
    this.word = word;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TranscriptionTopicTranscriptWord transcriptionTopicTranscriptWord = (TranscriptionTopicTranscriptWord) o;

    return Objects.equals(this.confidence, transcriptionTopicTranscriptWord.confidence) &&
            Objects.equals(this.startTimeMs, transcriptionTopicTranscriptWord.startTimeMs) &&
            Objects.equals(this.offsetMs, transcriptionTopicTranscriptWord.offsetMs) &&
            Objects.equals(this.durationMs, transcriptionTopicTranscriptWord.durationMs) &&
            Objects.equals(this.word, transcriptionTopicTranscriptWord.word);
  }

  @Override
  public int hashCode() {
    return Objects.hash(confidence, startTimeMs, offsetMs, durationMs, word);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TranscriptionTopicTranscriptWord {\n");
    
    sb.append("    confidence: ").append(toIndentedString(confidence)).append("\n");
    sb.append("    startTimeMs: ").append(toIndentedString(startTimeMs)).append("\n");
    sb.append("    offsetMs: ").append(toIndentedString(offsetMs)).append("\n");
    sb.append("    durationMs: ").append(toIndentedString(durationMs)).append("\n");
    sb.append("    word: ").append(toIndentedString(word)).append("\n");
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

