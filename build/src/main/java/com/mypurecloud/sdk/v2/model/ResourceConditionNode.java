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
import com.mypurecloud.sdk.v2.model.ResourceConditionNode;
import com.mypurecloud.sdk.v2.model.ResourceConditionValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * ResourceConditionNode
 */

public class ResourceConditionNode  implements Serializable {
  
  private String variableName = null;

  private static class ConjunctionEnumDeserializer extends StdDeserializer<ConjunctionEnum> {
    public ConjunctionEnumDeserializer() {
      super(ConjunctionEnumDeserializer.class);
    }

    @Override
    public ConjunctionEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return ConjunctionEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Gets or Sets conjunction
   */
 @JsonDeserialize(using = ConjunctionEnumDeserializer.class)
  public enum ConjunctionEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    AND("AND"),
    OR("OR");

    private String value;

    ConjunctionEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static ConjunctionEnum fromString(String key) {
      if (key == null) return null;

      for (ConjunctionEnum value : ConjunctionEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return ConjunctionEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private ConjunctionEnum conjunction = null;

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
   * Gets or Sets operator
   */
 @JsonDeserialize(using = OperatorEnumDeserializer.class)
  public enum OperatorEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    EQ("EQ"),
    IN("IN"),
    GE("GE"),
    GT("GT"),
    LE("LE"),
    LT("LT");

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
  private List<ResourceConditionValue> operands = new ArrayList<ResourceConditionValue>();
  private List<ResourceConditionNode> terms = new ArrayList<ResourceConditionNode>();

  
  /**
   **/
  public ResourceConditionNode variableName(String variableName) {
    this.variableName = variableName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("variableName")
  public String getVariableName() {
    return variableName;
  }
  public void setVariableName(String variableName) {
    this.variableName = variableName;
  }

  
  /**
   **/
  public ResourceConditionNode conjunction(ConjunctionEnum conjunction) {
    this.conjunction = conjunction;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("conjunction")
  public ConjunctionEnum getConjunction() {
    return conjunction;
  }
  public void setConjunction(ConjunctionEnum conjunction) {
    this.conjunction = conjunction;
  }

  
  /**
   **/
  public ResourceConditionNode operator(OperatorEnum operator) {
    this.operator = operator;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("operator")
  public OperatorEnum getOperator() {
    return operator;
  }
  public void setOperator(OperatorEnum operator) {
    this.operator = operator;
  }

  
  /**
   **/
  public ResourceConditionNode operands(List<ResourceConditionValue> operands) {
    this.operands = operands;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("operands")
  public List<ResourceConditionValue> getOperands() {
    return operands;
  }
  public void setOperands(List<ResourceConditionValue> operands) {
    this.operands = operands;
  }

  
  /**
   **/
  public ResourceConditionNode terms(List<ResourceConditionNode> terms) {
    this.terms = terms;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("terms")
  public List<ResourceConditionNode> getTerms() {
    return terms;
  }
  public void setTerms(List<ResourceConditionNode> terms) {
    this.terms = terms;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResourceConditionNode resourceConditionNode = (ResourceConditionNode) o;
    return Objects.equals(this.variableName, resourceConditionNode.variableName) &&
        Objects.equals(this.conjunction, resourceConditionNode.conjunction) &&
        Objects.equals(this.operator, resourceConditionNode.operator) &&
        Objects.equals(this.operands, resourceConditionNode.operands) &&
        Objects.equals(this.terms, resourceConditionNode.terms);
  }

  @Override
  public int hashCode() {
    return Objects.hash(variableName, conjunction, operator, operands, terms);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResourceConditionNode {\n");
    
    sb.append("    variableName: ").append(toIndentedString(variableName)).append("\n");
    sb.append("    conjunction: ").append(toIndentedString(conjunction)).append("\n");
    sb.append("    operator: ").append(toIndentedString(operator)).append("\n");
    sb.append("    operands: ").append(toIndentedString(operands)).append("\n");
    sb.append("    terms: ").append(toIndentedString(terms)).append("\n");
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

