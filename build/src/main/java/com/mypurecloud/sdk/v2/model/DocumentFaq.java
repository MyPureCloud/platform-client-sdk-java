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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * DocumentFaq
 */

public class DocumentFaq  implements Serializable {
  
  private String question = null;
  private String answer = null;
  private List<String> alternatives = new ArrayList<String>();

  
  /**
   * The question for this FAQ
   **/
  public DocumentFaq question(String question) {
    this.question = question;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The question for this FAQ")
  @JsonProperty("question")
  public String getQuestion() {
    return question;
  }
  public void setQuestion(String question) {
    this.question = question;
  }

  
  /**
   * The answer for this FAQ
   **/
  public DocumentFaq answer(String answer) {
    this.answer = answer;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The answer for this FAQ")
  @JsonProperty("answer")
  public String getAnswer() {
    return answer;
  }
  public void setAnswer(String answer) {
    this.answer = answer;
  }

  
  /**
   * List of Alternative questions related to the answer which helps in improving the likelihood of a match to user query
   **/
  public DocumentFaq alternatives(List<String> alternatives) {
    this.alternatives = alternatives;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "List of Alternative questions related to the answer which helps in improving the likelihood of a match to user query")
  @JsonProperty("alternatives")
  public List<String> getAlternatives() {
    return alternatives;
  }
  public void setAlternatives(List<String> alternatives) {
    this.alternatives = alternatives;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocumentFaq documentFaq = (DocumentFaq) o;
    return Objects.equals(this.question, documentFaq.question) &&
        Objects.equals(this.answer, documentFaq.answer) &&
        Objects.equals(this.alternatives, documentFaq.alternatives);
  }

  @Override
  public int hashCode() {
    return Objects.hash(question, answer, alternatives);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentFaq {\n");
    
    sb.append("    question: ").append(toIndentedString(question)).append("\n");
    sb.append("    answer: ").append(toIndentedString(answer)).append("\n");
    sb.append("    alternatives: ").append(toIndentedString(alternatives)).append("\n");
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

