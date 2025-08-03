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

import java.io.Serializable;
/**
 * OrganizationUsageQueryResponse
 */

public class OrganizationUsageQueryResponse  implements Serializable {
  
  private String id = null;
  private String name = null;
  private String resultsUri = null;
  private String selfUri = null;

  public OrganizationUsageQueryResponse() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * The jobId of the query.
   **/
  public OrganizationUsageQueryResponse id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The jobId of the query.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }


  /**
   **/
  public OrganizationUsageQueryResponse name(String name) {
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


  /**
   * The uri to get the results.
   **/
  public OrganizationUsageQueryResponse resultsUri(String resultsUri) {
    this.resultsUri = resultsUri;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The uri to get the results.")
  @JsonProperty("resultsUri")
  public String getResultsUri() {
    return resultsUri;
  }
  public void setResultsUri(String resultsUri) {
    this.resultsUri = resultsUri;
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
    OrganizationUsageQueryResponse organizationUsageQueryResponse = (OrganizationUsageQueryResponse) o;

    return Objects.equals(this.id, organizationUsageQueryResponse.id) &&
            Objects.equals(this.name, organizationUsageQueryResponse.name) &&
            Objects.equals(this.resultsUri, organizationUsageQueryResponse.resultsUri) &&
            Objects.equals(this.selfUri, organizationUsageQueryResponse.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, resultsUri, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrganizationUsageQueryResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    resultsUri: ").append(toIndentedString(resultsUri)).append("\n");
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

