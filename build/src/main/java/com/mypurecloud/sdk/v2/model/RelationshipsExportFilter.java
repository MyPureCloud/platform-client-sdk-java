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
import com.mypurecloud.sdk.v2.model.RelationshipsExportComparisonFieldFilter;
import com.mypurecloud.sdk.v2.model.RelationshipsExportFieldFilter;
import com.mypurecloud.sdk.v2.model.RelationshipsExportFieldListFilter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * RelationshipsExportFilter
 */

public class RelationshipsExportFilter  implements Serializable {
  
  private RelationshipsExportFieldFilter eq = null;
  private RelationshipsExportFieldListFilter in = null;
  private RelationshipsExportComparisonFieldFilter lte = null;
  private RelationshipsExportComparisonFieldFilter gte = null;
  private List<RelationshipsExportFilter> and = null;
  private List<RelationshipsExportFilter> or = null;
  private RelationshipsExportFilter not = null;

  public RelationshipsExportFilter() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      and = new ArrayList<RelationshipsExportFilter>();
      or = new ArrayList<RelationshipsExportFilter>();
    }
  }

  public RelationshipsExportFilter(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
      and = new ArrayList<RelationshipsExportFilter>();
      or = new ArrayList<RelationshipsExportFilter>();
    }
  }

  
  /**
   * Filtered field should have the same value
   **/
  public RelationshipsExportFilter eq(RelationshipsExportFieldFilter eq) {
    this.eq = eq;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Filtered field should have the same value")
  @JsonProperty("eq")
  public RelationshipsExportFieldFilter getEq() {
    return eq;
  }
  public void setEq(RelationshipsExportFieldFilter eq) {
    this.eq = eq;
  }


  /**
   * Filtered field should match one of the listed values
   **/
  public RelationshipsExportFilter in(RelationshipsExportFieldListFilter in) {
    this.in = in;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Filtered field should match one of the listed values")
  @JsonProperty("in")
  public RelationshipsExportFieldListFilter getIn() {
    return in;
  }
  public void setIn(RelationshipsExportFieldListFilter in) {
    this.in = in;
  }


  /**
   * Filtered field should be less than or equal to the value
   **/
  public RelationshipsExportFilter lte(RelationshipsExportComparisonFieldFilter lte) {
    this.lte = lte;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Filtered field should be less than or equal to the value")
  @JsonProperty("lte")
  public RelationshipsExportComparisonFieldFilter getLte() {
    return lte;
  }
  public void setLte(RelationshipsExportComparisonFieldFilter lte) {
    this.lte = lte;
  }


  /**
   * Filtered field should be greater than or equal to the value
   **/
  public RelationshipsExportFilter gte(RelationshipsExportComparisonFieldFilter gte) {
    this.gte = gte;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Filtered field should be greater than or equal to the value")
  @JsonProperty("gte")
  public RelationshipsExportComparisonFieldFilter getGte() {
    return gte;
  }
  public void setGte(RelationshipsExportComparisonFieldFilter gte) {
    this.gte = gte;
  }


  /**
   * Boolean AND combination of filters
   **/
  public RelationshipsExportFilter and(List<RelationshipsExportFilter> and) {
    this.and = and;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Boolean AND combination of filters")
  @JsonProperty("and")
  public List<RelationshipsExportFilter> getAnd() {
    return and;
  }
  public void setAnd(List<RelationshipsExportFilter> and) {
    this.and = and;
  }


  /**
   * Boolean OR combination of filters
   **/
  public RelationshipsExportFilter or(List<RelationshipsExportFilter> or) {
    this.or = or;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Boolean OR combination of filters")
  @JsonProperty("or")
  public List<RelationshipsExportFilter> getOr() {
    return or;
  }
  public void setOr(List<RelationshipsExportFilter> or) {
    this.or = or;
  }


  /**
   * Boolean negation of filters
   **/
  public RelationshipsExportFilter not(RelationshipsExportFilter not) {
    this.not = not;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Boolean negation of filters")
  @JsonProperty("not")
  public RelationshipsExportFilter getNot() {
    return not;
  }
  public void setNot(RelationshipsExportFilter not) {
    this.not = not;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RelationshipsExportFilter relationshipsExportFilter = (RelationshipsExportFilter) o;

    return Objects.equals(this.eq, relationshipsExportFilter.eq) &&
            Objects.equals(this.in, relationshipsExportFilter.in) &&
            Objects.equals(this.lte, relationshipsExportFilter.lte) &&
            Objects.equals(this.gte, relationshipsExportFilter.gte) &&
            Objects.equals(this.and, relationshipsExportFilter.and) &&
            Objects.equals(this.or, relationshipsExportFilter.or) &&
            Objects.equals(this.not, relationshipsExportFilter.not);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eq, in, lte, gte, and, or, not);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RelationshipsExportFilter {\n");
    
    sb.append("    eq: ").append(toIndentedString(eq)).append("\n");
    sb.append("    in: ").append(toIndentedString(in)).append("\n");
    sb.append("    lte: ").append(toIndentedString(lte)).append("\n");
    sb.append("    gte: ").append(toIndentedString(gte)).append("\n");
    sb.append("    and: ").append(toIndentedString(and)).append("\n");
    sb.append("    or: ").append(toIndentedString(or)).append("\n");
    sb.append("    not: ").append(toIndentedString(not)).append("\n");
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

