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
import com.mypurecloud.sdk.v2.model.V3SourceRef;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * V3SourceFileCountEntry
 */

public class V3SourceFileCountEntry  implements Serializable {
  
  private V3SourceRef source = null;
  private Integer selectedTagsFileCount = null;
  private Integer totalFileCount = null;
  private List<String> fileNames = null;

  public V3SourceFileCountEntry() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      fileNames = new ArrayList<String>();
    }
  }

  public V3SourceFileCountEntry(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
      fileNames = new ArrayList<String>();
    }
  }

  
  /**
   * Knowledge source reference for this entry.
   **/
  public V3SourceFileCountEntry source(V3SourceRef source) {
    this.source = source;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Knowledge source reference for this entry.")
  @JsonProperty("source")
  public V3SourceRef getSource() {
    return source;
  }
  public void setSource(V3SourceRef source) {
    this.source = source;
  }


  /**
   * Unique file count matching the tag filter for this source.
   **/
  public V3SourceFileCountEntry selectedTagsFileCount(Integer selectedTagsFileCount) {
    this.selectedTagsFileCount = selectedTagsFileCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Unique file count matching the tag filter for this source.")
  @JsonProperty("selectedTagsFileCount")
  public Integer getSelectedTagsFileCount() {
    return selectedTagsFileCount;
  }
  public void setSelectedTagsFileCount(Integer selectedTagsFileCount) {
    this.selectedTagsFileCount = selectedTagsFileCount;
  }


  /**
   * Total unique file count for this source without tag filters.
   **/
  public V3SourceFileCountEntry totalFileCount(Integer totalFileCount) {
    this.totalFileCount = totalFileCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Total unique file count for this source without tag filters.")
  @JsonProperty("totalFileCount")
  public Integer getTotalFileCount() {
    return totalFileCount;
  }
  public void setTotalFileCount(Integer totalFileCount) {
    this.totalFileCount = totalFileCount;
  }


  /**
   * File names when includeFileNames is enabled.
   **/
  public V3SourceFileCountEntry fileNames(List<String> fileNames) {
    this.fileNames = fileNames;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "File names when includeFileNames is enabled.")
  @JsonProperty("fileNames")
  public List<String> getFileNames() {
    return fileNames;
  }
  public void setFileNames(List<String> fileNames) {
    this.fileNames = fileNames;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V3SourceFileCountEntry v3SourceFileCountEntry = (V3SourceFileCountEntry) o;

    return Objects.equals(this.source, v3SourceFileCountEntry.source) &&
            Objects.equals(this.selectedTagsFileCount, v3SourceFileCountEntry.selectedTagsFileCount) &&
            Objects.equals(this.totalFileCount, v3SourceFileCountEntry.totalFileCount) &&
            Objects.equals(this.fileNames, v3SourceFileCountEntry.fileNames);
  }

  @Override
  public int hashCode() {
    return Objects.hash(source, selectedTagsFileCount, totalFileCount, fileNames);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V3SourceFileCountEntry {\n");
    
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    selectedTagsFileCount: ").append(toIndentedString(selectedTagsFileCount)).append("\n");
    sb.append("    totalFileCount: ").append(toIndentedString(totalFileCount)).append("\n");
    sb.append("    fileNames: ").append(toIndentedString(fileNames)).append("\n");
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

