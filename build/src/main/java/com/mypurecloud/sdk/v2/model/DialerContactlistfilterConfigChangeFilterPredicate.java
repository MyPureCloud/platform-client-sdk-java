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
import com.mypurecloud.sdk.v2.model.DialerContactlistfilterConfigChangeFilterRange;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import java.io.Serializable;
/**
 * DialerContactlistfilterConfigChangeFilterPredicate
 */

public class DialerContactlistfilterConfigChangeFilterPredicate  implements Serializable {
  
  private String column = null;

  private static class ColumnTypeEnumDeserializer extends StdDeserializer<ColumnTypeEnum> {
    public ColumnTypeEnumDeserializer() {
      super(ColumnTypeEnumDeserializer.class);
    }

    @Override
    public ColumnTypeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return ColumnTypeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Whether a contact column is numeric or alphabetic
   */
 @JsonDeserialize(using = ColumnTypeEnumDeserializer.class)
  public enum ColumnTypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    NUMERIC("numeric"),
    ALPHABETIC("alphabetic");

    private String value;

    ColumnTypeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static ColumnTypeEnum fromString(String key) {
      if (key == null) return null;

      for (ColumnTypeEnum value : ColumnTypeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return ColumnTypeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private ColumnTypeEnum columnType = null;

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
   * The comparison operator
   */
 @JsonDeserialize(using = OperatorEnumDeserializer.class)
  public enum OperatorEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    EQUALS("EQUALS"),
    LESS_THAN("LESS_THAN"),
    LESS_THAN_EQUALS("LESS_THAN_EQUALS"),
    GREATER_THAN("GREATER_THAN"),
    GREATER_THAN_EQUALS("GREATER_THAN_EQUALS"),
    CONTAINS("CONTAINS"),
    BEGINS_WITH("BEGINS_WITH"),
    ENDS_WITH("ENDS_WITH"),
    BEFORE("BEFORE"),
    AFTER("AFTER"),
    BETWEEN("BETWEEN"),
    IN("IN");

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
  private DialerContactlistfilterConfigChangeFilterRange range = null;
  private Boolean inverted = null;
  private Map<String, Object> additionalProperties = null;

  public DialerContactlistfilterConfigChangeFilterPredicate() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * The contact list column
   **/
  public DialerContactlistfilterConfigChangeFilterPredicate column(String column) {
    this.column = column;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The contact list column")
  @JsonProperty("column")
  public String getColumn() {
    return column;
  }
  public void setColumn(String column) {
    this.column = column;
  }


  /**
   * Whether a contact column is numeric or alphabetic
   **/
  public DialerContactlistfilterConfigChangeFilterPredicate columnType(ColumnTypeEnum columnType) {
    this.columnType = columnType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Whether a contact column is numeric or alphabetic")
  @JsonProperty("columnType")
  public ColumnTypeEnum getColumnType() {
    return columnType;
  }
  public void setColumnType(ColumnTypeEnum columnType) {
    this.columnType = columnType;
  }


  /**
   * The comparison operator
   **/
  public DialerContactlistfilterConfigChangeFilterPredicate operator(OperatorEnum operator) {
    this.operator = operator;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The comparison operator")
  @JsonProperty("operator")
  public OperatorEnum getOperator() {
    return operator;
  }
  public void setOperator(OperatorEnum operator) {
    this.operator = operator;
  }


  /**
   * The value the predicate applies to
   **/
  public DialerContactlistfilterConfigChangeFilterPredicate value(String value) {
    this.value = value;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The value the predicate applies to")
  @JsonProperty("value")
  public String getValue() {
    return value;
  }
  public void setValue(String value) {
    this.value = value;
  }


  /**
   **/
  public DialerContactlistfilterConfigChangeFilterPredicate range(DialerContactlistfilterConfigChangeFilterRange range) {
    this.range = range;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("range")
  public DialerContactlistfilterConfigChangeFilterRange getRange() {
    return range;
  }
  public void setRange(DialerContactlistfilterConfigChangeFilterRange range) {
    this.range = range;
  }


  /**
   * Whether or not to invert to result of evaluating the predicate
   **/
  public DialerContactlistfilterConfigChangeFilterPredicate inverted(Boolean inverted) {
    this.inverted = inverted;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Whether or not to invert to result of evaluating the predicate")
  @JsonProperty("inverted")
  public Boolean getInverted() {
    return inverted;
  }
  public void setInverted(Boolean inverted) {
    this.inverted = inverted;
  }


  /**
   **/
  public DialerContactlistfilterConfigChangeFilterPredicate additionalProperties(Map<String, Object> additionalProperties) {
    this.additionalProperties = additionalProperties;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("additionalProperties")
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }
  public void setAdditionalProperties(Map<String, Object> additionalProperties) {
    this.additionalProperties = additionalProperties;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DialerContactlistfilterConfigChangeFilterPredicate dialerContactlistfilterConfigChangeFilterPredicate = (DialerContactlistfilterConfigChangeFilterPredicate) o;

    return Objects.equals(this.column, dialerContactlistfilterConfigChangeFilterPredicate.column) &&
            Objects.equals(this.columnType, dialerContactlistfilterConfigChangeFilterPredicate.columnType) &&
            Objects.equals(this.operator, dialerContactlistfilterConfigChangeFilterPredicate.operator) &&
            Objects.equals(this.value, dialerContactlistfilterConfigChangeFilterPredicate.value) &&
            Objects.equals(this.range, dialerContactlistfilterConfigChangeFilterPredicate.range) &&
            Objects.equals(this.inverted, dialerContactlistfilterConfigChangeFilterPredicate.inverted) &&
            Objects.equals(this.additionalProperties, dialerContactlistfilterConfigChangeFilterPredicate.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(column, columnType, operator, value, range, inverted, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DialerContactlistfilterConfigChangeFilterPredicate {\n");
    
    sb.append("    column: ").append(toIndentedString(column)).append("\n");
    sb.append("    columnType: ").append(toIndentedString(columnType)).append("\n");
    sb.append("    operator: ").append(toIndentedString(operator)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    range: ").append(toIndentedString(range)).append("\n");
    sb.append("    inverted: ").append(toIndentedString(inverted)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
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

