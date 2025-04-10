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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

import java.io.Serializable;
/**
 * ExternalMetricDefinition
 */

public class ExternalMetricDefinition  implements Serializable {
  
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
   * The unit of the External Metric Definition
   */
 @JsonDeserialize(using = UnitEnumDeserializer.class)
  public enum UnitEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    SECONDS("Seconds"),
    PERCENT("Percent"),
    NUMBER("Number"),
    CURRENCY("Currency");

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
   * The default objective type of the External Metric Definition
   */
 @JsonDeserialize(using = DefaultObjectiveTypeEnumDeserializer.class)
  public enum DefaultObjectiveTypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    HIGHERISBETTER("HigherIsBetter"),
    LOWERISBETTER("LowerIsBetter"),
    TARGETAREA("TargetArea");

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
  private String selfUri = null;

  public ExternalMetricDefinition() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }


  /**
   * The name of the External Metric Definition
   **/
  public ExternalMetricDefinition name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The name of the External Metric Definition")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }


  /**
   * The unit of the External Metric Definition
   **/
  public ExternalMetricDefinition unit(UnitEnum unit) {
    this.unit = unit;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The unit of the External Metric Definition")
  @JsonProperty("unit")
  public UnitEnum getUnit() {
    return unit;
  }
  public void setUnit(UnitEnum unit) {
    this.unit = unit;
  }


  /**
   * The unit definition of the External Metric Definition
   **/
  public ExternalMetricDefinition unitDefinition(String unitDefinition) {
    this.unitDefinition = unitDefinition;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The unit definition of the External Metric Definition")
  @JsonProperty("unitDefinition")
  public String getUnitDefinition() {
    return unitDefinition;
  }
  public void setUnitDefinition(String unitDefinition) {
    this.unitDefinition = unitDefinition;
  }


  /**
   * The decimal precision of the External Metric Definition
   **/
  public ExternalMetricDefinition precision(Integer precision) {
    this.precision = precision;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The decimal precision of the External Metric Definition")
  @JsonProperty("precision")
  public Integer getPrecision() {
    return precision;
  }
  public void setPrecision(Integer precision) {
    this.precision = precision;
  }


  /**
   * The default objective type of the External Metric Definition
   **/
  public ExternalMetricDefinition defaultObjectiveType(DefaultObjectiveTypeEnum defaultObjectiveType) {
    this.defaultObjectiveType = defaultObjectiveType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The default objective type of the External Metric Definition")
  @JsonProperty("defaultObjectiveType")
  public DefaultObjectiveTypeEnum getDefaultObjectiveType() {
    return defaultObjectiveType;
  }
  public void setDefaultObjectiveType(DefaultObjectiveTypeEnum defaultObjectiveType) {
    this.defaultObjectiveType = defaultObjectiveType;
  }


  /**
   * The retention in months of the External Metric Definition
   **/
  public ExternalMetricDefinition retentionMonths(Integer retentionMonths) {
    this.retentionMonths = retentionMonths;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The retention in months of the External Metric Definition")
  @JsonProperty("retentionMonths")
  public Integer getRetentionMonths() {
    return retentionMonths;
  }
  public void setRetentionMonths(Integer retentionMonths) {
    this.retentionMonths = retentionMonths;
  }


  /**
   * True if the External Metric Definition is enabled
   **/
  public ExternalMetricDefinition enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "True if the External Metric Definition is enabled")
  @JsonProperty("enabled")
  public Boolean getEnabled() {
    return enabled;
  }
  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }


  @ApiModelProperty(example = "null", value = "True if the External Metric Definition is in use")
  @JsonProperty("inUse")
  public Boolean getInUse() {
    return inUse;
  }


  /**
   * The last date and time that the metric data was refreshed. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public ExternalMetricDefinition dateLastRefreshed(Date dateLastRefreshed) {
    this.dateLastRefreshed = dateLastRefreshed;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The last date and time that the metric data was refreshed. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateLastRefreshed")
  public Date getDateLastRefreshed() {
    return dateLastRefreshed;
  }
  public void setDateLastRefreshed(Date dateLastRefreshed) {
    this.dateLastRefreshed = dateLastRefreshed;
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
    ExternalMetricDefinition externalMetricDefinition = (ExternalMetricDefinition) o;

    return Objects.equals(this.id, externalMetricDefinition.id) &&
            Objects.equals(this.name, externalMetricDefinition.name) &&
            Objects.equals(this.unit, externalMetricDefinition.unit) &&
            Objects.equals(this.unitDefinition, externalMetricDefinition.unitDefinition) &&
            Objects.equals(this.precision, externalMetricDefinition.precision) &&
            Objects.equals(this.defaultObjectiveType, externalMetricDefinition.defaultObjectiveType) &&
            Objects.equals(this.retentionMonths, externalMetricDefinition.retentionMonths) &&
            Objects.equals(this.enabled, externalMetricDefinition.enabled) &&
            Objects.equals(this.inUse, externalMetricDefinition.inUse) &&
            Objects.equals(this.dateLastRefreshed, externalMetricDefinition.dateLastRefreshed) &&
            Objects.equals(this.selfUri, externalMetricDefinition.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, unit, unitDefinition, precision, defaultObjectiveType, retentionMonths, enabled, inUse, dateLastRefreshed, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExternalMetricDefinition {\n");
    
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

