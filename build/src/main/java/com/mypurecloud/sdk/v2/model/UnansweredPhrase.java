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
 * UnansweredPhrase
 */

public class UnansweredPhrase  implements Serializable {
  
  private String id = null;
  private String text = null;
  private Integer unlinkedPhraseHitCount = null;

  
  /**
   * Id of an unanswered phrase
   **/
  public UnansweredPhrase id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Id of an unanswered phrase")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }


  /**
   * Phrase text of an unanswered phrase
   **/
  public UnansweredPhrase text(String text) {
    this.text = text;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Phrase text of an unanswered phrase")
  @JsonProperty("text")
  public String getText() {
    return text;
  }
  public void setText(String text) {
    this.text = text;
  }


  /**
   * Hit count of an unlinked phrase
   **/
  public UnansweredPhrase unlinkedPhraseHitCount(Integer unlinkedPhraseHitCount) {
    this.unlinkedPhraseHitCount = unlinkedPhraseHitCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Hit count of an unlinked phrase")
  @JsonProperty("unlinkedPhraseHitCount")
  public Integer getUnlinkedPhraseHitCount() {
    return unlinkedPhraseHitCount;
  }
  public void setUnlinkedPhraseHitCount(Integer unlinkedPhraseHitCount) {
    this.unlinkedPhraseHitCount = unlinkedPhraseHitCount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UnansweredPhrase unansweredPhrase = (UnansweredPhrase) o;

    return Objects.equals(this.id, unansweredPhrase.id) &&
            Objects.equals(this.text, unansweredPhrase.text) &&
            Objects.equals(this.unlinkedPhraseHitCount, unansweredPhrase.unlinkedPhraseHitCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, text, unlinkedPhraseHitCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UnansweredPhrase {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    unlinkedPhraseHitCount: ").append(toIndentedString(unlinkedPhraseHitCount)).append("\n");
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

