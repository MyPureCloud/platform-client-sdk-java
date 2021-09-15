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
 * DevelopmentActivityAggregateQueryResponseStatistics
 */

public class DevelopmentActivityAggregateQueryResponseStatistics  implements Serializable {
  
  private Integer count = null;
  private BigDecimal min = null;
  private BigDecimal max = null;
  private BigDecimal sum = null;

  
  /**
   * The count for this metric
   **/
  public DevelopmentActivityAggregateQueryResponseStatistics count(Integer count) {
    this.count = count;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The count for this metric")
  @JsonProperty("count")
  public Integer getCount() {
    return count;
  }
  public void setCount(Integer count) {
    this.count = count;
  }

  
  /**
   * The minimum value in this metric
   **/
  public DevelopmentActivityAggregateQueryResponseStatistics min(BigDecimal min) {
    this.min = min;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The minimum value in this metric")
  @JsonProperty("min")
  public BigDecimal getMin() {
    return min;
  }
  public void setMin(BigDecimal min) {
    this.min = min;
  }

  
  /**
   * The maximum value in this metric
   **/
  public DevelopmentActivityAggregateQueryResponseStatistics max(BigDecimal max) {
    this.max = max;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The maximum value in this metric")
  @JsonProperty("max")
  public BigDecimal getMax() {
    return max;
  }
  public void setMax(BigDecimal max) {
    this.max = max;
  }

  
  /**
   * The total of the values for this metric
   **/
  public DevelopmentActivityAggregateQueryResponseStatistics sum(BigDecimal sum) {
    this.sum = sum;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The total of the values for this metric")
  @JsonProperty("sum")
  public BigDecimal getSum() {
    return sum;
  }
  public void setSum(BigDecimal sum) {
    this.sum = sum;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DevelopmentActivityAggregateQueryResponseStatistics developmentActivityAggregateQueryResponseStatistics = (DevelopmentActivityAggregateQueryResponseStatistics) o;
    return Objects.equals(this.count, developmentActivityAggregateQueryResponseStatistics.count) &&
        Objects.equals(this.min, developmentActivityAggregateQueryResponseStatistics.min) &&
        Objects.equals(this.max, developmentActivityAggregateQueryResponseStatistics.max) &&
        Objects.equals(this.sum, developmentActivityAggregateQueryResponseStatistics.sum);
  }

  @Override
  public int hashCode() {
    return Objects.hash(count, min, max, sum);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DevelopmentActivityAggregateQueryResponseStatistics {\n");
    
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    min: ").append(toIndentedString(min)).append("\n");
    sb.append("    max: ").append(toIndentedString(max)).append("\n");
    sb.append("    sum: ").append(toIndentedString(sum)).append("\n");
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

