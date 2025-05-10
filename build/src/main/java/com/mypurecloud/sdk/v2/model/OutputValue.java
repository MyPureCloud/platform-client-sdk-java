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
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * OutputValue
 */

public class OutputValue  implements Serializable {
  
  private String schemaPropertyKey = null;
  private List<OutputValue> properties = null;

  public OutputValue() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      properties = new ArrayList<OutputValue>();
    }
  }

  
  /**
   * The contract schema property key that describes the output value of this column.
   **/
  public OutputValue schemaPropertyKey(String schemaPropertyKey) {
    this.schemaPropertyKey = schemaPropertyKey;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The contract schema property key that describes the output value of this column.")
  @JsonProperty("schemaPropertyKey")
  public String getSchemaPropertyKey() {
    return schemaPropertyKey;
  }
  public void setSchemaPropertyKey(String schemaPropertyKey) {
    this.schemaPropertyKey = schemaPropertyKey;
  }


  /**
   * The nested output properties of this column that will be provided by each row, if any.
   **/
  public OutputValue properties(List<OutputValue> properties) {
    this.properties = properties;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The nested output properties of this column that will be provided by each row, if any.")
  @JsonProperty("properties")
  public List<OutputValue> getProperties() {
    return properties;
  }
  public void setProperties(List<OutputValue> properties) {
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
    OutputValue outputValue = (OutputValue) o;

    return Objects.equals(this.schemaPropertyKey, outputValue.schemaPropertyKey) &&
            Objects.equals(this.properties, outputValue.properties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(schemaPropertyKey, properties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OutputValue {\n");
    
    sb.append("    schemaPropertyKey: ").append(toIndentedString(schemaPropertyKey)).append("\n");
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

