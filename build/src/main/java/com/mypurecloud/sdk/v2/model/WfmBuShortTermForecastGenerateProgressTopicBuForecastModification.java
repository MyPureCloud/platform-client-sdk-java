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
import com.mypurecloud.sdk.v2.model.WfmBuShortTermForecastGenerateProgressTopicModificationIntervalOffsetValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * WfmBuShortTermForecastGenerateProgressTopicBuForecastModification
 */

public class WfmBuShortTermForecastGenerateProgressTopicBuForecastModification  implements Serializable {
  

  private static class TypeEnumDeserializer extends StdDeserializer<TypeEnum> {
    public TypeEnumDeserializer() {
      super(TypeEnumDeserializer.class);
    }

    @Override
    public TypeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return TypeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Gets or Sets type
   */
 @JsonDeserialize(using = TypeEnumDeserializer.class)
  public enum TypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    MINIMUMPERINTERVAL("MinimumPerInterval"),
    MAXIMUMPERINTERVAL("MaximumPerInterval"),
    SETVALUEPERINTERVAL("SetValuePerInterval"),
    CHANGEVALUEPERINTERVAL("ChangeValuePerInterval"),
    CHANGEPERCENTPERINTERVAL("ChangePercentPerInterval"),
    SETVALUEOVERRANGE("SetValueOverRange"),
    CHANGEVALUEOVERRANGE("ChangeValueOverRange"),
    SETVALUESFORINTERVALSET("SetValuesForIntervalSet");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static TypeEnum fromString(String key) {
      if (key == null) return null;

      for (TypeEnum value : TypeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return TypeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private TypeEnum type = null;
  private Integer startIntervalIndex = null;
  private Integer endIntervalIndex = null;

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
   * Gets or Sets metric
   */
 @JsonDeserialize(using = MetricEnumDeserializer.class)
  public enum MetricEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    OFFERED("Offered"),
    AVERAGEHANDLETIMESECONDS("AverageHandleTimeSeconds");

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

  private static class LegacyMetricEnumDeserializer extends StdDeserializer<LegacyMetricEnum> {
    public LegacyMetricEnumDeserializer() {
      super(LegacyMetricEnumDeserializer.class);
    }

    @Override
    public LegacyMetricEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return LegacyMetricEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Gets or Sets legacyMetric
   */
 @JsonDeserialize(using = LegacyMetricEnumDeserializer.class)
  public enum LegacyMetricEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    AVERAGEAFTERCALLWORKTIMESECONDS("AverageAfterCallWorkTimeSeconds"),
    AVERAGEHANDLETIMESECONDS("AverageHandleTimeSeconds"),
    AVERAGETALKTIMESECONDS("AverageTalkTimeSeconds"),
    OFFERED("Offered");

    private String value;

    LegacyMetricEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static LegacyMetricEnum fromString(String key) {
      if (key == null) return null;

      for (LegacyMetricEnum value : LegacyMetricEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return LegacyMetricEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private LegacyMetricEnum legacyMetric = null;
  private BigDecimal value = null;
  private List<WfmBuShortTermForecastGenerateProgressTopicModificationIntervalOffsetValue> values = new ArrayList<WfmBuShortTermForecastGenerateProgressTopicModificationIntervalOffsetValue>();
  private Boolean enabled = null;
  private String granularity = null;
  private String displayGranularity = null;
  private List<String> planningGroupIds = new ArrayList<String>();

  
  /**
   **/
  public WfmBuShortTermForecastGenerateProgressTopicBuForecastModification type(TypeEnum type) {
    this.type = type;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
    this.type = type;
  }

  
  /**
   **/
  public WfmBuShortTermForecastGenerateProgressTopicBuForecastModification startIntervalIndex(Integer startIntervalIndex) {
    this.startIntervalIndex = startIntervalIndex;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("startIntervalIndex")
  public Integer getStartIntervalIndex() {
    return startIntervalIndex;
  }
  public void setStartIntervalIndex(Integer startIntervalIndex) {
    this.startIntervalIndex = startIntervalIndex;
  }

  
  /**
   **/
  public WfmBuShortTermForecastGenerateProgressTopicBuForecastModification endIntervalIndex(Integer endIntervalIndex) {
    this.endIntervalIndex = endIntervalIndex;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("endIntervalIndex")
  public Integer getEndIntervalIndex() {
    return endIntervalIndex;
  }
  public void setEndIntervalIndex(Integer endIntervalIndex) {
    this.endIntervalIndex = endIntervalIndex;
  }

  
  /**
   **/
  public WfmBuShortTermForecastGenerateProgressTopicBuForecastModification metric(MetricEnum metric) {
    this.metric = metric;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("metric")
  public MetricEnum getMetric() {
    return metric;
  }
  public void setMetric(MetricEnum metric) {
    this.metric = metric;
  }

  
  /**
   **/
  public WfmBuShortTermForecastGenerateProgressTopicBuForecastModification legacyMetric(LegacyMetricEnum legacyMetric) {
    this.legacyMetric = legacyMetric;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("legacyMetric")
  public LegacyMetricEnum getLegacyMetric() {
    return legacyMetric;
  }
  public void setLegacyMetric(LegacyMetricEnum legacyMetric) {
    this.legacyMetric = legacyMetric;
  }

  
  /**
   **/
  public WfmBuShortTermForecastGenerateProgressTopicBuForecastModification value(BigDecimal value) {
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
  public WfmBuShortTermForecastGenerateProgressTopicBuForecastModification values(List<WfmBuShortTermForecastGenerateProgressTopicModificationIntervalOffsetValue> values) {
    this.values = values;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("values")
  public List<WfmBuShortTermForecastGenerateProgressTopicModificationIntervalOffsetValue> getValues() {
    return values;
  }
  public void setValues(List<WfmBuShortTermForecastGenerateProgressTopicModificationIntervalOffsetValue> values) {
    this.values = values;
  }

  
  /**
   **/
  public WfmBuShortTermForecastGenerateProgressTopicBuForecastModification enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("enabled")
  public Boolean getEnabled() {
    return enabled;
  }
  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

  
  /**
   **/
  public WfmBuShortTermForecastGenerateProgressTopicBuForecastModification granularity(String granularity) {
    this.granularity = granularity;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("granularity")
  public String getGranularity() {
    return granularity;
  }
  public void setGranularity(String granularity) {
    this.granularity = granularity;
  }

  
  /**
   **/
  public WfmBuShortTermForecastGenerateProgressTopicBuForecastModification displayGranularity(String displayGranularity) {
    this.displayGranularity = displayGranularity;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("displayGranularity")
  public String getDisplayGranularity() {
    return displayGranularity;
  }
  public void setDisplayGranularity(String displayGranularity) {
    this.displayGranularity = displayGranularity;
  }

  
  /**
   **/
  public WfmBuShortTermForecastGenerateProgressTopicBuForecastModification planningGroupIds(List<String> planningGroupIds) {
    this.planningGroupIds = planningGroupIds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("planningGroupIds")
  public List<String> getPlanningGroupIds() {
    return planningGroupIds;
  }
  public void setPlanningGroupIds(List<String> planningGroupIds) {
    this.planningGroupIds = planningGroupIds;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WfmBuShortTermForecastGenerateProgressTopicBuForecastModification wfmBuShortTermForecastGenerateProgressTopicBuForecastModification = (WfmBuShortTermForecastGenerateProgressTopicBuForecastModification) o;
    return Objects.equals(this.type, wfmBuShortTermForecastGenerateProgressTopicBuForecastModification.type) &&
        Objects.equals(this.startIntervalIndex, wfmBuShortTermForecastGenerateProgressTopicBuForecastModification.startIntervalIndex) &&
        Objects.equals(this.endIntervalIndex, wfmBuShortTermForecastGenerateProgressTopicBuForecastModification.endIntervalIndex) &&
        Objects.equals(this.metric, wfmBuShortTermForecastGenerateProgressTopicBuForecastModification.metric) &&
        Objects.equals(this.legacyMetric, wfmBuShortTermForecastGenerateProgressTopicBuForecastModification.legacyMetric) &&
        Objects.equals(this.value, wfmBuShortTermForecastGenerateProgressTopicBuForecastModification.value) &&
        Objects.equals(this.values, wfmBuShortTermForecastGenerateProgressTopicBuForecastModification.values) &&
        Objects.equals(this.enabled, wfmBuShortTermForecastGenerateProgressTopicBuForecastModification.enabled) &&
        Objects.equals(this.granularity, wfmBuShortTermForecastGenerateProgressTopicBuForecastModification.granularity) &&
        Objects.equals(this.displayGranularity, wfmBuShortTermForecastGenerateProgressTopicBuForecastModification.displayGranularity) &&
        Objects.equals(this.planningGroupIds, wfmBuShortTermForecastGenerateProgressTopicBuForecastModification.planningGroupIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, startIntervalIndex, endIntervalIndex, metric, legacyMetric, value, values, enabled, granularity, displayGranularity, planningGroupIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WfmBuShortTermForecastGenerateProgressTopicBuForecastModification {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    startIntervalIndex: ").append(toIndentedString(startIntervalIndex)).append("\n");
    sb.append("    endIntervalIndex: ").append(toIndentedString(endIntervalIndex)).append("\n");
    sb.append("    metric: ").append(toIndentedString(metric)).append("\n");
    sb.append("    legacyMetric: ").append(toIndentedString(legacyMetric)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    values: ").append(toIndentedString(values)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    granularity: ").append(toIndentedString(granularity)).append("\n");
    sb.append("    displayGranularity: ").append(toIndentedString(displayGranularity)).append("\n");
    sb.append("    planningGroupIds: ").append(toIndentedString(planningGroupIds)).append("\n");
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

