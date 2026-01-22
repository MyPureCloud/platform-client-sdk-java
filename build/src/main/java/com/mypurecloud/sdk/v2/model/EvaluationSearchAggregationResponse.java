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
import com.mypurecloud.sdk.v2.model.EvaluationSearchAggregationBucket;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * EvaluationSearchAggregationResponse
 */

public class EvaluationSearchAggregationResponse  implements Serializable {
  
  private Double value = null;
  private Long count = null;
  private Double minimum = null;
  private Double maximum = null;
  private Double average = null;
  private Double sum = null;
  private Long documentCountErrorUpperBound = null;
  private Long sumOtherDocumentCount = null;
  private List<EvaluationSearchAggregationBucket> buckets = null;

  public EvaluationSearchAggregationResponse() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      buckets = new ArrayList<EvaluationSearchAggregationBucket>();
    }
  }

  
  /**
   * Simple aggregation value (for SUM, COUNT, AVERAGE, etc.)
   **/
  public EvaluationSearchAggregationResponse value(Double value) {
    this.value = value;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Simple aggregation value (for SUM, COUNT, AVERAGE, etc.)")
  @JsonProperty("value")
  public Double getValue() {
    return value;
  }
  public void setValue(Double value) {
    this.value = value;
  }


  /**
   * Count of documents
   **/
  public EvaluationSearchAggregationResponse count(Long count) {
    this.count = count;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Count of documents")
  @JsonProperty("count")
  public Long getCount() {
    return count;
  }
  public void setCount(Long count) {
    this.count = count;
  }


  /**
   * Minimum value
   **/
  public EvaluationSearchAggregationResponse minimum(Double minimum) {
    this.minimum = minimum;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Minimum value")
  @JsonProperty("minimum")
  public Double getMinimum() {
    return minimum;
  }
  public void setMinimum(Double minimum) {
    this.minimum = minimum;
  }


  /**
   * Maximum value
   **/
  public EvaluationSearchAggregationResponse maximum(Double maximum) {
    this.maximum = maximum;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Maximum value")
  @JsonProperty("maximum")
  public Double getMaximum() {
    return maximum;
  }
  public void setMaximum(Double maximum) {
    this.maximum = maximum;
  }


  /**
   * Average value
   **/
  public EvaluationSearchAggregationResponse average(Double average) {
    this.average = average;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Average value")
  @JsonProperty("average")
  public Double getAverage() {
    return average;
  }
  public void setAverage(Double average) {
    this.average = average;
  }


  /**
   * Total Sum
   **/
  public EvaluationSearchAggregationResponse sum(Double sum) {
    this.sum = sum;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Total Sum")
  @JsonProperty("sum")
  public Double getSum() {
    return sum;
  }
  public void setSum(Double sum) {
    this.sum = sum;
  }


  /**
   * Upper bound estimate of the error in document count for this aggregation
   **/
  public EvaluationSearchAggregationResponse documentCountErrorUpperBound(Long documentCountErrorUpperBound) {
    this.documentCountErrorUpperBound = documentCountErrorUpperBound;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Upper bound estimate of the error in document count for this aggregation")
  @JsonProperty("documentCountErrorUpperBound")
  public Long getDocumentCountErrorUpperBound() {
    return documentCountErrorUpperBound;
  }
  public void setDocumentCountErrorUpperBound(Long documentCountErrorUpperBound) {
    this.documentCountErrorUpperBound = documentCountErrorUpperBound;
  }


  /**
   * Total document count for buckets not included in the response due to size limits
   **/
  public EvaluationSearchAggregationResponse sumOtherDocumentCount(Long sumOtherDocumentCount) {
    this.sumOtherDocumentCount = sumOtherDocumentCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Total document count for buckets not included in the response due to size limits")
  @JsonProperty("sumOtherDocumentCount")
  public Long getSumOtherDocumentCount() {
    return sumOtherDocumentCount;
  }
  public void setSumOtherDocumentCount(Long sumOtherDocumentCount) {
    this.sumOtherDocumentCount = sumOtherDocumentCount;
  }


  /**
   * List of aggregation buckets
   **/
  public EvaluationSearchAggregationResponse buckets(List<EvaluationSearchAggregationBucket> buckets) {
    this.buckets = buckets;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "List of aggregation buckets")
  @JsonProperty("buckets")
  public List<EvaluationSearchAggregationBucket> getBuckets() {
    return buckets;
  }
  public void setBuckets(List<EvaluationSearchAggregationBucket> buckets) {
    this.buckets = buckets;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EvaluationSearchAggregationResponse evaluationSearchAggregationResponse = (EvaluationSearchAggregationResponse) o;

    return Objects.equals(this.value, evaluationSearchAggregationResponse.value) &&
            Objects.equals(this.count, evaluationSearchAggregationResponse.count) &&
            Objects.equals(this.minimum, evaluationSearchAggregationResponse.minimum) &&
            Objects.equals(this.maximum, evaluationSearchAggregationResponse.maximum) &&
            Objects.equals(this.average, evaluationSearchAggregationResponse.average) &&
            Objects.equals(this.sum, evaluationSearchAggregationResponse.sum) &&
            Objects.equals(this.documentCountErrorUpperBound, evaluationSearchAggregationResponse.documentCountErrorUpperBound) &&
            Objects.equals(this.sumOtherDocumentCount, evaluationSearchAggregationResponse.sumOtherDocumentCount) &&
            Objects.equals(this.buckets, evaluationSearchAggregationResponse.buckets);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, count, minimum, maximum, average, sum, documentCountErrorUpperBound, sumOtherDocumentCount, buckets);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EvaluationSearchAggregationResponse {\n");
    
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    minimum: ").append(toIndentedString(minimum)).append("\n");
    sb.append("    maximum: ").append(toIndentedString(maximum)).append("\n");
    sb.append("    average: ").append(toIndentedString(average)).append("\n");
    sb.append("    sum: ").append(toIndentedString(sum)).append("\n");
    sb.append("    documentCountErrorUpperBound: ").append(toIndentedString(documentCountErrorUpperBound)).append("\n");
    sb.append("    sumOtherDocumentCount: ").append(toIndentedString(sumOtherDocumentCount)).append("\n");
    sb.append("    buckets: ").append(toIndentedString(buckets)).append("\n");
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

