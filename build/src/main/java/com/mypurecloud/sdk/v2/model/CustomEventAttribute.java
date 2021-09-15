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

import java.io.Serializable;
/**
 * CustomEventAttribute
 */

public class CustomEventAttribute  implements Serializable {
  
  private String dataType = null;
  private String value = null;

  
  /**
   * The data type of the custom attribute.
   **/
  public CustomEventAttribute dataType(String dataType) {
    this.dataType = dataType;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The data type of the custom attribute.")
  @JsonProperty("dataType")
  public String getDataType() {
    return dataType;
  }
  public void setDataType(String dataType) {
    this.dataType = dataType;
  }

  
  /**
   * The value of the custom attribute.
   **/
  public CustomEventAttribute value(String value) {
    this.value = value;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The value of the custom attribute.")
  @JsonProperty("value")
  public String getValue() {
    return value;
  }
  public void setValue(String value) {
    this.value = value;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomEventAttribute customEventAttribute = (CustomEventAttribute) o;
    return Objects.equals(this.dataType, customEventAttribute.dataType) &&
        Objects.equals(this.value, customEventAttribute.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dataType, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomEventAttribute {\n");
    
    sb.append("    dataType: ").append(toIndentedString(dataType)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

