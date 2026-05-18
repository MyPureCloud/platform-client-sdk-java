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

import java.io.Serializable;
/**
 * CreateExternalEventsConfigurationRequest
 */

public class CreateExternalEventsConfigurationRequest  implements Serializable {
  
  private String name = null;
  private String description = null;
  private String divisionId = null;
  private String schemaId = null;
  private String source = null;

  public CreateExternalEventsConfigurationRequest() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  public CreateExternalEventsConfigurationRequest(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
    }
  }

  
  /**
   * The name of the external event configuration.
   **/
  public CreateExternalEventsConfigurationRequest name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The name of the external event configuration.")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }


  /**
   * A description of the external event configuration.
   **/
  public CreateExternalEventsConfigurationRequest description(String description) {
    this.description = description;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "A description of the external event configuration.")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }


  /**
   * The division ID associated with this configuration.
   **/
  public CreateExternalEventsConfigurationRequest divisionId(String divisionId) {
    this.divisionId = divisionId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The division ID associated with this configuration.")
  @JsonProperty("divisionId")
  public String getDivisionId() {
    return divisionId;
  }
  public void setDivisionId(String divisionId) {
    this.divisionId = divisionId;
  }


  /**
   * The dynamic schema ID that defines the structure of external events.
   **/
  public CreateExternalEventsConfigurationRequest schemaId(String schemaId) {
    this.schemaId = schemaId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The dynamic schema ID that defines the structure of external events.")
  @JsonProperty("schemaId")
  public String getSchemaId() {
    return schemaId;
  }
  public void setSchemaId(String schemaId) {
    this.schemaId = schemaId;
  }


  /**
   * The source of the external events e.g. Adobe, Salesforce. This cannot be changed after creation.
   **/
  public CreateExternalEventsConfigurationRequest source(String source) {
    this.source = source;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The source of the external events e.g. Adobe, Salesforce. This cannot be changed after creation.")
  @JsonProperty("source")
  public String getSource() {
    return source;
  }
  public void setSource(String source) {
    this.source = source;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateExternalEventsConfigurationRequest createExternalEventsConfigurationRequest = (CreateExternalEventsConfigurationRequest) o;

    return Objects.equals(this.name, createExternalEventsConfigurationRequest.name) &&
            Objects.equals(this.description, createExternalEventsConfigurationRequest.description) &&
            Objects.equals(this.divisionId, createExternalEventsConfigurationRequest.divisionId) &&
            Objects.equals(this.schemaId, createExternalEventsConfigurationRequest.schemaId) &&
            Objects.equals(this.source, createExternalEventsConfigurationRequest.source);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, description, divisionId, schemaId, source);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateExternalEventsConfigurationRequest {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    divisionId: ").append(toIndentedString(divisionId)).append("\n");
    sb.append("    schemaId: ").append(toIndentedString(schemaId)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
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

