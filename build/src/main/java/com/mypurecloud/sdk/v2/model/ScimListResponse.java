package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.mypurecloud.sdk.v2.model.ScimResource;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * Represents a SCIM V2 List Response
 */
@ApiModel(description = "Represents a SCIM V2 List Response")

public class ScimListResponse  implements Serializable {
  
  private Long totalResults = null;
  private Long startIndex = null;
  private Long itemsPerPage = null;
  private List<ScimResource> resources = new ArrayList<ScimResource>();
  private List<String> schemas = new ArrayList<String>();

  
  /**
   * Total Results
   **/
  public ScimListResponse totalResults(Long totalResults) {
    this.totalResults = totalResults;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Total Results")
  @JsonProperty("totalResults")
  public Long getTotalResults() {
    return totalResults;
  }
  public void setTotalResults(Long totalResults) {
    this.totalResults = totalResults;
  }

  
  /**
   * Start index
   **/
  public ScimListResponse startIndex(Long startIndex) {
    this.startIndex = startIndex;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Start index")
  @JsonProperty("startIndex")
  public Long getStartIndex() {
    return startIndex;
  }
  public void setStartIndex(Long startIndex) {
    this.startIndex = startIndex;
  }

  
  /**
   * Items per Page
   **/
  public ScimListResponse itemsPerPage(Long itemsPerPage) {
    this.itemsPerPage = itemsPerPage;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Items per Page")
  @JsonProperty("itemsPerPage")
  public Long getItemsPerPage() {
    return itemsPerPage;
  }
  public void setItemsPerPage(Long itemsPerPage) {
    this.itemsPerPage = itemsPerPage;
  }

  
  /**
   * Resources
   **/
  public ScimListResponse resources(List<ScimResource> resources) {
    this.resources = resources;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Resources")
  @JsonProperty("Resources")
  public List<ScimResource> getResources() {
    return resources;
  }
  public void setResources(List<ScimResource> resources) {
    this.resources = resources;
  }

  
  /**
   * schemas supported
   **/
  public ScimListResponse schemas(List<String> schemas) {
    this.schemas = schemas;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "schemas supported")
  @JsonProperty("schemas")
  public List<String> getSchemas() {
    return schemas;
  }
  public void setSchemas(List<String> schemas) {
    this.schemas = schemas;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ScimListResponse scimListResponse = (ScimListResponse) o;
    return Objects.equals(this.totalResults, scimListResponse.totalResults) &&
        Objects.equals(this.startIndex, scimListResponse.startIndex) &&
        Objects.equals(this.itemsPerPage, scimListResponse.itemsPerPage) &&
        Objects.equals(this.resources, scimListResponse.resources) &&
        Objects.equals(this.schemas, scimListResponse.schemas);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalResults, startIndex, itemsPerPage, resources, schemas);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScimListResponse {\n");
    
    sb.append("    totalResults: ").append(toIndentedString(totalResults)).append("\n");
    sb.append("    startIndex: ").append(toIndentedString(startIndex)).append("\n");
    sb.append("    itemsPerPage: ").append(toIndentedString(itemsPerPage)).append("\n");
    sb.append("    resources: ").append(toIndentedString(resources)).append("\n");
    sb.append("    schemas: ").append(toIndentedString(schemas)).append("\n");
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

