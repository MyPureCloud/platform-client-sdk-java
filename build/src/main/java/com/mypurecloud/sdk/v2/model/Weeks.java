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
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * Weeks
 */

public class Weeks  implements Serializable {
  
  private Integer weekOffset = null;
  private List<Double> values = null;

  public Weeks() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      values = new ArrayList<Double>();
    }
  }

  
  /**
   * The week offset from data start date
   **/
  public Weeks weekOffset(Integer weekOffset) {
    this.weekOffset = weekOffset;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The week offset from data start date")
  @JsonProperty("weekOffset")
  public Integer getWeekOffset() {
    return weekOffset;
  }
  public void setWeekOffset(Integer weekOffset) {
    this.weekOffset = weekOffset;
  }


  /**
   * data per interval (daily or quarter hour) for this week. The value could be double or null
   **/
  public Weeks values(List<Double> values) {
    this.values = values;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "data per interval (daily or quarter hour) for this week. The value could be double or null")
  @JsonProperty("values")
  public List<Double> getValues() {
    return values;
  }
  public void setValues(List<Double> values) {
    this.values = values;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Weeks weeks = (Weeks) o;

    return Objects.equals(this.weekOffset, weeks.weekOffset) &&
            Objects.equals(this.values, weeks.values);
  }

  @Override
  public int hashCode() {
    return Objects.hash(weekOffset, values);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Weeks {\n");
    
    sb.append("    weekOffset: ").append(toIndentedString(weekOffset)).append("\n");
    sb.append("    values: ").append(toIndentedString(values)).append("\n");
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

