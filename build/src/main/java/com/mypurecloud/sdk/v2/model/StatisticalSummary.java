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
 * StatisticalSummary
 */

public class StatisticalSummary  implements Serializable {
  
  private BigDecimal max = null;
  private BigDecimal min = null;
  private Long count = null;
  private Long countNegative = null;
  private Long countPositive = null;
  private BigDecimal sum = null;
  private BigDecimal current = null;
  private BigDecimal ratio = null;
  private BigDecimal numerator = null;
  private BigDecimal denominator = null;
  private BigDecimal target = null;

  
  /**
   **/
  public StatisticalSummary max(BigDecimal max) {
    this.max = max;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("max")
  public BigDecimal getMax() {
    return max;
  }
  public void setMax(BigDecimal max) {
    this.max = max;
  }

  
  /**
   **/
  public StatisticalSummary min(BigDecimal min) {
    this.min = min;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("min")
  public BigDecimal getMin() {
    return min;
  }
  public void setMin(BigDecimal min) {
    this.min = min;
  }

  
  /**
   **/
  public StatisticalSummary count(Long count) {
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
   **/
  public StatisticalSummary countNegative(Long countNegative) {
    this.countNegative = countNegative;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("countNegative")
  public Long getCountNegative() {
    return countNegative;
  }
  public void setCountNegative(Long countNegative) {
    this.countNegative = countNegative;
  }

  
  /**
   **/
  public StatisticalSummary countPositive(Long countPositive) {
    this.countPositive = countPositive;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("countPositive")
  public Long getCountPositive() {
    return countPositive;
  }
  public void setCountPositive(Long countPositive) {
    this.countPositive = countPositive;
  }

  
  /**
   **/
  public StatisticalSummary sum(BigDecimal sum) {
    this.sum = sum;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("sum")
  public BigDecimal getSum() {
    return sum;
  }
  public void setSum(BigDecimal sum) {
    this.sum = sum;
  }

  
  /**
   **/
  public StatisticalSummary current(BigDecimal current) {
    this.current = current;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("current")
  public BigDecimal getCurrent() {
    return current;
  }
  public void setCurrent(BigDecimal current) {
    this.current = current;
  }

  
  /**
   **/
  public StatisticalSummary ratio(BigDecimal ratio) {
    this.ratio = ratio;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("ratio")
  public BigDecimal getRatio() {
    return ratio;
  }
  public void setRatio(BigDecimal ratio) {
    this.ratio = ratio;
  }

  
  /**
   **/
  public StatisticalSummary numerator(BigDecimal numerator) {
    this.numerator = numerator;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("numerator")
  public BigDecimal getNumerator() {
    return numerator;
  }
  public void setNumerator(BigDecimal numerator) {
    this.numerator = numerator;
  }

  
  /**
   **/
  public StatisticalSummary denominator(BigDecimal denominator) {
    this.denominator = denominator;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("denominator")
  public BigDecimal getDenominator() {
    return denominator;
  }
  public void setDenominator(BigDecimal denominator) {
    this.denominator = denominator;
  }

  
  /**
   **/
  public StatisticalSummary target(BigDecimal target) {
    this.target = target;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("target")
  public BigDecimal getTarget() {
    return target;
  }
  public void setTarget(BigDecimal target) {
    this.target = target;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StatisticalSummary statisticalSummary = (StatisticalSummary) o;
    return Objects.equals(this.max, statisticalSummary.max) &&
        Objects.equals(this.min, statisticalSummary.min) &&
        Objects.equals(this.count, statisticalSummary.count) &&
        Objects.equals(this.countNegative, statisticalSummary.countNegative) &&
        Objects.equals(this.countPositive, statisticalSummary.countPositive) &&
        Objects.equals(this.sum, statisticalSummary.sum) &&
        Objects.equals(this.current, statisticalSummary.current) &&
        Objects.equals(this.ratio, statisticalSummary.ratio) &&
        Objects.equals(this.numerator, statisticalSummary.numerator) &&
        Objects.equals(this.denominator, statisticalSummary.denominator) &&
        Objects.equals(this.target, statisticalSummary.target);
  }

  @Override
  public int hashCode() {
    return Objects.hash(max, min, count, countNegative, countPositive, sum, current, ratio, numerator, denominator, target);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StatisticalSummary {\n");
    
    sb.append("    max: ").append(toIndentedString(max)).append("\n");
    sb.append("    min: ").append(toIndentedString(min)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    countNegative: ").append(toIndentedString(countNegative)).append("\n");
    sb.append("    countPositive: ").append(toIndentedString(countPositive)).append("\n");
    sb.append("    sum: ").append(toIndentedString(sum)).append("\n");
    sb.append("    current: ").append(toIndentedString(current)).append("\n");
    sb.append("    ratio: ").append(toIndentedString(ratio)).append("\n");
    sb.append("    numerator: ").append(toIndentedString(numerator)).append("\n");
    sb.append("    denominator: ").append(toIndentedString(denominator)).append("\n");
    sb.append("    target: ").append(toIndentedString(target)).append("\n");
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

