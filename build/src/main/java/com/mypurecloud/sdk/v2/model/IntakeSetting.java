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

import java.io.Serializable;
/**
 * IntakeSetting
 */

public class IntakeSetting  implements Serializable {
  
  private String property = null;
  private Boolean required = null;
  private Integer displayOrder = null;

  public IntakeSetting() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  public IntakeSetting(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
    }
  }

  
  /**
   * The property name for this intake setting.
   **/
  public IntakeSetting property(String property) {
    this.property = property;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The property name for this intake setting.")
  @JsonProperty("property")
  public String getProperty() {
    return property;
  }
  public void setProperty(String property) {
    this.property = property;
  }


  /**
   * Whether this property is required for intake.
   **/
  public IntakeSetting required(Boolean required) {
    this.required = required;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Whether this property is required for intake.")
  @JsonProperty("required")
  public Boolean getRequired() {
    return required;
  }
  public void setRequired(Boolean required) {
    this.required = required;
  }


  /**
   * The display order for this property.
   **/
  public IntakeSetting displayOrder(Integer displayOrder) {
    this.displayOrder = displayOrder;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The display order for this property.")
  @JsonProperty("displayOrder")
  public Integer getDisplayOrder() {
    return displayOrder;
  }
  public void setDisplayOrder(Integer displayOrder) {
    this.displayOrder = displayOrder;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IntakeSetting intakeSetting = (IntakeSetting) o;

    return Objects.equals(this.property, intakeSetting.property) &&
            Objects.equals(this.required, intakeSetting.required) &&
            Objects.equals(this.displayOrder, intakeSetting.displayOrder);
  }

  @Override
  public int hashCode() {
    return Objects.hash(property, required, displayOrder);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IntakeSetting {\n");
    
    sb.append("    property: ").append(toIndentedString(property)).append("\n");
    sb.append("    required: ").append(toIndentedString(required)).append("\n");
    sb.append("    displayOrder: ").append(toIndentedString(displayOrder)).append("\n");
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

