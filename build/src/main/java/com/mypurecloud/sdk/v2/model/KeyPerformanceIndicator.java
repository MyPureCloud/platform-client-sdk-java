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
            Objects.equals(this.optimizationType, keyPerformanceIndicator.optimizationType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, optimizationType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KeyPerformanceIndicator {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    optimizationType: ").append(toIndentedString(optimizationType)).append("\n");
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

