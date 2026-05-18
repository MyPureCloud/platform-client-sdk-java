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
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import java.io.Serializable;
/**
 * UserCustomAttributesUpdateRequest
 */

public class UserCustomAttributesUpdateRequest  implements Serializable {
  
  private String schemaId = null;
  private Integer schemaVersion = null;
  private Map<String, Object> attributes = null;

  public UserCustomAttributesUpdateRequest() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  public UserCustomAttributesUpdateRequest(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
    }
  }

  
  /**
   * The id of the schema that dictates which attributes can be included.
   **/
  public UserCustomAttributesUpdateRequest schemaId(String schemaId) {
    this.schemaId = schemaId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The id of the schema that dictates which attributes can be included.")
  @JsonProperty("schemaId")
  public String getSchemaId() {
    return schemaId;
  }
  public void setSchemaId(String schemaId) {
    this.schemaId = schemaId;
  }


  /**
   * The version of the schema.
   **/
  public UserCustomAttributesUpdateRequest schemaVersion(Integer schemaVersion) {
    this.schemaVersion = schemaVersion;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The version of the schema.")
  @JsonProperty("schemaVersion")
  public Integer getSchemaVersion() {
    return schemaVersion;
  }
  public void setSchemaVersion(Integer schemaVersion) {
    this.schemaVersion = schemaVersion;
  }


  /**
   * The map of attribute values.
   **/
  public UserCustomAttributesUpdateRequest attributes(Map<String, Object> attributes) {
    this.attributes = attributes;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The map of attribute values.")
  @JsonProperty("attributes")
  public Map<String, Object> getAttributes() {
    return attributes;
  }
  public void setAttributes(Map<String, Object> attributes) {
    this.attributes = attributes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserCustomAttributesUpdateRequest userCustomAttributesUpdateRequest = (UserCustomAttributesUpdateRequest) o;

    return Objects.equals(this.schemaId, userCustomAttributesUpdateRequest.schemaId) &&
            Objects.equals(this.schemaVersion, userCustomAttributesUpdateRequest.schemaVersion) &&
            Objects.equals(this.attributes, userCustomAttributesUpdateRequest.attributes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(schemaId, schemaVersion, attributes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserCustomAttributesUpdateRequest {\n");
    
    sb.append("    schemaId: ").append(toIndentedString(schemaId)).append("\n");
    sb.append("    schemaVersion: ").append(toIndentedString(schemaVersion)).append("\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
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

