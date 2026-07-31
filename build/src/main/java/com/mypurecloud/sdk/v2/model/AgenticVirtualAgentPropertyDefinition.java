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
import java.util.List;

import java.io.Serializable;
/**
 * Property definition for an object type.
 */
@ApiModel(description = "Property definition for an object type.")

public class AgenticVirtualAgentPropertyDefinition  implements Serializable {
  
  private String name = null;
  private String type = null;
  private Boolean required = null;
  private String description = null;
  private String items = null;
  private List<Object> mapping = null;

  public AgenticVirtualAgentPropertyDefinition() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      mapping = new ArrayList<Object>();
    }
  }

  public AgenticVirtualAgentPropertyDefinition(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
      mapping = new ArrayList<Object>();
    }
  }

  
  /**
   * Property name.
   **/
  public AgenticVirtualAgentPropertyDefinition name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "transaction_id", required = true, value = "Property name.")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }


  /**
   * Property type name. The valid type depends on the containing type and related fields.
   **/
  public AgenticVirtualAgentPropertyDefinition type(String type) {
    this.type = type;
    return this;
  }
  
  @ApiModelProperty(example = "string", required = true, value = "Property type name. The valid type depends on the containing type and related fields.")
  @JsonProperty("type")
  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
  }


  /**
   * Whether this property must be supplied.
   **/
  public AgenticVirtualAgentPropertyDefinition required(Boolean required) {
    this.required = required;
    return this;
  }
  
  @ApiModelProperty(example = "true", value = "Whether this property must be supplied.")
  @JsonProperty("required")
  public Boolean getRequired() {
    return required;
  }
  public void setRequired(Boolean required) {
    this.required = required;
  }


  /**
   * Additional context that helps the virtual agent understand what this property means.
   **/
  public AgenticVirtualAgentPropertyDefinition description(String description) {
    this.description = description;
    return this;
  }
  
  @ApiModelProperty(example = "Unique identifier for the processed payment transaction.", value = "Additional context that helps the virtual agent understand what this property means.")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }


  /**
   * Type of items in this array property. Applies when type is array.
   **/
  public AgenticVirtualAgentPropertyDefinition items(String items) {
    this.items = items;
    return this;
  }
  
  @ApiModelProperty(example = "PaymentRecord", value = "Type of items in this array property. Applies when type is array.")
  @JsonProperty("items")
  public String getItems() {
    return items;
  }
  public void setItems(String items) {
    this.items = items;
  }


  /**
   * Path used to extract this output data property from a tool output. Only valid for output data properties. The path starts with a tool output type name, may contain only string property names or integer array indexes, and must resolve to a primitive value.
   **/
  public AgenticVirtualAgentPropertyDefinition mapping(List<Object> mapping) {
    this.mapping = mapping;
    return this;
  }
  
  @ApiModelProperty(example = "[&quot;Order&quot;, 0, &quot;id&quot;]", value = "Path used to extract this output data property from a tool output. Only valid for output data properties. The path starts with a tool output type name, may contain only string property names or integer array indexes, and must resolve to a primitive value.")
  @JsonProperty("mapping")
  public List<Object> getMapping() {
    return mapping;
  }
  public void setMapping(List<Object> mapping) {
    this.mapping = mapping;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AgenticVirtualAgentPropertyDefinition agenticVirtualAgentPropertyDefinition = (AgenticVirtualAgentPropertyDefinition) o;

    return Objects.equals(this.name, agenticVirtualAgentPropertyDefinition.name) &&
            Objects.equals(this.type, agenticVirtualAgentPropertyDefinition.type) &&
            Objects.equals(this.required, agenticVirtualAgentPropertyDefinition.required) &&
            Objects.equals(this.description, agenticVirtualAgentPropertyDefinition.description) &&
            Objects.equals(this.items, agenticVirtualAgentPropertyDefinition.items) &&
            Objects.equals(this.mapping, agenticVirtualAgentPropertyDefinition.mapping);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, type, required, description, items, mapping);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AgenticVirtualAgentPropertyDefinition {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    required: ").append(toIndentedString(required)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    mapping: ").append(toIndentedString(mapping)).append("\n");
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

