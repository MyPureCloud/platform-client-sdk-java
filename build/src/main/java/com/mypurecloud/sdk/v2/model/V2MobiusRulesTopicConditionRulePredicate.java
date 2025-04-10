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
import com.mypurecloud.sdk.v2.model.V2MobiusRulesTopicEntityProperties;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;

import java.io.Serializable;
/**
 * V2MobiusRulesTopicConditionRulePredicate
 */

public class V2MobiusRulesTopicConditionRulePredicate  implements Serializable {
  
  private String id = null;
  private V2MobiusRulesTopicEntityProperties entity = null;
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
  private String status = null;

  private static class MediaTypeEnumDeserializer extends StdDeserializer<MediaTypeEnum> {
    public MediaTypeEnumDeserializer() {
      super(MediaTypeEnumDeserializer.class);
    }

    @Override
    public MediaTypeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return MediaTypeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Gets or Sets mediaType
   */
 @JsonDeserialize(using = MediaTypeEnumDeserializer.class)
  public enum MediaTypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    VOICE("Voice"),
    CHAT("Chat"),
    EMAIL("Email"),
    CALLBACK("Callback"),
    MESSAGE("Message"),
    SCREENSHARE("Screenshare"),
    COBROWSE("Cobrowse"),
    UNKNOWN("Unknown");

    private String value;

    MediaTypeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static MediaTypeEnum fromString(String key) {
      if (key == null) return null;

      for (MediaTypeEnum value : MediaTypeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return MediaTypeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private MediaTypeEnum mediaType = null;
  private String topic = null;

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

  public V2MobiusRulesTopicConditionRulePredicate() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   **/
  public V2MobiusRulesTopicConditionRulePredicate id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }


  /**
   **/
  public V2MobiusRulesTopicConditionRulePredicate entity(V2MobiusRulesTopicEntityProperties entity) {
    this.entity = entity;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("entity")
  public V2MobiusRulesTopicEntityProperties getEntity() {
    return entity;
  }
  public void setEntity(V2MobiusRulesTopicEntityProperties entity) {
    this.entity = entity;
  }


  /**
   **/
  public V2MobiusRulesTopicConditionRulePredicate metric(String metric) {
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
  public V2MobiusRulesTopicConditionRulePredicate metricType(MetricTypeEnum metricType) {
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
  public V2MobiusRulesTopicConditionRulePredicate metricValueType(MetricValueTypeEnum metricValueType) {
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
  public V2MobiusRulesTopicConditionRulePredicate value(BigDecimal value) {
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
  public V2MobiusRulesTopicConditionRulePredicate status(String status) {
    this.status = status;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("status")
  public String getStatus() {
    return status;
  }
  public void setStatus(String status) {
    this.status = status;
  }


  /**
   **/
  public V2MobiusRulesTopicConditionRulePredicate mediaType(MediaTypeEnum mediaType) {
    this.mediaType = mediaType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("mediaType")
  public MediaTypeEnum getMediaType() {
    return mediaType;
  }
  public void setMediaType(MediaTypeEnum mediaType) {
    this.mediaType = mediaType;
  }


  /**
   **/
  public V2MobiusRulesTopicConditionRulePredicate topic(String topic) {
    this.topic = topic;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("topic")
  public String getTopic() {
    return topic;
  }
  public void setTopic(String topic) {
    this.topic = topic;
  }


  /**
   **/
  public V2MobiusRulesTopicConditionRulePredicate comparisonOperator(ComparisonOperatorEnum comparisonOperator) {
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
    V2MobiusRulesTopicConditionRulePredicate v2MobiusRulesTopicConditionRulePredicate = (V2MobiusRulesTopicConditionRulePredicate) o;

    return Objects.equals(this.id, v2MobiusRulesTopicConditionRulePredicate.id) &&
            Objects.equals(this.entity, v2MobiusRulesTopicConditionRulePredicate.entity) &&
            Objects.equals(this.metric, v2MobiusRulesTopicConditionRulePredicate.metric) &&
            Objects.equals(this.metricType, v2MobiusRulesTopicConditionRulePredicate.metricType) &&
            Objects.equals(this.metricValueType, v2MobiusRulesTopicConditionRulePredicate.metricValueType) &&
            Objects.equals(this.value, v2MobiusRulesTopicConditionRulePredicate.value) &&
            Objects.equals(this.status, v2MobiusRulesTopicConditionRulePredicate.status) &&
            Objects.equals(this.mediaType, v2MobiusRulesTopicConditionRulePredicate.mediaType) &&
            Objects.equals(this.topic, v2MobiusRulesTopicConditionRulePredicate.topic) &&
            Objects.equals(this.comparisonOperator, v2MobiusRulesTopicConditionRulePredicate.comparisonOperator);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, entity, metric, metricType, metricValueType, value, status, mediaType, topic, comparisonOperator);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V2MobiusRulesTopicConditionRulePredicate {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    entity: ").append(toIndentedString(entity)).append("\n");
    sb.append("    metric: ").append(toIndentedString(metric)).append("\n");
    sb.append("    metricType: ").append(toIndentedString(metricType)).append("\n");
    sb.append("    metricValueType: ").append(toIndentedString(metricValueType)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    mediaType: ").append(toIndentedString(mediaType)).append("\n");
    sb.append("    topic: ").append(toIndentedString(topic)).append("\n");
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

