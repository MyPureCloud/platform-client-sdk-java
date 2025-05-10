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
 * ChartColumn
 */

public class ChartColumn  implements Serializable {
  
  private String id = null;

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
   * Type of column
   */
 @JsonDeserialize(using = ColumnTypeEnumDeserializer.class)
  public enum ColumnTypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    DEFAULT("Default"),
    TOPIC("Topic"),
    SECONDARYSTATUS("SecondaryStatus"),
    CUSTOMCALCULATION("CustomCalculation");

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

  public ChartColumn() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * Column Id
   **/
  public ChartColumn id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Column Id")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }


  /**
   * Type of column
   **/
  public ChartColumn columnType(ColumnTypeEnum columnType) {
    this.columnType = columnType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Type of column")
  @JsonProperty("columnType")
  public ColumnTypeEnum getColumnType() {
    return columnType;
  }
  public void setColumnType(ColumnTypeEnum columnType) {
    this.columnType = columnType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChartColumn chartColumn = (ChartColumn) o;

    return Objects.equals(this.id, chartColumn.id) &&
            Objects.equals(this.columnType, chartColumn.columnType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, columnType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChartColumn {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    columnType: ").append(toIndentedString(columnType)).append("\n");
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

