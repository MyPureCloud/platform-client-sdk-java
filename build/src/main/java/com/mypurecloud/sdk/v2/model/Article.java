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
import com.mypurecloud.sdk.v2.model.AddressableEntityRef;
import com.mypurecloud.sdk.v2.model.MetadataAttribute;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import java.io.Serializable;
/**
 * Article
 */

public class Article  implements Serializable {
  
  private String title = null;
  private String uri = null;
  private List<String> snippets = new ArrayList<String>();
  private Float confidence = null;
  private Map<String, MetadataAttribute> metadata = null;
  private AddressableEntityRef version = null;
  private List<AddressableEntityRef> variations = new ArrayList<AddressableEntityRef>();

  
  @ApiModelProperty(example = "null", value = "The article title.")
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }


  @ApiModelProperty(example = "null", value = "The URI for the article.")
  @JsonProperty("uri")
  public String getUri() {
    return uri;
  }


  @ApiModelProperty(example = "null", value = "This contains snippets of text from the article matching the query.")
  @JsonProperty("snippets")
  public List<String> getSnippets() {
    return snippets;
  }


  @ApiModelProperty(example = "null", value = "Value between 0 and 1. 1 corresponds to very confident, 0 to not confident at all.")
  @JsonProperty("confidence")
  public Float getConfidence() {
    return confidence;
  }


  @ApiModelProperty(example = "null", value = "A map that contains custom metadata about the article answer.")
  @JsonProperty("metadata")
  public Map<String, MetadataAttribute> getMetadata() {
    return metadata;
  }


  @ApiModelProperty(example = "null", value = "The version of the Article.")
  @JsonProperty("version")
  public AddressableEntityRef getVersion() {
    return version;
  }


  @ApiModelProperty(example = "null", value = "Variations of the Article.")
  @JsonProperty("variations")
  public List<AddressableEntityRef> getVariations() {
    return variations;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Article article = (Article) o;

    return Objects.equals(this.title, article.title) &&
            Objects.equals(this.uri, article.uri) &&
            Objects.equals(this.snippets, article.snippets) &&
            Objects.equals(this.confidence, article.confidence) &&
            Objects.equals(this.metadata, article.metadata) &&
            Objects.equals(this.version, article.version) &&
            Objects.equals(this.variations, article.variations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, uri, snippets, confidence, metadata, version, variations);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Article {\n");
    
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
    sb.append("    snippets: ").append(toIndentedString(snippets)).append("\n");
    sb.append("    confidence: ").append(toIndentedString(confidence)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    variations: ").append(toIndentedString(variations)).append("\n");
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

