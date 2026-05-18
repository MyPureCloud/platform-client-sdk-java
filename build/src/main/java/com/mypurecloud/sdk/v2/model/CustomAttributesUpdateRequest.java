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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import java.io.Serializable;
/**
 * CustomAttributesUpdateRequest
 */

public class CustomAttributesUpdateRequest  implements Serializable {
  
  private String id = null;
  private List<String> divisions = null;
  private String schemaId = null;
  private Integer version = null;
  private Map<String, Object> customAttributes = null;

  public CustomAttributesUpdateRequest() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      divisions = new ArrayList<String>();
    }
  }

  public CustomAttributesUpdateRequest(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
      divisions = new ArrayList<String>();
    }
  }

  
  /**
   * Unique identifier for the Custom Attributes record. IDs are created by users.
   **/
  public CustomAttributesUpdateRequest id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Unique identifier for the Custom Attributes record. IDs are created by users.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }


  /**
   * The list of division ids. Use [] if divisions aren't used (Unassigned Division). Omitting or setting to [] clears existing values on update.
   **/
  public CustomAttributesUpdateRequest divisions(List<String> divisions) {
    this.divisions = divisions;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The list of division ids. Use [] if divisions aren't used (Unassigned Division). Omitting or setting to [] clears existing values on update.")
  @JsonProperty("divisions")
  public List<String> getDivisions() {
    return divisions;
  }
  public void setDivisions(List<String> divisions) {
    this.divisions = divisions;
  }


  /**
   * The id of the schema that dictates which attributes can be included. Required for create, cannot be updated.
   **/
  public CustomAttributesUpdateRequest schemaId(String schemaId) {
    this.schemaId = schemaId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The id of the schema that dictates which attributes can be included. Required for create, cannot be updated.")
  @JsonProperty("schemaId")
  public String getSchemaId() {
    return schemaId;
  }
  public void setSchemaId(String schemaId) {
    this.schemaId = schemaId;
  }


  /**
   * The latest version of the Custom Attributes record. Optional for concurrency check on update.
   **/
  public CustomAttributesUpdateRequest version(Integer version) {
    this.version = version;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The latest version of the Custom Attributes record. Optional for concurrency check on update.")
  @JsonProperty("version")
  public Integer getVersion() {
    return version;
  }
  public void setVersion(Integer version) {
    this.version = version;
  }


  /**
   * The map of attribute values.
   **/
  public CustomAttributesUpdateRequest customAttributes(Map<String, Object> customAttributes) {
    this.customAttributes = customAttributes;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The map of attribute values.")
  @JsonProperty("customAttributes")
  public Map<String, Object> getCustomAttributes() {
    return customAttributes;
  }
  public void setCustomAttributes(Map<String, Object> customAttributes) {
    this.customAttributes = customAttributes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomAttributesUpdateRequest customAttributesUpdateRequest = (CustomAttributesUpdateRequest) o;

    return Objects.equals(this.id, customAttributesUpdateRequest.id) &&
            Objects.equals(this.divisions, customAttributesUpdateRequest.divisions) &&
            Objects.equals(this.schemaId, customAttributesUpdateRequest.schemaId) &&
            Objects.equals(this.version, customAttributesUpdateRequest.version) &&
            Objects.equals(this.customAttributes, customAttributesUpdateRequest.customAttributes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, divisions, schemaId, version, customAttributes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomAttributesUpdateRequest {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    divisions: ").append(toIndentedString(divisions)).append("\n");
    sb.append("    schemaId: ").append(toIndentedString(schemaId)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    customAttributes: ").append(toIndentedString(customAttributes)).append("\n");
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

