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
import com.mypurecloud.sdk.v2.model.WfmBuShortTermForecastImportCompleteTopicModificationIntervalOffsetValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * WfmBuShortTermForecastImportCompleteTopicBuForecastModification
 */

public class WfmBuShortTermForecastImportCompleteTopicBuForecastModification  implements Serializable {
  

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
    SETVALUESFORINTERVALSET("SetValuesForIntervalSet"),
    SETMULTIGRANULARITYVALUESFORINTERVALSET("SetMultiGranularityValuesForIntervalSet");

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
  private Long startIntervalIndex = null;
  private Long endIntervalIndex = null;

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
  private List<WfmBuShortTermForecastImportCompleteTopicModificationIntervalOffsetValue> values = null;
  private List<WfmBuShortTermForecastImportCompleteTopicModificationIntervalOffsetValue> secondaryValues = null;
  private Boolean enabled = null;
  private String granularity = null;
  private String secondaryGranularity = null;
  private String displayGranularity = null;
  private List<String> planningGroupIds = null;

  public WfmBuShortTermForecastImportCompleteTopicBuForecastModification() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      values = new ArrayList<WfmBuShortTermForecastImportCompleteTopicModificationIntervalOffsetValue>();
      secondaryValues = new ArrayList<WfmBuShortTermForecastImportCompleteTopicModificationIntervalOffsetValue>();
      planningGroupIds = new ArrayList<String>();
    }
  }

  
  /**
   **/
  public WfmBuShortTermForecastImportCompleteTopicBuForecastModification type(TypeEnum type) {
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
  public WfmBuShortTermForecastImportCompleteTopicBuForecastModification startIntervalIndex(Long startIntervalIndex) {
    this.startIntervalIndex = startIntervalIndex;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("startIntervalIndex")
  public Long getStartIntervalIndex() {
    return startIntervalIndex;
  }
  public void setStartIntervalIndex(Long startIntervalIndex) {
    this.startIntervalIndex = startIntervalIndex;
  }


  /**
   **/
  public WfmBuShortTermForecastImportCompleteTopicBuForecastModification endIntervalIndex(Long endIntervalIndex) {
    this.endIntervalIndex = endIntervalIndex;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("endIntervalIndex")
  public Long getEndIntervalIndex() {
    return endIntervalIndex;
  }
  public void setEndIntervalIndex(Long endIntervalIndex) {
    this.endIntervalIndex = endIntervalIndex;
  }


  /**
   **/
  public WfmBuShortTermForecastImportCompleteTopicBuForecastModification metric(MetricEnum metric) {
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
  public WfmBuShortTermForecastImportCompleteTopicBuForecastModification legacyMetric(LegacyMetricEnum legacyMetric) {
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
  public WfmBuShortTermForecastImportCompleteTopicBuForecastModification value(BigDecimal value) {
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
  public WfmBuShortTermForecastImportCompleteTopicBuForecastModification values(List<WfmBuShortTermForecastImportCompleteTopicModificationIntervalOffsetValue> values) {
    this.values = values;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("values")
  public List<WfmBuShortTermForecastImportCompleteTopicModificationIntervalOffsetValue> getValues() {
    return values;
  }
  public void setValues(List<WfmBuShortTermForecastImportCompleteTopicModificationIntervalOffsetValue> values) {
    this.values = values;
  }


  /**
   **/
  public WfmBuShortTermForecastImportCompleteTopicBuForecastModification secondaryValues(List<WfmBuShortTermForecastImportCompleteTopicModificationIntervalOffsetValue> secondaryValues) {
    this.secondaryValues = secondaryValues;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("secondaryValues")
  public List<WfmBuShortTermForecastImportCompleteTopicModificationIntervalOffsetValue> getSecondaryValues() {
    return secondaryValues;
  }
  public void setSecondaryValues(List<WfmBuShortTermForecastImportCompleteTopicModificationIntervalOffsetValue> secondaryValues) {
    this.secondaryValues = secondaryValues;
  }


  /**
   **/
  public WfmBuShortTermForecastImportCompleteTopicBuForecastModification enabled(Boolean enabled) {
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
  public WfmBuShortTermForecastImportCompleteTopicBuForecastModification granularity(String granularity) {
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
  public WfmBuShortTermForecastImportCompleteTopicBuForecastModification secondaryGranularity(String secondaryGranularity) {
    this.secondaryGranularity = secondaryGranularity;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("secondaryGranularity")
  public String getSecondaryGranularity() {
    return secondaryGranularity;
  }
  public void setSecondaryGranularity(String secondaryGranularity) {
    this.secondaryGranularity = secondaryGranularity;
  }


  /**
   **/
  public WfmBuShortTermForecastImportCompleteTopicBuForecastModification displayGranularity(String displayGranularity) {
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
  public WfmBuShortTermForecastImportCompleteTopicBuForecastModification planningGroupIds(List<String> planningGroupIds) {
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
    WfmBuShortTermForecastImportCompleteTopicBuForecastModification wfmBuShortTermForecastImportCompleteTopicBuForecastModification = (WfmBuShortTermForecastImportCompleteTopicBuForecastModification) o;

    return Objects.equals(this.type, wfmBuShortTermForecastImportCompleteTopicBuForecastModification.type) &&
            Objects.equals(this.startIntervalIndex, wfmBuShortTermForecastImportCompleteTopicBuForecastModification.startIntervalIndex) &&
            Objects.equals(this.endIntervalIndex, wfmBuShortTermForecastImportCompleteTopicBuForecastModification.endIntervalIndex) &&
            Objects.equals(this.metric, wfmBuShortTermForecastImportCompleteTopicBuForecastModification.metric) &&
            Objects.equals(this.legacyMetric, wfmBuShortTermForecastImportCompleteTopicBuForecastModification.legacyMetric) &&
            Objects.equals(this.value, wfmBuShortTermForecastImportCompleteTopicBuForecastModification.value) &&
            Objects.equals(this.values, wfmBuShortTermForecastImportCompleteTopicBuForecastModification.values) &&
            Objects.equals(this.secondaryValues, wfmBuShortTermForecastImportCompleteTopicBuForecastModification.secondaryValues) &&
            Objects.equals(this.enabled, wfmBuShortTermForecastImportCompleteTopicBuForecastModification.enabled) &&
            Objects.equals(this.granularity, wfmBuShortTermForecastImportCompleteTopicBuForecastModification.granularity) &&
            Objects.equals(this.secondaryGranularity, wfmBuShortTermForecastImportCompleteTopicBuForecastModification.secondaryGranularity) &&
            Objects.equals(this.displayGranularity, wfmBuShortTermForecastImportCompleteTopicBuForecastModification.displayGranularity) &&
            Objects.equals(this.planningGroupIds, wfmBuShortTermForecastImportCompleteTopicBuForecastModification.planningGroupIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, startIntervalIndex, endIntervalIndex, metric, legacyMetric, value, values, secondaryValues, enabled, granularity, secondaryGranularity, displayGranularity, planningGroupIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WfmBuShortTermForecastImportCompleteTopicBuForecastModification {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    startIntervalIndex: ").append(toIndentedString(startIntervalIndex)).append("\n");
    sb.append("    endIntervalIndex: ").append(toIndentedString(endIntervalIndex)).append("\n");
    sb.append("    metric: ").append(toIndentedString(metric)).append("\n");
    sb.append("    legacyMetric: ").append(toIndentedString(legacyMetric)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    values: ").append(toIndentedString(values)).append("\n");
    sb.append("    secondaryValues: ").append(toIndentedString(secondaryValues)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    granularity: ").append(toIndentedString(granularity)).append("\n");
    sb.append("    secondaryGranularity: ").append(toIndentedString(secondaryGranularity)).append("\n");
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

