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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * V2QueueObservationMetricCountData
 */

public class V2QueueObservationMetricCountData  implements Serializable {
  

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
  private Long count = null;
  private Long calculatedMetricValue = null;

  public V2QueueObservationMetricCountData() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * The observation metric
   **/
  public V2QueueObservationMetricCountData metric(MetricEnum metric) {
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
   * The total number of ongoing observations for this metric and media type
   **/
  public V2QueueObservationMetricCountData count(Long count) {
    this.count = count;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The total number of ongoing observations for this metric and media type")
  @JsonProperty("count")
  public Long getCount() {
    return count;
  }
  public void setCount(Long count) {
    this.count = count;
  }


  /**
   * Calculated metric value
   **/
  public V2QueueObservationMetricCountData calculatedMetricValue(Long calculatedMetricValue) {
    this.calculatedMetricValue = calculatedMetricValue;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Calculated metric value")
  @JsonProperty("calculatedMetricValue")
  public Long getCalculatedMetricValue() {
    return calculatedMetricValue;
  }
  public void setCalculatedMetricValue(Long calculatedMetricValue) {
    this.calculatedMetricValue = calculatedMetricValue;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V2QueueObservationMetricCountData v2QueueObservationMetricCountData = (V2QueueObservationMetricCountData) o;

    return Objects.equals(this.metric, v2QueueObservationMetricCountData.metric) &&
            Objects.equals(this.count, v2QueueObservationMetricCountData.count) &&
            Objects.equals(this.calculatedMetricValue, v2QueueObservationMetricCountData.calculatedMetricValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(metric, count, calculatedMetricValue);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V2QueueObservationMetricCountData {\n");
    
    sb.append("    metric: ").append(toIndentedString(metric)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    calculatedMetricValue: ").append(toIndentedString(calculatedMetricValue)).append("\n");
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

