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
import com.mypurecloud.sdk.v2.model.V2MobiusAlertsTopicEntityProperties;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;

import java.io.Serializable;
/**
 * V2MobiusAlertsTopicConditionRulePredicate
 */

public class V2MobiusAlertsTopicConditionRulePredicate  implements Serializable {
  
  private V2MobiusAlertsTopicEntityProperties entity = null;
  private String metric = null;

  private static class MetricTypeEnumDeserializer extends StdDeserializer<MetricTypeEnum> {
    public MetricTypeEnumDeserializer() {
      super(MetricTypeEnumDeserializer.class);
    }

    @Override
    public MetricTypeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return MetricTypeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Gets or Sets metricType
   */
 @JsonDeserialize(using = MetricTypeEnumDeserializer.class)
  public enum MetricTypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    INTERVAL("Interval"),
    INSTANCE("Instance"),
    UNKNOWN("Unknown");

    private String value;

    MetricTypeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static MetricTypeEnum fromString(String key) {
      if (key == null) return null;

      for (MetricTypeEnum value : MetricTypeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return MetricTypeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private MetricTypeEnum metricType = null;

  private static class MetricValueTypeEnumDeserializer extends StdDeserializer<MetricValueTypeEnum> {
    public MetricValueTypeEnumDeserializer() {
      super(MetricValueTypeEnumDeserializer.class);
    }

    @Override
    public MetricValueTypeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return MetricValueTypeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Gets or Sets metricValueType
   */
 @JsonDeserialize(using = MetricValueTypeEnumDeserializer.class)
  public enum MetricValueTypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    COUNT("Count"),
    PERCENTAGE("Percentage"),
    AVERAGE("Average"),
    TIMER("Timer"),
    OBSERVATION("Observation"),
    MIN("Min"),
    MAX("Max"),
    UNKNOWN("Unknown");

    private String value;

    MetricValueTypeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static MetricValueTypeEnum fromString(String key) {
      if (key == null) return null;

      for (MetricValueTypeEnum value : MetricValueTypeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return MetricValueTypeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private MetricValueTypeEnum metricValueType = null;
  private BigDecimal value = null;

  private static class ComparisonOperatorEnumDeserializer extends StdDeserializer<ComparisonOperatorEnum> {
    public ComparisonOperatorEnumDeserializer() {
      super(ComparisonOperatorEnumDeserializer.class);
    }

    @Override
    public ComparisonOperatorEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return ComparisonOperatorEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Gets or Sets comparisonOperator
   */
 @JsonDeserialize(using = ComparisonOperatorEnumDeserializer.class)
  public enum ComparisonOperatorEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    GT("Gt"),
    GTE("Gte"),
    LT("Lt"),
    LTE("Lte"),
    EQ("Eq"),
    NE("Ne"),
    UNKNOWN("Unknown");

    private String value;

    ComparisonOperatorEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static ComparisonOperatorEnum fromString(String key) {
      if (key == null) return null;

      for (ComparisonOperatorEnum value : ComparisonOperatorEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return ComparisonOperatorEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private ComparisonOperatorEnum comparisonOperator = null;

  
  /**
   **/
  public V2MobiusAlertsTopicConditionRulePredicate entity(V2MobiusAlertsTopicEntityProperties entity) {
    this.entity = entity;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("entity")
  public V2MobiusAlertsTopicEntityProperties getEntity() {
    return entity;
  }
  public void setEntity(V2MobiusAlertsTopicEntityProperties entity) {
    this.entity = entity;
  }


  /**
   **/
  public V2MobiusAlertsTopicConditionRulePredicate metric(String metric) {
    this.metric = metric;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("metric")
  public String getMetric() {
    return metric;
  }
  public void setMetric(String metric) {
    this.metric = metric;
  }


  /**
   **/
  public V2MobiusAlertsTopicConditionRulePredicate metricType(MetricTypeEnum metricType) {
    this.metricType = metricType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("metricType")
  public MetricTypeEnum getMetricType() {
    return metricType;
  }
  public void setMetricType(MetricTypeEnum metricType) {
    this.metricType = metricType;
  }


  /**
   **/
  public V2MobiusAlertsTopicConditionRulePredicate metricValueType(MetricValueTypeEnum metricValueType) {
    this.metricValueType = metricValueType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("metricValueType")
  public MetricValueTypeEnum getMetricValueType() {
    return metricValueType;
  }
  public void setMetricValueType(MetricValueTypeEnum metricValueType) {
    this.metricValueType = metricValueType;
  }


  /**
   **/
  public V2MobiusAlertsTopicConditionRulePredicate value(BigDecimal value) {
    this.value = value;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("value")
  public BigDecimal getValue() {
    return value;
  }
  public void setValue(BigDecimal value) {
    this.value = value;
  }


  /**
   **/
  public V2MobiusAlertsTopicConditionRulePredicate comparisonOperator(ComparisonOperatorEnum comparisonOperator) {
    this.comparisonOperator = comparisonOperator;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("comparisonOperator")
  public ComparisonOperatorEnum getComparisonOperator() {
    return comparisonOperator;
  }
  public void setComparisonOperator(ComparisonOperatorEnum comparisonOperator) {
    this.comparisonOperator = comparisonOperator;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V2MobiusAlertsTopicConditionRulePredicate v2MobiusAlertsTopicConditionRulePredicate = (V2MobiusAlertsTopicConditionRulePredicate) o;

    return Objects.equals(this.entity, v2MobiusAlertsTopicConditionRulePredicate.entity) &&
            Objects.equals(this.metric, v2MobiusAlertsTopicConditionRulePredicate.metric) &&
            Objects.equals(this.metricType, v2MobiusAlertsTopicConditionRulePredicate.metricType) &&
            Objects.equals(this.metricValueType, v2MobiusAlertsTopicConditionRulePredicate.metricValueType) &&
            Objects.equals(this.value, v2MobiusAlertsTopicConditionRulePredicate.value) &&
            Objects.equals(this.comparisonOperator, v2MobiusAlertsTopicConditionRulePredicate.comparisonOperator);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entity, metric, metricType, metricValueType, value, comparisonOperator);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V2MobiusAlertsTopicConditionRulePredicate {\n");
    
    sb.append("    entity: ").append(toIndentedString(entity)).append("\n");
    sb.append("    metric: ").append(toIndentedString(metric)).append("\n");
    sb.append("    metricType: ").append(toIndentedString(metricType)).append("\n");
    sb.append("    metricValueType: ").append(toIndentedString(metricValueType)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    comparisonOperator: ").append(toIndentedString(comparisonOperator)).append("\n");
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

