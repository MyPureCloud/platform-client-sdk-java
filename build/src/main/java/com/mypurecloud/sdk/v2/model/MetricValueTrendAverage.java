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
import com.mypurecloud.sdk.v2.model.AddressableEntityRef;
import com.mypurecloud.sdk.v2.model.Division;
import com.mypurecloud.sdk.v2.model.UserReference;
import com.mypurecloud.sdk.v2.model.WorkdayValuesMetricItem;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.LocalDate;

import java.io.Serializable;
/**
 * MetricValueTrendAverage
 */

public class MetricValueTrendAverage  implements Serializable {
  
  private LocalDate dateStartWorkday = null;
  private LocalDate dateEndWorkday = null;
  private LocalDate dateReferenceWorkday = null;
  private Division division = null;
  private UserReference user = null;
  private String timezone = null;
  private WorkdayValuesMetricItem result = null;
  private AddressableEntityRef performanceProfile = null;
  private AddressableEntityRef metric = null;

  public MetricValueTrendAverage() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  @ApiModelProperty(example = "null", value = "The targeted start workday. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd")
  @JsonProperty("dateStartWorkday")
  public LocalDate getDateStartWorkday() {
    return dateStartWorkday;
  }


  @ApiModelProperty(example = "null", value = "The targeted end workday. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd")
  @JsonProperty("dateEndWorkday")
  public LocalDate getDateEndWorkday() {
    return dateEndWorkday;
  }


  @ApiModelProperty(example = "null", value = "The targeted reference workday. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd")
  @JsonProperty("dateReferenceWorkday")
  public LocalDate getDateReferenceWorkday() {
    return dateReferenceWorkday;
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


  @ApiModelProperty(example = "null", value = "The metric value trend and average")
  @JsonProperty("result")
  public WorkdayValuesMetricItem getResult() {
    return result;
  }


  @ApiModelProperty(example = "null", value = "The targeted performance profile for the average points")
  @JsonProperty("performanceProfile")
  public AddressableEntityRef getPerformanceProfile() {
    return performanceProfile;
  }


  @ApiModelProperty(example = "null", value = "The targeted performance profile for the average points")
  @JsonProperty("metric")
  public AddressableEntityRef getMetric() {
    return metric;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MetricValueTrendAverage metricValueTrendAverage = (MetricValueTrendAverage) o;

    return Objects.equals(this.dateStartWorkday, metricValueTrendAverage.dateStartWorkday) &&
            Objects.equals(this.dateEndWorkday, metricValueTrendAverage.dateEndWorkday) &&
            Objects.equals(this.dateReferenceWorkday, metricValueTrendAverage.dateReferenceWorkday) &&
            Objects.equals(this.division, metricValueTrendAverage.division) &&
            Objects.equals(this.user, metricValueTrendAverage.user) &&
            Objects.equals(this.timezone, metricValueTrendAverage.timezone) &&
            Objects.equals(this.result, metricValueTrendAverage.result) &&
            Objects.equals(this.performanceProfile, metricValueTrendAverage.performanceProfile) &&
            Objects.equals(this.metric, metricValueTrendAverage.metric);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dateStartWorkday, dateEndWorkday, dateReferenceWorkday, division, user, timezone, result, performanceProfile, metric);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MetricValueTrendAverage {\n");
    
    sb.append("    dateStartWorkday: ").append(toIndentedString(dateStartWorkday)).append("\n");
    sb.append("    dateEndWorkday: ").append(toIndentedString(dateEndWorkday)).append("\n");
    sb.append("    dateReferenceWorkday: ").append(toIndentedString(dateReferenceWorkday)).append("\n");
    sb.append("    division: ").append(toIndentedString(division)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    timezone: ").append(toIndentedString(timezone)).append("\n");
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
    sb.append("    performanceProfile: ").append(toIndentedString(performanceProfile)).append("\n");
    sb.append("    metric: ").append(toIndentedString(metric)).append("\n");
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

