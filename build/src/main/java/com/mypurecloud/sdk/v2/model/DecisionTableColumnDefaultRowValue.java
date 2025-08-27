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
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * Must provide a valid value for exactly one of the fields in this class.
 */
@ApiModel(description = "Must provide a valid value for exactly one of the fields in this class.")

public class DecisionTableColumnDefaultRowValue  implements Serializable {
  
  private String value = null;
  private List<String> values = null;

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
   * A default special value enum for this column.
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

  public DecisionTableColumnDefaultRowValue() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      values = new ArrayList<String>();
    }
  }

  
  /**
   * A default string value for this column, will be cast to appropriate type according to the relevant contract schema property.
   **/
  public DecisionTableColumnDefaultRowValue value(String value) {
    this.value = value;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A default string value for this column, will be cast to appropriate type according to the relevant contract schema property.")
  @JsonProperty("value")
  public String getValue() {
    return value;
  }
  public void setValue(String value) {
    this.value = value;
  }


  /**
   * A default list of values for this column, items will be cast to appropriate type according to the relevant contract schema property
   **/
  public DecisionTableColumnDefaultRowValue values(List<String> values) {
    this.values = values;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A default list of values for this column, items will be cast to appropriate type according to the relevant contract schema property")
  @JsonProperty("values")
  public List<String> getValues() {
    return values;
  }
  public void setValues(List<String> values) {
    this.values = values;
  }


  /**
   * A default special value enum for this column.
   **/
  public DecisionTableColumnDefaultRowValue special(SpecialEnum special) {
    this.special = special;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A default special value enum for this column.")
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
    DecisionTableColumnDefaultRowValue decisionTableColumnDefaultRowValue = (DecisionTableColumnDefaultRowValue) o;

    return Objects.equals(this.value, decisionTableColumnDefaultRowValue.value) &&
            Objects.equals(this.values, decisionTableColumnDefaultRowValue.values) &&
            Objects.equals(this.special, decisionTableColumnDefaultRowValue.special);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, values, special);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DecisionTableColumnDefaultRowValue {\n");
    
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    values: ").append(toIndentedString(values)).append("\n");
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

