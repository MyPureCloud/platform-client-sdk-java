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
import com.fasterxml.jackson.annotation.JsonProperty;
import com.mypurecloud.sdk.v2.model.MetadataProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import java.io.Serializable;
/**
 * A description of the contents of a data gathering interface for an accelerator
 */
@ApiModel(description = "A description of the contents of a data gathering interface for an accelerator")

public class MetadataSchema  implements Serializable {
  
  private String title = null;
  private String description = null;
  private String type = null;
  private List<Map<String, MetadataProperty>> properties = new ArrayList<Map<String, MetadataProperty>>();
  private List<String> required = new ArrayList<String>();

  
  @ApiModelProperty(example = "null", value = "title for the data gathering page")
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }


  @ApiModelProperty(example = "null", value = "description of the data being gathered on this page")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }


  @ApiModelProperty(example = "null", value = "type of data being gathered")
  @JsonProperty("type")
  public String getType() {
    return type;
  }


  @ApiModelProperty(example = "null", value = "list of properties for which input is to be gathered, bother required and optional")
  @JsonProperty("properties")
  public List<Map<String, MetadataProperty>> getProperties() {
    return properties;
  }


  @ApiModelProperty(example = "null", value = "list of required properties")
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
    MetadataSchema metadataSchema = (MetadataSchema) o;

    return Objects.equals(this.title, metadataSchema.title) &&
            Objects.equals(this.description, metadataSchema.description) &&
            Objects.equals(this.type, metadataSchema.type) &&
            Objects.equals(this.properties, metadataSchema.properties) &&
            Objects.equals(this.required, metadataSchema.required);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, description, type, properties, required);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MetadataSchema {\n");
    
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
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

