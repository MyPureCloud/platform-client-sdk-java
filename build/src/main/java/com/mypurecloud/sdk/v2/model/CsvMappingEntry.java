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
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * CsvMappingEntry
 */

public class CsvMappingEntry  implements Serializable {
  
  private String sourceField = null;
  private String targetField = null;

  
  /**
   * CSV field to map data from
   **/
  public CsvMappingEntry sourceField(String sourceField) {
    this.sourceField = sourceField;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "CSV field to map data from")
  @JsonProperty("sourceField")
  public String getSourceField() {
    return sourceField;
  }
  public void setSourceField(String sourceField) {
    this.sourceField = sourceField;
  }


  /**
   * Json path to map data to
   **/
  public CsvMappingEntry targetField(String targetField) {
    this.targetField = targetField;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Json path to map data to")
  @JsonProperty("targetField")
  public String getTargetField() {
    return targetField;
  }
  public void setTargetField(String targetField) {
    this.targetField = targetField;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CsvMappingEntry csvMappingEntry = (CsvMappingEntry) o;

    return Objects.equals(this.sourceField, csvMappingEntry.sourceField) &&
            Objects.equals(this.targetField, csvMappingEntry.targetField);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sourceField, targetField);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CsvMappingEntry {\n");
    
    sb.append("    sourceField: ").append(toIndentedString(sourceField)).append("\n");
    sb.append("    targetField: ").append(toIndentedString(targetField)).append("\n");
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

