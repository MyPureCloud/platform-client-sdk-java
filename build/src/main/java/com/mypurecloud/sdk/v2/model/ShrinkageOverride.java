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

import java.io.Serializable;
/**
 * ShrinkageOverride
 */

public class ShrinkageOverride  implements Serializable {
  
  private Integer intervalIndex = null;
  private Double shrinkagePercent = null;

  
  /**
   * Index of shrinkage override interval. Starting index is 0 and indexes are based on 15 minute intervals for a 7 day week
   **/
  public ShrinkageOverride intervalIndex(Integer intervalIndex) {
    this.intervalIndex = intervalIndex;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Index of shrinkage override interval. Starting index is 0 and indexes are based on 15 minute intervals for a 7 day week")
  @JsonProperty("intervalIndex")
  public Integer getIntervalIndex() {
    return intervalIndex;
  }
  public void setIntervalIndex(Integer intervalIndex) {
    this.intervalIndex = intervalIndex;
  }

  
  /**
   * Shrinkage override percent. Setting a null value will reset the interval to the default
   **/
  public ShrinkageOverride shrinkagePercent(Double shrinkagePercent) {
    this.shrinkagePercent = shrinkagePercent;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Shrinkage override percent. Setting a null value will reset the interval to the default")
  @JsonProperty("shrinkagePercent")
  public Double getShrinkagePercent() {
    return shrinkagePercent;
  }
  public void setShrinkagePercent(Double shrinkagePercent) {
    this.shrinkagePercent = shrinkagePercent;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ShrinkageOverride shrinkageOverride = (ShrinkageOverride) o;
    return Objects.equals(this.intervalIndex, shrinkageOverride.intervalIndex) &&
        Objects.equals(this.shrinkagePercent, shrinkageOverride.shrinkagePercent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(intervalIndex, shrinkagePercent);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ShrinkageOverride {\n");
    
    sb.append("    intervalIndex: ").append(toIndentedString(intervalIndex)).append("\n");
    sb.append("    shrinkagePercent: ").append(toIndentedString(shrinkagePercent)).append("\n");
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

