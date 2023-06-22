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
import com.mypurecloud.sdk.v2.model.CategoryReference;
import com.mypurecloud.sdk.v2.model.KnowledgeBaseReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

import java.io.Serializable;
/**
 * CategoryResponse
 */

public class CategoryResponse  implements Serializable {
  
  private String id = null;
  private String name = null;
  private String description = null;
  private String externalId = null;
  private Date dateCreated = null;
  private Date dateModified = null;
  private CategoryReference parentCategory = null;
  private Integer documentCount = null;
  private KnowledgeBaseReference knowledgeBase = null;
  private String selfUri = null;

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }


  /**
   * The name of the category.
   **/
  public CategoryResponse name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The name of the category.")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }


  /**
   **/
  public CategoryResponse description(String description) {
    this.description = description;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }


  /**
   **/
  public CategoryResponse externalId(String externalId) {
    this.externalId = externalId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("externalId")
  public String getExternalId() {
    return externalId;
  }
  public void setExternalId(String externalId) {
    this.externalId = externalId;
  }


  /**
   * Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public CategoryResponse dateCreated(Date dateCreated) {
    this.dateCreated = dateCreated;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateCreated")
  public Date getDateCreated() {
    return dateCreated;
  }
  public void setDateCreated(Date dateCreated) {
    this.dateCreated = dateCreated;
  }


  /**
   * Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public CategoryResponse dateModified(Date dateModified) {
    this.dateModified = dateModified;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateModified")
  public Date getDateModified() {
    return dateModified;
  }
  public void setDateModified(Date dateModified) {
    this.dateModified = dateModified;
  }


  /**
   * The reference to category to which this category belongs to.
   **/
  public CategoryResponse parentCategory(CategoryReference parentCategory) {
    this.parentCategory = parentCategory;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The reference to category to which this category belongs to.")
  @JsonProperty("parentCategory")
  public CategoryReference getParentCategory() {
    return parentCategory;
  }
  public void setParentCategory(CategoryReference parentCategory) {
    this.parentCategory = parentCategory;
  }


  /**
   * Number of documents assigned to this category.
   **/
  public CategoryResponse documentCount(Integer documentCount) {
    this.documentCount = documentCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Number of documents assigned to this category.")
  @JsonProperty("documentCount")
  public Integer getDocumentCount() {
    return documentCount;
  }
  public void setDocumentCount(Integer documentCount) {
    this.documentCount = documentCount;
  }


  /**
   * The reference to knowledge base to which the category belongs to.
   **/
  public CategoryResponse knowledgeBase(KnowledgeBaseReference knowledgeBase) {
    this.knowledgeBase = knowledgeBase;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The reference to knowledge base to which the category belongs to.")
  @JsonProperty("knowledgeBase")
  public KnowledgeBaseReference getKnowledgeBase() {
    return knowledgeBase;
  }
  public void setKnowledgeBase(KnowledgeBaseReference knowledgeBase) {
    this.knowledgeBase = knowledgeBase;
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
    CategoryResponse categoryResponse = (CategoryResponse) o;

    return Objects.equals(this.id, categoryResponse.id) &&
            Objects.equals(this.name, categoryResponse.name) &&
            Objects.equals(this.description, categoryResponse.description) &&
            Objects.equals(this.externalId, categoryResponse.externalId) &&
            Objects.equals(this.dateCreated, categoryResponse.dateCreated) &&
            Objects.equals(this.dateModified, categoryResponse.dateModified) &&
            Objects.equals(this.parentCategory, categoryResponse.parentCategory) &&
            Objects.equals(this.documentCount, categoryResponse.documentCount) &&
            Objects.equals(this.knowledgeBase, categoryResponse.knowledgeBase) &&
            Objects.equals(this.selfUri, categoryResponse.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, description, externalId, dateCreated, dateModified, parentCategory, documentCount, knowledgeBase, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CategoryResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    dateModified: ").append(toIndentedString(dateModified)).append("\n");
    sb.append("    parentCategory: ").append(toIndentedString(parentCategory)).append("\n");
    sb.append("    documentCount: ").append(toIndentedString(documentCount)).append("\n");
    sb.append("    knowledgeBase: ").append(toIndentedString(knowledgeBase)).append("\n");
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

