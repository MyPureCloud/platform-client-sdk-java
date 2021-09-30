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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * CredentialType
 */

public class CredentialType  implements Serializable {
  
  private String id = null;
  private String name = null;
  private Object properties = null;
  private List<String> displayOrder = new ArrayList<String>();
  private List<String> required = new ArrayList<String>();

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  
  /**
   **/
  public CredentialType name(String name) {
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

  
  @ApiModelProperty(example = "null", value = "Properties describing credentials of this type.")
  @JsonProperty("properties")
  public Object getProperties() {
    return properties;
  }

  
  @ApiModelProperty(example = "null", value = "Order in which properties should be displayed in the UI.")
  @JsonProperty("displayOrder")
  public List<String> getDisplayOrder() {
    return displayOrder;
  }

  
  @ApiModelProperty(example = "null", value = "Properties that are required fields.")
  @JsonProperty("required")
  public List<String> getRequired() {
    return required;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CredentialType credentialType = (CredentialType) o;
    return Objects.equals(this.id, credentialType.id) &&
        Objects.equals(this.name, credentialType.name) &&
        Objects.equals(this.properties, credentialType.properties) &&
        Objects.equals(this.displayOrder, credentialType.displayOrder) &&
        Objects.equals(this.required, credentialType.required);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, properties, displayOrder, required);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CredentialType {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
    sb.append("    displayOrder: ").append(toIndentedString(displayOrder)).append("\n");
    sb.append("    required: ").append(toIndentedString(required)).append("\n");
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

