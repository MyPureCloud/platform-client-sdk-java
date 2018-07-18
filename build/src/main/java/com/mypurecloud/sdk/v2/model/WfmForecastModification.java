package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.mypurecloud.sdk.v2.model.WfmForecastModificationAttributes;
import com.mypurecloud.sdk.v2.model.WfmForecastModificationIntervalOffsetValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * A modification to a short term forecast
 */
@ApiModel(description = "A modification to a short term forecast")

public class WfmForecastModification  implements Serializable {
  

  /**
   * The type of the modification
   */
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

  /**
   * The metric to which this modification applies
   */
  public enum MetricEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    OFFERED("Offered"),
    AVERAGETALKTIMESECONDS("AverageTalkTimeSeconds"),
    AVERAGEAFTERCALLWORKTIMESECONDS("AverageAfterCallWorkTimeSeconds"),
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
  private Double value = null;
  private List<WfmForecastModificationIntervalOffsetValue> values = new ArrayList<WfmForecastModificationIntervalOffsetValue>();
  private Boolean enabled = null;
  private WfmForecastModificationAttributes attributes = null;

  
  /**
   * The type of the modification
   **/
  public WfmForecastModification type(TypeEnum type) {
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
  public WfmForecastModification startIntervalIndex(Integer startIntervalIndex) {
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
  public WfmForecastModification endIntervalIndex(Integer endIntervalIndex) {
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
  public WfmForecastModification metric(MetricEnum metric) {
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
   * The value of the modification.  Must be null if \"values\" is populated
   **/
  public WfmForecastModification value(Double value) {
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
  public WfmForecastModification values(List<WfmForecastModificationIntervalOffsetValue> values) {
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
   * Whether the modification is enabled for the forecast
   **/
  public WfmForecastModification enabled(Boolean enabled) {
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
   * The attributes defining how this modification applies to the forecast
   **/
  public WfmForecastModification attributes(WfmForecastModificationAttributes attributes) {
    this.attributes = attributes;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The attributes defining how this modification applies to the forecast")
  @JsonProperty("attributes")
  public WfmForecastModificationAttributes getAttributes() {
    return attributes;
  }
  public void setAttributes(WfmForecastModificationAttributes attributes) {
    this.attributes = attributes;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WfmForecastModification wfmForecastModification = (WfmForecastModification) o;
    return Objects.equals(this.type, wfmForecastModification.type) &&
        Objects.equals(this.startIntervalIndex, wfmForecastModification.startIntervalIndex) &&
        Objects.equals(this.endIntervalIndex, wfmForecastModification.endIntervalIndex) &&
        Objects.equals(this.metric, wfmForecastModification.metric) &&
        Objects.equals(this.value, wfmForecastModification.value) &&
        Objects.equals(this.values, wfmForecastModification.values) &&
        Objects.equals(this.enabled, wfmForecastModification.enabled) &&
        Objects.equals(this.attributes, wfmForecastModification.attributes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, startIntervalIndex, endIntervalIndex, metric, value, values, enabled, attributes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WfmForecastModification {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    startIntervalIndex: ").append(toIndentedString(startIntervalIndex)).append("\n");
    sb.append("    endIntervalIndex: ").append(toIndentedString(endIntervalIndex)).append("\n");
    sb.append("    metric: ").append(toIndentedString(metric)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    values: ").append(toIndentedString(values)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
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

