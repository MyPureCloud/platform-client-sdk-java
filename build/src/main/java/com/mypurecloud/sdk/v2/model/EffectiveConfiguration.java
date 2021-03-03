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
 * Effective Configuration for an ClientApp. This is comprised of the integration specific configuration along with overrides specified in the integration type.
 */
@ApiModel(description = "Effective Configuration for an ClientApp. This is comprised of the integration specific configuration along with overrides specified in the integration type.")

public class EffectiveConfiguration  implements Serializable {
  
  private Map<String, Object> properties = null;
  private Map<String, Object> advanced = null;
  private String name = null;
  private String notes = null;
  private Map<String, CredentialInfo> credentials = null;

  
  /**
   * Key-value configuration settings described by the schema in the propertiesSchemaUri field.
   **/
  public EffectiveConfiguration properties(Map<String, Object> properties) {
    this.properties = properties;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Key-value configuration settings described by the schema in the propertiesSchemaUri field.")
  @JsonProperty("properties")
  public Map<String, Object> getProperties() {
    return properties;
  }
  public void setProperties(Map<String, Object> properties) {
    this.properties = properties;
  }

  
  /**
   * Advanced configuration described by the schema in the advancedSchemaUri field.
   **/
  public EffectiveConfiguration advanced(Map<String, Object> advanced) {
    this.advanced = advanced;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Advanced configuration described by the schema in the advancedSchemaUri field.")
  @JsonProperty("advanced")
  public Map<String, Object> getAdvanced() {
    return advanced;
  }
  public void setAdvanced(Map<String, Object> advanced) {
    this.advanced = advanced;
  }

  
  /**
   * The name of the integration, used to distinguish this integration from others of the same type.
   **/
  public EffectiveConfiguration name(String name) {
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
   * Notes about the integration.
   **/
  public EffectiveConfiguration notes(String notes) {
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
  public EffectiveConfiguration credentials(Map<String, CredentialInfo> credentials) {
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

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EffectiveConfiguration effectiveConfiguration = (EffectiveConfiguration) o;
    return Objects.equals(this.properties, effectiveConfiguration.properties) &&
        Objects.equals(this.advanced, effectiveConfiguration.advanced) &&
        Objects.equals(this.name, effectiveConfiguration.name) &&
        Objects.equals(this.notes, effectiveConfiguration.notes) &&
        Objects.equals(this.credentials, effectiveConfiguration.credentials);
  }

  @Override
  public int hashCode() {
    return Objects.hash(properties, advanced, name, notes, credentials);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EffectiveConfiguration {\n");
    
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
    sb.append("    advanced: ").append(toIndentedString(advanced)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    credentials: ").append(toIndentedString(credentials)).append("\n");
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

