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
import com.mypurecloud.sdk.v2.model.AddressableEntityRef;
import com.mypurecloud.sdk.v2.model.Division;
import com.mypurecloud.sdk.v2.model.UserReference;
import com.mypurecloud.sdk.v2.model.WorkdayValuesMetricItem;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * SingleWorkdayAverageValues
 */

public class SingleWorkdayAverageValues  implements Serializable {
  
  private LocalDate dateWorkday = null;
  private Division division = null;
  private UserReference user = null;
  private String timezone = null;
  private List<WorkdayValuesMetricItem> results = new ArrayList<WorkdayValuesMetricItem>();
  private AddressableEntityRef performanceProfile = null;

  
  @ApiModelProperty(example = "null", value = "The targeted workday for average value query. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd")
  @JsonProperty("dateWorkday")
  public LocalDate getDateWorkday() {
    return dateWorkday;
  }

  
  @ApiModelProperty(example = "null", value = "The targeted division for the metrics")
  @JsonProperty("division")
  public Division getDivision() {
    return division;
  }

  
  @ApiModelProperty(example = "null", value = "The targeted user for the metrics")
  @JsonProperty("user")
  public UserReference getUser() {
    return user;
  }

  
  @ApiModelProperty(example = "null", value = "The time zone used for aggregating metric values")
  @JsonProperty("timezone")
  public String getTimezone() {
    return timezone;
  }

  
  @ApiModelProperty(example = "null", value = "The metric value averages")
  @JsonProperty("results")
  public List<WorkdayValuesMetricItem> getResults() {
    return results;
  }

  
  @ApiModelProperty(example = "null", value = "The targeted performance profile for the average points")
  @JsonProperty("performanceProfile")
  public AddressableEntityRef getPerformanceProfile() {
    return performanceProfile;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SingleWorkdayAverageValues singleWorkdayAverageValues = (SingleWorkdayAverageValues) o;
    return Objects.equals(this.dateWorkday, singleWorkdayAverageValues.dateWorkday) &&
        Objects.equals(this.division, singleWorkdayAverageValues.division) &&
        Objects.equals(this.user, singleWorkdayAverageValues.user) &&
        Objects.equals(this.timezone, singleWorkdayAverageValues.timezone) &&
        Objects.equals(this.results, singleWorkdayAverageValues.results) &&
        Objects.equals(this.performanceProfile, singleWorkdayAverageValues.performanceProfile);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dateWorkday, division, user, timezone, results, performanceProfile);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SingleWorkdayAverageValues {\n");
    
    sb.append("    dateWorkday: ").append(toIndentedString(dateWorkday)).append("\n");
    sb.append("    division: ").append(toIndentedString(division)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    timezone: ").append(toIndentedString(timezone)).append("\n");
    sb.append("    results: ").append(toIndentedString(results)).append("\n");
    sb.append("    performanceProfile: ").append(toIndentedString(performanceProfile)).append("\n");
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

