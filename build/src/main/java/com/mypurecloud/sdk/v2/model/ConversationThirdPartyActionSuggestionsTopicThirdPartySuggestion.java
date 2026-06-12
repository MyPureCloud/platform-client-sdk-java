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
import com.mypurecloud.sdk.v2.model.ConversationThirdPartyActionSuggestionsTopicThirdPartySuggestionSource;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * ConversationThirdPartyActionSuggestionsTopicThirdPartySuggestion
 */

public class ConversationThirdPartyActionSuggestionsTopicThirdPartySuggestion  implements Serializable {
  
  private String text = null;
  private String title = null;
  private List<ConversationThirdPartyActionSuggestionsTopicThirdPartySuggestionSource> sources = null;

  public ConversationThirdPartyActionSuggestionsTopicThirdPartySuggestion() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      sources = new ArrayList<ConversationThirdPartyActionSuggestionsTopicThirdPartySuggestionSource>();
    }
  }

  public ConversationThirdPartyActionSuggestionsTopicThirdPartySuggestion(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
      sources = new ArrayList<ConversationThirdPartyActionSuggestionsTopicThirdPartySuggestionSource>();
    }
  }

  
  /**
   **/
  public ConversationThirdPartyActionSuggestionsTopicThirdPartySuggestion text(String text) {
    this.text = text;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("text")
  public String getText() {
    return text;
  }
  public void setText(String text) {
    this.text = text;
  }


  /**
   **/
  public ConversationThirdPartyActionSuggestionsTopicThirdPartySuggestion title(String title) {
    this.title = title;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }
  public void setTitle(String title) {
    this.title = title;
  }


  /**
   **/
  public ConversationThirdPartyActionSuggestionsTopicThirdPartySuggestion sources(List<ConversationThirdPartyActionSuggestionsTopicThirdPartySuggestionSource> sources) {
    this.sources = sources;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("sources")
  public List<ConversationThirdPartyActionSuggestionsTopicThirdPartySuggestionSource> getSources() {
    return sources;
  }
  public void setSources(List<ConversationThirdPartyActionSuggestionsTopicThirdPartySuggestionSource> sources) {
    this.sources = sources;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConversationThirdPartyActionSuggestionsTopicThirdPartySuggestion conversationThirdPartyActionSuggestionsTopicThirdPartySuggestion = (ConversationThirdPartyActionSuggestionsTopicThirdPartySuggestion) o;

    return Objects.equals(this.text, conversationThirdPartyActionSuggestionsTopicThirdPartySuggestion.text) &&
            Objects.equals(this.title, conversationThirdPartyActionSuggestionsTopicThirdPartySuggestion.title) &&
            Objects.equals(this.sources, conversationThirdPartyActionSuggestionsTopicThirdPartySuggestion.sources);
  }

  @Override
  public int hashCode() {
    return Objects.hash(text, title, sources);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConversationThirdPartyActionSuggestionsTopicThirdPartySuggestion {\n");
    
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    sources: ").append(toIndentedString(sources)).append("\n");
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

