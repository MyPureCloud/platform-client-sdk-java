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
import com.mypurecloud.sdk.v2.model.WrapUpCodeConfig;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * CreateKpiRequest
 */

public class CreateKpiRequest  implements Serializable {
  
  private String name = null;
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
   * The type of the Key Performance Indicator.
   */
 @JsonDeserialize(using = KpiTypeEnumDeserializer.class)
  public enum KpiTypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    SALESCONVERSION("SalesConversion"),
    CHURN("Churn"),
    RETENTION("Retention"),
    SALESVALUE("SalesValue");

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
  private WrapUpCodeConfig wrapUpCodeConfig = null;

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
   * The source of the Key Performance Indicator.
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

  public CreateKpiRequest() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * The name of the Key Performance Indicator.
   **/
  public CreateKpiRequest name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The name of the Key Performance Indicator.")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }


  /**
   * The description of the Key Performance Indicator.
   **/
  public CreateKpiRequest description(String description) {
    this.description = description;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The description of the Key Performance Indicator.")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }


  /**
   * The type of the Key Performance Indicator.
   **/
  public CreateKpiRequest kpiType(KpiTypeEnum kpiType) {
    this.kpiType = kpiType;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The type of the Key Performance Indicator.")
  @JsonProperty("kpiType")
  public KpiTypeEnum getKpiType() {
    return kpiType;
  }
  public void setKpiType(KpiTypeEnum kpiType) {
    this.kpiType = kpiType;
  }


  /**
   * Defines what wrap up codes are mapped to Key Performance Indicator.
   **/
  public CreateKpiRequest wrapUpCodeConfig(WrapUpCodeConfig wrapUpCodeConfig) {
    this.wrapUpCodeConfig = wrapUpCodeConfig;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Defines what wrap up codes are mapped to Key Performance Indicator.")
  @JsonProperty("wrapUpCodeConfig")
  public WrapUpCodeConfig getWrapUpCodeConfig() {
    return wrapUpCodeConfig;
  }
  public void setWrapUpCodeConfig(WrapUpCodeConfig wrapUpCodeConfig) {
    this.wrapUpCodeConfig = wrapUpCodeConfig;
  }


  /**
   * The source of the Key Performance Indicator.
   **/
  public CreateKpiRequest source(SourceEnum source) {
    this.source = source;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The source of the Key Performance Indicator.")
  @JsonProperty("source")
  public SourceEnum getSource() {
    return source;
  }
  public void setSource(SourceEnum source) {
    this.source = source;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateKpiRequest createKpiRequest = (CreateKpiRequest) o;

    return Objects.equals(this.name, createKpiRequest.name) &&
            Objects.equals(this.description, createKpiRequest.description) &&
            Objects.equals(this.kpiType, createKpiRequest.kpiType) &&
            Objects.equals(this.wrapUpCodeConfig, createKpiRequest.wrapUpCodeConfig) &&
            Objects.equals(this.source, createKpiRequest.source);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, description, kpiType, wrapUpCodeConfig, source);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateKpiRequest {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    kpiType: ").append(toIndentedString(kpiType)).append("\n");
    sb.append("    wrapUpCodeConfig: ").append(toIndentedString(wrapUpCodeConfig)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
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

