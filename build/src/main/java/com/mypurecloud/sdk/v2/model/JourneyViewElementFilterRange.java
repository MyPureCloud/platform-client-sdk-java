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
import com.mypurecloud.sdk.v2.model.JourneyViewElementFilterRangeData;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * the range of attribute values to filter on. At least one comparator must be defined
 */
@ApiModel(description = "the range of attribute values to filter on. At least one comparator must be defined")

public class JourneyViewElementFilterRange  implements Serializable {
  
  private JourneyViewElementFilterRangeData lt = null;
  private JourneyViewElementFilterRangeData lte = null;
  private JourneyViewElementFilterRangeData gt = null;
  private JourneyViewElementFilterRangeData gte = null;
  private JourneyViewElementFilterRangeData eq = null;
  private JourneyViewElementFilterRangeData neq = null;

  public JourneyViewElementFilterRange() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * comparator: less than
   **/
  public JourneyViewElementFilterRange lt(JourneyViewElementFilterRangeData lt) {
    this.lt = lt;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "comparator: less than")
  @JsonProperty("lt")
  public JourneyViewElementFilterRangeData getLt() {
    return lt;
  }
  public void setLt(JourneyViewElementFilterRangeData lt) {
    this.lt = lt;
  }


  /**
   * comparator: less than or equal
   **/
  public JourneyViewElementFilterRange lte(JourneyViewElementFilterRangeData lte) {
    this.lte = lte;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "comparator: less than or equal")
  @JsonProperty("lte")
  public JourneyViewElementFilterRangeData getLte() {
    return lte;
  }
  public void setLte(JourneyViewElementFilterRangeData lte) {
    this.lte = lte;
  }


  /**
   * comparator: greater than
   **/
  public JourneyViewElementFilterRange gt(JourneyViewElementFilterRangeData gt) {
    this.gt = gt;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "comparator: greater than")
  @JsonProperty("gt")
  public JourneyViewElementFilterRangeData getGt() {
    return gt;
  }
  public void setGt(JourneyViewElementFilterRangeData gt) {
    this.gt = gt;
  }


  /**
   * comparator: greater than or equal
   **/
  public JourneyViewElementFilterRange gte(JourneyViewElementFilterRangeData gte) {
    this.gte = gte;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "comparator: greater than or equal")
  @JsonProperty("gte")
  public JourneyViewElementFilterRangeData getGte() {
    return gte;
  }
  public void setGte(JourneyViewElementFilterRangeData gte) {
    this.gte = gte;
  }


  /**
   * comparator: is equal to
   **/
  public JourneyViewElementFilterRange eq(JourneyViewElementFilterRangeData eq) {
    this.eq = eq;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "comparator: is equal to")
  @JsonProperty("eq")
  public JourneyViewElementFilterRangeData getEq() {
    return eq;
  }
  public void setEq(JourneyViewElementFilterRangeData eq) {
    this.eq = eq;
  }


  /**
   * comparator: is not equal to
   **/
  public JourneyViewElementFilterRange neq(JourneyViewElementFilterRangeData neq) {
    this.neq = neq;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "comparator: is not equal to")
  @JsonProperty("neq")
  public JourneyViewElementFilterRangeData getNeq() {
    return neq;
  }
  public void setNeq(JourneyViewElementFilterRangeData neq) {
    this.neq = neq;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JourneyViewElementFilterRange journeyViewElementFilterRange = (JourneyViewElementFilterRange) o;

    return Objects.equals(this.lt, journeyViewElementFilterRange.lt) &&
            Objects.equals(this.lte, journeyViewElementFilterRange.lte) &&
            Objects.equals(this.gt, journeyViewElementFilterRange.gt) &&
            Objects.equals(this.gte, journeyViewElementFilterRange.gte) &&
            Objects.equals(this.eq, journeyViewElementFilterRange.eq) &&
            Objects.equals(this.neq, journeyViewElementFilterRange.neq);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lt, lte, gt, gte, eq, neq);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JourneyViewElementFilterRange {\n");
    
    sb.append("    lt: ").append(toIndentedString(lt)).append("\n");
    sb.append("    lte: ").append(toIndentedString(lte)).append("\n");
    sb.append("    gt: ").append(toIndentedString(gt)).append("\n");
    sb.append("    gte: ").append(toIndentedString(gte)).append("\n");
    sb.append("    eq: ").append(toIndentedString(eq)).append("\n");
    sb.append("    neq: ").append(toIndentedString(neq)).append("\n");
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

