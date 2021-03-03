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
import com.mypurecloud.sdk.v2.model.IntegrationType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * Details for an Integration
 */
@ApiModel(description = "Details for an Integration")

public class CreateIntegrationRequest  implements Serializable {
  
  private String id = null;
  private String name = null;
  private IntegrationType integrationType = null;
  private String selfUri = null;

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  
  /**
   * The name of the integration, used to distinguish this integration from others of the same type.
   **/
  public CreateIntegrationRequest name(String name) {
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
   * Type of the integration to create.
   **/
  public CreateIntegrationRequest integrationType(IntegrationType integrationType) {
    this.integrationType = integrationType;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Type of the integration to create.")
  @JsonProperty("integrationType")
  public IntegrationType getIntegrationType() {
    return integrationType;
  }
  public void setIntegrationType(IntegrationType integrationType) {
    this.integrationType = integrationType;
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
    CreateIntegrationRequest createIntegrationRequest = (CreateIntegrationRequest) o;
    return Objects.equals(this.id, createIntegrationRequest.id) &&
        Objects.equals(this.name, createIntegrationRequest.name) &&
        Objects.equals(this.integrationType, createIntegrationRequest.integrationType) &&
        Objects.equals(this.selfUri, createIntegrationRequest.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, integrationType, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateIntegrationRequest {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    integrationType: ").append(toIndentedString(integrationType)).append("\n");
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

