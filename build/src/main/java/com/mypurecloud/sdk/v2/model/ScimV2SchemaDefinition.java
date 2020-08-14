package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.mypurecloud.sdk.v2.model.ScimV2SchemaAttribute;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * Defines a SCIM schema.
 */
@ApiModel(description = "Defines a SCIM schema.")

public class ScimV2SchemaDefinition  implements Serializable {
  
  private String id = null;
  private String name = null;
  private String description = null;
  private List<ScimV2SchemaAttribute> attributes = new ArrayList<ScimV2SchemaAttribute>();

  
  @ApiModelProperty(example = "null", value = "The ID of the SCIM resource. Set by the service provider. \"caseExact\" is set to \"true\". \"mutability\" is set to \"readOnly\". \"returned\" is set to \"always\".")
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  
  @ApiModelProperty(example = "null", value = "The name of the schema.")
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  
  @ApiModelProperty(example = "null", value = "The description of the schema.")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  
  /**
   * The list of service provider attributes.
   **/
  public ScimV2SchemaDefinition attributes(List<ScimV2SchemaAttribute> attributes) {
    this.attributes = attributes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The list of service provider attributes.")
  @JsonProperty("attributes")
  public List<ScimV2SchemaAttribute> getAttributes() {
    return attributes;
  }
  public void setAttributes(List<ScimV2SchemaAttribute> attributes) {
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
    ScimV2SchemaDefinition scimV2SchemaDefinition = (ScimV2SchemaDefinition) o;
    return Objects.equals(this.id, scimV2SchemaDefinition.id) &&
        Objects.equals(this.name, scimV2SchemaDefinition.name) &&
        Objects.equals(this.description, scimV2SchemaDefinition.description) &&
        Objects.equals(this.attributes, scimV2SchemaDefinition.attributes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, description, attributes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScimV2SchemaDefinition {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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

