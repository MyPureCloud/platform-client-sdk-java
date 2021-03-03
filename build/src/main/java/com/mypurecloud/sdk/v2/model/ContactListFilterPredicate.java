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
import com.mypurecloud.sdk.v2.model.ContactListFilterRange;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * ContactListFilterPredicate
 */

public class ContactListFilterPredicate  implements Serializable {
  
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
   * The type of data in the contact column.
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
   * The operator for this ContactListFilterPredicate.
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
  private ContactListFilterRange range = null;
  private Boolean inverted = null;

  
  /**
   * Contact list column from the ContactListFilter's contactList.
   **/
  public ContactListFilterPredicate column(String column) {
    this.column = column;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Contact list column from the ContactListFilter's contactList.")
  @JsonProperty("column")
  public String getColumn() {
    return column;
  }
  public void setColumn(String column) {
    this.column = column;
  }

  
  /**
   * The type of data in the contact column.
   **/
  public ContactListFilterPredicate columnType(ColumnTypeEnum columnType) {
    this.columnType = columnType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The type of data in the contact column.")
  @JsonProperty("columnType")
  public ColumnTypeEnum getColumnType() {
    return columnType;
  }
  public void setColumnType(ColumnTypeEnum columnType) {
    this.columnType = columnType;
  }

  
  /**
   * The operator for this ContactListFilterPredicate.
   **/
  public ContactListFilterPredicate operator(OperatorEnum operator) {
    this.operator = operator;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The operator for this ContactListFilterPredicate.")
  @JsonProperty("operator")
  public OperatorEnum getOperator() {
    return operator;
  }
  public void setOperator(OperatorEnum operator) {
    this.operator = operator;
  }

  
  /**
   * Value with which to compare the contact's data. This could be text, a number, or a relative time. A value for relative time should follow the format PxxDTyyHzzM, where xx, yy, and zz specify the days, hours and minutes. For example, a value of P01DT08H30M corresponds to 1 day, 8 hours, and 30 minutes from now. To specify a time in the past, include a negative sign before each numeric value. For example, a value of P-01DT-08H-30M corresponds to 1 day, 8 hours, and 30 minutes in the past. You can also do things like P01DT00H-30M, which would correspond to 23 hours and 30 minutes from now (1 day - 30 minutes).
   **/
  public ContactListFilterPredicate value(String value) {
    this.value = value;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Value with which to compare the contact's data. This could be text, a number, or a relative time. A value for relative time should follow the format PxxDTyyHzzM, where xx, yy, and zz specify the days, hours and minutes. For example, a value of P01DT08H30M corresponds to 1 day, 8 hours, and 30 minutes from now. To specify a time in the past, include a negative sign before each numeric value. For example, a value of P-01DT-08H-30M corresponds to 1 day, 8 hours, and 30 minutes in the past. You can also do things like P01DT00H-30M, which would correspond to 23 hours and 30 minutes from now (1 day - 30 minutes).")
  @JsonProperty("value")
  public String getValue() {
    return value;
  }
  public void setValue(String value) {
    this.value = value;
  }

  
  /**
   * A range of values. Required for operators BETWEEN and IN.
   **/
  public ContactListFilterPredicate range(ContactListFilterRange range) {
    this.range = range;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A range of values. Required for operators BETWEEN and IN.")
  @JsonProperty("range")
  public ContactListFilterRange getRange() {
    return range;
  }
  public void setRange(ContactListFilterRange range) {
    this.range = range;
  }

  
  /**
   * Inverts the result of the predicate (i.e., if the predicate returns true, inverting it will return false).
   **/
  public ContactListFilterPredicate inverted(Boolean inverted) {
    this.inverted = inverted;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Inverts the result of the predicate (i.e., if the predicate returns true, inverting it will return false).")
  @JsonProperty("inverted")
  public Boolean getInverted() {
    return inverted;
  }
  public void setInverted(Boolean inverted) {
    this.inverted = inverted;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContactListFilterPredicate contactListFilterPredicate = (ContactListFilterPredicate) o;
    return Objects.equals(this.column, contactListFilterPredicate.column) &&
        Objects.equals(this.columnType, contactListFilterPredicate.columnType) &&
        Objects.equals(this.operator, contactListFilterPredicate.operator) &&
        Objects.equals(this.value, contactListFilterPredicate.value) &&
        Objects.equals(this.range, contactListFilterPredicate.range) &&
        Objects.equals(this.inverted, contactListFilterPredicate.inverted);
  }

  @Override
  public int hashCode() {
    return Objects.hash(column, columnType, operator, value, range, inverted);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContactListFilterPredicate {\n");
    
    sb.append("    column: ").append(toIndentedString(column)).append("\n");
    sb.append("    columnType: ").append(toIndentedString(columnType)).append("\n");
    sb.append("    operator: ").append(toIndentedString(operator)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    range: ").append(toIndentedString(range)).append("\n");
    sb.append("    inverted: ").append(toIndentedString(inverted)).append("\n");
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

