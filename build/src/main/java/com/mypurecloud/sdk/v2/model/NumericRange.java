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
 * NumericRange
 */

public class NumericRange  implements Serializable {
  
  private BigDecimal gt = null;
  private BigDecimal gte = null;
  private BigDecimal lt = null;
  private BigDecimal lte = null;

  
  /**
   * Greater than
   **/
  public NumericRange gt(BigDecimal gt) {
    this.gt = gt;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Greater than")
  @JsonProperty("gt")
  public BigDecimal getGt() {
    return gt;
  }
  public void setGt(BigDecimal gt) {
    this.gt = gt;
  }

  
  /**
   * Greater than or equal to
   **/
  public NumericRange gte(BigDecimal gte) {
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
  public NumericRange lt(BigDecimal lt) {
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

  
  /**
   * Less than or equal to
   **/
  public NumericRange lte(BigDecimal lte) {
    this.lte = lte;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Less than or equal to")
  @JsonProperty("lte")
  public BigDecimal getLte() {
    return lte;
  }
  public void setLte(BigDecimal lte) {
    this.lte = lte;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NumericRange numericRange = (NumericRange) o;
    return Objects.equals(this.gt, numericRange.gt) &&
        Objects.equals(this.gte, numericRange.gte) &&
        Objects.equals(this.lt, numericRange.lt) &&
        Objects.equals(this.lte, numericRange.lte);
  }

  @Override
  public int hashCode() {
    return Objects.hash(gt, gte, lt, lte);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NumericRange {\n");
    
    sb.append("    gt: ").append(toIndentedString(gt)).append("\n");
    sb.append("    gte: ").append(toIndentedString(gte)).append("\n");
    sb.append("    lt: ").append(toIndentedString(lt)).append("\n");
    sb.append("    lte: ").append(toIndentedString(lte)).append("\n");
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

