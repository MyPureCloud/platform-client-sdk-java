package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.mypurecloud.sdk.v2.model.ObservationDataContainer;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import java.io.Serializable;
/**
 * QualifierMappingObservationQueryResponse
 */

public class QualifierMappingObservationQueryResponse  implements Serializable {
  
  private Map<String, List<String>> systemToOrganizationMappings = null;
  private List<ObservationDataContainer> results = new ArrayList<ObservationDataContainer>();

  
  /**
   * A mapping from system presence to a list of organization presence ids
   **/
  public QualifierMappingObservationQueryResponse systemToOrganizationMappings(Map<String, List<String>> systemToOrganizationMappings) {
    this.systemToOrganizationMappings = systemToOrganizationMappings;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A mapping from system presence to a list of organization presence ids")
  @JsonProperty("systemToOrganizationMappings")
  public Map<String, List<String>> getSystemToOrganizationMappings() {
    return systemToOrganizationMappings;
  }
  public void setSystemToOrganizationMappings(Map<String, List<String>> systemToOrganizationMappings) {
    this.systemToOrganizationMappings = systemToOrganizationMappings;
  }

  
  /**
   **/
  public QualifierMappingObservationQueryResponse results(List<ObservationDataContainer> results) {
    this.results = results;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("results")
  public List<ObservationDataContainer> getResults() {
    return results;
  }
  public void setResults(List<ObservationDataContainer> results) {
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
    QualifierMappingObservationQueryResponse qualifierMappingObservationQueryResponse = (QualifierMappingObservationQueryResponse) o;
    return Objects.equals(this.systemToOrganizationMappings, qualifierMappingObservationQueryResponse.systemToOrganizationMappings) &&
        Objects.equals(this.results, qualifierMappingObservationQueryResponse.results);
  }

  @Override
  public int hashCode() {
    return Objects.hash(systemToOrganizationMappings, results);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QualifierMappingObservationQueryResponse {\n");
    
    sb.append("    systemToOrganizationMappings: ").append(toIndentedString(systemToOrganizationMappings)).append("\n");
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

