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
 * CsvMappingEntry
 */

public class CsvMappingEntry  implements Serializable {
  
  private String sourceField = null;
  private String targetField = null;

  private static class ValueFormatEnumDeserializer extends StdDeserializer<ValueFormatEnum> {
    public ValueFormatEnumDeserializer() {
      super(ValueFormatEnumDeserializer.class);
    }

    @Override
    public ValueFormatEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return ValueFormatEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * How the CSV cell value is interpreted at the target path. When omitted, the cell is treated as a string.
   */
 @JsonDeserialize(using = ValueFormatEnumDeserializer.class)
  public enum ValueFormatEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    STRING("String"),
    JSON("Json");

    private String value;

    ValueFormatEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static ValueFormatEnum fromString(String key) {
      if (key == null) return null;

      for (ValueFormatEnum value : ValueFormatEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return ValueFormatEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private ValueFormatEnum valueFormat = null;

  public CsvMappingEntry() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  public CsvMappingEntry(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
    }
  }

  
  /**
   * CSV field to map data from
   **/
  public CsvMappingEntry sourceField(String sourceField) {
    this.sourceField = sourceField;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "CSV field to map data from")
  @JsonProperty("sourceField")
  public String getSourceField() {
    return sourceField;
  }
  public void setSourceField(String sourceField) {
    this.sourceField = sourceField;
  }


  /**
   * Json path to map data to
   **/
  public CsvMappingEntry targetField(String targetField) {
    this.targetField = targetField;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Json path to map data to")
  @JsonProperty("targetField")
  public String getTargetField() {
    return targetField;
  }
  public void setTargetField(String targetField) {
    this.targetField = targetField;
  }


  /**
   * How the CSV cell value is interpreted at the target path. When omitted, the cell is treated as a string.
   **/
  public CsvMappingEntry valueFormat(ValueFormatEnum valueFormat) {
    this.valueFormat = valueFormat;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "How the CSV cell value is interpreted at the target path. When omitted, the cell is treated as a string.")
  @JsonProperty("valueFormat")
  public ValueFormatEnum getValueFormat() {
    return valueFormat;
  }
  public void setValueFormat(ValueFormatEnum valueFormat) {
    this.valueFormat = valueFormat;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CsvMappingEntry csvMappingEntry = (CsvMappingEntry) o;

    return Objects.equals(this.sourceField, csvMappingEntry.sourceField) &&
            Objects.equals(this.targetField, csvMappingEntry.targetField) &&
            Objects.equals(this.valueFormat, csvMappingEntry.valueFormat);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sourceField, targetField, valueFormat);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CsvMappingEntry {\n");
    
    sb.append("    sourceField: ").append(toIndentedString(sourceField)).append("\n");
    sb.append("    targetField: ").append(toIndentedString(targetField)).append("\n");
    sb.append("    valueFormat: ").append(toIndentedString(valueFormat)).append("\n");
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

