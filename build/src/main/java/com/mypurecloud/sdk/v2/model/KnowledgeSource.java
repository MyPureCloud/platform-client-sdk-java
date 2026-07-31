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
 * KnowledgeSource
 */

public class KnowledgeSource  implements Serializable {
  
  private String sourceName = null;
  private String text = null;
  private String url = null;
  private Double confidence = null;

  public KnowledgeSource() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  public KnowledgeSource(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
    }
  }

  
  /**
   * The name of the knowledge source.
   **/
  public KnowledgeSource sourceName(String sourceName) {
    this.sourceName = sourceName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The name of the knowledge source.")
  @JsonProperty("sourceName")
  public String getSourceName() {
    return sourceName;
  }
  public void setSourceName(String sourceName) {
    this.sourceName = sourceName;
  }


  /**
   * The retrieved source text content.
   **/
  public KnowledgeSource text(String text) {
    this.text = text;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The retrieved source text content.")
  @JsonProperty("text")
  public String getText() {
    return text;
  }
  public void setText(String text) {
    this.text = text;
  }


  /**
   * URL of the source document.
   **/
  public KnowledgeSource url(String url) {
    this.url = url;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "URL of the source document.")
  @JsonProperty("url")
  public String getUrl() {
    return url;
  }
  public void setUrl(String url) {
    this.url = url;
  }


  /**
   * Confidence score for this knowledge source.
   **/
  public KnowledgeSource confidence(Double confidence) {
    this.confidence = confidence;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Confidence score for this knowledge source.")
  @JsonProperty("confidence")
  public Double getConfidence() {
    return confidence;
  }
  public void setConfidence(Double confidence) {
    this.confidence = confidence;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KnowledgeSource knowledgeSource = (KnowledgeSource) o;

    return Objects.equals(this.sourceName, knowledgeSource.sourceName) &&
            Objects.equals(this.text, knowledgeSource.text) &&
            Objects.equals(this.url, knowledgeSource.url) &&
            Objects.equals(this.confidence, knowledgeSource.confidence);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sourceName, text, url, confidence);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KnowledgeSource {\n");
    
    sb.append("    sourceName: ").append(toIndentedString(sourceName)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    confidence: ").append(toIndentedString(confidence)).append("\n");
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

