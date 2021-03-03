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
import com.mypurecloud.sdk.v2.model.SearchAggregation;
import com.mypurecloud.sdk.v2.model.SearchCriteria;
import com.mypurecloud.sdk.v2.model.SearchSort;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * SearchRequest
 */

public class SearchRequest  implements Serializable {
  

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
  private List<String> returnFields = new ArrayList<String>();
  private List<String> expand = new ArrayList<String>();
  private List<String> types = new ArrayList<String>();
  private List<SearchCriteria> query = new ArrayList<SearchCriteria>();
  private List<SearchAggregation> aggregations = new ArrayList<SearchAggregation>();

  
  /**
   * The sort order for results
   **/
  public SearchRequest sortOrder(SortOrderEnum sortOrder) {
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
  public SearchRequest sortBy(String sortBy) {
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
  public SearchRequest pageSize(Integer pageSize) {
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
  public SearchRequest pageNumber(Integer pageNumber) {
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
  public SearchRequest sort(List<SearchSort> sort) {
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
   * A List of strings.  Possible values are any field in the resource you are searching on.  The other option is to use ALL_FIELDS, when this is provided all fields in the resource will be returned in the search results.
   **/
  public SearchRequest returnFields(List<String> returnFields) {
    this.returnFields = returnFields;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A List of strings.  Possible values are any field in the resource you are searching on.  The other option is to use ALL_FIELDS, when this is provided all fields in the resource will be returned in the search results.")
  @JsonProperty("returnFields")
  public List<String> getReturnFields() {
    return returnFields;
  }
  public void setReturnFields(List<String> returnFields) {
    this.returnFields = returnFields;
  }

  
  /**
   * Provides more details about a specified resource
   **/
  public SearchRequest expand(List<String> expand) {
    this.expand = expand;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Provides more details about a specified resource")
  @JsonProperty("expand")
  public List<String> getExpand() {
    return expand;
  }
  public void setExpand(List<String> expand) {
    this.expand = expand;
  }

  
  /**
   * Resource domain type to search
   **/
  public SearchRequest types(List<String> types) {
    this.types = types;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Resource domain type to search")
  @JsonProperty("types")
  public List<String> getTypes() {
    return types;
  }
  public void setTypes(List<String> types) {
    this.types = types;
  }

  
  /**
   * The search criteria
   **/
  public SearchRequest query(List<SearchCriteria> query) {
    this.query = query;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The search criteria")
  @JsonProperty("query")
  public List<SearchCriteria> getQuery() {
    return query;
  }
  public void setQuery(List<SearchCriteria> query) {
    this.query = query;
  }

  
  /**
   * Aggregation criteria
   **/
  public SearchRequest aggregations(List<SearchAggregation> aggregations) {
    this.aggregations = aggregations;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Aggregation criteria")
  @JsonProperty("aggregations")
  public List<SearchAggregation> getAggregations() {
    return aggregations;
  }
  public void setAggregations(List<SearchAggregation> aggregations) {
    this.aggregations = aggregations;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SearchRequest searchRequest = (SearchRequest) o;
    return Objects.equals(this.sortOrder, searchRequest.sortOrder) &&
        Objects.equals(this.sortBy, searchRequest.sortBy) &&
        Objects.equals(this.pageSize, searchRequest.pageSize) &&
        Objects.equals(this.pageNumber, searchRequest.pageNumber) &&
        Objects.equals(this.sort, searchRequest.sort) &&
        Objects.equals(this.returnFields, searchRequest.returnFields) &&
        Objects.equals(this.expand, searchRequest.expand) &&
        Objects.equals(this.types, searchRequest.types) &&
        Objects.equals(this.query, searchRequest.query) &&
        Objects.equals(this.aggregations, searchRequest.aggregations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sortOrder, sortBy, pageSize, pageNumber, sort, returnFields, expand, types, query, aggregations);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchRequest {\n");
    
    sb.append("    sortOrder: ").append(toIndentedString(sortOrder)).append("\n");
    sb.append("    sortBy: ").append(toIndentedString(sortBy)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    pageNumber: ").append(toIndentedString(pageNumber)).append("\n");
    sb.append("    sort: ").append(toIndentedString(sort)).append("\n");
    sb.append("    returnFields: ").append(toIndentedString(returnFields)).append("\n");
    sb.append("    expand: ").append(toIndentedString(expand)).append("\n");
    sb.append("    types: ").append(toIndentedString(types)).append("\n");
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
    sb.append("    aggregations: ").append(toIndentedString(aggregations)).append("\n");
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

