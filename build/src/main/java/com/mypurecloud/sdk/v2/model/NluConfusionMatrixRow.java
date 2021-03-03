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
import com.mypurecloud.sdk.v2.model.NluConfusionMatrixColumn;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * NluConfusionMatrixRow
 */

public class NluConfusionMatrixRow  implements Serializable {
  
  private String name = null;
  private List<NluConfusionMatrixColumn> columns = new ArrayList<NluConfusionMatrixColumn>();

  
  /**
   * The name of the intent for the row.
   **/
  public NluConfusionMatrixRow name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The name of the intent for the row.")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   * The columns of confusion matrix for the intent
   **/
  public NluConfusionMatrixRow columns(List<NluConfusionMatrixColumn> columns) {
    this.columns = columns;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The columns of confusion matrix for the intent")
  @JsonProperty("columns")
  public List<NluConfusionMatrixColumn> getColumns() {
    return columns;
  }
  public void setColumns(List<NluConfusionMatrixColumn> columns) {
    this.columns = columns;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NluConfusionMatrixRow nluConfusionMatrixRow = (NluConfusionMatrixRow) o;
    return Objects.equals(this.name, nluConfusionMatrixRow.name) &&
        Objects.equals(this.columns, nluConfusionMatrixRow.columns);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, columns);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NluConfusionMatrixRow {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    columns: ").append(toIndentedString(columns)).append("\n");
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

