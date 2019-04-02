package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.mypurecloud.sdk.v2.model.Criteria;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * JourneyPattern
 */

public class JourneyPattern  implements Serializable {
  
  private List<Criteria> criteria = new ArrayList<Criteria>();
  private Integer count = null;

  
  /**
   * A list of one or more criteria to satisfy.
   **/
  public JourneyPattern criteria(List<Criteria> criteria) {
    this.criteria = criteria;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "A list of one or more criteria to satisfy.")
  @JsonProperty("criteria")
  public List<Criteria> getCriteria() {
    return criteria;
  }
  public void setCriteria(List<Criteria> criteria) {
    this.criteria = criteria;
  }

  
  /**
   * The number of times the pattern must match.
   **/
  public JourneyPattern count(Integer count) {
    this.count = count;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The number of times the pattern must match.")
  @JsonProperty("count")
  public Integer getCount() {
    return count;
  }
  public void setCount(Integer count) {
    this.count = count;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JourneyPattern journeyPattern = (JourneyPattern) o;
    return Objects.equals(this.criteria, journeyPattern.criteria) &&
        Objects.equals(this.count, journeyPattern.count);
  }

  @Override
  public int hashCode() {
    return Objects.hash(criteria, count);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JourneyPattern {\n");
    
    sb.append("    criteria: ").append(toIndentedString(criteria)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
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

