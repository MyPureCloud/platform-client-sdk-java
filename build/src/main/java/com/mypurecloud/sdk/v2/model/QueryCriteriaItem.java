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
 * A singular item used to query libraries
 */
@ApiModel(description = "A singular item used to query libraries")

public class QueryCriteriaItem  implements Serializable {
  

  private static class KeyEnumDeserializer extends StdDeserializer<KeyEnum> {
    public KeyEnumDeserializer() {
      super(KeyEnumDeserializer.class);
    }

    @Override
    public KeyEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return KeyEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The key to filter on
   */
 @JsonDeserialize(using = KeyEnumDeserializer.class)
  public enum KeyEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    NAME("Name"),
    DIVISIONID("DivisionId"),
    ID("Id"),
    CREATEDBY("CreatedBy");

    private String value;

    KeyEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static KeyEnum fromString(String key) {
      if (key == null) return null;

      for (KeyEnum value : KeyEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return KeyEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private KeyEnum key = null;

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
   * The operator for comparison. For DivisionId, only EQUALS and NOTEQUALS operators are supported.
   */
 @JsonDeserialize(using = OperatorEnumDeserializer.class)
  public enum OperatorEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    IN("IN"),
    EQUALS("EQUALS"),
    NOTEQUALS("NOTEQUALS"),
    BEGINS_WITH("BEGINS_WITH"),
    ENDS_WITH("ENDS_WITH"),
    CONTAINS("CONTAINS");

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

  public QueryCriteriaItem() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  public QueryCriteriaItem(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
    }
  }

  
  /**
   * The key to filter on
   **/
  public QueryCriteriaItem key(KeyEnum key) {
    this.key = key;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The key to filter on")
  @JsonProperty("key")
  public KeyEnum getKey() {
    return key;
  }
  public void setKey(KeyEnum key) {
    this.key = key;
  }


  /**
   * The operator for comparison. For DivisionId, only EQUALS and NOTEQUALS operators are supported.
   **/
  public QueryCriteriaItem operator(OperatorEnum operator) {
    this.operator = operator;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The operator for comparison. For DivisionId, only EQUALS and NOTEQUALS operators are supported.")
  @JsonProperty("operator")
  public OperatorEnum getOperator() {
    return operator;
  }
  public void setOperator(OperatorEnum operator) {
    this.operator = operator;
  }


  /**
   * The target value to match
   **/
  public QueryCriteriaItem value(String value) {
    this.value = value;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The target value to match")
  @JsonProperty("value")
  public String getValue() {
    return value;
  }
  public void setValue(String value) {
    this.value = value;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QueryCriteriaItem queryCriteriaItem = (QueryCriteriaItem) o;

    return Objects.equals(this.key, queryCriteriaItem.key) &&
            Objects.equals(this.operator, queryCriteriaItem.operator) &&
            Objects.equals(this.value, queryCriteriaItem.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, operator, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueryCriteriaItem {\n");
    
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    operator: ").append(toIndentedString(operator)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

