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
 * RowSearchPredicate
 */

public class RowSearchPredicate  implements Serializable {
  
  private String columnId = null;

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
   * The search operator for this predicate
   */
 @JsonDeserialize(using = OperatorEnumDeserializer.class)
  public enum OperatorEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    EQUALS("Equals"),
    STARTSWITH("StartsWith"),
    GREATERTHAN("GreaterThan"),
    GREATERTHANOREQUALS("GreaterThanOrEquals"),
    LESSTHAN("LessThan"),
    LESSTHANOREQUALS("LessThanOrEquals"),
    CONTAINSITEM("ContainsItem");

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

  private static class SpecialEnumDeserializer extends StdDeserializer<SpecialEnum> {
    public SpecialEnumDeserializer() {
      super(SpecialEnumDeserializer.class);
    }

    @Override
    public SpecialEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return SpecialEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The special value that will be searched for in rows. Exactly one of 'value' or 'special' can be used.
   */
 @JsonDeserialize(using = SpecialEnumDeserializer.class)
  public enum SpecialEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    WILDCARD("Wildcard"),
    NULL("Null"),
    EMPTY("Empty"),
    CURRENTTIME("CurrentTime");

    private String value;

    SpecialEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static SpecialEnum fromString(String key) {
      if (key == null) return null;

      for (SpecialEnum value : SpecialEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return SpecialEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private SpecialEnum special = null;

  public RowSearchPredicate() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * The decision table column identifier this predicate applies to
   **/
  public RowSearchPredicate columnId(String columnId) {
    this.columnId = columnId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The decision table column identifier this predicate applies to")
  @JsonProperty("columnId")
  public String getColumnId() {
    return columnId;
  }
  public void setColumnId(String columnId) {
    this.columnId = columnId;
  }


  /**
   * The search operator for this predicate
   **/
  public RowSearchPredicate operator(OperatorEnum operator) {
    this.operator = operator;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The search operator for this predicate")
  @JsonProperty("operator")
  public OperatorEnum getOperator() {
    return operator;
  }
  public void setOperator(OperatorEnum operator) {
    this.operator = operator;
  }


  /**
   * The value that will be searched for in rows. Exactly one of 'value' or 'special' can be used.
   **/
  public RowSearchPredicate value(String value) {
    this.value = value;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The value that will be searched for in rows. Exactly one of 'value' or 'special' can be used.")
  @JsonProperty("value")
  public String getValue() {
    return value;
  }
  public void setValue(String value) {
    this.value = value;
  }


  /**
   * The special value that will be searched for in rows. Exactly one of 'value' or 'special' can be used.
   **/
  public RowSearchPredicate special(SpecialEnum special) {
    this.special = special;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The special value that will be searched for in rows. Exactly one of 'value' or 'special' can be used.")
  @JsonProperty("special")
  public SpecialEnum getSpecial() {
    return special;
  }
  public void setSpecial(SpecialEnum special) {
    this.special = special;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RowSearchPredicate rowSearchPredicate = (RowSearchPredicate) o;

    return Objects.equals(this.columnId, rowSearchPredicate.columnId) &&
            Objects.equals(this.operator, rowSearchPredicate.operator) &&
            Objects.equals(this.value, rowSearchPredicate.value) &&
            Objects.equals(this.special, rowSearchPredicate.special);
  }

  @Override
  public int hashCode() {
    return Objects.hash(columnId, operator, value, special);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RowSearchPredicate {\n");
    
    sb.append("    columnId: ").append(toIndentedString(columnId)).append("\n");
    sb.append("    operator: ").append(toIndentedString(operator)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    special: ").append(toIndentedString(special)).append("\n");
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

