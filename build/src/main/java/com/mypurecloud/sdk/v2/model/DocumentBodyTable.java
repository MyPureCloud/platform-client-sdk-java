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
import com.mypurecloud.sdk.v2.model.DocumentBodyTableProperties;
import com.mypurecloud.sdk.v2.model.DocumentBodyTableRowBlock;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * DocumentBodyTable
 */

public class DocumentBodyTable  implements Serializable {
  
  private DocumentBodyTableProperties properties = null;
  private List<DocumentBodyTableRowBlock> rows = null;

  public DocumentBodyTable() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      rows = new ArrayList<DocumentBodyTableRowBlock>();
    }
  }

  
  /**
   * The properties for the table.
   **/
  public DocumentBodyTable properties(DocumentBodyTableProperties properties) {
    this.properties = properties;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The properties for the table.")
  @JsonProperty("properties")
  public DocumentBodyTableProperties getProperties() {
    return properties;
  }
  public void setProperties(DocumentBodyTableProperties properties) {
    this.properties = properties;
  }


  /**
   * The list of rows for the table.
   **/
  public DocumentBodyTable rows(List<DocumentBodyTableRowBlock> rows) {
    this.rows = rows;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The list of rows for the table.")
  @JsonProperty("rows")
  public List<DocumentBodyTableRowBlock> getRows() {
    return rows;
  }
  public void setRows(List<DocumentBodyTableRowBlock> rows) {
    this.rows = rows;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocumentBodyTable documentBodyTable = (DocumentBodyTable) o;

    return Objects.equals(this.properties, documentBodyTable.properties) &&
            Objects.equals(this.rows, documentBodyTable.rows);
  }

  @Override
  public int hashCode() {
    return Objects.hash(properties, rows);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentBodyTable {\n");
    
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
    sb.append("    rows: ").append(toIndentedString(rows)).append("\n");
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

