package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.mypurecloud.sdk.v2.model.UriReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * DocumentUpload
 */

public class DocumentUpload  implements Serializable {
  
  private String name = null;
  private UriReference workspace = null;
  private List<String> tags = new ArrayList<String>();
  private List<String> tagIds = new ArrayList<String>();

  
  /**
   * The name of the document
   **/
  public DocumentUpload name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The name of the document")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }


  /**
   * The workspace the document will be uploaded to
   **/
  public DocumentUpload workspace(UriReference workspace) {
    this.workspace = workspace;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The workspace the document will be uploaded to")
  @JsonProperty("workspace")
  public UriReference getWorkspace() {
    return workspace;
  }
  public void setWorkspace(UriReference workspace) {
    this.workspace = workspace;
  }


  /**
   **/
  public DocumentUpload tags(List<String> tags) {
    this.tags = tags;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("tags")
  public List<String> getTags() {
    return tags;
  }
  public void setTags(List<String> tags) {
    this.tags = tags;
  }


  /**
   **/
  public DocumentUpload tagIds(List<String> tagIds) {
    this.tagIds = tagIds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("tagIds")
  public List<String> getTagIds() {
    return tagIds;
  }
  public void setTagIds(List<String> tagIds) {
    this.tagIds = tagIds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocumentUpload documentUpload = (DocumentUpload) o;
    return Objects.equals(this.name, documentUpload.name) &&
        Objects.equals(this.workspace, documentUpload.workspace) &&
        Objects.equals(this.tags, documentUpload.tags) &&
        Objects.equals(this.tagIds, documentUpload.tagIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, workspace, tags, tagIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentUpload {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    workspace: ").append(toIndentedString(workspace)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    tagIds: ").append(toIndentedString(tagIds)).append("\n");
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

