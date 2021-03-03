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
import com.mypurecloud.sdk.v2.model.AuditFacet;
import com.mypurecloud.sdk.v2.model.AuditFilter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * DialerAuditRequest
 */

public class DialerAuditRequest  implements Serializable {
  
  private String queryPhrase = null;
  private List<String> queryFields = new ArrayList<String>();
  private List<AuditFacet> facets = new ArrayList<AuditFacet>();
  private List<AuditFilter> filters = new ArrayList<AuditFilter>();

  
  /**
   * The word or words to search for.
   **/
  public DialerAuditRequest queryPhrase(String queryPhrase) {
    this.queryPhrase = queryPhrase;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The word or words to search for.")
  @JsonProperty("queryPhrase")
  public String getQueryPhrase() {
    return queryPhrase;
  }
  public void setQueryPhrase(String queryPhrase) {
    this.queryPhrase = queryPhrase;
  }

  
  /**
   * The fields in which to search for the queryPhrase.
   **/
  public DialerAuditRequest queryFields(List<String> queryFields) {
    this.queryFields = queryFields;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The fields in which to search for the queryPhrase.")
  @JsonProperty("queryFields")
  public List<String> getQueryFields() {
    return queryFields;
  }
  public void setQueryFields(List<String> queryFields) {
    this.queryFields = queryFields;
  }

  
  /**
   * The fields to facet on.
   **/
  public DialerAuditRequest facets(List<AuditFacet> facets) {
    this.facets = facets;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The fields to facet on.")
  @JsonProperty("facets")
  public List<AuditFacet> getFacets() {
    return facets;
  }
  public void setFacets(List<AuditFacet> facets) {
    this.facets = facets;
  }

  
  /**
   * The fields to filter on.
   **/
  public DialerAuditRequest filters(List<AuditFilter> filters) {
    this.filters = filters;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The fields to filter on.")
  @JsonProperty("filters")
  public List<AuditFilter> getFilters() {
    return filters;
  }
  public void setFilters(List<AuditFilter> filters) {
    this.filters = filters;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DialerAuditRequest dialerAuditRequest = (DialerAuditRequest) o;
    return Objects.equals(this.queryPhrase, dialerAuditRequest.queryPhrase) &&
        Objects.equals(this.queryFields, dialerAuditRequest.queryFields) &&
        Objects.equals(this.facets, dialerAuditRequest.facets) &&
        Objects.equals(this.filters, dialerAuditRequest.filters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(queryPhrase, queryFields, facets, filters);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DialerAuditRequest {\n");
    
    sb.append("    queryPhrase: ").append(toIndentedString(queryPhrase)).append("\n");
    sb.append("    queryFields: ").append(toIndentedString(queryFields)).append("\n");
    sb.append("    facets: ").append(toIndentedString(facets)).append("\n");
    sb.append("    filters: ").append(toIndentedString(filters)).append("\n");
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

