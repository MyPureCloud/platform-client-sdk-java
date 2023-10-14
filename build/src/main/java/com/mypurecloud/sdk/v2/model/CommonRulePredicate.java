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
import com.mypurecloud.sdk.v2.model.CommonRulePredicateEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * CommonRulePredicate
 */

public class CommonRulePredicate  implements Serializable {
  

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
   * The type of metric being evaluated.
   */
 @JsonDeserialize(using = MetricTypeEnumDeserializer.class)
  public enum MetricTypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    INTERVAL("Interval"),
    INSTANCE("Instance");

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
   * The type of metric value being evaluated.
   */
 @JsonDeserialize(using = MetricValueTypeEnumDeserializer.class)
  public enum MetricValueTypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    COUNT("Count"),
    MIN("Min"),
    TIMER("Timer"),
    MAX("Max"),
    PERCENTAGE("Percentage"),
    AVERAGE("Average"),
    OBSERVATION("Observation");

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
   * The comparison operator being performed on the metric.
   */
 @JsonDeserialize(using = ComparisonOperatorEnumDeserializer.class)
  public enum ComparisonOperatorEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    GT("Gt"),
    GTE("Gte"),
    LT("Lt"),
    LTE("Lte"),
    EQ("Eq"),
    NE("Ne");

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
  private Double value = null;
  private String status = null;
  private CommonRulePredicateEntity entity = null;

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
   * The media type of the conversation the metric describes.
   */
 @JsonDeserialize(using = MediaTypeEnumDeserializer.class)
  public enum MediaTypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    VOICE("Voice"),
    CHAT("Chat"),
    EMAIL("Email"),
    CALLBACK("Callback"),
    MESSAGE("Message");

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
   * The metric being evaluated.
   */
 @JsonDeserialize(using = MetricEnumDeserializer.class)
  public enum MetricEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    NABANDON("nAbandon"),
    NCONNECTED("nConnected"),
    NINTERACTIONS("nInteractions"),
    NOFFERED("nOffered"),
    NOUTBOUND("nOutbound"),
    NTRANSFERRED("nTransferred"),
    SERVICELEVEL("serviceLevel"),
    OSERVICELEVEL("oServiceLevel"),
    OWAITING("oWaiting"),
    TABANDON("tAbandon"),
    TACW("tAcw"),
    TALERT("tAlert"),
    TANSWERED("tAnswered"),
    THANDLE("tHandle"),
    THELDCOMPLETE("tHeldComplete"),
    TTALKCOMPLETE("tTalkComplete"),
    TWAIT("tWait"),
    TTALK("tTalk"),
    THELD("tHeld"),
    TORGANIZATIONPRESENCE("tOrganizationPresence"),
    TSYSTEMPRESENCE("tSystemPresence"),
    TAGENTROUTINGSTATUS("tAgentRoutingStatus"),
    OUSERROUTINGSTATUSES("oUserRoutingStatuses"),
    OUSERPRESENCES("oUserPresences"),
    OINTERACTING("oInteracting"),
    TFLOWOUT("tFlowOut"),
    TADHERENCESTATUS("tAdherenceStatus");

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

  
  /**
   * The type of metric being evaluated.
   **/
  public CommonRulePredicate metricType(MetricTypeEnum metricType) {
    this.metricType = metricType;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The type of metric being evaluated.")
  @JsonProperty("metricType")
  public MetricTypeEnum getMetricType() {
    return metricType;
  }
  public void setMetricType(MetricTypeEnum metricType) {
    this.metricType = metricType;
  }


  /**
   * The type of metric value being evaluated.
   **/
  public CommonRulePredicate metricValueType(MetricValueTypeEnum metricValueType) {
    this.metricValueType = metricValueType;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The type of metric value being evaluated.")
  @JsonProperty("metricValueType")
  public MetricValueTypeEnum getMetricValueType() {
    return metricValueType;
  }
  public void setMetricValueType(MetricValueTypeEnum metricValueType) {
    this.metricValueType = metricValueType;
  }


  /**
   * The comparison operator being performed on the metric.
   **/
  public CommonRulePredicate comparisonOperator(ComparisonOperatorEnum comparisonOperator) {
    this.comparisonOperator = comparisonOperator;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The comparison operator being performed on the metric.")
  @JsonProperty("comparisonOperator")
  public ComparisonOperatorEnum getComparisonOperator() {
    return comparisonOperator;
  }
  public void setComparisonOperator(ComparisonOperatorEnum comparisonOperator) {
    this.comparisonOperator = comparisonOperator;
  }


  /**
   * The value the metric will be compared to.
   **/
  public CommonRulePredicate value(Double value) {
    this.value = value;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The value the metric will be compared to.")
  @JsonProperty("value")
  public Double getValue() {
    return value;
  }
  public void setValue(Double value) {
    this.value = value;
  }


  /**
   * The status of the entity corresponding to the metric.
   **/
  public CommonRulePredicate status(String status) {
    this.status = status;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The status of the entity corresponding to the metric.")
  @JsonProperty("status")
  public String getStatus() {
    return status;
  }
  public void setStatus(String status) {
    this.status = status;
  }


  /**
   * The entity whose metric is being represented.
   **/
  public CommonRulePredicate entity(CommonRulePredicateEntity entity) {
    this.entity = entity;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The entity whose metric is being represented.")
  @JsonProperty("entity")
  public CommonRulePredicateEntity getEntity() {
    return entity;
  }
  public void setEntity(CommonRulePredicateEntity entity) {
    this.entity = entity;
  }


  /**
   * The media type of the conversation the metric describes.
   **/
  public CommonRulePredicate mediaType(MediaTypeEnum mediaType) {
    this.mediaType = mediaType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The media type of the conversation the metric describes.")
  @JsonProperty("mediaType")
  public MediaTypeEnum getMediaType() {
    return mediaType;
  }
  public void setMediaType(MediaTypeEnum mediaType) {
    this.mediaType = mediaType;
  }


  /**
   * The metric being evaluated.
   **/
  public CommonRulePredicate metric(MetricEnum metric) {
    this.metric = metric;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The metric being evaluated.")
  @JsonProperty("metric")
  public MetricEnum getMetric() {
    return metric;
  }
  public void setMetric(MetricEnum metric) {
    this.metric = metric;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CommonRulePredicate commonRulePredicate = (CommonRulePredicate) o;

    return Objects.equals(this.metricType, commonRulePredicate.metricType) &&
            Objects.equals(this.metricValueType, commonRulePredicate.metricValueType) &&
            Objects.equals(this.comparisonOperator, commonRulePredicate.comparisonOperator) &&
            Objects.equals(this.value, commonRulePredicate.value) &&
            Objects.equals(this.status, commonRulePredicate.status) &&
            Objects.equals(this.entity, commonRulePredicate.entity) &&
            Objects.equals(this.mediaType, commonRulePredicate.mediaType) &&
            Objects.equals(this.metric, commonRulePredicate.metric);
  }

  @Override
  public int hashCode() {
    return Objects.hash(metricType, metricValueType, comparisonOperator, value, status, entity, mediaType, metric);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CommonRulePredicate {\n");
    
    sb.append("    metricType: ").append(toIndentedString(metricType)).append("\n");
    sb.append("    metricValueType: ").append(toIndentedString(metricValueType)).append("\n");
    sb.append("    comparisonOperator: ").append(toIndentedString(comparisonOperator)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    entity: ").append(toIndentedString(entity)).append("\n");
    sb.append("    mediaType: ").append(toIndentedString(mediaType)).append("\n");
    sb.append("    metric: ").append(toIndentedString(metric)).append("\n");
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

