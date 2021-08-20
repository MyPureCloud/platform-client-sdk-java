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
import com.mypurecloud.sdk.v2.model.DefaultObjective;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * MetricDefinition
 */

public class MetricDefinition  implements Serializable {
  
  private String id = null;
  private String name = null;

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
   * The type of associated metric unit
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
  private String shortName = null;
  private List<String> dividendMetrics = new ArrayList<String>();
  private List<String> divisorMetrics = new ArrayList<String>();
  private DefaultObjective defaultObjective = null;
  private String lockTemplateId = null;
  private String selfUri = null;

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  
  /**
   **/
  public MetricDefinition name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   * The type of associated metric unit
   **/
  public MetricDefinition unitType(UnitTypeEnum unitType) {
    this.unitType = unitType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The type of associated metric unit")
  @JsonProperty("unitType")
  public UnitTypeEnum getUnitType() {
    return unitType;
  }
  public void setUnitType(UnitTypeEnum unitType) {
    this.unitType = unitType;
  }

  
  /**
   * An alternate name for this metric definition, often abbreviation
   **/
  public MetricDefinition shortName(String shortName) {
    this.shortName = shortName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "An alternate name for this metric definition, often abbreviation")
  @JsonProperty("shortName")
  public String getShortName() {
    return shortName;
  }
  public void setShortName(String shortName) {
    this.shortName = shortName;
  }

  
  /**
   * Metric names used as dividend
   **/
  public MetricDefinition dividendMetrics(List<String> dividendMetrics) {
    this.dividendMetrics = dividendMetrics;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Metric names used as dividend")
  @JsonProperty("dividendMetrics")
  public List<String> getDividendMetrics() {
    return dividendMetrics;
  }
  public void setDividendMetrics(List<String> dividendMetrics) {
    this.dividendMetrics = dividendMetrics;
  }

  
  /**
   * Metric names used as divisor
   **/
  public MetricDefinition divisorMetrics(List<String> divisorMetrics) {
    this.divisorMetrics = divisorMetrics;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Metric names used as divisor")
  @JsonProperty("divisorMetrics")
  public List<String> getDivisorMetrics() {
    return divisorMetrics;
  }
  public void setDivisorMetrics(List<String> divisorMetrics) {
    this.divisorMetrics = divisorMetrics;
  }

  
  /**
   * A predefined default objective for this metric
   **/
  public MetricDefinition defaultObjective(DefaultObjective defaultObjective) {
    this.defaultObjective = defaultObjective;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A predefined default objective for this metric")
  @JsonProperty("defaultObjective")
  public DefaultObjective getDefaultObjective() {
    return defaultObjective;
  }
  public void setDefaultObjective(DefaultObjective defaultObjective) {
    this.defaultObjective = defaultObjective;
  }

  
  /**
   * An optional field to specify if this metric definition is locked to certain template. e.g. punctuality
   **/
  public MetricDefinition lockTemplateId(String lockTemplateId) {
    this.lockTemplateId = lockTemplateId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "An optional field to specify if this metric definition is locked to certain template. e.g. punctuality")
  @JsonProperty("lockTemplateId")
  public String getLockTemplateId() {
    return lockTemplateId;
  }
  public void setLockTemplateId(String lockTemplateId) {
    this.lockTemplateId = lockTemplateId;
  }

  
  @ApiModelProperty(example = "null", value = "The URI for this object")
  @JsonProperty("selfUri")
  public String getSelfUri() {
    return selfUri;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MetricDefinition metricDefinition = (MetricDefinition) o;
    return Objects.equals(this.id, metricDefinition.id) &&
        Objects.equals(this.name, metricDefinition.name) &&
        Objects.equals(this.unitType, metricDefinition.unitType) &&
        Objects.equals(this.shortName, metricDefinition.shortName) &&
        Objects.equals(this.dividendMetrics, metricDefinition.dividendMetrics) &&
        Objects.equals(this.divisorMetrics, metricDefinition.divisorMetrics) &&
        Objects.equals(this.defaultObjective, metricDefinition.defaultObjective) &&
        Objects.equals(this.lockTemplateId, metricDefinition.lockTemplateId) &&
        Objects.equals(this.selfUri, metricDefinition.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, unitType, shortName, dividendMetrics, divisorMetrics, defaultObjective, lockTemplateId, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MetricDefinition {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    unitType: ").append(toIndentedString(unitType)).append("\n");
    sb.append("    shortName: ").append(toIndentedString(shortName)).append("\n");
    sb.append("    dividendMetrics: ").append(toIndentedString(dividendMetrics)).append("\n");
    sb.append("    divisorMetrics: ").append(toIndentedString(divisorMetrics)).append("\n");
    sb.append("    defaultObjective: ").append(toIndentedString(defaultObjective)).append("\n");
    sb.append("    lockTemplateId: ").append(toIndentedString(lockTemplateId)).append("\n");
    sb.append("    selfUri: ").append(toIndentedString(selfUri)).append("\n");
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

