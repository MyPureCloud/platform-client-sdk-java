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
import java.util.List;

import java.io.Serializable;
/**
 * PropertyChange
 */

public class PropertyChange  implements Serializable {
  
  private String property = null;
  private List<String> oldValues = new ArrayList<String>();
  private List<String> newValues = new ArrayList<String>();

  
  /**
   * The property that was changed
   **/
  public PropertyChange property(String property) {
    this.property = property;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The property that was changed")
  @JsonProperty("property")
  public String getProperty() {
    return property;
  }
  public void setProperty(String property) {
    this.property = property;
  }

  
  /**
   * Previous values for the property.
   **/
  public PropertyChange oldValues(List<String> oldValues) {
    this.oldValues = oldValues;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Previous values for the property.")
  @JsonProperty("oldValues")
  public List<String> getOldValues() {
    return oldValues;
  }
  public void setOldValues(List<String> oldValues) {
    this.oldValues = oldValues;
  }

  
  /**
   * New values for the property.
   **/
  public PropertyChange newValues(List<String> newValues) {
    this.newValues = newValues;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "New values for the property.")
  @JsonProperty("newValues")
  public List<String> getNewValues() {
    return newValues;
  }
  public void setNewValues(List<String> newValues) {
    this.newValues = newValues;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PropertyChange propertyChange = (PropertyChange) o;
    return Objects.equals(this.property, propertyChange.property) &&
        Objects.equals(this.oldValues, propertyChange.oldValues) &&
        Objects.equals(this.newValues, propertyChange.newValues);
  }

  @Override
  public int hashCode() {
    return Objects.hash(property, oldValues, newValues);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PropertyChange {\n");
    
    sb.append("    property: ").append(toIndentedString(property)).append("\n");
    sb.append("    oldValues: ").append(toIndentedString(oldValues)).append("\n");
    sb.append("    newValues: ").append(toIndentedString(newValues)).append("\n");
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

