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
 * SuggestionKnowledgeAnswer
 */

public class SuggestionKnowledgeAnswer  implements Serializable {
  
  private String answer = null;
  private Integer startIndex = null;
  private Integer endIndex = null;

  
  @ApiModelProperty(example = "null", value = "The most relevant answer")
  @JsonProperty("answer")
  public String getAnswer() {
    return answer;
  }


  @ApiModelProperty(example = "null", value = "The start index of the answer")
  @JsonProperty("startIndex")
  public Integer getStartIndex() {
    return startIndex;
  }


  @ApiModelProperty(example = "null", value = "The end index of the answer")
  @JsonProperty("endIndex")
  public Integer getEndIndex() {
    return endIndex;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SuggestionKnowledgeAnswer suggestionKnowledgeAnswer = (SuggestionKnowledgeAnswer) o;

    return Objects.equals(this.answer, suggestionKnowledgeAnswer.answer) &&
            Objects.equals(this.startIndex, suggestionKnowledgeAnswer.startIndex) &&
            Objects.equals(this.endIndex, suggestionKnowledgeAnswer.endIndex);
  }

  @Override
  public int hashCode() {
    return Objects.hash(answer, startIndex, endIndex);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SuggestionKnowledgeAnswer {\n");
    
    sb.append("    answer: ").append(toIndentedString(answer)).append("\n");
    sb.append("    startIndex: ").append(toIndentedString(startIndex)).append("\n");
    sb.append("    endIndex: ").append(toIndentedString(endIndex)).append("\n");
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

