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
 * AssociatedValueField
 */

public class AssociatedValueField  implements Serializable {
  

  private static class DataTypeEnumDeserializer extends StdDeserializer<DataTypeEnum> {
    public DataTypeEnumDeserializer() {
      super(DataTypeEnumDeserializer.class);
    }

    @Override
    public DataTypeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return DataTypeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The data type of the value field.
   */
 @JsonDeserialize(using = DataTypeEnumDeserializer.class)
  public enum DataTypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    NUMBER("Number"),
    INTEGER("Integer");

    private String value;

    DataTypeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static DataTypeEnum fromString(String key) {
      if (key == null) return null;

      for (DataTypeEnum value : DataTypeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return DataTypeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private DataTypeEnum dataType = null;
  private String name = null;

  
  /**
   * The data type of the value field.
   **/
  public AssociatedValueField dataType(DataTypeEnum dataType) {
    this.dataType = dataType;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The data type of the value field.")
  @JsonProperty("dataType")
  public DataTypeEnum getDataType() {
    return dataType;
  }
  public void setDataType(DataTypeEnum dataType) {
    this.dataType = dataType;
  }

  
  /**
   * The field name for extracting value from event.
   **/
  public AssociatedValueField name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The field name for extracting value from event.")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AssociatedValueField associatedValueField = (AssociatedValueField) o;
    return Objects.equals(this.dataType, associatedValueField.dataType) &&
        Objects.equals(this.name, associatedValueField.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dataType, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssociatedValueField {\n");
    
    sb.append("    dataType: ").append(toIndentedString(dataType)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

