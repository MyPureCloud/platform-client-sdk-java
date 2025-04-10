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
import com.mypurecloud.sdk.v2.model.CriteriaItem;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * A group of logical or a singular criteria used to create a query of executionData
 */
@ApiModel(description = "A group of logical or a singular criteria used to create a query of executionData")

public class CriteriaGroup  implements Serializable {
  
  private List<CriteriaItem> and = null;
  private List<CriteriaItem> or = null;
  private List<CriteriaItem> not = null;
  private CriteriaItem criteria = null;

  public CriteriaGroup() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      and = new ArrayList<CriteriaItem>();
      or = new ArrayList<CriteriaItem>();
      not = new ArrayList<CriteriaItem>();
    }
  }

  
  /**
   * These criteriaItems will be AND'd together to find a match.
   **/
  public CriteriaGroup and(List<CriteriaItem> and) {
    this.and = and;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "These criteriaItems will be AND'd together to find a match.")
  @JsonProperty("and")
  public List<CriteriaItem> getAnd() {
    return and;
  }
  public void setAnd(List<CriteriaItem> and) {
    this.and = and;
  }


  /**
   * These criteriaItems will be OR'd together to find a match.
   **/
  public CriteriaGroup or(List<CriteriaItem> or) {
    this.or = or;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "These criteriaItems will be OR'd together to find a match.")
  @JsonProperty("or")
  public List<CriteriaItem> getOr() {
    return or;
  }
  public void setOr(List<CriteriaItem> or) {
    this.or = or;
  }


  /**
   * These criteriaItems must all be false to find a match.
   **/
  public CriteriaGroup not(List<CriteriaItem> not) {
    this.not = not;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "These criteriaItems must all be false to find a match.")
  @JsonProperty("not")
  public List<CriteriaItem> getNot() {
    return not;
  }
  public void setNot(List<CriteriaItem> not) {
    this.not = not;
  }


  /**
   * A singular critieriaItem to match.
   **/
  public CriteriaGroup criteria(CriteriaItem criteria) {
    this.criteria = criteria;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A singular critieriaItem to match.")
  @JsonProperty("criteria")
  public CriteriaItem getCriteria() {
    return criteria;
  }
  public void setCriteria(CriteriaItem criteria) {
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
    CriteriaGroup criteriaGroup = (CriteriaGroup) o;

    return Objects.equals(this.and, criteriaGroup.and) &&
            Objects.equals(this.or, criteriaGroup.or) &&
            Objects.equals(this.not, criteriaGroup.not) &&
            Objects.equals(this.criteria, criteriaGroup.criteria);
  }

  @Override
  public int hashCode() {
    return Objects.hash(and, or, not, criteria);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CriteriaGroup {\n");
    
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

