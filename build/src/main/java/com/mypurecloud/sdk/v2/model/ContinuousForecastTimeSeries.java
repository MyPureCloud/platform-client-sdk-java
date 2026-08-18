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
import com.mypurecloud.sdk.v2.model.ContinuousForecastWeeks;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * ContinuousForecastTimeSeries
 */

public class ContinuousForecastTimeSeries  implements Serializable {
  
  private String planningGroup = null;
  private List<ContinuousForecastWeeks> weeks = null;

  public ContinuousForecastTimeSeries() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      weeks = new ArrayList<ContinuousForecastWeeks>();
    }
  }

  public ContinuousForecastTimeSeries(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
      weeks = new ArrayList<ContinuousForecastWeeks>();
    }
  }

  
  /**
   * The planning group ID
   **/
  public ContinuousForecastTimeSeries planningGroup(String planningGroup) {
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
  public ContinuousForecastTimeSeries weeks(List<ContinuousForecastWeeks> weeks) {
    this.weeks = weeks;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "List of data for each week")
  @JsonProperty("weeks")
  public List<ContinuousForecastWeeks> getWeeks() {
    return weeks;
  }
  public void setWeeks(List<ContinuousForecastWeeks> weeks) {
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
    ContinuousForecastTimeSeries continuousForecastTimeSeries = (ContinuousForecastTimeSeries) o;

    return Objects.equals(this.planningGroup, continuousForecastTimeSeries.planningGroup) &&
            Objects.equals(this.weeks, continuousForecastTimeSeries.weeks);
  }

  @Override
  public int hashCode() {
    return Objects.hash(planningGroup, weeks);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContinuousForecastTimeSeries {\n");
    
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

