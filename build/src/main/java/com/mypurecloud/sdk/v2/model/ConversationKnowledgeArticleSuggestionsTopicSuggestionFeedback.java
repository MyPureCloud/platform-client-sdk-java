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
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * ConversationKnowledgeArticleSuggestionsTopicSuggestionFeedback
 */

public class ConversationKnowledgeArticleSuggestionsTopicSuggestionFeedback  implements Serializable {
  

  private static class RatingEnumDeserializer extends StdDeserializer<RatingEnum> {
    public RatingEnumDeserializer() {
      super(RatingEnumDeserializer.class);
    }

    @Override
    public RatingEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return RatingEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Gets or Sets rating
   */
 @JsonDeserialize(using = RatingEnumDeserializer.class)
  public enum RatingEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    UNKNOWN("Unknown"),
    NEGATIVE("Negative"),
    POSITIVE("Positive");

    private String value;

    RatingEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static RatingEnum fromString(String key) {
      if (key == null) return null;

      for (RatingEnum value : RatingEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return RatingEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private RatingEnum rating = null;

  public ConversationKnowledgeArticleSuggestionsTopicSuggestionFeedback() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   **/
  public ConversationKnowledgeArticleSuggestionsTopicSuggestionFeedback rating(RatingEnum rating) {
    this.rating = rating;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("rating")
  public RatingEnum getRating() {
    return rating;
  }
  public void setRating(RatingEnum rating) {
    this.rating = rating;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConversationKnowledgeArticleSuggestionsTopicSuggestionFeedback conversationKnowledgeArticleSuggestionsTopicSuggestionFeedback = (ConversationKnowledgeArticleSuggestionsTopicSuggestionFeedback) o;

    return Objects.equals(this.rating, conversationKnowledgeArticleSuggestionsTopicSuggestionFeedback.rating);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rating);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConversationKnowledgeArticleSuggestionsTopicSuggestionFeedback {\n");
    
    sb.append("    rating: ").append(toIndentedString(rating)).append("\n");
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

