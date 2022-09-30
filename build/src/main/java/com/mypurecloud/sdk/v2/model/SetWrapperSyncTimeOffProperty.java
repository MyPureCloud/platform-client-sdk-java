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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.List;

import java.io.Serializable;
/**
 * SetWrapperSyncTimeOffProperty
 */

public class SetWrapperSyncTimeOffProperty  implements Serializable {
  

  private static class ValuesEnumDeserializer extends StdDeserializer<ValuesEnum> {
    public ValuesEnumDeserializer() {
      super(ValuesEnumDeserializer.class);
    }

    @Override
    public ValuesEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return ValuesEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Gets or Sets values
   */
 @JsonDeserialize(using = ValuesEnumDeserializer.class)
  public enum ValuesEnum {
    PAYABLEMINUTES("PayableMinutes");

    private String value;

    ValuesEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static ValuesEnum fromString(String key) {
      if (key == null) return null;

      for (ValuesEnum value : ValuesEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return ValuesEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private List<ValuesEnum> values = new ArrayList<ValuesEnum>();

  
  /**
   **/
  public SetWrapperSyncTimeOffProperty values(List<ValuesEnum> values) {
    this.values = values;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("values")
  public List<ValuesEnum> getValues() {
    return values;
  }
  public void setValues(List<ValuesEnum> values) {
    this.values = values;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SetWrapperSyncTimeOffProperty setWrapperSyncTimeOffProperty = (SetWrapperSyncTimeOffProperty) o;

    return Objects.equals(this.values, setWrapperSyncTimeOffProperty.values);
  }

  @Override
  public int hashCode() {
    return Objects.hash(values);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SetWrapperSyncTimeOffProperty {\n");
    
    sb.append("    values: ").append(toIndentedString(values)).append("\n");
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

