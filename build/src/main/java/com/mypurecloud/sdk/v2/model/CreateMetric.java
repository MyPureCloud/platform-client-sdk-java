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
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.mypurecloud.sdk.v2.model.CreateObjective;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * CreateMetric
 */

public class CreateMetric  implements Serializable {
  
  private String metricDefinitionId = null;
  private String externalMetricDefinitionId = null;
  private CreateObjective objective = null;
  private String performanceProfileId = null;
  private String name = null;
  private Integer precision = null;

  private static class TimeDisplayUnitEnumDeserializer extends StdDeserializer<TimeDisplayUnitEnum> {
    public TimeDisplayUnitEnumDeserializer() {
      super(TimeDisplayUnitEnumDeserializer.class);
    }

    @Override
    public TimeDisplayUnitEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return TimeDisplayUnitEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The time unit in which the metric should be displayed -- this parameter is ignored when displaying non-time values
   */
 @JsonDeserialize(using = TimeDisplayUnitEnumDeserializer.class)
  public enum TimeDisplayUnitEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    NONE("None"),
    SECONDS("Seconds"),
    MINUTES("Minutes"),
    HOURS("Hours");

    private String value;

    TimeDisplayUnitEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static TimeDisplayUnitEnum fromString(String key) {
      if (key == null) return null;

      for (TimeDisplayUnitEnum value : TimeDisplayUnitEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return TimeDisplayUnitEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private TimeDisplayUnitEnum timeDisplayUnit = null;

  
  /**
   * The id of associated metric definition
   **/
  public CreateMetric metricDefinitionId(String metricDefinitionId) {
    this.metricDefinitionId = metricDefinitionId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The id of associated metric definition")
  @JsonProperty("metricDefinitionId")
  public String getMetricDefinitionId() {
    return metricDefinitionId;
  }
  public void setMetricDefinitionId(String metricDefinitionId) {
    this.metricDefinitionId = metricDefinitionId;
  }


  /**
   * The id of associated external metric definition
   **/
  public CreateMetric externalMetricDefinitionId(String externalMetricDefinitionId) {
    this.externalMetricDefinitionId = externalMetricDefinitionId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The id of associated external metric definition")
  @JsonProperty("externalMetricDefinitionId")
  public String getExternalMetricDefinitionId() {
    return externalMetricDefinitionId;
  }
  public void setExternalMetricDefinitionId(String externalMetricDefinitionId) {
    this.externalMetricDefinitionId = externalMetricDefinitionId;
  }


  /**
   * Associated objective for this metric
   **/
  public CreateMetric objective(CreateObjective objective) {
    this.objective = objective;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Associated objective for this metric")
  @JsonProperty("objective")
  public CreateObjective getObjective() {
    return objective;
  }
  public void setObjective(CreateObjective objective) {
    this.objective = objective;
  }


  /**
   * Performance profile id of this metric
   **/
  public CreateMetric performanceProfileId(String performanceProfileId) {
    this.performanceProfileId = performanceProfileId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Performance profile id of this metric")
  @JsonProperty("performanceProfileId")
  public String getPerformanceProfileId() {
    return performanceProfileId;
  }
  public void setPerformanceProfileId(String performanceProfileId) {
    this.performanceProfileId = performanceProfileId;
  }


  /**
   * The name of this metric
   **/
  public CreateMetric name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The name of this metric")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }


  /**
   * The precision of the metric, must be between 0 and 5
   **/
  public CreateMetric precision(Integer precision) {
    this.precision = precision;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The precision of the metric, must be between 0 and 5")
  @JsonProperty("precision")
  public Integer getPrecision() {
    return precision;
  }
  public void setPrecision(Integer precision) {
    this.precision = precision;
  }


  /**
   * The time unit in which the metric should be displayed -- this parameter is ignored when displaying non-time values
   **/
  public CreateMetric timeDisplayUnit(TimeDisplayUnitEnum timeDisplayUnit) {
    this.timeDisplayUnit = timeDisplayUnit;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The time unit in which the metric should be displayed -- this parameter is ignored when displaying non-time values")
  @JsonProperty("timeDisplayUnit")
  public TimeDisplayUnitEnum getTimeDisplayUnit() {
    return timeDisplayUnit;
  }
  public void setTimeDisplayUnit(TimeDisplayUnitEnum timeDisplayUnit) {
    this.timeDisplayUnit = timeDisplayUnit;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateMetric createMetric = (CreateMetric) o;

    return Objects.equals(this.metricDefinitionId, createMetric.metricDefinitionId) &&
            Objects.equals(this.externalMetricDefinitionId, createMetric.externalMetricDefinitionId) &&
            Objects.equals(this.objective, createMetric.objective) &&
            Objects.equals(this.performanceProfileId, createMetric.performanceProfileId) &&
            Objects.equals(this.name, createMetric.name) &&
            Objects.equals(this.precision, createMetric.precision) &&
            Objects.equals(this.timeDisplayUnit, createMetric.timeDisplayUnit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(metricDefinitionId, externalMetricDefinitionId, objective, performanceProfileId, name, precision, timeDisplayUnit);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateMetric {\n");
    
    sb.append("    metricDefinitionId: ").append(toIndentedString(metricDefinitionId)).append("\n");
    sb.append("    externalMetricDefinitionId: ").append(toIndentedString(externalMetricDefinitionId)).append("\n");
    sb.append("    objective: ").append(toIndentedString(objective)).append("\n");
    sb.append("    performanceProfileId: ").append(toIndentedString(performanceProfileId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    precision: ").append(toIndentedString(precision)).append("\n");
    sb.append("    timeDisplayUnit: ").append(toIndentedString(timeDisplayUnit)).append("\n");
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

