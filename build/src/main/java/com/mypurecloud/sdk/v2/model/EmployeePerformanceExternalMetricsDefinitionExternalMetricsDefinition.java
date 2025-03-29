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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

import java.io.Serializable;
/**
 * EmployeePerformanceExternalMetricsDefinitionExternalMetricsDefinition
 */

public class EmployeePerformanceExternalMetricsDefinitionExternalMetricsDefinition  implements Serializable {
  
  private String id = null;
  private String name = null;

  private static class UnitEnumDeserializer extends StdDeserializer<UnitEnum> {
    public UnitEnumDeserializer() {
      super(UnitEnumDeserializer.class);
    }

    @Override
    public UnitEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return UnitEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Gets or Sets unit
   */
 @JsonDeserialize(using = UnitEnumDeserializer.class)
  public enum UnitEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    SECONDS("Seconds"),
    PERCENT("Percent"),
    NUMBER("Number"),
    CURRENCY("Currency"),
    UNKNOWN("Unknown");

    private String value;

    UnitEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static UnitEnum fromString(String key) {
      if (key == null) return null;

      for (UnitEnum value : UnitEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return UnitEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private UnitEnum unit = null;
  private String unitDefinition = null;
  private Integer precision = null;

  private static class DefaultObjectiveTypeEnumDeserializer extends StdDeserializer<DefaultObjectiveTypeEnum> {
    public DefaultObjectiveTypeEnumDeserializer() {
      super(DefaultObjectiveTypeEnumDeserializer.class);
    }

    @Override
    public DefaultObjectiveTypeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return DefaultObjectiveTypeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Gets or Sets defaultObjectiveType
   */
 @JsonDeserialize(using = DefaultObjectiveTypeEnumDeserializer.class)
  public enum DefaultObjectiveTypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    HIGHERISBETTER("HigherIsBetter"),
    LOWERISBETTER("LowerIsBetter"),
    TARGETAREA("TargetArea"),
    UNKNOWN("Unknown");

    private String value;

    DefaultObjectiveTypeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static DefaultObjectiveTypeEnum fromString(String key) {
      if (key == null) return null;

      for (DefaultObjectiveTypeEnum value : DefaultObjectiveTypeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return DefaultObjectiveTypeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private DefaultObjectiveTypeEnum defaultObjectiveType = null;
  private Integer retentionMonths = null;
  private Boolean enabled = null;
  private Boolean inUse = null;
  private Date dateLastRefreshed = null;

  
  /**
   **/
  public EmployeePerformanceExternalMetricsDefinitionExternalMetricsDefinition id(String id) {
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
  public EmployeePerformanceExternalMetricsDefinitionExternalMetricsDefinition name(String name) {
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
   **/
  public EmployeePerformanceExternalMetricsDefinitionExternalMetricsDefinition unit(UnitEnum unit) {
    this.unit = unit;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("unit")
  public UnitEnum getUnit() {
    return unit;
  }
  public void setUnit(UnitEnum unit) {
    this.unit = unit;
  }


  /**
   **/
  public EmployeePerformanceExternalMetricsDefinitionExternalMetricsDefinition unitDefinition(String unitDefinition) {
    this.unitDefinition = unitDefinition;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("unitDefinition")
  public String getUnitDefinition() {
    return unitDefinition;
  }
  public void setUnitDefinition(String unitDefinition) {
    this.unitDefinition = unitDefinition;
  }


  /**
   **/
  public EmployeePerformanceExternalMetricsDefinitionExternalMetricsDefinition precision(Integer precision) {
    this.precision = precision;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("precision")
  public Integer getPrecision() {
    return precision;
  }
  public void setPrecision(Integer precision) {
    this.precision = precision;
  }


  /**
   **/
  public EmployeePerformanceExternalMetricsDefinitionExternalMetricsDefinition defaultObjectiveType(DefaultObjectiveTypeEnum defaultObjectiveType) {
    this.defaultObjectiveType = defaultObjectiveType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("defaultObjectiveType")
  public DefaultObjectiveTypeEnum getDefaultObjectiveType() {
    return defaultObjectiveType;
  }
  public void setDefaultObjectiveType(DefaultObjectiveTypeEnum defaultObjectiveType) {
    this.defaultObjectiveType = defaultObjectiveType;
  }


  /**
   **/
  public EmployeePerformanceExternalMetricsDefinitionExternalMetricsDefinition retentionMonths(Integer retentionMonths) {
    this.retentionMonths = retentionMonths;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("retentionMonths")
  public Integer getRetentionMonths() {
    return retentionMonths;
  }
  public void setRetentionMonths(Integer retentionMonths) {
    this.retentionMonths = retentionMonths;
  }


  /**
   **/
  public EmployeePerformanceExternalMetricsDefinitionExternalMetricsDefinition enabled(Boolean enabled) {
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
  public EmployeePerformanceExternalMetricsDefinitionExternalMetricsDefinition inUse(Boolean inUse) {
    this.inUse = inUse;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("inUse")
  public Boolean getInUse() {
    return inUse;
  }
  public void setInUse(Boolean inUse) {
    this.inUse = inUse;
  }


  /**
   **/
  public EmployeePerformanceExternalMetricsDefinitionExternalMetricsDefinition dateLastRefreshed(Date dateLastRefreshed) {
    this.dateLastRefreshed = dateLastRefreshed;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("dateLastRefreshed")
  public Date getDateLastRefreshed() {
    return dateLastRefreshed;
  }
  public void setDateLastRefreshed(Date dateLastRefreshed) {
    this.dateLastRefreshed = dateLastRefreshed;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EmployeePerformanceExternalMetricsDefinitionExternalMetricsDefinition employeePerformanceExternalMetricsDefinitionExternalMetricsDefinition = (EmployeePerformanceExternalMetricsDefinitionExternalMetricsDefinition) o;

    return Objects.equals(this.id, employeePerformanceExternalMetricsDefinitionExternalMetricsDefinition.id) &&
            Objects.equals(this.name, employeePerformanceExternalMetricsDefinitionExternalMetricsDefinition.name) &&
            Objects.equals(this.unit, employeePerformanceExternalMetricsDefinitionExternalMetricsDefinition.unit) &&
            Objects.equals(this.unitDefinition, employeePerformanceExternalMetricsDefinitionExternalMetricsDefinition.unitDefinition) &&
            Objects.equals(this.precision, employeePerformanceExternalMetricsDefinitionExternalMetricsDefinition.precision) &&
            Objects.equals(this.defaultObjectiveType, employeePerformanceExternalMetricsDefinitionExternalMetricsDefinition.defaultObjectiveType) &&
            Objects.equals(this.retentionMonths, employeePerformanceExternalMetricsDefinitionExternalMetricsDefinition.retentionMonths) &&
            Objects.equals(this.enabled, employeePerformanceExternalMetricsDefinitionExternalMetricsDefinition.enabled) &&
            Objects.equals(this.inUse, employeePerformanceExternalMetricsDefinitionExternalMetricsDefinition.inUse) &&
            Objects.equals(this.dateLastRefreshed, employeePerformanceExternalMetricsDefinitionExternalMetricsDefinition.dateLastRefreshed);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, unit, unitDefinition, precision, defaultObjectiveType, retentionMonths, enabled, inUse, dateLastRefreshed);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmployeePerformanceExternalMetricsDefinitionExternalMetricsDefinition {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    unit: ").append(toIndentedString(unit)).append("\n");
    sb.append("    unitDefinition: ").append(toIndentedString(unitDefinition)).append("\n");
    sb.append("    precision: ").append(toIndentedString(precision)).append("\n");
    sb.append("    defaultObjectiveType: ").append(toIndentedString(defaultObjectiveType)).append("\n");
    sb.append("    retentionMonths: ").append(toIndentedString(retentionMonths)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    inUse: ").append(toIndentedString(inUse)).append("\n");
    sb.append("    dateLastRefreshed: ").append(toIndentedString(dateLastRefreshed)).append("\n");
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

