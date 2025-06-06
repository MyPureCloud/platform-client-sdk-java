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
import com.mypurecloud.sdk.v2.model.ContactColumnToDataActionFieldMapping;
import com.mypurecloud.sdk.v2.model.DomainEntityRef;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import java.io.Serializable;
/**
 * DialerAction
 */

public class DialerAction  implements Serializable {
  

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
   * The type of this DialerAction.
   */
 @JsonDeserialize(using = TypeEnumDeserializer.class)
  public enum TypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    ACTION("Action"),
    MODIFYCONTACTATTRIBUTE("modifyContactAttribute"),
    DATAACTIONBEHAVIOR("dataActionBehavior");

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

  private static class ActionTypeNameEnumDeserializer extends StdDeserializer<ActionTypeNameEnum> {
    public ActionTypeNameEnumDeserializer() {
      super(ActionTypeNameEnumDeserializer.class);
    }

    @Override
    public ActionTypeNameEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return ActionTypeNameEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Additional type specification for this DialerAction.
   */
 @JsonDeserialize(using = ActionTypeNameEnumDeserializer.class)
  public enum ActionTypeNameEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    DO_NOT_DIAL("DO_NOT_DIAL"),
    MODIFY_CONTACT_ATTRIBUTE("MODIFY_CONTACT_ATTRIBUTE"),
    SWITCH_TO_PREVIEW("SWITCH_TO_PREVIEW"),
    APPEND_NUMBER_TO_DNC_LIST("APPEND_NUMBER_TO_DNC_LIST"),
    APPEND_CUSTOM_ENTRY_TO_DNC_LIST("APPEND_CUSTOM_ENTRY_TO_DNC_LIST"),
    SCHEDULE_CALLBACK("SCHEDULE_CALLBACK"),
    CONTACT_UNCALLABLE("CONTACT_UNCALLABLE"),
    NUMBER_UNCALLABLE("NUMBER_UNCALLABLE"),
    SET_CALLER_ID("SET_CALLER_ID"),
    SET_SKILLS("SET_SKILLS"),
    DATA_ACTION("DATA_ACTION");

    private String value;

    ActionTypeNameEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static ActionTypeNameEnum fromString(String key) {
      if (key == null) return null;

      for (ActionTypeNameEnum value : ActionTypeNameEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return ActionTypeNameEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private ActionTypeNameEnum actionTypeName = null;

  private static class UpdateOptionEnumDeserializer extends StdDeserializer<UpdateOptionEnum> {
    public UpdateOptionEnumDeserializer() {
      super(UpdateOptionEnumDeserializer.class);
    }

    @Override
    public UpdateOptionEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return UpdateOptionEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Specifies how a contact attribute should be updated. Required for MODIFY_CONTACT_ATTRIBUTE.
   */
 @JsonDeserialize(using = UpdateOptionEnumDeserializer.class)
  public enum UpdateOptionEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    SET("SET"),
    INCREMENT("INCREMENT"),
    DECREMENT("DECREMENT"),
    CURRENT_TIME("CURRENT_TIME");

    private String value;

    UpdateOptionEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static UpdateOptionEnum fromString(String key) {
      if (key == null) return null;

      for (UpdateOptionEnum value : UpdateOptionEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return UpdateOptionEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private UpdateOptionEnum updateOption = null;
  private Map<String, String> properties = null;
  private DomainEntityRef dataAction = null;
  private List<ContactColumnToDataActionFieldMapping> contactColumnToDataActionFieldMappings = null;
  private String contactIdField = null;
  private String callAnalysisResultField = null;
  private String agentWrapupField = null;

  public DialerAction() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      contactColumnToDataActionFieldMappings = new ArrayList<ContactColumnToDataActionFieldMapping>();
    }
  }

  
  /**
   * The type of this DialerAction.
   **/
  public DialerAction type(TypeEnum type) {
    this.type = type;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The type of this DialerAction.")
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
    this.type = type;
  }


  /**
   * Additional type specification for this DialerAction.
   **/
  public DialerAction actionTypeName(ActionTypeNameEnum actionTypeName) {
    this.actionTypeName = actionTypeName;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Additional type specification for this DialerAction.")
  @JsonProperty("actionTypeName")
  public ActionTypeNameEnum getActionTypeName() {
    return actionTypeName;
  }
  public void setActionTypeName(ActionTypeNameEnum actionTypeName) {
    this.actionTypeName = actionTypeName;
  }


  /**
   * Specifies how a contact attribute should be updated. Required for MODIFY_CONTACT_ATTRIBUTE.
   **/
  public DialerAction updateOption(UpdateOptionEnum updateOption) {
    this.updateOption = updateOption;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Specifies how a contact attribute should be updated. Required for MODIFY_CONTACT_ATTRIBUTE.")
  @JsonProperty("updateOption")
  public UpdateOptionEnum getUpdateOption() {
    return updateOption;
  }
  public void setUpdateOption(UpdateOptionEnum updateOption) {
    this.updateOption = updateOption;
  }


  /**
   * A map of key-value pairs pertinent to the DialerAction. Different types of DialerActions require different properties. MODIFY_CONTACT_ATTRIBUTE with an updateOption of SET takes a contact column as the key and accepts any value. SCHEDULE_CALLBACK takes a key 'callbackOffset' that specifies how far in the future the callback should be scheduled, in minutes. SET_CALLER_ID takes two keys: 'callerAddress', which should be the caller id phone number, and 'callerName'. For either key, you can also specify a column on the contact to get the value from. To do this, specify 'contact.Column', where 'Column' is the name of the contact column from which to get the value. SET_SKILLS takes a key 'skills' with an array of skill ids wrapped into a string (Example: {'skills': '['skillIdHere']'} ).
   **/
  public DialerAction properties(Map<String, String> properties) {
    this.properties = properties;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A map of key-value pairs pertinent to the DialerAction. Different types of DialerActions require different properties. MODIFY_CONTACT_ATTRIBUTE with an updateOption of SET takes a contact column as the key and accepts any value. SCHEDULE_CALLBACK takes a key 'callbackOffset' that specifies how far in the future the callback should be scheduled, in minutes. SET_CALLER_ID takes two keys: 'callerAddress', which should be the caller id phone number, and 'callerName'. For either key, you can also specify a column on the contact to get the value from. To do this, specify 'contact.Column', where 'Column' is the name of the contact column from which to get the value. SET_SKILLS takes a key 'skills' with an array of skill ids wrapped into a string (Example: {'skills': '['skillIdHere']'} ).")
  @JsonProperty("properties")
  public Map<String, String> getProperties() {
    return properties;
  }
  public void setProperties(Map<String, String> properties) {
    this.properties = properties;
  }


  /**
   * The Data Action to use for this action. Required for a dataActionBehavior.
   **/
  public DialerAction dataAction(DomainEntityRef dataAction) {
    this.dataAction = dataAction;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The Data Action to use for this action. Required for a dataActionBehavior.")
  @JsonProperty("dataAction")
  public DomainEntityRef getDataAction() {
    return dataAction;
  }
  public void setDataAction(DomainEntityRef dataAction) {
    this.dataAction = dataAction;
  }


  /**
   * A list of mappings defining which contact data fields will be passed to which data action input fields for this condition. Valid for a dataActionBehavior.
   **/
  public DialerAction contactColumnToDataActionFieldMappings(List<ContactColumnToDataActionFieldMapping> contactColumnToDataActionFieldMappings) {
    this.contactColumnToDataActionFieldMappings = contactColumnToDataActionFieldMappings;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A list of mappings defining which contact data fields will be passed to which data action input fields for this condition. Valid for a dataActionBehavior.")
  @JsonProperty("contactColumnToDataActionFieldMappings")
  public List<ContactColumnToDataActionFieldMapping> getContactColumnToDataActionFieldMappings() {
    return contactColumnToDataActionFieldMappings;
  }
  public void setContactColumnToDataActionFieldMappings(List<ContactColumnToDataActionFieldMapping> contactColumnToDataActionFieldMappings) {
    this.contactColumnToDataActionFieldMappings = contactColumnToDataActionFieldMappings;
  }


  /**
   * The input field from the data action that the contactId will be passed to for this condition. Valid for a dataActionBehavior.
   **/
  public DialerAction contactIdField(String contactIdField) {
    this.contactIdField = contactIdField;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The input field from the data action that the contactId will be passed to for this condition. Valid for a dataActionBehavior.")
  @JsonProperty("contactIdField")
  public String getContactIdField() {
    return contactIdField;
  }
  public void setContactIdField(String contactIdField) {
    this.contactIdField = contactIdField;
  }


  /**
   * The input field from the data action that the callAnalysisResult will be passed to for this condition. Valid for a wrapup dataActionBehavior.
   **/
  public DialerAction callAnalysisResultField(String callAnalysisResultField) {
    this.callAnalysisResultField = callAnalysisResultField;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The input field from the data action that the callAnalysisResult will be passed to for this condition. Valid for a wrapup dataActionBehavior.")
  @JsonProperty("callAnalysisResultField")
  public String getCallAnalysisResultField() {
    return callAnalysisResultField;
  }
  public void setCallAnalysisResultField(String callAnalysisResultField) {
    this.callAnalysisResultField = callAnalysisResultField;
  }


  /**
   * The input field from the data action that the agentWrapup will be passed to for this condition. Valid for a wrapup dataActionBehavior.
   **/
  public DialerAction agentWrapupField(String agentWrapupField) {
    this.agentWrapupField = agentWrapupField;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The input field from the data action that the agentWrapup will be passed to for this condition. Valid for a wrapup dataActionBehavior.")
  @JsonProperty("agentWrapupField")
  public String getAgentWrapupField() {
    return agentWrapupField;
  }
  public void setAgentWrapupField(String agentWrapupField) {
    this.agentWrapupField = agentWrapupField;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DialerAction dialerAction = (DialerAction) o;

    return Objects.equals(this.type, dialerAction.type) &&
            Objects.equals(this.actionTypeName, dialerAction.actionTypeName) &&
            Objects.equals(this.updateOption, dialerAction.updateOption) &&
            Objects.equals(this.properties, dialerAction.properties) &&
            Objects.equals(this.dataAction, dialerAction.dataAction) &&
            Objects.equals(this.contactColumnToDataActionFieldMappings, dialerAction.contactColumnToDataActionFieldMappings) &&
            Objects.equals(this.contactIdField, dialerAction.contactIdField) &&
            Objects.equals(this.callAnalysisResultField, dialerAction.callAnalysisResultField) &&
            Objects.equals(this.agentWrapupField, dialerAction.agentWrapupField);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, actionTypeName, updateOption, properties, dataAction, contactColumnToDataActionFieldMappings, contactIdField, callAnalysisResultField, agentWrapupField);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DialerAction {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    actionTypeName: ").append(toIndentedString(actionTypeName)).append("\n");
    sb.append("    updateOption: ").append(toIndentedString(updateOption)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
    sb.append("    dataAction: ").append(toIndentedString(dataAction)).append("\n");
    sb.append("    contactColumnToDataActionFieldMappings: ").append(toIndentedString(contactColumnToDataActionFieldMappings)).append("\n");
    sb.append("    contactIdField: ").append(toIndentedString(contactIdField)).append("\n");
    sb.append("    callAnalysisResultField: ").append(toIndentedString(callAnalysisResultField)).append("\n");
    sb.append("    agentWrapupField: ").append(toIndentedString(agentWrapupField)).append("\n");
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

