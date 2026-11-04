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
    EXTERNALTAG("externalTag");

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
   * How the attribute's new value is compared against newValue. Required for the priority attribute; not permitted otherwise.
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
   * The value the attribute's new value is compared against. Compared for equality unless an operator is supplied. Null matches the attribute having been cleared, on clearable attributes.
   **/
  public WorkitemOnAttributeChangeCondition newValue(String newValue) {
    this.newValue = newValue;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The value the attribute's new value is compared against. Compared for equality unless an operator is supplied. Null matches the attribute having been cleared, on clearable attributes.")
  @JsonProperty("newValue")
  public String getNewValue() {
    return newValue;
  }
  public void setNewValue(String newValue) {
    this.newValue = newValue;
  }


  /**
   * The value the attribute is transitioning from. Not permitted for the priority attribute. Omitted or null matches any previous value.
   **/
  public WorkitemOnAttributeChangeCondition oldValue(String oldValue) {
    this.oldValue = oldValue;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The value the attribute is transitioning from. Not permitted for the priority attribute. Omitted or null matches any previous value.")
  @JsonProperty("oldValue")
  public String getOldValue() {
    return oldValue;
  }
  public void setOldValue(String oldValue) {
    this.oldValue = oldValue;
  }


  /**
   * How the attribute's new value is compared against newValue. Required for the priority attribute; not permitted otherwise.
   **/
  public WorkitemOnAttributeChangeCondition operator(OperatorEnum operator) {
    this.operator = operator;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "How the attribute's new value is compared against newValue. Required for the priority attribute; not permitted otherwise.")
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
    WorkitemOnAttributeChangeCondition workitemOnAttributeChangeCondition = (WorkitemOnAttributeChangeCondition) o;

    return Objects.equals(this.attribute, workitemOnAttributeChangeCondition.attribute) &&
            Objects.equals(this.newValue, workitemOnAttributeChangeCondition.newValue) &&
            Objects.equals(this.oldValue, workitemOnAttributeChangeCondition.oldValue) &&
            Objects.equals(this.operator, workitemOnAttributeChangeCondition.operator);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attribute, newValue, oldValue, operator);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkitemOnAttributeChangeCondition {\n");
    
    sb.append("    attribute: ").append(toIndentedString(attribute)).append("\n");
    sb.append("    newValue: ").append(toIndentedString(newValue)).append("\n");
    sb.append("    oldValue: ").append(toIndentedString(oldValue)).append("\n");
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

