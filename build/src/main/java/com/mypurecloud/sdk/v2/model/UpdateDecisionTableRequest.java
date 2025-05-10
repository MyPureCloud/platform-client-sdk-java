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
import com.mypurecloud.sdk.v2.model.UpdateDecisionTableColumnsRequest;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * UpdateDecisionTableRequest
 */

public class UpdateDecisionTableRequest  implements Serializable {
  
  private String name = null;
  private String description = null;
  private UpdateDecisionTableColumnsRequest columns = null;

  public UpdateDecisionTableRequest() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * The decision table name.
   **/
  public UpdateDecisionTableRequest name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The decision table name.")
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
  public UpdateDecisionTableRequest description(String description) {
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
   * The column definitions for this decision table.
   **/
  public UpdateDecisionTableRequest columns(UpdateDecisionTableColumnsRequest columns) {
    this.columns = columns;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The column definitions for this decision table.")
  @JsonProperty("columns")
  public UpdateDecisionTableColumnsRequest getColumns() {
    return columns;
  }
  public void setColumns(UpdateDecisionTableColumnsRequest columns) {
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
    UpdateDecisionTableRequest updateDecisionTableRequest = (UpdateDecisionTableRequest) o;

    return Objects.equals(this.name, updateDecisionTableRequest.name) &&
            Objects.equals(this.description, updateDecisionTableRequest.description) &&
            Objects.equals(this.columns, updateDecisionTableRequest.columns);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, description, columns);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateDecisionTableRequest {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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

