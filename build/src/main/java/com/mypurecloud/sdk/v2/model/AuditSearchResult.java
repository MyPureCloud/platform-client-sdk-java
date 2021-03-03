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
import com.mypurecloud.sdk.v2.model.AuditMessage;
import com.mypurecloud.sdk.v2.model.FacetInfo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * AuditSearchResult
 */

public class AuditSearchResult  implements Serializable {
  
  private Integer pageNumber = null;
  private Integer pageSize = null;
  private Integer total = null;
  private Integer pageCount = null;
  private List<FacetInfo> facetInfo = new ArrayList<FacetInfo>();
  private List<AuditMessage> auditMessages = new ArrayList<AuditMessage>();

  
  /**
   * Which page was returned.
   **/
  public AuditSearchResult pageNumber(Integer pageNumber) {
    this.pageNumber = pageNumber;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Which page was returned.")
  @JsonProperty("pageNumber")
  public Integer getPageNumber() {
    return pageNumber;
  }
  public void setPageNumber(Integer pageNumber) {
    this.pageNumber = pageNumber;
  }

  
  /**
   * The number of results in a page.
   **/
  public AuditSearchResult pageSize(Integer pageSize) {
    this.pageSize = pageSize;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The number of results in a page.")
  @JsonProperty("pageSize")
  public Integer getPageSize() {
    return pageSize;
  }
  public void setPageSize(Integer pageSize) {
    this.pageSize = pageSize;
  }

  
  /**
   * The total number of results.
   **/
  public AuditSearchResult total(Integer total) {
    this.total = total;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The total number of results.")
  @JsonProperty("total")
  public Integer getTotal() {
    return total;
  }
  public void setTotal(Integer total) {
    this.total = total;
  }

  
  /**
   * The number of pages of results.
   **/
  public AuditSearchResult pageCount(Integer pageCount) {
    this.pageCount = pageCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The number of pages of results.")
  @JsonProperty("pageCount")
  public Integer getPageCount() {
    return pageCount;
  }
  public void setPageCount(Integer pageCount) {
    this.pageCount = pageCount;
  }

  
  /**
   **/
  public AuditSearchResult facetInfo(List<FacetInfo> facetInfo) {
    this.facetInfo = facetInfo;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("facetInfo")
  public List<FacetInfo> getFacetInfo() {
    return facetInfo;
  }
  public void setFacetInfo(List<FacetInfo> facetInfo) {
    this.facetInfo = facetInfo;
  }

  
  /**
   **/
  public AuditSearchResult auditMessages(List<AuditMessage> auditMessages) {
    this.auditMessages = auditMessages;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("auditMessages")
  public List<AuditMessage> getAuditMessages() {
    return auditMessages;
  }
  public void setAuditMessages(List<AuditMessage> auditMessages) {
    this.auditMessages = auditMessages;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuditSearchResult auditSearchResult = (AuditSearchResult) o;
    return Objects.equals(this.pageNumber, auditSearchResult.pageNumber) &&
        Objects.equals(this.pageSize, auditSearchResult.pageSize) &&
        Objects.equals(this.total, auditSearchResult.total) &&
        Objects.equals(this.pageCount, auditSearchResult.pageCount) &&
        Objects.equals(this.facetInfo, auditSearchResult.facetInfo) &&
        Objects.equals(this.auditMessages, auditSearchResult.auditMessages);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pageNumber, pageSize, total, pageCount, facetInfo, auditMessages);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuditSearchResult {\n");
    
    sb.append("    pageNumber: ").append(toIndentedString(pageNumber)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
    sb.append("    pageCount: ").append(toIndentedString(pageCount)).append("\n");
    sb.append("    facetInfo: ").append(toIndentedString(facetInfo)).append("\n");
    sb.append("    auditMessages: ").append(toIndentedString(auditMessages)).append("\n");
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

