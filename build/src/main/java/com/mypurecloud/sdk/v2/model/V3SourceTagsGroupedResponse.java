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
import com.mypurecloud.sdk.v2.model.V3SourceTagsGroupedEntry;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * V3SourceTagsGroupedResponse
 */

public class V3SourceTagsGroupedResponse  implements Serializable {
  
  private List<V3SourceTagsGroupedEntry> entities = null;
  private Integer pageSize = null;
  private Integer pageNumber = null;
  private Long total = null;
  private Integer pageCount = null;

  public V3SourceTagsGroupedResponse() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      entities = new ArrayList<V3SourceTagsGroupedEntry>();
    }
  }

  public V3SourceTagsGroupedResponse(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
      entities = new ArrayList<V3SourceTagsGroupedEntry>();
    }
  }

  
  /**
   **/
  public V3SourceTagsGroupedResponse entities(List<V3SourceTagsGroupedEntry> entities) {
    this.entities = entities;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("entities")
  public List<V3SourceTagsGroupedEntry> getEntities() {
    return entities;
  }
  public void setEntities(List<V3SourceTagsGroupedEntry> entities) {
    this.entities = entities;
  }


  /**
   **/
  public V3SourceTagsGroupedResponse pageSize(Integer pageSize) {
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
  public V3SourceTagsGroupedResponse pageNumber(Integer pageNumber) {
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
  public V3SourceTagsGroupedResponse total(Long total) {
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
   **/
  public V3SourceTagsGroupedResponse pageCount(Integer pageCount) {
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
    V3SourceTagsGroupedResponse v3SourceTagsGroupedResponse = (V3SourceTagsGroupedResponse) o;

    return Objects.equals(this.entities, v3SourceTagsGroupedResponse.entities) &&
            Objects.equals(this.pageSize, v3SourceTagsGroupedResponse.pageSize) &&
            Objects.equals(this.pageNumber, v3SourceTagsGroupedResponse.pageNumber) &&
            Objects.equals(this.total, v3SourceTagsGroupedResponse.total) &&
            Objects.equals(this.pageCount, v3SourceTagsGroupedResponse.pageCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entities, pageSize, pageNumber, total, pageCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V3SourceTagsGroupedResponse {\n");
    
    sb.append("    entities: ").append(toIndentedString(entities)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    pageNumber: ").append(toIndentedString(pageNumber)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
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

