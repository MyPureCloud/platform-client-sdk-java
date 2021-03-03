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
import java.util.Date;

import java.io.Serializable;
/**
 * FacetStatistics
 */

public class FacetStatistics  implements Serializable {
  
  private Long count = null;
  private Double min = null;
  private Double max = null;
  private Double mean = null;
  private Double stdDeviation = null;
  private Date dateMin = null;
  private Date dateMax = null;

  
  /**
   **/
  public FacetStatistics count(Long count) {
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
  public FacetStatistics min(Double min) {
    this.min = min;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("min")
  public Double getMin() {
    return min;
  }
  public void setMin(Double min) {
    this.min = min;
  }

  
  /**
   **/
  public FacetStatistics max(Double max) {
    this.max = max;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("max")
  public Double getMax() {
    return max;
  }
  public void setMax(Double max) {
    this.max = max;
  }

  
  /**
   **/
  public FacetStatistics mean(Double mean) {
    this.mean = mean;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("mean")
  public Double getMean() {
    return mean;
  }
  public void setMean(Double mean) {
    this.mean = mean;
  }

  
  /**
   **/
  public FacetStatistics stdDeviation(Double stdDeviation) {
    this.stdDeviation = stdDeviation;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("stdDeviation")
  public Double getStdDeviation() {
    return stdDeviation;
  }
  public void setStdDeviation(Double stdDeviation) {
    this.stdDeviation = stdDeviation;
  }

  
  /**
   * Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public FacetStatistics dateMin(Date dateMin) {
    this.dateMin = dateMin;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateMin")
  public Date getDateMin() {
    return dateMin;
  }
  public void setDateMin(Date dateMin) {
    this.dateMin = dateMin;
  }

  
  /**
   * Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public FacetStatistics dateMax(Date dateMax) {
    this.dateMax = dateMax;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateMax")
  public Date getDateMax() {
    return dateMax;
  }
  public void setDateMax(Date dateMax) {
    this.dateMax = dateMax;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FacetStatistics facetStatistics = (FacetStatistics) o;
    return Objects.equals(this.count, facetStatistics.count) &&
        Objects.equals(this.min, facetStatistics.min) &&
        Objects.equals(this.max, facetStatistics.max) &&
        Objects.equals(this.mean, facetStatistics.mean) &&
        Objects.equals(this.stdDeviation, facetStatistics.stdDeviation) &&
        Objects.equals(this.dateMin, facetStatistics.dateMin) &&
        Objects.equals(this.dateMax, facetStatistics.dateMax);
  }

  @Override
  public int hashCode() {
    return Objects.hash(count, min, max, mean, stdDeviation, dateMin, dateMax);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FacetStatistics {\n");
    
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    min: ").append(toIndentedString(min)).append("\n");
    sb.append("    max: ").append(toIndentedString(max)).append("\n");
    sb.append("    mean: ").append(toIndentedString(mean)).append("\n");
    sb.append("    stdDeviation: ").append(toIndentedString(stdDeviation)).append("\n");
    sb.append("    dateMin: ").append(toIndentedString(dateMin)).append("\n");
    sb.append("    dateMax: ").append(toIndentedString(dateMax)).append("\n");
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

