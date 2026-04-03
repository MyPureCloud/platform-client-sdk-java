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
import java.util.Date;

import java.io.Serializable;
/**
 * ExternalEventsConfiguration
 */

public class ExternalEventsConfiguration  implements Serializable {
  
  private String id = null;
  private String name = null;
  private String description = null;
  private String divisionId = null;
  private Boolean divisionIdActive = null;
  private String schemaId = null;
  private Boolean schemaActive = null;
  private String source = null;
  private Date dateLastModified = null;
  private String selfUri = null;

  public ExternalEventsConfiguration() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * The unique identifier for the external event configuration.
   **/
  public ExternalEventsConfiguration id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The unique identifier for the external event configuration.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }


  /**
   **/
  public ExternalEventsConfiguration name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
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
  public ExternalEventsConfiguration description(String description) {
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
   * The division ID (UUID) associated with this configuration.
   **/
  public ExternalEventsConfiguration divisionId(String divisionId) {
    this.divisionId = divisionId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The division ID (UUID) associated with this configuration.")
  @JsonProperty("divisionId")
  public String getDivisionId() {
    return divisionId;
  }
  public void setDivisionId(String divisionId) {
    this.divisionId = divisionId;
  }


  /**
   * Indicates whether the divisionId field is valid.
   **/
  public ExternalEventsConfiguration divisionIdActive(Boolean divisionIdActive) {
    this.divisionIdActive = divisionIdActive;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Indicates whether the divisionId field is valid.")
  @JsonProperty("divisionIdActive")
  public Boolean getDivisionIdActive() {
    return divisionIdActive;
  }
  public void setDivisionIdActive(Boolean divisionIdActive) {
    this.divisionIdActive = divisionIdActive;
  }


  /**
   * The dynamic schema ID (UUID) that defines the structure of external events.
   **/
  public ExternalEventsConfiguration schemaId(String schemaId) {
    this.schemaId = schemaId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The dynamic schema ID (UUID) that defines the structure of external events.")
  @JsonProperty("schemaId")
  public String getSchemaId() {
    return schemaId;
  }
  public void setSchemaId(String schemaId) {
    this.schemaId = schemaId;
  }


  /**
   * Indicates whether the schema is active or inactive.
   **/
  public ExternalEventsConfiguration schemaActive(Boolean schemaActive) {
    this.schemaActive = schemaActive;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Indicates whether the schema is active or inactive.")
  @JsonProperty("schemaActive")
  public Boolean getSchemaActive() {
    return schemaActive;
  }
  public void setSchemaActive(Boolean schemaActive) {
    this.schemaActive = schemaActive;
  }


  /**
   * The source of the external events e.g. Adobe, Salesforce.
   **/
  public ExternalEventsConfiguration source(String source) {
    this.source = source;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The source of the external events e.g. Adobe, Salesforce.")
  @JsonProperty("source")
  public String getSource() {
    return source;
  }
  public void setSource(String source) {
    this.source = source;
  }


  /**
   * The timestamp when the configuration was last modified. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public ExternalEventsConfiguration dateLastModified(Date dateLastModified) {
    this.dateLastModified = dateLastModified;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The timestamp when the configuration was last modified. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateLastModified")
  public Date getDateLastModified() {
    return dateLastModified;
  }
  public void setDateLastModified(Date dateLastModified) {
    this.dateLastModified = dateLastModified;
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
    ExternalEventsConfiguration externalEventsConfiguration = (ExternalEventsConfiguration) o;

    return Objects.equals(this.id, externalEventsConfiguration.id) &&
            Objects.equals(this.name, externalEventsConfiguration.name) &&
            Objects.equals(this.description, externalEventsConfiguration.description) &&
            Objects.equals(this.divisionId, externalEventsConfiguration.divisionId) &&
            Objects.equals(this.divisionIdActive, externalEventsConfiguration.divisionIdActive) &&
            Objects.equals(this.schemaId, externalEventsConfiguration.schemaId) &&
            Objects.equals(this.schemaActive, externalEventsConfiguration.schemaActive) &&
            Objects.equals(this.source, externalEventsConfiguration.source) &&
            Objects.equals(this.dateLastModified, externalEventsConfiguration.dateLastModified) &&
            Objects.equals(this.selfUri, externalEventsConfiguration.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, description, divisionId, divisionIdActive, schemaId, schemaActive, source, dateLastModified, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExternalEventsConfiguration {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    divisionId: ").append(toIndentedString(divisionId)).append("\n");
    sb.append("    divisionIdActive: ").append(toIndentedString(divisionIdActive)).append("\n");
    sb.append("    schemaId: ").append(toIndentedString(schemaId)).append("\n");
    sb.append("    schemaActive: ").append(toIndentedString(schemaActive)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    dateLastModified: ").append(toIndentedString(dateLastModified)).append("\n");
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

