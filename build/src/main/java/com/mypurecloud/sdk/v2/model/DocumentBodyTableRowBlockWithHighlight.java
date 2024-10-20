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
import com.mypurecloud.sdk.v2.model.DocumentBodyTableCellBlockWithHighlight;
import com.mypurecloud.sdk.v2.model.DocumentBodyTableRowBlockProperties;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * DocumentBodyTableRowBlockWithHighlight
 */

public class DocumentBodyTableRowBlockWithHighlight  implements Serializable {
  
  private DocumentBodyTableRowBlockProperties properties = null;
  private List<DocumentBodyTableCellBlockWithHighlight> cells = new ArrayList<DocumentBodyTableCellBlockWithHighlight>();

  
  /**
   * The properties for the table rows.
   **/
  public DocumentBodyTableRowBlockWithHighlight properties(DocumentBodyTableRowBlockProperties properties) {
    this.properties = properties;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The properties for the table rows.")
  @JsonProperty("properties")
  public DocumentBodyTableRowBlockProperties getProperties() {
    return properties;
  }
  public void setProperties(DocumentBodyTableRowBlockProperties properties) {
    this.properties = properties;
  }


  /**
   * The list of cells for the table.
   **/
  public DocumentBodyTableRowBlockWithHighlight cells(List<DocumentBodyTableCellBlockWithHighlight> cells) {
    this.cells = cells;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The list of cells for the table.")
  @JsonProperty("cells")
  public List<DocumentBodyTableCellBlockWithHighlight> getCells() {
    return cells;
  }
  public void setCells(List<DocumentBodyTableCellBlockWithHighlight> cells) {
    this.cells = cells;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocumentBodyTableRowBlockWithHighlight documentBodyTableRowBlockWithHighlight = (DocumentBodyTableRowBlockWithHighlight) o;

    return Objects.equals(this.properties, documentBodyTableRowBlockWithHighlight.properties) &&
            Objects.equals(this.cells, documentBodyTableRowBlockWithHighlight.cells);
  }

  @Override
  public int hashCode() {
    return Objects.hash(properties, cells);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentBodyTableRowBlockWithHighlight {\n");
    
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
    sb.append("    cells: ").append(toIndentedString(cells)).append("\n");
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

