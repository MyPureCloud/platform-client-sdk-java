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
 * ContactColumnConditionSettings
 */

public class ContactColumnConditionSettings  implements Serializable {
  
  private String columnName = null;

  private static class OperatorEnumDeserializer extends StdDeserializer<OperatorEnum> {
    public OperatorEnumDeserializer() {
      super(OperatorEnumDeserializer.class);
    }

    @Override
    public OperatorEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return OperatorEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The operator to use when comparing values.
   */
 @JsonDeserialize(using = OperatorEnumDeserializer.class)
  public enum OperatorEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    EQUALS("Equals"),
    LESSTHAN("LessThan"),
    LESSTHANEQUALS("LessThanEquals"),
    GREATERTHAN("GreaterThan"),
    GREATERTHANEQUALS("GreaterThanEquals"),
    CONTAINS("Contains"),
    BEGINSWITH("BeginsWith"),
    ENDSWITH("EndsWith"),
    BEFORE("Before"),
    AFTER("After");

    private String value;

    OperatorEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static OperatorEnum fromString(String key) {
      if (key == null) return null;

      for (OperatorEnum value : OperatorEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return OperatorEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private OperatorEnum operator = null;
  private String value = null;

  private static class ValueTypeEnumDeserializer extends StdDeserializer<ValueTypeEnum> {
    public ValueTypeEnumDeserializer() {
      super(ValueTypeEnumDeserializer.class);
    }

    @Override
    public ValueTypeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return ValueTypeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The data type the value should be treated as.
   */
 @JsonDeserialize(using = ValueTypeEnumDeserializer.class)
  public enum ValueTypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    DATETIME("DateTime"),
    NUMERIC("Numeric"),
    PERIOD("Period"),
    STRING("String");

    private String value;

    ValueTypeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static ValueTypeEnum fromString(String key) {
      if (key == null) return null;

      for (ValueTypeEnum value : ValueTypeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return ValueTypeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private ValueTypeEnum valueType = null;

  
  /**
   * The name of the contact list column to evaluate.
   **/
  public ContactColumnConditionSettings columnName(String columnName) {
    this.columnName = columnName;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The name of the contact list column to evaluate.")
  @JsonProperty("columnName")
  public String getColumnName() {
    return columnName;
  }
  public void setColumnName(String columnName) {
    this.columnName = columnName;
  }


  /**
   * The operator to use when comparing values.
   **/
  public ContactColumnConditionSettings operator(OperatorEnum operator) {
    this.operator = operator;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The operator to use when comparing values.")
  @JsonProperty("operator")
  public OperatorEnum getOperator() {
    return operator;
  }
  public void setOperator(OperatorEnum operator) {
    this.operator = operator;
  }


  /**
   * The value to compare against the contact's data.
   **/
  public ContactColumnConditionSettings value(String value) {
    this.value = value;
    return this;
  }
  
  @ApiModelProperty(example = "For Numeric: &#39;1234&#39;, &#39;1234.56&#39;, &#39;$1,234.56&#39;. For DateTime: &#39;2022-01-01T12:01:23.456-0000&#39;. For Period: &#39;P1DT1H1M&#39;. ", required = true, value = "The value to compare against the contact's data.")
  @JsonProperty("value")
  public String getValue() {
    return value;
  }
  public void setValue(String value) {
    this.value = value;
  }


  /**
   * The data type the value should be treated as.
   **/
  public ContactColumnConditionSettings valueType(ValueTypeEnum valueType) {
    this.valueType = valueType;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The data type the value should be treated as.")
  @JsonProperty("valueType")
  public ValueTypeEnum getValueType() {
    return valueType;
  }
  public void setValueType(ValueTypeEnum valueType) {
    this.valueType = valueType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContactColumnConditionSettings contactColumnConditionSettings = (ContactColumnConditionSettings) o;

    return Objects.equals(this.columnName, contactColumnConditionSettings.columnName) &&
            Objects.equals(this.operator, contactColumnConditionSettings.operator) &&
            Objects.equals(this.value, contactColumnConditionSettings.value) &&
            Objects.equals(this.valueType, contactColumnConditionSettings.valueType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(columnName, operator, value, valueType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContactColumnConditionSettings {\n");
    
    sb.append("    columnName: ").append(toIndentedString(columnName)).append("\n");
    sb.append("    operator: ").append(toIndentedString(operator)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    valueType: ").append(toIndentedString(valueType)).append("\n");
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

