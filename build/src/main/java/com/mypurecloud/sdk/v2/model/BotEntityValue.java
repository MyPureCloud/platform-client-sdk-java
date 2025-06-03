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
 * BotEntityValue
 */

public class BotEntityValue  implements Serializable {
  
  private String name = null;

  private static class TypeEnumDeserializer extends StdDeserializer<TypeEnum> {
    public TypeEnumDeserializer() {
      super(TypeEnumDeserializer.class);
    }

    @Override
    public TypeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return TypeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The data type of the entity. Valid types include: String, Integer, Decimal, Boolean, Duration, Datetime, Currency, StringCollection, IntegerCollection, DecimalCollection, BooleanCollection, DurationCollection, DatetimeCollection, CurrencyCollection.
   */
 @JsonDeserialize(using = TypeEnumDeserializer.class)
  public enum TypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    STRING("String"),
    INTEGER("Integer"),
    DECIMAL("Decimal"),
    DURATION("Duration"),
    BOOLEAN("Boolean"),
    CURRENCY("Currency"),
    DATETIME("Datetime"),
    STRINGCOLLECTION("StringCollection"),
    INTEGERCOLLECTION("IntegerCollection"),
    DECIMALCOLLECTION("DecimalCollection"),
    DURATIONCOLLECTION("DurationCollection"),
    BOOLEANCOLLECTION("BooleanCollection"),
    CURRENCYCOLLECTION("CurrencyCollection"),
    DATETIMECOLLECTION("DatetimeCollection");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static TypeEnum fromString(String key) {
      if (key == null) return null;

      for (TypeEnum value : TypeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return TypeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private TypeEnum type = null;
  private String value = null;
  private List<String> values = null;

  public BotEntityValue() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      values = new ArrayList<String>();
    }
  }

  
  /**
   * The name of the entity.
   **/
  public BotEntityValue name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The name of the entity.")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }


  /**
   * The data type of the entity. Valid types include: String, Integer, Decimal, Boolean, Duration, Datetime, Currency, StringCollection, IntegerCollection, DecimalCollection, BooleanCollection, DurationCollection, DatetimeCollection, CurrencyCollection.
   **/
  public BotEntityValue type(TypeEnum type) {
    this.type = type;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The data type of the entity. Valid types include: String, Integer, Decimal, Boolean, Duration, Datetime, Currency, StringCollection, IntegerCollection, DecimalCollection, BooleanCollection, DurationCollection, DatetimeCollection, CurrencyCollection.")
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
    this.type = type;
  }


  /**
   * The string value of the entity for simple types. Required when using non-collection types. Format depends on the 'type' field: String: \"any text\"; Integer: whole number (e.g., \"42\"); Decimal: number with optional decimal point (e.g., \"42.5\"); Boolean: \"true\" or \"false\"; Duration: ISO-8601 duration format (e.g., \"PT1H30M\" for 1 hour and 30 minutes); Datetime: ISO-8601 datetime format (e.g., \"2023-04-15T14:30:00Z\"); Currency: JSON object with 'amount' and 'code' fields as an escaped JSON string (e.g., \"{\\\"amount\\\":10.50,\\\"code\\\":\\\"USD\\\"}\" - note the escaped quotes).
   **/
  public BotEntityValue value(String value) {
    this.value = value;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The string value of the entity for simple types. Required when using non-collection types. Format depends on the 'type' field: String: \"any text\"; Integer: whole number (e.g., \"42\"); Decimal: number with optional decimal point (e.g., \"42.5\"); Boolean: \"true\" or \"false\"; Duration: ISO-8601 duration format (e.g., \"PT1H30M\" for 1 hour and 30 minutes); Datetime: ISO-8601 datetime format (e.g., \"2023-04-15T14:30:00Z\"); Currency: JSON object with 'amount' and 'code' fields as an escaped JSON string (e.g., \"{\\\"amount\\\":10.50,\\\"code\\\":\\\"USD\\\"}\" - note the escaped quotes).")
  @JsonProperty("value")
  public String getValue() {
    return value;
  }
  public void setValue(String value) {
    this.value = value;
  }


  /**
   * The collection values for collection types. Required when using collection types. Each value must follow the format of its base type: StringCollection: array of strings; IntegerCollection: array of integer strings (e.g., [\"1\", \"2\", \"3\"]); DecimalCollection: array of decimal strings (e.g., [\"1.5\", \"2.0\", \"3.75\"]); BooleanCollection: array of boolean strings (e.g., [\"true\", \"false\"]); DurationCollection: array of ISO-8601 duration strings; DatetimeCollection: array of ISO-8601 datetime strings; CurrencyCollection: array of escaped JSON currency object strings (e.g., [\"{\\\"amount\\\":10.50,\\\"code\\\":\\\"USD\\\"}\", \"{\\\"amount\\\":25.00,\\\"code\\\":\\\"EUR\\\"}\"] - note the escaped quotes).
   **/
  public BotEntityValue values(List<String> values) {
    this.values = values;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The collection values for collection types. Required when using collection types. Each value must follow the format of its base type: StringCollection: array of strings; IntegerCollection: array of integer strings (e.g., [\"1\", \"2\", \"3\"]); DecimalCollection: array of decimal strings (e.g., [\"1.5\", \"2.0\", \"3.75\"]); BooleanCollection: array of boolean strings (e.g., [\"true\", \"false\"]); DurationCollection: array of ISO-8601 duration strings; DatetimeCollection: array of ISO-8601 datetime strings; CurrencyCollection: array of escaped JSON currency object strings (e.g., [\"{\\\"amount\\\":10.50,\\\"code\\\":\\\"USD\\\"}\", \"{\\\"amount\\\":25.00,\\\"code\\\":\\\"EUR\\\"}\"] - note the escaped quotes).")
  @JsonProperty("values")
  public List<String> getValues() {
    return values;
  }
  public void setValues(List<String> values) {
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
    BotEntityValue botEntityValue = (BotEntityValue) o;

    return Objects.equals(this.name, botEntityValue.name) &&
            Objects.equals(this.type, botEntityValue.type) &&
            Objects.equals(this.value, botEntityValue.value) &&
            Objects.equals(this.values, botEntityValue.values);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, type, value, values);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BotEntityValue {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

