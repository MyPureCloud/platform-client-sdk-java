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
import com.mypurecloud.sdk.v2.model.CreateDecisionTableColumnsRequest;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * CreateDecisionTableRequest
 */

public class CreateDecisionTableRequest  implements Serializable {
  
  private String name = null;
  private String description = null;
  private String divisionId = null;
  private String schemaId = null;
  private CreateDecisionTableColumnsRequest columns = null;

  public CreateDecisionTableRequest() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * The decision table name.
   **/
  public CreateDecisionTableRequest name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The decision table name.")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }


  /**
   * The decision table description.
   **/
  public CreateDecisionTableRequest description(String description) {
    this.description = description;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The decision table description.")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }


  /**
   * The ID of the division the decision table belongs to.
   **/
  public CreateDecisionTableRequest divisionId(String divisionId) {
    this.divisionId = divisionId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The ID of the division the decision table belongs to.")
  @JsonProperty("divisionId")
  public String getDivisionId() {
    return divisionId;
  }
  public void setDivisionId(String divisionId) {
    this.divisionId = divisionId;
  }


  /**
   * The ID of the rules schema used by the decision table.
   **/
  public CreateDecisionTableRequest schemaId(String schemaId) {
    this.schemaId = schemaId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The ID of the rules schema used by the decision table.")
  @JsonProperty("schemaId")
  public String getSchemaId() {
    return schemaId;
  }
  public void setSchemaId(String schemaId) {
    this.schemaId = schemaId;
  }


  /**
   * The column definitions for this decision table.
   **/
  public CreateDecisionTableRequest columns(CreateDecisionTableColumnsRequest columns) {
    this.columns = columns;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The column definitions for this decision table.")
  @JsonProperty("columns")
  public CreateDecisionTableColumnsRequest getColumns() {
    return columns;
  }
  public void setColumns(CreateDecisionTableColumnsRequest columns) {
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
    CreateDecisionTableRequest createDecisionTableRequest = (CreateDecisionTableRequest) o;

    return Objects.equals(this.name, createDecisionTableRequest.name) &&
            Objects.equals(this.description, createDecisionTableRequest.description) &&
            Objects.equals(this.divisionId, createDecisionTableRequest.divisionId) &&
            Objects.equals(this.schemaId, createDecisionTableRequest.schemaId) &&
            Objects.equals(this.columns, createDecisionTableRequest.columns);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, description, divisionId, schemaId, columns);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateDecisionTableRequest {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    divisionId: ").append(toIndentedString(divisionId)).append("\n");
    sb.append("    schemaId: ").append(toIndentedString(schemaId)).append("\n");
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

