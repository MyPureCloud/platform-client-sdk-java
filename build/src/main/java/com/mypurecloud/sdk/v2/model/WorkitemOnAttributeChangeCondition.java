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
 * WorkitemOnAttributeChangeCondition
 */

public class WorkitemOnAttributeChangeCondition  implements Serializable {
  

  private static class AttributeEnumDeserializer extends StdDeserializer<AttributeEnum> {
    public AttributeEnumDeserializer() {
      super(AttributeEnumDeserializer.class);
    }

    @Override
    public AttributeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return AttributeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The name of the workitem attribute whose change will be evaluated as part of the rule.
   */
 @JsonDeserialize(using = AttributeEnumDeserializer.class)
  public enum AttributeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    STATUSID("statusId"),
    PRIORITY("priority"),
    QUEUEID("queueId"),
    ASSIGNEEID("assigneeId"),
    ASSIGNMENTSTATE("assignmentState"),
    LANGUAGEID("languageId"),
    EXTERNALTAG("externalTag"),
    WRAPUP("wrapup");

    private String value;

    AttributeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static AttributeEnum fromString(String key) {
      if (key == null) return null;

      for (AttributeEnum value : AttributeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return AttributeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private AttributeEnum attribute = null;
  private String newValue = null;
  private String oldValue = null;

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
   * The comparison operator used to evaluate the priority attribute against the value. Only supported for the priority attribute.
   */
 @JsonDeserialize(using = OperatorEnumDeserializer.class)
  public enum OperatorEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    EQ("EQ"),
    GT("GT"),
    LT("LT"),
    GTE("GTE"),
    LTE("LTE");

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
  private Integer value = null;

  public WorkitemOnAttributeChangeCondition() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  public WorkitemOnAttributeChangeCondition(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
    }
  }

  
  /**
   * The name of the workitem attribute whose change will be evaluated as part of the rule.
   **/
  public WorkitemOnAttributeChangeCondition attribute(AttributeEnum attribute) {
    this.attribute = attribute;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The name of the workitem attribute whose change will be evaluated as part of the rule.")
  @JsonProperty("attribute")
  public AttributeEnum getAttribute() {
    return attribute;
  }
  public void setAttribute(AttributeEnum attribute) {
    this.attribute = attribute;
  }


  /**
   * The new value of the attribute. If the attribute is updated to this value this part of the condition will be met. Required for exact-match conditions (when operator is not set).
   **/
  public WorkitemOnAttributeChangeCondition newValue(String newValue) {
    this.newValue = newValue;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The new value of the attribute. If the attribute is updated to this value this part of the condition will be met. Required for exact-match conditions (when operator is not set).")
  @JsonProperty("newValue")
  public String getNewValue() {
    return newValue;
  }
  public void setNewValue(String newValue) {
    this.newValue = newValue;
  }


  /**
   * The old value of the attribute. If the attribute was updated from this value this part of the condition will be met.
   **/
  public WorkitemOnAttributeChangeCondition oldValue(String oldValue) {
    this.oldValue = oldValue;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The old value of the attribute. If the attribute was updated from this value this part of the condition will be met.")
  @JsonProperty("oldValue")
  public String getOldValue() {
    return oldValue;
  }
  public void setOldValue(String oldValue) {
    this.oldValue = oldValue;
  }


  /**
   * The comparison operator used to evaluate the priority attribute against the value. Only supported for the priority attribute.
   **/
  public WorkitemOnAttributeChangeCondition operator(OperatorEnum operator) {
    this.operator = operator;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The comparison operator used to evaluate the priority attribute against the value. Only supported for the priority attribute.")
  @JsonProperty("operator")
  public OperatorEnum getOperator() {
    return operator;
  }
  public void setOperator(OperatorEnum operator) {
    this.operator = operator;
  }


  /**
   * The numeric value compared against the priority attribute using the operator. Required when operator is set. Only supported for the priority attribute.
   **/
  public WorkitemOnAttributeChangeCondition value(Integer value) {
    this.value = value;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The numeric value compared against the priority attribute using the operator. Required when operator is set. Only supported for the priority attribute.")
  @JsonProperty("value")
  public Integer getValue() {
    return value;
  }
  public void setValue(Integer value) {
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
    WorkitemOnAttributeChangeCondition workitemOnAttributeChangeCondition = (WorkitemOnAttributeChangeCondition) o;

    return Objects.equals(this.attribute, workitemOnAttributeChangeCondition.attribute) &&
            Objects.equals(this.newValue, workitemOnAttributeChangeCondition.newValue) &&
            Objects.equals(this.oldValue, workitemOnAttributeChangeCondition.oldValue) &&
            Objects.equals(this.operator, workitemOnAttributeChangeCondition.operator) &&
            Objects.equals(this.value, workitemOnAttributeChangeCondition.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attribute, newValue, oldValue, operator, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkitemOnAttributeChangeCondition {\n");
    
    sb.append("    attribute: ").append(toIndentedString(attribute)).append("\n");
    sb.append("    newValue: ").append(toIndentedString(newValue)).append("\n");
    sb.append("    oldValue: ").append(toIndentedString(oldValue)).append("\n");
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

