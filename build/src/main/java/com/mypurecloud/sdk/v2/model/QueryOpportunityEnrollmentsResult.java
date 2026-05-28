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
import com.mypurecloud.sdk.v2.model.QueryEnrollmentOpportunityResult;
import com.mypurecloud.sdk.v2.model.QueryOpportunityEnrollmentResult;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import java.io.Serializable;
/**
 * QueryOpportunityEnrollmentsResult
 */

public class QueryOpportunityEnrollmentsResult  implements Serializable {
  
  private Date nextStartDate = null;
  private List<QueryOpportunityEnrollmentResult> enrollments = null;
  private List<QueryEnrollmentOpportunityResult> opportunities = null;

  public QueryOpportunityEnrollmentsResult() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      enrollments = new ArrayList<QueryOpportunityEnrollmentResult>();
      opportunities = new ArrayList<QueryEnrollmentOpportunityResult>();
    }
  }

  public QueryOpportunityEnrollmentsResult(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
      enrollments = new ArrayList<QueryOpportunityEnrollmentResult>();
      opportunities = new ArrayList<QueryEnrollmentOpportunityResult>();
    }
  }

  
  /**
   * The start date to use for the next query to retrieve additional results in ISO-8601 format. Null if there are no more results
   **/
  public QueryOpportunityEnrollmentsResult nextStartDate(Date nextStartDate) {
    this.nextStartDate = nextStartDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The start date to use for the next query to retrieve additional results in ISO-8601 format. Null if there are no more results")
  @JsonProperty("nextStartDate")
  public Date getNextStartDate() {
    return nextStartDate;
  }
  public void setNextStartDate(Date nextStartDate) {
    this.nextStartDate = nextStartDate;
  }


  /**
   * The enrollments for the query operation
   **/
  public QueryOpportunityEnrollmentsResult enrollments(List<QueryOpportunityEnrollmentResult> enrollments) {
    this.enrollments = enrollments;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The enrollments for the query operation")
  @JsonProperty("enrollments")
  public List<QueryOpportunityEnrollmentResult> getEnrollments() {
    return enrollments;
  }
  public void setEnrollments(List<QueryOpportunityEnrollmentResult> enrollments) {
    this.enrollments = enrollments;
  }


  /**
   * The referenced opportunities when expand=opportunities is specified
   **/
  public QueryOpportunityEnrollmentsResult opportunities(List<QueryEnrollmentOpportunityResult> opportunities) {
    this.opportunities = opportunities;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The referenced opportunities when expand=opportunities is specified")
  @JsonProperty("opportunities")
  public List<QueryEnrollmentOpportunityResult> getOpportunities() {
    return opportunities;
  }
  public void setOpportunities(List<QueryEnrollmentOpportunityResult> opportunities) {
    this.opportunities = opportunities;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QueryOpportunityEnrollmentsResult queryOpportunityEnrollmentsResult = (QueryOpportunityEnrollmentsResult) o;

    return Objects.equals(this.nextStartDate, queryOpportunityEnrollmentsResult.nextStartDate) &&
            Objects.equals(this.enrollments, queryOpportunityEnrollmentsResult.enrollments) &&
            Objects.equals(this.opportunities, queryOpportunityEnrollmentsResult.opportunities);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nextStartDate, enrollments, opportunities);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueryOpportunityEnrollmentsResult {\n");
    
    sb.append("    nextStartDate: ").append(toIndentedString(nextStartDate)).append("\n");
    sb.append("    enrollments: ").append(toIndentedString(enrollments)).append("\n");
    sb.append("    opportunities: ").append(toIndentedString(opportunities)).append("\n");
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

