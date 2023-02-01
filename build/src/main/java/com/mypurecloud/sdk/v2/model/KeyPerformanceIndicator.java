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
import com.mypurecloud.sdk.v2.model.OutcomeConfig;
import com.mypurecloud.sdk.v2.model.WrapUpCodeConfig;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

import java.io.Serializable;
/**
 * KeyPerformanceIndicator
 */

public class KeyPerformanceIndicator  implements Serializable {
  
  private String id = null;
  private String name = null;

  private static class OptimizationTypeEnumDeserializer extends StdDeserializer<OptimizationTypeEnum> {
    public OptimizationTypeEnumDeserializer() {
      super(OptimizationTypeEnumDeserializer.class);
    }

    @Override
    public OptimizationTypeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return OptimizationTypeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The optimization type of the Key Performance Indicator.
   */
 @JsonDeserialize(using = OptimizationTypeEnumDeserializer.class)
  public enum OptimizationTypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    MAXIMIZATION("Maximization"),
    MINIMIZATION("Minimization");

    private String value;

    OptimizationTypeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static OptimizationTypeEnum fromString(String key) {
      if (key == null) return null;

      for (OptimizationTypeEnum value : OptimizationTypeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return OptimizationTypeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private OptimizationTypeEnum optimizationType = null;
  private Date dateCreated = null;
  private Date dateModified = null;
  private String description = null;

  private static class KpiTypeEnumDeserializer extends StdDeserializer<KpiTypeEnum> {
    public KpiTypeEnumDeserializer() {
      super(KpiTypeEnumDeserializer.class);
    }

    @Override
    public KpiTypeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return KpiTypeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The type of Key Performance Indicator.
   */
 @JsonDeserialize(using = KpiTypeEnumDeserializer.class)
  public enum KpiTypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    SALESCONVERSION("SalesConversion"),
    CHURN("Churn"),
    RETENTION("Retention"),
    SALESVALUE("SalesValue"),
    HANDLETIME("HandleTime"),
    NUMBEROFTRANSFERS("NumberOfTransfers");

    private String value;

    KpiTypeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static KpiTypeEnum fromString(String key) {
      if (key == null) return null;

      for (KpiTypeEnum value : KpiTypeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return KpiTypeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private KpiTypeEnum kpiType = null;

  private static class SourceEnumDeserializer extends StdDeserializer<SourceEnum> {
    public SourceEnumDeserializer() {
      super(SourceEnumDeserializer.class);
    }

    @Override
    public SourceEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return SourceEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Source of values for Key Performance Indicator.
   */
 @JsonDeserialize(using = SourceEnumDeserializer.class)
  public enum SourceEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    WRAPUPCODE("WrapUpCode"),
    OUTCOME("Outcome"),
    NONE("None");

    private String value;

    SourceEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static SourceEnum fromString(String key) {
      if (key == null) return null;

      for (SourceEnum value : SourceEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return SourceEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private SourceEnum source = null;
  private WrapUpCodeConfig wrapUpCodeConfig = null;
  private OutcomeConfig outcomeConfig = null;

  private static class StatusEnumDeserializer extends StdDeserializer<StatusEnum> {
    public StatusEnumDeserializer() {
      super(StatusEnumDeserializer.class);
    }

    @Override
    public StatusEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return StatusEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The status of the Key Performance Indicator.
   */
 @JsonDeserialize(using = StatusEnumDeserializer.class)
  public enum StatusEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    ENABLED("Enabled"),
    DISABLED("Disabled");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static StatusEnum fromString(String key) {
      if (key == null) return null;

      for (StatusEnum value : StatusEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return StatusEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private StatusEnum status = null;

  private static class KpiGroupEnumDeserializer extends StdDeserializer<KpiGroupEnum> {
    public KpiGroupEnumDeserializer() {
      super(KpiGroupEnumDeserializer.class);
    }

    @Override
    public KpiGroupEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return KpiGroupEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The group the Key Performance Indicator belongs to.
   */
 @JsonDeserialize(using = KpiGroupEnumDeserializer.class)
  public enum KpiGroupEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    STANDARD("Standard"),
    CUSTOM("Custom");

    private String value;

    KpiGroupEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static KpiGroupEnum fromString(String key) {
      if (key == null) return null;

      for (KpiGroupEnum value : KpiGroupEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return KpiGroupEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private KpiGroupEnum kpiGroup = null;
  private String selfUri = null;

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }


  @ApiModelProperty(example = "null", value = "The name of the Key Performance Indicator.")
  @JsonProperty("name")
  public String getName() {
    return name;
  }


  @ApiModelProperty(example = "null", value = "The optimization type of the Key Performance Indicator.")
  @JsonProperty("optimizationType")
  public OptimizationTypeEnum getOptimizationType() {
    return optimizationType;
  }


  @ApiModelProperty(example = "null", value = "DateTime indicating when the Key Performance Indicator was created. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateCreated")
  public Date getDateCreated() {
    return dateCreated;
  }


  @ApiModelProperty(example = "null", value = "DateTime indicating when the Key Performance Indicator was modified. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateModified")
  public Date getDateModified() {
    return dateModified;
  }


  @ApiModelProperty(example = "null", value = "The description of the Key Performance Indicator.")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }


  @ApiModelProperty(example = "null", value = "The type of Key Performance Indicator.")
  @JsonProperty("kpiType")
  public KpiTypeEnum getKpiType() {
    return kpiType;
  }


  @ApiModelProperty(example = "null", value = "Source of values for Key Performance Indicator.")
  @JsonProperty("source")
  public SourceEnum getSource() {
    return source;
  }


  @ApiModelProperty(example = "null", value = "Defines what wrap up codes are mapped to Key Performance Indicator.")
  @JsonProperty("wrapUpCodeConfig")
  public WrapUpCodeConfig getWrapUpCodeConfig() {
    return wrapUpCodeConfig;
  }


  @ApiModelProperty(example = "null", value = "Defines what outcome ids are mapped to Key Performance Indicator.")
  @JsonProperty("outcomeConfig")
  public OutcomeConfig getOutcomeConfig() {
    return outcomeConfig;
  }


  @ApiModelProperty(example = "null", value = "The status of the Key Performance Indicator.")
  @JsonProperty("status")
  public StatusEnum getStatus() {
    return status;
  }


  @ApiModelProperty(example = "null", value = "The group the Key Performance Indicator belongs to.")
  @JsonProperty("kpiGroup")
  public KpiGroupEnum getKpiGroup() {
    return kpiGroup;
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
    KeyPerformanceIndicator keyPerformanceIndicator = (KeyPerformanceIndicator) o;

    return Objects.equals(this.id, keyPerformanceIndicator.id) &&
            Objects.equals(this.name, keyPerformanceIndicator.name) &&
            Objects.equals(this.optimizationType, keyPerformanceIndicator.optimizationType) &&
            Objects.equals(this.dateCreated, keyPerformanceIndicator.dateCreated) &&
            Objects.equals(this.dateModified, keyPerformanceIndicator.dateModified) &&
            Objects.equals(this.description, keyPerformanceIndicator.description) &&
            Objects.equals(this.kpiType, keyPerformanceIndicator.kpiType) &&
            Objects.equals(this.source, keyPerformanceIndicator.source) &&
            Objects.equals(this.wrapUpCodeConfig, keyPerformanceIndicator.wrapUpCodeConfig) &&
            Objects.equals(this.outcomeConfig, keyPerformanceIndicator.outcomeConfig) &&
            Objects.equals(this.status, keyPerformanceIndicator.status) &&
            Objects.equals(this.kpiGroup, keyPerformanceIndicator.kpiGroup) &&
            Objects.equals(this.selfUri, keyPerformanceIndicator.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, optimizationType, dateCreated, dateModified, description, kpiType, source, wrapUpCodeConfig, outcomeConfig, status, kpiGroup, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KeyPerformanceIndicator {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    optimizationType: ").append(toIndentedString(optimizationType)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    dateModified: ").append(toIndentedString(dateModified)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    kpiType: ").append(toIndentedString(kpiType)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    wrapUpCodeConfig: ").append(toIndentedString(wrapUpCodeConfig)).append("\n");
    sb.append("    outcomeConfig: ").append(toIndentedString(outcomeConfig)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    kpiGroup: ").append(toIndentedString(kpiGroup)).append("\n");
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

