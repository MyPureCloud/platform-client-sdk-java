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
import com.mypurecloud.sdk.v2.model.OrganizationsExportComparisonFieldFilter;
import com.mypurecloud.sdk.v2.model.OrganizationsExportFieldFilter;
import com.mypurecloud.sdk.v2.model.OrganizationsExportFieldListFilter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * OrganizationsExportFilter
 */

public class OrganizationsExportFilter  implements Serializable {
  
  private OrganizationsExportFieldFilter eq = null;
  private OrganizationsExportFieldListFilter in = null;
  private OrganizationsExportComparisonFieldFilter lte = null;
  private OrganizationsExportComparisonFieldFilter gte = null;
  private List<OrganizationsExportFilter> and = null;
  private List<OrganizationsExportFilter> or = null;
  private OrganizationsExportFilter not = null;

  public OrganizationsExportFilter() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      and = new ArrayList<OrganizationsExportFilter>();
      or = new ArrayList<OrganizationsExportFilter>();
    }
  }

  public OrganizationsExportFilter(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
      and = new ArrayList<OrganizationsExportFilter>();
      or = new ArrayList<OrganizationsExportFilter>();
    }
  }

  
  /**
   * Filtered field should have the same value
   **/
  public OrganizationsExportFilter eq(OrganizationsExportFieldFilter eq) {
    this.eq = eq;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Filtered field should have the same value")
  @JsonProperty("eq")
  public OrganizationsExportFieldFilter getEq() {
    return eq;
  }
  public void setEq(OrganizationsExportFieldFilter eq) {
    this.eq = eq;
  }


  /**
   * Filtered field should match one of the listed values
   **/
  public OrganizationsExportFilter in(OrganizationsExportFieldListFilter in) {
    this.in = in;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Filtered field should match one of the listed values")
  @JsonProperty("in")
  public OrganizationsExportFieldListFilter getIn() {
    return in;
  }
  public void setIn(OrganizationsExportFieldListFilter in) {
    this.in = in;
  }


  /**
   * Filtered field should be less than or equal to the value
   **/
  public OrganizationsExportFilter lte(OrganizationsExportComparisonFieldFilter lte) {
    this.lte = lte;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Filtered field should be less than or equal to the value")
  @JsonProperty("lte")
  public OrganizationsExportComparisonFieldFilter getLte() {
    return lte;
  }
  public void setLte(OrganizationsExportComparisonFieldFilter lte) {
    this.lte = lte;
  }


  /**
   * Filtered field should be greater than or equal to the value
   **/
  public OrganizationsExportFilter gte(OrganizationsExportComparisonFieldFilter gte) {
    this.gte = gte;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Filtered field should be greater than or equal to the value")
  @JsonProperty("gte")
  public OrganizationsExportComparisonFieldFilter getGte() {
    return gte;
  }
  public void setGte(OrganizationsExportComparisonFieldFilter gte) {
    this.gte = gte;
  }


  /**
   * Boolean AND combination of filters
   **/
  public OrganizationsExportFilter and(List<OrganizationsExportFilter> and) {
    this.and = and;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Boolean AND combination of filters")
  @JsonProperty("and")
  public List<OrganizationsExportFilter> getAnd() {
    return and;
  }
  public void setAnd(List<OrganizationsExportFilter> and) {
    this.and = and;
  }


  /**
   * Boolean OR combination of filters
   **/
  public OrganizationsExportFilter or(List<OrganizationsExportFilter> or) {
    this.or = or;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Boolean OR combination of filters")
  @JsonProperty("or")
  public List<OrganizationsExportFilter> getOr() {
    return or;
  }
  public void setOr(List<OrganizationsExportFilter> or) {
    this.or = or;
  }


  /**
   * Boolean negation of filters
   **/
  public OrganizationsExportFilter not(OrganizationsExportFilter not) {
    this.not = not;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Boolean negation of filters")
  @JsonProperty("not")
  public OrganizationsExportFilter getNot() {
    return not;
  }
  public void setNot(OrganizationsExportFilter not) {
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
    OrganizationsExportFilter organizationsExportFilter = (OrganizationsExportFilter) o;

    return Objects.equals(this.eq, organizationsExportFilter.eq) &&
            Objects.equals(this.in, organizationsExportFilter.in) &&
            Objects.equals(this.lte, organizationsExportFilter.lte) &&
            Objects.equals(this.gte, organizationsExportFilter.gte) &&
            Objects.equals(this.and, organizationsExportFilter.and) &&
            Objects.equals(this.or, organizationsExportFilter.or) &&
            Objects.equals(this.not, organizationsExportFilter.not);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eq, in, lte, gte, and, or, not);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrganizationsExportFilter {\n");
    
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

