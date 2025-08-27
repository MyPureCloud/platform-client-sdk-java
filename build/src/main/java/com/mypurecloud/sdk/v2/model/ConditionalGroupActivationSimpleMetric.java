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
import com.mypurecloud.sdk.v2.model.DomainEntityRef;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * ConditionalGroupActivationSimpleMetric
 */

public class ConditionalGroupActivationSimpleMetric  implements Serializable {
  

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
   * The queue metric being evaluated
   */
 @JsonDeserialize(using = MetricEnumDeserializer.class)
  public enum MetricEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    ESTIMATEDWAITTIME("EstimatedWaitTime"),
    IDLEAGENTCOUNT("IdleAgentCount"),
    SERVICELEVEL("ServiceLevel");

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
  private DomainEntityRef queue = null;

  public ConditionalGroupActivationSimpleMetric() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * The queue metric being evaluated
   **/
  public ConditionalGroupActivationSimpleMetric metric(MetricEnum metric) {
    this.metric = metric;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The queue metric being evaluated")
  @JsonProperty("metric")
  public MetricEnum getMetric() {
    return metric;
  }
  public void setMetric(MetricEnum metric) {
    this.metric = metric;
  }


  /**
   * The queue being evaluated for this rule.  If null, the current queue will be used.
   **/
  public ConditionalGroupActivationSimpleMetric queue(DomainEntityRef queue) {
    this.queue = queue;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The queue being evaluated for this rule.  If null, the current queue will be used.")
  @JsonProperty("queue")
  public DomainEntityRef getQueue() {
    return queue;
  }
  public void setQueue(DomainEntityRef queue) {
    this.queue = queue;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConditionalGroupActivationSimpleMetric conditionalGroupActivationSimpleMetric = (ConditionalGroupActivationSimpleMetric) o;

    return Objects.equals(this.metric, conditionalGroupActivationSimpleMetric.metric) &&
            Objects.equals(this.queue, conditionalGroupActivationSimpleMetric.queue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(metric, queue);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConditionalGroupActivationSimpleMetric {\n");
    
    sb.append("    metric: ").append(toIndentedString(metric)).append("\n");
    sb.append("    queue: ").append(toIndentedString(queue)).append("\n");
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

