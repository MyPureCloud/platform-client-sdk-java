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
import com.mypurecloud.sdk.v2.model.TaskManagementObservationMetricStats;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * TaskManagementObservationDataContainer
 */

public class TaskManagementObservationDataContainer  implements Serializable {
  

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
   * The metric for this data point
   */
 @JsonDeserialize(using = MetricEnumDeserializer.class)
  public enum MetricEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    OWORKITEMSUNASSIGNED("oWorkitemsUnassigned"),
    OWORKITEMSASSIGNED("oWorkitemsAssigned"),
    OWORKITEMSCONNECTED("oWorkitemsConnected"),
    OWORKITEMSPARKED("oWorkitemsParked"),
    OWORKITEMSHELD("oWorkitemsHeld"),
    OWORKITEMSACDSTARTED("oWorkitemsAcdStarted"),
    OWORKITEMSDECLINED("oWorkitemsDeclined"),
    OWORKITEMSIDLE("oWorkitemsIdle"),
    OWORKITEMSDISCONNECTED("oWorkitemsDisconnected"),
    OWORKITEMSACDEXPIRED("oWorkitemsAcdExpired"),
    OWORKITEMSDUE("oWorkitemsDue"),
    OWORKITEMSOVERDUE("oWorkitemsOverDue"),
    OWORKITEMOLDESTUNASSIGNED("oWorkitemOldestUnassigned"),
    OWORKITEMOLDESTASSIGNED("oWorkitemOldestAssigned");

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
  private TaskManagementObservationMetricStats stats = null;

  private static class QualifierEnumDeserializer extends StdDeserializer<QualifierEnum> {
    public QualifierEnumDeserializer() {
      super(QualifierEnumDeserializer.class);
    }

    @Override
    public QualifierEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return QualifierEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Qualifier for duration based metrics.
   */
 @JsonDeserialize(using = QualifierEnumDeserializer.class)
  public enum QualifierEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    HOURS24("Hours24"),
    HOURS72("Hours72");

    private String value;

    QualifierEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static QualifierEnum fromString(String key) {
      if (key == null) return null;

      for (QualifierEnum value : QualifierEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return QualifierEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private QualifierEnum qualifier = null;

  public TaskManagementObservationDataContainer() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * The metric for this data point
   **/
  public TaskManagementObservationDataContainer metric(MetricEnum metric) {
    this.metric = metric;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The metric for this data point")
  @JsonProperty("metric")
  public MetricEnum getMetric() {
    return metric;
  }
  public void setMetric(MetricEnum metric) {
    this.metric = metric;
  }


  /**
   * The observed statistics for this metric
   **/
  public TaskManagementObservationDataContainer stats(TaskManagementObservationMetricStats stats) {
    this.stats = stats;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The observed statistics for this metric")
  @JsonProperty("stats")
  public TaskManagementObservationMetricStats getStats() {
    return stats;
  }
  public void setStats(TaskManagementObservationMetricStats stats) {
    this.stats = stats;
  }


  /**
   * Qualifier for duration based metrics.
   **/
  public TaskManagementObservationDataContainer qualifier(QualifierEnum qualifier) {
    this.qualifier = qualifier;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Qualifier for duration based metrics.")
  @JsonProperty("qualifier")
  public QualifierEnum getQualifier() {
    return qualifier;
  }
  public void setQualifier(QualifierEnum qualifier) {
    this.qualifier = qualifier;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TaskManagementObservationDataContainer taskManagementObservationDataContainer = (TaskManagementObservationDataContainer) o;

    return Objects.equals(this.metric, taskManagementObservationDataContainer.metric) &&
            Objects.equals(this.stats, taskManagementObservationDataContainer.stats) &&
            Objects.equals(this.qualifier, taskManagementObservationDataContainer.qualifier);
  }

  @Override
  public int hashCode() {
    return Objects.hash(metric, stats, qualifier);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaskManagementObservationDataContainer {\n");
    
    sb.append("    metric: ").append(toIndentedString(metric)).append("\n");
    sb.append("    stats: ").append(toIndentedString(stats)).append("\n");
    sb.append("    qualifier: ").append(toIndentedString(qualifier)).append("\n");
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

