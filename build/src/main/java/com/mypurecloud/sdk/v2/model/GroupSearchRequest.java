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
import com.fasterxml.jackson.annotation.JsonValue;
import com.mypurecloud.sdk.v2.model.GroupSearchCriteria;
import com.mypurecloud.sdk.v2.model.SearchSort;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * GroupSearchRequest
 */

public class GroupSearchRequest  implements Serializable {
  

  private static class SortOrderEnumDeserializer extends StdDeserializer<SortOrderEnum> {
    public SortOrderEnumDeserializer() {
      super(SortOrderEnumDeserializer.class);
    }

    @Override
    public SortOrderEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return SortOrderEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The sort order for results
   */
 @JsonDeserialize(using = SortOrderEnumDeserializer.class)
  public enum SortOrderEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    ASC("ASC"),
    DESC("DESC"),
    SCORE("SCORE");

    private String value;

    SortOrderEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static SortOrderEnum fromString(String key) {
      if (key == null) return null;

      for (SortOrderEnum value : SortOrderEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return SortOrderEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private SortOrderEnum sortOrder = null;
  private String sortBy = null;
  private Integer pageSize = null;
  private Integer pageNumber = null;
  private List<SearchSort> sort = new ArrayList<SearchSort>();
  private List<GroupSearchCriteria> query = new ArrayList<GroupSearchCriteria>();

  
  /**
   * The sort order for results
   **/
  public GroupSearchRequest sortOrder(SortOrderEnum sortOrder) {
    this.sortOrder = sortOrder;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The sort order for results")
  @JsonProperty("sortOrder")
  public SortOrderEnum getSortOrder() {
    return sortOrder;
  }
  public void setSortOrder(SortOrderEnum sortOrder) {
    this.sortOrder = sortOrder;
  }

  
  /**
   * The field in the resource that you want to sort the results by
   **/
  public GroupSearchRequest sortBy(String sortBy) {
    this.sortBy = sortBy;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The field in the resource that you want to sort the results by")
  @JsonProperty("sortBy")
  public String getSortBy() {
    return sortBy;
  }
  public void setSortBy(String sortBy) {
    this.sortBy = sortBy;
  }

  
  /**
   * The number of results per page
   **/
  public GroupSearchRequest pageSize(Integer pageSize) {
    this.pageSize = pageSize;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The number of results per page")
  @JsonProperty("pageSize")
  public Integer getPageSize() {
    return pageSize;
  }
  public void setPageSize(Integer pageSize) {
    this.pageSize = pageSize;
  }

  
  /**
   * The page of resources you want to retrieve
   **/
  public GroupSearchRequest pageNumber(Integer pageNumber) {
    this.pageNumber = pageNumber;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The page of resources you want to retrieve")
  @JsonProperty("pageNumber")
  public Integer getPageNumber() {
    return pageNumber;
  }
  public void setPageNumber(Integer pageNumber) {
    this.pageNumber = pageNumber;
  }

  
  /**
   * Multi-value sort order, list of multiple sort values
   **/
  public GroupSearchRequest sort(List<SearchSort> sort) {
    this.sort = sort;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Multi-value sort order, list of multiple sort values")
  @JsonProperty("sort")
  public List<SearchSort> getSort() {
    return sort;
  }
  public void setSort(List<SearchSort> sort) {
    this.sort = sort;
  }

  
  /**
   **/
  public GroupSearchRequest query(List<GroupSearchCriteria> query) {
    this.query = query;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("query")
  public List<GroupSearchCriteria> getQuery() {
    return query;
  }
  public void setQuery(List<GroupSearchCriteria> query) {
    this.query = query;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GroupSearchRequest groupSearchRequest = (GroupSearchRequest) o;
    return Objects.equals(this.sortOrder, groupSearchRequest.sortOrder) &&
        Objects.equals(this.sortBy, groupSearchRequest.sortBy) &&
        Objects.equals(this.pageSize, groupSearchRequest.pageSize) &&
        Objects.equals(this.pageNumber, groupSearchRequest.pageNumber) &&
        Objects.equals(this.sort, groupSearchRequest.sort) &&
        Objects.equals(this.query, groupSearchRequest.query);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sortOrder, sortBy, pageSize, pageNumber, sort, query);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GroupSearchRequest {\n");
    
    sb.append("    sortOrder: ").append(toIndentedString(sortOrder)).append("\n");
    sb.append("    sortBy: ").append(toIndentedString(sortBy)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    pageNumber: ").append(toIndentedString(pageNumber)).append("\n");
    sb.append("    sort: ").append(toIndentedString(sort)).append("\n");
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
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

