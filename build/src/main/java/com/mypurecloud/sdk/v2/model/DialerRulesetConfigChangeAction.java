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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import java.io.Serializable;
/**
 * DialerRulesetConfigChangeAction
 */

public class DialerRulesetConfigChangeAction  implements Serializable {
  
  private String type = null;
  private String actionTypeName = null;
  private String updateOption = null;
  private Map<String, String> properties = null;
  private Map<String, Object> additionalProperties = null;

  public DialerRulesetConfigChangeAction() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * Type of the action
   **/
  public DialerRulesetConfigChangeAction type(String type) {
    this.type = type;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Type of the action")
  @JsonProperty("type")
  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
  }


  /**
   * Identifier of the action
   **/
  public DialerRulesetConfigChangeAction actionTypeName(String actionTypeName) {
    this.actionTypeName = actionTypeName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Identifier of the action")
  @JsonProperty("actionTypeName")
  public String getActionTypeName() {
    return actionTypeName;
  }
  public void setActionTypeName(String actionTypeName) {
    this.actionTypeName = actionTypeName;
  }


  /**
   * Indicator of the type of update action (applicable only to certain types of actions)
   **/
  public DialerRulesetConfigChangeAction updateOption(String updateOption) {
    this.updateOption = updateOption;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Indicator of the type of update action (applicable only to certain types of actions)")
  @JsonProperty("updateOption")
  public String getUpdateOption() {
    return updateOption;
  }
  public void setUpdateOption(String updateOption) {
    this.updateOption = updateOption;
  }


  /**
   * Map of key-value pairs pertinent to the action (different actions require different properties)
   **/
  public DialerRulesetConfigChangeAction properties(Map<String, String> properties) {
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


  /**
   **/
  public DialerRulesetConfigChangeAction additionalProperties(Map<String, Object> additionalProperties) {
    this.additionalProperties = additionalProperties;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("additionalProperties")
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }
  public void setAdditionalProperties(Map<String, Object> additionalProperties) {
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
    DialerRulesetConfigChangeAction dialerRulesetConfigChangeAction = (DialerRulesetConfigChangeAction) o;

    return Objects.equals(this.type, dialerRulesetConfigChangeAction.type) &&
            Objects.equals(this.actionTypeName, dialerRulesetConfigChangeAction.actionTypeName) &&
            Objects.equals(this.updateOption, dialerRulesetConfigChangeAction.updateOption) &&
            Objects.equals(this.properties, dialerRulesetConfigChangeAction.properties) &&
            Objects.equals(this.additionalProperties, dialerRulesetConfigChangeAction.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, actionTypeName, updateOption, properties, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DialerRulesetConfigChangeAction {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    actionTypeName: ").append(toIndentedString(actionTypeName)).append("\n");
    sb.append("    updateOption: ").append(toIndentedString(updateOption)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
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

