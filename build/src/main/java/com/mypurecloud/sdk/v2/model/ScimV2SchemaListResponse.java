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
import com.mypurecloud.sdk.v2.model.ScimV2SchemaDefinition;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * Defines the list response for SCIM resource types.
 */
@ApiModel(description = "Defines the list response for SCIM resource types.")

public class ScimV2SchemaListResponse  implements Serializable {
  
  private List<String> schemas = new ArrayList<String>();
  private Long totalResults = null;
  private Long startIndex = null;
  private Long itemsPerPage = null;
  private List<ScimV2SchemaDefinition> resources = new ArrayList<ScimV2SchemaDefinition>();

  
  /**
   * The list of supported schemas.
   **/
  public ScimV2SchemaListResponse schemas(List<String> schemas) {
    this.schemas = schemas;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The list of supported schemas.")
  @JsonProperty("schemas")
  public List<String> getSchemas() {
    return schemas;
  }
  public void setSchemas(List<String> schemas) {
    this.schemas = schemas;
  }

  
  @ApiModelProperty(example = "null", value = "The total number of results.")
  @JsonProperty("totalResults")
  public Long getTotalResults() {
    return totalResults;
  }

  
  @ApiModelProperty(example = "null", value = "The 1-based index of the first result returned by this request. Add this to \"itemsPerPage\" when requesting the next page of results.")
  @JsonProperty("startIndex")
  public Long getStartIndex() {
    return startIndex;
  }

  
  @ApiModelProperty(example = "null", value = "The number of resources returned per page.")
  @JsonProperty("itemsPerPage")
  public Long getItemsPerPage() {
    return itemsPerPage;
  }

  
  @ApiModelProperty(example = "null", value = "The list of requested resources.")
  @JsonProperty("Resources")
  public List<ScimV2SchemaDefinition> getResources() {
    return resources;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ScimV2SchemaListResponse scimV2SchemaListResponse = (ScimV2SchemaListResponse) o;
    return Objects.equals(this.schemas, scimV2SchemaListResponse.schemas) &&
        Objects.equals(this.totalResults, scimV2SchemaListResponse.totalResults) &&
        Objects.equals(this.startIndex, scimV2SchemaListResponse.startIndex) &&
        Objects.equals(this.itemsPerPage, scimV2SchemaListResponse.itemsPerPage) &&
        Objects.equals(this.resources, scimV2SchemaListResponse.resources);
  }

  @Override
  public int hashCode() {
    return Objects.hash(schemas, totalResults, startIndex, itemsPerPage, resources);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScimV2SchemaListResponse {\n");
    
    sb.append("    schemas: ").append(toIndentedString(schemas)).append("\n");
    sb.append("    totalResults: ").append(toIndentedString(totalResults)).append("\n");
    sb.append("    startIndex: ").append(toIndentedString(startIndex)).append("\n");
    sb.append("    itemsPerPage: ").append(toIndentedString(itemsPerPage)).append("\n");
    sb.append("    resources: ").append(toIndentedString(resources)).append("\n");
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

