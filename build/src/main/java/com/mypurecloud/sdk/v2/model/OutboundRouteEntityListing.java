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
import com.mypurecloud.sdk.v2.PagedResource;
import com.mypurecloud.sdk.v2.model.OutboundRoute;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * OutboundRouteEntityListing
 */

public class OutboundRouteEntityListing  implements Serializable, PagedResource<OutboundRoute> {
  
  private List<OutboundRoute> entities = null;
  private Integer pageSize = null;
  private Integer pageNumber = null;
  private Long total = null;
  private Long totalNumberOfEntities = null;
  private String firstUri = null;
  private String lastUri = null;
  private String selfUri = null;
  private String previousUri = null;
  private String nextUri = null;
  private Integer pageCount = null;

  public OutboundRouteEntityListing() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      entities = new ArrayList<OutboundRoute>();
    }
  }

  
  /**
   **/
  public OutboundRouteEntityListing entities(List<OutboundRoute> entities) {
    this.entities = entities;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("entities")
  public List<OutboundRoute> getEntities() {
    return entities;
  }
  public void setEntities(List<OutboundRoute> entities) {
    this.entities = entities;
  }


  /**
   **/
  public OutboundRouteEntityListing pageSize(Integer pageSize) {
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
  public OutboundRouteEntityListing pageNumber(Integer pageNumber) {
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
   **/
  public OutboundRouteEntityListing total(Long total) {
    this.total = total;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("total")
  public Long getTotal() {
    return total;
  }
  public void setTotal(Long total) {
    this.total = total;
  }


  /**
   * The total organization-wide number of entities.
   **/
  public OutboundRouteEntityListing totalNumberOfEntities(Long totalNumberOfEntities) {
    this.totalNumberOfEntities = totalNumberOfEntities;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The total organization-wide number of entities.")
  @JsonProperty("totalNumberOfEntities")
  public Long getTotalNumberOfEntities() {
    return totalNumberOfEntities;
  }
  public void setTotalNumberOfEntities(Long totalNumberOfEntities) {
    this.totalNumberOfEntities = totalNumberOfEntities;
  }


  /**
   **/
  public OutboundRouteEntityListing firstUri(String firstUri) {
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
  public OutboundRouteEntityListing lastUri(String lastUri) {
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
  public OutboundRouteEntityListing selfUri(String selfUri) {
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
  public OutboundRouteEntityListing previousUri(String previousUri) {
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
  public OutboundRouteEntityListing nextUri(String nextUri) {
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
  public OutboundRouteEntityListing pageCount(Integer pageCount) {
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
    OutboundRouteEntityListing outboundRouteEntityListing = (OutboundRouteEntityListing) o;

    return Objects.equals(this.entities, outboundRouteEntityListing.entities) &&
            Objects.equals(this.pageSize, outboundRouteEntityListing.pageSize) &&
            Objects.equals(this.pageNumber, outboundRouteEntityListing.pageNumber) &&
            Objects.equals(this.total, outboundRouteEntityListing.total) &&
            Objects.equals(this.totalNumberOfEntities, outboundRouteEntityListing.totalNumberOfEntities) &&
            Objects.equals(this.firstUri, outboundRouteEntityListing.firstUri) &&
            Objects.equals(this.lastUri, outboundRouteEntityListing.lastUri) &&
            Objects.equals(this.selfUri, outboundRouteEntityListing.selfUri) &&
            Objects.equals(this.previousUri, outboundRouteEntityListing.previousUri) &&
            Objects.equals(this.nextUri, outboundRouteEntityListing.nextUri) &&
            Objects.equals(this.pageCount, outboundRouteEntityListing.pageCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entities, pageSize, pageNumber, total, totalNumberOfEntities, firstUri, lastUri, selfUri, previousUri, nextUri, pageCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OutboundRouteEntityListing {\n");
    
    sb.append("    entities: ").append(toIndentedString(entities)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    pageNumber: ").append(toIndentedString(pageNumber)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
    sb.append("    totalNumberOfEntities: ").append(toIndentedString(totalNumberOfEntities)).append("\n");
    sb.append("    firstUri: ").append(toIndentedString(firstUri)).append("\n");
    sb.append("    lastUri: ").append(toIndentedString(lastUri)).append("\n");
    sb.append("    selfUri: ").append(toIndentedString(selfUri)).append("\n");
    sb.append("    previousUri: ").append(toIndentedString(previousUri)).append("\n");
    sb.append("    nextUri: ").append(toIndentedString(nextUri)).append("\n");
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

