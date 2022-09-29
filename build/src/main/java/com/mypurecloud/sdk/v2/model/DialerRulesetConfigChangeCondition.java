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
import com.fasterxml.jackson.annotation.JsonValue;
import com.mypurecloud.sdk.v2.model.DialerRulesetConfigChangeContactColumnToDataActionFieldMapping;
import com.mypurecloud.sdk.v2.model.DialerRulesetConfigChangeDataActionConditionPredicate;
import com.mypurecloud.sdk.v2.model.DialerRulesetConfigChangeUriReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * DialerRulesetConfigChangeCondition
 */

public class DialerRulesetConfigChangeCondition  implements Serializable {
  
  private DialerRulesetConfigChangeUriReference dataAction = null;
  private String type = null;
  private Boolean inverted = null;
  private String attributeName = null;
  private String value = null;

  private static class ValueTypeEnumDeserializer extends StdDeserializer<ValueTypeEnum> {
    public ValueTypeEnumDeserializer() {
      super(ValueTypeEnumDeserializer.class);
    }

    @Override
    public ValueTypeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return ValueTypeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Determines the type of the value associated with the condition
   */
 @JsonDeserialize(using = ValueTypeEnumDeserializer.class)
  public enum ValueTypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    STRING("STRING"),
    NUMERIC("NUMERIC"),
    DATETIME("DATETIME"),
    PERIOD("PERIOD");

    private String value;

    ValueTypeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static ValueTypeEnum fromString(String key) {
      if (key == null) return null;

      for (ValueTypeEnum value : ValueTypeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return ValueTypeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private ValueTypeEnum valueType = null;

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
   * An operation type for condition evaluation
   */
 @JsonDeserialize(using = OperatorEnumDeserializer.class)
  public enum OperatorEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    EQUALS("EQUALS"),
    LESS_THAN("LESS_THAN"),
    LESS_THAN_EQUALS("LESS_THAN_EQUALS"),
    GREATER_THAN("GREATER_THAN"),
    GREATER_THAN_EQUALS("GREATER_THAN_EQUALS"),
    CONTAINS("CONTAINS"),
    BEGINS_WITH("BEGINS_WITH"),
    ENDS_WITH("ENDS_WITH"),
    BEFORE("BEFORE"),
    AFTER("AFTER");

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
  private List<String> codes = null;

  private static class PropertyTypeEnumDeserializer extends StdDeserializer<PropertyTypeEnum> {
    public PropertyTypeEnumDeserializer() {
      super(PropertyTypeEnumDeserializer.class);
    }

    @Override
    public PropertyTypeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return PropertyTypeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Determines the type of the property associated with the condition
   */
 @JsonDeserialize(using = PropertyTypeEnumDeserializer.class)
  public enum PropertyTypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    LAST_ATTEMPT_BY_COLUMN("LAST_ATTEMPT_BY_COLUMN"),
    LAST_ATTEMPT_OVERALL("LAST_ATTEMPT_OVERALL"),
    LAST_RESULT_BY_COLUMN("LAST_RESULT_BY_COLUMN"),
    LAST_RESULT_OVERALL("LAST_RESULT_OVERALL");

    private String value;

    PropertyTypeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static PropertyTypeEnum fromString(String key) {
      if (key == null) return null;

      for (PropertyTypeEnum value : PropertyTypeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return PropertyTypeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private PropertyTypeEnum propertyType = null;
  private String property = null;
  private Boolean dataNotFoundResolution = null;
  private String contactIdField = null;
  private String callAnalysisResultField = null;
  private String agentWrapupField = null;
  private List<DialerRulesetConfigChangeContactColumnToDataActionFieldMapping> contactColumnToDataActionFieldMappings = null;
  private List<DialerRulesetConfigChangeDataActionConditionPredicate> predicates = null;

  
  /**
   * A UriReference for a resource
   **/
  public DialerRulesetConfigChangeCondition dataAction(DialerRulesetConfigChangeUriReference dataAction) {
    this.dataAction = dataAction;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A UriReference for a resource")
  @JsonProperty("dataAction")
  public DialerRulesetConfigChangeUriReference getDataAction() {
    return dataAction;
  }
  public void setDataAction(DialerRulesetConfigChangeUriReference dataAction) {
    this.dataAction = dataAction;
  }


  /**
   * The type of the condition
   **/
  public DialerRulesetConfigChangeCondition type(String type) {
    this.type = type;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The type of the condition")
  @JsonProperty("type")
  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
  }


  /**
   * Indicates whether to evaluate for the opposite of the stated condition; default is false
   **/
  public DialerRulesetConfigChangeCondition inverted(Boolean inverted) {
    this.inverted = inverted;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Indicates whether to evaluate for the opposite of the stated condition; default is false")
  @JsonProperty("inverted")
  public Boolean getInverted() {
    return inverted;
  }
  public void setInverted(Boolean inverted) {
    this.inverted = inverted;
  }


  /**
   * An attribute name associated with the condition (applies only to certain rule conditions)
   **/
  public DialerRulesetConfigChangeCondition attributeName(String attributeName) {
    this.attributeName = attributeName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "An attribute name associated with the condition (applies only to certain rule conditions)")
  @JsonProperty("attributeName")
  public String getAttributeName() {
    return attributeName;
  }
  public void setAttributeName(String attributeName) {
    this.attributeName = attributeName;
  }


  /**
   * A value associated with the condition
   **/
  public DialerRulesetConfigChangeCondition value(String value) {
    this.value = value;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A value associated with the condition")
  @JsonProperty("value")
  public String getValue() {
    return value;
  }
  public void setValue(String value) {
    this.value = value;
  }


  /**
   * Determines the type of the value associated with the condition
   **/
  public DialerRulesetConfigChangeCondition valueType(ValueTypeEnum valueType) {
    this.valueType = valueType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Determines the type of the value associated with the condition")
  @JsonProperty("valueType")
  public ValueTypeEnum getValueType() {
    return valueType;
  }
  public void setValueType(ValueTypeEnum valueType) {
    this.valueType = valueType;
  }


  /**
   * An operation type for condition evaluation
   **/
  public DialerRulesetConfigChangeCondition operator(OperatorEnum operator) {
    this.operator = operator;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "An operation type for condition evaluation")
  @JsonProperty("operator")
  public OperatorEnum getOperator() {
    return operator;
  }
  public void setOperator(OperatorEnum operator) {
    this.operator = operator;
  }


  /**
   * List of wrap-up code identifiers (used only in conditions of type 'wrapupCondition')
   **/
  public DialerRulesetConfigChangeCondition codes(List<String> codes) {
    this.codes = codes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "List of wrap-up code identifiers (used only in conditions of type 'wrapupCondition')")
  @JsonProperty("codes")
  public List<String> getCodes() {
    return codes;
  }
  public void setCodes(List<String> codes) {
    this.codes = codes;
  }


  /**
   * Determines the type of the property associated with the condition
   **/
  public DialerRulesetConfigChangeCondition propertyType(PropertyTypeEnum propertyType) {
    this.propertyType = propertyType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Determines the type of the property associated with the condition")
  @JsonProperty("propertyType")
  public PropertyTypeEnum getPropertyType() {
    return propertyType;
  }
  public void setPropertyType(PropertyTypeEnum propertyType) {
    this.propertyType = propertyType;
  }


  /**
   * A value associated with the property type of this condition
   **/
  public DialerRulesetConfigChangeCondition property(String property) {
    this.property = property;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A value associated with the property type of this condition")
  @JsonProperty("property")
  public String getProperty() {
    return property;
  }
  public void setProperty(String property) {
    this.property = property;
  }


  /**
   * The result of this condition if the data action returns a result indicating there was no data. Required for a DataActionCondition.
   **/
  public DialerRulesetConfigChangeCondition dataNotFoundResolution(Boolean dataNotFoundResolution) {
    this.dataNotFoundResolution = dataNotFoundResolution;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The result of this condition if the data action returns a result indicating there was no data. Required for a DataActionCondition.")
  @JsonProperty("dataNotFoundResolution")
  public Boolean getDataNotFoundResolution() {
    return dataNotFoundResolution;
  }
  public void setDataNotFoundResolution(Boolean dataNotFoundResolution) {
    this.dataNotFoundResolution = dataNotFoundResolution;
  }


  /**
   * The input field from the data action that the contactId will be passed to for this condition. Valid for a dataActionCondition.
   **/
  public DialerRulesetConfigChangeCondition contactIdField(String contactIdField) {
    this.contactIdField = contactIdField;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The input field from the data action that the contactId will be passed to for this condition. Valid for a dataActionCondition.")
  @JsonProperty("contactIdField")
  public String getContactIdField() {
    return contactIdField;
  }
  public void setContactIdField(String contactIdField) {
    this.contactIdField = contactIdField;
  }


  /**
   * The input field from the data action that the callAnalysisResult will be passed to for this condition. Valid for a wrapup dataActionCondition.
   **/
  public DialerRulesetConfigChangeCondition callAnalysisResultField(String callAnalysisResultField) {
    this.callAnalysisResultField = callAnalysisResultField;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The input field from the data action that the callAnalysisResult will be passed to for this condition. Valid for a wrapup dataActionCondition.")
  @JsonProperty("callAnalysisResultField")
  public String getCallAnalysisResultField() {
    return callAnalysisResultField;
  }
  public void setCallAnalysisResultField(String callAnalysisResultField) {
    this.callAnalysisResultField = callAnalysisResultField;
  }


  /**
   * The input field from the data action that the agentWrapup will be passed to for this condition. Valid for a wrapup dataActionCondition.
   **/
  public DialerRulesetConfigChangeCondition agentWrapupField(String agentWrapupField) {
    this.agentWrapupField = agentWrapupField;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The input field from the data action that the agentWrapup will be passed to for this condition. Valid for a wrapup dataActionCondition.")
  @JsonProperty("agentWrapupField")
  public String getAgentWrapupField() {
    return agentWrapupField;
  }
  public void setAgentWrapupField(String agentWrapupField) {
    this.agentWrapupField = agentWrapupField;
  }


  /**
   * A list of mappings defining which contact data fields will be passed to which data action input fields for this condition. Valid for a dataActionCondition.
   **/
  public DialerRulesetConfigChangeCondition contactColumnToDataActionFieldMappings(List<DialerRulesetConfigChangeContactColumnToDataActionFieldMapping> contactColumnToDataActionFieldMappings) {
    this.contactColumnToDataActionFieldMappings = contactColumnToDataActionFieldMappings;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A list of mappings defining which contact data fields will be passed to which data action input fields for this condition. Valid for a dataActionCondition.")
  @JsonProperty("contactColumnToDataActionFieldMappings")
  public List<DialerRulesetConfigChangeContactColumnToDataActionFieldMapping> getContactColumnToDataActionFieldMappings() {
    return contactColumnToDataActionFieldMappings;
  }
  public void setContactColumnToDataActionFieldMappings(List<DialerRulesetConfigChangeContactColumnToDataActionFieldMapping> contactColumnToDataActionFieldMappings) {
    this.contactColumnToDataActionFieldMappings = contactColumnToDataActionFieldMappings;
  }


  /**
   * A list of predicates defining the comparisons to use for this condition. Required for a dataActionCondition.
   **/
  public DialerRulesetConfigChangeCondition predicates(List<DialerRulesetConfigChangeDataActionConditionPredicate> predicates) {
    this.predicates = predicates;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A list of predicates defining the comparisons to use for this condition. Required for a dataActionCondition.")
  @JsonProperty("predicates")
  public List<DialerRulesetConfigChangeDataActionConditionPredicate> getPredicates() {
    return predicates;
  }
  public void setPredicates(List<DialerRulesetConfigChangeDataActionConditionPredicate> predicates) {
    this.predicates = predicates;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DialerRulesetConfigChangeCondition dialerRulesetConfigChangeCondition = (DialerRulesetConfigChangeCondition) o;

    return Objects.equals(this.dataAction, dialerRulesetConfigChangeCondition.dataAction) &&
            Objects.equals(this.type, dialerRulesetConfigChangeCondition.type) &&
            Objects.equals(this.inverted, dialerRulesetConfigChangeCondition.inverted) &&
            Objects.equals(this.attributeName, dialerRulesetConfigChangeCondition.attributeName) &&
            Objects.equals(this.value, dialerRulesetConfigChangeCondition.value) &&
            Objects.equals(this.valueType, dialerRulesetConfigChangeCondition.valueType) &&
            Objects.equals(this.operator, dialerRulesetConfigChangeCondition.operator) &&
            Objects.equals(this.codes, dialerRulesetConfigChangeCondition.codes) &&
            Objects.equals(this.propertyType, dialerRulesetConfigChangeCondition.propertyType) &&
            Objects.equals(this.property, dialerRulesetConfigChangeCondition.property) &&
            Objects.equals(this.dataNotFoundResolution, dialerRulesetConfigChangeCondition.dataNotFoundResolution) &&
            Objects.equals(this.contactIdField, dialerRulesetConfigChangeCondition.contactIdField) &&
            Objects.equals(this.callAnalysisResultField, dialerRulesetConfigChangeCondition.callAnalysisResultField) &&
            Objects.equals(this.agentWrapupField, dialerRulesetConfigChangeCondition.agentWrapupField) &&
            Objects.equals(this.contactColumnToDataActionFieldMappings, dialerRulesetConfigChangeCondition.contactColumnToDataActionFieldMappings) &&
            Objects.equals(this.predicates, dialerRulesetConfigChangeCondition.predicates);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dataAction, type, inverted, attributeName, value, valueType, operator, codes, propertyType, property, dataNotFoundResolution, contactIdField, callAnalysisResultField, agentWrapupField, contactColumnToDataActionFieldMappings, predicates);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DialerRulesetConfigChangeCondition {\n");
    
    sb.append("    dataAction: ").append(toIndentedString(dataAction)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    inverted: ").append(toIndentedString(inverted)).append("\n");
    sb.append("    attributeName: ").append(toIndentedString(attributeName)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    valueType: ").append(toIndentedString(valueType)).append("\n");
    sb.append("    operator: ").append(toIndentedString(operator)).append("\n");
    sb.append("    codes: ").append(toIndentedString(codes)).append("\n");
    sb.append("    propertyType: ").append(toIndentedString(propertyType)).append("\n");
    sb.append("    property: ").append(toIndentedString(property)).append("\n");
    sb.append("    dataNotFoundResolution: ").append(toIndentedString(dataNotFoundResolution)).append("\n");
    sb.append("    contactIdField: ").append(toIndentedString(contactIdField)).append("\n");
    sb.append("    callAnalysisResultField: ").append(toIndentedString(callAnalysisResultField)).append("\n");
    sb.append("    agentWrapupField: ").append(toIndentedString(agentWrapupField)).append("\n");
    sb.append("    contactColumnToDataActionFieldMappings: ").append(toIndentedString(contactColumnToDataActionFieldMappings)).append("\n");
    sb.append("    predicates: ").append(toIndentedString(predicates)).append("\n");
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

