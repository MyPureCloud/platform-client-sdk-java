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
import com.mypurecloud.sdk.v2.model.ScimConfigResourceType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * Defines a response for a list of SCIM resource types.
 */
@ApiModel(description = "Defines a response for a list of SCIM resource types.")

public class ScimConfigResourceTypesListResponse  implements Serializable {
  
  private List<String> schemas = new ArrayList<String>();
  private Long totalResults = null;
  private Long startIndex = null;
  private Long itemsPerPage = null;
  private List<ScimConfigResourceType> resources = new ArrayList<ScimConfigResourceType>();

  
  /**
   * The list of supported schemas.
   **/
  public ScimConfigResourceTypesListResponse schemas(List<String> schemas) {
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
  public List<ScimConfigResourceType> getResources() {
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
    ScimConfigResourceTypesListResponse scimConfigResourceTypesListResponse = (ScimConfigResourceTypesListResponse) o;
    return Objects.equals(this.schemas, scimConfigResourceTypesListResponse.schemas) &&
        Objects.equals(this.totalResults, scimConfigResourceTypesListResponse.totalResults) &&
        Objects.equals(this.startIndex, scimConfigResourceTypesListResponse.startIndex) &&
        Objects.equals(this.itemsPerPage, scimConfigResourceTypesListResponse.itemsPerPage) &&
        Objects.equals(this.resources, scimConfigResourceTypesListResponse.resources);
  }

  @Override
  public int hashCode() {
    return Objects.hash(schemas, totalResults, startIndex, itemsPerPage, resources);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScimConfigResourceTypesListResponse {\n");
    
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

