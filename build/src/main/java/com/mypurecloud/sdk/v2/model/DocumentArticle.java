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
import com.mypurecloud.sdk.v2.model.ArticleContent;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * DocumentArticle
 */

public class DocumentArticle  implements Serializable {
  
  private String title = null;
  private ArticleContent content = null;
  private List<String> alternatives = new ArrayList<String>();

  
  /**
   * The title of the Article.
   **/
  public DocumentArticle title(String title) {
    this.title = title;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The title of the Article.")
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }
  public void setTitle(String title) {
    this.title = title;
  }

  
  @ApiModelProperty(example = "null", value = "The content of the Article.")
  @JsonProperty("content")
  public ArticleContent getContent() {
    return content;
  }

  
  /**
   * List of Alternative questions related to the title which helps in improving the likelihood of a match to user query.
   **/
  public DocumentArticle alternatives(List<String> alternatives) {
    this.alternatives = alternatives;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "List of Alternative questions related to the title which helps in improving the likelihood of a match to user query.")
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
    DocumentArticle documentArticle = (DocumentArticle) o;
    return Objects.equals(this.title, documentArticle.title) &&
        Objects.equals(this.content, documentArticle.content) &&
        Objects.equals(this.alternatives, documentArticle.alternatives);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, content, alternatives);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentArticle {\n");
    
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
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

