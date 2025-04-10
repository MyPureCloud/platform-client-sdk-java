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
 * ConfusionUtterance
 */

public class ConfusionUtterance  implements Serializable {
  
  private String id = null;
  private String text = null;
  private Float similarity = null;

  public ConfusionUtterance() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }


  /**
   * Utterance Text.
   **/
  public ConfusionUtterance text(String text) {
    this.text = text;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Utterance Text.")
  @JsonProperty("text")
  public String getText() {
    return text;
  }
  public void setText(String text) {
    this.text = text;
  }


  /**
   * Utterance's similarity score, 0 being dissimilar and 1 being very similar.
   **/
  public ConfusionUtterance similarity(Float similarity) {
    this.similarity = similarity;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Utterance's similarity score, 0 being dissimilar and 1 being very similar.")
  @JsonProperty("similarity")
  public Float getSimilarity() {
    return similarity;
  }
  public void setSimilarity(Float similarity) {
    this.similarity = similarity;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConfusionUtterance confusionUtterance = (ConfusionUtterance) o;

    return Objects.equals(this.id, confusionUtterance.id) &&
            Objects.equals(this.text, confusionUtterance.text) &&
            Objects.equals(this.similarity, confusionUtterance.similarity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, text, similarity);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConfusionUtterance {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    similarity: ").append(toIndentedString(similarity)).append("\n");
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

