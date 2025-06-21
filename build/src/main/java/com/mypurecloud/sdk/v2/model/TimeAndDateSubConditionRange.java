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
import java.util.List;

import java.io.Serializable;
/**
 * TimeAndDateSubConditionRange
 */

public class TimeAndDateSubConditionRange  implements Serializable {
  
  private String min = null;
  private String max = null;
  private List<String> inSet = null;

  public TimeAndDateSubConditionRange() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      inSet = new ArrayList<String>();
    }
  }

  
  /**
   * The minimum value of the range. Required for the operator BETWEEN. Format depends on type: timeOfDay: HH:mm, dayOfWeek: 1-7 (Monday-Sunday), dayOfMonth: 1-31, specificDate: yyyy-MM-dd (if includeYear=true) or MM-dd (if includeYear=false).
   **/
  public TimeAndDateSubConditionRange min(String min) {
    this.min = min;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The minimum value of the range. Required for the operator BETWEEN. Format depends on type: timeOfDay: HH:mm, dayOfWeek: 1-7 (Monday-Sunday), dayOfMonth: 1-31, specificDate: yyyy-MM-dd (if includeYear=true) or MM-dd (if includeYear=false).")
  @JsonProperty("min")
  public String getMin() {
    return min;
  }
  public void setMin(String min) {
    this.min = min;
  }


  /**
   * The maximum value of the range. Required for the operator BETWEEN. Format follows the same rules as 'min'.
   **/
  public TimeAndDateSubConditionRange max(String max) {
    this.max = max;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The maximum value of the range. Required for the operator BETWEEN. Format follows the same rules as 'min'.")
  @JsonProperty("max")
  public String getMax() {
    return max;
  }
  public void setMax(String max) {
    this.max = max;
  }


  /**
   * A set of values that the date/ time data should be in. Required for the IN operator. Format depends on type: dayOfWeek: 1-7 (Monday-Sunday), dayOfMonth: 1-31, and/ or LAST_DAY, ODD_DAY, EVEN_DAY,specificDate: yyyy-MM-dd (if includeYear=true) or MM-dd (if includeYear=false).
   **/
  public TimeAndDateSubConditionRange inSet(List<String> inSet) {
    this.inSet = inSet;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A set of values that the date/ time data should be in. Required for the IN operator. Format depends on type: dayOfWeek: 1-7 (Monday-Sunday), dayOfMonth: 1-31, and/ or LAST_DAY, ODD_DAY, EVEN_DAY,specificDate: yyyy-MM-dd (if includeYear=true) or MM-dd (if includeYear=false).")
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
    TimeAndDateSubConditionRange timeAndDateSubConditionRange = (TimeAndDateSubConditionRange) o;

    return Objects.equals(this.min, timeAndDateSubConditionRange.min) &&
            Objects.equals(this.max, timeAndDateSubConditionRange.max) &&
            Objects.equals(this.inSet, timeAndDateSubConditionRange.inSet);
  }

  @Override
  public int hashCode() {
    return Objects.hash(min, max, inSet);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TimeAndDateSubConditionRange {\n");
    
    sb.append("    min: ").append(toIndentedString(min)).append("\n");
    sb.append("    max: ").append(toIndentedString(max)).append("\n");
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

