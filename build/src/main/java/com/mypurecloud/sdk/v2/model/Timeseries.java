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
import com.fasterxml.jackson.annotation.JsonProperty;
import com.mypurecloud.sdk.v2.model.Weeks;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * Timeseries
 */

public class Timeseries  implements Serializable {
  
  private String planningGroup = null;
  private List<Weeks> weeks = new ArrayList<Weeks>();

  
  /**
   * The planning group ID
   **/
  public Timeseries planningGroup(String planningGroup) {
    this.planningGroup = planningGroup;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The planning group ID")
  @JsonProperty("planningGroup")
  public String getPlanningGroup() {
    return planningGroup;
  }
  public void setPlanningGroup(String planningGroup) {
    this.planningGroup = planningGroup;
  }


  /**
   * List of data for each week
   **/
  public Timeseries weeks(List<Weeks> weeks) {
    this.weeks = weeks;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "List of data for each week")
  @JsonProperty("weeks")
  public List<Weeks> getWeeks() {
    return weeks;
  }
  public void setWeeks(List<Weeks> weeks) {
    this.weeks = weeks;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Timeseries timeseries = (Timeseries) o;

    return Objects.equals(this.planningGroup, timeseries.planningGroup) &&
            Objects.equals(this.weeks, timeseries.weeks);
  }

  @Override
  public int hashCode() {
    return Objects.hash(planningGroup, weeks);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Timeseries {\n");
    
    sb.append("    planningGroup: ").append(toIndentedString(planningGroup)).append("\n");
    sb.append("    weeks: ").append(toIndentedString(weeks)).append("\n");
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

