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
 * CustomEventAttributeList
 */

public class CustomEventAttributeList  implements Serializable {
  
  private String dataType = null;
  private List<String> values = new ArrayList<String>();

  
  /**
   * The data type of the custom attributes.
   **/
  public CustomEventAttributeList dataType(String dataType) {
    this.dataType = dataType;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The data type of the custom attributes.")
  @JsonProperty("dataType")
  public String getDataType() {
    return dataType;
  }
  public void setDataType(String dataType) {
    this.dataType = dataType;
  }

  
  /**
   * The list of custom event attribute values.
   **/
  public CustomEventAttributeList values(List<String> values) {
    this.values = values;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The list of custom event attribute values.")
  @JsonProperty("values")
  public List<String> getValues() {
    return values;
  }
  public void setValues(List<String> values) {
    this.values = values;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomEventAttributeList customEventAttributeList = (CustomEventAttributeList) o;
    return Objects.equals(this.dataType, customEventAttributeList.dataType) &&
        Objects.equals(this.values, customEventAttributeList.values);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dataType, values);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomEventAttributeList {\n");
    
    sb.append("    dataType: ").append(toIndentedString(dataType)).append("\n");
    sb.append("    values: ").append(toIndentedString(values)).append("\n");
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

