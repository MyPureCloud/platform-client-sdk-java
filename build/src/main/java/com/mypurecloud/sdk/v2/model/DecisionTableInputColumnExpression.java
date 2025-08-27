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
import com.mypurecloud.sdk.v2.model.Contractual;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * DecisionTableInputColumnExpression
 */

public class DecisionTableInputColumnExpression  implements Serializable {
  
  private Contractual contractual = null;

  private static class ComparatorEnumDeserializer extends StdDeserializer<ComparatorEnum> {
    public ComparatorEnumDeserializer() {
      super(ComparatorEnumDeserializer.class);
    }

    @Override
    public ComparatorEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return ComparatorEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * A comparator used to join the left and right sides of a logical condition.
   */
 @JsonDeserialize(using = ComparatorEnumDeserializer.class)
  public enum ComparatorEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    EQUALS("Equals"),
    NOTEQUALS("NotEquals"),
    GREATERTHAN("GreaterThan"),
    GREATERTHANOREQUALS("GreaterThanOrEquals"),
    LESSTHAN("LessThan"),
    LESSTHANOREQUALS("LessThanOrEquals"),
    STARTSWITH("StartsWith"),
    NOTSTARTSWITH("NotStartsWith"),
    ENDSWITH("EndsWith"),
    NOTENDSWITH("NotEndsWith"),
    CONTAINS("Contains"),
    NOTCONTAINS("NotContains"),
    CONTAINSANY("ContainsAny"),
    NOTCONTAINSANY("NotContainsAny"),
    CONTAINSALL("ContainsAll"),
    NOTCONTAINSALL("NotContainsAll"),
    CONTAINSEXACTLY("ContainsExactly"),
    NOTCONTAINSEXACTLY("NotContainsExactly");

    private String value;

    ComparatorEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static ComparatorEnum fromString(String key) {
      if (key == null) return null;

      for (ComparatorEnum value : ComparatorEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return ComparatorEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private ComparatorEnum comparator = null;

  public DecisionTableInputColumnExpression() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * A value that is defined by a contract schema and used to form the left side of a logical condition.
   **/
  public DecisionTableInputColumnExpression contractual(Contractual contractual) {
    this.contractual = contractual;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "A value that is defined by a contract schema and used to form the left side of a logical condition.")
  @JsonProperty("contractual")
  public Contractual getContractual() {
    return contractual;
  }
  public void setContractual(Contractual contractual) {
    this.contractual = contractual;
  }


  /**
   * A comparator used to join the left and right sides of a logical condition.
   **/
  public DecisionTableInputColumnExpression comparator(ComparatorEnum comparator) {
    this.comparator = comparator;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "A comparator used to join the left and right sides of a logical condition.")
  @JsonProperty("comparator")
  public ComparatorEnum getComparator() {
    return comparator;
  }
  public void setComparator(ComparatorEnum comparator) {
    this.comparator = comparator;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DecisionTableInputColumnExpression decisionTableInputColumnExpression = (DecisionTableInputColumnExpression) o;

    return Objects.equals(this.contractual, decisionTableInputColumnExpression.contractual) &&
            Objects.equals(this.comparator, decisionTableInputColumnExpression.comparator);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contractual, comparator);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DecisionTableInputColumnExpression {\n");
    
    sb.append("    contractual: ").append(toIndentedString(contractual)).append("\n");
    sb.append("    comparator: ").append(toIndentedString(comparator)).append("\n");
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

