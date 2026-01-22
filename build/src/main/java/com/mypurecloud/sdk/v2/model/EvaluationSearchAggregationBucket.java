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
import com.mypurecloud.sdk.v2.model.EvaluationSearchAggregationResponse;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import java.io.Serializable;
/**
 * EvaluationSearchAggregationBucket
 */

public class EvaluationSearchAggregationBucket  implements Serializable {
  
  private String key = null;
  private String keyAsString = null;
  private Long documentCount = null;
  private Long keyValue = null;
  private Double from = null;
  private Double to = null;
  private Double value = null;
  private Long count = null;
  private Double minimum = null;
  private Double maximum = null;
  private Double average = null;
  private Double sum = null;
  private Map<String, EvaluationSearchAggregationResponse> subAggregations = null;

  public EvaluationSearchAggregationBucket() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * The key for this bucket
   **/
  public EvaluationSearchAggregationBucket key(String key) {
    this.key = key;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The key for this bucket")
  @JsonProperty("key")
  public String getKey() {
    return key;
  }
  public void setKey(String key) {
    this.key = key;
  }


  /**
   * The key as a string representation
   **/
  public EvaluationSearchAggregationBucket keyAsString(String keyAsString) {
    this.keyAsString = keyAsString;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The key as a string representation")
  @JsonProperty("keyAsString")
  public String getKeyAsString() {
    return keyAsString;
  }
  public void setKeyAsString(String keyAsString) {
    this.keyAsString = keyAsString;
  }


  /**
   * Number of documents in this bucket
   **/
  public EvaluationSearchAggregationBucket documentCount(Long documentCount) {
    this.documentCount = documentCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Number of documents in this bucket")
  @JsonProperty("documentCount")
  public Long getDocumentCount() {
    return documentCount;
  }
  public void setDocumentCount(Long documentCount) {
    this.documentCount = documentCount;
  }


  /**
   * Numeric key value for date histograms
   **/
  public EvaluationSearchAggregationBucket keyValue(Long keyValue) {
    this.keyValue = keyValue;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Numeric key value for date histograms")
  @JsonProperty("keyValue")
  public Long getKeyValue() {
    return keyValue;
  }
  public void setKeyValue(Long keyValue) {
    this.keyValue = keyValue;
  }


  /**
   * Lower bound for range buckets
   **/
  public EvaluationSearchAggregationBucket from(Double from) {
    this.from = from;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Lower bound for range buckets")
  @JsonProperty("from")
  public Double getFrom() {
    return from;
  }
  public void setFrom(Double from) {
    this.from = from;
  }


  /**
   * Upper bound for range buckets
   **/
  public EvaluationSearchAggregationBucket to(Double to) {
    this.to = to;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Upper bound for range buckets")
  @JsonProperty("to")
  public Double getTo() {
    return to;
  }
  public void setTo(Double to) {
    this.to = to;
  }


  /**
   * Simple aggregation value
   **/
  public EvaluationSearchAggregationBucket value(Double value) {
    this.value = value;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Simple aggregation value")
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
  public EvaluationSearchAggregationBucket count(Long count) {
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
   * Minimum value in the aggregation
   **/
  public EvaluationSearchAggregationBucket minimum(Double minimum) {
    this.minimum = minimum;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Minimum value in the aggregation")
  @JsonProperty("minimum")
  public Double getMinimum() {
    return minimum;
  }
  public void setMinimum(Double minimum) {
    this.minimum = minimum;
  }


  /**
   * Maximum value in the aggregation
   **/
  public EvaluationSearchAggregationBucket maximum(Double maximum) {
    this.maximum = maximum;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Maximum value in the aggregation")
  @JsonProperty("maximum")
  public Double getMaximum() {
    return maximum;
  }
  public void setMaximum(Double maximum) {
    this.maximum = maximum;
  }


  /**
   * Average value in the aggregation
   **/
  public EvaluationSearchAggregationBucket average(Double average) {
    this.average = average;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Average value in the aggregation")
  @JsonProperty("average")
  public Double getAverage() {
    return average;
  }
  public void setAverage(Double average) {
    this.average = average;
  }


  /**
   * Sum of values in the aggregation
   **/
  public EvaluationSearchAggregationBucket sum(Double sum) {
    this.sum = sum;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Sum of values in the aggregation")
  @JsonProperty("sum")
  public Double getSum() {
    return sum;
  }
  public void setSum(Double sum) {
    this.sum = sum;
  }


  /**
   * Nested sub-aggregations
   **/
  public EvaluationSearchAggregationBucket subAggregations(Map<String, EvaluationSearchAggregationResponse> subAggregations) {
    this.subAggregations = subAggregations;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Nested sub-aggregations")
  @JsonProperty("subAggregations")
  public Map<String, EvaluationSearchAggregationResponse> getSubAggregations() {
    return subAggregations;
  }
  public void setSubAggregations(Map<String, EvaluationSearchAggregationResponse> subAggregations) {
    this.subAggregations = subAggregations;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EvaluationSearchAggregationBucket evaluationSearchAggregationBucket = (EvaluationSearchAggregationBucket) o;

    return Objects.equals(this.key, evaluationSearchAggregationBucket.key) &&
            Objects.equals(this.keyAsString, evaluationSearchAggregationBucket.keyAsString) &&
            Objects.equals(this.documentCount, evaluationSearchAggregationBucket.documentCount) &&
            Objects.equals(this.keyValue, evaluationSearchAggregationBucket.keyValue) &&
            Objects.equals(this.from, evaluationSearchAggregationBucket.from) &&
            Objects.equals(this.to, evaluationSearchAggregationBucket.to) &&
            Objects.equals(this.value, evaluationSearchAggregationBucket.value) &&
            Objects.equals(this.count, evaluationSearchAggregationBucket.count) &&
            Objects.equals(this.minimum, evaluationSearchAggregationBucket.minimum) &&
            Objects.equals(this.maximum, evaluationSearchAggregationBucket.maximum) &&
            Objects.equals(this.average, evaluationSearchAggregationBucket.average) &&
            Objects.equals(this.sum, evaluationSearchAggregationBucket.sum) &&
            Objects.equals(this.subAggregations, evaluationSearchAggregationBucket.subAggregations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, keyAsString, documentCount, keyValue, from, to, value, count, minimum, maximum, average, sum, subAggregations);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EvaluationSearchAggregationBucket {\n");
    
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    keyAsString: ").append(toIndentedString(keyAsString)).append("\n");
    sb.append("    documentCount: ").append(toIndentedString(documentCount)).append("\n");
    sb.append("    keyValue: ").append(toIndentedString(keyValue)).append("\n");
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    to: ").append(toIndentedString(to)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    minimum: ").append(toIndentedString(minimum)).append("\n");
    sb.append("    maximum: ").append(toIndentedString(maximum)).append("\n");
    sb.append("    average: ").append(toIndentedString(average)).append("\n");
    sb.append("    sum: ").append(toIndentedString(sum)).append("\n");
    sb.append("    subAggregations: ").append(toIndentedString(subAggregations)).append("\n");
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

