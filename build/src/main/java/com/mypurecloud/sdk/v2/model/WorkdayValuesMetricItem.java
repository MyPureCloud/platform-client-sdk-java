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
import com.mypurecloud.sdk.v2.model.AddressableEntityRef;
import com.mypurecloud.sdk.v2.model.DomainEntityRef;
import com.mypurecloud.sdk.v2.model.WorkdayValuesTrendItem;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * WorkdayValuesMetricItem
 */

public class WorkdayValuesMetricItem  implements Serializable {
  
  private AddressableEntityRef metric = null;
  private DomainEntityRef metricDefinition = null;
  private Double average = null;

  private static class UnitTypeEnumDeserializer extends StdDeserializer<UnitTypeEnum> {
    public UnitTypeEnumDeserializer() {
      super(UnitTypeEnumDeserializer.class);
    }

    @Override
    public UnitTypeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return UnitTypeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The unit type of the metric value
   */
 @JsonDeserialize(using = UnitTypeEnumDeserializer.class)
  public enum UnitTypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    NONE("None"),
    PERCENT("Percent"),
    CURRENCY("Currency"),
    SECONDS("Seconds"),
    NUMBER("Number"),
    ATTENDANCESTATUS("AttendanceStatus"),
    UNIT("Unit");

    private String value;

    UnitTypeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static UnitTypeEnum fromString(String key) {
      if (key == null) return null;

      for (UnitTypeEnum value : UnitTypeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return UnitTypeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private UnitTypeEnum unitType = null;
  private List<WorkdayValuesTrendItem> trend = null;

  public WorkdayValuesMetricItem() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      trend = new ArrayList<WorkdayValuesTrendItem>();
    }
  }

  
  @ApiModelProperty(example = "null", value = "Gamification metric for the average and the trend")
  @JsonProperty("metric")
  public AddressableEntityRef getMetric() {
    return metric;
  }


  @ApiModelProperty(example = "null", value = "Gamification metric definition for the average and the trend")
  @JsonProperty("metricDefinition")
  public DomainEntityRef getMetricDefinition() {
    return metricDefinition;
  }


  @ApiModelProperty(example = "null", value = "The average value of the metric")
  @JsonProperty("average")
  public Double getAverage() {
    return average;
  }


  @ApiModelProperty(example = "null", value = "The unit type of the metric value")
  @JsonProperty("unitType")
  public UnitTypeEnum getUnitType() {
    return unitType;
  }


  @ApiModelProperty(example = "null", value = "The metric value trend")
  @JsonProperty("trend")
  public List<WorkdayValuesTrendItem> getTrend() {
    return trend;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkdayValuesMetricItem workdayValuesMetricItem = (WorkdayValuesMetricItem) o;

    return Objects.equals(this.metric, workdayValuesMetricItem.metric) &&
            Objects.equals(this.metricDefinition, workdayValuesMetricItem.metricDefinition) &&
            Objects.equals(this.average, workdayValuesMetricItem.average) &&
            Objects.equals(this.unitType, workdayValuesMetricItem.unitType) &&
            Objects.equals(this.trend, workdayValuesMetricItem.trend);
  }

  @Override
  public int hashCode() {
    return Objects.hash(metric, metricDefinition, average, unitType, trend);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkdayValuesMetricItem {\n");
    
    sb.append("    metric: ").append(toIndentedString(metric)).append("\n");
    sb.append("    metricDefinition: ").append(toIndentedString(metricDefinition)).append("\n");
    sb.append("    average: ").append(toIndentedString(average)).append("\n");
    sb.append("    unitType: ").append(toIndentedString(unitType)).append("\n");
    sb.append("    trend: ").append(toIndentedString(trend)).append("\n");
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

