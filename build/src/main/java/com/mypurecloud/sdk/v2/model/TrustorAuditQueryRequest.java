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
import com.mypurecloud.sdk.v2.model.Facet;
import com.mypurecloud.sdk.v2.model.Filter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import java.io.Serializable;
/**
 * TrustorAuditQueryRequest
 */

public class TrustorAuditQueryRequest  implements Serializable {
  
  private String trustorOrganizationId = null;
  private List<String> trusteeUserIds = new ArrayList<String>();
  private Date startDate = null;
  private Date endDate = null;
  private String queryPhrase = null;
  private List<Facet> facets = new ArrayList<Facet>();
  private List<Filter> filters = new ArrayList<Filter>();

  
  /**
   * Limit returned audits to this trustor organizationId.
   **/
  public TrustorAuditQueryRequest trustorOrganizationId(String trustorOrganizationId) {
    this.trustorOrganizationId = trustorOrganizationId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Limit returned audits to this trustor organizationId.")
  @JsonProperty("trustorOrganizationId")
  public String getTrustorOrganizationId() {
    return trustorOrganizationId;
  }
  public void setTrustorOrganizationId(String trustorOrganizationId) {
    this.trustorOrganizationId = trustorOrganizationId;
  }

  
  /**
   * Limit returned audits to these trustee userIds.
   **/
  public TrustorAuditQueryRequest trusteeUserIds(List<String> trusteeUserIds) {
    this.trusteeUserIds = trusteeUserIds;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Limit returned audits to these trustee userIds.")
  @JsonProperty("trusteeUserIds")
  public List<String> getTrusteeUserIds() {
    return trusteeUserIds;
  }
  public void setTrusteeUserIds(List<String> trusteeUserIds) {
    this.trusteeUserIds = trusteeUserIds;
  }

  
  /**
   * Starting date/time for the audit search. ISO-8601 formatted date-time, UTC.
   **/
  public TrustorAuditQueryRequest startDate(Date startDate) {
    this.startDate = startDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Starting date/time for the audit search. ISO-8601 formatted date-time, UTC.")
  @JsonProperty("startDate")
  public Date getStartDate() {
    return startDate;
  }
  public void setStartDate(Date startDate) {
    this.startDate = startDate;
  }

  
  /**
   * Ending date/time for the audit search. ISO-8601 formatted date-time, UTC.
   **/
  public TrustorAuditQueryRequest endDate(Date endDate) {
    this.endDate = endDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Ending date/time for the audit search. ISO-8601 formatted date-time, UTC.")
  @JsonProperty("endDate")
  public Date getEndDate() {
    return endDate;
  }
  public void setEndDate(Date endDate) {
    this.endDate = endDate;
  }

  
  /**
   * Word or phrase to look for in audit bodies.
   **/
  public TrustorAuditQueryRequest queryPhrase(String queryPhrase) {
    this.queryPhrase = queryPhrase;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Word or phrase to look for in audit bodies.")
  @JsonProperty("queryPhrase")
  public String getQueryPhrase() {
    return queryPhrase;
  }
  public void setQueryPhrase(String queryPhrase) {
    this.queryPhrase = queryPhrase;
  }

  
  /**
   * Facet information to be returned with the query results.
   **/
  public TrustorAuditQueryRequest facets(List<Facet> facets) {
    this.facets = facets;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Facet information to be returned with the query results.")
  @JsonProperty("facets")
  public List<Facet> getFacets() {
    return facets;
  }
  public void setFacets(List<Facet> facets) {
    this.facets = facets;
  }

  
  /**
   * Additional custom filters to be applied to the query.
   **/
  public TrustorAuditQueryRequest filters(List<Filter> filters) {
    this.filters = filters;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Additional custom filters to be applied to the query.")
  @JsonProperty("filters")
  public List<Filter> getFilters() {
    return filters;
  }
  public void setFilters(List<Filter> filters) {
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
    TrustorAuditQueryRequest trustorAuditQueryRequest = (TrustorAuditQueryRequest) o;
    return Objects.equals(this.trustorOrganizationId, trustorAuditQueryRequest.trustorOrganizationId) &&
        Objects.equals(this.trusteeUserIds, trustorAuditQueryRequest.trusteeUserIds) &&
        Objects.equals(this.startDate, trustorAuditQueryRequest.startDate) &&
        Objects.equals(this.endDate, trustorAuditQueryRequest.endDate) &&
        Objects.equals(this.queryPhrase, trustorAuditQueryRequest.queryPhrase) &&
        Objects.equals(this.facets, trustorAuditQueryRequest.facets) &&
        Objects.equals(this.filters, trustorAuditQueryRequest.filters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(trustorOrganizationId, trusteeUserIds, startDate, endDate, queryPhrase, facets, filters);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TrustorAuditQueryRequest {\n");
    
    sb.append("    trustorOrganizationId: ").append(toIndentedString(trustorOrganizationId)).append("\n");
    sb.append("    trusteeUserIds: ").append(toIndentedString(trusteeUserIds)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    queryPhrase: ").append(toIndentedString(queryPhrase)).append("\n");
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

