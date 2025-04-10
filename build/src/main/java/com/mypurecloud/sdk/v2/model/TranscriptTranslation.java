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
import com.mypurecloud.sdk.v2.model.PhraseTranslation;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * TranscriptTranslation
 */

public class TranscriptTranslation  implements Serializable {
  
  private String id = null;
  private List<PhraseTranslation> phrases = null;
  private String translateError = null;

  public TranscriptTranslation() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      phrases = new ArrayList<PhraseTranslation>();
    }
  }

  
  /**
   * Transcript Id
   **/
  public TranscriptTranslation id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Transcript Id")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }


  /**
   * List of translated phrases, if translation succeeded
   **/
  public TranscriptTranslation phrases(List<PhraseTranslation> phrases) {
    this.phrases = phrases;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "List of translated phrases, if translation succeeded")
  @JsonProperty("phrases")
  public List<PhraseTranslation> getPhrases() {
    return phrases;
  }
  public void setPhrases(List<PhraseTranslation> phrases) {
    this.phrases = phrases;
  }


  /**
   * Translation error, if translation failed
   **/
  public TranscriptTranslation translateError(String translateError) {
    this.translateError = translateError;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Translation error, if translation failed")
  @JsonProperty("translateError")
  public String getTranslateError() {
    return translateError;
  }
  public void setTranslateError(String translateError) {
    this.translateError = translateError;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TranscriptTranslation transcriptTranslation = (TranscriptTranslation) o;

    return Objects.equals(this.id, transcriptTranslation.id) &&
            Objects.equals(this.phrases, transcriptTranslation.phrases) &&
            Objects.equals(this.translateError, transcriptTranslation.translateError);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, phrases, translateError);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TranscriptTranslation {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    phrases: ").append(toIndentedString(phrases)).append("\n");
    sb.append("    translateError: ").append(toIndentedString(translateError)).append("\n");
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

