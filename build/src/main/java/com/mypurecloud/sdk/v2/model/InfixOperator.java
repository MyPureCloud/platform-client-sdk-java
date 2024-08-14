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
import com.mypurecloud.sdk.v2.model.OperatorPosition;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * InfixOperator
 */

public class InfixOperator  implements Serializable {
  

  private static class OperatorTypeEnumDeserializer extends StdDeserializer<OperatorTypeEnum> {
    public OperatorTypeEnumDeserializer() {
      super(OperatorTypeEnumDeserializer.class);
    }

    @Override
    public OperatorTypeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return OperatorTypeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The logical operation that is applied on the operand against the following operand
   */
 @JsonDeserialize(using = OperatorTypeEnumDeserializer.class)
  public enum OperatorTypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    OR("Or"),
    AND("And"),
    NEAR("Near");

    private String value;

    OperatorTypeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static OperatorTypeEnum fromString(String key) {
      if (key == null) return null;

      for (OperatorTypeEnum value : OperatorTypeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return OperatorTypeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private OperatorTypeEnum operatorType = null;
  private OperatorPosition operatorPosition = null;

  
  /**
   * The logical operation that is applied on the operand against the following operand
   **/
  public InfixOperator operatorType(OperatorTypeEnum operatorType) {
    this.operatorType = operatorType;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The logical operation that is applied on the operand against the following operand")
  @JsonProperty("operatorType")
  public OperatorTypeEnum getOperatorType() {
    return operatorType;
  }
  public void setOperatorType(OperatorTypeEnum operatorType) {
    this.operatorType = operatorType;
  }


  /**
   * Dictates when the following operand should occur relative to current operand
   **/
  public InfixOperator operatorPosition(OperatorPosition operatorPosition) {
    this.operatorPosition = operatorPosition;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Dictates when the following operand should occur relative to current operand")
  @JsonProperty("operatorPosition")
  public OperatorPosition getOperatorPosition() {
    return operatorPosition;
  }
  public void setOperatorPosition(OperatorPosition operatorPosition) {
    this.operatorPosition = operatorPosition;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InfixOperator infixOperator = (InfixOperator) o;

    return Objects.equals(this.operatorType, infixOperator.operatorType) &&
            Objects.equals(this.operatorPosition, infixOperator.operatorPosition);
  }

  @Override
  public int hashCode() {
    return Objects.hash(operatorType, operatorPosition);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InfixOperator {\n");
    
    sb.append("    operatorType: ").append(toIndentedString(operatorType)).append("\n");
    sb.append("    operatorPosition: ").append(toIndentedString(operatorPosition)).append("\n");
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

