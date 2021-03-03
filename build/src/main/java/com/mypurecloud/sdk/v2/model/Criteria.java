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
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * Criteria
 */

public class Criteria  implements Serializable {
  
  private String key = null;
  private List<String> values = new ArrayList<String>();
  private Boolean shouldIgnoreCase = null;

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
   * The comparison operator.
   */
 @JsonDeserialize(using = OperatorEnumDeserializer.class)
  public enum OperatorEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    CONTAINSALL("containsAll"),
    CONTAINSANY("containsAny"),
    NOTCONTAINSALL("notContainsAll"),
    NOTCONTAINSANY("notContainsAny"),
    EQUAL("equal"),
    NOTEQUAL("notEqual"),
    GREATERTHAN("greaterThan"),
    GREATERTHANOREQUAL("greaterThanOrEqual"),
    LESSTHAN("lessThan"),
    LESSTHANOREQUAL("lessThanOrEqual"),
    STARTSWITH("startsWith"),
    ENDSWITH("endsWith");

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

  
  /**
   * The criteria key.
   **/
  public Criteria key(String key) {
    this.key = key;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The criteria key.")
  @JsonProperty("key")
  public String getKey() {
    return key;
  }
  public void setKey(String key) {
    this.key = key;
  }

  
  /**
   * The criteria values.
   **/
  public Criteria values(List<String> values) {
    this.values = values;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The criteria values.")
  @JsonProperty("values")
  public List<String> getValues() {
    return values;
  }
  public void setValues(List<String> values) {
    this.values = values;
  }

  
  /**
   * Should criteria be case insensitive.
   **/
  public Criteria shouldIgnoreCase(Boolean shouldIgnoreCase) {
    this.shouldIgnoreCase = shouldIgnoreCase;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Should criteria be case insensitive.")
  @JsonProperty("shouldIgnoreCase")
  public Boolean getShouldIgnoreCase() {
    return shouldIgnoreCase;
  }
  public void setShouldIgnoreCase(Boolean shouldIgnoreCase) {
    this.shouldIgnoreCase = shouldIgnoreCase;
  }

  
  /**
   * The comparison operator.
   **/
  public Criteria operator(OperatorEnum operator) {
    this.operator = operator;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The comparison operator.")
  @JsonProperty("operator")
  public OperatorEnum getOperator() {
    return operator;
  }
  public void setOperator(OperatorEnum operator) {
    this.operator = operator;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Criteria criteria = (Criteria) o;
    return Objects.equals(this.key, criteria.key) &&
        Objects.equals(this.values, criteria.values) &&
        Objects.equals(this.shouldIgnoreCase, criteria.shouldIgnoreCase) &&
        Objects.equals(this.operator, criteria.operator);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, values, shouldIgnoreCase, operator);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Criteria {\n");
    
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    values: ").append(toIndentedString(values)).append("\n");
    sb.append("    shouldIgnoreCase: ").append(toIndentedString(shouldIgnoreCase)).append("\n");
    sb.append("    operator: ").append(toIndentedString(operator)).append("\n");
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

