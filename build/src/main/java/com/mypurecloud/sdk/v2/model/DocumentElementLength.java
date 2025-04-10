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
 * DocumentElementLength
 */

public class DocumentElementLength  implements Serializable {
  
  private Float value = null;

  private static class UnitEnumDeserializer extends StdDeserializer<UnitEnum> {
    public UnitEnumDeserializer() {
      super(UnitEnumDeserializer.class);
    }

    @Override
    public UnitEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return UnitEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The unit of length.
   */
 @JsonDeserialize(using = UnitEnumDeserializer.class)
  public enum UnitEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    EM("Em"),
    PERCENTAGE("Percentage"),
    PX("Px");

    private String value;

    UnitEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static UnitEnum fromString(String key) {
      if (key == null) return null;

      for (UnitEnum value : UnitEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return UnitEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private UnitEnum unit = null;

  public DocumentElementLength() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * The length value of the element in the selected unit.
   **/
  public DocumentElementLength value(Float value) {
    this.value = value;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The length value of the element in the selected unit.")
  @JsonProperty("value")
  public Float getValue() {
    return value;
  }
  public void setValue(Float value) {
    this.value = value;
  }


  /**
   * The unit of length.
   **/
  public DocumentElementLength unit(UnitEnum unit) {
    this.unit = unit;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The unit of length.")
  @JsonProperty("unit")
  public UnitEnum getUnit() {
    return unit;
  }
  public void setUnit(UnitEnum unit) {
    this.unit = unit;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocumentElementLength documentElementLength = (DocumentElementLength) o;

    return Objects.equals(this.value, documentElementLength.value) &&
            Objects.equals(this.unit, documentElementLength.unit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, unit);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentElementLength {\n");
    
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    unit: ").append(toIndentedString(unit)).append("\n");
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

