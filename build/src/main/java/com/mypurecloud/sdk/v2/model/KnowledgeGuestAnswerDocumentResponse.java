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
import com.mypurecloud.sdk.v2.model.KnowledgeGuestDocumentVariationAnswer;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * KnowledgeGuestAnswerDocumentResponse
 */

public class KnowledgeGuestAnswerDocumentResponse  implements Serializable {
  
  private String id = null;
  private String title = null;
  private String answer = null;
  private KnowledgeGuestDocumentVariationAnswer variation = null;

  public KnowledgeGuestAnswerDocumentResponse() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * The document id.
   **/
  public KnowledgeGuestAnswerDocumentResponse id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The document id.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }


  /**
   * The document title.
   **/
  public KnowledgeGuestAnswerDocumentResponse title(String title) {
    this.title = title;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The document title.")
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }
  public void setTitle(String title) {
    this.title = title;
  }


  /**
   * The answer found inside a variationContent.
   **/
  public KnowledgeGuestAnswerDocumentResponse answer(String answer) {
    this.answer = answer;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The answer found inside a variationContent.")
  @JsonProperty("answer")
  public String getAnswer() {
    return answer;
  }
  public void setAnswer(String answer) {
    this.answer = answer;
  }


  /**
   * The variation with the answer's highlight data.
   **/
  public KnowledgeGuestAnswerDocumentResponse variation(KnowledgeGuestDocumentVariationAnswer variation) {
    this.variation = variation;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The variation with the answer's highlight data.")
  @JsonProperty("variation")
  public KnowledgeGuestDocumentVariationAnswer getVariation() {
    return variation;
  }
  public void setVariation(KnowledgeGuestDocumentVariationAnswer variation) {
    this.variation = variation;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KnowledgeGuestAnswerDocumentResponse knowledgeGuestAnswerDocumentResponse = (KnowledgeGuestAnswerDocumentResponse) o;

    return Objects.equals(this.id, knowledgeGuestAnswerDocumentResponse.id) &&
            Objects.equals(this.title, knowledgeGuestAnswerDocumentResponse.title) &&
            Objects.equals(this.answer, knowledgeGuestAnswerDocumentResponse.answer) &&
            Objects.equals(this.variation, knowledgeGuestAnswerDocumentResponse.variation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, title, answer, variation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KnowledgeGuestAnswerDocumentResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    answer: ").append(toIndentedString(answer)).append("\n");
    sb.append("    variation: ").append(toIndentedString(variation)).append("\n");
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

