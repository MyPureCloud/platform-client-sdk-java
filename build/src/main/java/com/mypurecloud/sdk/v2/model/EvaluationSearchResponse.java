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
import com.mypurecloud.sdk.v2.model.EvaluationResponse;
import com.mypurecloud.sdk.v2.model.EvaluationSearchAggregationResponse;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import java.io.Serializable;
/**
 * EvaluationSearchResponse
 */

public class EvaluationSearchResponse  implements Serializable {
  
  private Integer pageSize = null;
  private Integer pageNumber = null;
  private List<EvaluationResponse> results = null;
  private Map<String, EvaluationSearchAggregationResponse> aggregations = null;

  public EvaluationSearchResponse() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      results = new ArrayList<EvaluationResponse>();
    }
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
  public List<EvaluationResponse> getResults() {
    return results;
  }


  @ApiModelProperty(example = "null", value = "Aggregation results")
  @JsonProperty("aggregations")
  public Map<String, EvaluationSearchAggregationResponse> getAggregations() {
    return aggregations;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EvaluationSearchResponse evaluationSearchResponse = (EvaluationSearchResponse) o;

    return Objects.equals(this.pageSize, evaluationSearchResponse.pageSize) &&
            Objects.equals(this.pageNumber, evaluationSearchResponse.pageNumber) &&
            Objects.equals(this.results, evaluationSearchResponse.results) &&
            Objects.equals(this.aggregations, evaluationSearchResponse.aggregations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pageSize, pageNumber, results, aggregations);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EvaluationSearchResponse {\n");
    
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    pageNumber: ").append(toIndentedString(pageNumber)).append("\n");
    sb.append("    results: ").append(toIndentedString(results)).append("\n");
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

