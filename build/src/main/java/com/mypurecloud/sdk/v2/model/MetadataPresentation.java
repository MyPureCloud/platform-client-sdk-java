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
import com.mypurecloud.sdk.v2.model.MetadataSchema;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * A representation of data fields to be gathered for installing the accelerator
 */
@ApiModel(description = "A representation of data fields to be gathered for installing the accelerator")

public class MetadataPresentation  implements Serializable {
  
  private String title = null;
  private MetadataSchema schema = null;

  
  @ApiModelProperty(example = "null", value = "title for a set of data to be gathered")
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }


  @ApiModelProperty(example = "null", value = "description of the contents of the data gathering interface")
  @JsonProperty("schema")
  public MetadataSchema getSchema() {
    return schema;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MetadataPresentation metadataPresentation = (MetadataPresentation) o;

    return Objects.equals(this.title, metadataPresentation.title) &&
            Objects.equals(this.schema, metadataPresentation.schema);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, schema);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MetadataPresentation {\n");
    
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    schema: ").append(toIndentedString(schema)).append("\n");
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

