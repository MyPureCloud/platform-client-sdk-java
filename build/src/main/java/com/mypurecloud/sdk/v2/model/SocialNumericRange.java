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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;

import java.io.Serializable;
/**
 * SocialNumericRange
 */

public class SocialNumericRange  implements Serializable {
  
  private BigDecimal eq = null;
  private BigDecimal gt = null;
  private BigDecimal gte = null;
  private BigDecimal lt = null;
  private BigDecimal lte = null;

  public SocialNumericRange() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  public SocialNumericRange(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
    }
  }

  
  /**
   * Equals to
   **/
  public SocialNumericRange eq(BigDecimal eq) {
    this.eq = eq;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Equals to")
  @JsonProperty("eq")
  public BigDecimal getEq() {
    return eq;
  }
  public void setEq(BigDecimal eq) {
    this.eq = eq;
  }


  /**
   * Greater than
   **/
  public SocialNumericRange gt(BigDecimal gt) {
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
  public SocialNumericRange gte(BigDecimal gte) {
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
  public SocialNumericRange lt(BigDecimal lt) {
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
  public SocialNumericRange lte(BigDecimal lte) {
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
    SocialNumericRange socialNumericRange = (SocialNumericRange) o;

    return Objects.equals(this.eq, socialNumericRange.eq) &&
            Objects.equals(this.gt, socialNumericRange.gt) &&
            Objects.equals(this.gte, socialNumericRange.gte) &&
            Objects.equals(this.lt, socialNumericRange.lt) &&
            Objects.equals(this.lte, socialNumericRange.lte);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eq, gt, gte, lt, lte);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SocialNumericRange {\n");
    
    sb.append("    eq: ").append(toIndentedString(eq)).append("\n");
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

