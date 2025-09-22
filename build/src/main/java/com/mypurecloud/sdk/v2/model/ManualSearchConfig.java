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
 * ManualSearchConfig
 */

public class ManualSearchConfig  implements Serializable {
  
  private Boolean articlesWithAnswerHighlights = null;
  private Boolean answerGeneration = null;

  public ManualSearchConfig() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * Articles with answer highlights.
   **/
  public ManualSearchConfig articlesWithAnswerHighlights(Boolean articlesWithAnswerHighlights) {
    this.articlesWithAnswerHighlights = articlesWithAnswerHighlights;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Articles with answer highlights.")
  @JsonProperty("articlesWithAnswerHighlights")
  public Boolean getArticlesWithAnswerHighlights() {
    return articlesWithAnswerHighlights;
  }
  public void setArticlesWithAnswerHighlights(Boolean articlesWithAnswerHighlights) {
    this.articlesWithAnswerHighlights = articlesWithAnswerHighlights;
  }


  /**
   * Answer generation.
   **/
  public ManualSearchConfig answerGeneration(Boolean answerGeneration) {
    this.answerGeneration = answerGeneration;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Answer generation.")
  @JsonProperty("answerGeneration")
  public Boolean getAnswerGeneration() {
    return answerGeneration;
  }
  public void setAnswerGeneration(Boolean answerGeneration) {
    this.answerGeneration = answerGeneration;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ManualSearchConfig manualSearchConfig = (ManualSearchConfig) o;

    return Objects.equals(this.articlesWithAnswerHighlights, manualSearchConfig.articlesWithAnswerHighlights) &&
            Objects.equals(this.answerGeneration, manualSearchConfig.answerGeneration);
  }

  @Override
  public int hashCode() {
    return Objects.hash(articlesWithAnswerHighlights, answerGeneration);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ManualSearchConfig {\n");
    
    sb.append("    articlesWithAnswerHighlights: ").append(toIndentedString(articlesWithAnswerHighlights)).append("\n");
    sb.append("    answerGeneration: ").append(toIndentedString(answerGeneration)).append("\n");
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

