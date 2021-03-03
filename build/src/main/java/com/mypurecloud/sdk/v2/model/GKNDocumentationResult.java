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

import java.io.Serializable;
/**
 * GKNDocumentationResult
 */

public class GKNDocumentationResult  implements Serializable {
  
  private String content = null;
  private String link = null;
  private String title = null;
  private String type = null;

  
  /**
   * The text or html content for the documentation entity. Will be returned in responses for certain entities.
   **/
  public GKNDocumentationResult content(String content) {
    this.content = content;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The text or html content for the documentation entity. Will be returned in responses for certain entities.")
  @JsonProperty("content")
  public String getContent() {
    return content;
  }
  public void setContent(String content) {
    this.content = content;
  }

  
  /**
   * URL link for the documentation entity. Will be returned in responses for certain entities.
   **/
  public GKNDocumentationResult link(String link) {
    this.link = link;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "URL link for the documentation entity. Will be returned in responses for certain entities.")
  @JsonProperty("link")
  public String getLink() {
    return link;
  }
  public void setLink(String link) {
    this.link = link;
  }

  
  /**
   * The title of the documentation entity. Will be returned in responses for certain entities.
   **/
  public GKNDocumentationResult title(String title) {
    this.title = title;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The title of the documentation entity. Will be returned in responses for certain entities.")
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }
  public void setTitle(String title) {
    this.title = title;
  }

  
  /**
   * The search type. Will be returned in responses for certain entities.
   **/
  public GKNDocumentationResult type(String type) {
    this.type = type;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The search type. Will be returned in responses for certain entities.")
  @JsonProperty("_type")
  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GKNDocumentationResult gKNDocumentationResult = (GKNDocumentationResult) o;
    return Objects.equals(this.content, gKNDocumentationResult.content) &&
        Objects.equals(this.link, gKNDocumentationResult.link) &&
        Objects.equals(this.title, gKNDocumentationResult.title) &&
        Objects.equals(this.type, gKNDocumentationResult.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(content, link, title, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GKNDocumentationResult {\n");
    
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    link: ").append(toIndentedString(link)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

