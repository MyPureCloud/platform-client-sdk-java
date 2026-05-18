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
import com.mypurecloud.sdk.v2.model.CustomAttributesBulkUpdateResponse;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import java.io.Serializable;
/**
 * CustomAttributesBulkUpdateResponseMap
 */

public class CustomAttributesBulkUpdateResponseMap  implements Serializable {
  
  private Map<String, CustomAttributesBulkUpdateResponse> results = null;

  public CustomAttributesBulkUpdateResponseMap() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  public CustomAttributesBulkUpdateResponseMap(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
    }
  }

  
  /**
   * The map of Custom Attributes record ids to their results after updating.
   **/
  public CustomAttributesBulkUpdateResponseMap results(Map<String, CustomAttributesBulkUpdateResponse> results) {
    this.results = results;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The map of Custom Attributes record ids to their results after updating.")
  @JsonProperty("results")
  public Map<String, CustomAttributesBulkUpdateResponse> getResults() {
    return results;
  }
  public void setResults(Map<String, CustomAttributesBulkUpdateResponse> results) {
    this.results = results;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomAttributesBulkUpdateResponseMap customAttributesBulkUpdateResponseMap = (CustomAttributesBulkUpdateResponseMap) o;

    return Objects.equals(this.results, customAttributesBulkUpdateResponseMap.results);
  }

  @Override
  public int hashCode() {
    return Objects.hash(results);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomAttributesBulkUpdateResponseMap {\n");
    
    sb.append("    results: ").append(toIndentedString(results)).append("\n");
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

