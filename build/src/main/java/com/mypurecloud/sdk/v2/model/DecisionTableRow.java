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
import com.mypurecloud.sdk.v2.model.DecisionTableRowParameterValue;
import com.mypurecloud.sdk.v2.model.DecisionTableVersionEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import java.io.Serializable;
/**
 * DecisionTableRow
 */

public class DecisionTableRow  implements Serializable {
  
  private String id = null;
  private DecisionTableVersionEntity table = null;
  private Integer rowIndex = null;
  private Date dateCreated = null;
  private Date dateModified = null;
  private Map<String, DecisionTableRowParameterValue> inputs = null;
  private Map<String, DecisionTableRowParameterValue> outputs = null;
  private String selfUri = null;

  public DecisionTableRow() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }


  /**
   * The decision table to which this row belongs
   **/
  public DecisionTableRow table(DecisionTableVersionEntity table) {
    this.table = table;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The decision table to which this row belongs")
  @JsonProperty("table")
  public DecisionTableVersionEntity getTable() {
    return table;
  }
  public void setTable(DecisionTableVersionEntity table) {
    this.table = table;
  }


  /**
   * The absolute index of this row in the decision table, starting at 1
   **/
  public DecisionTableRow rowIndex(Integer rowIndex) {
    this.rowIndex = rowIndex;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The absolute index of this row in the decision table, starting at 1")
  @JsonProperty("rowIndex")
  public Integer getRowIndex() {
    return rowIndex;
  }
  public void setRowIndex(Integer rowIndex) {
    this.rowIndex = rowIndex;
  }


  /**
   * The date when this row was created. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public DecisionTableRow dateCreated(Date dateCreated) {
    this.dateCreated = dateCreated;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The date when this row was created. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateCreated")
  public Date getDateCreated() {
    return dateCreated;
  }
  public void setDateCreated(Date dateCreated) {
    this.dateCreated = dateCreated;
  }


  /**
   * The date when this row was last modified. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public DecisionTableRow dateModified(Date dateModified) {
    this.dateModified = dateModified;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The date when this row was last modified. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateModified")
  public Date getDateModified() {
    return dateModified;
  }
  public void setDateModified(Date dateModified) {
    this.dateModified = dateModified;
  }


  /**
   * The map input values of the row being created. At least one value must be provided. The key for this map is the column ID the row value relates
   **/
  public DecisionTableRow inputs(Map<String, DecisionTableRowParameterValue> inputs) {
    this.inputs = inputs;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The map input values of the row being created. At least one value must be provided. The key for this map is the column ID the row value relates")
  @JsonProperty("inputs")
  public Map<String, DecisionTableRowParameterValue> getInputs() {
    return inputs;
  }
  public void setInputs(Map<String, DecisionTableRowParameterValue> inputs) {
    this.inputs = inputs;
  }


  /**
   * The map output values of the row being created. At least one value must be provided. The key for this map is the column ID the row value relates
   **/
  public DecisionTableRow outputs(Map<String, DecisionTableRowParameterValue> outputs) {
    this.outputs = outputs;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The map output values of the row being created. At least one value must be provided. The key for this map is the column ID the row value relates")
  @JsonProperty("outputs")
  public Map<String, DecisionTableRowParameterValue> getOutputs() {
    return outputs;
  }
  public void setOutputs(Map<String, DecisionTableRowParameterValue> outputs) {
    this.outputs = outputs;
  }


  @ApiModelProperty(example = "null", value = "The URI for this object")
  @JsonProperty("selfUri")
  public String getSelfUri() {
    return selfUri;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DecisionTableRow decisionTableRow = (DecisionTableRow) o;

    return Objects.equals(this.id, decisionTableRow.id) &&
            Objects.equals(this.table, decisionTableRow.table) &&
            Objects.equals(this.rowIndex, decisionTableRow.rowIndex) &&
            Objects.equals(this.dateCreated, decisionTableRow.dateCreated) &&
            Objects.equals(this.dateModified, decisionTableRow.dateModified) &&
            Objects.equals(this.inputs, decisionTableRow.inputs) &&
            Objects.equals(this.outputs, decisionTableRow.outputs) &&
            Objects.equals(this.selfUri, decisionTableRow.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, table, rowIndex, dateCreated, dateModified, inputs, outputs, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DecisionTableRow {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    table: ").append(toIndentedString(table)).append("\n");
    sb.append("    rowIndex: ").append(toIndentedString(rowIndex)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    dateModified: ").append(toIndentedString(dateModified)).append("\n");
    sb.append("    inputs: ").append(toIndentedString(inputs)).append("\n");
    sb.append("    outputs: ").append(toIndentedString(outputs)).append("\n");
    sb.append("    selfUri: ").append(toIndentedString(selfUri)).append("\n");
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

