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

import java.io.Serializable;
/**
 * ExternalMetricDefinitionUpdateRequest
 */

public class ExternalMetricDefinitionUpdateRequest  implements Serializable {
  
  private String name = null;
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
  private Boolean enabled = null;

  public ExternalMetricDefinitionUpdateRequest() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * The name of the External Metric Definition
   **/
  public ExternalMetricDefinitionUpdateRequest name(String name) {
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
   * The decimal precision of the External Metric Definition. Must be at least 0 and at most 5
   * minimum: 0
   * maximum: 5
   **/
  public ExternalMetricDefinitionUpdateRequest precision(Integer precision) {
    this.precision = precision;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The decimal precision of the External Metric Definition. Must be at least 0 and at most 5")
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
  public ExternalMetricDefinitionUpdateRequest defaultObjectiveType(DefaultObjectiveTypeEnum defaultObjectiveType) {
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
   * True if the External Metric Definition is enabled
   **/
  public ExternalMetricDefinitionUpdateRequest enabled(Boolean enabled) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExternalMetricDefinitionUpdateRequest externalMetricDefinitionUpdateRequest = (ExternalMetricDefinitionUpdateRequest) o;

    return Objects.equals(this.name, externalMetricDefinitionUpdateRequest.name) &&
            Objects.equals(this.precision, externalMetricDefinitionUpdateRequest.precision) &&
            Objects.equals(this.defaultObjectiveType, externalMetricDefinitionUpdateRequest.defaultObjectiveType) &&
            Objects.equals(this.enabled, externalMetricDefinitionUpdateRequest.enabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, precision, defaultObjectiveType, enabled);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExternalMetricDefinitionUpdateRequest {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    precision: ").append(toIndentedString(precision)).append("\n");
    sb.append("    defaultObjectiveType: ").append(toIndentedString(defaultObjectiveType)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
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

