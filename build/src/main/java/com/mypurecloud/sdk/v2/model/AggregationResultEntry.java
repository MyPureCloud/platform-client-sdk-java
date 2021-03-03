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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;

import java.io.Serializable;
/**
 * AggregationResultEntry
 */

public class AggregationResultEntry  implements Serializable {
  
  private Long count = null;
  private String value = null;
  private BigDecimal gte = null;
  private BigDecimal lt = null;

  
  /**
   **/
  public AggregationResultEntry count(Long count) {
    this.count = count;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("count")
  public Long getCount() {
    return count;
  }
  public void setCount(Long count) {
    this.count = count;
  }

  
  /**
   * For termFrequency aggregations
   **/
  public AggregationResultEntry value(String value) {
    this.value = value;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "For termFrequency aggregations")
  @JsonProperty("value")
  public String getValue() {
    return value;
  }
  public void setValue(String value) {
    this.value = value;
  }

  
  /**
   * For numericRange aggregations
   **/
  public AggregationResultEntry gte(BigDecimal gte) {
    this.gte = gte;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "For numericRange aggregations")
  @JsonProperty("gte")
  public BigDecimal getGte() {
    return gte;
  }
  public void setGte(BigDecimal gte) {
    this.gte = gte;
  }

  
  /**
   * For numericRange aggregations
   **/
  public AggregationResultEntry lt(BigDecimal lt) {
    this.lt = lt;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "For numericRange aggregations")
  @JsonProperty("lt")
  public BigDecimal getLt() {
    return lt;
  }
  public void setLt(BigDecimal lt) {
    this.lt = lt;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AggregationResultEntry aggregationResultEntry = (AggregationResultEntry) o;
    return Objects.equals(this.count, aggregationResultEntry.count) &&
        Objects.equals(this.value, aggregationResultEntry.value) &&
        Objects.equals(this.gte, aggregationResultEntry.gte) &&
        Objects.equals(this.lt, aggregationResultEntry.lt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(count, value, gte, lt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AggregationResultEntry {\n");
    
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    gte: ").append(toIndentedString(gte)).append("\n");
    sb.append("    lt: ").append(toIndentedString(lt)).append("\n");
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

