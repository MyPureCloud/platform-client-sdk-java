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
import com.mypurecloud.sdk.v2.model.FieldList;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * Section
 */

public class Section  implements Serializable {
  
  private List<FieldList> fieldList = new ArrayList<FieldList>();
  private String instructionText = null;
  private String key = null;
  private String state = null;

  
  /**
   **/
  public Section fieldList(List<FieldList> fieldList) {
    this.fieldList = fieldList;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("fieldList")
  public List<FieldList> getFieldList() {
    return fieldList;
  }
  public void setFieldList(List<FieldList> fieldList) {
    this.fieldList = fieldList;
  }

  
  /**
   **/
  public Section instructionText(String instructionText) {
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
  public Section key(String key) {
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
  public Section state(String state) {
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

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Section section = (Section) o;
    return Objects.equals(this.fieldList, section.fieldList) &&
        Objects.equals(this.instructionText, section.instructionText) &&
        Objects.equals(this.key, section.key) &&
        Objects.equals(this.state, section.state);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fieldList, instructionText, key, state);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Section {\n");
    
    sb.append("    fieldList: ").append(toIndentedString(fieldList)).append("\n");
    sb.append("    instructionText: ").append(toIndentedString(instructionText)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
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

