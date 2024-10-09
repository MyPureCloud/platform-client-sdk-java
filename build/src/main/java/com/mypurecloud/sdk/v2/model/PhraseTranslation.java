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
 * PhraseTranslation
 */

public class PhraseTranslation  implements Serializable {
  
  private Long startTimeMs = null;
  private String participantPurpose = null;
  private String translatedText = null;

  
  /**
   * Epoch start time of the phrase
   **/
  public PhraseTranslation startTimeMs(Long startTimeMs) {
    this.startTimeMs = startTimeMs;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Epoch start time of the phrase")
  @JsonProperty("startTimeMs")
  public Long getStartTimeMs() {
    return startTimeMs;
  }
  public void setStartTimeMs(Long startTimeMs) {
    this.startTimeMs = startTimeMs;
  }


  /**
   * Purpose of the participant associated with the phrase
   **/
  public PhraseTranslation participantPurpose(String participantPurpose) {
    this.participantPurpose = participantPurpose;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Purpose of the participant associated with the phrase")
  @JsonProperty("participantPurpose")
  public String getParticipantPurpose() {
    return participantPurpose;
  }
  public void setParticipantPurpose(String participantPurpose) {
    this.participantPurpose = participantPurpose;
  }


  /**
   * Translation of the phrase
   **/
  public PhraseTranslation translatedText(String translatedText) {
    this.translatedText = translatedText;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Translation of the phrase")
  @JsonProperty("translatedText")
  public String getTranslatedText() {
    return translatedText;
  }
  public void setTranslatedText(String translatedText) {
    this.translatedText = translatedText;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PhraseTranslation phraseTranslation = (PhraseTranslation) o;

    return Objects.equals(this.startTimeMs, phraseTranslation.startTimeMs) &&
            Objects.equals(this.participantPurpose, phraseTranslation.participantPurpose) &&
            Objects.equals(this.translatedText, phraseTranslation.translatedText);
  }

  @Override
  public int hashCode() {
    return Objects.hash(startTimeMs, participantPurpose, translatedText);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PhraseTranslation {\n");
    
    sb.append("    startTimeMs: ").append(toIndentedString(startTimeMs)).append("\n");
    sb.append("    participantPurpose: ").append(toIndentedString(participantPurpose)).append("\n");
    sb.append("    translatedText: ").append(toIndentedString(translatedText)).append("\n");
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

