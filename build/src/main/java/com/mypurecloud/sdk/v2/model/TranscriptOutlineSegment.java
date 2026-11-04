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
 * TranscriptOutlineSegment
 */

public class TranscriptOutlineSegment  implements Serializable {
  
  private String header = null;
  private String description = null;
  private Long firstPhraseStartTimeMs = null;
  private Long lastPhraseStartTimeMs = null;

  public TranscriptOutlineSegment() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  public TranscriptOutlineSegment(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
    }
  }

  
  /**
   * The header of the outline segment.
   **/
  public TranscriptOutlineSegment header(String header) {
    this.header = header;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The header of the outline segment.")
  @JsonProperty("header")
  public String getHeader() {
    return header;
  }
  public void setHeader(String header) {
    this.header = header;
  }


  /**
   * The description of the outline segment.
   **/
  public TranscriptOutlineSegment description(String description) {
    this.description = description;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The description of the outline segment.")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }


  /**
   * The start time of the first phrase of the segment in milliseconds.
   **/
  public TranscriptOutlineSegment firstPhraseStartTimeMs(Long firstPhraseStartTimeMs) {
    this.firstPhraseStartTimeMs = firstPhraseStartTimeMs;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The start time of the first phrase of the segment in milliseconds.")
  @JsonProperty("firstPhraseStartTimeMs")
  public Long getFirstPhraseStartTimeMs() {
    return firstPhraseStartTimeMs;
  }
  public void setFirstPhraseStartTimeMs(Long firstPhraseStartTimeMs) {
    this.firstPhraseStartTimeMs = firstPhraseStartTimeMs;
  }


  /**
   * The start time of the last phrase of the segment in milliseconds.
   **/
  public TranscriptOutlineSegment lastPhraseStartTimeMs(Long lastPhraseStartTimeMs) {
    this.lastPhraseStartTimeMs = lastPhraseStartTimeMs;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The start time of the last phrase of the segment in milliseconds.")
  @JsonProperty("lastPhraseStartTimeMs")
  public Long getLastPhraseStartTimeMs() {
    return lastPhraseStartTimeMs;
  }
  public void setLastPhraseStartTimeMs(Long lastPhraseStartTimeMs) {
    this.lastPhraseStartTimeMs = lastPhraseStartTimeMs;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TranscriptOutlineSegment transcriptOutlineSegment = (TranscriptOutlineSegment) o;

    return Objects.equals(this.header, transcriptOutlineSegment.header) &&
            Objects.equals(this.description, transcriptOutlineSegment.description) &&
            Objects.equals(this.firstPhraseStartTimeMs, transcriptOutlineSegment.firstPhraseStartTimeMs) &&
            Objects.equals(this.lastPhraseStartTimeMs, transcriptOutlineSegment.lastPhraseStartTimeMs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(header, description, firstPhraseStartTimeMs, lastPhraseStartTimeMs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TranscriptOutlineSegment {\n");
    
    sb.append("    header: ").append(toIndentedString(header)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    firstPhraseStartTimeMs: ").append(toIndentedString(firstPhraseStartTimeMs)).append("\n");
    sb.append("    lastPhraseStartTimeMs: ").append(toIndentedString(lastPhraseStartTimeMs)).append("\n");
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

