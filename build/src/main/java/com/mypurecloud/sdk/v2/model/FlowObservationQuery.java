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
import com.mypurecloud.sdk.v2.model.FlowObservationQueryFilter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * FlowObservationQuery
 */

public class FlowObservationQuery  implements Serializable {
  
  private FlowObservationQueryFilter filter = null;

  private static class MetricsEnumDeserializer extends StdDeserializer<MetricsEnum> {
    public MetricsEnumDeserializer() {
      super(MetricsEnumDeserializer.class);
    }

    @Override
    public MetricsEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return MetricsEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Gets or Sets metrics
   */
 @JsonDeserialize(using = MetricsEnumDeserializer.class)
  public enum MetricsEnum {
    OFLOW("oFlow");

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

  private static class DetailMetricsEnumDeserializer extends StdDeserializer<DetailMetricsEnum> {
    public DetailMetricsEnumDeserializer() {
      super(DetailMetricsEnumDeserializer.class);
    }

    @Override
    public DetailMetricsEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return DetailMetricsEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Gets or Sets detailMetrics
   */
 @JsonDeserialize(using = DetailMetricsEnumDeserializer.class)
  public enum DetailMetricsEnum {
    OFLOW("oFlow");

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
  public FlowObservationQuery filter(FlowObservationQueryFilter filter) {
    this.filter = filter;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Filter to return a subset of observations. Expresses boolean logical predicates as well as dimensional filters")
  @JsonProperty("filter")
  public FlowObservationQueryFilter getFilter() {
    return filter;
  }
  public void setFilter(FlowObservationQueryFilter filter) {
    this.filter = filter;
  }

  
  /**
   * Behaves like a SQL SELECT clause. Only named metrics will be retrieved.
   **/
  public FlowObservationQuery metrics(List<MetricsEnum> metrics) {
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
  public FlowObservationQuery detailMetrics(List<DetailMetricsEnum> detailMetrics) {
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
    FlowObservationQuery flowObservationQuery = (FlowObservationQuery) o;
    return Objects.equals(this.filter, flowObservationQuery.filter) &&
        Objects.equals(this.metrics, flowObservationQuery.metrics) &&
        Objects.equals(this.detailMetrics, flowObservationQuery.detailMetrics);
  }

  @Override
  public int hashCode() {
    return Objects.hash(filter, metrics, detailMetrics);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FlowObservationQuery {\n");
    
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

