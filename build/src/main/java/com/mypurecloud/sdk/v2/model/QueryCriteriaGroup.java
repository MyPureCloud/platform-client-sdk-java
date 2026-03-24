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
import com.mypurecloud.sdk.v2.model.QueryCriteriaItem;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * A group of logical items for library queries
 */
@ApiModel(description = "A group of logical items for library queries")

public class QueryCriteriaGroup  implements Serializable {
  
  private List<QueryCriteriaItem> and = null;
  private List<QueryCriteriaItem> or = null;
  private List<QueryCriteriaItem> not = null;
  private QueryCriteriaItem criteria = null;

  public QueryCriteriaGroup() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      and = new ArrayList<QueryCriteriaItem>();
      or = new ArrayList<QueryCriteriaItem>();
      not = new ArrayList<QueryCriteriaItem>();
    }
  }

  
  /**
   * Items that will be AND'd together
   **/
  public QueryCriteriaGroup and(List<QueryCriteriaItem> and) {
    this.and = and;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Items that will be AND'd together")
  @JsonProperty("and")
  public List<QueryCriteriaItem> getAnd() {
    return and;
  }
  public void setAnd(List<QueryCriteriaItem> and) {
    this.and = and;
  }


  /**
   * Items that will be OR'd together
   **/
  public QueryCriteriaGroup or(List<QueryCriteriaItem> or) {
    this.or = or;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Items that will be OR'd together")
  @JsonProperty("or")
  public List<QueryCriteriaItem> getOr() {
    return or;
  }
  public void setOr(List<QueryCriteriaItem> or) {
    this.or = or;
  }


  /**
   * Items that must all be false
   **/
  public QueryCriteriaGroup not(List<QueryCriteriaItem> not) {
    this.not = not;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Items that must all be false")
  @JsonProperty("not")
  public List<QueryCriteriaItem> getNot() {
    return not;
  }
  public void setNot(List<QueryCriteriaItem> not) {
    this.not = not;
  }


  /**
   * A single item
   **/
  public QueryCriteriaGroup criteria(QueryCriteriaItem criteria) {
    this.criteria = criteria;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A single item")
  @JsonProperty("criteria")
  public QueryCriteriaItem getCriteria() {
    return criteria;
  }
  public void setCriteria(QueryCriteriaItem criteria) {
    this.criteria = criteria;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QueryCriteriaGroup queryCriteriaGroup = (QueryCriteriaGroup) o;

    return Objects.equals(this.and, queryCriteriaGroup.and) &&
            Objects.equals(this.or, queryCriteriaGroup.or) &&
            Objects.equals(this.not, queryCriteriaGroup.not) &&
            Objects.equals(this.criteria, queryCriteriaGroup.criteria);
  }

  @Override
  public int hashCode() {
    return Objects.hash(and, or, not, criteria);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueryCriteriaGroup {\n");
    
    sb.append("    and: ").append(toIndentedString(and)).append("\n");
    sb.append("    or: ").append(toIndentedString(or)).append("\n");
    sb.append("    not: ").append(toIndentedString(not)).append("\n");
    sb.append("    criteria: ").append(toIndentedString(criteria)).append("\n");
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

