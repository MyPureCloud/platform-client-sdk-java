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
 * Feedback
 */

public class Feedback  implements Serializable {
  
  private String suggestionId = null;
  private Boolean userProvided = null;

  private static class RelevanceEnumDeserializer extends StdDeserializer<RelevanceEnum> {
    public RelevanceEnumDeserializer() {
      super(RelevanceEnumDeserializer.class);
    }

    @Override
    public RelevanceEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return RelevanceEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Feedback relevance.
   */
 @JsonDeserialize(using = RelevanceEnumDeserializer.class)
  public enum RelevanceEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    UNKNOWN("Unknown"),
    RELEVANT("Relevant"),
    IRRELEVANT("Irrelevant");

    private String value;

    RelevanceEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static RelevanceEnum fromString(String key) {
      if (key == null) return null;

      for (RelevanceEnum value : RelevanceEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return RelevanceEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private RelevanceEnum relevance = null;

  public Feedback() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * Feedback suggestion id.
   **/
  public Feedback suggestionId(String suggestionId) {
    this.suggestionId = suggestionId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Feedback suggestion id.")
  @JsonProperty("suggestionId")
  public String getSuggestionId() {
    return suggestionId;
  }
  public void setSuggestionId(String suggestionId) {
    this.suggestionId = suggestionId;
  }


  /**
   * Indicates whether the answer/item was clicked by the human agent or not.
   **/
  public Feedback userProvided(Boolean userProvided) {
    this.userProvided = userProvided;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Indicates whether the answer/item was clicked by the human agent or not.")
  @JsonProperty("userProvided")
  public Boolean getUserProvided() {
    return userProvided;
  }
  public void setUserProvided(Boolean userProvided) {
    this.userProvided = userProvided;
  }


  /**
   * Feedback relevance.
   **/
  public Feedback relevance(RelevanceEnum relevance) {
    this.relevance = relevance;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Feedback relevance.")
  @JsonProperty("relevance")
  public RelevanceEnum getRelevance() {
    return relevance;
  }
  public void setRelevance(RelevanceEnum relevance) {
    this.relevance = relevance;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Feedback feedback = (Feedback) o;

    return Objects.equals(this.suggestionId, feedback.suggestionId) &&
            Objects.equals(this.userProvided, feedback.userProvided) &&
            Objects.equals(this.relevance, feedback.relevance);
  }

  @Override
  public int hashCode() {
    return Objects.hash(suggestionId, userProvided, relevance);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Feedback {\n");
    
    sb.append("    suggestionId: ").append(toIndentedString(suggestionId)).append("\n");
    sb.append("    userProvided: ").append(toIndentedString(userProvided)).append("\n");
    sb.append("    relevance: ").append(toIndentedString(relevance)).append("\n");
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

