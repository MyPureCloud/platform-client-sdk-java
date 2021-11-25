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
import com.mypurecloud.sdk.v2.model.AddressableEntityRef;
import com.mypurecloud.sdk.v2.model.PerformanceProfile;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.LocalDate;
import java.util.Date;

import java.io.Serializable;
/**
 * Metrics
 */

public class Metrics  implements Serializable {
  
  private String id = null;
  private String name = null;
  private Integer order = null;
  private String metricDefinitionName = null;
  private String metricDefinitionId = null;
  private String externalMetricDefinitionId = null;

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
   * Corresponding unit type for this metric
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
  private Boolean enabled = null;
  private String templateName = null;
  private Integer maxPoints = null;
  private String performanceProfileId = null;
  private AddressableEntityRef linkedMetric = null;
  private Date dateCreated = null;
  private LocalDate dateUnlinked = null;
  private PerformanceProfile sourcePerformanceProfile = null;
  private String unitDefinition = null;
  private Integer precision = null;
  private String selfUri = null;

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  
  /**
   **/
  public Metrics name(String name) {
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
   * The order of metric within a performance profile
   **/
  public Metrics order(Integer order) {
    this.order = order;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The order of metric within a performance profile")
  @JsonProperty("order")
  public Integer getOrder() {
    return order;
  }
  public void setOrder(Integer order) {
    this.order = order;
  }

  
  /**
   * The name of associated metric definition
   **/
  public Metrics metricDefinitionName(String metricDefinitionName) {
    this.metricDefinitionName = metricDefinitionName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The name of associated metric definition")
  @JsonProperty("metricDefinitionName")
  public String getMetricDefinitionName() {
    return metricDefinitionName;
  }
  public void setMetricDefinitionName(String metricDefinitionName) {
    this.metricDefinitionName = metricDefinitionName;
  }

  
  /**
   * The id of associated metric definition
   **/
  public Metrics metricDefinitionId(String metricDefinitionId) {
    this.metricDefinitionId = metricDefinitionId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The id of associated metric definition")
  @JsonProperty("metricDefinitionId")
  public String getMetricDefinitionId() {
    return metricDefinitionId;
  }
  public void setMetricDefinitionId(String metricDefinitionId) {
    this.metricDefinitionId = metricDefinitionId;
  }

  
  /**
   * The id of associated external metric definition
   **/
  public Metrics externalMetricDefinitionId(String externalMetricDefinitionId) {
    this.externalMetricDefinitionId = externalMetricDefinitionId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The id of associated external metric definition")
  @JsonProperty("externalMetricDefinitionId")
  public String getExternalMetricDefinitionId() {
    return externalMetricDefinitionId;
  }
  public void setExternalMetricDefinitionId(String externalMetricDefinitionId) {
    this.externalMetricDefinitionId = externalMetricDefinitionId;
  }

  
  /**
   * Corresponding unit type for this metric
   **/
  public Metrics unitType(UnitTypeEnum unitType) {
    this.unitType = unitType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Corresponding unit type for this metric")
  @JsonProperty("unitType")
  public UnitTypeEnum getUnitType() {
    return unitType;
  }
  public void setUnitType(UnitTypeEnum unitType) {
    this.unitType = unitType;
  }

  
  /**
   * A flag for whether this metric is enabled for a performance profile
   **/
  public Metrics enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A flag for whether this metric is enabled for a performance profile")
  @JsonProperty("enabled")
  public Boolean getEnabled() {
    return enabled;
  }
  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

  
  /**
   * The name of associated objective template
   **/
  public Metrics templateName(String templateName) {
    this.templateName = templateName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The name of associated objective template")
  @JsonProperty("templateName")
  public String getTemplateName() {
    return templateName;
  }
  public void setTemplateName(String templateName) {
    this.templateName = templateName;
  }

  
  /**
   * Achievable maximum points for this metric
   **/
  public Metrics maxPoints(Integer maxPoints) {
    this.maxPoints = maxPoints;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Achievable maximum points for this metric")
  @JsonProperty("maxPoints")
  public Integer getMaxPoints() {
    return maxPoints;
  }
  public void setMaxPoints(Integer maxPoints) {
    this.maxPoints = maxPoints;
  }

  
  /**
   * Performance profile id of this metric
   **/
  public Metrics performanceProfileId(String performanceProfileId) {
    this.performanceProfileId = performanceProfileId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Performance profile id of this metric")
  @JsonProperty("performanceProfileId")
  public String getPerformanceProfileId() {
    return performanceProfileId;
  }
  public void setPerformanceProfileId(String performanceProfileId) {
    this.performanceProfileId = performanceProfileId;
  }

  
  @ApiModelProperty(example = "null", value = "The linked metric entity reference")
  @JsonProperty("linkedMetric")
  public AddressableEntityRef getLinkedMetric() {
    return linkedMetric;
  }

  
  @ApiModelProperty(example = "null", value = "The created date of this metric. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateCreated")
  public Date getDateCreated() {
    return dateCreated;
  }

  
  @ApiModelProperty(example = "null", value = "The unlinked workday for this metric if this metric was ever unlinked. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd")
  @JsonProperty("dateUnlinked")
  public LocalDate getDateUnlinked() {
    return dateUnlinked;
  }

  
  @ApiModelProperty(example = "null", value = "The source performance profile when this metric is linked")
  @JsonProperty("sourcePerformanceProfile")
  public PerformanceProfile getSourcePerformanceProfile() {
    return sourcePerformanceProfile;
  }

  
  @ApiModelProperty(example = "null", value = "Unit definition of linked external metric")
  @JsonProperty("unitDefinition")
  public String getUnitDefinition() {
    return unitDefinition;
  }

  
  @ApiModelProperty(example = "null", value = "Precision of linked external metric")
  @JsonProperty("precision")
  public Integer getPrecision() {
    return precision;
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
    Metrics metrics = (Metrics) o;
    return Objects.equals(this.id, metrics.id) &&
        Objects.equals(this.name, metrics.name) &&
        Objects.equals(this.order, metrics.order) &&
        Objects.equals(this.metricDefinitionName, metrics.metricDefinitionName) &&
        Objects.equals(this.metricDefinitionId, metrics.metricDefinitionId) &&
        Objects.equals(this.externalMetricDefinitionId, metrics.externalMetricDefinitionId) &&
        Objects.equals(this.unitType, metrics.unitType) &&
        Objects.equals(this.enabled, metrics.enabled) &&
        Objects.equals(this.templateName, metrics.templateName) &&
        Objects.equals(this.maxPoints, metrics.maxPoints) &&
        Objects.equals(this.performanceProfileId, metrics.performanceProfileId) &&
        Objects.equals(this.linkedMetric, metrics.linkedMetric) &&
        Objects.equals(this.dateCreated, metrics.dateCreated) &&
        Objects.equals(this.dateUnlinked, metrics.dateUnlinked) &&
        Objects.equals(this.sourcePerformanceProfile, metrics.sourcePerformanceProfile) &&
        Objects.equals(this.unitDefinition, metrics.unitDefinition) &&
        Objects.equals(this.precision, metrics.precision) &&
        Objects.equals(this.selfUri, metrics.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, order, metricDefinitionName, metricDefinitionId, externalMetricDefinitionId, unitType, enabled, templateName, maxPoints, performanceProfileId, linkedMetric, dateCreated, dateUnlinked, sourcePerformanceProfile, unitDefinition, precision, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Metrics {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
    sb.append("    metricDefinitionName: ").append(toIndentedString(metricDefinitionName)).append("\n");
    sb.append("    metricDefinitionId: ").append(toIndentedString(metricDefinitionId)).append("\n");
    sb.append("    externalMetricDefinitionId: ").append(toIndentedString(externalMetricDefinitionId)).append("\n");
    sb.append("    unitType: ").append(toIndentedString(unitType)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    templateName: ").append(toIndentedString(templateName)).append("\n");
    sb.append("    maxPoints: ").append(toIndentedString(maxPoints)).append("\n");
    sb.append("    performanceProfileId: ").append(toIndentedString(performanceProfileId)).append("\n");
    sb.append("    linkedMetric: ").append(toIndentedString(linkedMetric)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    dateUnlinked: ").append(toIndentedString(dateUnlinked)).append("\n");
    sb.append("    sourcePerformanceProfile: ").append(toIndentedString(sourcePerformanceProfile)).append("\n");
    sb.append("    unitDefinition: ").append(toIndentedString(unitDefinition)).append("\n");
    sb.append("    precision: ").append(toIndentedString(precision)).append("\n");
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

