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
import com.mypurecloud.sdk.v2.model.WfmForecastModificationIntervalOffsetValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * BuForecastModificationResponse
 */

public class BuForecastModificationResponse  implements Serializable {
  

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
  private List<WfmForecastModificationIntervalOffsetValue> secondaryValues = new ArrayList<WfmForecastModificationIntervalOffsetValue>();
  private String displayGranularity = null;
  private String granularity = null;
  private String secondaryGranularity = null;
  private Boolean enabled = null;
  private List<String> planningGroupIds = new ArrayList<String>();

  
  /**
   * The type of the modification
   **/
  public BuForecastModificationResponse type(TypeEnum type) {
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
   * The number of intervals past referenceStartDate representing the first interval to which this modification applies
   **/
  public BuForecastModificationResponse startIntervalIndex(Integer startIntervalIndex) {
    this.startIntervalIndex = startIntervalIndex;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The number of intervals past referenceStartDate representing the first interval to which this modification applies")
  @JsonProperty("startIntervalIndex")
  public Integer getStartIntervalIndex() {
    return startIntervalIndex;
  }
  public void setStartIntervalIndex(Integer startIntervalIndex) {
    this.startIntervalIndex = startIntervalIndex;
  }


  /**
   * The number of intervals past referenceStartDate representing the last interval to which this modification applies
   **/
  public BuForecastModificationResponse endIntervalIndex(Integer endIntervalIndex) {
    this.endIntervalIndex = endIntervalIndex;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The number of intervals past referenceStartDate representing the last interval to which this modification applies")
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
  public BuForecastModificationResponse metric(MetricEnum metric) {
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


  /**
   * The legacy metric to which this modification applies if applicable
   **/
  public BuForecastModificationResponse legacyMetric(LegacyMetricEnum legacyMetric) {
    this.legacyMetric = legacyMetric;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The legacy metric to which this modification applies if applicable")
  @JsonProperty("legacyMetric")
  public LegacyMetricEnum getLegacyMetric() {
    return legacyMetric;
  }
  public void setLegacyMetric(LegacyMetricEnum legacyMetric) {
    this.legacyMetric = legacyMetric;
  }


  /**
   * The value of the modification
   **/
  public BuForecastModificationResponse value(Double value) {
    this.value = value;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The value of the modification")
  @JsonProperty("value")
  public Double getValue() {
    return value;
  }
  public void setValue(Double value) {
    this.value = value;
  }


  /**
   * The list of modification values. Only applicable for grid-type modifications
   **/
  public BuForecastModificationResponse values(List<WfmForecastModificationIntervalOffsetValue> values) {
    this.values = values;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The list of modification values. Only applicable for grid-type modifications")
  @JsonProperty("values")
  public List<WfmForecastModificationIntervalOffsetValue> getValues() {
    return values;
  }
  public void setValues(List<WfmForecastModificationIntervalOffsetValue> values) {
    this.values = values;
  }


  /**
   * The list of modification secondary values. Only applicable for multi granularity modifications
   **/
  public BuForecastModificationResponse secondaryValues(List<WfmForecastModificationIntervalOffsetValue> secondaryValues) {
    this.secondaryValues = secondaryValues;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The list of modification secondary values. Only applicable for multi granularity modifications")
  @JsonProperty("secondaryValues")
  public List<WfmForecastModificationIntervalOffsetValue> getSecondaryValues() {
    return secondaryValues;
  }
  public void setSecondaryValues(List<WfmForecastModificationIntervalOffsetValue> secondaryValues) {
    this.secondaryValues = secondaryValues;
  }


  /**
   * The client side display granularity of the modification, expressed in the ISO-8601 duration format. Periods are represented as an ISO-8601 string. For example: P1D or P1DT12H
   **/
  public BuForecastModificationResponse displayGranularity(String displayGranularity) {
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
  public BuForecastModificationResponse granularity(String granularity) {
    this.granularity = granularity;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The actual granularity of the modification as stored behind the scenes, expressed in the ISO-8601 duration format. Periods are represented as an ISO-8601 string. For example: P1D or P1DT12H")
  @JsonProperty("granularity")
  public String getGranularity() {
    return granularity;
  }
  public void setGranularity(String granularity) {
    this.granularity = granularity;
  }


  /**
   * The granularity of the 'secondaryValues' modification as stored behind the scenes, expressed in the ISO-8601 duration format. Periods are represented as an ISO-8601 string. For example: P1D or P1DT12H
   **/
  public BuForecastModificationResponse secondaryGranularity(String secondaryGranularity) {
    this.secondaryGranularity = secondaryGranularity;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The granularity of the 'secondaryValues' modification as stored behind the scenes, expressed in the ISO-8601 duration format. Periods are represented as an ISO-8601 string. For example: P1D or P1DT12H")
  @JsonProperty("secondaryGranularity")
  public String getSecondaryGranularity() {
    return secondaryGranularity;
  }
  public void setSecondaryGranularity(String secondaryGranularity) {
    this.secondaryGranularity = secondaryGranularity;
  }


  /**
   * Whether the modification is enabled for the forecast
   **/
  public BuForecastModificationResponse enabled(Boolean enabled) {
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
   * The IDs of the planning groups to which this forecast modification applies
   **/
  public BuForecastModificationResponse planningGroupIds(List<String> planningGroupIds) {
    this.planningGroupIds = planningGroupIds;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The IDs of the planning groups to which this forecast modification applies")
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
    BuForecastModificationResponse buForecastModificationResponse = (BuForecastModificationResponse) o;

    return Objects.equals(this.type, buForecastModificationResponse.type) &&
            Objects.equals(this.startIntervalIndex, buForecastModificationResponse.startIntervalIndex) &&
            Objects.equals(this.endIntervalIndex, buForecastModificationResponse.endIntervalIndex) &&
            Objects.equals(this.metric, buForecastModificationResponse.metric) &&
            Objects.equals(this.legacyMetric, buForecastModificationResponse.legacyMetric) &&
            Objects.equals(this.value, buForecastModificationResponse.value) &&
            Objects.equals(this.values, buForecastModificationResponse.values) &&
            Objects.equals(this.secondaryValues, buForecastModificationResponse.secondaryValues) &&
            Objects.equals(this.displayGranularity, buForecastModificationResponse.displayGranularity) &&
            Objects.equals(this.granularity, buForecastModificationResponse.granularity) &&
            Objects.equals(this.secondaryGranularity, buForecastModificationResponse.secondaryGranularity) &&
            Objects.equals(this.enabled, buForecastModificationResponse.enabled) &&
            Objects.equals(this.planningGroupIds, buForecastModificationResponse.planningGroupIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, startIntervalIndex, endIntervalIndex, metric, legacyMetric, value, values, secondaryValues, displayGranularity, granularity, secondaryGranularity, enabled, planningGroupIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BuForecastModificationResponse {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    startIntervalIndex: ").append(toIndentedString(startIntervalIndex)).append("\n");
    sb.append("    endIntervalIndex: ").append(toIndentedString(endIntervalIndex)).append("\n");
    sb.append("    metric: ").append(toIndentedString(metric)).append("\n");
    sb.append("    legacyMetric: ").append(toIndentedString(legacyMetric)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    values: ").append(toIndentedString(values)).append("\n");
    sb.append("    secondaryValues: ").append(toIndentedString(secondaryValues)).append("\n");
    sb.append("    displayGranularity: ").append(toIndentedString(displayGranularity)).append("\n");
    sb.append("    granularity: ").append(toIndentedString(granularity)).append("\n");
    sb.append("    secondaryGranularity: ").append(toIndentedString(secondaryGranularity)).append("\n");
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

