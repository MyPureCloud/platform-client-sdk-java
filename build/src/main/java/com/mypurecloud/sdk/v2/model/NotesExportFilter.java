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
import com.mypurecloud.sdk.v2.model.NotesExportComparisonFieldFilter;
import com.mypurecloud.sdk.v2.model.NotesExportFieldFilter;
import com.mypurecloud.sdk.v2.model.NotesExportFieldListFilter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * NotesExportFilter
 */

public class NotesExportFilter  implements Serializable {
  
  private NotesExportFieldFilter eq = null;
  private NotesExportFieldListFilter in = null;
  private NotesExportComparisonFieldFilter lte = null;
  private NotesExportComparisonFieldFilter gte = null;
  private List<NotesExportFilter> and = null;
  private List<NotesExportFilter> or = null;
  private NotesExportFilter not = null;

  public NotesExportFilter() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      and = new ArrayList<NotesExportFilter>();
      or = new ArrayList<NotesExportFilter>();
    }
  }

  public NotesExportFilter(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
      and = new ArrayList<NotesExportFilter>();
      or = new ArrayList<NotesExportFilter>();
    }
  }

  
  /**
   * Filtered field should have the same value
   **/
  public NotesExportFilter eq(NotesExportFieldFilter eq) {
    this.eq = eq;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Filtered field should have the same value")
  @JsonProperty("eq")
  public NotesExportFieldFilter getEq() {
    return eq;
  }
  public void setEq(NotesExportFieldFilter eq) {
    this.eq = eq;
  }


  /**
   * Filtered field should match one of the listed values
   **/
  public NotesExportFilter in(NotesExportFieldListFilter in) {
    this.in = in;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Filtered field should match one of the listed values")
  @JsonProperty("in")
  public NotesExportFieldListFilter getIn() {
    return in;
  }
  public void setIn(NotesExportFieldListFilter in) {
    this.in = in;
  }


  /**
   * Filtered field should be less than or equal to the value
   **/
  public NotesExportFilter lte(NotesExportComparisonFieldFilter lte) {
    this.lte = lte;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Filtered field should be less than or equal to the value")
  @JsonProperty("lte")
  public NotesExportComparisonFieldFilter getLte() {
    return lte;
  }
  public void setLte(NotesExportComparisonFieldFilter lte) {
    this.lte = lte;
  }


  /**
   * Filtered field should be greater than or equal to the value
   **/
  public NotesExportFilter gte(NotesExportComparisonFieldFilter gte) {
    this.gte = gte;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Filtered field should be greater than or equal to the value")
  @JsonProperty("gte")
  public NotesExportComparisonFieldFilter getGte() {
    return gte;
  }
  public void setGte(NotesExportComparisonFieldFilter gte) {
    this.gte = gte;
  }


  /**
   * Boolean AND combination of filters
   **/
  public NotesExportFilter and(List<NotesExportFilter> and) {
    this.and = and;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Boolean AND combination of filters")
  @JsonProperty("and")
  public List<NotesExportFilter> getAnd() {
    return and;
  }
  public void setAnd(List<NotesExportFilter> and) {
    this.and = and;
  }


  /**
   * Boolean OR combination of filters
   **/
  public NotesExportFilter or(List<NotesExportFilter> or) {
    this.or = or;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Boolean OR combination of filters")
  @JsonProperty("or")
  public List<NotesExportFilter> getOr() {
    return or;
  }
  public void setOr(List<NotesExportFilter> or) {
    this.or = or;
  }


  /**
   * Boolean negation of filters
   **/
  public NotesExportFilter not(NotesExportFilter not) {
    this.not = not;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Boolean negation of filters")
  @JsonProperty("not")
  public NotesExportFilter getNot() {
    return not;
  }
  public void setNot(NotesExportFilter not) {
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
    NotesExportFilter notesExportFilter = (NotesExportFilter) o;

    return Objects.equals(this.eq, notesExportFilter.eq) &&
            Objects.equals(this.in, notesExportFilter.in) &&
            Objects.equals(this.lte, notesExportFilter.lte) &&
            Objects.equals(this.gte, notesExportFilter.gte) &&
            Objects.equals(this.and, notesExportFilter.and) &&
            Objects.equals(this.or, notesExportFilter.or) &&
            Objects.equals(this.not, notesExportFilter.not);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eq, in, lte, gte, and, or, not);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NotesExportFilter {\n");
    
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

