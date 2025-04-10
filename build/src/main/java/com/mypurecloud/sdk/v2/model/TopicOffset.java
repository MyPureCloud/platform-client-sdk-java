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
 * TopicOffset
 */

public class TopicOffset  implements Serializable {
  
  private Long wordCount = null;
  private Long characterCount = null;

  public TopicOffset() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  @ApiModelProperty(example = "null", value = "Count of words before the topic ")
  @JsonProperty("wordCount")
  public Long getWordCount() {
    return wordCount;
  }


  @ApiModelProperty(example = "null", value = "Count of characters before the topic ")
  @JsonProperty("characterCount")
  public Long getCharacterCount() {
    return characterCount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TopicOffset topicOffset = (TopicOffset) o;

    return Objects.equals(this.wordCount, topicOffset.wordCount) &&
            Objects.equals(this.characterCount, topicOffset.characterCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(wordCount, characterCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TopicOffset {\n");
    
    sb.append("    wordCount: ").append(toIndentedString(wordCount)).append("\n");
    sb.append("    characterCount: ").append(toIndentedString(characterCount)).append("\n");
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

