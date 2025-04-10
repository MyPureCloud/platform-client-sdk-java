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
 * ColumnDataTypeSpecification
 */

public class ColumnDataTypeSpecification  implements Serializable {
  
  private String columnName = null;

  private static class ColumnDataTypeEnumDeserializer extends StdDeserializer<ColumnDataTypeEnum> {
    public ColumnDataTypeEnumDeserializer() {
      super(ColumnDataTypeEnumDeserializer.class);
    }

    @Override
    public ColumnDataTypeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return ColumnDataTypeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The data type of the column selected for dynamic queueing (TEXT, NUMERIC or TIMESTAMP)
   */
 @JsonDeserialize(using = ColumnDataTypeEnumDeserializer.class)
  public enum ColumnDataTypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    NUMERIC("NUMERIC"),
    TEXT("TEXT"),
    TIMESTAMP("TIMESTAMP");

    private String value;

    ColumnDataTypeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static ColumnDataTypeEnum fromString(String key) {
      if (key == null) return null;

      for (ColumnDataTypeEnum value : ColumnDataTypeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return ColumnDataTypeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private ColumnDataTypeEnum columnDataType = null;
  private Integer min = null;
  private Integer max = null;
  private Integer maxLength = null;

  public ColumnDataTypeSpecification() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * The column name of a column selected for dynamic queueing
   **/
  public ColumnDataTypeSpecification columnName(String columnName) {
    this.columnName = columnName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The column name of a column selected for dynamic queueing")
  @JsonProperty("columnName")
  public String getColumnName() {
    return columnName;
  }
  public void setColumnName(String columnName) {
    this.columnName = columnName;
  }


  /**
   * The data type of the column selected for dynamic queueing (TEXT, NUMERIC or TIMESTAMP)
   **/
  public ColumnDataTypeSpecification columnDataType(ColumnDataTypeEnum columnDataType) {
    this.columnDataType = columnDataType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The data type of the column selected for dynamic queueing (TEXT, NUMERIC or TIMESTAMP)")
  @JsonProperty("columnDataType")
  public ColumnDataTypeEnum getColumnDataType() {
    return columnDataType;
  }
  public void setColumnDataType(ColumnDataTypeEnum columnDataType) {
    this.columnDataType = columnDataType;
  }


  /**
   * The minimum length of the numeric column selected for dynamic queueing
   **/
  public ColumnDataTypeSpecification min(Integer min) {
    this.min = min;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The minimum length of the numeric column selected for dynamic queueing")
  @JsonProperty("min")
  public Integer getMin() {
    return min;
  }
  public void setMin(Integer min) {
    this.min = min;
  }


  /**
   * The maximum length of the numeric column selected for dynamic queueing
   **/
  public ColumnDataTypeSpecification max(Integer max) {
    this.max = max;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The maximum length of the numeric column selected for dynamic queueing")
  @JsonProperty("max")
  public Integer getMax() {
    return max;
  }
  public void setMax(Integer max) {
    this.max = max;
  }


  /**
   * The maximum length of the text column selected for dynamic queueing
   **/
  public ColumnDataTypeSpecification maxLength(Integer maxLength) {
    this.maxLength = maxLength;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The maximum length of the text column selected for dynamic queueing")
  @JsonProperty("maxLength")
  public Integer getMaxLength() {
    return maxLength;
  }
  public void setMaxLength(Integer maxLength) {
    this.maxLength = maxLength;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ColumnDataTypeSpecification columnDataTypeSpecification = (ColumnDataTypeSpecification) o;

    return Objects.equals(this.columnName, columnDataTypeSpecification.columnName) &&
            Objects.equals(this.columnDataType, columnDataTypeSpecification.columnDataType) &&
            Objects.equals(this.min, columnDataTypeSpecification.min) &&
            Objects.equals(this.max, columnDataTypeSpecification.max) &&
            Objects.equals(this.maxLength, columnDataTypeSpecification.maxLength);
  }

  @Override
  public int hashCode() {
    return Objects.hash(columnName, columnDataType, min, max, maxLength);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ColumnDataTypeSpecification {\n");
    
    sb.append("    columnName: ").append(toIndentedString(columnName)).append("\n");
    sb.append("    columnDataType: ").append(toIndentedString(columnDataType)).append("\n");
    sb.append("    min: ").append(toIndentedString(min)).append("\n");
    sb.append("    max: ").append(toIndentedString(max)).append("\n");
    sb.append("    maxLength: ").append(toIndentedString(maxLength)).append("\n");
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

