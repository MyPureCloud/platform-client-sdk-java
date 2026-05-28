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
 * PendingAndApprovedOpportunityEnrollmentCounts
 */

public class PendingAndApprovedOpportunityEnrollmentCounts  implements Serializable {
  
  private Integer pending = null;
  private Integer approved = null;

  public PendingAndApprovedOpportunityEnrollmentCounts() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  public PendingAndApprovedOpportunityEnrollmentCounts(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
    }
  }

  
  /**
   * The number of pending enrollments
   **/
  public PendingAndApprovedOpportunityEnrollmentCounts pending(Integer pending) {
    this.pending = pending;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The number of pending enrollments")
  @JsonProperty("pending")
  public Integer getPending() {
    return pending;
  }
  public void setPending(Integer pending) {
    this.pending = pending;
  }


  /**
   * The number of approved enrollments
   **/
  public PendingAndApprovedOpportunityEnrollmentCounts approved(Integer approved) {
    this.approved = approved;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The number of approved enrollments")
  @JsonProperty("approved")
  public Integer getApproved() {
    return approved;
  }
  public void setApproved(Integer approved) {
    this.approved = approved;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PendingAndApprovedOpportunityEnrollmentCounts pendingAndApprovedOpportunityEnrollmentCounts = (PendingAndApprovedOpportunityEnrollmentCounts) o;

    return Objects.equals(this.pending, pendingAndApprovedOpportunityEnrollmentCounts.pending) &&
            Objects.equals(this.approved, pendingAndApprovedOpportunityEnrollmentCounts.approved);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pending, approved);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PendingAndApprovedOpportunityEnrollmentCounts {\n");
    
    sb.append("    pending: ").append(toIndentedString(pending)).append("\n");
    sb.append("    approved: ").append(toIndentedString(approved)).append("\n");
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

