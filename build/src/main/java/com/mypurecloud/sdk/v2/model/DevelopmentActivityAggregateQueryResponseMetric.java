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
import com.fasterxml.jackson.annotation.JsonValue;
import com.mypurecloud.sdk.v2.model.DevelopmentActivityAggregateQueryResponseStatistics;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * DevelopmentActivityAggregateQueryResponseMetric
 */

public class DevelopmentActivityAggregateQueryResponseMetric  implements Serializable {
  

  private static class MetricEnumDeserializer extends StdDeserializer<MetricEnum> {
    public MetricEnumDeserializer() {
      super(MetricEnumDeserializer.class);
    }

    @Override
    public MetricEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return MetricEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The metric this applies to
   */
 @JsonDeserialize(using = MetricEnumDeserializer.class)
  public enum MetricEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    NACTIVITIES("nActivities"),
    NPLANNEDACTIVITIES("nPlannedActivities"),
    NINPROGRESSACTIVITIES("nInProgressActivities"),
    NCOMPLETEACTIVITIES("nCompleteActivities"),
    NOVERDUEACTIVITIES("nOverdueActivities"),
    NINVALIDSCHEDULEACTIVITIES("nInvalidScheduleActivities"),
    NPASSEDACTIVITIES("nPassedActivities"),
    NFAILEDACTIVITIES("nFailedActivities"),
    OACTIVITYSCORE("oActivityScore");

    private String value;

    MetricEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static MetricEnum fromString(String key) {
      if (key == null) return null;

      for (MetricEnum value : MetricEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return MetricEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private MetricEnum metric = null;
  private DevelopmentActivityAggregateQueryResponseStatistics stats = null;

  
  /**
   * The metric this applies to
   **/
  public DevelopmentActivityAggregateQueryResponseMetric metric(MetricEnum metric) {
    this.metric = metric;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The metric this applies to")
  @JsonProperty("metric")
  public MetricEnum getMetric() {
    return metric;
  }
  public void setMetric(MetricEnum metric) {
    this.metric = metric;
  }

  
  /**
   * The aggregated values for this metric
   **/
  public DevelopmentActivityAggregateQueryResponseMetric stats(DevelopmentActivityAggregateQueryResponseStatistics stats) {
    this.stats = stats;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The aggregated values for this metric")
  @JsonProperty("stats")
  public DevelopmentActivityAggregateQueryResponseStatistics getStats() {
    return stats;
  }
  public void setStats(DevelopmentActivityAggregateQueryResponseStatistics stats) {
    this.stats = stats;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DevelopmentActivityAggregateQueryResponseMetric developmentActivityAggregateQueryResponseMetric = (DevelopmentActivityAggregateQueryResponseMetric) o;
    return Objects.equals(this.metric, developmentActivityAggregateQueryResponseMetric.metric) &&
        Objects.equals(this.stats, developmentActivityAggregateQueryResponseMetric.stats);
  }

  @Override
  public int hashCode() {
    return Objects.hash(metric, stats);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DevelopmentActivityAggregateQueryResponseMetric {\n");
    
    sb.append("    metric: ").append(toIndentedString(metric)).append("\n");
    sb.append("    stats: ").append(toIndentedString(stats)).append("\n");
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

