package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.mypurecloud.sdk.v2.model.UserObservationQueryFilter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * UserObservationQuery
 */

public class UserObservationQuery  implements Serializable {
  
  private UserObservationQueryFilter filter = null;

  /**
   * Gets or Sets metrics
   */
  public enum MetricsEnum {
    OACTIVEQUEUES("oActiveQueues"),
    OMEMBERQUEUES("oMemberQueues");

    private String value;

    MetricsEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static MetricsEnum fromString(String key) {
      if (key == null) return null;

      for (MetricsEnum value : MetricsEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return MetricsEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private List<MetricsEnum> metrics = new ArrayList<MetricsEnum>();

  /**
   * Gets or Sets detailMetrics
   */
  public enum DetailMetricsEnum {
    OACTIVEQUEUES("oActiveQueues"),
    OMEMBERQUEUES("oMemberQueues");

    private String value;

    DetailMetricsEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static DetailMetricsEnum fromString(String key) {
      if (key == null) return null;

      for (DetailMetricsEnum value : DetailMetricsEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return DetailMetricsEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private List<DetailMetricsEnum> detailMetrics = new ArrayList<DetailMetricsEnum>();

  
  /**
   * Filter to return a subset of observations. Expresses boolean logical predicates as well as dimensional filters
   **/
  public UserObservationQuery filter(UserObservationQueryFilter filter) {
    this.filter = filter;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Filter to return a subset of observations. Expresses boolean logical predicates as well as dimensional filters")
  @JsonProperty("filter")
  public UserObservationQueryFilter getFilter() {
    return filter;
  }
  public void setFilter(UserObservationQueryFilter filter) {
    this.filter = filter;
  }

  
  /**
   * Behaves like a SQL SELECT clause. Only named metrics will be retrieved.
   **/
  public UserObservationQuery metrics(List<MetricsEnum> metrics) {
    this.metrics = metrics;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Behaves like a SQL SELECT clause. Only named metrics will be retrieved.")
  @JsonProperty("metrics")
  public List<MetricsEnum> getMetrics() {
    return metrics;
  }
  public void setMetrics(List<MetricsEnum> metrics) {
    this.metrics = metrics;
  }

  
  /**
   * Metrics for which to include additional detailed observations
   **/
  public UserObservationQuery detailMetrics(List<DetailMetricsEnum> detailMetrics) {
    this.detailMetrics = detailMetrics;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Metrics for which to include additional detailed observations")
  @JsonProperty("detailMetrics")
  public List<DetailMetricsEnum> getDetailMetrics() {
    return detailMetrics;
  }
  public void setDetailMetrics(List<DetailMetricsEnum> detailMetrics) {
    this.detailMetrics = detailMetrics;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserObservationQuery userObservationQuery = (UserObservationQuery) o;
    return Objects.equals(this.filter, userObservationQuery.filter) &&
        Objects.equals(this.metrics, userObservationQuery.metrics) &&
        Objects.equals(this.detailMetrics, userObservationQuery.detailMetrics);
  }

  @Override
  public int hashCode() {
    return Objects.hash(filter, metrics, detailMetrics);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserObservationQuery {\n");
    
    sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
    sb.append("    metrics: ").append(toIndentedString(metrics)).append("\n");
    sb.append("    detailMetrics: ").append(toIndentedString(detailMetrics)).append("\n");
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

