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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import java.io.Serializable;
/**
 * FieldList
 */

public class FieldList  implements Serializable {
  
  private Boolean customLabels = null;
  private String instructionText = null;
  private String key = null;
  private List<String> labelKeys = new ArrayList<String>();
  private Map<String, Object> params = null;
  private Boolean repeatable = null;
  private String state = null;
  private String type = null;
  private Boolean required = null;
  private Boolean gdpr = null;

  
  /**
   **/
  public FieldList customLabels(Boolean customLabels) {
    this.customLabels = customLabels;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("customLabels")
  public Boolean getCustomLabels() {
    return customLabels;
  }
  public void setCustomLabels(Boolean customLabels) {
    this.customLabels = customLabels;
  }

  
  /**
   **/
  public FieldList instructionText(String instructionText) {
    this.instructionText = instructionText;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("instructionText")
  public String getInstructionText() {
    return instructionText;
  }
  public void setInstructionText(String instructionText) {
    this.instructionText = instructionText;
  }

  
  /**
   **/
  public FieldList key(String key) {
    this.key = key;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("key")
  public String getKey() {
    return key;
  }
  public void setKey(String key) {
    this.key = key;
  }

  
  /**
   **/
  public FieldList labelKeys(List<String> labelKeys) {
    this.labelKeys = labelKeys;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("labelKeys")
  public List<String> getLabelKeys() {
    return labelKeys;
  }
  public void setLabelKeys(List<String> labelKeys) {
    this.labelKeys = labelKeys;
  }

  
  /**
   **/
  public FieldList params(Map<String, Object> params) {
    this.params = params;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("params")
  public Map<String, Object> getParams() {
    return params;
  }
  public void setParams(Map<String, Object> params) {
    this.params = params;
  }

  
  /**
   **/
  public FieldList repeatable(Boolean repeatable) {
    this.repeatable = repeatable;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("repeatable")
  public Boolean getRepeatable() {
    return repeatable;
  }
  public void setRepeatable(Boolean repeatable) {
    this.repeatable = repeatable;
  }

  
  /**
   **/
  public FieldList state(String state) {
    this.state = state;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("state")
  public String getState() {
    return state;
  }
  public void setState(String state) {
    this.state = state;
  }

  
  /**
   **/
  public FieldList type(String type) {
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
  public FieldList required(Boolean required) {
    this.required = required;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("required")
  public Boolean getRequired() {
    return required;
  }
  public void setRequired(Boolean required) {
    this.required = required;
  }

  
  /**
   **/
  public FieldList gdpr(Boolean gdpr) {
    this.gdpr = gdpr;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("gdpr")
  public Boolean getGdpr() {
    return gdpr;
  }
  public void setGdpr(Boolean gdpr) {
    this.gdpr = gdpr;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FieldList fieldList = (FieldList) o;
    return Objects.equals(this.customLabels, fieldList.customLabels) &&
        Objects.equals(this.instructionText, fieldList.instructionText) &&
        Objects.equals(this.key, fieldList.key) &&
        Objects.equals(this.labelKeys, fieldList.labelKeys) &&
        Objects.equals(this.params, fieldList.params) &&
        Objects.equals(this.repeatable, fieldList.repeatable) &&
        Objects.equals(this.state, fieldList.state) &&
        Objects.equals(this.type, fieldList.type) &&
        Objects.equals(this.required, fieldList.required) &&
        Objects.equals(this.gdpr, fieldList.gdpr);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customLabels, instructionText, key, labelKeys, params, repeatable, state, type, required, gdpr);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FieldList {\n");
    
    sb.append("    customLabels: ").append(toIndentedString(customLabels)).append("\n");
    sb.append("    instructionText: ").append(toIndentedString(instructionText)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    labelKeys: ").append(toIndentedString(labelKeys)).append("\n");
    sb.append("    params: ").append(toIndentedString(params)).append("\n");
    sb.append("    repeatable: ").append(toIndentedString(repeatable)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    required: ").append(toIndentedString(required)).append("\n");
    sb.append("    gdpr: ").append(toIndentedString(gdpr)).append("\n");
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

