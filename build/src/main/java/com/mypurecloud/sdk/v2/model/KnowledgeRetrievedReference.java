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
 * KnowledgeRetrievedReference
 */

public class KnowledgeRetrievedReference  implements Serializable {
  
  private Double confidence = null;
  private String text = null;
  private String fileName = null;
  private String url = null;
  private Boolean usedForGeneration = null;

  public KnowledgeRetrievedReference() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  public KnowledgeRetrievedReference(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
    }
  }

  
  /**
   * The confidence associated with retrieved reference respect to a search query.
   **/
  public KnowledgeRetrievedReference confidence(Double confidence) {
    this.confidence = confidence;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The confidence associated with retrieved reference respect to a search query.")
  @JsonProperty("confidence")
  public Double getConfidence() {
    return confidence;
  }
  public void setConfidence(Double confidence) {
    this.confidence = confidence;
  }


  /**
   * The matching text for search query.
   **/
  public KnowledgeRetrievedReference text(String text) {
    this.text = text;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The matching text for search query.")
  @JsonProperty("text")
  public String getText() {
    return text;
  }
  public void setText(String text) {
    this.text = text;
  }


  /**
   * The file name from which reference is retrieved
   **/
  public KnowledgeRetrievedReference fileName(String fileName) {
    this.fileName = fileName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The file name from which reference is retrieved")
  @JsonProperty("fileName")
  public String getFileName() {
    return fileName;
  }
  public void setFileName(String fileName) {
    this.fileName = fileName;
  }


  /**
   * The url of the file.
   **/
  public KnowledgeRetrievedReference url(String url) {
    this.url = url;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The url of the file.")
  @JsonProperty("url")
  public String getUrl() {
    return url;
  }
  public void setUrl(String url) {
    this.url = url;
  }


  /**
   * Indicates whether a retrieved reference is used for answer generation
   **/
  public KnowledgeRetrievedReference usedForGeneration(Boolean usedForGeneration) {
    this.usedForGeneration = usedForGeneration;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Indicates whether a retrieved reference is used for answer generation")
  @JsonProperty("usedForGeneration")
  public Boolean getUsedForGeneration() {
    return usedForGeneration;
  }
  public void setUsedForGeneration(Boolean usedForGeneration) {
    this.usedForGeneration = usedForGeneration;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KnowledgeRetrievedReference knowledgeRetrievedReference = (KnowledgeRetrievedReference) o;

    return Objects.equals(this.confidence, knowledgeRetrievedReference.confidence) &&
            Objects.equals(this.text, knowledgeRetrievedReference.text) &&
            Objects.equals(this.fileName, knowledgeRetrievedReference.fileName) &&
            Objects.equals(this.url, knowledgeRetrievedReference.url) &&
            Objects.equals(this.usedForGeneration, knowledgeRetrievedReference.usedForGeneration);
  }

  @Override
  public int hashCode() {
    return Objects.hash(confidence, text, fileName, url, usedForGeneration);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KnowledgeRetrievedReference {\n");
    
    sb.append("    confidence: ").append(toIndentedString(confidence)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    usedForGeneration: ").append(toIndentedString(usedForGeneration)).append("\n");
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

