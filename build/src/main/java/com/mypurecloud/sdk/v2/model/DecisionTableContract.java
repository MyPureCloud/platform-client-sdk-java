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
import com.mypurecloud.sdk.v2.model.DomainEntityRef;
import com.mypurecloud.sdk.v2.model.JsonSchemaWithDefinitions;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * DecisionTableContract
 */

public class DecisionTableContract  implements Serializable {
  
  private DomainEntityRef parentSchema = null;
  private JsonSchemaWithDefinitions rowAuthoringSchema = null;
  private JsonSchemaWithDefinitions executionInputSchema = null;
  private JsonSchemaWithDefinitions executionOutputSchema = null;

  public DecisionTableContract() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * DSS V1 schema entity defining source properties for the decision table contract schemas
   **/
  public DecisionTableContract parentSchema(DomainEntityRef parentSchema) {
    this.parentSchema = parentSchema;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "DSS V1 schema entity defining source properties for the decision table contract schemas")
  @JsonProperty("parentSchema")
  public DomainEntityRef getParentSchema() {
    return parentSchema;
  }
  public void setParentSchema(DomainEntityRef parentSchema) {
    this.parentSchema = parentSchema;
  }


  /**
   * JSON schema describing required value types for each column in every row in a decision table
   **/
  public DecisionTableContract rowAuthoringSchema(JsonSchemaWithDefinitions rowAuthoringSchema) {
    this.rowAuthoringSchema = rowAuthoringSchema;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "JSON schema describing required value types for each column in every row in a decision table")
  @JsonProperty("rowAuthoringSchema")
  public JsonSchemaWithDefinitions getRowAuthoringSchema() {
    return rowAuthoringSchema;
  }
  public void setRowAuthoringSchema(JsonSchemaWithDefinitions rowAuthoringSchema) {
    this.rowAuthoringSchema = rowAuthoringSchema;
  }


  /**
   * JSON schema for execution input data for a decision table
   **/
  public DecisionTableContract executionInputSchema(JsonSchemaWithDefinitions executionInputSchema) {
    this.executionInputSchema = executionInputSchema;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "JSON schema for execution input data for a decision table")
  @JsonProperty("executionInputSchema")
  public JsonSchemaWithDefinitions getExecutionInputSchema() {
    return executionInputSchema;
  }
  public void setExecutionInputSchema(JsonSchemaWithDefinitions executionInputSchema) {
    this.executionInputSchema = executionInputSchema;
  }


  /**
   * JSON schema for execution output data for a decision table
   **/
  public DecisionTableContract executionOutputSchema(JsonSchemaWithDefinitions executionOutputSchema) {
    this.executionOutputSchema = executionOutputSchema;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "JSON schema for execution output data for a decision table")
  @JsonProperty("executionOutputSchema")
  public JsonSchemaWithDefinitions getExecutionOutputSchema() {
    return executionOutputSchema;
  }
  public void setExecutionOutputSchema(JsonSchemaWithDefinitions executionOutputSchema) {
    this.executionOutputSchema = executionOutputSchema;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DecisionTableContract decisionTableContract = (DecisionTableContract) o;

    return Objects.equals(this.parentSchema, decisionTableContract.parentSchema) &&
            Objects.equals(this.rowAuthoringSchema, decisionTableContract.rowAuthoringSchema) &&
            Objects.equals(this.executionInputSchema, decisionTableContract.executionInputSchema) &&
            Objects.equals(this.executionOutputSchema, decisionTableContract.executionOutputSchema);
  }

  @Override
  public int hashCode() {
    return Objects.hash(parentSchema, rowAuthoringSchema, executionInputSchema, executionOutputSchema);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DecisionTableContract {\n");
    
    sb.append("    parentSchema: ").append(toIndentedString(parentSchema)).append("\n");
    sb.append("    rowAuthoringSchema: ").append(toIndentedString(rowAuthoringSchema)).append("\n");
    sb.append("    executionInputSchema: ").append(toIndentedString(executionInputSchema)).append("\n");
    sb.append("    executionOutputSchema: ").append(toIndentedString(executionOutputSchema)).append("\n");
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

