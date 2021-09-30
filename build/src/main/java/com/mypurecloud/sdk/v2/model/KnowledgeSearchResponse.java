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
import com.mypurecloud.sdk.v2.model.KnowledgeSearchDocument;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * KnowledgeSearchResponse
 */

public class KnowledgeSearchResponse  implements Serializable {
  
  private String searchId = null;
  private Integer total = null;
  private Integer pageCount = null;
  private Integer pageSize = null;
  private Integer pageNumber = null;
  private List<KnowledgeSearchDocument> results = new ArrayList<KnowledgeSearchDocument>();

  
  @ApiModelProperty(example = "null", value = "Search Id")
  @JsonProperty("searchId")
  public String getSearchId() {
    return searchId;
  }

  
  @ApiModelProperty(example = "null", value = "Total number of records returned")
  @JsonProperty("total")
  public Integer getTotal() {
    return total;
  }

  
  @ApiModelProperty(example = "null", value = "Number of pages returned in the result calculated according to the pageSize and the total")
  @JsonProperty("pageCount")
  public Integer getPageCount() {
    return pageCount;
  }

  
  @ApiModelProperty(example = "null", value = "Number of records according to the page size")
  @JsonProperty("pageSize")
  public Integer getPageSize() {
    return pageSize;
  }

  
  @ApiModelProperty(example = "null", value = "Current page number for the returned records")
  @JsonProperty("pageNumber")
  public Integer getPageNumber() {
    return pageNumber;
  }

  
  @ApiModelProperty(example = "null", value = "Results associated to the search response")
  @JsonProperty("results")
  public List<KnowledgeSearchDocument> getResults() {
    return results;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KnowledgeSearchResponse knowledgeSearchResponse = (KnowledgeSearchResponse) o;
    return Objects.equals(this.searchId, knowledgeSearchResponse.searchId) &&
        Objects.equals(this.total, knowledgeSearchResponse.total) &&
        Objects.equals(this.pageCount, knowledgeSearchResponse.pageCount) &&
        Objects.equals(this.pageSize, knowledgeSearchResponse.pageSize) &&
        Objects.equals(this.pageNumber, knowledgeSearchResponse.pageNumber) &&
        Objects.equals(this.results, knowledgeSearchResponse.results);
  }

  @Override
  public int hashCode() {
    return Objects.hash(searchId, total, pageCount, pageSize, pageNumber, results);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KnowledgeSearchResponse {\n");
    
    sb.append("    searchId: ").append(toIndentedString(searchId)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
    sb.append("    pageCount: ").append(toIndentedString(pageCount)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    pageNumber: ").append(toIndentedString(pageNumber)).append("\n");
    sb.append("    results: ").append(toIndentedString(results)).append("\n");
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

