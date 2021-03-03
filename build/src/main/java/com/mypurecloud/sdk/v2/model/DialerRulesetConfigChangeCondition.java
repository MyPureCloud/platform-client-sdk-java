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
   * Gets or Sets valueType
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
   * Gets or Sets operator
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
  private List<String> codes = new ArrayList<String>();

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
   * Gets or Sets propertyType
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
  private List<DialerRulesetConfigChangeContactColumnToDataActionFieldMapping> contactColumnToDataActionFieldMappings = new ArrayList<DialerRulesetConfigChangeContactColumnToDataActionFieldMapping>();
  private List<DialerRulesetConfigChangeDataActionConditionPredicate> predicates = new ArrayList<DialerRulesetConfigChangeDataActionConditionPredicate>();
  private DialerRulesetConfigChangeUriReference dataAction = null;
  private Object additionalProperties = null;

  
  /**
   **/
  public DialerRulesetConfigChangeCondition type(String type) {
    this.type = type;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("type")
  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
  }

  
  /**
   **/
  public DialerRulesetConfigChangeCondition inverted(Boolean inverted) {
    this.inverted = inverted;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("inverted")
  public Boolean getInverted() {
    return inverted;
  }
  public void setInverted(Boolean inverted) {
    this.inverted = inverted;
  }

  
  /**
   **/
  public DialerRulesetConfigChangeCondition attributeName(String attributeName) {
    this.attributeName = attributeName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("attributeName")
  public String getAttributeName() {
    return attributeName;
  }
  public void setAttributeName(String attributeName) {
    this.attributeName = attributeName;
  }

  
  /**
   **/
  public DialerRulesetConfigChangeCondition value(String value) {
    this.value = value;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("value")
  public String getValue() {
    return value;
  }
  public void setValue(String value) {
    this.value = value;
  }

  
  /**
   **/
  public DialerRulesetConfigChangeCondition valueType(ValueTypeEnum valueType) {
    this.valueType = valueType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("valueType")
  public ValueTypeEnum getValueType() {
    return valueType;
  }
  public void setValueType(ValueTypeEnum valueType) {
    this.valueType = valueType;
  }

  
  /**
   **/
  public DialerRulesetConfigChangeCondition operator(OperatorEnum operator) {
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
  public DialerRulesetConfigChangeCondition codes(List<String> codes) {
    this.codes = codes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("codes")
  public List<String> getCodes() {
    return codes;
  }
  public void setCodes(List<String> codes) {
    this.codes = codes;
  }

  
  /**
   **/
  public DialerRulesetConfigChangeCondition propertyType(PropertyTypeEnum propertyType) {
    this.propertyType = propertyType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("propertyType")
  public PropertyTypeEnum getPropertyType() {
    return propertyType;
  }
  public void setPropertyType(PropertyTypeEnum propertyType) {
    this.propertyType = propertyType;
  }

  
  /**
   **/
  public DialerRulesetConfigChangeCondition property(String property) {
    this.property = property;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("property")
  public String getProperty() {
    return property;
  }
  public void setProperty(String property) {
    this.property = property;
  }

  
  /**
   **/
  public DialerRulesetConfigChangeCondition dataNotFoundResolution(Boolean dataNotFoundResolution) {
    this.dataNotFoundResolution = dataNotFoundResolution;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("dataNotFoundResolution")
  public Boolean getDataNotFoundResolution() {
    return dataNotFoundResolution;
  }
  public void setDataNotFoundResolution(Boolean dataNotFoundResolution) {
    this.dataNotFoundResolution = dataNotFoundResolution;
  }

  
  /**
   **/
  public DialerRulesetConfigChangeCondition contactIdField(String contactIdField) {
    this.contactIdField = contactIdField;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("contactIdField")
  public String getContactIdField() {
    return contactIdField;
  }
  public void setContactIdField(String contactIdField) {
    this.contactIdField = contactIdField;
  }

  
  /**
   **/
  public DialerRulesetConfigChangeCondition callAnalysisResultField(String callAnalysisResultField) {
    this.callAnalysisResultField = callAnalysisResultField;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("callAnalysisResultField")
  public String getCallAnalysisResultField() {
    return callAnalysisResultField;
  }
  public void setCallAnalysisResultField(String callAnalysisResultField) {
    this.callAnalysisResultField = callAnalysisResultField;
  }

  
  /**
   **/
  public DialerRulesetConfigChangeCondition agentWrapupField(String agentWrapupField) {
    this.agentWrapupField = agentWrapupField;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("agentWrapupField")
  public String getAgentWrapupField() {
    return agentWrapupField;
  }
  public void setAgentWrapupField(String agentWrapupField) {
    this.agentWrapupField = agentWrapupField;
  }

  
  /**
   **/
  public DialerRulesetConfigChangeCondition contactColumnToDataActionFieldMappings(List<DialerRulesetConfigChangeContactColumnToDataActionFieldMapping> contactColumnToDataActionFieldMappings) {
    this.contactColumnToDataActionFieldMappings = contactColumnToDataActionFieldMappings;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("contactColumnToDataActionFieldMappings")
  public List<DialerRulesetConfigChangeContactColumnToDataActionFieldMapping> getContactColumnToDataActionFieldMappings() {
    return contactColumnToDataActionFieldMappings;
  }
  public void setContactColumnToDataActionFieldMappings(List<DialerRulesetConfigChangeContactColumnToDataActionFieldMapping> contactColumnToDataActionFieldMappings) {
    this.contactColumnToDataActionFieldMappings = contactColumnToDataActionFieldMappings;
  }

  
  /**
   **/
  public DialerRulesetConfigChangeCondition predicates(List<DialerRulesetConfigChangeDataActionConditionPredicate> predicates) {
    this.predicates = predicates;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("predicates")
  public List<DialerRulesetConfigChangeDataActionConditionPredicate> getPredicates() {
    return predicates;
  }
  public void setPredicates(List<DialerRulesetConfigChangeDataActionConditionPredicate> predicates) {
    this.predicates = predicates;
  }

  
  /**
   **/
  public DialerRulesetConfigChangeCondition dataAction(DialerRulesetConfigChangeUriReference dataAction) {
    this.dataAction = dataAction;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("dataAction")
  public DialerRulesetConfigChangeUriReference getDataAction() {
    return dataAction;
  }
  public void setDataAction(DialerRulesetConfigChangeUriReference dataAction) {
    this.dataAction = dataAction;
  }

  
  /**
   **/
  public DialerRulesetConfigChangeCondition additionalProperties(Object additionalProperties) {
    this.additionalProperties = additionalProperties;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("additionalProperties")
  public Object getAdditionalProperties() {
    return additionalProperties;
  }
  public void setAdditionalProperties(Object additionalProperties) {
    this.additionalProperties = additionalProperties;
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
    return Objects.equals(this.type, dialerRulesetConfigChangeCondition.type) &&
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
        Objects.equals(this.predicates, dialerRulesetConfigChangeCondition.predicates) &&
        Objects.equals(this.dataAction, dialerRulesetConfigChangeCondition.dataAction) &&
        Objects.equals(this.additionalProperties, dialerRulesetConfigChangeCondition.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, inverted, attributeName, value, valueType, operator, codes, propertyType, property, dataNotFoundResolution, contactIdField, callAnalysisResultField, agentWrapupField, contactColumnToDataActionFieldMappings, predicates, dataAction, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DialerRulesetConfigChangeCondition {\n");
    
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
    sb.append("    dataAction: ").append(toIndentedString(dataAction)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
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

