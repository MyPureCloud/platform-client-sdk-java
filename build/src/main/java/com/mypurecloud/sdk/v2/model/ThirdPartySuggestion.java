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
import com.mypurecloud.sdk.v2.model.ThirdPartySuggestionSource;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * ThirdPartySuggestion
 */

public class ThirdPartySuggestion  implements Serializable {
  
  private String text = null;
  private String title = null;
  private List<ThirdPartySuggestionSource> sources = null;

  public ThirdPartySuggestion() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      sources = new ArrayList<ThirdPartySuggestionSource>();
    }
  }

  public ThirdPartySuggestion(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
      sources = new ArrayList<ThirdPartySuggestionSource>();
    }
  }

  
  /**
   * The third party suggestion text.
   **/
  public ThirdPartySuggestion text(String text) {
    this.text = text;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The third party suggestion text.")
  @JsonProperty("text")
  public String getText() {
    return text;
  }
  public void setText(String text) {
    this.text = text;
  }


  /**
   * The title of the suggestion.
   **/
  public ThirdPartySuggestion title(String title) {
    this.title = title;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The title of the suggestion.")
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }
  public void setTitle(String title) {
    this.title = title;
  }


  /**
   * A list of source references attributing the suggestion to its origin sources.
   **/
  public ThirdPartySuggestion sources(List<ThirdPartySuggestionSource> sources) {
    this.sources = sources;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A list of source references attributing the suggestion to its origin sources.")
  @JsonProperty("sources")
  public List<ThirdPartySuggestionSource> getSources() {
    return sources;
  }
  public void setSources(List<ThirdPartySuggestionSource> sources) {
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
    ThirdPartySuggestion thirdPartySuggestion = (ThirdPartySuggestion) o;

    return Objects.equals(this.text, thirdPartySuggestion.text) &&
            Objects.equals(this.title, thirdPartySuggestion.title) &&
            Objects.equals(this.sources, thirdPartySuggestion.sources);
  }

  @Override
  public int hashCode() {
    return Objects.hash(text, title, sources);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ThirdPartySuggestion {\n");
    
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

