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
 * AggregationRange
 */

public class AggregationRange  implements Serializable {
  
  private BigDecimal gte = null;
  private BigDecimal lt = null;

  
  /**
   * Greater than or equal to
   **/
  public AggregationRange gte(BigDecimal gte) {
    this.gte = gte;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Greater than or equal to")
  @JsonProperty("gte")
  public BigDecimal getGte() {
    return gte;
  }
  public void setGte(BigDecimal gte) {
    this.gte = gte;
  }

  
  /**
   * Less than
   **/
  public AggregationRange lt(BigDecimal lt) {
    this.lt = lt;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Less than")
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
    AggregationRange aggregationRange = (AggregationRange) o;
    return Objects.equals(this.gte, aggregationRange.gte) &&
        Objects.equals(this.lt, aggregationRange.lt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(gte, lt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AggregationRange {\n");
    
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

