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
 * A single structured tool-output rule. The mapping is a path into the tool output type.
 */
@ApiModel(description = "A single structured tool-output rule. The mapping is a path into the tool output type.")

public class AgenticVirtualAgentStructuredOutputRuleAllOf  implements Serializable {
  
  private List<Object> mapping = null;

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
   * Operator to apply to the value at the mapped path.
   */
 @JsonDeserialize(using = OperatorEnumDeserializer.class)
  public enum OperatorEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    ISNULL("IsNull"),
    ISNOTNULL("IsNotNull"),
    ISEMPTY("IsEmpty"),
    ISNOTEMPTY("IsNotEmpty"),
    EQUAL("Equal"),
    NOTEQUAL("NotEqual"),
    LESSTHAN("LessThan"),
    LESSTHANOREQUAL("LessThanOrEqual"),
    GREATERTHAN("GreaterThan"),
    GREATERTHANOREQUAL("GreaterThanOrEqual"),
    IN("In"),
    NOTIN("NotIn"),
    CONTAINS("Contains"),
    DOESNTCONTAIN("DoesntContain"),
    BEGINSWITH("BeginsWith"),
    ENDSWITH("EndsWith");

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
  private Object value = null;

  public AgenticVirtualAgentStructuredOutputRuleAllOf() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      mapping = new ArrayList<Object>();
    }
  }

  public AgenticVirtualAgentStructuredOutputRuleAllOf(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
      mapping = new ArrayList<Object>();
    }
  }

  
  /**
   * Path into the tool output type this rule applies to. Each element is a field name (string) or an array index (integer).
   **/
  public AgenticVirtualAgentStructuredOutputRuleAllOf mapping(List<Object> mapping) {
    this.mapping = mapping;
    return this;
  }
  
  @ApiModelProperty(example = "[&quot;Order&quot;, &quot;items&quot;, 0, &quot;status&quot;]", required = true, value = "Path into the tool output type this rule applies to. Each element is a field name (string) or an array index (integer).")
  @JsonProperty("mapping")
  public List<Object> getMapping() {
    return mapping;
  }
  public void setMapping(List<Object> mapping) {
    this.mapping = mapping;
  }


  /**
   * Operator to apply to the value at the mapped path.
   **/
  public AgenticVirtualAgentStructuredOutputRuleAllOf operator(OperatorEnum operator) {
    this.operator = operator;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Operator to apply to the value at the mapped path.")
  @JsonProperty("operator")
  public OperatorEnum getOperator() {
    return operator;
  }
  public void setOperator(OperatorEnum operator) {
    this.operator = operator;
  }


  /**
   * Value to compare against. May be a string, integer, number, boolean, or null. Not required for 'IsNull', 'IsNotNull', 'IsEmpty', or 'IsNotEmpty' operators.
   **/
  public AgenticVirtualAgentStructuredOutputRuleAllOf value(Object value) {
    this.value = value;
    return this;
  }
  
  @ApiModelProperty(example = "&quot;Delivered&quot;", value = "Value to compare against. May be a string, integer, number, boolean, or null. Not required for 'IsNull', 'IsNotNull', 'IsEmpty', or 'IsNotEmpty' operators.")
  @JsonProperty("value")
  public Object getValue() {
    return value;
  }
  public void setValue(Object value) {
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
    AgenticVirtualAgentStructuredOutputRuleAllOf agenticVirtualAgentStructuredOutputRuleAllOf = (AgenticVirtualAgentStructuredOutputRuleAllOf) o;

    return Objects.equals(this.mapping, agenticVirtualAgentStructuredOutputRuleAllOf.mapping) &&
            Objects.equals(this.operator, agenticVirtualAgentStructuredOutputRuleAllOf.operator) &&
            Objects.equals(this.value, agenticVirtualAgentStructuredOutputRuleAllOf.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mapping, operator, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AgenticVirtualAgentStructuredOutputRuleAllOf {\n");
    
    sb.append("    mapping: ").append(toIndentedString(mapping)).append("\n");
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

