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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * Check
 */

public class Check  implements Serializable {
  

  private static class ResultEnumDeserializer extends StdDeserializer<ResultEnum> {
    public ResultEnumDeserializer() {
      super(ResultEnumDeserializer.class);
    }

    @Override
    public ResultEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return ResultEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The result of a check executed. This indicates if the check was successful or not.
   */
 @JsonDeserialize(using = ResultEnumDeserializer.class)
  public enum ResultEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    PASSED("Passed"),
    FAILED("Failed"),
    UNKNOWN("Unknown"),
    SKIPPED("Skipped"),
    ERROR("Error");

    private String value;

    ResultEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static ResultEnum fromString(String key) {
      if (key == null) return null;

      for (ResultEnum value : ResultEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return ResultEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private ResultEnum result = null;

  private static class TypeEnumDeserializer extends StdDeserializer<TypeEnum> {
    public TypeEnumDeserializer() {
      super(TypeEnumDeserializer.class);
    }

    @Override
    public TypeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return TypeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The type of check executed.
   */
 @JsonDeserialize(using = TypeEnumDeserializer.class)
  public enum TypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    HANDLETIMEVALUE("HandleTimeValue"),
    TRANSFERRATEVALUE("TransferRateValue"),
    INTERACTIONVOLUME("InteractionVolume"),
    USERVARIANCE("UserVariance"),
    DATACOVERAGE("DataCoverage"),
    MODELQUALITY("ModelQuality");

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

  
  @ApiModelProperty(example = "null", value = "The result of a check executed. This indicates if the check was successful or not.")
  @JsonProperty("result")
  public ResultEnum getResult() {
    return result;
  }

  
  @ApiModelProperty(example = "null", value = "The type of check executed.")
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Check check = (Check) o;
    return Objects.equals(this.result, check.result) &&
        Objects.equals(this.type, check.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(result, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Check {\n");
    
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

