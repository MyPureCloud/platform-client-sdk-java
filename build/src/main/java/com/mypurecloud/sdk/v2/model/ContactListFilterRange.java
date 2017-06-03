package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * ContactListFilterRange
 */

public class ContactListFilterRange  implements Serializable {
  
  private String min = null;
  private String max = null;
  private Boolean minInclusive = null;
  private Boolean maxInclusive = null;
  private List<String> inSet = new ArrayList<String>();

  
  /**
   **/
  public ContactListFilterRange min(String min) {
    this.min = min;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("min")
  public String getMin() {
    return min;
  }
  public void setMin(String min) {
    this.min = min;
  }


  /**
   **/
  public ContactListFilterRange max(String max) {
    this.max = max;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("max")
  public String getMax() {
    return max;
  }
  public void setMax(String max) {
    this.max = max;
  }


  /**
   **/
  public ContactListFilterRange minInclusive(Boolean minInclusive) {
    this.minInclusive = minInclusive;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("minInclusive")
  public Boolean getMinInclusive() {
    return minInclusive;
  }
  public void setMinInclusive(Boolean minInclusive) {
    this.minInclusive = minInclusive;
  }


  /**
   **/
  public ContactListFilterRange maxInclusive(Boolean maxInclusive) {
    this.maxInclusive = maxInclusive;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("maxInclusive")
  public Boolean getMaxInclusive() {
    return maxInclusive;
  }
  public void setMaxInclusive(Boolean maxInclusive) {
    this.maxInclusive = maxInclusive;
  }


  /**
   **/
  public ContactListFilterRange inSet(List<String> inSet) {
    this.inSet = inSet;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("inSet")
  public List<String> getInSet() {
    return inSet;
  }
  public void setInSet(List<String> inSet) {
    this.inSet = inSet;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContactListFilterRange contactListFilterRange = (ContactListFilterRange) o;
    return Objects.equals(this.min, contactListFilterRange.min) &&
        Objects.equals(this.max, contactListFilterRange.max) &&
        Objects.equals(this.minInclusive, contactListFilterRange.minInclusive) &&
        Objects.equals(this.maxInclusive, contactListFilterRange.maxInclusive) &&
        Objects.equals(this.inSet, contactListFilterRange.inSet);
  }

  @Override
  public int hashCode() {
    return Objects.hash(min, max, minInclusive, maxInclusive, inSet);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContactListFilterRange {\n");
    
    sb.append("    min: ").append(toIndentedString(min)).append("\n");
    sb.append("    max: ").append(toIndentedString(max)).append("\n");
    sb.append("    minInclusive: ").append(toIndentedString(minInclusive)).append("\n");
    sb.append("    maxInclusive: ").append(toIndentedString(maxInclusive)).append("\n");
    sb.append("    inSet: ").append(toIndentedString(inSet)).append("\n");
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

