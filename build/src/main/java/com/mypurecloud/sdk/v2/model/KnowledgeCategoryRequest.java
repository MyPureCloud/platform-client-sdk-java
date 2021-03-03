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
import com.mypurecloud.sdk.v2.model.DocumentCategoryInput;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * KnowledgeCategoryRequest
 */

public class KnowledgeCategoryRequest  implements Serializable {
  
  private String id = null;
  private String name = null;
  private String description = null;
  private DocumentCategoryInput parent = null;
  private String selfUri = null;

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  
  /**
   * Category name
   **/
  public KnowledgeCategoryRequest name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Category name")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   * Category description
   **/
  public KnowledgeCategoryRequest description(String description) {
    this.description = description;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Category description")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  
  /**
   * Category parent
   **/
  public KnowledgeCategoryRequest parent(DocumentCategoryInput parent) {
    this.parent = parent;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Category parent")
  @JsonProperty("parent")
  public DocumentCategoryInput getParent() {
    return parent;
  }
  public void setParent(DocumentCategoryInput parent) {
    this.parent = parent;
  }

  
  @ApiModelProperty(example = "null", value = "The URI for this object")
  @JsonProperty("selfUri")
  public String getSelfUri() {
    return selfUri;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KnowledgeCategoryRequest knowledgeCategoryRequest = (KnowledgeCategoryRequest) o;
    return Objects.equals(this.id, knowledgeCategoryRequest.id) &&
        Objects.equals(this.name, knowledgeCategoryRequest.name) &&
        Objects.equals(this.description, knowledgeCategoryRequest.description) &&
        Objects.equals(this.parent, knowledgeCategoryRequest.parent) &&
        Objects.equals(this.selfUri, knowledgeCategoryRequest.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, description, parent, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KnowledgeCategoryRequest {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    parent: ").append(toIndentedString(parent)).append("\n");
    sb.append("    selfUri: ").append(toIndentedString(selfUri)).append("\n");
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

