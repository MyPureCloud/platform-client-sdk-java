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
import com.mypurecloud.sdk.v2.model.ContactColumnToDataActionFieldMapping;
import com.mypurecloud.sdk.v2.model.DataActionConditionPredicate;
import com.mypurecloud.sdk.v2.model.DomainEntityRef;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * Condition
 */

public class Condition  implements Serializable {
  

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
   * The type of the condition.
   */
 @JsonDeserialize(using = TypeEnumDeserializer.class)
  public enum TypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    WRAPUPCONDITION("wrapupCondition"),
    CONTACTATTRIBUTECONDITION("contactAttributeCondition"),
    PHONENUMBERCONDITION("phoneNumberCondition"),
    PHONENUMBERTYPECONDITION("phoneNumberTypeCondition"),
    CALLANALYSISCONDITION("callAnalysisCondition"),
    CONTACTPROPERTYCONDITION("contactPropertyCondition"),
    DATAACTIONCONDITION("dataActionCondition");

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
   * The type of the value associated with this Condition. Not used for a DataActionCondition.
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
   * An operation with which to evaluate the Condition. Not used for a DataActionCondition.
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
    AFTER("AFTER"),
    IN("IN");

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
  private String property = null;

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
   * The type of the property associated with this Condition. Required for a contactPropertyCondition.
   */
 @JsonDeserialize(using = PropertyTypeEnumDeserializer.class)
  public enum PropertyTypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    LAST_ATTEMPT_BY_COLUMN("LAST_ATTEMPT_BY_COLUMN"),
    LAST_ATTEMPT_OVERALL("LAST_ATTEMPT_OVERALL"),
    LAST_WRAPUP_BY_COLUMN("LAST_WRAPUP_BY_COLUMN"),
    LAST_WRAPUP_OVERALL("LAST_WRAPUP_OVERALL");

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
  private DomainEntityRef dataAction = null;
  private Boolean dataNotFoundResolution = null;
  private String contactIdField = null;
  private String callAnalysisResultField = null;
  private String agentWrapupField = null;
  private List<ContactColumnToDataActionFieldMapping> contactColumnToDataActionFieldMappings = new ArrayList<ContactColumnToDataActionFieldMapping>();
  private List<DataActionConditionPredicate> predicates = new ArrayList<DataActionConditionPredicate>();

  
  /**
   * The type of the condition.
   **/
  public Condition type(TypeEnum type) {
    this.type = type;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The type of the condition.")
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
    this.type = type;
  }

  
  /**
   * If true, inverts the result of evaluating this Condition. Default is false.
   **/
  public Condition inverted(Boolean inverted) {
    this.inverted = inverted;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "If true, inverts the result of evaluating this Condition. Default is false.")
  @JsonProperty("inverted")
  public Boolean getInverted() {
    return inverted;
  }
  public void setInverted(Boolean inverted) {
    this.inverted = inverted;
  }

  
  /**
   * An attribute name associated with this Condition. Required for a contactAttributeCondition.
   **/
  public Condition attributeName(String attributeName) {
    this.attributeName = attributeName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "An attribute name associated with this Condition. Required for a contactAttributeCondition.")
  @JsonProperty("attributeName")
  public String getAttributeName() {
    return attributeName;
  }
  public void setAttributeName(String attributeName) {
    this.attributeName = attributeName;
  }

  
  /**
   * A value associated with this Condition. This could be text, a number, or a relative time. Not used for a DataActionCondition.
   **/
  public Condition value(String value) {
    this.value = value;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A value associated with this Condition. This could be text, a number, or a relative time. Not used for a DataActionCondition.")
  @JsonProperty("value")
  public String getValue() {
    return value;
  }
  public void setValue(String value) {
    this.value = value;
  }

  
  /**
   * The type of the value associated with this Condition. Not used for a DataActionCondition.
   **/
  public Condition valueType(ValueTypeEnum valueType) {
    this.valueType = valueType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The type of the value associated with this Condition. Not used for a DataActionCondition.")
  @JsonProperty("valueType")
  public ValueTypeEnum getValueType() {
    return valueType;
  }
  public void setValueType(ValueTypeEnum valueType) {
    this.valueType = valueType;
  }

  
  /**
   * An operation with which to evaluate the Condition. Not used for a DataActionCondition.
   **/
  public Condition operator(OperatorEnum operator) {
    this.operator = operator;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "An operation with which to evaluate the Condition. Not used for a DataActionCondition.")
  @JsonProperty("operator")
  public OperatorEnum getOperator() {
    return operator;
  }
  public void setOperator(OperatorEnum operator) {
    this.operator = operator;
  }

  
  /**
   * List of wrap-up code identifiers. Required for a wrapupCondition.
   **/
  public Condition codes(List<String> codes) {
    this.codes = codes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "List of wrap-up code identifiers. Required for a wrapupCondition.")
  @JsonProperty("codes")
  public List<String> getCodes() {
    return codes;
  }
  public void setCodes(List<String> codes) {
    this.codes = codes;
  }

  
  /**
   * A value associated with the property type of this Condition. Required for a contactPropertyCondition.
   **/
  public Condition property(String property) {
    this.property = property;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A value associated with the property type of this Condition. Required for a contactPropertyCondition.")
  @JsonProperty("property")
  public String getProperty() {
    return property;
  }
  public void setProperty(String property) {
    this.property = property;
  }

  
  /**
   * The type of the property associated with this Condition. Required for a contactPropertyCondition.
   **/
  public Condition propertyType(PropertyTypeEnum propertyType) {
    this.propertyType = propertyType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The type of the property associated with this Condition. Required for a contactPropertyCondition.")
  @JsonProperty("propertyType")
  public PropertyTypeEnum getPropertyType() {
    return propertyType;
  }
  public void setPropertyType(PropertyTypeEnum propertyType) {
    this.propertyType = propertyType;
  }

  
  /**
   * The Data Action to use for this condition. Required for a dataActionCondition.
   **/
  public Condition dataAction(DomainEntityRef dataAction) {
    this.dataAction = dataAction;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The Data Action to use for this condition. Required for a dataActionCondition.")
  @JsonProperty("dataAction")
  public DomainEntityRef getDataAction() {
    return dataAction;
  }
  public void setDataAction(DomainEntityRef dataAction) {
    this.dataAction = dataAction;
  }

  
  /**
   * The result of this condition if the data action returns a result indicating there was no data. Required for a DataActionCondition.
   **/
  public Condition dataNotFoundResolution(Boolean dataNotFoundResolution) {
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
  public Condition contactIdField(String contactIdField) {
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
  public Condition callAnalysisResultField(String callAnalysisResultField) {
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
  public Condition agentWrapupField(String agentWrapupField) {
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
  public Condition contactColumnToDataActionFieldMappings(List<ContactColumnToDataActionFieldMapping> contactColumnToDataActionFieldMappings) {
    this.contactColumnToDataActionFieldMappings = contactColumnToDataActionFieldMappings;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A list of mappings defining which contact data fields will be passed to which data action input fields for this condition. Valid for a dataActionCondition.")
  @JsonProperty("contactColumnToDataActionFieldMappings")
  public List<ContactColumnToDataActionFieldMapping> getContactColumnToDataActionFieldMappings() {
    return contactColumnToDataActionFieldMappings;
  }
  public void setContactColumnToDataActionFieldMappings(List<ContactColumnToDataActionFieldMapping> contactColumnToDataActionFieldMappings) {
    this.contactColumnToDataActionFieldMappings = contactColumnToDataActionFieldMappings;
  }

  
  /**
   * A list of predicates defining the comparisons to use for this condition. Required for a dataActionCondition.
   **/
  public Condition predicates(List<DataActionConditionPredicate> predicates) {
    this.predicates = predicates;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A list of predicates defining the comparisons to use for this condition. Required for a dataActionCondition.")
  @JsonProperty("predicates")
  public List<DataActionConditionPredicate> getPredicates() {
    return predicates;
  }
  public void setPredicates(List<DataActionConditionPredicate> predicates) {
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
    Condition condition = (Condition) o;
    return Objects.equals(this.type, condition.type) &&
        Objects.equals(this.inverted, condition.inverted) &&
        Objects.equals(this.attributeName, condition.attributeName) &&
        Objects.equals(this.value, condition.value) &&
        Objects.equals(this.valueType, condition.valueType) &&
        Objects.equals(this.operator, condition.operator) &&
        Objects.equals(this.codes, condition.codes) &&
        Objects.equals(this.property, condition.property) &&
        Objects.equals(this.propertyType, condition.propertyType) &&
        Objects.equals(this.dataAction, condition.dataAction) &&
        Objects.equals(this.dataNotFoundResolution, condition.dataNotFoundResolution) &&
        Objects.equals(this.contactIdField, condition.contactIdField) &&
        Objects.equals(this.callAnalysisResultField, condition.callAnalysisResultField) &&
        Objects.equals(this.agentWrapupField, condition.agentWrapupField) &&
        Objects.equals(this.contactColumnToDataActionFieldMappings, condition.contactColumnToDataActionFieldMappings) &&
        Objects.equals(this.predicates, condition.predicates);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, inverted, attributeName, value, valueType, operator, codes, property, propertyType, dataAction, dataNotFoundResolution, contactIdField, callAnalysisResultField, agentWrapupField, contactColumnToDataActionFieldMappings, predicates);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Condition {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    inverted: ").append(toIndentedString(inverted)).append("\n");
    sb.append("    attributeName: ").append(toIndentedString(attributeName)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    valueType: ").append(toIndentedString(valueType)).append("\n");
    sb.append("    operator: ").append(toIndentedString(operator)).append("\n");
    sb.append("    codes: ").append(toIndentedString(codes)).append("\n");
    sb.append("    property: ").append(toIndentedString(property)).append("\n");
    sb.append("    propertyType: ").append(toIndentedString(propertyType)).append("\n");
    sb.append("    dataAction: ").append(toIndentedString(dataAction)).append("\n");
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

