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
import com.mypurecloud.sdk.v2.PagedResource;
import com.mypurecloud.sdk.v2.model.LearningAssignmentUser;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * List of users matching the learning module rule
 */
@ApiModel(description = "List of users matching the learning module rule")

public class LearningAssignmentUserListing  implements Serializable, PagedResource<LearningAssignmentUser> {
  
  private List<LearningAssignmentUser> entities = new ArrayList<LearningAssignmentUser>();
  private Integer pageSize = null;
  private Integer pageNumber = null;
  private Long total = null;
  private Integer unfilteredTotal = null;
  private String firstUri = null;
  private String selfUri = null;
  private String nextUri = null;
  private String previousUri = null;
  private String lastUri = null;
  private Integer pageCount = null;

  
  /**
   **/
  public LearningAssignmentUserListing entities(List<LearningAssignmentUser> entities) {
    this.entities = entities;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("entities")
  public List<LearningAssignmentUser> getEntities() {
    return entities;
  }
  public void setEntities(List<LearningAssignmentUser> entities) {
    this.entities = entities;
  }

  
  /**
   **/
  public LearningAssignmentUserListing pageSize(Integer pageSize) {
    this.pageSize = pageSize;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("pageSize")
  public Integer getPageSize() {
    return pageSize;
  }
  public void setPageSize(Integer pageSize) {
    this.pageSize = pageSize;
  }

  
  /**
   **/
  public LearningAssignmentUserListing pageNumber(Integer pageNumber) {
    this.pageNumber = pageNumber;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("pageNumber")
  public Integer getPageNumber() {
    return pageNumber;
  }
  public void setPageNumber(Integer pageNumber) {
    this.pageNumber = pageNumber;
  }

  
  /**
   * The number of users matching search term
   **/
  public LearningAssignmentUserListing total(Long total) {
    this.total = total;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The number of users matching search term")
  @JsonProperty("total")
  public Long getTotal() {
    return total;
  }
  public void setTotal(Long total) {
    this.total = total;
  }

  
  /**
   * The total number of users
   **/
  public LearningAssignmentUserListing unfilteredTotal(Integer unfilteredTotal) {
    this.unfilteredTotal = unfilteredTotal;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The total number of users")
  @JsonProperty("unfilteredTotal")
  public Integer getUnfilteredTotal() {
    return unfilteredTotal;
  }
  public void setUnfilteredTotal(Integer unfilteredTotal) {
    this.unfilteredTotal = unfilteredTotal;
  }

  
  /**
   **/
  public LearningAssignmentUserListing firstUri(String firstUri) {
    this.firstUri = firstUri;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("firstUri")
  public String getFirstUri() {
    return firstUri;
  }
  public void setFirstUri(String firstUri) {
    this.firstUri = firstUri;
  }

  
  /**
   **/
  public LearningAssignmentUserListing selfUri(String selfUri) {
    this.selfUri = selfUri;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("selfUri")
  public String getSelfUri() {
    return selfUri;
  }
  public void setSelfUri(String selfUri) {
    this.selfUri = selfUri;
  }

  
  /**
   **/
  public LearningAssignmentUserListing nextUri(String nextUri) {
    this.nextUri = nextUri;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("nextUri")
  public String getNextUri() {
    return nextUri;
  }
  public void setNextUri(String nextUri) {
    this.nextUri = nextUri;
  }

  
  /**
   **/
  public LearningAssignmentUserListing previousUri(String previousUri) {
    this.previousUri = previousUri;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("previousUri")
  public String getPreviousUri() {
    return previousUri;
  }
  public void setPreviousUri(String previousUri) {
    this.previousUri = previousUri;
  }

  
  /**
   **/
  public LearningAssignmentUserListing lastUri(String lastUri) {
    this.lastUri = lastUri;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("lastUri")
  public String getLastUri() {
    return lastUri;
  }
  public void setLastUri(String lastUri) {
    this.lastUri = lastUri;
  }

  
  /**
   **/
  public LearningAssignmentUserListing pageCount(Integer pageCount) {
    this.pageCount = pageCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("pageCount")
  public Integer getPageCount() {
    return pageCount;
  }
  public void setPageCount(Integer pageCount) {
    this.pageCount = pageCount;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LearningAssignmentUserListing learningAssignmentUserListing = (LearningAssignmentUserListing) o;
    return Objects.equals(this.entities, learningAssignmentUserListing.entities) &&
        Objects.equals(this.pageSize, learningAssignmentUserListing.pageSize) &&
        Objects.equals(this.pageNumber, learningAssignmentUserListing.pageNumber) &&
        Objects.equals(this.total, learningAssignmentUserListing.total) &&
        Objects.equals(this.unfilteredTotal, learningAssignmentUserListing.unfilteredTotal) &&
        Objects.equals(this.firstUri, learningAssignmentUserListing.firstUri) &&
        Objects.equals(this.selfUri, learningAssignmentUserListing.selfUri) &&
        Objects.equals(this.nextUri, learningAssignmentUserListing.nextUri) &&
        Objects.equals(this.previousUri, learningAssignmentUserListing.previousUri) &&
        Objects.equals(this.lastUri, learningAssignmentUserListing.lastUri) &&
        Objects.equals(this.pageCount, learningAssignmentUserListing.pageCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entities, pageSize, pageNumber, total, unfilteredTotal, firstUri, selfUri, nextUri, previousUri, lastUri, pageCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LearningAssignmentUserListing {\n");
    
    sb.append("    entities: ").append(toIndentedString(entities)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    pageNumber: ").append(toIndentedString(pageNumber)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
    sb.append("    unfilteredTotal: ").append(toIndentedString(unfilteredTotal)).append("\n");
    sb.append("    firstUri: ").append(toIndentedString(firstUri)).append("\n");
    sb.append("    selfUri: ").append(toIndentedString(selfUri)).append("\n");
    sb.append("    nextUri: ").append(toIndentedString(nextUri)).append("\n");
    sb.append("    previousUri: ").append(toIndentedString(previousUri)).append("\n");
    sb.append("    lastUri: ").append(toIndentedString(lastUri)).append("\n");
    sb.append("    pageCount: ").append(toIndentedString(pageCount)).append("\n");
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

