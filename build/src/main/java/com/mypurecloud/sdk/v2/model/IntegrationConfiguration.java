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
import com.mypurecloud.sdk.v2.model.CredentialInfo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import java.io.Serializable;
/**
 * Configuration for an Integration
 */
@ApiModel(description = "Configuration for an Integration")

public class IntegrationConfiguration  implements Serializable {
  
  private String id = null;
  private String name = null;
  private Integer version = null;
  private Object properties = null;
  private Object advanced = null;
  private String notes = null;
  private Map<String, CredentialInfo> credentials = null;
  private String selfUri = null;

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  
  /**
   * The name of the integration, used to distinguish this integration from others of the same type.
   **/
  public IntegrationConfiguration name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The name of the integration, used to distinguish this integration from others of the same type.")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   * Version number required for updates.
   **/
  public IntegrationConfiguration version(Integer version) {
    this.version = version;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Version number required for updates.")
  @JsonProperty("version")
  public Integer getVersion() {
    return version;
  }
  public void setVersion(Integer version) {
    this.version = version;
  }

  
  /**
   * Key-value configuration settings described by the schema in the propertiesSchemaUri field.
   **/
  public IntegrationConfiguration properties(Object properties) {
    this.properties = properties;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Key-value configuration settings described by the schema in the propertiesSchemaUri field.")
  @JsonProperty("properties")
  public Object getProperties() {
    return properties;
  }
  public void setProperties(Object properties) {
    this.properties = properties;
  }

  
  /**
   * Advanced configuration described by the schema in the advancedSchemaUri field.
   **/
  public IntegrationConfiguration advanced(Object advanced) {
    this.advanced = advanced;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Advanced configuration described by the schema in the advancedSchemaUri field.")
  @JsonProperty("advanced")
  public Object getAdvanced() {
    return advanced;
  }
  public void setAdvanced(Object advanced) {
    this.advanced = advanced;
  }

  
  /**
   * Notes about the integration.
   **/
  public IntegrationConfiguration notes(String notes) {
    this.notes = notes;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Notes about the integration.")
  @JsonProperty("notes")
  public String getNotes() {
    return notes;
  }
  public void setNotes(String notes) {
    this.notes = notes;
  }

  
  /**
   * Credentials required by the integration. The required keys are indicated in the credentials property of the Integration Type
   **/
  public IntegrationConfiguration credentials(Map<String, CredentialInfo> credentials) {
    this.credentials = credentials;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Credentials required by the integration. The required keys are indicated in the credentials property of the Integration Type")
  @JsonProperty("credentials")
  public Map<String, CredentialInfo> getCredentials() {
    return credentials;
  }
  public void setCredentials(Map<String, CredentialInfo> credentials) {
    this.credentials = credentials;
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
    IntegrationConfiguration integrationConfiguration = (IntegrationConfiguration) o;
    return Objects.equals(this.id, integrationConfiguration.id) &&
        Objects.equals(this.name, integrationConfiguration.name) &&
        Objects.equals(this.version, integrationConfiguration.version) &&
        Objects.equals(this.properties, integrationConfiguration.properties) &&
        Objects.equals(this.advanced, integrationConfiguration.advanced) &&
        Objects.equals(this.notes, integrationConfiguration.notes) &&
        Objects.equals(this.credentials, integrationConfiguration.credentials) &&
        Objects.equals(this.selfUri, integrationConfiguration.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, version, properties, advanced, notes, credentials, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IntegrationConfiguration {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
    sb.append("    advanced: ").append(toIndentedString(advanced)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    credentials: ").append(toIndentedString(credentials)).append("\n");
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

