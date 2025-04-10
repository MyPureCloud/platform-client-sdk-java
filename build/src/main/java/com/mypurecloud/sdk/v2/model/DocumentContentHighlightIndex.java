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
 * DocumentContentHighlightIndex
 */

public class DocumentContentHighlightIndex  implements Serializable {
  
  private Integer startIndex = null;
  private Integer endIndex = null;

  public DocumentContentHighlightIndex() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * Highlight text start index.
   **/
  public DocumentContentHighlightIndex startIndex(Integer startIndex) {
    this.startIndex = startIndex;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Highlight text start index.")
  @JsonProperty("startIndex")
  public Integer getStartIndex() {
    return startIndex;
  }
  public void setStartIndex(Integer startIndex) {
    this.startIndex = startIndex;
  }


  /**
   * Highlight text end index.
   **/
  public DocumentContentHighlightIndex endIndex(Integer endIndex) {
    this.endIndex = endIndex;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Highlight text end index.")
  @JsonProperty("endIndex")
  public Integer getEndIndex() {
    return endIndex;
  }
  public void setEndIndex(Integer endIndex) {
    this.endIndex = endIndex;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocumentContentHighlightIndex documentContentHighlightIndex = (DocumentContentHighlightIndex) o;

    return Objects.equals(this.startIndex, documentContentHighlightIndex.startIndex) &&
            Objects.equals(this.endIndex, documentContentHighlightIndex.endIndex);
  }

  @Override
  public int hashCode() {
    return Objects.hash(startIndex, endIndex);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentContentHighlightIndex {\n");
    
    sb.append("    startIndex: ").append(toIndentedString(startIndex)).append("\n");
    sb.append("    endIndex: ").append(toIndentedString(endIndex)).append("\n");
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

