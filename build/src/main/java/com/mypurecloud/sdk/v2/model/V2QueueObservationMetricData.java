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
import com.fasterxml.jackson.annotation.JsonValue;
import com.mypurecloud.sdk.v2.model.V2QueueObservationMetricStats;
import com.mypurecloud.sdk.v2.model.V2QueueObservationObservation;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * Observation data for one metric
 */
@ApiModel(description = "Observation data for one metric")

public class V2QueueObservationMetricData  implements Serializable {
  

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
   * The observation metric
   */
 @JsonDeserialize(using = MetricEnumDeserializer.class)
  public enum MetricEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    OALERTING("oAlerting"),
    OINTERACTING("oInteracting"),
    OWAITING("oWaiting"),
    OFLOW("oFlow"),
    OLONGESTWAITING("oLongestWaiting"),
    OLONGESTINTERACTING("oLongestInteracting");

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
  private List<V2QueueObservationObservation> observations = null;
  private Boolean truncated = null;
  private V2QueueObservationMetricStats stats = null;

  public V2QueueObservationMetricData() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      observations = new ArrayList<V2QueueObservationObservation>();
    }
  }

  
  /**
   * The observation metric
   **/
  public V2QueueObservationMetricData metric(MetricEnum metric) {
    this.metric = metric;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The observation metric")
  @JsonProperty("metric")
  public MetricEnum getMetric() {
    return metric;
  }
  public void setMetric(MetricEnum metric) {
    this.metric = metric;
  }


  /**
   * List of observations sorted by timestamp in ascending order. This list may be truncated.
   **/
  public V2QueueObservationMetricData observations(List<V2QueueObservationObservation> observations) {
    this.observations = observations;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "List of observations sorted by timestamp in ascending order. This list may be truncated.")
  @JsonProperty("observations")
  public List<V2QueueObservationObservation> getObservations() {
    return observations;
  }
  public void setObservations(List<V2QueueObservationObservation> observations) {
    this.observations = observations;
  }


  /**
   * Flag indicating whether the list of observations was truncated or not
   **/
  public V2QueueObservationMetricData truncated(Boolean truncated) {
    this.truncated = truncated;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Flag indicating whether the list of observations was truncated or not")
  @JsonProperty("truncated")
  public Boolean getTruncated() {
    return truncated;
  }
  public void setTruncated(Boolean truncated) {
    this.truncated = truncated;
  }


  /**
   **/
  public V2QueueObservationMetricData stats(V2QueueObservationMetricStats stats) {
    this.stats = stats;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("stats")
  public V2QueueObservationMetricStats getStats() {
    return stats;
  }
  public void setStats(V2QueueObservationMetricStats stats) {
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
    V2QueueObservationMetricData v2QueueObservationMetricData = (V2QueueObservationMetricData) o;

    return Objects.equals(this.metric, v2QueueObservationMetricData.metric) &&
            Objects.equals(this.observations, v2QueueObservationMetricData.observations) &&
            Objects.equals(this.truncated, v2QueueObservationMetricData.truncated) &&
            Objects.equals(this.stats, v2QueueObservationMetricData.stats);
  }

  @Override
  public int hashCode() {
    return Objects.hash(metric, observations, truncated, stats);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V2QueueObservationMetricData {\n");
    
    sb.append("    metric: ").append(toIndentedString(metric)).append("\n");
    sb.append("    observations: ").append(toIndentedString(observations)).append("\n");
    sb.append("    truncated: ").append(toIndentedString(truncated)).append("\n");
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

