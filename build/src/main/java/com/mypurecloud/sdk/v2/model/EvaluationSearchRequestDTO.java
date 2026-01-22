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
import com.fasterxml.jackson.annotation.JsonValue;
import com.mypurecloud.sdk.v2.model.EvaluationSearchAggregationDTO;
import com.mypurecloud.sdk.v2.model.EvaluationSearchCriteriaDTO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * EvaluationSearchRequestDTO
 */

public class EvaluationSearchRequestDTO  implements Serializable {
  
  private List<EvaluationSearchCriteriaDTO> query = null;
  private List<EvaluationSearchAggregationDTO> aggregations = null;
  private Integer pageSize = null;
  private Integer pageNumber = null;

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
   * The sort order for results. Include with sortBy.
   */
 @JsonDeserialize(using = SortOrderEnumDeserializer.class)
  public enum SortOrderEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    ASC("ASC"),
    DESC("DESC");

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

  private static class SortByEnumDeserializer extends StdDeserializer<SortByEnum> {
    public SortByEnumDeserializer() {
      super(SortByEnumDeserializer.class);
    }

    @Override
    public SortByEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return SortByEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The field in the resource that you want to sort the results by. Include with sortOrder.
   */
 @JsonDeserialize(using = SortByEnumDeserializer.class)
  public enum SortByEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    CONVERSATIONDATE("conversationDate"),
    CREATEDDATE("createdDate"),
    SUBMITTEDDATE("submittedDate"),
    RELEASEDATE("releaseDate");

    private String value;

    SortByEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static SortByEnum fromString(String key) {
      if (key == null) return null;

      for (SortByEnum value : SortByEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return SortByEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private SortByEnum sortBy = null;
  private Boolean systemSubmitted = null;

  public EvaluationSearchRequestDTO() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      query = new ArrayList<EvaluationSearchCriteriaDTO>();
      aggregations = new ArrayList<EvaluationSearchAggregationDTO>();
    }
  }

  
  /**
   **/
  public EvaluationSearchRequestDTO query(List<EvaluationSearchCriteriaDTO> query) {
    this.query = query;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("query")
  public List<EvaluationSearchCriteriaDTO> getQuery() {
    return query;
  }
  public void setQuery(List<EvaluationSearchCriteriaDTO> query) {
    this.query = query;
  }


  /**
   * Aggregations to compute on the search results
   **/
  public EvaluationSearchRequestDTO aggregations(List<EvaluationSearchAggregationDTO> aggregations) {
    this.aggregations = aggregations;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Aggregations to compute on the search results")
  @JsonProperty("aggregations")
  public List<EvaluationSearchAggregationDTO> getAggregations() {
    return aggregations;
  }
  public void setAggregations(List<EvaluationSearchAggregationDTO> aggregations) {
    this.aggregations = aggregations;
  }


  /**
   * The number of results per page. For aggregation requests, must be omitted or 0.
   * minimum: 0
   * maximum: 100
   **/
  public EvaluationSearchRequestDTO pageSize(Integer pageSize) {
    this.pageSize = pageSize;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The number of results per page. For aggregation requests, must be omitted or 0.")
  @JsonProperty("pageSize")
  public Integer getPageSize() {
    return pageSize;
  }
  public void setPageSize(Integer pageSize) {
    this.pageSize = pageSize;
  }


  /**
   * The page of resources you want to retrieve
   * minimum: 1
   **/
  public EvaluationSearchRequestDTO pageNumber(Integer pageNumber) {
    this.pageNumber = pageNumber;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The page of resources you want to retrieve")
  @JsonProperty("pageNumber")
  public Integer getPageNumber() {
    return pageNumber;
  }
  public void setPageNumber(Integer pageNumber) {
    this.pageNumber = pageNumber;
  }


  /**
   * The sort order for results. Include with sortBy.
   **/
  public EvaluationSearchRequestDTO sortOrder(SortOrderEnum sortOrder) {
    this.sortOrder = sortOrder;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The sort order for results. Include with sortBy.")
  @JsonProperty("sortOrder")
  public SortOrderEnum getSortOrder() {
    return sortOrder;
  }
  public void setSortOrder(SortOrderEnum sortOrder) {
    this.sortOrder = sortOrder;
  }


  /**
   * The field in the resource that you want to sort the results by. Include with sortOrder.
   **/
  public EvaluationSearchRequestDTO sortBy(SortByEnum sortBy) {
    this.sortBy = sortBy;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The field in the resource that you want to sort the results by. Include with sortOrder.")
  @JsonProperty("sortBy")
  public SortByEnum getSortBy() {
    return sortBy;
  }
  public void setSortBy(SortByEnum sortBy) {
    this.sortBy = sortBy;
  }


  /**
   * Filter for automated evaluations submitted by virtual supervisor. Defaults to false.
   **/
  public EvaluationSearchRequestDTO systemSubmitted(Boolean systemSubmitted) {
    this.systemSubmitted = systemSubmitted;
    return this;
  }
  
  @ApiModelProperty(example = "false", value = "Filter for automated evaluations submitted by virtual supervisor. Defaults to false.")
  @JsonProperty("systemSubmitted")
  public Boolean getSystemSubmitted() {
    return systemSubmitted;
  }
  public void setSystemSubmitted(Boolean systemSubmitted) {
    this.systemSubmitted = systemSubmitted;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EvaluationSearchRequestDTO evaluationSearchRequestDTO = (EvaluationSearchRequestDTO) o;

    return Objects.equals(this.query, evaluationSearchRequestDTO.query) &&
            Objects.equals(this.aggregations, evaluationSearchRequestDTO.aggregations) &&
            Objects.equals(this.pageSize, evaluationSearchRequestDTO.pageSize) &&
            Objects.equals(this.pageNumber, evaluationSearchRequestDTO.pageNumber) &&
            Objects.equals(this.sortOrder, evaluationSearchRequestDTO.sortOrder) &&
            Objects.equals(this.sortBy, evaluationSearchRequestDTO.sortBy) &&
            Objects.equals(this.systemSubmitted, evaluationSearchRequestDTO.systemSubmitted);
  }

  @Override
  public int hashCode() {
    return Objects.hash(query, aggregations, pageSize, pageNumber, sortOrder, sortBy, systemSubmitted);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EvaluationSearchRequestDTO {\n");
    
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
    sb.append("    aggregations: ").append(toIndentedString(aggregations)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    pageNumber: ").append(toIndentedString(pageNumber)).append("\n");
    sb.append("    sortOrder: ").append(toIndentedString(sortOrder)).append("\n");
    sb.append("    sortBy: ").append(toIndentedString(sortBy)).append("\n");
    sb.append("    systemSubmitted: ").append(toIndentedString(systemSubmitted)).append("\n");
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

