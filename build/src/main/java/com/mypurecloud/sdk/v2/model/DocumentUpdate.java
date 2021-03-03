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
import com.mypurecloud.sdk.v2.model.DocumentAttribute;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * DocumentUpdate
 */

public class DocumentUpdate  implements Serializable {
  
  private Integer changeNumber = null;
  private String name = null;
  private Boolean read = null;
  private List<String> addTags = new ArrayList<String>();
  private List<String> removeTags = new ArrayList<String>();
  private List<String> addTagIds = new ArrayList<String>();
  private List<String> removeTagIds = new ArrayList<String>();
  private List<DocumentAttribute> updateAttributes = new ArrayList<DocumentAttribute>();
  private List<String> removeAttributes = new ArrayList<String>();

  
  /**
   **/
  public DocumentUpdate changeNumber(Integer changeNumber) {
    this.changeNumber = changeNumber;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("changeNumber")
  public Integer getChangeNumber() {
    return changeNumber;
  }
  public void setChangeNumber(Integer changeNumber) {
    this.changeNumber = changeNumber;
  }

  
  /**
   * The name of the document
   **/
  public DocumentUpdate name(String name) {
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
   **/
  public DocumentUpdate read(Boolean read) {
    this.read = read;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("read")
  public Boolean getRead() {
    return read;
  }
  public void setRead(Boolean read) {
    this.read = read;
  }

  
  /**
   **/
  public DocumentUpdate addTags(List<String> addTags) {
    this.addTags = addTags;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("addTags")
  public List<String> getAddTags() {
    return addTags;
  }
  public void setAddTags(List<String> addTags) {
    this.addTags = addTags;
  }

  
  /**
   **/
  public DocumentUpdate removeTags(List<String> removeTags) {
    this.removeTags = removeTags;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("removeTags")
  public List<String> getRemoveTags() {
    return removeTags;
  }
  public void setRemoveTags(List<String> removeTags) {
    this.removeTags = removeTags;
  }

  
  /**
   **/
  public DocumentUpdate addTagIds(List<String> addTagIds) {
    this.addTagIds = addTagIds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("addTagIds")
  public List<String> getAddTagIds() {
    return addTagIds;
  }
  public void setAddTagIds(List<String> addTagIds) {
    this.addTagIds = addTagIds;
  }

  
  /**
   **/
  public DocumentUpdate removeTagIds(List<String> removeTagIds) {
    this.removeTagIds = removeTagIds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("removeTagIds")
  public List<String> getRemoveTagIds() {
    return removeTagIds;
  }
  public void setRemoveTagIds(List<String> removeTagIds) {
    this.removeTagIds = removeTagIds;
  }

  
  /**
   **/
  public DocumentUpdate updateAttributes(List<DocumentAttribute> updateAttributes) {
    this.updateAttributes = updateAttributes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("updateAttributes")
  public List<DocumentAttribute> getUpdateAttributes() {
    return updateAttributes;
  }
  public void setUpdateAttributes(List<DocumentAttribute> updateAttributes) {
    this.updateAttributes = updateAttributes;
  }

  
  /**
   **/
  public DocumentUpdate removeAttributes(List<String> removeAttributes) {
    this.removeAttributes = removeAttributes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("removeAttributes")
  public List<String> getRemoveAttributes() {
    return removeAttributes;
  }
  public void setRemoveAttributes(List<String> removeAttributes) {
    this.removeAttributes = removeAttributes;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocumentUpdate documentUpdate = (DocumentUpdate) o;
    return Objects.equals(this.changeNumber, documentUpdate.changeNumber) &&
        Objects.equals(this.name, documentUpdate.name) &&
        Objects.equals(this.read, documentUpdate.read) &&
        Objects.equals(this.addTags, documentUpdate.addTags) &&
        Objects.equals(this.removeTags, documentUpdate.removeTags) &&
        Objects.equals(this.addTagIds, documentUpdate.addTagIds) &&
        Objects.equals(this.removeTagIds, documentUpdate.removeTagIds) &&
        Objects.equals(this.updateAttributes, documentUpdate.updateAttributes) &&
        Objects.equals(this.removeAttributes, documentUpdate.removeAttributes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(changeNumber, name, read, addTags, removeTags, addTagIds, removeTagIds, updateAttributes, removeAttributes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentUpdate {\n");
    
    sb.append("    changeNumber: ").append(toIndentedString(changeNumber)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    read: ").append(toIndentedString(read)).append("\n");
    sb.append("    addTags: ").append(toIndentedString(addTags)).append("\n");
    sb.append("    removeTags: ").append(toIndentedString(removeTags)).append("\n");
    sb.append("    addTagIds: ").append(toIndentedString(addTagIds)).append("\n");
    sb.append("    removeTagIds: ").append(toIndentedString(removeTagIds)).append("\n");
    sb.append("    updateAttributes: ").append(toIndentedString(updateAttributes)).append("\n");
    sb.append("    removeAttributes: ").append(toIndentedString(removeAttributes)).append("\n");
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

