package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import java.io.Serializable;
/**
 * DialerAction
 */

public class DialerAction  implements Serializable {
  

  /**
   * Type of the action
   */
  public enum TypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    ACTION("Action"),
    MODIFYCONTACTATTRIBUTE("modifyContactAttribute");

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

  /**
   * Identifier of the action
   */
  public enum ActionTypeNameEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    DO_NOT_DIAL("DO_NOT_DIAL"),
    MODIFY_CONTACT_ATTRIBUTE("MODIFY_CONTACT_ATTRIBUTE"),
    SWITCH_TO_PREVIEW("SWITCH_TO_PREVIEW"),
    APPEND_NUMBER_TO_DNC_LIST("APPEND_NUMBER_TO_DNC_LIST"),
    SCHEDULE_CALLBACK("SCHEDULE_CALLBACK"),
    CONTACT_UNCALLABLE("CONTACT_UNCALLABLE"),
    NUMBER_UNCALLABLE("NUMBER_UNCALLABLE"),
    SET_CALLER_ID("SET_CALLER_ID"),
    SET_SKILLS("SET_SKILLS");

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

  /**
   * Indicator of the type of update action (applicable only to certain types of actions)
   */
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
  private Map<String, String> properties = new HashMap<String, String>();

  
  /**
   * Type of the action
   **/
  public DialerAction type(TypeEnum type) {
    this.type = type;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Type of the action")
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
    this.type = type;
  }

  
  /**
   * Identifier of the action
   **/
  public DialerAction actionTypeName(ActionTypeNameEnum actionTypeName) {
    this.actionTypeName = actionTypeName;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Identifier of the action")
  @JsonProperty("actionTypeName")
  public ActionTypeNameEnum getActionTypeName() {
    return actionTypeName;
  }
  public void setActionTypeName(ActionTypeNameEnum actionTypeName) {
    this.actionTypeName = actionTypeName;
  }

  
  /**
   * Indicator of the type of update action (applicable only to certain types of actions)
   **/
  public DialerAction updateOption(UpdateOptionEnum updateOption) {
    this.updateOption = updateOption;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Indicator of the type of update action (applicable only to certain types of actions)")
  @JsonProperty("updateOption")
  public UpdateOptionEnum getUpdateOption() {
    return updateOption;
  }
  public void setUpdateOption(UpdateOptionEnum updateOption) {
    this.updateOption = updateOption;
  }

  
  /**
   * Map of key-value pairs pertinent to the action (different actions require different properties)
   **/
  public DialerAction properties(Map<String, String> properties) {
    this.properties = properties;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Map of key-value pairs pertinent to the action (different actions require different properties)")
  @JsonProperty("properties")
  public Map<String, String> getProperties() {
    return properties;
  }
  public void setProperties(Map<String, String> properties) {
    this.properties = properties;
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
        Objects.equals(this.properties, dialerAction.properties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, actionTypeName, updateOption, properties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DialerAction {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    actionTypeName: ").append(toIndentedString(actionTypeName)).append("\n");
    sb.append("    updateOption: ").append(toIndentedString(updateOption)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
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

