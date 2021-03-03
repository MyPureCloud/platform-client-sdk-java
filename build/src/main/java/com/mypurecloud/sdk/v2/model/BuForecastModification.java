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
import com.mypurecloud.sdk.v2.model.WfmForecastModificationIntervalOffsetValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * BuForecastModification
 */

public class BuForecastModification  implements Serializable {
  

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
   * The type of the modification
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
   * The metric to which this modification applies
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
   * The legacy metric to which this modification applies if applicable
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
  private Double value = null;
  private List<WfmForecastModificationIntervalOffsetValue> values = new ArrayList<WfmForecastModificationIntervalOffsetValue>();
  private String displayGranularity = null;
  private String granularity = null;
  private Boolean enabled = null;
  private List<String> planningGroupIds = new ArrayList<String>();

  
  /**
   * The type of the modification
   **/
  public BuForecastModification type(TypeEnum type) {
    this.type = type;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The type of the modification")
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
    this.type = type;
  }

  
  /**
   * The number of 15 minute intervals past referenceStartDate representing the first interval to which to apply this modification. Must be null if values is populated
   **/
  public BuForecastModification startIntervalIndex(Integer startIntervalIndex) {
    this.startIntervalIndex = startIntervalIndex;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The number of 15 minute intervals past referenceStartDate representing the first interval to which to apply this modification. Must be null if values is populated")
  @JsonProperty("startIntervalIndex")
  public Integer getStartIntervalIndex() {
    return startIntervalIndex;
  }
  public void setStartIntervalIndex(Integer startIntervalIndex) {
    this.startIntervalIndex = startIntervalIndex;
  }

  
  /**
   * The number of 15 minute intervals past referenceStartDate representing the last interval to which to apply this modification.  Must be null if values is populated
   **/
  public BuForecastModification endIntervalIndex(Integer endIntervalIndex) {
    this.endIntervalIndex = endIntervalIndex;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The number of 15 minute intervals past referenceStartDate representing the last interval to which to apply this modification.  Must be null if values is populated")
  @JsonProperty("endIntervalIndex")
  public Integer getEndIntervalIndex() {
    return endIntervalIndex;
  }
  public void setEndIntervalIndex(Integer endIntervalIndex) {
    this.endIntervalIndex = endIntervalIndex;
  }

  
  /**
   * The metric to which this modification applies
   **/
  public BuForecastModification metric(MetricEnum metric) {
    this.metric = metric;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The metric to which this modification applies")
  @JsonProperty("metric")
  public MetricEnum getMetric() {
    return metric;
  }
  public void setMetric(MetricEnum metric) {
    this.metric = metric;
  }

  
  @ApiModelProperty(example = "null", value = "The legacy metric to which this modification applies if applicable")
  @JsonProperty("legacyMetric")
  public LegacyMetricEnum getLegacyMetric() {
    return legacyMetric;
  }

  
  /**
   * The value of the modification.  Must be null if \"values\" is populated
   **/
  public BuForecastModification value(Double value) {
    this.value = value;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The value of the modification.  Must be null if \"values\" is populated")
  @JsonProperty("value")
  public Double getValue() {
    return value;
  }
  public void setValue(Double value) {
    this.value = value;
  }

  
  /**
   * The list of values to update.  Only applicable for grid-type modifications. Must be null if \"value\" is populated
   **/
  public BuForecastModification values(List<WfmForecastModificationIntervalOffsetValue> values) {
    this.values = values;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The list of values to update.  Only applicable for grid-type modifications. Must be null if \"value\" is populated")
  @JsonProperty("values")
  public List<WfmForecastModificationIntervalOffsetValue> getValues() {
    return values;
  }
  public void setValues(List<WfmForecastModificationIntervalOffsetValue> values) {
    this.values = values;
  }

  
  /**
   * The client side display granularity of the modification, expressed in the ISO-8601 duration format. Periods are represented as an ISO-8601 string. For example: P1D or P1DT12H
   **/
  public BuForecastModification displayGranularity(String displayGranularity) {
    this.displayGranularity = displayGranularity;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The client side display granularity of the modification, expressed in the ISO-8601 duration format. Periods are represented as an ISO-8601 string. For example: P1D or P1DT12H")
  @JsonProperty("displayGranularity")
  public String getDisplayGranularity() {
    return displayGranularity;
  }
  public void setDisplayGranularity(String displayGranularity) {
    this.displayGranularity = displayGranularity;
  }

  
  /**
   * The actual granularity of the modification as stored behind the scenes, expressed in the ISO-8601 duration format. Periods are represented as an ISO-8601 string. For example: P1D or P1DT12H
   **/
  public BuForecastModification granularity(String granularity) {
    this.granularity = granularity;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The actual granularity of the modification as stored behind the scenes, expressed in the ISO-8601 duration format. Periods are represented as an ISO-8601 string. For example: P1D or P1DT12H")
  @JsonProperty("granularity")
  public String getGranularity() {
    return granularity;
  }
  public void setGranularity(String granularity) {
    this.granularity = granularity;
  }

  
  /**
   * Whether the modification is enabled for the forecast
   **/
  public BuForecastModification enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Whether the modification is enabled for the forecast")
  @JsonProperty("enabled")
  public Boolean getEnabled() {
    return enabled;
  }
  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

  
  /**
   * The IDs of the planning groups to which this forecast modification applies.  Leave empty to apply to all
   **/
  public BuForecastModification planningGroupIds(List<String> planningGroupIds) {
    this.planningGroupIds = planningGroupIds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The IDs of the planning groups to which this forecast modification applies.  Leave empty to apply to all")
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
    BuForecastModification buForecastModification = (BuForecastModification) o;
    return Objects.equals(this.type, buForecastModification.type) &&
        Objects.equals(this.startIntervalIndex, buForecastModification.startIntervalIndex) &&
        Objects.equals(this.endIntervalIndex, buForecastModification.endIntervalIndex) &&
        Objects.equals(this.metric, buForecastModification.metric) &&
        Objects.equals(this.legacyMetric, buForecastModification.legacyMetric) &&
        Objects.equals(this.value, buForecastModification.value) &&
        Objects.equals(this.values, buForecastModification.values) &&
        Objects.equals(this.displayGranularity, buForecastModification.displayGranularity) &&
        Objects.equals(this.granularity, buForecastModification.granularity) &&
        Objects.equals(this.enabled, buForecastModification.enabled) &&
        Objects.equals(this.planningGroupIds, buForecastModification.planningGroupIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, startIntervalIndex, endIntervalIndex, metric, legacyMetric, value, values, displayGranularity, granularity, enabled, planningGroupIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BuForecastModification {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    startIntervalIndex: ").append(toIndentedString(startIntervalIndex)).append("\n");
    sb.append("    endIntervalIndex: ").append(toIndentedString(endIntervalIndex)).append("\n");
    sb.append("    metric: ").append(toIndentedString(metric)).append("\n");
    sb.append("    legacyMetric: ").append(toIndentedString(legacyMetric)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    values: ").append(toIndentedString(values)).append("\n");
    sb.append("    displayGranularity: ").append(toIndentedString(displayGranularity)).append("\n");
    sb.append("    granularity: ").append(toIndentedString(granularity)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
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

